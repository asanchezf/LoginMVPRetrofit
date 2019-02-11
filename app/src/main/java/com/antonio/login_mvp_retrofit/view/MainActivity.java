package com.antonio.login_mvp_retrofit.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.antonio.login_mvp_retrofit.R;
import com.antonio.login_mvp_retrofit.presenter.MainPresenter;
import com.antonio.login_mvp_retrofit.presenter.MvpMainPresenter;

public class MainActivity extends AppCompatActivity implements MvpMainView {
    private EditText edtNombre,edtPassword;
    private MvpMainPresenter mMvpMainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre=findViewById(R.id.edtNombre);
        edtPassword=findViewById(R.id.edtPassword);

        mMvpMainPresenter =new MainPresenter(this);
    }

    public void login(View view) {
        final String username = edtNombre.getText().toString().trim();
        final String password = edtPassword.getText().toString().trim();
      /*  Call<LoginResponse> call= ApiAdapter.getApiService().getLogin(username,password);
        call.enqueue(this);*/

       /* Call<LoginResponseUsuario> call= ApiAdapter.getApiService().getLoginUsuario(username,password);
        call.enqueue(this);*/

        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Accediendo al Servidor espera por favor...");
        pDialog.show();
        mMvpMainPresenter.validaUsuario(username,password);
        pDialog.dismiss();
    }


    @Override
    public void usuarioValido(int mensaje,String texto) {
        if(mensaje==1){
            Toast.makeText(this, "Respuesta correcta "+texto, Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this,MapsActivity.class));
            startActivity(new Intent(MainActivity.this,Activity_Usuarios.class));

        }else if(mensaje==2){

            Toast.makeText(this, "El usuario no existe en la BB.DD: "+texto, Toast.LENGTH_LONG).show();
        }else{

            Toast.makeText(this, "Se ha producido un error en el formato de respuesta", Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public void error() {
        Toast.makeText(this, "Se ha producido un error accediendo al Servidor", Toast.LENGTH_LONG).show();

    }
}
