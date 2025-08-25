package dtos;

import org.bson.types.ObjectId;

public class RelacionDTO {

    private ObjectId _id;
    private ObjectId idRestaurante;
    private String nombreRestaurante;
    private ObjectId idRepartidor;
    private String nombreRepartidor;

 

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(ObjectId idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public ObjectId getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(ObjectId idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    @Override
    public String toString() {
        return "RelacionDTO{" + "_id=" + _id + ", idRestaurante=" + idRestaurante + ", nombreRestaurante=" + nombreRestaurante + ", idRepartidor=" + idRepartidor + ", nombreRepartidor=" + nombreRepartidor + '}';
    }
    
    
    
}
