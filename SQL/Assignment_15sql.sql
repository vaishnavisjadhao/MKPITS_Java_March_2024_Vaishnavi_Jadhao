use sakila select * from rental
/*1. **Calculate Late Fees for a Rental**:
   Write a function that accepts a rental ID and calculates the total late fees incurred for that rental. 
   The function should return the total late fee amount based on the difference between the return date and the due date.*/
   DELIMITER //
   CREATE FUNCTION fees_of_rental(rentalId INT)
   RETURNS INT
   DETERMINISTIC
   BEGIN
       DECLARE DAYS INT;
       SELECT DATEDIFF(rental_date,return_date) INTO DAYS FROM rental WHERE rental_id = rentalId ;
   END //
   DElIMITER ;
   
   #execute function-----
   SELECT fees_of_rental(1);
   


/*2. **Get Film Rating by Title**:
   Create a function that takes a film title as input and returns the film's rating. The function should search for the film by 
   title and return its rating (e.g., G, PG, PG-13, R, NC-17).*/
   DELIMITER // 
   CREATE FUNCTION film_rating(filmtitle char(20))
   RETURNS char(20)
   DETERMINISTIC 
   BEGIN
        DECLARE filmrating char(20);
        SELECT rating into filmrating FROM film WHERE title = filmtitle;
        RETURN rating;
   END //
   DELIMITER ;

SELECT film_rating('ACADEMY DINOSAUR');


/*3. **Count Films by Language**:
   Develop a function that accepts a language name and returns the number of films available in that language. The function should 
   query the films and languages tables to provide the count.*/
   DELIMITER //
   CREATE FUNCTION film_by_language(language_name char(20))
   RETURNS CHAR(20)
   DETERMINISTIC
   BEGIN
        DECLARE countfilm int;
        SELECT count(f.film_id) into countfilm 
        FROM FILM F
        JOIN LANGUAGE L ON F.language_id = L.language_id
        WHERE l.name = language_name;
        
        RETURN countfilm;
   END //
   DELIMITER ;
   
   SELECT film_by_language('English');
  

/*4. **Check Film Availability**:
   Implement a function that takes a film ID as input and returns a Boolean value indicating whether the film is currently 
   available for rent. The function should check the inventory and rental tables to determine availability.*/
   DELIMITER //
   CREATE FUNCTION film_availability (filmId INT) 
   RETURNS int
   DETERMINISTIC
   BEGIN
        SELECT 
   END //
   DELIMITER ;
   

/*5. **Get Customer Rental History**:
   Write a function that accepts a customer ID and returns the total number of rentals made by that customer. The function 
   should aggregate the rentals based on the provided customer ID and return the count.*/

