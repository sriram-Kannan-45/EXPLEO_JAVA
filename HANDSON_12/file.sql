-- Q1: Create Schema
CREATE SCHEMA hr;
USE hr;

-- Q2: Regions Table
CREATE TABLE regions (
    region_id INT PRIMARY KEY,
    region_name VARCHAR(25)
);

-- Q3: Countries Table
CREATE TABLE countries (
    country_id CHAR(2) PRIMARY KEY,
    country_name VARCHAR(40),
    region_id INT,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);

-- Q4: Locations Table
CREATE TABLE locations (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    street_address VARCHAR(100),
    postal_code VARCHAR(20),
    city VARCHAR(50) NOT NULL,
    state_province VARCHAR(50),
    country_id CHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

-- Q5: Departments Table
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location_id INT,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);

-- Q6: Jobs Table
CREATE TABLE jobs (
    job_id INT PRIMARY KEY,
    job_title VARCHAR(50) NOT NULL,
    min_salary DECIMAL(10,2),
    max_salary DECIMAL(10,2)
);

-- Q7 & Q8: Employees Table (Self Referencing)
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20),
    hire_date DATE NOT NULL,
    job_id INT,
    salary DECIMAL(10,2),
    commission_pct DECIMAL(5,2),
    manager_id INT,
    department_id INT,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (manager_id) REFERENCES employees(employee_id)
);

-- Q9 & Q10: Job History Table
CREATE TABLE job_history (
    employee_id INT,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    job_id INT,
    department_id INT,
    PRIMARY KEY (employee_id, start_date),
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

-- Q11: Insert Regions
INSERT INTO regions VALUES
(1, 'Europe'),
(2, 'Americas'),
(3, 'Asia'),
(4, 'Middle East & Africa');

-- Q12: Insert Countries (20 examples)
INSERT INTO countries VALUES
('IT', 'Italy', 1),
('FR', 'France', 1),
('DE', 'Germany', 1),
('US', 'USA', 2),
('CA', 'Canada', 2),
('BR', 'Brazil', 2),
('IN', 'India', 3),
('CN', 'China', 3),
('JP', 'Japan', 3),
('KR', 'South Korea', 3),
('AE', 'UAE', 4),
('SA', 'Saudi Arabia', 4),
('ZA', 'South Africa', 4),
('EG', 'Egypt', 4),
('ES', 'Spain', 1),
('MX', 'Mexico', 2),
('AU', 'Australia', 3),
('SG', 'Singapore', 3),
('NG', 'Nigeria', 4),
('TR', 'Turkey', 4);

-- Q13: Insert Locations
INSERT INTO locations (street_address, postal_code, city, state_province, country_id) VALUES
('Street 1', '10001', 'New York', 'NY', 'US'),
('Street 2', '560001', 'Bangalore', 'KA', 'IN'),
('Street 3', '75001', 'Paris', 'Ile-de-France', 'FR'),
('Street 4', '10115', 'Berlin', 'Berlin', 'DE'),
('Street 5', '2000', 'Sydney', 'NSW', 'AU');

-- Q14: Insert Departments
INSERT INTO departments VALUES
(10, 'Administration', NULL, 1),
(20, 'Marketing', NULL, 2),
(30, 'IT', NULL, 2),
(40, 'Human Resources', NULL, 3),
(50, 'Sales', NULL, 1),
(60, 'Finance', NULL, 4);

-- Q15: Insert Jobs
INSERT INTO jobs VALUES
(1, 'President', 20000, 50000),
(2, 'Vice President', 15000, 30000),
(3, 'Manager', 8000, 20000),
(4, 'Programmer', 4000, 10000),
(5, 'Accountant', 4000, 9000),
(6, 'Clerk', 2000, 5000);

-- Q16 & Q17: Insert Employees (Hierarchy)
INSERT INTO employees VALUES
(1, 'John', 'Smith', 'john@example.com', '1234567890', '2020-01-01', 1, 40000, NULL, NULL, 10),
(2, 'David', 'Lee', 'david@example.com', '1234567891', '2021-02-01', 2, 25000, NULL, 1, 20),
(3, 'Alice', 'Brown', 'alice@example.com', '1234567892', '2022-03-01', 3, 15000, NULL, 2, 30),
(4, 'Bob', 'White', 'bob@example.com', '1234567893', '2022-04-01', 4, 8000, NULL, 3, 30),
(5, 'Emma', 'Green', 'emma@example.com', '1234567894', '2023-01-01', 5, 7000, NULL, 3, 60);

-- Q18: Insert Job History
INSERT INTO job_history VALUES
(3, '2021-01-01', '2022-01-01', 4, 20),
(4, '2021-06-01', '2022-06-01', 6, 50),
(5, '2022-01-01', '2023-01-01', 5, 40);