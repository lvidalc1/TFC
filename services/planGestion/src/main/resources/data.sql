drop table if exists usuario_categoria;
drop table if exists movimientos;
drop table if exists cuentas;
drop table if exists categorias;
drop table if exists usuarios;

CREATE TABLE usuarios (
	nif varchar(9) PRIMARY KEY NOT NULL,
    pin varchar(6) NOT NULL,
    nombre varchar(50) not null,
    apel1 varchar(50) not null,
    apel2 varchar(50) not null,
    direccion varchar(100) not null,
    correo varchar(80) not null
);

create table categorias(
	id_cat int primary key not null,
	nombre varchar(50) not null
);

create table cuentas(
	iban varchar(24) primary key,
	num_cuenta varchar(15) not null,
	nif_usuario varchar(9),
	saldo decimal(10,2) not null
);

create table movimientos(
	id_mov int primary key auto_increment,
	fecha timestamp default current_timestamp,
	importe decimal(10,2),
	reintegro decimal(10,2),
	saldo_actual decimal(10,2) not null,
	iban_cuenta varchar(24)
);

create table usuario_categoria(
	id_uc int primary key auto_increment,
	nif_usuario varchar(9) not null,
	id_categoria int not null,
	presupuesto decimal(10,2) not null,
	frecuencia varchar(50) not null
);


alter table cuentas add constraint fk_nif_cuenta foreign key (nif_usuario) references usuarios(nif);

alter table movimientos add constraint fk_iban_mov foreign key(iban_cuenta) references cuentas (iban);
/*alter table movimientos add constraint fk_idcat_mov foreign key (id_categoria) references categorias(idCat);*/


alter table usuario_categoria add constraint fk_iban_usuario_cat foreign key (nif_usuario) references usuarios(nif);
alter table usuario_categoria add constraint fk_idcat_usuario_cat foreign key (id_categoria) references categorias(id_cat);

/*inserciones tablas usuarios*/
/*INSERT INTO usuarios (nif, pin) VALUES ('11111111A', '123456');
INSERT INTO usuarios (nif, pin) VALUES ('22222222B', '654321');
INSERT INTO usuarios (nif, pin) VALUES ('33333333C', '456789');
INSERT INTO usuarios (nif, pin) VALUES ('44444444D', '987654');
INSERT INTO usuarios (nif, pin) VALUES ('55555555E', '304050');
INSERT INTO usuarios (nif, pin) VALUES ('66666666F', '102030');*/

INSERT INTO usuarios (nif, pin, nombre, apel1, apel2, direccion, correo) 
VALUES ('11111111A', '123456', 'Pepe', 'López', 'Fernández', 'Juan Flórez', 'pepe@gmail.com');
INSERT INTO usuarios (nif, pin, nombre, apel1, apel2, direccion, correo) 
VALUES ('22222222B', '654321', 'Paco', 'Pérez', 'Gömez', 'Ramón y Cajal', 'paco@gmail.com');


/*inserciones tabla cuentas*/
insert into cuentas(iban, num_cuenta, nif_usuario, saldo) values('es111111111111111111', '111111111111', '11111111A', 36985);
insert into cuentas(iban, num_cuenta, nif_usuario, saldo) values('es222222222222222222', '222222222222', '22222222B', 61893);


/*inserciones tabla categorias*/
insert into categorias (id_cat, nombre) values(1, 'Pagos y efectivo');
insert into categorias (id_cat, nombre) values(2, 'Suministros');
insert into categorias (id_cat, nombre) values(3, 'Impuestos');
insert into categorias (id_cat, nombre) values(4, 'Vivienda');
insert into categorias (id_cat, nombre) values(5, 'Alimentación');
insert into categorias (id_cat, nombre) values(6, 'Transporte');
insert into categorias (id_cat, nombre) values(7, 'Ocio');
insert into categorias (id_cat, nombre) values(8, 'Salud');
insert into categorias (id_cat, nombre) values(9, 'Ahorro');


/*inserciones tabla movimientos*/
insert into movimientos (importe, saldo_actual, iban_cuenta) values (80.5, 500, 'es111111111111111111');
insert into movimientos (reintegro, saldo_actual, iban_cuenta) values (40, 700, 'es222222222222222222');


/*inserciones tabla cuenta_categoria*/
insert into usuario_categoria (nif_usuario, id_categoria, presupuesto, frecuencia) values ('11111111A', 1, '1000', 'Anual');
insert into usuario_categoria (nif_usuario, id_categoria, presupuesto, frecuencia) values ('22222222B', 3, '300', 'Mensual');


