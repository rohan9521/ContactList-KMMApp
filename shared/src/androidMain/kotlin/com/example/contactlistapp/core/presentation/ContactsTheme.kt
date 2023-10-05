package com.example.contactlistapp.core.presentation

import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
//    val colorScheme = when{
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S ->{
//            val context = LocalContext.current
//            if(darkTheme) dyna
//        }
//    }
}