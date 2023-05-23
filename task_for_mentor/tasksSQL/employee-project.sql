CREATE TABLE Employess (
	employee_id SERIAL PRIMARY KEY,
    name VARCHAR(50),
	position  VARCHAR(50),
	department  VARCHAR(50)
)
INSERT INTO Employess(name, position, department)
VALUES('John Smith', 'Senior Developer', 'IT');

INSERT INTO Employess(name, position, department)
VALUES ('Anna Johnson', 'HR Manager', 'HR');

INSERT INTO Employess(name, position, department)
VALUES ('Peter Wilson', 'Analyst', 'Finance');

INSERT INTO Employess(name, position, department)
VALUES ('Lisa Davis', 'Project Manager', 'IT');

INSERT INTO Employess(name, position, department)
VALUES ('Mark Johnson', 'QA Engineer', 'IT');

CREATE TABLE Projects (
	project_id SERIAL PRIMARY KEY,
	project_name VARCHAR(50),
	start_date DATE,
	end_date DATE,
	assigned_to INT,
	FOREIGN KEY (assigned_to) REFERENCES Employess(employee_id)
)

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project A', '2023-01-15', '2023-02-28', 1);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project B', '2023-02-01', '2023-03-31', 3);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project C', '2023-03-10', '2023-04-30', 2);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project D', '2023-04-01', '2023-05-31', 4);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project E', '2023-05-01', '2023-06-30', 5);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project F', '2023-04-03', '2023-04-8', 5);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project G', '2023-04-03', '2023-04-8', 3);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project H', '2022-04-03', '2023-04-8', 1);

INSERT INTO Projects (project_name, start_date, end_date, assigned_to)
VALUES ('Project I', '2022-03-03', '2023-05-8', 1);

SELECT * FROM Employess;
SELECT * FROM Projects;

--Zwróć wszystkie projekty, które zostały przypisane do pracownika o imieniu "John Smith".
SELECT project_name FROM Projects
WHERE assigned_to IN (SELECT employee_id FROM Employess WHERE name = 'John Smith');
--Znajdź pracowników, którzy zostali przypisani do co najmniej jednego projektu o nazwie zaczynającej się na "Project"
SELECT e.name FROM Employess e
INNER JOIN Projects p ON p.assigned_to = e.employee_id
WHERE p.project_name LIKE 'Project_%';

--Oblicz liczbę projektów, które są przypisane do każdego działu.
--Znajdź projekty, które mają datę zakończenia przed 2023-05-01 i zostały przypisane do pracownika o stanowisku "Senior Developer".
--Zwróć sumę czasu trwania (w dniach) wszystkich projektów.