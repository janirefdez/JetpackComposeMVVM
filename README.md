# JetpackComposeMVVM
[![Kotlin](https://img.shields.io/badge/Kotlin-1.7.21-blue.svg)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android->=21-blue.svg)](https://developer.android.com/)
[![Gradle](https://img.shields.io/badge/Gradle-7.3.3-blue.svg)](https://docs.gradle.org/7.3.3/userguide/userguide.html)

Android example where you can see how to create an app with `JetpackCompose` and `MVVM` architecture.

To learn more about how jetpack's composable functions have been defined in this project, you can refer to: [Android Jetpack Compose MVVM](https://dev.to/janirefdez/android-jetpack-compose-mvvm-1nji)

## Requirements
- Android API 21 - 33
- Gradle 7.3.3
- Kotlin 1.7.21

## Characteristics
- MVVM
- Clean Architecture
- Dagger Hilt
- Retrofit
- Http3 Logging

## Functionalities

- Display a list of meal categories
  - To be able to get the meal categories we use endpoint:
```
GET https://www.themealdb.com/api/json/v1/1/categories.php
```
 For more information about this API, you can refer to [www.themealdb.com](https://www.themealdb.com/)
- Click on a category and view the information on another screen

## Demo

https://user-images.githubusercontent.com/20024632/202877052-987046e8-5a26-4046-9afe-ad46288162ab.mp4

