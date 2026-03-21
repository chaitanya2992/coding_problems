/*Write a solution to analyze AI prompt usage patterns based on the following requirements:

For each user, calculate the total number of prompts they have submitted.
For each user, calculate the average tokens used per prompt (Rounded to 2 decimal places).
Only include users who have submitted at least 3 prompts.
Only include users who have submitted at least one prompt with tokens greater than their own average token usage.
Return the result table ordered by average tokens in descending order, and then by user_id in ascending order.*/

with cte as
(
    select user_id,count(prompt) as prompt_count,
    round(avg(tokens),2) as avg_tokens, 
    max(tokens) as max_token
    from prompts
    group by user_id 
    having count(user_id) >= 3
    order by avg_tokens desc, user_id
)

select user_id, prompt_count, avg_tokens 
from cte 
where max_token > avg_tokens