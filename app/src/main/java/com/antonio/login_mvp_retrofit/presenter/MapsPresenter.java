package com.antonio.login_mvp_retrofit.presenter;

import android.util.Log;

import com.antonio.login_mvp_retrofit.model.ApiAdapter;
import com.antonio.login_mvp_retrofit.model.io.UltimasLocalizaciones;
import com.antonio.login_mvp_retrofit.model.modelos.Alumno;
import com.antonio.login_mvp_retrofit.view.MvpMapsView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Usuario on 10/02/2018.
 */

public class MapsPresenter implements MvpMapsPresenter {

    private static final String TAG ="ERROR_LOCALIZACIONES" ;
    private MvpMapsView mMvpMapsView;

    public MapsPresenter(MvpMapsView mvpMapsView) {
        mMvpMapsView = mvpMapsView;
        traerUltimosMarcadores();

    }

    @Override
    public void traerUltimosMarcadores() {
        if (mMvpMapsView != null) {

            //Nos ponemos en contacto con el modelo para que nos traiga los datos...
            Call<UltimasLocalizaciones> call = ApiAdapter.getApiService().getUltimasLocalizaciones();
            call.enqueue(new Callback<UltimasLocalizaciones>() {
                @Override
                public void onResponse(Call<UltimasLocalizaciones> call, Response<UltimasLocalizaciones> response) {

                    if (response.isSuccessful()){

                        //String mismarcadores= String.valueOf(response.body());
                        //List<Posicion>listaPosiciones=  response.body().getPosicions();
                        String mismarcadores = response.toString();
                        ArrayList<Alumno> listaPosiciones = (ArrayList<Alumno>) response.body().getAlumnos();
                        mMvpMapsView.MarcadoresDevueltos(listaPosiciones);
                        Log.i(TAG, "Response.body "+listaPosiciones.size());

                    }else{

                        if(response.body().getEstado()!=1) {
                            mMvpMapsView.error(2);
                        }
                        Log.i(TAG, "Error onResponse "+response.errorBody());
                    }

                }

                @Override
                public void onFailure(Call<UltimasLocalizaciones> call, Throwable t) {
                        error();
                        Log.i(TAG,"Error onFailure "+t.getMessage());
                }
            }) ;


        }




/*    @Override
    public void onResponse(Call<UltimasLocalizaciones> call, Response<UltimasLocalizaciones> response) {
        if (response.isSuccessful()) {

            //String mismarcadores= String.valueOf(response.body());
            //List<Posicion>listaPosiciones=  response.body().getPosicions();
            String mismarcadores = response.toString();
            ArrayList<Alumno> listaPosiciones = (ArrayList<Alumno>) response.body().getAlumnos();
            mMvpMapsView.MarcadoresDevueltos(listaPosiciones);


        } else {
        *//*  if(response.body().getEstado()==2)  {
              mMvpMapsView.error();
          }*//*


        }


    }

    @Override
    public void onFailure(Call<UltimasLocalizaciones> call, Throwable t) {

    }*/


    }

    @Override
    public void error() {
        mMvpMapsView.error(1);
    }


}
