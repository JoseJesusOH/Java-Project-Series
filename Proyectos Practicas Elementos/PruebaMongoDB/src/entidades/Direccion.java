/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author josej
 */
public class Direccion {

    private ObjectId _id;
    private String calle;
    private String numero;
    private String telefono;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.telefono = telefono;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void generarID() {
        setId(new ObjectId());
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", telefono=" + telefono + '}';
    }

}
