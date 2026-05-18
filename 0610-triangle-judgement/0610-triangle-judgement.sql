# Write your MySQL query statement below
SELECT 
    x,y,z, 
    CASE 
        when x + y > z and x < y + z and x + z > y then 'Yes'
    else 'No'
    END as triangle
FROM Triangle