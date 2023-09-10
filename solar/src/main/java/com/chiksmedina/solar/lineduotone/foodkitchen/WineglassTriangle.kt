package com.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.FoodKitchenGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2439f, 21.0f)
                horizontalLineTo(7.7561f)
                moveTo(4.701f, 3.0f)
                horizontalLineTo(19.2991f)
                curveTo(20.7999f, 3.0f, 21.5624f, 4.7941f, 20.5162f, 5.8638f)
                lineTo(12.7149f, 13.8404f)
                curveTo(12.3227f, 14.2415f, 11.6773f, 14.2415f, 11.2851f, 13.8404f)
                lineTo(3.4838f, 5.8638f)
                curveTo(2.4376f, 4.7941f, 3.2001f, 3.0f, 4.701f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 14.5713f)
                verticalLineTo(20.9999f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.4731f, 9.75f)
                horizontalLineTo(16.5268f)
            }
        }
            .build()
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: ImageVector? = null
