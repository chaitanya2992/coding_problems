--  identify all employees who earn more than their direct managers.
--  The result should include the employee's ID and name.

select e.employee_id, e.name
from "employee" e 
join "employee" e1 on e.manager_id=e1.employee_id
where e.salary > e1.salary;