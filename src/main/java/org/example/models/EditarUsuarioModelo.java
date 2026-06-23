package org.example.models;

public class EditarUsuarioModelo {
    public Integer rol;
    public String nombre;
    public String primer_apellido;
    public String segundo_apellido;
    public Integer ciudad;
    public String telefono;
    public String correo;
    public String direccion;

    public Integer getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primer_apellido;
    }

    public String getSegundoApellido() {
        return segundo_apellido;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
}
