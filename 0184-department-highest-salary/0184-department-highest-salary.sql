# Write your MySQL query statement below
-- WITH CTE as (
-- SELECT d.name as Department , e.name as Employee , MAX(e.salary) as Salary 
-- FROM Department d 
-- JOIN Employee e
-- ON e.departmentId  = d.id
-- GROUP BY Department)

-- SELECT d.name as Department , e.name as Employee , e.salary as Salary 
-- FROM Department d 
-- JOIN Employee e
-- ON e.departmentId  = d.id
-- JOIN CTE c
-- ON c.Department = Department
-- GROUP BY Department
-- HAVING e.salary = c.Salary

SELECT d.name as Department , e.name as Employee , e.salary as Salary 
FROM Employee e
JOIN Department d 
ON e.departmentId  = d.id
where e.salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = e.departmentId
);


    -- select d.name as Department, e.name as Employee, e.salary as Salary, dense_rank() over (partition by d.id order by e.salary desc) as r
    -- from Employee e
    -- left join
    -- Department d 
    -- on e.departmentId  = d.id 