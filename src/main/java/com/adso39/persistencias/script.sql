DROP DATABASE IF EXISTS  ususarios_db;

CREATE DATABASE  usuarios_db;

USE usuarios_db;

CREATE TABLE  usuario (
    identificacion VARCHAR(20) PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    indiceCargo INT NOT NULL,
    textoCargo VARCHAR(100) NOT NULL,
    esAdministrador BOOLEAN NOT NULL
);
