package com.antonio.login_mvp_retrofit.model.io;

import com.antonio.login_mvp_retrofit.model.modelos.Alumno;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UltimasLocalizaciones {

/*@SerializedName("estado")
@Expose
private Integer estado;
@SerializedName("mPosicions")
@Expose
private List<Posicion> mPosicions = null;

public Integer getEstado() {
return estado;
}

public void setEstado(Integer estado) {
this.estado = estado;
}

public List<Posicion> getPosicions() {
return mPosicions;
}

public void setPosicions(List<Posicion> posicions) {
this.mPosicions = posicions;
}*/

/*DEVLUCIÓN DEL SERVICIO:

{"estado":1,"alumnos":[{"Id":"1499","Poblacion":"Alcorc\u00f3n","Calle":"Calle Ocean\u00eda","Numero":null,
        "Longitud":"-3.82901","Latitud":"40.328","Velocidad":"0.19857648015022","FechaHora":"20-01-2018 15:12:25",
        "Telefono":"659355808","Email":"antoniom.sanchezf@gmail.com","Username":"Antonio"},{"Id":"649","Poblacion":"Madrid",
        "Calle":"Calle Fernando VI","Numero":" 2","Longitud":"-3.69698","Latitud":"40.4257","Velocidad":"0","FechaHora":"18-05-2016 13:25:39",
        "Telefono":"676048719","Email":"susimail62@gmail.com","Username":"Susana"},{"Id":"926","Poblacion":"Madrid","Calle":"Calle Princesa de Austria",
        "Numero":" 1","Longitud":"-3.71944","Latitud":"40.3832","Velocidad":"0.34801560640335","FechaHora":"01-06-2016 13:38:11","Telefono":"662062364",
        "Email":"email@gmail.com","Username":"Dario"},{"Id":"1513","Poblacion":"M\u00f3stoles","Calle":"Calle Rubens","Numero":null,"Longitud":"-3.87146",
        "Latitud":"40.3293","Velocidad":"1.3053963184357","FechaHora":"06-02-2018 20:38:39","Telefono":"89977665","Email":"email","Username":"Pepe"},
    {"Id":"1006","Poblacion":"Alcorc\u00f3n","Calle":"Traves\u00eda Fuente Cisneros","Numero":" 2","Longitud":"-3.85879","Latitud":"40.3389",
            "Velocidad":"1.1330332756042","FechaHora":"18-06-2016 11:26:42","Telefono":"774849499","Email":"email","Username":"Caminante"},
    {"Id":"1371","Poblacion":"Madrid","Calle":"Calle de Fuente de Lima","Numero":" 18-42","Longitud":"-3.78347","Latitud":"40.3837","Velocidad":"0",
            "FechaHora":"30-10-2016 10:59:43","Telefono":"659355855","Email":"antoniom.sanchezf@gmail.commm","Username":"Madrid"},{"Id":"1495",
        "Poblacion":"M\u00f3stoles","Calle":"Calle Rubens","Numero":" 12","Longitud":"-3.87125","Latitud":"40.3295","Velocidad":"0","FechaHora":"19-06-2017 16:36:35",
        "Telefono":"8984898488","Email":"enauk@gmail.com","Username":"Prueba"}]}*/


/*CLASE QUE MENEJARÁ LA RESPUESTA. SERÁ MAPEADA A LA CLASE ALUMNOS.PORQUE EL WS DEVUELVE UN ARRAY DE ALUMNOS...
*  @GET(Conexiones.ULTIMAS_LOCALIZACIONES)
    Call<UltimasLocalizaciones> getUltimasLocalizaciones();
*
*
*
* */



    @SerializedName("estado")
    @Expose
    private Integer estado;
    @SerializedName("alumnos")
    @Expose
    private List<Alumno> alumnos = null;

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}