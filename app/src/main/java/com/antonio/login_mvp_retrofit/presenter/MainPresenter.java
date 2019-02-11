package com.antonio.login_mvp_retrofit.presenter;


import android.util.Log;

import com.antonio.login_mvp_retrofit.model.ApiAdapter;
import com.antonio.login_mvp_retrofit.model.io.LoginResponseUsuario;
import com.antonio.login_mvp_retrofit.view.MvpMainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MvpMainPresenter, Callback<LoginResponseUsuario> {
    private static final String TAG = "ERROR";
    //El Presenter hará de puente entre el View y el Modelo...
    //Se crea una variable miembro perteneciente a la interface View
    private MvpMainView mMvpMainView;

    public MainPresenter(MvpMainView mvpMainView) {
        mMvpMainView = mvpMainView;
    }

    @Override
    public void validaUsuario(String username, String password) {
        //Una vez validado que view no es nulo enviamos los parámetros user y pass al Modelo para que los valide
        if(mMvpMainView !=null){
           //Nos ponemos en contacto con el modelo para que nos traiga los datos...
            Call<LoginResponseUsuario> call= ApiAdapter.getApiService().getLoginUsuario(username,password);
            call.enqueue(this);

        }
    }

    @Override
    public void onResponse(Call<LoginResponseUsuario> call, Response<LoginResponseUsuario> response) {
        if(response.isSuccessful()){
           // Log.v("Respuesta login",edtNombre.getText().toString().trim() + " " + edtPassword.getText().toString().trim());

            //Toast.makeText(this, "Respuesta correcta "+response.body().getMensaje(), Toast.LENGTH_LONG).show();
            //Toast.makeText(this, "Respuesta correcta "+response.body().getEstado(), Toast.LENGTH_LONG).show();

            if(response.body().getEstado()==1) {//El usuario se ha logado  y la respuesta ha sido 1 por lo tanto el usuario existe en la BB.DD.
                usuarioValido(1,response.body().getUsuario().getUsername());
                //String texto = response.body().getUsuario().getUsername();
                //mMvpMainView.usuarioValido(1, texto);
            }
            else{//El usuario se ha logado  y la respuesta ha sido 2 por lo tanto el usuario no existe en la BB.DD.
                usuarioValido(2,response.body().getEstado().toString());
                /*String texto=response.body().getEstado().toString();
                mMvpMainView.usuarioValido(2,texto);*/
            }
        }else{//El usuario se ha logado  y la respuesta ha sido que se ha producido un error en el formato de la respuesta.

            //mMvpMainView.error();
            usuarioValido(3,"");
            Log.i(TAG, "Error onResponse: "+response.errorBody());
        }

    }

    @Override
    public void onFailure(Call<LoginResponseUsuario> call, Throwable t) {
        //El usuario se ha logado  y se ha producido un error accediendo al servidor
       error();
       Log.i(TAG,"Error en onFailure: "+t.getMessage());
    }

    @Override
    public void usuarioValido(int mensaje,String texto) {
        //Respuesta correcta del servidor. Se le envía el mensaje a la view para que haga lo que tenga que hacer...
        mMvpMainView.usuarioValido(mensaje,texto);


    }

    @Override
    public void error() {
        mMvpMainView.error();
    }


}
