package dev.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.MoonFog: ImageVector
    get() {
        if (_moonFog != null) {
            return _moonFog!!
        }
        _moonFog = Builder(
            name = "MoonFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(12.4627f, 2.0f, 12.5392f, 2.6935f, 12.1432f, 2.9328f)
                curveTo(10.2594f, 4.0711f, 9.0f, 6.1385f, 9.0f, 8.5f)
                curveTo(9.0f, 12.0899f, 11.9101f, 15.0f, 15.5f, 15.0f)
                curveTo(17.8615f, 15.0f, 19.9289f, 13.7406f, 21.0672f, 11.8568f)
                curveTo(21.3065f, 11.4608f, 22.0f, 11.5373f, 22.0f, 12.0f)
                curveTo(22.0f, 13.1377f, 21.81f, 14.231f, 21.46f, 15.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 15.25f, 22.75f, 15.5858f, 22.75f, 16.0f)
                curveTo(22.75f, 16.4142f, 22.4142f, 16.75f, 22.0f, 16.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 16.75f, 1.25f, 16.4142f, 1.25f, 16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                horizontalLineTo(2.54f)
                curveTo(2.19f, 14.231f, 2.0f, 13.1377f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.9001f, 2.3072f)
                curveTo(19.7392f, 1.8976f, 19.1616f, 1.8976f, 19.0007f, 2.3072f)
                lineTo(18.5703f, 3.4025f)
                curveTo(18.5212f, 3.5275f, 18.4226f, 3.6265f, 18.298f, 3.6758f)
                lineTo(17.2067f, 4.1078f)
                curveTo(16.7986f, 4.2693f, 16.7986f, 4.849f, 17.2067f, 5.0105f)
                lineTo(18.298f, 5.4425f)
                curveTo(18.4226f, 5.4918f, 18.5212f, 5.5908f, 18.5703f, 5.7159f)
                lineTo(19.0007f, 6.8112f)
                curveTo(19.1616f, 7.2207f, 19.7392f, 7.2207f, 19.9001f, 6.8112f)
                lineTo(20.3305f, 5.7159f)
                curveTo(20.3796f, 5.5908f, 20.4782f, 5.4918f, 20.6028f, 5.4425f)
                lineTo(21.6941f, 5.0105f)
                curveTo(22.1022f, 4.849f, 22.1022f, 4.2693f, 21.6941f, 4.1078f)
                lineTo(20.6028f, 3.6758f)
                curveTo(20.4782f, 3.6265f, 20.3796f, 3.5275f, 20.3305f, 3.4025f)
                lineTo(19.9001f, 2.3072f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0328f, 8.1297f)
                curveTo(15.8718f, 7.7201f, 15.2943f, 7.7201f, 15.1333f, 8.1297f)
                lineTo(14.9764f, 8.529f)
                curveTo(14.9273f, 8.6541f, 14.8287f, 8.753f, 14.7041f, 8.8024f)
                lineTo(14.3062f, 8.9599f)
                curveTo(13.8981f, 9.1214f, 13.8981f, 9.7011f, 14.3062f, 9.8626f)
                lineTo(14.7041f, 10.0201f)
                curveTo(14.8287f, 10.0694f, 14.9273f, 10.1684f, 14.9764f, 10.2935f)
                lineTo(15.1333f, 10.6928f)
                curveTo(15.2943f, 11.1024f, 15.8718f, 11.1024f, 16.0328f, 10.6928f)
                lineTo(16.1897f, 10.2935f)
                curveTo(16.2388f, 10.1684f, 16.3374f, 10.0694f, 16.462f, 10.0201f)
                lineTo(16.8599f, 9.8626f)
                curveTo(17.268f, 9.7011f, 17.268f, 9.1214f, 16.8599f, 8.9599f)
                lineTo(16.462f, 8.8024f)
                curveTo(16.3374f, 8.753f, 16.2388f, 8.6541f, 16.1897f, 8.529f)
                lineTo(16.0328f, 8.1297f)
                close()
            }
        }
            .build()
        return _moonFog!!
    }

private var _moonFog: ImageVector? = null
