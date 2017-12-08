
-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE gym;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` TRIGGER cambiaEstadoPago 
AFTER UPDATE ON detpagos 
FOR EACH ROW 
BEGIN 
IF (NEW.NroCuota=(SELECT NroCuotas from pagos where IdPago=NEW.IdPago)) THEN
  UPDATE pagos SET Estado="Cancelado" WHERE IdPago=NEW.IdPago;
  END IF;
END$$
DELIMITER ;

