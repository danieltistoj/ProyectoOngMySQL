/*A la hora de eliminar un insumo, primero lo elimina de proyecto_has_insumo*/
delimiter $$
DROP TRIGGER IF EXISTS EliminarInsumo $$
CREATE TRIGGER EliminarIsumo
BEFORE DELETE ON insumo 
FOR EACH ROW
BEGIN
 DELETE FROM proyecto_has_insumo where insumo_idinsumo = old.idinsumo;
END;$$