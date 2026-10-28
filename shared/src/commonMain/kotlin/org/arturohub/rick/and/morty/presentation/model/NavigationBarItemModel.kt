package org.arturohub.rick.and.morty.presentation.model

import androidx.compose.ui.graphics.vector.ImageVector
import org.arturohub.rick.and.morty.presentation.navigation.Screen

data class NavigationBarItemModel(
    val icon: ImageVector,
    val label: String,
    val route: Screen
)
