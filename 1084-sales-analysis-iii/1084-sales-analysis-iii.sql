# Write your MySQL query statement below
-- WITH CTE1 as (
-- SELECT  p.product_id, p.product_name
-- FROM Product p
-- JOIN Sales s
-- ON p.product_id = s.product_id
-- WHERE s.sale_date BETWEEN '2019-01-01' AND '2019-03-31'
-- ),
-- CTE2 as (
-- SELECT p.product_id, p.product_name
-- FROM Product p
-- JOIN Sales s
-- ON p.product_id = s.product_id
-- WHERE s.sale_date BETWEEN '2019-04-01' AND '2019-12-31'
-- )

-- SELECT DISTINCT CTE1.product_id as product_id , CTE1.product_name as product_name 
-- FROM CTE1
-- WHERE CTE1.product_id NOT IN (SELECT CTE2.product_id FROM CTE2);


SELECT p.product_id as product_id, p.product_name as product_name
FROM Product p
JOIN Sales s
ON p.product_id = s.product_id
GROUP BY product_id
HAVING MIN(s.sale_date) >= '2019-01-01' AND MAX(s.sale_date) <= '2019-03-31' AND COUNT(p.product_id) >= 1;