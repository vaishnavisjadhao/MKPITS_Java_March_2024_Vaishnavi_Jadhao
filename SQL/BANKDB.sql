create database BankDB;
use BankDB;

Create Table Bank(
BranchName varchar(25),
Address varchar(25),
City char(20),
PostalCode char(6),
Country char(10),
Phone int,
Email char(20),
IFSCCode CHAR(10),
);
INSERT INTO Bank values ('State Bank Of India', 'Shankar Nagar', 'Nagpur', '440001', 9561481249, 'satebank@gmail.com', 'SBIN0000432');
INSERT INTO Bank values ('HDFC Bank', 'Ram Nagar', 'Wardha', '442001', 7350631655, 'hdfcbank@gmail.com', 'HDFC0000965');

Create Table Transaction(
TransactionID char(10),
TransactionDate date,
Amount int,
TransactionType char(10),
CustomerID char(5),
BankID char(5),
AccountNumber char(10),
Status char(10)
);
insert into Transaction values('123456789', '2024-04-05', 50000, 'Credited', 'SBI101', '421764', 'VND2356786','completed');