#use data base
use sakila

#show list of tables in current data base
show tables;

#describe the table
desc actor_info;

#to view all information of table
select * from actor_info;

#projection
select first_name, film_info from actor_info;

#use arithmatic operation
select * from film;
select film_id, rental_duration+10 from film;

#use column alias[rename coulmn_name]
select film_id, rental_duration+10 as "increment_rent_duration" from film;

#concatinate two field(coulmn) use ||
select  concat(first_name , last_name) as full_name from actor_info; 
select first_name,||,last_name from actor_info;

#literal character string

#distinc keyword is use for Removing duplicates
select distinct film_id from film_actor;

#restricting and sorting data by uing where clause
select * from film where release_year = 2006;
select * from film where rental_duration <= 3;
select * from actor_info where first_name = "nick" and last_name = "stallone"

# retrive rental duration in between 4 and 7(between and)
select * from  film
where rental_duration between 4 and 7;

#Retrive actor with first name NICK or PENELOPE or BETTE
select * from actor_info
where first_name='NICK' or first_name='PENELOPE' OR first_name='BETTE';
select * from actor_info
where first_name In ('NICK' , first_name='PENELOPE' , first_name='BETTE');

#using like operator
select * from actor_info where first_name like 'A%'; --name start from A
select * from actor_info where first_name like '_N%'; --second character of name is N
select * from actor_info where first_name like '_____';  -- name in five charachter
select * from actor_info where first_name like '%E';  --name end with charachter e
select * from actor_info where first_name like 'H____';

#using IS NOT , IS NOT NULL
select * from film where rating is  NULL;
select * from film where rating is NOt NULL;

#NOT operator 
select * from actor_info where first_name NOT LIKE 'H%' ;  --name not start with H.

#order by  clause[sort the result set in ascending and descending order]
select * from actor_info Order BY actor_id desc;
select * from actor_info order by first_name; 
select * from actor_info order by first_name, last_name desc;
select * from actor_info where actor_id between 3 and 100 order by actor_id, first_name asc;
