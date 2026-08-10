# Write your MySQL query statement below
SELECT e.employee_id FROM Employees  e 
left JOIN Employees  m
ON e.manager_id = m.employee_id 
WHERE e.salary < 30000 and e.manager_id is not null and m.employee_id is null
order by e.employee_id;