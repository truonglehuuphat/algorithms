# Write your MySQL query statement below
-- WITH CTE as (
--     SELECT player_id, event_date,
--         LAG(event_date, 1) over ( Partition by player_id order By player_id) as previous_day
--     FROM Activity 
-- ) SELECT *
-- FROM cte
-- WHERE previous_day IS NOT NULL;

-- SELECT 
--     l1.id,
--     l1.login_time,
--     MAX(l2.login_time) AS previous_login
-- FROM Logins l1
-- LEFT JOIN Logins l2 
--     ON l1.id = l2.id 
--     AND l2.login_time < l1.login_time
-- GROUP BY l1.id, l1.login_time
-- ORDER BY l1.id, l1.login_time;
-- SELECT DATE_ADD(event_date, INTERVAL -previous_day DAY) AS previous_date

WITH first_login as (
    SELECT 
    player_id,
    MIN(event_date) as first_day
    FROM Activity
    GROUP BY player_id
),
next_login as (
    SELECT 
    f.player_id
    FROM first_login f
    JOIN Activity a
        on f.player_id  = a.player_id    
        and a.event_date = DATE_ADD(f.first_day, INTERVAL 1 DAY)
)
SELECT 
    ROUND(COUNT(DISTINCT n.player_id)/COUNT(DISTINCT f.player_id),2) as fraction  
FROM first_login f
LEFT JOIN  next_login n
    ON f.player_id = n.player_id


-- WITH first_login AS (
--     -- Get each player's first login date
--     SELECT player_id, MIN(event_date) AS first_date
--     FROM Activity
--     GROUP BY player_id
-- ),
-- next_day_login AS (
--     -- Find players who logged in exactly one day after their first login
--     SELECT f.player_id
--     FROM first_login f
--     JOIN Activity a
--       ON f.player_id = a.player_id
--      AND a.event_date = DATE_ADD(f.first_date, INTERVAL 1 DAY)
-- )
-- SELECT 
--     ROUND(
--         COUNT(DISTINCT n.player_id) / COUNT(DISTINCT f.player_id),
--         2
--     ) AS fraction
-- FROM first_login f
-- LEFT JOIN next_day_login n
--   ON f.player_id = n.player_id;