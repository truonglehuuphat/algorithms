# Write your MySQL query statement below

SELECT r.contest_id ,
    ROUND(COUNT(r.contest_id)*100/( 
        SELECT 
        COUNT(user_id) as total_count
        FROM Users),
        2
    ) as percentage 
FROM Users u
JOIN Register r
ON u.user_id = r.user_id
GROUP BY r.contest_id 
ORDER BY percentage DESC, r.contest_id ASC
