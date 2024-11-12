package com.sushanth.pitd.ui.screen.all

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sushanth.pitd.ui.theme.PlanItToDoTheme

@Composable
fun AllScreen(modifier: Modifier = Modifier) {
    Text(text = "All Screen")
}

@Preview(showBackground = true)
@Composable
private fun AllScreenPreview() {
    PlanItToDoTheme {
        AllScreen()
    }
}