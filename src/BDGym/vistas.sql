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
inner join promociones pro on pro.IdPromociones=m.IdPromociones

create view ConsultarEv (
IdSocio,IdPlanEntrenamiento,IdMembresia,DNI,Nombre,Apellido
)as
select s.IdSocio,p.IdPlanEntrenamiento,m.IdMembresia,s.DNI,s.Nombre,s.Apellido from socio s 
inner join membresia m 
on s.IdSocio=m.IdSocio
inner join planentrenamiento p on p.IdMembresia=m.IdMembresia

create view ConsultarDetalle(IdMembresia,Ejercicio,N_Maquina,Serie,Repeticiones) as
select m.IdMembresia,e.Ejercicio,d.N_Maquina,d.Serie,d.Repeticiones from membresia m 
inner join planentrenamiento p
on m.IdMembresia=p.IdMembresia
inner join detplanentrenamiento d
on d.IdPlanEntrenamiento=p.IdPlanEntrenamiento
inner join ejercicio e
on e.IdPlanE=d.IdPlanE

CREATE VIEW V_PAGOS(
IdPago, IdMembresia, IdSocio, Nombre, Apellido, DNI,
Tipo_de_Pago, IGV, Subtotal, Total, NroCuotas, Estado
) AS
SELECT p.IdPago, m.IdMembresia, p.IdSocio, s.Nombre, s.Apellido, s.DNI, 
p.Tipo_de_Pago, p.IGV, p.Subtotal, p.Total, p.NroCuotas, p.Estado 
from membresia m INNER join pagos p on m.IdPago=p.IdPago inner join 
socio s on p.IdSocio=s.IdSocio

