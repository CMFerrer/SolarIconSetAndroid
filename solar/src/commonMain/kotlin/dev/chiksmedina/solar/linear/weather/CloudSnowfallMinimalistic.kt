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

val WeatherGroup.CloudSnowfallMinimalistic: ImageVector
    get() {
        if (_cloudSnowfallMinimalistic != null) {
            return _cloudSnowfallMinimalistic!!
        }
        _cloudSnowfallMinimalistic = Builder(
            name = "CloudSnowfallMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 19.5f)
                curveTo(16.0f, 20.0523f, 15.5523f, 20.5f, 15.0f, 20.5f)
                curveTo(14.4477f, 20.5f, 14.0f, 20.0523f, 14.0f, 19.5f)
                curveTo(14.0f, 18.9477f, 14.4477f, 18.5f, 15.0f, 18.5f)
                curveTo(15.5523f, 18.5f, 16.0f, 18.9477f, 16.0f, 19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 16.5f)
                curveTo(16.0f, 17.0523f, 15.5523f, 17.5f, 15.0f, 17.5f)
                curveTo(14.4477f, 17.5f, 14.0f, 17.0523f, 14.0f, 16.5f)
                curveTo(14.0f, 15.9477f, 14.4477f, 15.5f, 15.0f, 15.5f)
                curveTo(15.5523f, 15.5f, 16.0f, 15.9477f, 16.0f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 19.5f)
                curveTo(10.0f, 20.0523f, 9.5523f, 20.5f, 9.0f, 20.5f)
                curveTo(8.4477f, 20.5f, 8.0f, 20.0523f, 8.0f, 19.5f)
                curveTo(8.0f, 18.9477f, 8.4477f, 18.5f, 9.0f, 18.5f)
                curveTo(9.5523f, 18.5f, 10.0f, 18.9477f, 10.0f, 19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 16.5f)
                curveTo(10.0f, 17.0523f, 9.5523f, 17.5f, 9.0f, 17.5f)
                curveTo(8.4477f, 17.5f, 8.0f, 17.0523f, 8.0f, 16.5f)
                curveTo(8.0f, 15.9477f, 8.4477f, 15.5f, 9.0f, 15.5f)
                curveTo(9.5523f, 15.5f, 10.0f, 15.9477f, 10.0f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.2857f, 19.0f)
                curveTo(3.9188f, 19.0f, 2.0f, 17.1038f, 2.0f, 14.7647f)
                curveTo(2.0f, 12.4256f, 3.9188f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(6.5698f, 10.5294f, 6.8475f, 10.5567f, 7.1162f, 10.6089f)
                moveTo(14.381f, 8.0272f)
                curveTo(14.9767f, 7.8191f, 15.6178f, 7.7059f, 16.2857f, 7.7059f)
                curveTo(16.9404f, 7.7059f, 17.5693f, 7.8147f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(6.8871f, 9.9978f, 6.7619f, 9.3369f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 5.5283f, 9.3203f, 3.0f, 12.4762f, 3.0f)
                curveTo(15.4159f, 3.0f, 17.8371f, 5.1937f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(7.6806f, 10.7184f, 8.2053f, 10.9374f, 8.6667f, 11.2426f)
                moveTo(18.1551f, 8.015f)
                curveTo(20.393f, 8.7802f, 22.0f, 10.8811f, 22.0f, 13.3529f)
                curveTo(22.0f, 16.0599f, 20.0726f, 18.3221f, 17.5f, 18.8722f)
            }
        }
            .build()
        return _cloudSnowfallMinimalistic!!
    }

private var _cloudSnowfallMinimalistic: ImageVector? = null
