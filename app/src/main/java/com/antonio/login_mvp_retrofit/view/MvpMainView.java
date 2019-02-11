package com.antonio.login_mvp_retrofit.view;

/**
 * Created by Usuario on 08/02/2018.
 */

public interface MvpMainView {

    void usuarioValido(int mensaje,String texto);//Lo que haremos si el usuario se ha logado con éxito.
    void error();//Lo que haremos si el usuario no se ha logado
}
