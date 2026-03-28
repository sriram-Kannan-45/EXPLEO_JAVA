SELECT COUNT(*) AS total_employees
FROM employees;

SELECT AVG(salary) AS avg_salary
FROM employees;

SELECT MAX(salary) AS max_salary, MIN(salary) AS min_salary
FROM employees;

SELECT SUM(salary) AS total_salary
FROM employees;

SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;

SELECT COUNT(*) AS clerk_count
FROM employees
WHERE job_id = 'PU_CLERK';

SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 6;

SELECT department_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id;

SELECT department_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id
HAVING AVG(salary) > 50000;

SELECT job_id, SUM(salary) AS total_salary
FROM employees
GROUP BY job_id;

SELECT job_id, AVG(commission_pct) AS avg_commission
FROM employees
WHERE commission_pct IS NOT NULL
GROUP BY job_id
HAVING AVG(commission_pct) > 0.1;

SELECT YEAR(hire_date) AS hire_year, COUNT(*) AS employee_count
FROM employees
GROUP BY YEAR(hire_date)
HAVING COUNT(*) > 2;

SELECT department_id, 
       SUM(salary) AS total_salary, 
       MAX(salary) AS max_salary, 
       MIN(salary) AS min_salary
FROM employees
GROUP BY department_id;

SELECT department_id
FROM employees
GROUP BY department_id
HAVING (MAX(salary) - MIN(salary)) > 30000;

SELECT job_id, 
       COUNT(*) AS employee_count, 
       AVG(salary) AS avg_salary
FROM employees
WHERE job_id LIKE 'S%'
GROUP BY job_id;