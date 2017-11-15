
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
DNI int,
Direccion varchar(100),
Telefono int,
Correo varchar(100),
Estado varchar(10),
foreign key (IdCargo) references Cargo (IdCargo));

create table Socio(
IdSocio char(5) primary key,
IdEmpleado char(5),
Nombre varchar(50),
Apellido varchar(50),
DNI int,
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
TipoPromocion varchar(50),
Importe decimal(8,2),
Descripcion varchar(50),
foreign key (IdEmpleado) references Empleado (IdEmpleado));

create table Planes(
IdPlan char(5) primary key,
IdPromociones char(5),
Tipo varchar(50),
Nro_Meses int,
Importe decimal(8,2),
Estado varchar(10),
foreign key (IdPromociones) references Promociones (IdPromociones));

create table Pagos(
IdPago char(5) primary key,
IdSocio char(5),
Tipo_de_Pago varchar(20),
Importe decimal(8,2),
Fecha date,
IGV decimal(8,2),
Subtotal decimal(8,2),
Total decimal(8,2),
NroCuotas int,
Estado varchar(10)
);

create table DetPagos(
IdPago char(5),
NroCuota varchar(3),
Importe decimal(8,2),
F_Pago date,
Estado varchar(10),
foreign key (IdPago) references Pagos (IdPago));

create table Membresia(
IdSocio char(5) primary key,
IdPlan char(5),
IdPago char(5),
F_Inicio date,
F_Fin date,
Estado varchar(10),
foreign key (IdPlan) references Planes (IdPlan),
foreign key (IdPago) references Pagos (IdPago));

create table Ejercicio(
IdPlanE char(5) primary key,
Ejercicio varchar(50));

create table TipoEjercicio(
IdTipo char(5) primary key,
TipoEjercicio varchar(50));

create table PlanEntrenamiento(
IdPlanEntrenamiento char(5) primary key,
IdEmpleado char(5),
IdPlanE char(5),
IdTipo char(5),
IdSocio char(5),
N_Maquina int,
Serie int,
Repeticiones int,
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdPlanE) references Ejercicio (IdPlanE),
foreign key (IdTipo) references TipoEjercicio (IdTipo),
foreign key (IdSocio) references Socio (IdSocio));

create table DetNutricional(
IdDetNutricional char(5) primary key,
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
Pantorrillas decimal(3,2));

create table InfNutricional(
IdInfNutricional char(5) primary key,
IdEmpleado char(5),
IdDetNutricional char(5),
IdPlanEntrenamiento char(5),
IdSocio char(5),
foreign key (IdEmpleado) references Empleado (IdEmpleado),
foreign key (IdDetNutricional) references DetNutricional (IdDetNutricional),
foreign key (IdPlanEntrenamiento) references PlanEntrenamiento (IdPlanEntrenamiento),
foreign key (IdSocio) references Socio (IdSocio));




insert into cargo (IdCargo,Descripcion) values ('C0001','Administrador');
insert into cargo (IdCargo,Descripcion) values ('C0002','Asistente');
insert into cargo (IdCargo,Descripcion) values ('C0003','Cajero');
insert into cargo (IdCargo,Descripcion) values ('C0004','Nutrionista');
insert into cargo (IdCargo,Descripcion) values ('C0005','Evaluador');

insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0001','C0001','Jorge','Prieto','71062405','VMT','9229310989','prietoramosjorge@gmail.com','');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0002','C0002','Brayan','Moscoso','45632589','1ERA PRO','945632581','brianmoscoso@gmail.com','');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0003','C0003','Carlos','Castro','45879632','Ate','985623574','castrocarlos@gmail.com','');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0004','C0004','Fernando','Casas','69851687','Ate','998613458','Casasfernando@gmail.com','');
insert into Empleado (IdEmpleado,IdCargo,Nombre,Apellido,DNI,Direccion,Telefono,Correo,Estado) values ('E0005','C0005','Jann','Sajami','45699872','Ate','989496782','sajamijann@gmail.com','');

insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S0001','E0001','Deivy','Prieto','45623598','9229310989','prietodeivy@gmail.com','2017/06/10','');
insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S0002','E0001','Johan','Alba','369852679','998649712','albajohan@gmail.com','2017/06/20','');
insert into Socio (IdSocio,IdEmpleado,Nombre,Apellido,DNI,Telefono,Email,F_Inscripcion,Estado) values ('S0003','E0001','Jeinz','Felix','65823147','99963125','felixjeinz@gmail.com','2017/06/07','');

insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0001','E0001','jorge',SHA('prieto'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0002','E0002','brayan',SHA('moscoso'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0003','E0003','carlos',SHA('castro'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0004','E0004','fernando',SHA('casas'));
insert into usuario (IdUsuario,IdEmpleado,user,pass) values ('U0005','E0005','jann',SHA('sajami'));

insert into Promociones (IdPromociones,IdEmpleado,TipoPromocion,Importe,Descripcion) values ('P0001','E0001','2x1','150.00','Pagando 2 meses pagas 1');
insert into Promociones (IdPromociones,IdEmpleado,TipoPromocion,Importe,Descripcion) values ('P0002','E0001','50% a socios antiguos','75.00','A socios que lleven mas de 3 meses pagaran mitad precio');


insert into Planes (IdPlan,IdPromociones,Tipo,Nro_Meses,Importe,Estado) values ('PLA01','P0001','Normal','2','150.00','Pendiente');
insert into Planes (IdPlan,IdPromociones,Tipo,Nro_Meses,Importe,Estado) values ('PLA02','P0001','Normal','4','300.00','Cancelado');


insert into Pagos (IdPago,IdSocio,Tipo_de_Pago,Importe,Fecha,IGV,Subtotal,Total,NroCuotas,Estado) values ('PA001','S0001','Contado','150.00','2017/09/11','0.18','27.00','177.00','2','Pendiente');
insert into Pagos (IdPago,IdSocio,Tipo_de_Pago,Importe,Fecha,IGV,Subtotal,Total,NroCuotas,Estado) values ('PA002','S0002','Contado','300.00','2017/09/11','0.18','54.00','354.00','1','Cancelado');
insert into Pagos (IdPago,IdSocio,Tipo_de_Pago,Importe,Fecha,IGV,Subtotal,Total,NroCuotas,Estado) values ('PA003','S0003','Contado','300.00','2017/09/11','0.18','54.00','354.00','1','Cancelado');

insert into DetPagos (IdPago,NroCuota,Importe,F_Pago,Estado) values ('PA001','1','88.50','2017/09/11','Cancelado');
insert into DetPagos (IdPago,NroCuota,Importe,F_Pago,Estado) values ('PA001','2','88.50','2017/10/11','Cancelado');

insert into Membresia (IdSocio,IdPlan,IdPago,F_Inicio,F_Fin,Estado) values ('S0001','PLA01','PA001','2017/09/11','2017/11/11','Culminado');
insert into Membresia (IdSocio,IdPlan,IdPago,F_Inicio,F_Fin,Estado) values ('S0002','PLA02','PA001','2017/09/11','2017/11/11','Culminado');
insert into Membresia (IdSocio,IdPlan,IdPago,F_Inicio,F_Fin,Estado) values ('S0003','PLA01','PA001','2017/09/11','2017/11/11','Culminado');

insert into Ejercicio (IdPlanE,Ejercicio) values ('EJ001','Planchas');
insert into Ejercicio (IdPlanE,Ejercicio) values ('EJ002','Bicicleta');
insert into Ejercicio (IdPlanE,Ejercicio) values ('EJ003','Planchas cruzadas');
insert into Ejercicio (IdPlanE,Ejercicio) values ('EJ004','Barras');
insert into Ejercicio (IdPlanE,Ejercicio) values ('EJ005','Trotar');

insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ01','Pectorales');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ02','Piernas');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ03','Triceps');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ04','Biceps');
insert into TipoEjercicio (IdTipo,TipoEjercicio) values ('TEJ05','Calentamiento');

insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdPlanE,IdTipo,IdSocio,N_Maquina,Serie,Repeticiones) values ('PEN01','E0005','EJ001','TEJ01','S0001','1','10','4');
insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdPlanE,IdTipo,IdSocio,N_Maquina,Serie,Repeticiones) values ('PEN02','E0005','EJ002','TEJ02','S0001','1','15','4');
insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdPlanE,IdTipo,IdSocio,N_Maquina,Serie,Repeticiones) values ('PEN03','E0005','EJ003','TEJ03','S0002','1','15','4');
insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdPlanE,IdTipo,IdSocio,N_Maquina,Serie,Repeticiones) values ('PEN04','E0005','EJ004','TEJ04','S0003','1','10','4');
insert into PlanEntrenamiento (IdPlanEntrenamiento,IdEmpleado,IdPlanE,IdTipo,IdSocio,N_Maquina,Serie,Repeticiones) values ('PEN05','E0005','EJ005','TEJ05','S0003','1','10','4');

insert into DetNutricional (IdDetNutricional,Fecha,Peso,IMC,Masa_Grasa,Cuello,Hombros,Brazos_Antebrazos,Pecho_Busto,Cintura,CaderaAlta,Gluteos,Muslo,Pantorrillas) values ('DNU01','2017/09/11','80.50','12.2','30.45','42.00','240.00','50.00','300.00','120.00','126.00','140.00','80.00','60.00');
insert into DetNutricional (IdDetNutricional,Fecha,Peso,IMC,Masa_Grasa,Cuello,Hombros,Brazos_Antebrazos,Pecho_Busto,Cintura,CaderaAlta,Gluteos,Muslo,Pantorrillas) values ('DNU02','2017/09/11','80.50','12.2','30.45','42.00','240.00','50.00','300.00','120.00','126.00','140.00','80.00','60.00');
insert into DetNutricional (IdDetNutricional,Fecha,Peso,IMC,Masa_Grasa,Cuello,Hombros,Brazos_Antebrazos,Pecho_Busto,Cintura,CaderaAlta,Gluteos,Muslo,Pantorrillas) values ('DNU03','2017/09/11','80.50','12.2','30.45','42.00','240.00','50.00','300.00','120.00','126.00','140.00','80.00','60.00');

insert into InfNutricional(IdInfNutricional,IdEmpleado,IdDetNutricional,IdPlanEntrenamiento,IdSocio) values ('INU01','E0004','DNU01','PEN01','S0001');
insert into InfNutricional(IdInfNutricional,IdEmpleado,IdDetNutricional,IdPlanEntrenamiento,IdSocio) values ('INU02','E0004','DNU02','PEN02','S0002');
insert into InfNutricional(IdInfNutricional,IdEmpleado,IdDetNutricional,IdPlanEntrenamiento,IdSocio) values ('INU03','E0004','DNU03','PEN03','S0003');




































