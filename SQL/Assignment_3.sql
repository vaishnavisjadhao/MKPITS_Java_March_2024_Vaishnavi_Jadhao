use sakila;
#1. **Retrieve the first 10 characters of the title of each film.**
SELECT SUBSTRING(title, 1, 10) AS title_excet 
FROM film;

#2. **Convert the titles of all films to uppercase.**
SELECT UPPER(title) AS uppercase_title 
FROM film;

#3. **Find the length of each film title.**
select title, length(title) as title_length 
from film;

#4. **Concatenate the first name and last name of each actor, separated by a space.**
SELECT CONCAT(first_name, ' ', last_name) AS full_name 
FROM actor;

#5. **Replace the word "Action" with "Thriller" in the film description.**
SELECT film_id, title, description, REPLACE(description, 'Action', 'Thriller') AS updated_description 
FROM film;

#6. **Extract the domain name from the email addresses of all customers.**
SELECT email, SUBSTRING_INDEX(email, '@', -1) AS domain_name 
FROM customer;

#7. **Find all films whose title starts with the letter 'A'.**
SELECT * FROM film WHERE title LIKE 'A%';

#8. **Trim leading and trailing spaces from the first names of customers.**
SELECT first_name, TRIM(first_name) AS trimmed_first_name 
FROM customer;

#9. **Find the position of the first occurrence of the word "GREAT" in the film description.**
SELECT film_id, title, description, INSTR(description, 'GREAT') AS position_of_great 
FROM film;

#10. **Reverse the first name of each customer.**
SELECT first_name, reverse(first_name) AS reverse_first_name 
FROM customer;

#11. **Round the rental rate of each film to 2 decimal places.**
SELECT round(rental_rate, 2) AS rental_rate FROM film ;

#12. **Calculate the square root of the replacement cost of each film.**
SELECT sqrt(replacement_cost) AS replacement_cost FROM film;

#13. **Find the absolute value of the difference between rental duration and length for each film.**
SELECT ABS(length-rental_duration) AS absolute_value FROM film;

#14. **Raise the rental rate of each film to the power of 3.**
SELECT power(rental_rate, 3) AS power_of_film FROM film;

#15. **Get the ceiling value of the replacement cost of each film.**
SELECT ceiling(replacement_cost) AS lowest_repacement_cost FROM film;

#16. **Get the floor value of the replacement cost of each film.**
SELECT floor(replacement_cost) as largets_replacement_cost FROM film;

#17. **Calculate the modulus (remainder) of the rental duration divided by 3 for each film.**
SELECT mod(rental_duration, 3) AS mod_rental_duration 
FROM film; 

#18. **Get the highest rental rate of all films.**
SELECT max(rental_rate) AS highest_rental_rate FROM film;

#19. **Get the lowest replacement cost of all films.**
SELECT min(replacement_cost) AS lowest_replacement_cost FROM film;

#20. **Calculate the average length of all films.**
SELECT avg(length) AS avg_length_film FROM film;

#21. **Extract the year from the rental date for each rental.**
SELECT extract(year from rental_date) FROM RENTAL;

#22. **Find the day of the week for each rental date.**
SELECT  dayname(rental_date) FROM rental;

#23. **Calculate the age of each customer based on their create_date.**
SELECT customer_id, create_date ,
TIMESTAMPDIFF(year, create_date, current_date()) AS customer_age
FROM customer;

#24. **Add 7 days to the rental date to get the return due date for each rental.**
select * from rental;

#25. **Get the month name from the rental date for each rental.**
SELECT monthname(rental_date) from rental;

#26. **Extract the hour from the last update timestamp of each film.**
SELECT extract(hour from last_update) AS hours from film;

#27. **Calculate the difference in days between the return date and rental date for each rental.**
SELECT datediff(year , rental_date, return_date) AS difference_date FROM RENTAL;

#28. **Find the first day of the month for each rental date.**\
SELECT rental_date, date_format(rental_date, '%y-%m-01')AS first_date FROM rental;

#29. **Format the rental date as 'DD-MM-YYYY' for each rental.**
SELECT rental_date, date_format(rental_date, '%d-%m-%y') AS new_date FROM rental; 

#30. **Extract the quarter from the rental date for each rental.**
SELECT extract(quarter from rental_date) AS quarter From rental;

#31. **Find the ASCII value of the first character of each film title.**
SELECT title, ascii(left(title, 1)) AS ascii_value FROM film;

#32. **Return the binary representation of the film_id for each film.**
SELECT film_id, bin(film_id) As binary_film_id from film;

#33. **Convert the rental duration of each film to a hexadecimal value.**
SELECT hex(rental_duration) AS hexadecimal_value FROM film;

#34. **Find all films with a replacement cost that is a power of 2.**
SELECT title, replacement_cost
FROM film
WHERE (replacement_cost > 0) 
AND (replacement_cost & (replacement_cost - 1)) = 0;


#35. **Check if the length of the film title is even or odd.**
SELECT title, LENGTH(title) AS title_length,
CASE 
  WHEN LENGTH(title) % 2 = 0 THEN 'Even'
	ELSE 'Odd'
  END AS length_type
FROM film;


#36. **Find all films with a rental rate greater than 3 and categorize them as 'High' or 'Low'.**

#37. **Return the IP address equivalent of the film_id for the first 10 films.**
#38. **Select the 3rd character of each film title.**
#39. **Return the Unicode code point of the first character of each actor's first name.**
#40. **Convert the rental rate of each film to a binary string.**
