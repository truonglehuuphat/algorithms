# Write your MySQL query statement below
SELECT st.machine_id, ROUND(SUM((en.timestamp - st.timestamp))/COUNT( st.process_id),3) as processing_time 
FROM Activity st
JOIN Activity en
ON st.machine_id = en.machine_id
Where st.activity_type  = 'start' and en.activity_type  = 'end' and st.process_id  = en.process_id 
GROUP BY st.machine_id 
ORDER BY st.machine_id ASC
