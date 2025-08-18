package interfaces;

import javax.persistence.EntityManager;

/**
 * Inteface de conexion DAO.
 *
 */
public interface IConexionBD {

    /**
     * Crear conexion a la case de datos.
     *
     * @return El EntityManager que establece la conexion.
     * @throws IllegalStateException Si algo en la conexion falla.
     */
    public EntityManager crearConexion() throws IllegalStateException;
}
