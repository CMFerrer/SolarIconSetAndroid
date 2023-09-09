package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

public val FoodKitchenGroup.WineglassTriangle: ImageVector
    get() {
        if (_wineglassTriangle != null) {
            return _wineglassTriangle!!
        }
        _wineglassTriangle = Builder(name = "WineglassTriangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2991f, 3.0f)
                horizontalLineTo(4.701f)
                curveTo(3.2001f, 3.0f, 2.4376f, 4.7941f, 3.4838f, 5.8638f)
                lineTo(6.2351f, 9.0f)
                horizontalLineTo(17.7649f)
                lineTo(20.5162f, 5.8638f)
                curveTo(21.5624f, 4.7941f, 20.7999f, 3.0f, 19.2991f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.449f, 10.5f)
                horizontalLineTo(7.551f)
                lineTo(11.2498f, 14.7162f)
                verticalLineTo(20.2499f)
                horizontalLineTo(7.7559f)
                curveTo(7.3417f, 20.2499f, 7.0059f, 20.5856f, 7.0059f, 20.9999f)
                curveTo(7.0059f, 21.4141f, 7.3417f, 21.7499f, 7.7559f, 21.7499f)
                horizontalLineTo(16.2437f)
                curveTo(16.6579f, 21.7499f, 16.9937f, 21.4141f, 16.9937f, 20.9999f)
                curveTo(16.9937f, 20.5856f, 16.6579f, 20.2499f, 16.2437f, 20.2499f)
                horizontalLineTo(12.7498f)
                verticalLineTo(14.7168f)
                lineTo(16.449f, 10.5f)
                close()
            }
        }
        .build()
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: ImageVector? = null
