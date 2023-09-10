package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.Boombox: ImageVector
    get() {
        if (_boombox != null) {
            return _boombox!!
        }
        _boombox = Builder(
            name = "Boombox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 9.5f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 4.1144f, 16.0f, 3.1716f, 15.4142f, 2.5858f)
                curveTo(14.8284f, 2.0f, 13.8856f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1144f, 2.0f, 9.1716f, 2.0f, 8.5858f, 2.5858f)
                curveTo(8.0f, 3.1716f, 8.0f, 4.1144f, 8.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 17.6569f, 9.6568f, 19.0f, 8.0f, 19.0f)
                curveTo(6.3432f, 19.0f, 5.0f, 17.6569f, 5.0f, 16.0f)
                curveTo(5.0f, 14.3431f, 6.3432f, 13.0f, 8.0f, 13.0f)
                curveTo(9.6568f, 13.0f, 11.0f, 14.3431f, 11.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.1213f, 18.1213f)
                curveTo(16.9497f, 19.2929f, 15.0503f, 19.2929f, 13.8787f, 18.1213f)
                curveTo(12.7071f, 16.9497f, 12.7071f, 15.0503f, 13.8787f, 13.8787f)
                curveTo(15.0503f, 12.7071f, 16.9497f, 12.7071f, 18.1213f, 13.8787f)
                curveTo(19.2929f, 15.0503f, 19.2929f, 16.9497f, 18.1213f, 18.1213f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.1213f, 13.8789f)
                lineTo(16.7071f, 15.2931f)
            }
        }
            .build()
        return _boombox!!
    }

private var _boombox: ImageVector? = null
