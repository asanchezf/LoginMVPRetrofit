package com.antonio.login_mvp_retrofit.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.antonio.login_mvp_retrofit.model.modelos.Posicion;

import java.util.ArrayList;

/**
 * Created by Usuario on 13/02/2018.
 */

public class PosicionesAdapter extends RecyclerView.Adapter<PosicionesAdapter.PosicionesViewHolder>{
    private Context mContext;
    private ArrayList<Posicion> mPosicions;

    @Override
    public PosicionesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//Inflamos la vista

        return null;
    }

    @Override
    public void onBindViewHolder(PosicionesViewHolder holder, int position) {//Damos valores por posición

    }

    @Override
    public int getItemCount() {//Establecemos tamaño
        return 0;
    }

    class PosicionesViewHolder extends RecyclerView.ViewHolder{

        public PosicionesViewHolder(View itemView) {
            //Establecemos los varialbes de los controles del layout
            super(itemView);
        }
    }



}
