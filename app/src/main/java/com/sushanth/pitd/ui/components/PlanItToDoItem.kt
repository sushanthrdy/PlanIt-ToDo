package com.sushanth.pitd.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sushanth.pitd.data.model.ToDoListItemData

@Composable
fun PlanItToDoItem(
    modifier: Modifier = Modifier,
    toDoListItemData: ToDoListItemData
) {
    Card(
        modifier = modifier,
        onClick = {},
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        ListItem(
            headlineContent = {
                Text(text = toDoListItemData.task)
            },
            trailingContent = {
                if (toDoListItemData.isCompleted) {
                    Icon(
                        Icons.Default.CheckCircle,
                        contentDescription = "Favorite",
                        tint = MaterialTheme.colorScheme.surfaceTint
                    )
                }
            },
            supportingContent = {
                AssistChip(onClick = {}, label = { Text("${toDoListItemData.priority}") })
            }
        )
    }
}