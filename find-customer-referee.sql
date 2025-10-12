-- Get customer names not referred by ID 2
SELECT name 
FROM Customer AS c
WHERE c.referee_id IS NULL OR c.referee_id != 2;
