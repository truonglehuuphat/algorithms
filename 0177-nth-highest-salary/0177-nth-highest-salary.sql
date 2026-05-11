CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    SELECT salary
    INTO result
    FROM (SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) as ranking FROM Employee )
    WHERE ranking = N
    AND ROWNUM = 1;

    RETURN result;
END;