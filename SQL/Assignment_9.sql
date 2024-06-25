#------------------------SubQuery
/*. Find customers who rented a specific film:
Retrieve the names of customers who rented the film with the title 'Inception'.*/
SELECT c.customer_id,c.FIRST_name
FROM customer c 
join rental r ON r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
WHERE f.title='MASK PEACH';

SELECT c.first_name, c.last_name
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
WHERE i.film_id = ( SELECT f.film_id 
                    FROM film f
                    WHERE f.title = 'MASK PEACH');
                    
/*2.Retrieve the titles of films rented by a customer with a given customer_id.*/
SELECT f.title , f.film_id
FROM film f 
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
WHERE r.customer_id = (select r.customer_id
                      from rental r
                      where r.customer_id = 4);


/*3.Retrieve the rental details for the most recent rental transaction in the database.*/
SELECT r.rental_id,r.customer_id
from rental r 
ORDER BY r.rental_date DESC 
limit 1 ;

/*4.Compare the average rental duration of films in a specific category with the overall average rental duration.*/



/*5.Retrieve films with rental counts greater than the average number of 
rentals across all films.
- Count film wise rental
- Display films whose rental count is > avg rental count
*/


/* 6. Find customers who rented the same film as another customer:
Identify customers who rented the same film as a specific customer (based on customer_id)..
*/
select CONCAT(c.first_name, ' ', c.last_name)as customer_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where f.film_id in (select f.film_id, c.customer_id
                   from customer c
                   join rental r on c.customer_id = r.customer_id
                   join inventory i on r.inventory_id = i.inventory_id
                   join film f on i.film_id = f.film_id
                   where c.customer_id = 4);


/*7.Identify customers who have rented films from both store_id 1 and 
store_id 2*
*/
SELECT 
    c.customer_id,
    c.first_name,
    c.last_name
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN store s ON i.store_id = s.store_id
WHERE s.store_id IN (1, 2)
GROUP BY c.customer_id, c.first_name, c.last_name
HAVING COUNT(DISTINCT s.store_id) = 2;


select 
from customer
where customer_id in
(store_id = 1)and custome_id in (store_id = 2)

/*8. Find actors who have appeared in the same film:
Retrieve actors who have appeared in the same film as a specific actor (based on actor_id).*/
(actor_id)

/*9. Find films rented by top-revenue customers:
Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue.*/
film_tiltel where customer_id in( )


/*10. Find films that have not been rented:
Retrieve titles of films that have not been rented by any customer.*/
