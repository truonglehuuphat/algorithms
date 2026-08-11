# Write your MySQL query statement below
SELECT teacher_id, count(subject_id ) as cnt 
FROM (
    SELECT DISTINCT subject_id, teacher_id
    FROM Teacher 
) as CTE
GROUP BY teacher_id
ORDER BY teacher_id ASC
