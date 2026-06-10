# Write your MySQL query statement below
-- SELECT  v.customer_id , COUNT(v.customer_id) as count_no_trans 
-- FROM Visits v
-- JOIN Transactions t
--     ON v.visit_id = t.visit_id 
-- WHERE v.visit_id NOT IN (SELECT DISTINCT t.visit_id FROM Transactions t)
-- GROUP BY v.customer_id 
-- ORDER BY v.customer_id DESC
-- SELECT DISTINCT t.visit_id FROM Transactions t

SELECT v.customer_id , COUNT(v.customer_id) as count_no_trans
FROM Visits v
WHERE v.visit_id NOT IN (SELECT DISTINCT t.visit_id FROM Transactions t)
GROUP BY v.customer_id