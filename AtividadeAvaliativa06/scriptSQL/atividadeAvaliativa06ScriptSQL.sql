create database bdjava;
use bdjava;
create table user(
  id int not null primary key auto_increment,
  login varchar(45) not null,
  senha varchar(45) not null
);

insert into user(login, senha) values ('carlos','123');

select * from user;
