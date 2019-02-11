package com.antonio.login_mvp_retrofit.model.io;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Clase construida con:http://www.jsonschema2pojo.org/
 * En base a la siguiente respuesta:
 * {"estado":2,"mensaje":"El usuario no existe en la BB.DD."}
 *
 */

public class LoginResponse {

    @SerializedName("estado")
    @Expose
    private Integer estado;
    @SerializedName("mensaje")
    @Expose
    private String mensaje;

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


}
