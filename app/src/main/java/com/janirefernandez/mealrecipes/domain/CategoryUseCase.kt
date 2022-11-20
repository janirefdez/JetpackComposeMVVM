package com.janirefernandez.mealrecipes.domain

import com.janirefernandez.mealrecipes.data.Repository
import com.janirefernandez.mealrecipes.data.model.Category
import javax.inject.Inject

class CategoryUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(): List<Category> =
        repository.getCategories()
}