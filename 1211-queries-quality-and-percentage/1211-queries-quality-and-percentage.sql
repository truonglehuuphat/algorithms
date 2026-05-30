# Write your MySQL query statement below
SELECT q.query_name, ROUND(SUM(q.rating/q.position )/ count(q.query_name), 2) as quality, 
ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / count(q.query_name) *100, 2) as poor_query_percentage
FROM Queries q
GROUP BY q.query_name


-- SELECT query_name, count(q.query_name) AS rating_count
-- FROM Queries q
-- WHERE rating  < 3
-- GROUP BY q.query_name
