package com.antonio.login_mvp_retrofit.presenter;

/**
 * Created by Usuario on 10/02/2018.
 */

public interface MvpMapsPresenter {//Será implementado por MapsPresenter
    void traerUltimosMarcadores();
    //void devuelveUltimosMarcadores();
    void error();//Lo que haremos si el usuario no se ha logado
}
