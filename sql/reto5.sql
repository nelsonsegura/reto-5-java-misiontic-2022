SHOW DATABASES;

CREATE DATABASE reto5;

use reto5;

CREATE TABLE Productos(
codigo Integer auto_increment,
nombre text,
precio real,
inventario int,
PRIMARY KEY(codigo)
);

SHOW TABLES;

SELECT * FROM Productos;

INSERT INTO Productos(nombre, precio, inventario) values ('Manzanas', 5000, 25);

INSERT INTO Productos(nombre, precio, inventario) values ('Limones', 2300, 15);

INSERT INTO Productos(nombre, precio, inventario) values ('Peras', 2700, 33);

INSERT INTO Productos(nombre, precio, inventario) values ('Arandanos', 9300, 5);

INSERT INTO Productos(nombre, precio, inventario) values ('Tomates', 2100, 42);

INSERT INTO Productos(nombre, precio, inventario) values ('Fresas', 4100, 3);

INSERT INTO Productos(nombre, precio, inventario) values ('Helado', 4500, 41);

INSERT INTO Productos(nombre, precio, inventario) values ('Galletas', 500, 8);

INSERT INTO Productos(nombre, precio, inventario) values ('Chocolates', 3500, 80);

INSERT INTO Productos(nombre, precio, inventario) values ('Jamon', 15000, 10);