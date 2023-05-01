--2h...
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

SELECT o.name_owner, v.name_vehicle, v.engine
FROM owner_vehicle ov
INNER JOIN Owner o ON o.id = ov.owner_id
INNER JOIN Vehicle v ON v.id = ov.vehicle_id;