select event_day as day, emp_id, sum(abs(out_time-in_time)) as total_time
from Employees
group by emp_id, event_day;