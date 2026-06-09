# Write your MySQL query statement below
-- SELECT *
-- FROM Patients
-- WHERE conditions REGEXP '(DIAB1)' OR conditions LIKE '%DIAB1%'

-- SELECT *
-- FROM Patients
-- WHERE conditions LIKE '%DIAB1%' AND conditions NOT LIKE '__DIAB1%'

SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'