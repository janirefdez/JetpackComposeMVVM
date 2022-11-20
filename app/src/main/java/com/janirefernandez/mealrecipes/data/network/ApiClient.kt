package com.janirefernandez.mealrecipes.data.network

import com.janirefernandez.mealrecipes.data.model.CategoryApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("{api_key}/categories.php")
    suspend fun getCategories(@Path("api_key") apiKey: String): CategoryApiResponse
}