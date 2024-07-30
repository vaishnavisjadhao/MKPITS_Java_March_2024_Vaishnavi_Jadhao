/*1. **Inventory Stock Alert**:
   - **Problem Statement**: Whenever a new rental is created, check the inventory quantity for the rented film. If the quantity 
                            falls below a certain threshold (e.g., 5 copies), log a warning message in a `low_stock_alerts` table.
   - **Trigger Description**: Create an `AFTER INSERT` trigger on the `rental` table that updates the inventory count for the 
   rented film and inserts a row into the `low_stock_alerts` table if the count is below the threshold.*/
   
DELIMITER //
CREATE TRIGGER insert_rental
BEFORE INSERT ON rental FOR EACH ROW

BEGIN
END //
DELIMITER ;
   
   
   
   


DELIMITER //

CREATE TRIGGER after_rental_insert
AFTER INSERT ON rental FOR EACH ROW
BEGIN
    DECLARE current_stock INT;

    -- Calculate current stock for the rented film
    SELECT COUNT(*) INTO current_stock
    FROM inventory
    WHERE film_id = (SELECT film_id FROM inventory WHERE inventory_id = NEW.inventory_id)
    AND inventory_id NOT IN (SELECT inventory_id FROM rental WHERE return_date IS NULL);

    -- If current stock falls below the threshold, log a warning message
    IF current_stock < 5 THEN
        INSERT INTO low_stock_alerts (film_id, current_stock)
        VALUES ((SELECT film_id FROM inventory WHERE inventory_id = NEW.inventory_id), current_stock);
    END IF;
END //

DELIMITER ;

/*5. **Ensure Valid Rental Dates**:
   - **Problem Statement**: Ensure that the `return_date` in the `rental` table is always after the `rental_date`.
   - **Trigger Description**: Create a `BEFORE INSERT` or `BEFORE UPDATE` trigger on the `rental` table that checks if the 
   `return_date` is after the `rental_date`. If not, raise an error to prevent the insert or update.*/
DELIMITER //

CREATE TRIGGER before_rental_insert
BEFORE INSERT ON rental
FOR EACH ROW
BEGIN
    -- Check if the return_date is after the rental_date
    IF NEW.return_date <= NEW.rental_date THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Return date must be after rental date.';
    END IF;
END //

DELIMITER ;

