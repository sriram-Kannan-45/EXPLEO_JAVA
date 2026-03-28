SELECT first_name, LENGTH(first_name) AS name_length
FROM employees;

SELECT 
    first_name,
    last_name,
    CONCAT('$', FORMAT(salary, 2)) AS formatted_salary
FROM employees;

SELECT first_name, last_name
FROM employees
WHERE LENGTH(last_name) = (
    SELECT MAX(LENGTH(last_name)) FROM employees
);

SELECT first_name, last_name
FROM employees
WHERE last_name LIKE 'A%' 
   OR last_name LIKE 'E%' 
   OR last_name LIKE 'I%' 
   OR last_name LIKE 'O%' 
   OR last_name LIKE 'U%';

SELECT first_name, last_name, hire_date
FROM employees
WHERE YEAR(hire_date) = 2020;

SELECT first_name, last_name, ROUND(salary, 2) AS rounded_salary
FROM employees;

SELECT 
    first_name,
    last_name,
    salary,
    (salary / (SELECT SUM(salary) FROM employees)) * 100 AS salary_percentage
FROM employees;

SELECT first_name, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

SELECT first_name, last_name, YEAR(hire_date) AS hire_year
FROM employees;

SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date >= CURDATE() - INTERVAL 30 DAY;

SELECT first_name, last_name, DAYNAME(hire_date) AS hire_day
FROM employees;

SELECT first_name, last_name, hire_date
FROM employees
WHERE YEAR(hire_date) = 2022 AND MONTH(hire_date) = 3;

SELECT first_name, last_name, hire_date
FROM employees
WHERE YEAR(hire_date) = YEAR(CURDATE());

SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date >= CURDATE() - INTERVAL 7 DAY;

SELECT 
    first_name,
    last_name,
    hire_date,
    DATEDIFF(CURDATE(), hire_date) AS days_since_hired
FROM employees;

SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date >= CURDATE() - INTERVAL 3 MONTH;

SELECT first_name, last_name, DATE_FORMAT(hire_date, '%d-%m-%Y') AS formatted_hire_date
FROM employees;

SELECT first_name, last_name, hire_date
FROM employees
WHERE DAYOFWEEK(hire_date) IN (1,7);

SELECT NOW() AS current_date_time;

SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date <= CURDATE() - INTERVAL 5 YEAR;