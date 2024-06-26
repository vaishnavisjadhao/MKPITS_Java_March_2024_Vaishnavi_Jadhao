##1.Retrieve the names and addresses of all account holders in 'New York'.
select name, Address, city
from Account
Where City = 'New York';

##2.Find the total balance of all accounts.
select Sum(Balance) as total_balance
from Account;

### 3 List all transactions of account number '12345' sorted by date in descending order.
select * from Transaction where Account_No = '12345' order by TransactionDate desc;

### 4.Find the names of account holders who have made a transaction greater than $500.
SELECT a.Name
FROM Account a
JOIN Transaction t on a.Account_No =  t.Account_No
WHERE t.Amount > 500;

### 5.Retrieve the account number and balance of the account with the highest balance.
select Account_No , Balance from Account order by Balance desc;

### 6Find the average transaction amount for 'Debit' transactions.
select avg(Amount) as Avg_Debit_Amount from Transaction where TransactionType = 'Debited';

##7 List the account numbers that have not made any transactions.
select Account_No from Transaction where TransactionType = Null;

###8. Retrieve the total number of transactions made in the month of May 2024.
select Count(Amount)  as  Total_Transactions from transaction where TransactionDate like '2024-05%';

##9. Find the balance of the account with account number '56789'.
select Balance from Account where Account_No = '56789';


##10. List the names and total transaction amounts of account holders who have made transactions totaling more than $1000.
select a.Name, Sum(t.Amount) As Total_Amount 
from Account a
JOin Transaction t on a.Account_No = t.Account_No 
Where t.Amount >= 1000;

