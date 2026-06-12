# Write your MySQL query statement below
WITH CTE as (
    SELECT COUNT(user_id) as total_count
    FROM Users
)
SELECT r.contest_id , ROUND(COUNT(r.contest_id)*100/CTE.total_count, 2)  as percentage 
FROM Users u
JOIN Register r
ON u.user_id = r.user_id
CROSS JOIN CTE
GROUP BY r.contest_id 
ORDER BY percentage DESC, r.contest_id ASC
