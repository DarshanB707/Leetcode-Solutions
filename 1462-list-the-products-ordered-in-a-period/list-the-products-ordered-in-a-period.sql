select p.product_name, sum(o.unit) unit
from Products p join Orders o
on p.product_id = o.product_id
where o.order_date<'2020-03-01' and o.order_date>'2020-01-31'
group by p.product_name
having sum(o.unit)>=100;