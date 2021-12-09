package com.home.account_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;
public class Account {
    @Id
    private String username;
    private String direccion;
    private String telefono;

    public Account(String username, String direccion, String telefono) {
        this.username = username;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

