#1: Retrieve Customer Information with Rental History
#Retrieve the customer's first name, last name, and the number of rentals they have made. Include customers who have not made
# any rentals as well.
select c.customer_id ,concat(c.first_name, ' ',c.last_name) as customer_name, count(r.rental_id) as number_rentals
from customer c
left join rental r on c.customer_id = r.customer_id
group by c.customer_id;


#Problem Statement 2: Display Films and Their Rental Count
#Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.
select f.title, count(r.rental_id) as rented_film_count
from film f
left join inventory i on f.film_id = i.film_id
left join rental r on i.inventory_id = r.inventory_id
group by f.title
order by rented_film_count desc;


#Problem Statement 3: List Customers and Their Rentals
#List customers with their rental details (rental ID, rental date, and return date if available). Include customers who have not 
#made any rentals.
select c.customer_id,c.first_name, c.last_name, r.rental_id, r.return_date, r.rental_date
from rental r
left join customer c on r.customer_id = c.customer_id 
order by c.customer_id, r.rental_date;


#Problem Statement 4: Show Films and Customers Who Rented Them
#Display film titles and the names of customers who have rented each film. Include films that have not been rented.
select f.title, c.first_name, c.last_name, r.rental_id
from film f
left join inventory i on f.film_id = i.film_id
left join rental r on i.inventory_id = r.inventory_id
left join customer c on r.customer_id = c.customer_id
order by f.title, r.rental_id;


#Problem Statement 5: Explore Rental Returns and Late Fees
#Retrieve rental ID, return date, and any associated late fees. Include rentals that have not been returned yet, displaying a 
#NULL return date for these rentals.
SELECT r.rental_id, r.return_date
FROM rental r
ORDER BY r.rental_id;

