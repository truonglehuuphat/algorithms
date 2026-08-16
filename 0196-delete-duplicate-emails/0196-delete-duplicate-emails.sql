# Write your MySQL query statement below
WITH CTE as (
    select id, ROW_NUMBER() over (partition by email order by id) as rownum
    from Person
)
delete from Person
where id In (select id from CTE where rownum > 1)