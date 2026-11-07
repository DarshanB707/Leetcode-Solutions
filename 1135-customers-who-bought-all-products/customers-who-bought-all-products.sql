select c.customer_id
from Customer c
group by c.customer_id
having count(Distinct c.product_key) = (select count(*) from Product);