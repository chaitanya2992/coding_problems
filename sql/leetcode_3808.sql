/*3808. Find Emotionally Consistent Users
Write a solution to identify emotionally consistent users based on the following requirements:

For each user, count the total number of reactions they have given.
Only include users who have reacted to at least 5 different content items.
A user is considered emotionally consistent if at least 60% of their reactions are of the same type.
Return the result table ordered by reaction_ratio in descending order and then by user_id in ascending order.

Note:reaction_ratio should be rounded to 2 decimal places
*/

with cte as(
    select *, count(user_id) as ct
    from reactions
    group by reaction, user_id
    order by user_id, ct desc
    ),

cte2 as (
    select *, sum(ct) over(partition by user_id) as sm
    from cte
    )

select user_id, reaction as dominant_reaction,
round(ct/sm, 2) as reaction_ratio 
from cte2 
where ct/sm > 0.6 and sm >= 5
order by reaction_ratio desc