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
set cod=CONCAT('S',RIGHT(Concat('00000',right(IFNULL(cod,'00000'),5)+1 ),5));
select cod;
END$$
DELIMITER ;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERACODIGOMEMBRESIA`()
begin
declare cod char(8);
set cod=(select  max(IdMembresia) from membresia);
set cod=CONCAT('ME',RIGHT(Concat('000000',right(IFNULL(cod,'000000'),6)+1 ),6));  -- Probar esto
select cod;
END$$
DELIMITER ;



DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERACODIGOPAGO`()
begin
declare cod char(8);
set cod=(select  max(IdPago) from pagos);
set cod=CONCAT('PA',RIGHT(Concat('000000',right(IFNULL(cod,'000000'),6)+1 ),6));  -- Probar esto
select cod;
END$$
DELIMITER ;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERACODIGOPLAN`()
begin
declare cod char(5);
set cod=(select  max(IdPlan) from planes);
set cod=CONCAT('PLA',RIGHT(Concat('00',right(IFNULL(cod,'00'),2)+1 ),2));
select cod;
END$$
DELIMITER ;