#1.Create a view named `customer_rental_info` that lists each customer's full name (first and last), email, the number of rentals 
#they have made, and the total amount they have spent on rentals.
create view customer_rental_info
as
select c.customer_id,CONCAT(c.first_name, ' ', c.last_name)as customer_full_name , c.email, count(r.rental_id) as number_rentals,
       sum(f.rental_rate) as total_amount
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
group by c.customer_id
order by c.customer_id;


#2.Create a view named `top_rented_films` that displays the top 10 most rented films, including the film title and the number of
#times it has been rented.
create or replace view top_rented_films
as
select f.film_id , f.title, count(r.rental_id) as film_count
from film f
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by f.film_id
order by film_count
limit  10;
select * from top_rented_films;

#3.Create a view named `active_customers` that lists all customers who have rented at least one film in the last 30 days. Include 
#the customer's full name, email, and the date of their last rental.
create or replace view active_customers
as 
select CONCAT(c.first_name, ' ', c.last_name)as customer_full_name, c.email, max(r.rental_date) as max_rental_date
from customer c
join rental r on c.customer_id = r.customer_id
where r.rental_date <= current_date() - interval 30 day
group by r.rental_date;


#4.Create a view named `inventory_by_store` that displays the number of films available in each store. Include the store ID and 
#the count of films available in that store.
create view inventory_by_store
as
select count(f.film_id) as store_film, s.store_id
from film f
join inventory i on f.film_id = i.film_id
join store s on i.store_id = s.store_id
group by s.store_id
order by s.store_id;
select * from inventory_by_store;

#5.Create a view named `staff_sales_performance` that lists each staff member's full name, their store, and the total sales amount 
#they have made.
create or replace view staff_sales_performance
as
select  s.store_id, CONCAT(s.first_name, ' ', s.last_name)as staff_full_name, sum(p.amount)
from staff s
join payment p on s.staff_id = p.staff_id
group by store_id
order by store_id;
select * from staff_sales_performance;
