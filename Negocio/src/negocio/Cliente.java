/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author cetecom
 */
public class Cliente {
    //rut dv nombre mail direccion telefono
    private int rut,telefono;
    private String nombre,mail,direccion;
    private char dv;

    public Cliente() {
    }

    public Cliente(int rut, int telefono, String nombre, String mail, String direccion, char dv) {
        this.rut = rut;
        this.telefono = telefono;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.dv = dv;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
    
    
}
