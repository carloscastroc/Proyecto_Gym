-- =============================================
-- Procedimientos Almacenados
-- =============================================

use gym;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERACODIGOEMPL`()
begin
declare cod char(5);
set cod=(select  max(IdEmpleado) from empleado);
set cod=CONCAT('E',RIGHT(Concat('0000',right(IFNULL(cod,'0000'),4)+1 ),4));
select cod;
END$$
DELIMITER ;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERACODIGOSOCIO`()
begin
declare cod char(6);
set cod=(select  max(IdSocio) from socio);
set cod=CONCAT('S',RIGHT(Concat('00000',right(IFNULL(cod,'00000'),5)+1 ),5));  -- Probar esto
select cod;
END$$
DELIMITER ;