package com.sushanth.pitd.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.sushanth.pitd.ui.components.PlanItToDoBottomBar
import com.sushanth.pitd.ui.components.PlanItToDoTopBar
import com.sushanth.pitd.ui.navigation.PlanItToDoNavHost
import com.sushanth.pitd.ui.theme.PlanItToDoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanItToDoApp()
        }
    }
}

@Composable
fun PlanItToDoApp(modifier: Modifier = Modifier) {
    PlanItToDoTheme {
        val navController = rememberNavController()
        val viewModel:MainViewModel = hiltViewModel()
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { PlanItToDoBottomBar(navController) },
            topBar = {
                PlanItToDoTopBar()
            }
        )
        { innerPadding ->
            Surface(
                modifier = modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                color = MaterialTheme.colorScheme.surface
            ) {
                PlanItToDoNavHost(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}