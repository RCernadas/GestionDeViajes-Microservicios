DROP DATABASE IF EXISTS hotel;
CREATE DATABASE hotel;
USE hotel;


CREATE TABLE hotel(
id_hotel INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50),
categoria ENUM ('UNA', 'DOS', 'TRES', 'CUATRO', 'CINCO'),
precio DOUBLE,
disponible BOOLEAN
);

-- Insertar datos en la tabla hotel
INSERT INTO hotel (nombre, categoria, precio, disponible) VALUES 
('Hotel Sol', 'TRES', 80.00, TRUE),
('Grand Palace', 'CINCO', 200.00, TRUE),
('Econotel', 'DOS', 45.00, FALSE),
('Hotel Maravilla', 'CUATRO', 150.00, TRUE),
('Hotel Paraíso', 'CINCO', 250.00, TRUE),
('Posada La Bella', 'TRES', 75.00, TRUE),
('Hostal Estrella', 'UNA', 30.00, FALSE),
('Resort Playa', 'CUATRO', 180.00, TRUE),
('Motel Rápido', 'DOS', 40.00, TRUE),
('Hotel Central', 'TRES', 90.00, FALSE),
('Hotel Lujo', 'CINCO', 300.00, TRUE),
('Villa Encanto', 'CUATRO', 140.00, TRUE),
('Pensión Amiga', 'UNA', 25.00, TRUE),
('Suites del Sol', 'CUATRO', 160.00, FALSE),
('Hotel Serenidad', 'TRES', 85.00, TRUE);

