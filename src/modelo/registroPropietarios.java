/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author umg
 */
public class registroPropietarios {
 private String Apellidos;
 private String Nombre;
 private String Telefono;

    public registroPropietarios(String Apellidos, String Nombre, String Telefono) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
 
 
}

