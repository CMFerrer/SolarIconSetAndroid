package dev.chiksmedina.solar.lineduotone.weather

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
import dev.chiksmedina.solar.lineduotone.WeatherGroup

val WeatherGroup.CloudSun2: ImageVector
    get() {
        if (_cloudSun2 != null) {
            return _cloudSun2!!
        }
        _cloudSun2 = Builder(
            name = "CloudSun2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.381f, 11.0272f)
                curveTo(14.9767f, 10.8191f, 15.6178f, 10.7059f, 16.2857f, 10.7059f)
                curveTo(16.9404f, 10.7059f, 17.5693f, 10.8147f, 18.1551f, 11.015f)
                moveTo(7.1162f, 13.6089f)
                curveTo(6.8475f, 13.5567f, 6.5698f, 13.5294f, 6.2857f, 13.5294f)
                curveTo(3.9188f, 13.5294f, 2.0f, 15.4256f, 2.0f, 17.7647f)
                curveTo(2.0f, 20.1038f, 3.9188f, 22.0f, 6.2857f, 22.0f)
                horizontalLineTo(16.2857f)
                curveTo(19.4416f, 22.0f, 22.0f, 19.4717f, 22.0f, 16.3529f)
                curveTo(22.0f, 13.8811f, 20.393f, 11.7802f, 18.1551f, 11.015f)
                moveTo(7.1162f, 13.6089f)
                curveTo(6.8871f, 12.9978f, 6.7619f, 12.3369f, 6.7619f, 11.6471f)
                curveTo(6.7619f, 8.5283f, 9.3203f, 6.0f, 12.4762f, 6.0f)
                curveTo(15.4159f, 6.0f, 17.8371f, 8.1937f, 18.1551f, 11.015f)
                moveTo(7.1162f, 13.6089f)
                curveTo(7.6806f, 13.7184f, 8.2053f, 13.9374f, 8.6667f, 14.2426f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 4.5f)
                curveTo(6.067f, 4.5f, 4.5f, 6.067f, 4.5f, 8.0f)
                curveTo(4.5f, 9.3962f, 5.3175f, 10.6015f, 6.5f, 11.1632f)
                moveTo(8.0f, 4.5f)
                curveTo(8.7436f, 4.5f, 9.4331f, 4.7319f, 10.0f, 5.1273f)
                moveTo(8.0f, 4.5f)
                curveTo(7.2564f, 4.5f, 6.5669f, 4.7319f, 6.0f, 5.1273f)
                moveTo(8.0f, 4.5f)
                curveTo(8.9537f, 4.5f, 9.8182f, 4.8814f, 10.4495f, 5.5f)
                moveTo(8.0f, 4.5f)
                curveTo(7.0464f, 4.5f, 6.1818f, 4.8814f, 5.5505f, 5.5f)
                moveTo(8.0f, 4.5f)
                curveTo(9.2732f, 4.5f, 10.3876f, 5.1798f, 11.0f, 6.1962f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 2.0f)
                verticalLineTo(2.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.5f, 7.5f)
                lineTo(2.0f, 7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.3887f, 3.6108f)
                lineTo(11.1726f, 3.8269f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8273f, 11.1729f)
                lineTo(3.6112f, 11.3889f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8273f, 3.8272f)
                lineTo(3.6112f, 3.6111f)
            }
        }
            .build()
        return _cloudSun2!!
    }

private var _cloudSun2: ImageVector? = null
