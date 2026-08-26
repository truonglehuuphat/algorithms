# Write your MySQL query statement below
SELECT requester_id as id , COUNT(requester_id) as num 
from (
select requester_id from RequestAccepted 
union all
select accepter_id from RequestAccepted
) as temp 
group by id
order by num desc limit 1;
