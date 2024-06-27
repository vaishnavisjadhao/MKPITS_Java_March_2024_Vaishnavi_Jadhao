#1. Retrieve the total revenue generated for each film category.
SELECT c.category_id, sum(p.amount) as total_revenue
from category c
join film_category fc on c.category_id = fc.category_id
join film f on fc.film_id = f.film_id
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id  = r.inventory_id
join payment p on r.rental_id = p.rental_id
group by fc.category_id;


#2. Determine the count of rentals for each customer.
select r.customer_id ,count(rental_id)  as count_rental
from rental r                   
group by  r.customer_id;

#3. Calculate the average rental duration (in days) for each film.
select film_id, avg(rental_duration) as avg_rental_duration
from film
group by film_id;

#4. Find the total revenue generated for each month.
select date_format(payment_date, '%m') as month ,sum(amount) as total_revenue
from payment
group by month
order by month;

#5. Determine the total revenue generated by each store.
select sr.store_id ,sum(p.amount) as store_total_revenue
from payment p
join staff s on p.staff_id = s.staff_id
join store sr on s.store_id = sr.store_id
group by sr.store_id;


#6. Calculate the count of rentals handled by each staff member.
select s.staff_id ,count(r.rental_id) as rental
from staff s 
join rental r on s.staff_id = r.staff_id
group by s.staff_id
order by s.staff_id;

#7. Compute the average rental rate for each film category.
select c.category_id ,avg(rental_rate) as avg_rental_rate
from category c
join film_category fc on c.category_id = fc.category_id
join film f on fc.film_id = f.film_id
group by c.category_id
order by c.category_id;

#8. Determine the count of rentals for each film.
SELECT f.title AS film_title, COUNT(r.rental_id) AS rental_count
FROM rental r
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
GROUP BY f.title
ORDER BY rental_count DESC;

#9. Retrieve the total revenue generated for each city.
select ct.city, sum(p.amount) as total_revenue
from city ct
join address ad on ct.city_id=ad.city_id
join staff st on ad.address_id=st.address_id
join payment p on st.staff_id=p.staff_id
group by ct.city;

#10. Calculate the count of rentals for each film language.
select  l.name ,count(r.rental_id)
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
join language l on f.language_id = l.language_id 
group by l.name
order by l.name;

