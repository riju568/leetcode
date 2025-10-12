-- Get countries with area ≥ 3M or population ≥ 25M
SELECT name, area, population
FROM World
WHERE population >= 25000000 OR area >= 3000000;
