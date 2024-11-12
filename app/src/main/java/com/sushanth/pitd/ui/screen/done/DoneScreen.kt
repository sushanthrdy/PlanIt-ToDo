package com.sushanth.pitd.ui.screen.done

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DoneScreen(modifier: Modifier = Modifier) {
    Text(text = "Done Screen")
}

@Preview(showBackground = true)
@Composable
private fun DoneScreenPreview() {
    DoneScreen()
}