# Write your MySQL query statement below
SELECT user_id, CONCAT(UPPER(SubStr(name,1,1)), LOWER(SubStr(name,2,length(name)))) as name  
FROM Users 
ORDER BY user_id ASC