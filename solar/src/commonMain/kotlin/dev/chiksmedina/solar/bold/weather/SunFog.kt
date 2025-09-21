package dev.chiksmedina.solar.bold.weather

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
import dev.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.SunFog: ImageVector
    get() {
        if (_sunFog != null) {
            return _sunFog!!
        }
        _sunFog = Builder(
            name = "SunFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 19.0f)
                curveTo(4.25f, 18.5858f, 4.5858f, 18.25f, 5.0f, 18.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 18.25f, 19.75f, 18.5858f, 19.75f, 19.0f)
                curveTo(19.75f, 19.4142f, 19.4142f, 19.75f, 19.0f, 19.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 19.75f, 4.25f, 19.4142f, 4.25f, 19.0f)
                close()
                moveTo(7.25f, 22.0f)
                curveTo(7.25f, 21.5858f, 7.5858f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.25f, 16.75f, 21.5858f, 16.75f, 22.0f)
                curveTo(16.75f, 22.4142f, 16.4142f, 22.75f, 16.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.75f, 7.25f, 22.4142f, 7.25f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0827f, 15.25f)
                curveTo(5.5521f, 14.2858f, 5.25f, 13.1778f, 5.25f, 12.0f)
                curveTo(5.25f, 8.2721f, 8.2721f, 5.25f, 12.0f, 5.25f)
                curveTo(15.7279f, 5.25f, 18.75f, 8.2721f, 18.75f, 12.0f)
                curveTo(18.75f, 13.1778f, 18.4479f, 14.2858f, 17.9173f, 15.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 15.25f, 22.75f, 15.5858f, 22.75f, 16.0f)
                curveTo(22.75f, 16.4142f, 22.4142f, 16.75f, 22.0f, 16.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 16.75f, 1.25f, 16.4142f, 1.25f, 16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                horizontalLineTo(6.0827f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(12.75f, 3.4142f, 12.4142f, 3.75f, 12.0f, 3.75f)
                curveTo(11.5858f, 3.75f, 11.25f, 3.4142f, 11.25f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(4.3986f, 4.3986f)
                curveTo(4.6915f, 4.1057f, 5.1664f, 4.1057f, 5.4593f, 4.3986f)
                lineTo(5.8521f, 4.7915f)
                curveTo(6.145f, 5.0843f, 6.145f, 5.5592f, 5.8521f, 5.8521f)
                curveTo(5.5592f, 6.145f, 5.0843f, 6.145f, 4.7915f, 5.8521f)
                lineTo(4.3986f, 5.4593f)
                curveTo(4.1057f, 5.1664f, 4.1057f, 4.6915f, 4.3986f, 4.3986f)
                close()
                moveTo(19.6011f, 4.3989f)
                curveTo(19.894f, 4.6918f, 19.894f, 5.1666f, 19.6011f, 5.4595f)
                lineTo(19.2083f, 5.8524f)
                curveTo(18.9154f, 6.1453f, 18.4405f, 6.1453f, 18.1476f, 5.8524f)
                curveTo(17.8547f, 5.5595f, 17.8547f, 5.0846f, 18.1476f, 4.7917f)
                lineTo(18.5405f, 4.3989f)
                curveTo(18.8334f, 4.106f, 19.3082f, 4.106f, 19.6011f, 4.3989f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(3.0f)
                curveTo(3.4142f, 11.25f, 3.75f, 11.5858f, 3.75f, 12.0f)
                curveTo(3.75f, 12.4142f, 3.4142f, 12.75f, 3.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(20.25f, 12.0f)
                curveTo(20.25f, 11.5858f, 20.5858f, 11.25f, 21.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(21.0f)
                curveTo(20.5858f, 12.75f, 20.25f, 12.4142f, 20.25f, 12.0f)
                close()
            }
        }
            .build()
        return _sunFog!!
    }

private var _sunFog: ImageVector? = null
