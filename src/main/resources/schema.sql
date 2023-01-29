create table books(
id bigint not null,
name varchar(255) not null,
author varchar(255) not null,
primary key(id)

);

insert into books (id, name, author) values (1,'rawendra-the-great','rawi');
insert into books (id, name, author) values (2,'harry-potter ','jk-rowling');	
insert into books (id, name, author) values (3,'da-vinci-code','dan-brown');