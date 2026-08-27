# Write your MySQL query statement below
SELECT name
FROM Customer 
WHERE id <> 2 OR  isNULL(referee_id)