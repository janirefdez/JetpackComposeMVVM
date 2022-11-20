package com.janirefernandez.mealrecipes.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Category(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val str: String,
    @SerializedName("strCategoryThumb") val strThumb: String,
    @SerializedName("strCategoryDescription") val strDescription: String
) : Serializable