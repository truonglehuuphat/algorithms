# Write your MySQL query statement below
-- SELECT DISTINCT SalesPerson.name 
-- FROM SalesPerson
-- LEFT JOIN Orders 
-- ON Orders.sales_id = SalesPerson.sales_id
-- LEFT JOIN Company
-- ON Orders.com_id = Orders.com_id
-- Where Company.name <> "RED"

SELECT SalesPerson.name 
FROM SalesPerson 
WHERE sales_id NOT IN (
    SELECT Orders.sales_id
    FROM Orders
    JOIN Company
    ON Orders.com_id = Company.com_id
    WHERE Company.name = 'RED'
)