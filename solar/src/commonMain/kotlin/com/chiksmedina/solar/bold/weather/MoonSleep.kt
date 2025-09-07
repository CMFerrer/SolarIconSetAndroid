package com.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.MoonSleep: ImageVector
    get() {
        if (_moonSleep != null) {
            return _moonSleep!!
        }
        _moonSleep = Builder(
            name = "MoonSleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 2.75f)
                curveTo(17.5858f, 2.75f, 17.25f, 2.4142f, 17.25f, 2.0f)
                curveTo(17.25f, 1.5858f, 17.5858f, 1.25f, 18.0f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.3034f, 1.25f, 22.5768f, 1.4327f, 22.6929f, 1.713f)
                curveTo(22.809f, 1.9932f, 22.7449f, 2.3158f, 22.5304f, 2.5303f)
                lineTo(19.8107f, 5.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 5.25f, 22.75f, 5.5858f, 22.75f, 6.0f)
                curveTo(22.75f, 6.4142f, 22.4142f, 6.75f, 22.0f, 6.75f)
                horizontalLineTo(18.0f)
                curveTo(17.6967f, 6.75f, 17.4232f, 6.5673f, 17.3071f, 6.287f)
                curveTo(17.191f, 6.0068f, 17.2552f, 5.6842f, 17.4697f, 5.4697f)
                lineTo(20.1894f, 2.75f)
                horizontalLineTo(18.0f)
                close()
                moveTo(13.5f, 8.75f)
                curveTo(13.0858f, 8.75f, 12.75f, 8.4142f, 12.75f, 8.0f)
                curveTo(12.75f, 7.5858f, 13.0858f, 7.25f, 13.5f, 7.25f)
                horizontalLineTo(16.5f)
                curveTo(16.8034f, 7.25f, 17.0768f, 7.4327f, 17.1929f, 7.713f)
                curveTo(17.309f, 7.9932f, 17.2449f, 8.3158f, 17.0304f, 8.5303f)
                lineTo(15.3107f, 10.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 10.25f, 17.25f, 10.5858f, 17.25f, 11.0f)
                curveTo(17.25f, 11.4142f, 16.9142f, 11.75f, 16.5f, 11.75f)
                horizontalLineTo(13.5f)
                curveTo(13.1967f, 11.75f, 12.9232f, 11.5673f, 12.8071f, 11.287f)
                curveTo(12.691f, 11.0068f, 12.7552f, 10.6842f, 12.9697f, 10.4697f)
                lineTo(14.6894f, 8.75f)
                horizontalLineTo(13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5373f, 21.3065f, 11.4608f, 21.0672f, 11.8568f)
                curveTo(19.9289f, 13.7406f, 17.8615f, 15.0f, 15.5f, 15.0f)
                curveTo(11.9101f, 15.0f, 9.0f, 12.0899f, 9.0f, 8.5f)
                curveTo(9.0f, 6.1385f, 10.2594f, 4.0711f, 12.1432f, 2.9328f)
                curveTo(12.5392f, 2.6935f, 12.4627f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
            .build()
        return _moonSleep!!
    }

private var _moonSleep: ImageVector? = null
