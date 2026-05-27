# Write your MySQL query statement below
-- WITH CTE as (
--     SELECT *
--     FROM Activity
--     Where activity_type <> 'open_session' and activity_type <> 'close_session'
-- )

SELECT activity_date as 'day', COUNT(DISTINCT user_id) as active_users
FROM Activity
GROUP BY activity_date
HAVING activity_date BETWEEN DATE_SUB( '2019-07-27', INTERVAL 29 DAY) and '2019-07-27';