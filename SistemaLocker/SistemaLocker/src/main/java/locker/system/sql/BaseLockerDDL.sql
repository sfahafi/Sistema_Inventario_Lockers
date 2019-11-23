drop database if exists locker;
create database locker;
use locker;

use a19MVQ8iJ7; -- Nombre, base de datos remota. (Remotemysql.com)

drop table if exists modulos;
create table modulos(
    idModulo int auto_increment primary key,
    idTerminal int not null,
    modelo varchar(25) not null,
    nSerie varchar(25) not null,
    nBoxes enum('t2','t3','t7','t9','t16','t20','t22'),
    apertura enum('left','right')
);

drop table if exists terminales;
create table terminales(
    idTerminal int auto_increment primary key,
    idUbicacion int not null,
    nombrePc varchar(25) not null,
    tipo enum('City_Terminal','Home_Terminal','New_Modulo'),
    modelo enum('A','B','D','F','HT','M'),
    nBoxes enum('t56','t75','t60','t79','t16','t00'),
    ploteo enum('Sin_Plot','PRP','Correo','Axion','YPF')    
);

drop table if exists ubicaciones;
create table ubicaciones(
    idUbicacion int auto_increment primary key,
    provincia varchar(25) not null,
    barrio varchar(25) not null,
    direccion varchar(25) not null,
    locacion varchar(25) not null
);

alter table modulos 
    add constraint fk_modulos_terminales
    foreign key(idTerminal)
    references terminales(idTerminal);

alter table terminales 
    add constraint fk_terminales_ubicaciones
    foreign key(idUbicacion)
    references ubicaciones(idUbicacion);