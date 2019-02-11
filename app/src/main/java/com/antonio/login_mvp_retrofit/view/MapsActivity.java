package com.antonio.login_mvp_retrofit.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.antonio.login_mvp_retrofit.R;
import com.antonio.login_mvp_retrofit.model.modelos.Alumno;
import com.antonio.login_mvp_retrofit.presenter.MapsPresenter;
import com.antonio.login_mvp_retrofit.presenter.MvpMapsPresenter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, MvpMapsView {

    private GoogleMap mMap;
    private MvpMapsPresenter mMvpMapsPresenter;
    private ArrayList<Alumno> misMarcadores;
    LatLng milocalizacion;
    private float zoom = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    /***
       lA HUELLA SHA SE HA OBTENIDO MANUALMENTE PORQUE LA INCLUSIÓN DE UNA ACTIVITYMAPS NO GENERABA CORRECTAMENTE LA CLAVE. DESPUÉS SE HA AÑADIDO EN LA CONSOLA DE GOOGLE
         PARA OBTENER LA API_KEY
         VER: https://www.youtube.com/watch?v=tNKwBDGhEfA  *+**/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        mMvpMapsPresenter =new MapsPresenter(this);


        //mMvpMapsPresenter.traerUltimosMarcadores();Lo pasamos al constructor de la clase


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


 /*   @Override
    public void MarcadoresDevueltos(String mismarcadores) {

        Toast.makeText(this, "Estos son los marcadores" +mismarcadores.toString(), Toast.LENGTH_LONG).show();

    }*/

    @Override
    public void MarcadoresDevueltos(ArrayList<Alumno> marcadores) {
        //marcadores=new ArrayList<>();
        //misMarcadores=marcadores;

        for(Alumno alumno:marcadores){

            //System.out.println(alumno.getUsername());
            milocalizacion = new LatLng( Double.parseDouble(alumno.getLatitud()),Double.parseDouble(alumno.getLongitud()) );

            MarkerOptions markerOptions =
                    new MarkerOptions()
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder))
                            //.icon(BitmapDescriptorFactory.fromBitmap(writeTextOnDrawable(R.drawable.placeholder, "your text goes here")
                            .anchor(0.0f, 1.0f)
                            .title(alumno.getUsername())
                            //.snippet("Día: " + fechaHora + " - Teléf: " + telefonomarcador)

                            .draggable(true)
                            //.flat(true)
                            .position( milocalizacion);

            Marker marker = mMap.addMarker(markerOptions);



        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milocalizacion, zoom));

        //Toast.makeText(this, "Número total de marcadores traidos por Retrofit:" + misMarcadores.size(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void error(int tipoError) {

        if(tipoError==1){
            Toast.makeText(this, "Se ha producido un error conectando con el Servidor", Toast.LENGTH_SHORT).show();
        }

        if(tipoError==2) {
            Toast.makeText(this, "Se ha producido un error en el formato de la respuesta del Servidor...", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);


        //mMvpMapsPresenter.traerUltimosMarcadores();
        //LatLng milocalizacion;
        //Alumno alumno=new Alumno();
        //misMarcadores=new ArrayList<Alumno>();
      /*  ArrayList<Alumno> marcadorespersolalizados=new ArrayList<Alumno>();
        marcadorespersolalizados=misMarcadores;*/

   /*     for(Alumno alumno:misMarcadores){

            System.out.println(alumno.getUsername());
            milocalizacion = new LatLng( Double.parseDouble(alumno.getLatitud()),Double.parseDouble(alumno.getLongitud()) );

            MarkerOptions markerOptions =
                    new MarkerOptions()
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder))
                            //.icon(BitmapDescriptorFactory.fromBitmap(writeTextOnDrawable(R.drawable.placeholderotro, "your text goes here")
                            .anchor(0.0f, 1.0f)
                            .title(alumno.getUsername())
                            //.snippet("Día: " + fechaHora + " - Teléf: " + telefonomarcador)

                            .draggable(true)
                            //.flat(true)
                            .position( milocalizacion);

            Marker marker = mMap.addMarker(markerOptions);



        }*/




        // Add a marker in Sydney and move the camera
       /* LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }



}
