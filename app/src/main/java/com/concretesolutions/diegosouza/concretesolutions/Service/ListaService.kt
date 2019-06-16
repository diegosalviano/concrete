package com.concretesolutions.diegosouza.concretesolutions.Service

import com.concretesolutions.diegosouza.concretesolutions.Model.InformationList
import com.concretesolutions.diegosouza.concretesolutions.Model.Lista
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ListaService {

    @GET("search/repositories?q=language:Java&sort=stars")
    fun lista(@Query("page") offset: Int): Call<Lista>

    @GET("repos/square/picasso/pulls")
    fun listaPulls(): Call<List<InformationList>>
}