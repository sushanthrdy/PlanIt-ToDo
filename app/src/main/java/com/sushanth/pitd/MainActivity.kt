package com.sushanth.pitd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sushanth.pitd.ui.components.PlanItToDoBottomBar
import com.sushanth.pitd.ui.components.PlanItToDoTopBar
import com.sushanth.pitd.ui.navigation.All
import com.sushanth.pitd.ui.navigation.Done
import com.sushanth.pitd.ui.navigation.InProgress
import com.sushanth.pitd.ui.screen.all.AllScreen
import com.sushanth.pitd.ui.screen.done.DoneScreen
import com.sushanth.pitd.ui.screen.inprogress.InProgressScreen
import com.sushanth.pitd.ui.theme.PlanItToDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanItToDoApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlanItToDoApp(modifier: Modifier = Modifier) {
    PlanItToDoTheme {
        val navController = rememberNavController()
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
                )
            }
        }
    }
}


@Composable
fun PlanItToDoNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = All,
        modifier = modifier.padding(16.dp)
    ) {
        composable<All> { AllScreen() }
        composable<InProgress> { InProgressScreen() }
        composable<Done> { DoneScreen() }
    }
}