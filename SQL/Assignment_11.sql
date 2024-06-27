Create following Tables insert data
Customer - Customer_Id, Name, Address, City
Supplier - Supplier_Id, Name, Address, City
ProductMaster - Product_Id, Name, Price, QOH
Sale - Sale_Id, Product_id, Customer_id, Quantity, Date
Purchase - Purchase_Id, Product_id, Customer_id, Quantity, Date
 select * from Sale;  
 select * from ProductMaster;
 select * from Customer;
 select * from Purchase; 
 select * from Supplier;
##!.Retrieve the names and addresses of all suppliers in 'Los Angeles'. use myshop
select Suplier_Name, Address 
from Supplier 
where City = 'Los Angeles';

##2. Find the total quantity of products sold.;
select sum(Quantity) as Total_Quantity_Sold 
from Sale ;


###3. List all purchases of product ID 'P001' sorted by date in ascending order.
select Purchase_id, Product_id, Customer_id, Quantity, Date
from purchase 
where Purchase_id = '2001' 
order by Date;

###4.Find the names of products that have been sold more than 100 times.
select p.Product_Name 
from ProductMaster p 
join Sale s on p.Product_id = s.Product_id 
where Quantity >=100;

###5.retrieve the product ID and name of the product with the highest price.
select Product_id, Product_Name , max(price) as heighest_price 
from ProductMaster 
Order By price desc;

### 6. Find the average price of products in the product master.
select avg(price) as avg_product_price 
from ProductMaster;

###7.List the product IDs that have not been sold. 
select p.Product_id, p.Product_Name
from ProductMaster p
where p.Product_id Not In(select  distinct  Product_id 
                          from sale);

#8.Retrieve the total number of sales made in the month of June 2024.
select count(Quantity) as Total_Sales 
from Sale 
where Sale_Date like '2024-05%';

###9.Find the quantity on hand (QOH) of the product with product ID 'P005'.
**Expected Result**:
```
| QOH  |
|------|
| 120  |
```

###10 List the names and total quantities purchased of products that have been purchased more than 200 times.
select pm.Product_id, Product_Name, sum(p.Quantity) as total_quantity_purchased
from Purchase p
join ProductMaster pm on p.Product_id = pm.Product_id
group by pm.Product_id
having sum(p.Quantity) > 200;