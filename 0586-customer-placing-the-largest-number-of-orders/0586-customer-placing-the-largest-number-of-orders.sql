# Write your MySQL query statement below
WITH CTE as (
    SELECT order_number as Id, COUNT(customer_number) FROM Orders
    GROUP BY customer_number 
    ORDER BY COUNT(customer_number) DESC
    LIMIT 1
)
SELECT customer_number FROM Orders O
JOIN CTE 
ON O.order_number = CTE.Id