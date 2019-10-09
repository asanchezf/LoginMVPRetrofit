package com.antonio.login_mvp_retrofit.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.antonio.login_mvp_retrofit.R;
import com.antonio.login_mvp_retrofit.model.ApiAdapter;
import com.antonio.login_mvp_retrofit.model.modelos.Alumno;
import com.antonio.login_mvp_retrofit.model.modelos.Wraper;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Usuarios extends AppCompatActivity implements AdaptadorRecyclerView.OnItemClickListener {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager llmanager;
    private AdaptadorRecyclerView mAdaptadorRecyclerView;
    private ArrayList<Alumno> miArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__usuarios);

        inicializaControles();

    }

    private void inicializaControles() {
        //ArrayList<Usuario>listaUsuarios=new ArrayList<>();

       /* for (int i=0;i<10;i++){

            listaUsuarios.add(new Usuario("Usuario "+i,"email.com","57533442"+i));

        }*/
        miArrayList = new ArrayList<Alumno>();

       traeUsuarios();


        mRecyclerView=findViewById(R.id.listaUsuarios);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());//Animación por defecto....
        mAdaptadorRecyclerView=new AdaptadorRecyclerView(miArrayList,this,this);
        mRecyclerView.setAdapter(mAdaptadorRecyclerView);

    }

    private void traeUsuarios() {
        Call<Wraper> call= ApiAdapter.getApiService().getAlumnos();
        call.enqueue(new Callback<Wraper>() {
            @Override
            public void onResponse(Call<Wraper> call, Response<Wraper> response) {


                if(response.isSuccessful()) {

                    Toast.makeText(Activity_Usuarios.this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
                        for (Alumno player : response.body().getAlumnos()) {

                  /*  player.setUsername(response.body().get(0).getUsername().toString());
                    player.setEmail(response.body().get(1).getEmail());
                    player.setTelefono(response.body().get(0).getTelefono());*/

                            player.setUsername(response.body().getAlumnos().get(0).getUsername());
                            player.setEmail(response.body().getAlumnos().get(1).getEmail());
                            player.setTelefono(response.body().getAlumnos().get(0).getTelefono());


                            miArrayList.add(player);


                        }

                }
            }

            @Override
            public void onFailure(Call<Wraper> call, Throwable t) {
                Log.e("ERROR en onFailure", t.getMessage());
            }
        });







    }

    @Override
    public void onClick(RecyclerView.ViewHolder holder, int idPromocion, View v) {

    }
}
