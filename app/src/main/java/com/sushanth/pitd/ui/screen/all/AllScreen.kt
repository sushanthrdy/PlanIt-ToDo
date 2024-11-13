package com.sushanth.pitd.ui.screen.all

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sushanth.pitd.data.model.ToDoListItemData
import com.sushanth.pitd.ui.components.PlanItToDoItem
import com.sushanth.pitd.ui.theme.PlanItToDoTheme

@Composable
fun AllScreen(modifier: Modifier = Modifier, toDoLists: List<ToDoListItemData>) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(toDoLists) { toDo ->
            PlanItToDoItem(toDoListItemData = toDo)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AllScreenPreview() {
    PlanItToDoTheme {
//        AllScreen()
    }
}