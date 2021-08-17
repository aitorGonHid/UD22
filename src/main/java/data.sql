CREATE DATABASE IF NOT EXISTS 'UD22_MVC';
USE 'DU22_MVC';

DROP TABLE IF EXISTS 'clientes';

CREATE TABLE 'clientes'( 
    'id' int NOT NULL AUTO_INCREMENT,
    'nombre' varchar(250) DEFAULT NULL,
    'apellido' varchar(250) DEFAULT NULL,
    'direccion' varchar(250) DEFAULT NULL,
    'dni' int DEFAULT NULL,
    'fecha' date DEFAULT NULL,
    PRIMARY KEY ('id')
);

--Datos

INSERT INTO clientes(nombre, apellido, direccion, dni, fecha) 
VALUES ('aitor', 'Gonzalez', 'calle imaginaria 1', '33333333', NOW());
INSERT INTO clientes(nombre, apellido, direccion, dni, fecha) 
VALUES ('Raimon', 'Beren', 'calle casstillo 2', '444444444', NOW());
INSERT INTO clientes(nombre, apellido, direccion, dni, fecha) 
VALUES ('Paula', 'Recalde', 'Port aventura 15', '99999999', NOW());