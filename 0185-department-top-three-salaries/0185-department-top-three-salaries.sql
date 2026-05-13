# Write your MySQL query statement below
-- SELECT * FROM (
--     SELECT *
--     FROM Employee e
-- -- GROUP BY e.salary 
--     ORDER BY e.salary DESC
-- ) as t
-- JOIN Employee ee
-- ON ee.id = t.id
-- GROUP BY ee.departmentId

SELECT d.name as Department, ee.name Employee , ee.salary Salary 
FROM Employee ee
JOIN Department d
ON ee.departmentId = d.id
WHERE 3 > (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.salary > ee.salary AND ee.departmentId = e2.departmentId
)
