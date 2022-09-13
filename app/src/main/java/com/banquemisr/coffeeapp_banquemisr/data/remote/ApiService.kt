package com.banquemisr.coffeeapp_banquemisr.data.remote

import com.banquemisr.coffeeapp_banquemisr.domain.model.User
import com.banquemisr.coffeeapp_banquemisr.domain.model.UserOrder
import retrofit2.http.POST
import com.banquemisr.coffeeapp_banquemisr.data.remote.dto.SignInDto
import com.banquemisr.coffeeapp_banquemisr.data.remote.dto.SignUpDto
import retrofit2.Call
import retrofit2.http.Body

interface ApiService {
    @POST("auth/signin")
    fun signIn(@Body user: User?): Call<SignInDto?>?

    @POST("auth/signup")
    fun signUp(@Body user: User?): Call<SignUpDto?>?

    @POST("/order")
    fun userOrder(@Body userOrder: UserOrder): Call<OrderDto>
}