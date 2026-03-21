-- https://datalemur.com/questions/sql-second-highest-salary

SELECT salary 
FROM (  
    SELECT *, DENSE_RANK() OVER(ORDER BY salary DESC) AS drank 
    FROM employee
    ) AS tmp
WHERE drank=2;