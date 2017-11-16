

-- Falta modifica la ultima parte tablas : infnutricional, detplan, detnutricional



-- =============================================
-- Creación de la Base de Datos
-- =============================================

DROP DATABASE IF EXISTS gym;

CREATE DATABASE gym;


-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE gym;
SET NAMES 'utf8';

create table cargo(
IdCargo char(5) primary key,
Descripcion varchar(50));

create table Empleado(
IdEmpleado char(5) primary key,
IdCargo char(5),
Nombre varchar(50),
Apellido varchar(50),
DNI varchar(8),
Direccion varchar(100),
Telefono int,
Correo varchar(100),
Estado varchar(10),
foreign key (IdCargo) references Cargo (IdCargo));

create table Socio(
IdSocio char(6) primary key,
IdEmpleado char(5),
Nombre varchar(50),
Apellido varchar(50),
DNI varchar(8),
Telefono int,
Email varchar(100),
F_Inscripcion date,
Estado varchar(10),
foreign key (IdEmpleado) references Empleado (IdEmpleado));

create table usuario(
IdUsuario char(5) primary key,
IdEmpleado char(5),
user varchar(30),
pass varchar(40),
foreign key (IdEmpleado) references Empleado (IdEmpleado));

create table Promociones(
IdPromociones char(5) primary key,
IdEmpleado char(5),
NombrePromocion varchar(50),
Importe decimal(8,2),
Descripcion varchar(50),
foreign key (IdEmpleado) references Empleado (IdEmpleado));

create table Planes(
IdPlan char(5) primary key,
IdEmpleado char(5),
NombrePlan varchar(50),
Nro_Meses int,
Importe decimal(8,2),
Estado varchar(10),
foreign key (IdEmpleado) references Empleado (IdEmpleado));

create table Pagos(
IdPago char(8) primary key,
IdSocio char(5),
Tipo_de_Pago varchar(20),
IGV decimal(8,2),
Subtotal decimal(8,2),
Total decimal(8,2),
NroCuotas int,
Estado varchar(10)
);

create table DetPagos(
IdPago char(8),
IdEmpleado char(5),
NroCuota varchar(3),
Importe decimal(8,2),
F_UPago date,
Estado varchar(10),
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdPago) references Pagos (IdPago));

create table Membresia(
IdMenbresia char (8) primary key,
IdSocio char(6),
IdEmpleado char(5),
IdPlan char(5),
IdPromociones char(5),
IdPago char(8),
F_Inicio date,
F_Fin date,
Estado varchar(10),
foreign key (IdSocio) references Socio (IdSocio),
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdPlan) references Planes (IdPlan),
foreign key (IdPromociones) references Promociones (IdPromociones),
foreign key (IdPago) references Pagos (IdPago));

create table TipoEjercicio(
IdTipo char(5) primary key,
TipoEjercicio varchar(50));

create table Ejercicio(
IdPlanE char(5) primary key,
IdTipo char(5),
Ejercicio varchar(50),
foreign key(IdTipo) references TipoEjercicio(IdTipo));

create table PlanEntrenamiento(
IdPlanEntrenamiento char(8) primary key,
IdEmpleado char(5),
IdMenbresia char(8),
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdMenbresia) references Membresia (IdMenbresia));

create table DetPlanEntrenamiento(
IdPlanEntrenamiento char(8),
IdPlanE char(5),
N_Maquina int,
Serie int,
Repeticiones int,
foreign key (IdPlanEntrenamiento) references PlanEntrenamiento (IdPlanEntrenamiento),
foreign key (IdPlanE) references Ejercicio (IdPlanE));

create table InfNutricional(
IdInfNutricional char(8) primary key,
IdEmpleado char(5),
IdSocio char(6),
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdSocio) references Socio (IdSocio));

create table DetNutricional(
IdInfNutricional char(8),
Fecha date,
Peso decimal(3,2),
IMC decimal(3,2),
Masa_Grasa decimal(3,2),
Cuello decimal(3,2),
Hombros decimal(3,2),
Brazos_Antebrazos decimal(3,2),
Pecho_Busto decimal(3,2),
Cintura decimal(3,2),
CaderaAlta decimal(3,2),
Gluteos decimal(3,2),
Muslo decimal(3,2),
Pantorrillas decimal(3,2),
foreign key (IdInfNutricional) references InfNutricional (IdInfNutricional));



-- --Valores Cargo


insert into cargo (IdCargo,Descripcion) values ('C0001','Administrador');
insert into cargo (IdCargo,Descripcion) values ('C0002','Asistente');
insert into cargo (IdCargo,Descripcion) values ('C0003','Cajero');
insert into cargo (IdCargo,Descripcion) values ('C0004','Nutrionista');
insert into cargo (IdCargo,Descripcion) values ('C0005','Evaluador');

-- Valores Empleado

insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0001','C0001','Jorge','Prieto','71062405','VMT','9229310989','prietoramosjorge@gmail.com','Activo');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0002','C0002','Brayan','Moscoso','45632589','1ERA PRO','945632581','brianmoscoso@gmail.com','Activo');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0003','C0003','Carlos','Castro','45879632','Ate','985623574','castrocarlos@gmail.com','Activo');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0004','C0004','Fernando','Casas','69851687','Ate','998613458','Casasfernando@gmail.com','Activo');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0005','C0005','Jann','Sajami','45699872','Ate','989496782','sajamijann@gmail.com','Activo');

-- Valores Socio

insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S00001','E0002','Deivy','Prieto','45623598','9229310989','prietodeivy@gmail.com','2017/06/10','Activo');
insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S00002','E0002','Johan','Alba','369852679','998649712','albajohan@gmail.com','2017/06/20','Activo');
insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S00003','E0002','Jeinz','Felix','65823147','99963125','felixjeinz@gmail.com','2017/06/07','Activo');

-- Valores Usuario

insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0001','E0001','jorge',SHA('prieto'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0002','E0002','brayan',SHA('moscoso'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0003','E0003','carlos',SHA('castro'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0004','E0004','fernando',SHA('casas'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0005','E0005','jann',SHA('sajami'));

-- Valores Promociones

insert into Promociones (IdPromociones,IdEmpleado,NombrePromocion,Importe,Descripcion) values ('P0001','E0001','Sin Promocion','0.00','Plan sin promocion.');
insert into Promociones (IdPromociones,IdEmpleado,NombrePromocion,Importe,Descripcion) values ('P0002','E0001','2x1','150.00','Pagando 2 meses pagas 1');
insert into Promociones (IdPromociones,IdEmpleado,NombrePromocion,Importe,Descripcion) values ('P0003','E0001','50% a socios antiguos','75.00','A socios que lleven mas de 3 meses pagaran mitad precio');


-- Valores Planes

insert into Planes (IdPlan,IdEmpleado,NombrePlan,Nro_Meses,Importe,Estado) values ('PLA01','E0001','Plan Normal 1 mes','1','150.00','Activo');
insert into Planes (IdPlan,IdEmpleado,NombrePlan,Nro_Meses,Importe,Estado) values ('PLA02','E0001','Plan Normal 2 meses','2','300.00','Activo'); 

-- Valores Pagos

insert into Pagos (IdPago,IdSocio,Tipo_de_Pago,IGV,Subtotal,Total,NroCuotas,Estado) values ('PA000001','S00001','Contado','22.88','127.12','150.00','1','Cancelado');
insert into Pagos (IdPago,IdSocio,Tipo_de_Pago,IGV,Subtotal,Total,NroCuotas,Estado) values ('PA000002','S00002','Contado','45.76','254.24','300.00','2','Cancelado');


-- Valores DetPagos

insert into DetPagos (IdPago,IdEmpleado,NroCuota,Importe,F_UPago,Estado) values ('PA000001','E0003','1','150.00','2017/09/11','Cancelado');
insert into DetPagos (IdPago,IdEmpleado,NroCuota,Importe,F_UPago,Estado) values ('PA000002','E0003','1','150.00','2017/10/11','Cancelado');
insert into DetPagos (IdPago,IdEmpleado,NroCuota,Importe,F_UPago,Estado) values ('PA000002','E0003','2','150.00','2017/10/01','Pendiente');


-- Valores Menbresia

insert into Membresia (IdMenbresia,IdSocio,IdEmpleado,IdPlan,IdPromociones,IdPago,F_Inicio,F_Fin,Estado) values ('ME000001','S00001','E0002','PLA01','P0001','PA000001','2017/09/11','2017/10/11','Culminado');
insert into Membresia (IdMenbresia,IdSocio,IdEmpleado,IdPlan,IdPromociones,IdPago,F_Inicio,F_Fin,Estado) values ('ME000002','S00002','E0002','PLA02','P0001','PA000002','2017/09/11','2017/11/11','Culminado');


-- Valores TipoEjercicio

insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ01','Pectorales');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ02','Piernas');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ03','Triceps');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ04','Biceps');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ05','Calentamiento');

-- Valores Ejercicio

insert into Ejercicio (IdPlanE,IdTipo, Ejercicio) values ('EJ001','TEJ01','Planchas');
insert into Ejercicio (IdPlanE,IdTipo, Ejercicio) values ('EJ002','TEJ02','Bicicleta');
insert into Ejercicio (IdPlanE,IdTipo, Ejercicio) values ('EJ003','TEJ03','Planchas cruzadas');
insert into Ejercicio (IdPlanE,IdTipo, Ejercicio) values ('EJ004','TEJ04','Barras');
insert into Ejercicio (IdPlanE,IdTipo, Ejercicio) values ('EJ005','TEJ05','Trotar');

-- Valores PlanEntrenamiento

insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdMenbresia) values ('PE000001','E0005','ME000001');

-- Valores DetPlanEntrenamiento

insert into DetPlanEntrenamiento (IdPlanEntrenamiento,IdPlanE,N_Maquina,Serie,Repeticiones) values ('PE000001','EJ001','10','20','2');
insert into DetPlanEntrenamiento (IdPlanEntrenamiento,IdPlanE,N_Maquina,Serie,Repeticiones) values ('PE000001','EJ002','11','15','2');
insert into DetPlanEntrenamiento (IdPlanEntrenamiento,IdPlanE,N_Maquina,Serie,Repeticiones) values ('PE000001','EJ003','12','30','4');
insert into DetPlanEntrenamiento (IdPlanEntrenamiento,IdPlanE,N_Maquina,Serie,Repeticiones) values ('PE000001','EJ004','13','12','5');
insert into DetPlanEntrenamiento (IdPlanEntrenamiento,IdPlanE,N_Maquina,Serie,Repeticiones) values ('PE000001','EJ005','14','15','2');

-- Valores InfNutricional

insert into InfNutricional(IdInfNutricional,IdEmpleado,IdSocio) values ('IN000001','E0004','S00001');

-- Valores DetNutricional

insert into DetNutricional (IdInfNutricional,Fecha,Peso,IMC,Masa_Grasa,Cuello,Hombros,Brazos_Antebrazos,Pecho_Busto,Cintura,CaderaAlta,Gluteos,Muslo,Pantorrillas) values ('IN000001','2017/09/11','80.50','12.2','30.45','42.00','240.00','50.00','300.00','120.00','126.00','140.00','80.00','60.00');






































