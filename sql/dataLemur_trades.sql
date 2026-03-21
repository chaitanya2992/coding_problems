-- https://datalemur.com/questions/completed-trades

SELECT city, COUNT(order_id) AS total_orders 
FROM trades 
JOIN users USING(user_id) 
WHERE status = 'Completed' 
GROUP BY city
ORDER BY total_orders DESC 
LIMIT 3;