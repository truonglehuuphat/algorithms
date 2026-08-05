# Write your MySQL query statement below
SELECT p1.product_id as product_id, 'store1' as store, p1.store1 as price
from Products p1
where p1.store1 is not Null
union all
SELECT p2.product_id as product_id, 'store2' as store, p2.store2 as price
from Products p2
where p2.store2 is not Null
union all
SELECT p3.product_id as product_id, 'store3' as store, p3.store3 as price
from Products p3
where p3.store3 is not Null