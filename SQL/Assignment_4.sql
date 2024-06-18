use sakila;
#1.	Retrieve the names of all customers and the titles of the films they have rented.
Select c.first_name, c.last_name, f.title 
from customer  c
join rental  r on c.customer_id = r.customer_id 
join inventory i on  r.inventory_id= i.inventory_id
join film f on i.film_id = f.film_id;


#2.	Display the rental date and return date for each rental along with the customer's first name and last name.
select r.rental_date, r.return_date, c.first_name, c.last_name
from rental r
join customer c on c.customer_id = r.customer_id;

#3.	List the names of actors who have appeared in the film titled "Chamber Italian".
select a.first_name, a.last_name, f.title
from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
where f.title = 'Chamber Italian';

#4.	Get the titles of all films rented by the customer named "William Brown".
Select  f.title, c.first_name, c.last_name
from film  f
join inventory  i on f.film_id = f.film_id 
join rental r on  i.inventory_id= r.inventory_id
join customer c on r.customer_id = c.customer_id
WHERE c.first_name = 'William ';

#5.	Retrieve the film titles rented by the customer with customer_id 100.
Select  f.title, c.customer_id
from film  f
join inventory  i on f.film_id = i.film_id 
join rental r on  i.inventory_id= r.inventory_id
join customer c on r.customer_id = c.customer_id
WHERE c.customer_id = 100;

#6.	List the film titles and rental dates for all rentals made by the customer with customer_id 200.
Select  f.title, r.rental_date, c.customer_id
from film  f
join inventory  i on f.film_id = f.film_id 
join rental r on  i.inventory_id= r.inventory_id
join customer c on r.customer_id = c.customer_id
WHERE c.customer_id = 200;

#7.	Display the film titles and rental durations for all rentals made on May 15, 2005.
Select  f.title, f.rental_duration
from film  f
join inventory  i on f.film_id = i.film_id 
join rental r on  i.inventory_id= r.inventory_id
WHERE rental_date like '2005-05%';

#8.	List the names of customers who have rented the film titled "Alien Center".
Select c.first_name, c.last_name, f.title 
from customer  c
join rental  r on c.customer_id = r.customer_id 
join inventory i on  r.inventory_id= i.inventory_id
join film f on i.film_id = f.film_id
where f.title = 'Alien Center';

#9.	Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
Select c.first_name, c.last_name, c.email, f.title 
from customer  c
join rental  r on c.customer_id = r.customer_id 
join inventory i on  r.inventory_id= i.inventory_id
join film f on i.film_id = f.film_id
where title = 'Flight Lies';

#10.	Retrieve the rental date and rental duration for each rental made by customer "Linda Williams".
Select  f.rental_duration, r.rental_date, c.first_name, c.last_name
from film  f
join inventory  i on f.film_id = f.film_id 
join rental r on  i.inventory_id= r.inventory_id
join customer c on r.customer_id = c.customer_id
WHERE c.first_name = 'Linda' and c.last_name = 'Williams';


#11.	List the film titles and rental dates for all rentals made by customer "Mary Johnson".
Select  f.title, r.rental_date, c.first_name, c.last_name
from film  f
join inventory  i on f.film_id = f.film_id 
join rental r on  i.inventory_id= r.inventory_id
join customer c on r.customer_id = c.customer_id
WHERE c.first_name = 'Mary' and c.last_name = 'Smith'; 

#12.	Display the film titles rented by the customer with customer_id 300.
select f.title, c.customer_id
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id =f.film_id
where c.customer_id = 300;

#13.	Get the names of all customers who have rented more than 5 films.
select c.first_name, c.last_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where rental_duration >= 5;

SELECT c.first_name, c.last_name
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
HAVING COUNT(r.rental_id) > 5;


#14.	List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select f.title AS film_title, r.rental_date
from rental r
join inventory i ON r.inventory_id = i.inventory_id
join film f ON i.film_id = f.film_id
where r.customer_id = 400;


#15.	Retrieve the rental date and return date for each rental made by customer "Richard Davis".
SELECT r.rental_date , r.return_date 
from rental r
join customer c on r.customer_id = c.customer_id
where c.first_name = 'Richard' and c.last_name = 'Davis';

#16.	Display the first name, last name, and email of customers who have rented the film titled "Dinosaur Secretary".
select c.first_name, c.last_name, c.email, f.title
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
Where f.title = "Dinosaur Secretary";

#17.	List the names of customers who have rented the film titled "Silence Kane".
SELECT c.first_name, c.last_name
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE f.title = 'Silence Kane';


#18.	Get the film titles and rental dates for all rentals made on August 10, 2005.
SELECT f.title, r.rental_date
FROM rental r
JOIN inventory i ON  r.inventory_id = i.inventory_id 
JOIN film  f ON i.film_id = f.film_id
WHERE date(r.rental_date) = '2005-08-10';

#19.	Retrieve the film titles rented by the customer with customer_id 500.
SELECT f.title, c.customer_id
FROM film f
JOIN inventory i ON f.film_id = i.inventory_id
JOIN rental r ON i.inventory_id = r.inventory_id
JOIN customer c ON r.customer_id = r.customer_id
WHERE c.customer_id = 500;

#20.	Display the rental date and rental duration for each rental made by customer "Karen Smith".
SELECT r.rental_date, f.rental_duration
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Karen' AND c.last_name = 'Smith';

#21.	List the film titles and rental dates for all rentals made by customer "Steven Taylor".
SELECT r.rental_date, f.title, c.first_name, c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Steven' AND c.last_name = 'Taylor';


#22.	Display the names of customers who have rented the film titled "Ocean Luke".
SELECT c.first_name, c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE f.title = 'Ocean Luke';


#23.	Get the first name, last name, and email of customers who have rented more than 10 films.
SELECT c.first_name, c.last_name, c.email
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name, c.email
HAVING COUNT(r.rental_id) > 10;
    

#24.	Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 600.
SELECT f.title, r.rental_date, r.customer_id
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 600;

#25.	List the rental date and return date for all rentals made by customer "Susan Johnson".
SELECT r.rental_date, r.return_date, c.first_name, c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Susan' AND c.last_name = 'Johnson';

#26.	Display the film titles rented by the customer with customer_id 700.
SELECT f.title
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 700;

#27.	Get the names of customers who have rented the film titled "Murder Antitrust".
SELECT c.first_name,  c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN  customer c ON r.customer_id = c.customer_id
WHERE f.title = 'Murder Antitrust';

#28.	Retrieve the rental date and rental duration for each rental made by customer "Joseph Brown".
SELECT r.rental_date, f.rental_duration
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Josep' AND c.last_name = 'Brown';


#29.	List the film titles and rental dates for all rentals made by customer "Michael Davis".
SELECT f.title, r.rental_date
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Michael' AND c.last_name = 'Devis';

#30.	Display the first name, last name, and email of customers who have rented the film titled "Squad Fisherman".
SELECT  c.first_name, c.last_name, c.email
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE f.title='Squad Fisherman';

#31.	Get the film titles and rental dates for all rentals made on July 25, 2005.
SELECT f.title, r.rental_date
FROM film f
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
WHERE date(r.rental_date) = '2005-07-25';


#32.	Retrieve the film titles rented by the customer with customer_id 800.
SELECT f.title, r.customer_id
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 800;

#33.	List the rental date and return date for all rentals made by customer "Barbara Taylor".
SELECT r.rental_date, r.return_date 
FROM rental r
JOIN customer c ON r.customer_id =c.customer_id
WHERE c.first_name = 'Barbara' and c.last_name = 'Taylor';

#34.	Display the names of customers who have rented the film titled "Riders Zorro".
SELECT c.first_name, c.last_name, f.title
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON  r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE f.title = 'Riders Zorro';

#35.	Get the first name, last name, and email of customers who have rented more than 8 films.
SELECT c.first_name, c.last_name, c.email
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name, c.email
HAVING COUNT(r.rental_id) > 8;

#36.	Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 900.
SELECT f.title, r.rental_date
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 900;

#37.	List the rental date and rental duration for each rental made by customer "Charles Harris".
SELECT r.rental_date, f.rental_duration
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Charles' AND c.last_name = 'Harris';

#38.	Display the film titles rented by the customer with customer_id 1000.
SELECT f.title
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 1000;

#39.	Get the names of customers who have rented the film titled "Casino Royale".
SELECT c.first_name,  c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN  customer c ON r.customer_id = c.customer_id
WHERE f.title = 'Casino Royale';

#40.	Retrieve the rental date and return date for each rental made by customer "Lisa Anderson".
select r.rental_date, r.return_date 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.first_name="Lisa" and c.last_name="Anderson";

#41.	List the film titles and rental dates for all rentals made by customer "Matthew Mahan".
select f.title, r.rental_date 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id
 where c.first_name="Matthew" and c.last_name="Mahan";

#42.	Display the first name, last name, and email of customers who have rented the film titled "Innocent Usual".
SELECT c.first_name, c.last_name, c.email
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE f.title = "Innocent Usual";

#43.	Get the film titles and rental dates for all rentals made on June 18, 2005.
SELECT f.title, r.rental_date
FROM film f
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
WHERE date(r.rental_date) = '2005-06-18';

#44.	Retrieve the film titles rented by the customer with customer_id 100.
select f.title 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.customer_id=100;

#45. List the rental date and return date for all rentals made by customer Jennifer Lee
select f.title, r.rental_date 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.first_name="Jennifer" and c.last_name="Lee";

#46. Display the names of customers who have rented the film titled Inferno Kilometer
select c.customer_id, c.first_name, c.last_name 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where f.title='Indian Love';

#47. Get the first name, last name, and email of customers who have rented more than 12 films.
select c.first_name,c.last_name,c.email 
from customer c 
join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id 
join film f on f.film_id=i.film_id 
group by c.customer_id 
having count(f.title)>12;

#48. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 120.
select f.title, r.rental_date 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.customer_id=120;

#49. List the rental date and rental duration for each rental made by customer David Royal
select f.title, r.rental_date, f.rental_duration 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.first_name="David" and c.last_name="Royal";

#50. Display the film titles rented by the customer with customer_id 130.
select f.title 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.customer_id=130;

#51.	Get the names of customers who have rented the film titled "Golden Groove".
SELECT c.first_name,  c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN  customer c ON r.customer_id = c.customer_id
WHERE f.title = 'Golden Groove'; 

#52.	Retrieve the rental date and return date for each rental made by customer "Laura Martinez".
SELECT r.rental_date , r.return_date 
from rental r
join customer c on r.customer_id = c.customer_id
where c.first_name = 'Laura' and c.last_name = 'Martinez';

#53.	List the film titles and rental dates for all rentals made by customer "John Johnson".
SELECT r.rental_date, f.title, c.first_name, c.last_name
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'John' AND c.last_name = 'Johnson';

#54.	Display the first name, last name, and email of customers who have rented the film titled "Spice Sorcerer".
select c.first_name, c.last_name, c.email, f.title
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f ON i.film_id = f.film_id
where f.title = "Spice Sorcerer";

#55.	Get the film titles and rental dates for all rentals made on September 5, 2005.
SELECT f.title, r.rental_date
FROM rental r
JOIN inventory i ON  r.inventory_id = i.inventory_id 
JOIN film  f ON i.film_id = f.film_id
WHERE date(r.rental_date) = '2005-09-05';

#56.	Retrieve the film titles rented by the customer with customer_id 1400.
SELECT f.title, r.customer_id
FROM rental r
JOIN inventory i ON  r.inventory_id = i.inventory_id 
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 1400;

#57.	List the rental date and return date for all rentals made by customer "Sarah Thomas".
SELECT r.rental_date, r.return_date
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Sarah' AND c.last_name = 'Thomas';

#58.	Display the names of customers who have rented the film titled "Scream Human".
Select c.first_name, c.last_name,  f.title 
from customer  c
join rental  r on c.customer_id = r.customer_id 
join inventory i on  r.inventory_id= i.inventory_id
join film f on i.film_id = f.film_id
where title = 'Scream Human';

#59.	Get the first name, last name, and email of customers who have rented more than 15 films.
SELECT c.first_name, c.last_name, c.email
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name, c.email
HAVING COUNT(r.rental_id) > 15;
    

#60.	Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 1500.
SELECT f.title, r.rental_date, r.customer_id
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id = 1500;