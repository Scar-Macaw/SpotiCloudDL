package moe.scar.api

import moe.scar.data.Track
import moe.scar.data.Album
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface apiStuff {
    @GET("tracks/{id}")
    fun getTrackById(@Path("id") trackId: Int):Call<Track>

    @GET("albums/{id}")
    fun geAlbumById(@Path("id") albumId: Int):Call<Album>
}