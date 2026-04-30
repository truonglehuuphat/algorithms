# Write your MySQL query statement below
WITH CTE AS (
    SELECT id, ROW_NUMBER()  OVER (PARTITION BY email ORDER BY id) as RowNum
    FROM Person
)
DELETE FROM Person 
WHERE id In (
    SELECT id FROM CTE where RowNum > 1
)