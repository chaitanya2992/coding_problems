-- Write a query to display the user IDs of those 
-- who did not confirm their sign-up on the first day, 
-- but confirmed on the second day.

SELECT user_id 
FROM emails join texts using(email_id)
where signup_action = 'Confirmed' 
and date(signup_date)+1 = action_date;