select p.product_id, case when
    sum(u.units) is NULL or sum(u.units)=0 then 0 else Round(sum(p.price*u.units)/sum(u.units), 2)
end Average_price
from Prices p left join UnitsSold u
on p.product_id = u.product_id and u.purchase_date between p.start_date and p.end_date
group by p.product_id;