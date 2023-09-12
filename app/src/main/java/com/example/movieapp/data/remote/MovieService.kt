package com.example.movieapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Header


private const val API_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJkNTBjMTU5NWQxMDg5MWMzYTI0MGQ0MGQ1NzFjMWFjYiIsInN1YiI6IjY0ZjFkMzBkNWYyYjhkMDExYjRkNGU5MiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.0RRqtA53mLHoTEoruckVumFZccd8_gWl4gsaZ5mjZDM"

interface MovieService {

    @GET("/3/movie/now_playing")
    suspend fun fetchNowPlaying(
        @Header("Authorization") apiKey: String = "Bearer $API_KEY"
    )

    @GET("")
    suspend fun fetchUpcoming(
        @Header("Authorization") apiKey: String = "Bearer $API_KEY"
    )

    @GET("")
    suspend fun fetchTopRated(
        @Header("Authorization") apiKey: String = "Bearer $API_KEY"
    )

    @GET("")
    suspend fun fetchPopular(
        @Header("Authorization") apiKey: String = "Bearer $API_KEY"
    )

}