package com.chiksmedina.sample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.Linear
import dev.chiksmedina.solar.linear.Arrows
import dev.chiksmedina.solar.linear.arrows.ArrowUp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.safeContentPadding().fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Icon(imageVector = Solar.Linear.Arrows.ArrowUp, contentDescription = "Hello $name!")
}