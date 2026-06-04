# Write your MySQL query statement below
SELECT p.product_name,  Sum(unit) as unit
FROM Products p
JOIN Orders o
ON p.product_id = o.product_id
where o.order_date  BETWEEN '2020-02-01' and '2020-02-29' 
GROUP BY p.product_name
HAVING unit >= 100 
ORDER BY unit DESC