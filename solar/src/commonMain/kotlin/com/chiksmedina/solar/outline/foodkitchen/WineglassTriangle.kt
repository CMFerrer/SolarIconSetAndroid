package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.WineglassTriangle: ImageVector
    get() {
        if (_wineglassTriangle != null) {
            return _wineglassTriangle!!
        }
        _wineglassTriangle = Builder(
            name = "WineglassTriangle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.9476f, 6.3882f)
                curveTo(1.4305f, 4.837f, 2.5453f, 2.25f, 4.701f, 2.25f)
                horizontalLineTo(19.2991f)
                curveTo(21.4547f, 2.25f, 22.5695f, 4.837f, 21.0524f, 6.3882f)
                lineTo(12.75f, 14.8772f)
                verticalLineTo(20.25f)
                horizontalLineTo(16.2439f)
                curveTo(16.6581f, 20.25f, 16.9939f, 20.5858f, 16.9939f, 21.0f)
                curveTo(16.9939f, 21.4142f, 16.6581f, 21.75f, 16.2439f, 21.75f)
                horizontalLineTo(7.7561f)
                curveTo(7.3419f, 21.75f, 7.0061f, 21.4142f, 7.0061f, 21.0f)
                curveTo(7.0061f, 20.5858f, 7.3419f, 20.25f, 7.7561f, 20.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.8772f)
                lineTo(2.9476f, 6.3882f)
                close()
                moveTo(12.0f, 13.4988f)
                lineTo(14.9329f, 10.5f)
                horizontalLineTo(9.0671f)
                lineTo(12.0f, 13.4988f)
                close()
                moveTo(7.6001f, 9.0f)
                horizontalLineTo(16.3999f)
                lineTo(19.98f, 5.3394f)
                curveTo(20.5553f, 4.7512f, 20.1451f, 3.75f, 19.2991f, 3.75f)
                horizontalLineTo(4.701f)
                curveTo(3.8549f, 3.75f, 3.4447f, 4.7512f, 4.02f, 5.3394f)
                lineTo(7.6001f, 9.0f)
                close()
            }
        }
            .build()
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: ImageVector? = null
