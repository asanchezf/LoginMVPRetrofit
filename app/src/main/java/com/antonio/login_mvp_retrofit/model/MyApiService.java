package com.antonio.login_mvp_retrofit.model;

import com.antonio.login_mvp_retrofit.model.io.LoginResponse;
import com.antonio.login_mvp_retrofit.model.io.LoginResponseUsuario;
import com.antonio.login_mvp_retrofit.model.io.UltimasLocalizaciones;
import com.antonio.login_mvp_retrofit.model.modelos.Usuario;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MyApiService {
    //Sería el API_SERVICE

/*    @POST("URL QUE SE SUMARÁ A LA URLBASE")//MÉTODO POST-GET...
    Call<CLASE QUE MANERJARÁ LA RESPUESTA> MÊTODORESPUESTA(
            @Query("username") String username,//PARÁMETRO 1
            @Query("password") String password //PARÁMETRO 2
    );*/


    @POST(Conexiones.VALIDAR_USUARIO)
    @FormUrlEncoded
    Call<LoginResponse> getLogin(
            @Field("username")String username,
            @Field("password") String password);

    @POST(Conexiones.VALIDAR_USUARIO)
    @FormUrlEncoded
    Call<Usuario> getLoginOK(
            @Field("username")String username,
            @Field("password") String password);

    @POST(Conexiones.VALIDAR_USUARIO)
    @FormUrlEncoded
    Call<LoginResponseUsuario> getLoginUsuario(
            @Field("username")String username,
            @Field("password") String password);

    @GET(Conexiones.ULTIMAS_LOCALIZACIONES)
    Call<UltimasLocalizaciones> getUltimasLocalizaciones();


}
