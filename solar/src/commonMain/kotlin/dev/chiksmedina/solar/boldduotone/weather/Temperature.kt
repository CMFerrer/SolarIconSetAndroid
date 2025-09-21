package dev.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.WeatherGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 16.5f)
                curveTo(17.5f, 19.5376f, 15.0376f, 22.0f, 12.0f, 22.0f)
                curveTo(8.9624f, 22.0f, 6.5f, 19.5376f, 6.5f, 16.5f)
                curveTo(6.5f, 14.7636f, 7.3046f, 13.2152f, 8.5614f, 12.2072f)
                curveTo(8.8251f, 11.9957f, 9.0f, 11.6857f, 9.0f, 11.3477f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.3431f, 10.3431f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                verticalLineTo(11.3477f)
                curveTo(15.0f, 11.6857f, 15.1749f, 11.9957f, 15.4386f, 12.2072f)
                curveTo(16.6954f, 13.2152f, 17.5f, 14.7636f, 17.5f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 5.0f)
                curveTo(12.75f, 4.5858f, 12.4142f, 4.25f, 12.0f, 4.25f)
                curveTo(11.5858f, 4.25f, 11.25f, 4.5858f, 11.25f, 5.0f)
                verticalLineTo(13.3804f)
                curveTo(11.25f, 13.8172f, 10.9527f, 14.1876f, 10.592f, 14.4339f)
                curveTo(9.9327f, 14.8841f, 9.5f, 15.6415f, 9.5f, 16.5f)
                curveTo(9.5f, 17.8807f, 10.6193f, 19.0f, 12.0f, 19.0f)
                curveTo(13.3807f, 19.0f, 14.5f, 17.8807f, 14.5f, 16.5f)
                curveTo(14.5f, 15.6415f, 14.0673f, 14.8841f, 13.408f, 14.4339f)
                curveTo(13.0473f, 14.1876f, 12.75f, 13.8172f, 12.75f, 13.3804f)
                verticalLineTo(5.0f)
                close()
            }
        }
            .build()
        return _temperature!!
    }

private var _temperature: ImageVector? = null
