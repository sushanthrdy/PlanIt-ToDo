package com.sushanth.pitd.ui.components

import android.util.Log
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sushanth.pitd.ui.navigation.TopLevelRoute
import com.sushanth.pitd.ui.navigation.topLevelRoutes

@Composable
fun PlanItToDoBottomBar(navController: NavController, modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        topLevelRoutes.forEach { topLevelRoute ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any { it.hasRoute(topLevelRoute.route::class) } == true,
                onClick = {
                    navController.navigateSingleTopTo(topLevelRoute)
                },
                icon = {
                    Icon(
                        imageVector = topLevelRoute.icon,
                        contentDescription = topLevelRoute.name
                    )
                },
                label = { Text(text = topLevelRoute.name) })
        }
    }
}

private fun NavController.navigateSingleTopTo(topLevelRoute: TopLevelRoute<out Any>) = this.navigate(topLevelRoute.route) {
    Log.i("MyTag", "navigateSingleTopTo: ${this@navigateSingleTopTo.graph.findStartDestination()}")
    popUpTo(this@navigateSingleTopTo.graph.findStartDestination().id) {
        saveState = true
    }
    launchSingleTop = true
    restoreState = true
}