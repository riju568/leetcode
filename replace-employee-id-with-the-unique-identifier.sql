-- Fetch employee names along with their unique IDs (if available)
SELECT e.name, u.unique_id
FROM Employees AS e
LEFT JOIN EmployeeUNI AS u 
ON e.id = u.id;
