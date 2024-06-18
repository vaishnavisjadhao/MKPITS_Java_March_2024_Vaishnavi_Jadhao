#Create database
create database ourdb;

use ourdb;

#create table in ourdb database
Create Table Studentdetails (
Roll_No char(4),
Name char(10),
Address varchar(25),
city char(10)
);

select * from Studentdetails;
desc Studentdetails;

#Inserting a data into table
insert into Studentdetails values ('101', 'Vaishnavi', 'Ram Nagar', 'Hinganghat');
insert into Studentdetails values ('102', 'Gopal', 'New Colony', 'Nagpur');
insert into Studentdetails values ('103', 'Ram', null, 'Pune');
insert into Studentdetails values ('104', 'Aniket', 'Shubhas Nagar', 'Wardha');
insert into Studentdetails values ('105', 'Bob', 'Friends Colony', 'Nagpur');


#creating table of MarkDetails
Create table MarkDetails(
Roll_No char(4),
Physics int,
Chemistry int,
Maths int
); 
select * from MarkDetails;
Insert into MarkDetails values ('105', 55, 76, 45);
Insert into MarkDetails values ('106', 75, 69, 56);
Insert into MarkDetails values ('107', 45, 96, 65);
Insert into MarkDetails values ('108', 85, 62, 57);
Insert into MarkDetails values ('109', 65, 63, 87);
Insert into MarkDetails values ('110', 57, 59, 76);
Insert into MarkDetails values ('111', 88, 88, 87);
Insert into MarkDetails values ('112', 59, 46, 67);
#-------------------------------------------
#constrains Example:-
use ourdb;
CREATE table SD 
(
  Roll_No char(4) Not Null,
  Name Char(10),
  Address varchar(25),
  City char(10) default 'Nagpur',
  constraint pk_rn primary key (Roll_No),
  constraint uq_rn unique(Name)
);
desc SD;
insert into SD (Roll_No, Name, Address, City) values('1001', 'Vaishnavi', 'Ram Nagar', 'Wardha');
insert into SD (Roll_No, Name, Address) values('1002', 'Geeta', 'Sai Nagar');
insert into SD (Roll_No, Name, Address, City) values('1003', 'Ram', 'Shankar Nagar', 'Nagpur');
Select * from SD;

create table MD 
(
Roll_No char(4),
Physics int check(physics between 0 and 100),
Chemistry int check(Chemistry between 0 and 100),
Math int check(Math between 0 and 100),
constraint fk_rn foreign key(Roll_No) references SD(Roll_No)
);
insert into MD(Roll_no, Physics, Chemistry, Math) values ('1001', 65, 78, 87);
insert into MD(Roll_no, Physics, Chemistry, Math) values ('1003', 56, 88, 56);
SELECT * FROM MD;

#----------------------Disable Constraint
alter table MD
disable foreign key fk_rn;

#-----------------------Add Constraint
alter table MD
add constraint fk_rn foreign key(Roll_No) references SD(Roll_No);

ALTER TABLE Persons
ADD CONSTRAINT PK_RollNo PRIMARY KEY (Roll_No);

#-----------------------Remove Constraints
alter table MD
drop constraint fk_rn foreign key(Roll_No) references SD(Roll_No);

#18-6-2024===============================================================================================================================
#-----------------Cretaing View
CREATE VIEW crif_view 
as
select CONCAT(c.first_name, ' ', c.last_name)as customer_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id;

#--------------------------Replace view
create or Replace VIEW crif_view
as
select c.customer_id, CONCAT(c.first_name, ' ', c.last_name)as customer_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
order by c.customer_id;

#--------retrive data from view
select customer_name from crif_view where customer_name = 'Norman Currier';
select * from crif_view;

#--------remove view
drop view crif_view;



