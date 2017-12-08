
-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE gym;

SET GLOBAL event_scheduler=ON;

CREATE EVENT `terminodecongelamiento` 
ON SCHEDULE EVERY 1 DAY STARTS '2017-12-01 09:00:01'
ON COMPLETION NOT PRESERVE ENABLE 
DO update congelamiento
set estado = "Descongelado"
where
Fecha_FinC<=NOW() and estado="Congelado";

CREATE EVENT `terminodemembresia` 
ON SCHEDULE EVERY 1 DAY STARTS '2017-12-01 09:01:01'
ON COMPLETION NOT PRESERVE ENABLE 
DO update membresia
set estado = "Culminado"
where
F_Fin<=NOW() and estado="Activo";
