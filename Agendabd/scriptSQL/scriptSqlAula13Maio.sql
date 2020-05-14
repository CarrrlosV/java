create database agendabd;
use agendabd;

create table contato(
	id int not null auto_increment,
	nome varchar(50) NOT NULL,
	telefone varchar(50) not null,
	primary key(id)
);

INSERT INTO contato(nome, telefone) VALUES 
('Carlos', '98289-6642');

INSERT INTO contato(nome, telefone) VALUES 
('Bruna', '98600-0000');