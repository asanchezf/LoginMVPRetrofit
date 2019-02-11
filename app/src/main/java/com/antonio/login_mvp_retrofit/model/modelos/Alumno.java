package com.antonio.login_mvp_retrofit.model.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alumno {

@SerializedName("Id")
@Expose
private String id;
@SerializedName("Poblacion")
@Expose
private String poblacion;
@SerializedName("Calle")
@Expose
private String calle;
@SerializedName("Numero")
@Expose
private String numero;
@SerializedName("Longitud")
@Expose
private String longitud;
@SerializedName("Latitud")
@Expose
private String latitud;
@SerializedName("Velocidad")
@Expose
private String velocidad;
@SerializedName("FechaHora")
@Expose
private String fechaHora;
@SerializedName("Telefono")
@Expose
private String telefono;
@SerializedName("Email")
@Expose
private String email;
@SerializedName("Username")
@Expose
private String username;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getPoblacion() {
return poblacion;
}

public void setPoblacion(String poblacion) {
this.poblacion = poblacion;
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

public String getLongitud() {
return longitud;
}

public void setLongitud(String longitud) {
this.longitud = longitud;
}

public String getLatitud() {
return latitud;
}

public void setLatitud(String latitud) {
this.latitud = latitud;
}

public String getVelocidad() {
return velocidad;
}

public void setVelocidad(String velocidad) {
this.velocidad = velocidad;
}

public String getFechaHora() {
return fechaHora;
}

public void setFechaHora(String fechaHora) {
this.fechaHora = fechaHora;
}

public String getTelefono() {
return telefono;
}

public void setTelefono(String telefono) {
this.telefono = telefono;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

}