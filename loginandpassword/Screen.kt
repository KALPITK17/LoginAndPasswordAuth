package eu.tutorials.loginandpassword

sealed class Screen(val route:String) {
    object LoginScreen : Screen("loginscreen")
    object SignupScreen : Screen("signupscreen")
    object NewScreen : Screen("NewScreen")
}

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}