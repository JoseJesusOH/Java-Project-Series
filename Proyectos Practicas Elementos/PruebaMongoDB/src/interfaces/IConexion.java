package interfaces;

import com.mongodb.client.MongoDatabase;

public interface IConexion {

    MongoDatabase crearConexion();
}
