-- Fetch tweet IDs where content exceeds 15 characters
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content)
