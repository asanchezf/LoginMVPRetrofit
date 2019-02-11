package com.antonio.login_mvp_retrofit.model.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

@SerializedName("Id")
@Expose
private String id;
@SerializedName("Username")
@Expose
private String username;
@SerializedName("Password")
@Expose
private String password;
@SerializedName("Email")
@Expose
private String email;
@SerializedName("ID_Android")
@Expose
private Object iDAndroid;
@SerializedName("Telefono")
@Expose
private String telefono;
@SerializedName("FechaCreacion")
@Expose
private String fechaCreacion;
@SerializedName("Observaciones")
@Expose
private String observaciones;
@SerializedName("FechaModificacion")
@Expose
private String fechaModificacion;

    public Usuario(String username, String email, String telefono) {
        this.username = username;
        this.email = email;
        this.telefono = telefono;
    }

    public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Object getIDAndroid() {
return iDAndroid;
}

public void setIDAndroid(Object iDAndroid) {
this.iDAndroid = iDAndroid;
}

public String getTelefono() {
return telefono;
}

public void setTelefono(String telefono) {
this.telefono = telefono;
}

public String getFechaCreacion() {
return fechaCreacion;
}

public void setFechaCreacion(String fechaCreacion) {
this.fechaCreacion = fechaCreacion;
}

public String getObservaciones() {
return observaciones;
}

public void setObservaciones(String observaciones) {
this.observaciones = observaciones;
}

public String getFechaModificacion() {
return fechaModificacion;
}

public void setFechaModificacion(String fechaModificacion) {
this.fechaModificacion = fechaModificacion;
}

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", iDAndroid=" + iDAndroid +
                ", telefono='" + telefono + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", fechaModificacion='" + fechaModificacion + '\'' +
                '}';
    }
}