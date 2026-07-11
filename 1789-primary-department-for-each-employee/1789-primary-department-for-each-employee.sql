# Write your MySQL query statement below
Select employee_id , department_id   
FROM (
    SELECT 
    *, 
    COUNT(employee_id) OVER(PARTITION BY employee_id) as employeeCount
    FROM Employee
) EmployeePart
WHERE 
employeeCount = 1
OR primary_flag  = 'Y' 