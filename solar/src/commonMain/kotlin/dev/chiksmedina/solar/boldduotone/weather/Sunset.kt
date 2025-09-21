package dev.chiksmedina.solar.boldduotone.weather

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
import dev.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(
            name = "Sunset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.9173f, 15.25f)
                horizontalLineTo(6.0827f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 15.25f, 1.25f, 15.5858f, 1.25f, 16.0f)
                curveTo(1.25f, 16.4142f, 1.5858f, 16.75f, 2.0f, 16.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 16.75f, 22.75f, 16.4142f, 22.75f, 16.0f)
                curveTo(22.75f, 15.5858f, 22.4142f, 15.25f, 22.0f, 15.25f)
                horizontalLineTo(17.9173f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.25f, 19.0f)
                curveTo(4.25f, 18.5858f, 4.5858f, 18.25f, 5.0f, 18.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 18.25f, 19.75f, 18.5858f, 19.75f, 19.0f)
                curveTo(19.75f, 19.4142f, 19.4142f, 19.75f, 19.0f, 19.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 19.75f, 4.25f, 19.4142f, 4.25f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.25f, 11.9998f)
                curveTo(5.25f, 13.1776f, 5.5521f, 14.2856f, 6.0827f, 15.2498f)
                horizontalLineTo(17.9173f)
                curveTo(18.4479f, 14.2856f, 18.75f, 13.1776f, 18.75f, 11.9998f)
                curveTo(18.75f, 8.5254f, 16.125f, 5.6641f, 12.75f, 5.291f)
                lineTo(11.25f, 5.291f)
                curveTo(7.875f, 5.6641f, 5.25f, 8.5254f, 5.25f, 11.9998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.4697f, 12.841f)
                curveTo(11.7626f, 13.1339f, 12.2374f, 13.1339f, 12.5303f, 12.841f)
                lineTo(14.5303f, 10.841f)
                curveTo(14.8232f, 10.5481f, 14.8232f, 10.0732f, 14.5303f, 9.7803f)
                curveTo(14.2374f, 9.4874f, 13.7626f, 9.4874f, 13.4697f, 9.7803f)
                lineTo(12.75f, 10.5f)
                verticalLineTo(5.2908f)
                curveTo(12.3028f, 5.2222f, 11.5637f, 5.2622f, 11.25f, 5.2908f)
                verticalLineTo(10.5f)
                lineTo(10.5303f, 9.7803f)
                curveTo(10.2374f, 9.4874f, 9.7626f, 9.4874f, 9.4697f, 9.7803f)
                curveTo(9.1768f, 10.0732f, 9.1768f, 10.5481f, 9.4697f, 10.841f)
                lineTo(11.4697f, 12.841f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.3984f, 4.3984f)
                curveTo(4.6913f, 4.1055f, 5.1662f, 4.1055f, 5.459f, 4.3984f)
                lineTo(5.8519f, 4.7912f)
                curveTo(6.1448f, 5.0841f, 6.1448f, 5.559f, 5.8519f, 5.8519f)
                curveTo(5.559f, 6.1448f, 5.0841f, 6.1448f, 4.7912f, 5.8519f)
                lineTo(4.3984f, 5.459f)
                curveTo(4.1055f, 5.1662f, 4.1055f, 4.6913f, 4.3984f, 4.3984f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.6009f, 4.3986f)
                curveTo(19.8938f, 4.6915f, 19.8938f, 5.1664f, 19.6009f, 5.4593f)
                lineTo(19.2081f, 5.8521f)
                curveTo(18.9152f, 6.145f, 18.4403f, 6.145f, 18.1474f, 5.8521f)
                curveTo(17.8545f, 5.5592f, 17.8545f, 5.0844f, 18.1474f, 4.7915f)
                lineTo(18.5402f, 4.3986f)
                curveTo(18.8331f, 4.1058f, 19.308f, 4.1058f, 19.6009f, 4.3986f)
                close()
            }
        }
            .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
