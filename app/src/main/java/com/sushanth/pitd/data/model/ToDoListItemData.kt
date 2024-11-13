package com.sushanth.pitd.data.model

import java.util.Date

data class ToDoListItemData(val task: String, val isCompleted: Boolean, val priority: Priority,val createdDate: Date)

enum class Priority {
    LOW, MEDIUM, HIGH
}
