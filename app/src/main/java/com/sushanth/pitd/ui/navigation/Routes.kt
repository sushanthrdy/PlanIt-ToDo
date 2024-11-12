package com.sushanth.pitd.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

@Serializable
object All
@Serializable
object InProgress
@Serializable
object Done

data class TopLevelRoute<T:Any>(val name:String,val route:T,val icon: ImageVector)

val topLevelRoutes = listOf(
    TopLevelRoute("All",All, Icons.AutoMirrored.Filled.List),
    TopLevelRoute("In Progress",InProgress, Icons.Rounded.Refresh),
    TopLevelRoute("Done",Done, Icons.Rounded.CheckCircle)
)