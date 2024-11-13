package com.sushanth.pitd.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.sushanth.pitd.data.model.Priority
import com.sushanth.pitd.data.model.ToDoListItemData
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel(){

    val todoList = mutableStateListOf(
        ToDoListItemData("Todo item 1", false, priority = Priority.HIGH, createdDate = Date()),
        ToDoListItemData("Todo item 2", false, priority = Priority.LOW, createdDate = Date()),
        ToDoListItemData("Todo item 3", true, priority = Priority.MEDIUM, createdDate = Date()),
        ToDoListItemData("Todo item 4", false, priority = Priority.LOW, createdDate = Date()),
        ToDoListItemData("Todo item 5", true, priority = Priority.LOW, createdDate = Date()),
        ToDoListItemData("Todo item 6", false, priority = Priority.HIGH, createdDate = Date()),
    )
}