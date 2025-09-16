create database companyDb;
use companyDb;
CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);
INSERT INTO Department (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'IT'),
(4, 'Sales');

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE,
    dept_id INT,
    manager_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id),
    FOREIGN KEY (manager_id) REFERENCES Employee(emp_id)
);

INSERT INTO Employee (emp_id, first_name, last_name, salary, hire_date, dept_id, manager_id) VALUES
(101, 'John', 'Doe', 60000, '2022-01-10', 3, NULL),       -- Manager in IT
(102, 'Jane', 'Smith', 50000, '2022-03-15', 3, 101),     -- Reports to John
(103, 'Mike', 'Brown', 40000, '2022-05-20', 2, NULL),    -- Manager in Finance
(104, 'Sara', 'Davis', 35000, '2023-01-10', 2, 103),     -- Reports to Mike
(105, 'Tom', 'Wilson', 45000, '2023-03-25', 1, NULL),    -- Manager in HR
(106, 'Anna', 'Lee', 30000, '2023-06-15', 1, 105),       -- Reports to Tom
(107, 'Chris', 'Taylor', 70000, '2021-09-01', 4, NULL),  -- Manager in Sales
(108, 'Emma', 'White', 38000, '2023-08-05', 4, 107),     -- Reports to Chris
(109, 'David', 'Clark', 48000, '2023-07-12', 3, 101),    -- Reports to John
(110, 'Sophia', 'Hall', 52000, '2022-11-11', 2, 103);    -- Reports to Mike

CREATE TABLE Project (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50),
    start_date DATE,
    end_date DATE
);
INSERT INTO Project (project_id, project_name, start_date, end_date) VALUES
(201, 'Website Redesign', '2023-01-01', '2023-06-30'),
(202, 'Payroll System', '2023-02-15', '2023-08-15'),
(203, 'Mobile App', '2023-03-01', NULL),
(204, 'Marketing Campaign', '2023-05-10', '2023-12-31');

CREATE TABLE Employee_Project (
    emp_id INT,
    project_id INT,
    PRIMARY KEY (emp_id, project_id),
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id),
    FOREIGN KEY (project_id) REFERENCES Project(project_id)
);
INSERT INTO Employee_Project (emp_id, project_id) VALUES
(101, 201),
(102, 201),
(109, 202),
(103, 202),
(110, 202),
(104, 202),
(107, 204),
(108, 204),
(106, 203),
(105, 203);


-- GET ALL THE EMPLOYEES -- 
select * from Employee;

-- Show first name and salary of employees.-- 
select first_name , salary from Employee;

-- Show employees from IT department --
select e.first_name , e.last_name , d.dept_name 
from Employee as e 
join Department as d on d.dept_id = e.dept_id
where dept_name='IT';

-- . Show employees hired after Jan 1, 2023.

select first_name, last_name from Employee 
where hire_date > '2023-01-01';

-- Count employees in each department.

select d.dept_name , count(*) as Employee_count
from Employee as e 
join Department as d on e.dept_id =d.dept_id
group by d.dept_name;

-- Find average salary per department.

select d.dept_name, avg(e.salary) as Avg_Salary 
from Employee as e 
join Department as d on d.dept_id=e.dept_id
group by d.dept_name;


-- Departments with more than 2 employees.
select d.dept_name , count(*) 
from Employee as e 
join department as d on d.dept_id=e.dept_id 
group by d.dept_name
having count(*) > 2;

-- Show employee names and their manager names.
select e.first_name as Employee , m.first_name as Manager 
from Employee as e 
left join Employee as m on e.manager_id=m.emp_id;

-- Employees earning more than their managers
select e.first_name as Employee_name, e.salary , m.first_name as manager , m.salary as managerSalary 
from employee as e 
join employee as m on e.manager_id=m.emp_id 
where e.salary > m.salary;

-- -second largest salary-- - 
select max(salary) 
from Employee 
where salary < (
 select max(salary) from Employee
);

 select max(salary) from Employee;
 
--  show top three paid employee-- 
select first_name, salary from employee 
order by salary desc 
limit 3 ;

-- Show projects with more than 2 employees assigned

select * from Employee where manager_id is null;

select dept_id , max(salary) as highestSalary
from Employee
group by dept_id;