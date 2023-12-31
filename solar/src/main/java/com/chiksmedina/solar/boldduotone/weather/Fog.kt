package com.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(
            name = "Fog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 21.25f)
                curveTo(7.5858f, 21.25f, 7.25f, 21.5858f, 7.25f, 22.0f)
                curveTo(7.25f, 22.4142f, 7.5858f, 22.75f, 8.0f, 22.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 22.75f, 16.75f, 22.4142f, 16.75f, 22.0f)
                curveTo(16.75f, 21.5858f, 16.4142f, 21.25f, 16.0f, 21.25f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.4762f, 2.0f)
                curveTo(9.3203f, 2.0f, 6.7619f, 4.5283f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 8.3369f, 6.8871f, 8.9978f, 7.1162f, 9.6089f)
                curveTo(6.8475f, 9.5567f, 6.5698f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(3.9188f, 9.5294f, 2.0f, 11.4256f, 2.0f, 13.7647f)
                curveTo(2.0f, 14.2873f, 2.0958f, 14.7878f, 2.271f, 15.25f)
                horizontalLineTo(21.1917f)
                curveTo(21.705f, 14.403f, 22.0f, 13.412f, 22.0f, 12.3529f)
                curveTo(22.0f, 9.8811f, 20.393f, 7.7802f, 18.1551f, 7.015f)
                curveTo(17.8371f, 4.1937f, 15.4159f, 2.0f, 12.4762f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.249f)
                curveTo(1.5858f, 15.249f, 1.25f, 15.5848f, 1.25f, 15.999f)
                curveTo(1.25f, 16.4132f, 1.5858f, 16.749f, 2.0f, 16.749f)
                lineTo(22.0f, 16.7488f)
                curveTo(22.4142f, 16.7488f, 22.75f, 16.413f, 22.75f, 15.9988f)
                curveTo(22.75f, 15.5846f, 22.4142f, 15.2488f, 22.0f, 15.2488f)
                lineTo(2.0f, 15.249f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 18.25f)
                curveTo(4.5858f, 18.25f, 4.25f, 18.5858f, 4.25f, 19.0f)
                curveTo(4.25f, 19.4142f, 4.5858f, 19.75f, 5.0f, 19.75f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 19.75f, 19.75f, 19.4142f, 19.75f, 19.0f)
                curveTo(19.75f, 18.5858f, 19.4142f, 18.25f, 19.0f, 18.25f)
                horizontalLineTo(5.0f)
                close()
            }
        }
            .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
