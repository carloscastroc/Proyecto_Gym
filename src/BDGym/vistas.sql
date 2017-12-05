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
m.IdPago, m.F_Inicio, m.F_Fin, m.Estado from membresia m inner join socio s on m.IdSocio=s.IdSocio inner join planes p  on p.IdPlan=m.IdPlan 
inner join promociones pro on pro.IdPromociones=m.IdPromociones


