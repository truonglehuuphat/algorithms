# Write your MySQL query statement below
-- SELECT  sell_date, COUNT(DISTINCT product) as num_sold, GROUP_CONCAT(DISTINCT product ORDER BY product ASC SEPARATOR ',') as products
-- FROM Activities
-- GROUP BY sell_date
-- ORDER BY sell_date ASC;
SELECT
    a1.sell_date,
    COUNT(DISTINCT a1.product ) as num_sold,
    GROUP_CONCAT(DISTINCT a2.product SEPARATOR ',' ) as products
FROM 
    Activities a1
JOIN Activities a2 ON a1.sell_date = a2.sell_date
GROUP BY a1.sell_date;
