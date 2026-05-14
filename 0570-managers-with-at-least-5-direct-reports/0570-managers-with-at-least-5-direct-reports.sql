# Write your MySQL query statement below
-- SELECT DISTINCT e1.name as name FROM Employee e1
-- JOIN Employee e2
-- ON e1.id = e2.managerId
-- WITH CTE AS (
--     SELECT e1.id as id, COUNT(e1.id) as count FROM Employee e1
--     JOIN Employee e2
--     ON e1.id = e2.managerId
--     GROUP BY e1.id
--     HAVING COUNT(e1.id) >= 5
-- )

-- SELECT name FROM Employee
-- JOIN CTE
-- ON Employee.id = CTE.id


SELECT e1.name as name FROM Employee e1
JOIN Employee e2
ON e1.id = e2.managerId
GROUP BY e2.managerId
HAVING COUNT(e1.id) >= 5