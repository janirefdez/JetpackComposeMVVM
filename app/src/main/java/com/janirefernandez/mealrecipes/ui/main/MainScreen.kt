package com.janirefernandez.mealrecipes.ui.main

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import com.janirefernandez.mealrecipes.data.model.Category
import com.janirefernandez.mealrecipes.ui.theme.MealRecipesTheme

@Composable
fun CategoryItem(category: Category, context: Context, onClickListener: (Category) -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp, 4.dp)
            .fillMaxWidth()
            .height(300.dp)
            .clickable { onClickListener.invoke(category) },
        shape = RoundedCornerShape(25.dp),
    ) {
        Surface(
            color = Color.LightGray
        ) {

            Row(
                Modifier
                    .padding(4.dp)
                    .fillMaxSize()
            ) {

                Image(
                    painter = rememberAsyncImagePainter(
                        model = category.strThumb,
                        imageLoader = ImageLoader.Builder(context).crossfade(true).build()
                    ),
                    contentDescription = category.str,
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(0.2f)
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxHeight()
                        .weight(0.8f)
                ) {
                    Text(
                        text = category.str,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = category.strDescription,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

@Composable
fun CategoryList(
    categoryList: List<Category>,
    context: Context,
    onClickListener: (Category) -> Unit
) {
    LazyColumn {
        itemsIndexed(items = categoryList) { _, item ->
            CategoryItem(category = item, context, onClickListener)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MealRecipesTheme {
        val category = Category(
            "2",
            "Beef",
            "https://www.themealdb.com/images/category/beef.png",
            "Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times.[1] Beef is a source of high-quality protein and essential nutrients.[2]"
        )

        CategoryItem(category = category, LocalContext.current) {}

    }
}