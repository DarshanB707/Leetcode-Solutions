select temp.employee_id
from(
select e.employee_id, e.name, s.salary 
from Employees e left join Salaries s
on e.employee_id = s.employee_id
union
select s.employee_id, e.name, s.salary 
from Employees e right join Salaries s
on e.employee_id = s.employee_id) as temp
where temp.name is Null or temp.salary is Null
order by temp.employee_id;