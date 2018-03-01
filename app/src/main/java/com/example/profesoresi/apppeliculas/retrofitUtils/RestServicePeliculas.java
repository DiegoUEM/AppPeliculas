package com.example.profesoresi.apppeliculas.retrofitUtils;

import com.example.profesoresi.apppeliculas.model.Pelicula;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by profesoresi on 05/02/2018.
 */

public interface RestServicePeliculas {
    public static final String BASE_URL = "http://10.0.2.2:3000/";

    @GET("peliculas")
    Call<ArrayList<Pelicula>> obtenerPeliculas(@Query("_limit") String limite);

    /*@GET("pokemon-form/{id_pokemon}/")
    Call<PokemonForm> obtenerFotoPokemon(@Path("id_pokemon") String codigo);*/
}
