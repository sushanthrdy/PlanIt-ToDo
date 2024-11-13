package com.sushanth.pitd.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.sushanth.pitd.ui.MainViewModel
import com.sushanth.pitd.ui.screen.all.AllScreen
import com.sushanth.pitd.ui.screen.done.DoneScreen
import com.sushanth.pitd.ui.screen.inprogress.InProgressScreen

@Composable
fun PlanItToDoNavHost(
    navController: NavHostController,
    viewModel :MainViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = All,
        modifier = modifier.padding(16.dp)
    ) {
        composable<All> {

            AllScreen(toDoLists = viewModel.todoList.toList())
        }
        composable<InProgress> {
            InProgressScreen()
        }
        composable<Done> {
            DoneScreen()
        }
    }
}