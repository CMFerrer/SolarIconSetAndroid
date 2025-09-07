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

val WeatherGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(
            name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 15.3137f, 15.3137f, 18.0f, 12.0f, 18.0f)
                curveTo(8.6863f, 18.0f, 6.0f, 15.3137f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
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
                moveTo(18.1476f, 18.1476f)
                curveTo(18.4405f, 17.8547f, 18.9154f, 17.8547f, 19.2083f, 18.1476f)
                lineTo(19.6011f, 18.5405f)
                curveTo(19.894f, 18.8334f, 19.894f, 19.3082f, 19.6011f, 19.6011f)
                curveTo(19.3082f, 19.894f, 18.8334f, 19.894f, 18.5405f, 19.6011f)
                lineTo(18.1476f, 19.2083f)
                curveTo(17.8547f, 18.9154f, 17.8547f, 18.4405f, 18.1476f, 18.1476f)
                close()
                moveTo(5.8521f, 18.1479f)
                curveTo(6.145f, 18.4408f, 6.145f, 18.9157f, 5.8521f, 19.2086f)
                lineTo(5.4593f, 19.6014f)
                curveTo(5.1664f, 19.8943f, 4.6915f, 19.8943f, 4.3986f, 19.6014f)
                curveTo(4.1057f, 19.3085f, 4.1057f, 18.8336f, 4.3986f, 18.5407f)
                lineTo(4.7915f, 18.1479f)
                curveTo(5.0843f, 17.855f, 5.5592f, 17.855f, 5.8521f, 18.1479f)
                close()
                moveTo(12.0f, 20.25f)
                curveTo(12.4142f, 20.25f, 12.75f, 20.5858f, 12.75f, 21.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(21.0f)
                curveTo(11.25f, 20.5858f, 11.5858f, 20.25f, 12.0f, 20.25f)
                close()
            }
        }
            .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
