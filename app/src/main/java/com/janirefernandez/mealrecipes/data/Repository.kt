package com.janirefernandez.mealrecipes.data

import com.janirefernandez.mealrecipes.data.model.Category
import com.janirefernandez.mealrecipes.data.network.ApiService
import com.janirefernandez.mealrecipes.di.NetworkConstants
import javax.inject.Inject

class Repository @Inject constructor(
    private val api: ApiService,
) {
    suspend fun getCategories(): List<Category> {
        return api.getCategories(NetworkConstants.API_KEY).categories
    }
}