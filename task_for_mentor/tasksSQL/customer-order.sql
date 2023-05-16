CREATE TABLE Customers(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100),
	city VARCHAR(100)
)

SELECT * FROM Customers;
SELECT * FROM Orders;



CREATE TABLE Orders(
	id SERIAL PRIMARY KEY,
	id_customer INT,
	O_DATE DATE,
	total_amount INT,
	FOREIGN KEY (id_customer) REFERENCES Customers(id)
)

INSERT INTO Customers(name, city)
VALUES('Tomek', 'Warszawa');

INSERT INTO Customers(name, city)
VALUES('Blazej', 'Krakow');

INSERT INTO Customers(name, city)
VALUES('Tobiasz', 'Granowiec');

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(1, '2023-01-01', 1000);

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(1, '2023-03-01', 2000);

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(1, '2023-03-03', 3000);

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(2, '2023-02-03', 4000);

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(3, '2023-02-08', 4000);

INSERT INTO Orders(id_customer, O_DATE, total_amount)
VALUES(3, '2023-03-08', 8000);

--Twoje zadanie polega na napisaniu zapytania SQL, które zwróci imię i miasto klienta, którego łączna suma zamówień jest największa.
SELECT c.name, c.city
FROM Orders o
INNER JOIN Customers c ON o.id_customer = c.id
GROUP BY c.name, c.city
ORDER BY SUM(total_amount) DESC
LIMIT 1;