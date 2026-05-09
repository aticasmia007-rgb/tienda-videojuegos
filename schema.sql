-- BBDD
DROP DATABASE IF EXISTS tiendavideojuegos;
CREATE DATABASE tiendavideojuegos;
USE tiendavideojuegos;

-- USER
CREATE USER IF NOT EXISTS 'userandrea'@'%' IDENTIFIED BY 'pwd';
GRANT ALL PRIVILEGES ON tiendavideojuegos.* TO 'userandrea'@'%';

-- Tables
CREATE TABLE IF NOT EXISTS clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50),
    correo VARCHAR(100) UNIQUE NOT NULL,
    puntos_fidelidad INT DEFAULT 0,
    fecha_nacimiento DATE,
    telefono_contacto VARCHAR(15),
    fecha_alta DATE,
    codigo_postal VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS juegos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    genero VARCHAR(50),
    plataforma VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL,
    stock INT DEFAULT 0
);