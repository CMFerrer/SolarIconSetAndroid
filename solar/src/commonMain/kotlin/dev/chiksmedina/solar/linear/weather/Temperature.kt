package dev.chiksmedina.solar.linear.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.WeatherGroup

val WeatherGroup.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = Builder(
            name = "Temperature", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(15.0376f, 22.0f, 17.5f, 19.5376f, 17.5f, 16.5f)
                curveTo(17.5f, 14.7636f, 16.6954f, 13.2152f, 15.4386f, 12.2072f)
                curveTo(15.1749f, 11.9957f, 15.0f, 11.6857f, 15.0f, 11.3477f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 3.3431f, 13.6569f, 2.0f, 12.0f, 2.0f)
                curveTo(10.3431f, 2.0f, 9.0f, 3.3431f, 9.0f, 5.0f)
                verticalLineTo(11.3477f)
                curveTo(9.0f, 11.6857f, 8.8251f, 11.9957f, 8.5614f, 12.2072f)
                curveTo(7.3046f, 13.2152f, 6.5f, 14.7636f, 6.5f, 16.5f)
                curveTo(6.5f, 19.5376f, 8.9624f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.4998f, 16.5f)
                curveTo(14.4998f, 17.8807f, 13.3805f, 19.0f, 11.9998f, 19.0f)
                curveTo(10.619f, 19.0f, 9.4998f, 17.8807f, 9.4998f, 16.5f)
                curveTo(9.4998f, 15.1193f, 10.619f, 14.0f, 11.9998f, 14.0f)
                curveTo(13.3805f, 14.0f, 14.4998f, 15.1193f, 14.4998f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(5.0f)
            }
        }
            .build()
        return _temperature!!
    }

private var _temperature: ImageVector? = null
