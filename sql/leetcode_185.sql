/*A high earner in a department is an employee who has a salary in the top three unique salaries for that department.

Write a solution to find the employees who are high earners in each of the departments.

Return the result table in any order.*/

with tmp as
(
    select d.name as Department, e.name as Employee, salary as Salary, 
    dense_rank() over(partition by d.id order by salary desc) as rn 
    from Employee e 
    join Department d on e.departmentId = d.id
)

select Department, Employee, Salary 
from tmp where rn in(1,2,3)