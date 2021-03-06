-- =============================================
-- Procedimientos Almacenados
-- =============================================

use gym;



CREATE VIEW V_MEMBRESIA(
IdMembresia, IdEmpleado, IdSocio, DNI, Nombre, Apellido,
IdPlan, NombrePlan, IdPromociones, NombrePromocion, IdPago, F_Inicio,
F_Fin, Estado
) AS
SELECT m.IdMembresia, m.IdEmpleado, m.IdSocio, s.DNI, s.Nombre, s.Apellido, m.IdPlan, p.NombrePlan, m.IdPromociones, pro.NombrePromocion,  
IFNULL(m.IdPago, "No generado"), m.F_Inicio, m.F_Fin, m.Estado from membresia m inner join socio s on m.IdSocio=s.IdSocio inner join planes p  on p.IdPlan=m.IdPlan 
inner join promociones pro on pro.IdPromociones=m.IdPromociones;



create view v_planentrenamiento (
IdSocio,IdPlanEntrenamiento,IdInfNutricional,DNI,Nombre,Apellido
)as
select s.IdSocio,p.IdPlanEntrenamiento,i.IdInfNutricional,s.DNI,s.Nombre,s.Apellido from socio s 
inner join infnutricional i 
on s.IdSocio=i.IdSocio
inner join planentrenamiento p on p.IdInfNutricional=i.IdInfNutricional;



create view v_detplanentrenamiento(IdPlanEntrenamiento,Ejercicio,N_Maquina,Serie,Repeticiones) as
select p.IdPlanEntrenamiento,e.Ejercicio,d.N_Maquina,d.Serie,d.Repeticiones from planentrenamiento p
inner join detplanentrenamiento d
on d.IdPlanEntrenamiento=p.IdPlanEntrenamiento
inner join ejercicio e
on e.IdPlanE=d.IdPlanE;



CREATE VIEW V_PAGOS(
IdPago, IdMembresia, IdSocio, Nombre, Apellido, DNI,
Tipo_de_Pago, IGV, Subtotal, Total, NroCuotas, Estado
) AS
SELECT p.IdPago, m.IdMembresia, p.IdSocio, s.Nombre, s.Apellido, s.DNI, 
p.Tipo_de_Pago, p.IGV, p.Subtotal, p.Total, p.NroCuotas, p.Estado 
from membresia m INNER join pagos p on m.IdPago=p.IdPago inner join 
socio s on p.IdSocio=s.IdSocio;


create view V_NUTRICION (IdInfNutricional, IdEmpleado, IdSocio, Nombre, DNI, Fecha) as
select i.IdInfNutricional,i.IdEmpleado,s.IdSocio,s.Nombre,s.DNI,di.Fecha from socio s 
inner join infnutricional i on s.IdSocio=i.IdSocio 
inner join detnutricional di on di.IdInfNutricional=i.IdInfNutricional;


create view V_EJERCICIOS(IdPlanE, TipoEjercicio, Ejercicio) as
SELECT e.IdPlanE, t.TipoEjercicio,  e.Ejercicio FROM ejercicio e inner join tipoejercicio t on t.IdTipo=e.IdTipo;
