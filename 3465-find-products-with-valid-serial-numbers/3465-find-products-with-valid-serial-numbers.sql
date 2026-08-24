# Write your MySQL query statement below
SELECT * FROM products 
where REGEXP_LIKE(description,'\\bSN[0-9]{4}-[0-9]{4}(?![0-9])\\b','c')
order by product_id;