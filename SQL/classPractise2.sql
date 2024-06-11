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

