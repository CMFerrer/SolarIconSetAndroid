package com.chiksmedina.solar.broken.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.WeatherGroup

val WeatherGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(
            name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.3529f)
                curveTo(22.0f, 15.2939f, 21.0091f, 17.0061f, 19.5f, 18.0226f)
                moveTo(14.381f, 8.0272f)
                curveTo(14.9767f, 7.8191f, 15.6178f, 7.7059f, 16.2857f, 7.7059f)
                curveTo(16.9404f, 7.7059f, 17.5693f, 7.8147f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(6.8475f, 10.5567f, 6.5698f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(3.9188f, 10.5294f, 2.0f, 12.4256f, 2.0f, 14.7647f)
                curveTo(2.0f, 16.0746f, 2.6018f, 17.2457f, 3.547f, 18.0226f)
                moveTo(7.1162f, 10.6089f)
                curveTo(6.8871f, 9.9978f, 6.7619f, 9.3369f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 5.5283f, 9.3203f, 3.0f, 12.4762f, 3.0f)
                curveTo(15.4159f, 3.0f, 17.8371f, 5.1937f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(7.6806f, 10.7184f, 8.2053f, 10.9374f, 8.6667f, 11.2426f)
                moveTo(18.1551f, 8.015f)
                curveTo(18.8381f, 8.2485f, 19.4623f, 8.6065f, 20.0f, 9.0614f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 19.0f)
                lineTo(15.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 15.5f)
                lineTo(14.0f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                lineTo(10.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 15.5f)
                lineTo(9.5f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 19.0f)
                lineTo(5.5f, 21.0f)
            }
        }
            .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
