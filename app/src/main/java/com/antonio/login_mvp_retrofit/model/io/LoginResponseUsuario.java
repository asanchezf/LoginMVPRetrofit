package com.antonio.login_mvp_retrofit.model.io;

import com.antonio.login_mvp_retrofit.model.modelos.Usuario;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseUsuario {

    /*CLASE QUE MENEJARÁ LA RESPUESTA. SERÁ MAPEADA A LA CLASE USUARIO.
    *
    @POST(Conexiones.VALIDAR_USUARIO)
    @FormUrlEncoded
    Call<LoginResponseUsuario> getLoginUsuario(
            @Field("username")String username,
            @Field("password") String password);
    *
    *
    *
    *
    * */

@SerializedName("estado")
@Expose
private Integer estado;
@SerializedName("usuario")
@Expose
private Usuario usuario;

public Integer getEstado() {
return estado;
}

public void setEstado(Integer estado) {
this.estado = estado;
}

public Usuario getUsuario() {
return usuario;
}

public void setUsuario(Usuario usuario) {
this.usuario = usuario;
}

}