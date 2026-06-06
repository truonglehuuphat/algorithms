# Write your MySQL query statement below
SELECT u.name , SUM(case when distance > 0 then distance else 0 end) as travelled_distance  
FROM Users u
LEFT JOIN Rides r
ON u.id = r.user_id  
GROUP BY u.name, u.id
ORDER BY travelled_distance DESC, u.name ASC