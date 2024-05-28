CREATE DATABASE reservas_dni;

USE reservas_dni;

CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    documento VARCHAR(50),
    fecha VARCHAR(50),
    hora VARCHAR(50),
    cita VARCHAR(50),
    estado_pago VARCHAR(50),
    tramite VARCHAR(50),
    telefono VARCHAR(50),
    email VARCHAR(50)
);

CREATE TABLE pagos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_reserva VARCHAR(50),
    metodo_pago VARCHAR(50),
    datos_pago VARCHAR(255)
);