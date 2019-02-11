package com.antonio.login_mvp_retrofit.presenter;

/**
 * Created by Usuario on 08/02/2018.
 */

public interface MvpMainPresenter {
    void validaUsuario(String user,String pass);//Se pone en contacto con el modelo para validar el usuario
    void usuarioValido(int mensaje,String texto);//Se pone en contacto con la view si el usuario ha realizado la acción de logarse y la respuesta ha sido correcta
    void error();
}
