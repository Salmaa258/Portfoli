use ReservaHotel;

/*1*/ select nombre from cliente where apellido not in (select apellido from cliente where apellido='Lopez');

/*2*/ select distinct c.DNI from cliente c, reserva r where r.tipo_reserva in (select tipo_reserva from reserva where tipo_reserva='normal');

/*3*/ select count(num_hab) from habitaciones where tipo_hab='Lujo' group by tipo_hab;

/*4*/ select distinct nombre from cliente, reserva where precio<=115
UNION
/*4*/ select distinct nombre from cliente, reserva where precio<=115;

/*5*/ select distinct nombre, apellido from cliente, reserva where hora not in (select hora from reserva where hora>'15:00') ;

/*6*/ select nombre from cliente where telefono not in (select telefono from cliente where telefono=675849279);

/*7*/ select count(num_hab), tipo_hab from habitaciones group by tipo_hab;

/*8*/ select sum(num_hab_reservadas) from reserva;

/*9*/ select sum(precio), tipo_reserva from reserva group by tipo_reserva;

/*10*/ select nombre, apellido, direccion, telefono from cliente, reserva where fecha in (select fecha from reserva where fecha=20200818);

