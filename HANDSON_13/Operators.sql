SELECT 
    first_name,
    last_name,
    salary,
    salary * 0.15 AS PF,
    salary * 0.02 AS Professional_Tax,
    salary * 0.10 AS Income_Tax,
    salary - (salary * 0.15 + salary * 0.02 + salary * 0.10) AS Net_Salary
FROM employees;

SELECT *
FROM employees
WHERE salary > 50000;

SELECT 
    CONCAT(first_name, ' ', last_name) AS Full_Name,
    FORMAT(salary, 0) AS Salary
FROM employees
WHERE salary > 50000
ORDER BY salary ASC;

SELECT *
FROM employees
WHERE department_id <> 30;

SELECT first_name, last_name, salary
FROM employees
WHERE salary BETWEEN 30000 AND 60000;

SELECT first_name, last_name
FROM employees
WHERE last_name LIKE 'S%';

SELECT first_name, last_name
FROM employees
WHERE first_name LIKE '_a___';

SELECT first_name, last_name
FROM employees
WHERE commission_pct IS NULL;

SELECT *
FROM employees
WHERE salary > 40000
AND department_id = (
    SELECT department_id 
    FROM departments 
    WHERE department_name = 'IT'
)
AND job_id = 'IT_PROG';

SELECT *
FROM employees
WHERE last_name = 'Susan'
OR salary < 30000;

SELECT *
FROM employees
WHERE department_id IN (
    SELECT department_id 
    FROM departments 
    WHERE department_name IN ('HR', 'Finance', 'IT')
);

SELECT first_name, last_name
FROM employees
WHERE first_name LIKE '%John%';

SELECT *
FROM employees
WHERE salary > 8000
AND department_id IN (
    SELECT department_id 
    FROM departments 
    WHERE department_name IN ('HR', 'Sales')
);