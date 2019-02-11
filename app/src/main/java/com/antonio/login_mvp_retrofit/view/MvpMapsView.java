package com.antonio.login_mvp_retrofit.view;

import com.antonio.login_mvp_retrofit.model.modelos.Alumno;

import java.util.ArrayList;

/**
 * Va a ser implementada por la activity MapsActivity
 */

public interface MvpMapsView {
    void MarcadoresDevueltos(ArrayList<Alumno> marcadores);
    void error(int error);
}
