create table CLIENTE(
id_cliente integer primary key auto_increment,
nombre varchar(100),email varchar(100),
paterno varchar(100));

create table TARJETA(
id_tarjeta integer primary key auto_increment,
id_cliente integer,
nombre_tarjeta varchar(100),
saldo float,numero_tarjeta integer,
foreign key(id_cliente) references CLIENTE(id_cliente));

create table RESERVACION(
id_reservacion integer primary key auto_increment,
id_cliente integer, id_tarjeta integer,
ciudad_destino varchar(128),
foreign key(id_cliente) references CLIENTE(id_cliente),
foreign key(id_tarjeta) references TARJETA(id_tarjeta));

SELECT * FROM RESERVACION;

