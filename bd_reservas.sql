DROP DATABASE IF EXISTS reserva;
CREATE DATABASE reserva;
USE reserva;

CREATE TABLE reserva(
id_reserva INT PRIMARY KEY AUTO_INCREMENT,
nombre_cliente VARCHAR(50),
dni VARCHAR(9),
id_hotel INT,
id_vuelo INT
);

INSERT INTO reserva (nombre_cliente, dni, id_hotel, id_vuelo) VALUES 
('Juan Pérez', '12345678A', 1, 1),
('María López', '23456789B', 2, 2),
('Carlos García', '34567890C', 3, 3),
('Ana Martínez', '45678901D', 4, 4),
('José Fernández', '56789012E', 5, 5),
('Laura Gómez', '67890123F', 6, 6),
('Pedro Sánchez', '78901234G', 7, 7),
('Sofía Ramírez', '89012345H', 8, 8),
('Miguel Torres', '90123456I', 9, 9),
('Elena Ruiz', '01234567J', 10, 10),
('Luis Herrera', '12345098K', 11, 11),
('Isabel Díaz', '23456109L', 12, 12),
('Antonio Morales', '34567210M', 13, 13),
('Carmen Navarro', '45678321N', 14, 14),
('Francisco Vega', '56789432O', 15, 15),
('Alicia Castillo', '67890543P', 1, 1),
('Javier Ramos', '78901654Q', 2, 7),
('Patricia Silva', '89012765R', 3, 8),
('David Ortiz', '90123876S', 4, 9),
('Teresa Romero', '01234987T', 5, 2),
('Ricardo Mendoza', '12345098U', 6, 1),
('Gabriela Ponce', '23456109V', 7, 2),
('Andrés Nieto', '34567210W', 8, 3),
('Lucía Vargas', '45678321X', 9, 4),
('Marta Peña', '56789432Y', 10, 5);
