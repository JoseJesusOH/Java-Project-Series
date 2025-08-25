package entidades;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

public class Restaurante {

    private ObjectId id;
    private String nombre;
    private Double rating;
    private Direccion direcion;
    private List<ObjectId> idsRepartidores;
    private List<Repartidor> r;

    public Restaurante() {
    }

    public Restaurante(ObjectId id, String nombre, Double rating, Direccion direcion, List<ObjectId> idsRepartidores) {
        this.id = id;
        this.nombre = nombre;
        this.rating = rating;
        this.direcion = direcion;
        this.idsRepartidores = idsRepartidores;
    }

    public Restaurante(String nombre, Double rating, Direccion direcion) {
        this.nombre = nombre;
        this.rating = rating;
        this.direcion = direcion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Repartidor> getR() {
        return r;
    }

    public void setR(List<Repartidor> r) {
        this.r = r;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Direccion getDirecion() {
        return direcion;
    }

    public void setDirecion(Direccion direcion) {
        this.direcion = direcion;
    }

    public List<ObjectId> getIdsRepartidores() {
        return idsRepartidores;
    }

    public void setIdsRepartidores(List<ObjectId> idsRepartidores) {
        this.idsRepartidores = idsRepartidores;
    }

    public void addIdRepartidor(ObjectId idRepartidor) {
        if (this.idsRepartidores == null) {
            this.idsRepartidores = new LinkedList<>();
        }
        this.idsRepartidores.add(idRepartidor);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", nombre=" + nombre + ", rating=" + rating + ", direcion=" + direcion + ", idsRepartidores=" + idsRepartidores + ", r=" + r + '}';
    }


}
