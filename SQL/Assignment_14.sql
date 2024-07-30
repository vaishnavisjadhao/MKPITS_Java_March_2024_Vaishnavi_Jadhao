/*1. **Retrieve Actor Information by Last Name**:
Write a procedure that accepts an actor's last name as input and returns a list of all actors with that last name, including their 
first name, last name, and actor ID.*/
DELIMITER $$
CREATE PROCEDURE GetActorsByLastName(IN lastName VARCHAR(45))
BEGIN
    SELECT actor_id, first_name, last_name
    FROM actor
    WHERE last_name = lastName;
END $$
DELIMITER ;

CALL GetActorsByLastName('GUINESS');
SELECT * FROM ACTOR;


/*2. **List Films by Category**:
   Create a procedure that takes a category name as input and returns all films in that category, including film title, description,
   release year, and rating.*/
   DELIMITER $$
   CREATE PROCEDURE film_by_category(IN category_name varchar(25))
   BEGIN
        SELECT f.title, f.description, f.release_year, f.rating
        FROM film f
        JOIN film_category fm on f.film_id = fm.film_id
        JOIN category c on fm.category_id = c.category_id
        WHERE c.name = category_name;
END $$
DELIMITER $$;

CALL film_by_category('Animation');


/*3. **Calculate Total Payment by Customer**:
   Develop a procedure that accepts a customer ID and returns the total amount paid by that customer. The result should include 
   the customer ID, first name, last name, and total payment amount.*/
   DELIMITER $$
   CREATE PROCEDURE payment_by_customer(IN custId int)
   BEGIN
        SELECT c.customer_id, c.first_name, c.last_name, sum(p.amount) as 'total_paid_amount'
        FROM customer c 
	  JOIN payment p ON c.customer_id = p.customer_id
        WHERE c.customer_id = custId;
   END $$
   DELIMITER ;
   
CALL payment_by_customer(2);


/*4. **Count Rentals by Date Range**:
   Implement a procedure that accepts a start date and an end date and returns the number of rentals made within that date 
   range. Include the rental ID and rental date in the results.*/
   DELIMITER $$
   CREATE PROCEDURE count_rental_by_daterange(IN startdate DATE, IN enddate DATE)
   BEGIN
        SELECT rental_id, rental_date, return_date
        FROM rental
        WHERE rental_date BETWEEN startdate AND enddate;
   END $$
   DELIMITER ;
   
   call count_rental_by_daterange('2005-05-04','2005-06-01');

/*5. **Update Film Rental Rate**:
   Write a procedure to update the rental rate of a specific film. The procedure should accept the film ID and the new rental 
   rate as inputs and then update the rental rate for that film in the database. Return the film ID, old rental rate, and new 
   rental rate as output.*/
   DELIMITER $$
   CREATE PROCEDURE film_rental_rate(IN filmId INT)
   BEGIN
         SELECT film_id, 
         FROM 
         WHERE
   END $$
   DELIMITER ;



