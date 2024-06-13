### Problem 1:**Find the total number of films in the database.**
SELECT COUNT(film_id) AS total_film 
FROM film;

### Problem 2:**Find the average rental rate of all films.**
SELECT AVG(rental_rate) AS avg_rental_rate 
FROM film;

### Problem 3:**Find the total number of rentals made.**
SELECT count(*) AS total_no_rental FROM rental;

### Problem 4:**Find the highest replacement cost of any film.**
SELECT max(replacement_cost) AS higest_cost 
FROM film;

### Problem 5:**Find the total revenue generated from rentals.**
SELECT count(rental_duration * rental_rate) AS total_revenue 
FROM film;

### Problem 6:**Find the average length of films.**
SELECT avg(length) AS film_avg_length 
FROM film;

### Problem 7:**Find the minimum rental duration among all films.**
SELECT MIN(rental_duration) AS minimum_rental_duration 
FROM film;

### Problem 8:**Find the total number of distinct customer IDs in the rental table.**
SELECT distinct(customer_id) AS distinct_customerid 
FROM rental;

### Problem 9:**Find the average payment amount made by customers.**
SELECT AVG(amount) AS avg_payment 
FROM payment;

### Problem 10:
#**Find the total number of inventory items available.**
SELECT COUNT(inventory_id) AS no_inventary_item 
FROM inventory;

### Problem 11:**Find the total number of distinct films rented.**
SELECT distinct(film_id) AS distinct_film 
FROM film;

### Problem 12:**Find the highest payment amount made by any customer.**
SELECT max(amount) AS higest_payment_amount FROM payment;

### Problem 13:**Find the average length of films that have a rating of 'PG'.**
SELECT AVG(length) AS length_film 
FROM film
WHERE rating = 'PG';

### Problem 14:
#**Find the total number of payments made in May 2005.**
SELECT count(payment_id) AS total_no_payment 
FROM payment
WHERE payment_date between '2005-05-01' and '2005-05-31';

### Problem 15:Find the total number of films with a rental duration of 7 days.**
SELECT COUNT(film_id) AS total_no_film 
FROM film 
WHERE rental_duration = 7;

### Problem 16:**Find the average replacement cost of films with a rental rate of 2.99.**
SELECT AVG(replacement_cost) AS avg_replacment_cost
FROM film 
WHERE rental_rate = 2.99;