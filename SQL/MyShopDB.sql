create database MyShop;
use MyShop;
 
 Create table ProductMaster(
 Product_id char(5),
 Product_Name varchar(25),
 Category varchar(25),
 Stock_Quantity int,
 Supplier_id char(5)
 );
Insert into ProductMaster values('1', 'TV', 'Electronics', '15', '101'); 
Insert into ProductMaster values('2', 'Laptop', 'Electronics', '5', '102');
Insert into ProductMaster values('3', 'Shirt', 'Clothes', '50', '103');  
Insert into ProductMaster values('4', 'Car', 'Vehicle', '10', '104');
Insert into ProductMaster values('5', 'Table', 'Carpentrey', '20', '105');
select * from ProductMaster;
 
Create table SupplierMaster(
Supplier_id char(5),
Suplier_Name varchar(25),
City char(10),
Address varchar(20),
Phone_No int
 );
Insert into SpplierMaster Values('104', 'Jhon Dell', 'Pune', 'Katraj', 9561481249);
Insert into SpplierMaster Values('105', 'Nick Poll', 'Mumbai', 'Lokhandwala', 77750631655);
Insert into SpplierMaster Values('106', 'Tom Jerry', 'Banglor', 'Swai City', 7350631655);
Insert Into SupplierMaster Values('107', 'Jak Jain', 'Hydrabad', 'Fortune Society', 976347849);
Insert into SupplierMaster Values('102', 'Mark Faizal', 'Amravti', 'Dream Land', 9899215679);
select * from SupplierMaster;
 
 Create table Customer(
 Customer_id char(5), 
 Customer_Name Varchar(25), 
 city char(20),
 Address varchar(10), 
 Contact_No int
 );
 Insert Into Customer values('C01','Bob Kharat', 'Mumbai', 'Virar Vasai', '8646649383');
 Insert Into Customer values('C02','Komal Vitale', 'Chandrapur', 'Ram Nagar', '9921699437');
 Insert Into Customer values('C03','Aditya Raut', 'Pune', 'Ashish Nagar', '9921481249');
 Insert Into Customer values('C04','Salman Khan', 'Thane', 'Shankar Nagar', '7350777609');
 Insert Into Customer values('C05','Virat Kholi', 'Latur', 'Gokuldham', '9860446600');
  select * from Customer;
 
 Create table OrderProduct(
 order_id char(5), 
 Customer_id char(5), 
 Product_id char(5), 
 Quantity int, 
 Price int,
 Status varchar(20)
 );
 Insert Into OrderProduct values('2001', 'C03', '104', 15, 10000, 'Pending');
 Insert Into OrderProduct values('2002', 'C04', '106', 50, 50000, 'Deliverd');
 Insert Into OrderProduct values('2003', 'C05', '107', 20, 10000, 'Shipped');
 Insert Into OrderProduct values('2004', 'C06', '108', 15, 10000, 'Canceled');
 Insert Into OrderProduct values('2005', 'C07', '109', 15, 10000, 'Shipped');
  select * from OrderProduct;
 
 Create table SaleProduct(
 Sale_id  char(10), 
sale_date date, 
customer_id char(5), 
Total_amount int,
product_id char(5)
 );
 Insert Into SaleProduct values('555', 20-4-2023, 'C05', 20000, 3);
 Insert Into SaleProduct values('666', 28-7-2023, 'C03', 70000, 4);
 Insert Into SaleProduct values('777', 2-2-2024, 'C02', 40000, 2);
 Insert Into SaleProduct values('888', 12-7-2021, 'C06', 10000, 5);
 Insert Into SaleProduct values('999', 18-8-2019, 'C01', 15000, 6);
 
 select * from SaleProduct;
 select * from ProductMaster;
 select * from Customer;
 select * from OrderProduct;
 select * from SaleProduct;