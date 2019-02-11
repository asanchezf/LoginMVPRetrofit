package com.antonio.login_mvp_retrofit.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.antonio.login_mvp_retrofit.R;
import com.antonio.login_mvp_retrofit.model.modelos.Usuario;

import java.util.ArrayList;

public class Activity_Usuarios extends AppCompatActivity implements AdaptadorRecyclerView.OnItemClickListener {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager llmanager;
    private AdaptadorRecyclerView mAdaptadorRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__usuarios);

        inicializaControles();

    }

    private void inicializaControles() {
        ArrayList<Usuario>listaUsuarios=new ArrayList<>();

        for (int i=0;i<10;i++){

            listaUsuarios.add(new Usuario("Usuario "+i,"email.com","57533442"+i));

        }


        mRecyclerView=findViewById(R.id.listaUsuarios);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());//Animación por defecto....
        mAdaptadorRecyclerView=new AdaptadorRecyclerView(listaUsuarios,this,this);
        mRecyclerView.setAdapter(mAdaptadorRecyclerView);

    }

    @Override
    public void onClick(RecyclerView.ViewHolder holder, int idPromocion, View v) {

    }
}
