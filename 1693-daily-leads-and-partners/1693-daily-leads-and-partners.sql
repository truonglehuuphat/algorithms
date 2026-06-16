# Write your MySQL query statement below
SELECT date_id, make_name, Count(Distinct lead_id)  as unique_leads , Count(Distinct partner_id )  as unique_partners 
FROM DailySales
GROUP BY date_id, make_name