# Write your MySQL query statement below
SELECT employee_id,  
    (   case  
        when employee_id % 2 = 0 OR name LIKE "M%" then 0
        else salary 
        end
    ) as bonus
from Employees
-- group by employee_id
ORDER by employee_id ASC
