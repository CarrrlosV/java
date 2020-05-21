CREATE DATABASE projetofinal;
USE projetofinal;

CREATE TABLE cliente(
	idcliente INTEGER NOT NULL AUTO_INCREMENT,
	nome VARCHAR (50) NOT NULL,
	telefone VARCHAR (50) NOT NULL,
	email VARCHAR (50) NOT NULL,
	endereco VARCHAR (50) NOT NULL,
	cidade VARCHAR (50) NOT NULL,
	estado VARCHAR (50) NOT NULL,
	PRIMARY KEY (idcliente)
);

SELECT * FROM cliente;


