
/*Problem Statement 1: Retrieve Customer Names and Addresses
Create a cursor to retrieve the names and addresses of all customers from the Sakila database.*/
DELIMITER //

CREATE PROCEDURE get_customer_names_addresses()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cust_id INT;
    DECLARE first_name VARCHAR(45);
    DECLARE last_name VARCHAR(45);
    DECLARE address VARCHAR(50);
    DECLARE city VARCHAR(50);
    DECLARE country VARCHAR(50);
    DECLARE cur CURSOR FOR
        SELECT c.customer_id, c.first_name, c.last_name, a.address, ci.city, co.country
        FROM customer c
        JOIN address a ON c.address_id = a.address_id
        JOIN city ci ON a.city_id = ci.city_id
        JOIN country co ON ci.country_id = co.country_id;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO cust_id, first_name, last_name, address, city, country;
        IF done THEN
            LEAVE read_loop;
        END IF;
        -- Do something with the fetched data
        -- For example, you can select it
        SELECT cust_id, CONCAT(first_name, ' ', last_name) AS customer_name, address, city, country;
    END LOOP;

    CLOSE cur;
END //

DELIMITER ;

CALL get_customer_names_addresses();

/*Problem Statement 2: Calculate Total Rental Fees for a Customer
Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.*/
DELIMITER //

CREATE PROCEDURE calculate_total_rental_fees(IN cust_id INT)
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE rental_fee DECIMAL(5,2);
    DECLARE total_fees DECIMAL(10,2) DEFAULT 0;
    
    -- Declare the cursor to fetch rental fees for the specified customer
    DECLARE cur CURSOR FOR
        SELECT p.amount
        FROM payment p
        JOIN rental r ON p.rental_id = r.rental_id
        WHERE r.customer_id = cust_id;
    
    -- Continue handler for when there are no more rows
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    -- Open the cursor
    OPEN cur;

    -- Fetch data and calculate total fees
    read_loop: LOOP
        FETCH cur INTO rental_fee;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SET total_fees = total_fees + rental_fee;
    END LOOP;

    -- Close the cursor
    CLOSE cur;

    -- Return the total fees
    SELECT total_fees AS total_rental_fees;
END //

DELIMITER ;


