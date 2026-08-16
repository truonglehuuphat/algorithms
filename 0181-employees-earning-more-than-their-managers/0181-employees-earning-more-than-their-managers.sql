# Write your MySQL query statement below
-- Create table Employee (
--     id int,
--     name varchar(50),
--     salary int,
--     managerId int
-- );

-- SELECT e.name as 'Employee'
SELECT e.name as Employee
from Employee e
JOIN Employee m
on e.managerId = m.id
Where e.salary > m.salary