CREATE TABLE Owner(
	ID SERIAL PRIMARY KEY,
	name_owner VARCHAR(100)
);

CREATE TABLE Vehicle(
	ID SERIAL PRIMARY KEY,
	name_vehicle VARCHAR(100),
	engine DOUBLE PRECISION,
	number_of_wheels DOUBLE PRECISION,
    length_of_stay DATE
);

INSERT INTO Owner(name_owner)
VALUES ('Przemek');

INSERT INTO Owner(name_owner)
VALUES ('Tomek');

INSERT INTO Owner(name_owner)
VALUES ('Jurek');

INSERT INTO Owner(name_owner)
VALUES ('Kamil');

INSERT INTO Owner(name_owner)
VALUES ('Karol');

INSERT INTO Owner(name_owner)
VALUES ('Benjamin');

INSERT INTO Owner(name_owner)
VALUES ('Blazej');

INSERT INTO Owner(name_owner)
VALUES ('Lucjan');

INSERT INTO Owner(name_owner)
VALUES ('Karolina');

INSERT INTO Owner(name_owner)
VALUES ('Beata');

INSERT INTO Owner(name_owner)
VALUES ('Kaziu');

INSERT INTO vehicle(name_vehicle, engine, number_of_wheels, length_of_stay)
VALUES ('Skoda', 74.15, 4, '2023-03-21');

INSERT INTO vehicle(name_vehicle, engine, number_of_wheels, length_of_stay)
VALUES ('Ferrari', 300, 4, '2023-02-21');

INSERT INTO vehicle(name_vehicle, engine, number_of_wheels, length_of_stay)
VALUES ('Bicycle', 0, 2, '2023-04-25');

INSERT INTO vehicle(name_vehicle, engine, number_of_wheels, length_of_stay)
VALUES ('Bicycle2', 0, 2, '2023-03-30');

INSERT INTO vehicle(name_vehicle, engine, number_of_wheels, length_of_stay)
VALUES ('Porshe', 174.15, 4, '2023-04-11');

CREATE TABLE owner_vehicle(
	owner_id INT,
	vehicle_id INT,
	FOREIGN KEY (owner_id) REFERENCES owner(id),
	FOREIGN KEY (vehicle_id) REFERENCES vehicle(id)
);

INSERT INTO owner_vehicle(owner_id, vehicle_id)
VALUES (11, NULL);

SELECT * FROM vehicle;
SELECT * FROM owner;
SELECT * FROM owner_vehicle;

--Ile jest właścicieli, którzy nie mają żadnego pojazdu
SELECT COUNT(*) AS OWNERS_WITHOUT_A_CAR FROM owner_vehicle
where vehicle_id IS NULL;

--Wyświetl pojazdy, które mają więcej niż jednego właściciela
SELECT v.name_vehicle, COUNT(ov.vehicle_id)
FROM owner_vehicle ov
INNER JOIN Vehicle v ON v.id = ov.vehicle_id
GROUP BY v.name_vehicle
HAVING COUNT(ov.vehicle_id) > 5;

--Wyswietl istniejące w bazie typy pojazdów posortowane alfabetycznie
SELECT * from vehicle
ORDER BY name_vehicle;

--wyświetl pojazdy, które mają moc powyżej 100KM lub nie maja silnika
SELECT * from vehicle
where engine > 100;

--wyswietl pojazdy, które maja conajmniej 2 koła
SELECT * from vehicle
where number_of_wheels > 2;

--wyswietl pojazdy, ktore są w bazie dłużej niż miesiąc
SELECT * FROM vehicle
WHERE age(current_date, length_of_stay) > interval '1 month';

--Wyświetl identyfikatory pojazdów, których właściciel ma więcej niż 3 pojazdy
SELECT v.id, COUNT(vehicle_id)
FROM owner_vehicle ov
INNER JOIN vehicle v ON ov.vehicle_id = v.id
GROUP BY v.id
HAVING COUNT(vehicle_id) > 3;