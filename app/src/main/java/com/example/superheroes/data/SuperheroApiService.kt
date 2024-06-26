package com.example.superheroes.data

import retrofit2.http.GET
import retrofit2.http.Path

interface SuperheroApiService {
    @GET("search/{name}")
    suspend fun findSuperheroesByName(@Path("name") query: String) : SuperheroResponse

    @GET("{character-id}")
    suspend fun  getSuperheroByid(@Path("character-id") id: Int) : Superhero
}