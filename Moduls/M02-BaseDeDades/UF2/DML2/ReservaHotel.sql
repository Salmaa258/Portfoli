CREATE DATABASE ReservaHotel;

use ReservaHotel;

create table cliente (
DNI varchar (9) primary key,
nombre varchar(20),
apellido varchar (20),
telefono int(9),
direccion varchar(40),
id_reserva int,
foreign key (id_reserva) references reserva(id_reserva)
);

insert into cliente (DNI, nombre, apellido, telefono, direccion) values ('45667743R', 'Marta', 'Lopez', 657849374, 'C/AvenidaBellota');
insert into cliente (DNI, nombre, apellido, telefono, direccion) values ('46573827F', 'Lucia', 'Gomez', 675849279, 'C/AvenidaAvellana');
insert into cliente (DNI, nombre, apellido, telefono, direccion) values ('47583836U', 'Pau', 'Gonzalez', 683937492, 'C/AvenidaCastaña');
insert into cliente (DNI, nombre, apellido, telefono, direccion) values ('46589202I', 'Pablo', 'Garcia', 675849382, 'C/AvenidaNuez');
insert into cliente (DNI, nombre, apellido, telefono, direccion) values ('46289472N', 'Andrew', 'Lopez', 615263849, 'C/AvenidaPistacho');

alter table cliente modify direccion varchar(30);
update cliente set telefono=675829384 where DNI='46573827F';
update cliente set apellido='Garcia' where DNI='45667743R';
update cliente set telefono=675829384 where DNI='46573827F';

create table habitaciones (
num_hab int primary key,
tipo_hab varchar (20)
);
insert into habitaciones(num_hab, tipo_hab) values (1, 'lujo');
insert into habitaciones(num_hab, tipo_hab) values (2, 'lujo');
insert into habitaciones(num_hab, tipo_hab) values (3, 'normal');
insert into habitaciones(num_hab, tipo_hab) values (4, 'normal');
insert into habitaciones(num_hab, tipo_hab) values (5, 'normal');

update habitaciones set tipo_hab='lujo' where num_hab=3;
alter table habitaciones modify tipo_hab varchar(6);

create table reserva (
id_reserva int primary key,
precio int,
fecha date,
hora time,
tipo_reserva varchar (20),
num_hab_reservadas int,
DNI_cliente varchar(9),
num_hab int,
foreign key (DNI_cliente) references cliente(DNI),
foreign key (num_hab) references habitaciones(num_hab)
);

insert into reserva(id_reserva, precio, fecha, hora, tipo_reserva, num_hab_reservadas) values (001, 60, 20200723, '14:50', 'normal', 1); 
insert into reserva(id_reserva, precio, fecha, hora, tipo_reserva, num_hab_reservadas) values (002, 60, 20200803, '11:30', 'normal', 2); 
insert into reserva(id_reserva, precio, fecha, hora, tipo_reserva, num_hab_reservadas) values (003, 120, 20200812, '18:20', 'lujo', 3); 
insert into reserva(id_reserva, precio, fecha, hora, tipo_reserva, num_hab_reservadas) values (004, 120, 20200818, '17:10', 'lujo', 4); 
insert into reserva(id_reserva, precio, fecha, hora, tipo_reserva, num_hab_reservadas) values (005, 60, 20200915, '13:40', 'normal', 5); 

update reserva set precio=110 where id_reserva=003;
update reserva set precio=110 where id_reserva=004;

alter table reserva modify tipo_reserva varchar(6);
alter table reserva modify id_reserva integer(3);