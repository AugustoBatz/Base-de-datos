CREATE TABLE HISTORIAL_PRODUCTOS_ELIMINADOS
(nombre,costo,cantidad,id,FECHA,marca)

CREATE TABLE historial_cambios_prod
(FECHA_MOD DATE,nombre_act VARCHAR(30),nombre_ant VARCHAR(30),precio_act FLOAT,
precio_ant FLOAT ,marca_ant VARCHAR(30),marca_act VARCHAR(30),cantidad_ant INT ,cantidad_act INT)


/* trigger para guardar productos eliminados*/
CREATE TRIGGER Eliminados BEFORE DELETE ON producto FOR EACH ROW INSERT INTO HISTORIAL_PRODUCTOS_ELIMINADOS
(nombre,costo,cantidad,id,FECHA)
VALUES
(OLD.nombre,OLD.preciocompra,OLD.existencia,OLD.idprod,NOW(),OLD.marca)
/* */	
/* trigger para guardar productos eliminados*/



CREATE TRIGGER Modificados BEFORE UPDATE ON producto FOR EACH ROW INSERT INTO historial_cambios_prod
(FECHA_MOD,nombre_act,nombre_ant,precio_act,precio_ant,marca_ant,marca_act,cantidad_ant,cantidad_act)
VALUES
(NOW(),NEW.nombre,OLD.nombre,NEW.preciocompra,OLD.preciocompra,OLD.marca,NEW.marca,OLD.existencia,NEW.existencia,OLD.existencia)
/* */
/*tabla*/
