package com.antonio.login_mvp_retrofit.model.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alumno {

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
    private String iDAndroid;
    @SerializedName("Telefono")
    @Expose
    private String telefono;
    @SerializedName("FechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("Observaciones")
    @Expose
    private Object observaciones;
    @SerializedName("FechaModificacion")
    @Expose
    private Object fechaModificacion;

    /**
     * No args constructor for use in serialization
     *
     */
    public Alumno() {
    }

    /**
     *
     * @param id
     * @param username
     * @param email
     * @param telefono
     * @param fechaCreacion
     * @param fechaModificacion
     * @param observaciones
     * @param iDAndroid
     * @param password
     */
    public Alumno(String id, String username, String password, String email, String iDAndroid, String telefono, String fechaCreacion, Object observaciones, Object fechaModificacion) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.iDAndroid = iDAndroid;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.observaciones = observaciones;
        this.fechaModificacion = fechaModificacion;
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

    public String getIDAndroid() {
        return iDAndroid;
    }

    public void setIDAndroid(String iDAndroid) {
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

    public Object getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Object observaciones) {
        this.observaciones = observaciones;
    }

    public Object getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Object fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}