# Write your MySQL query statement below
SELECT e.employee_id 
FROM Employees e
LEFT JOIN Salaries s
on e.employee_id  = s.employee_id 
Where s.salary  is NULL

UNION

SELECT s.employee_id 
FROM Employees e
RIGHT JOIN Salaries s
on e.employee_id = s.employee_id 
Where e.name  is NULL

ORDER BY employee_id ASC;