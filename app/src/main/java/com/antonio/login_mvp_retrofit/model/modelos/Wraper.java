package com.antonio.login_mvp_retrofit.model.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Antonio Sánchez -- 26/09/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public class Wraper {

    @SerializedName("estado")
    @Expose
    private int estado;
    @SerializedName("alumnos")
    @Expose
    private List<Alumno> alumnos = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Wraper() {
    }

    /**
     *
     * @param estado
     * @param alumnos
     */
    public Wraper(int estado, List<Alumno> alumnos) {
        super();
        this.estado = estado;
        this.alumnos = alumnos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }




}
