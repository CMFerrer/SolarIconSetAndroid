package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Diskette: ImageVector
    get() {
        if (_diskette != null) {
            return _diskette!!
        }
        _diskette = Builder(
            name = "Diskette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 11.6585f, 22.0f, 11.4878f, 21.9848f, 11.3142f)
                curveTo(21.9142f, 10.5049f, 21.586f, 9.7126f, 21.0637f, 9.0903f)
                curveTo(20.9516f, 8.9569f, 20.828f, 8.8332f, 20.5806f, 8.5858f)
                lineTo(15.4142f, 3.4194f)
                curveTo(15.1668f, 3.1721f, 15.0431f, 3.0484f, 14.9097f, 2.9363f)
                curveTo(14.2874f, 2.414f, 13.4951f, 2.0858f, 12.6858f, 2.0152f)
                curveTo(12.5122f, 2.0f, 12.3415f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(21.0f)
                curveTo(17.0f, 19.1144f, 17.0f, 18.1716f, 16.4142f, 17.5858f)
                curveTo(15.8284f, 17.0f, 14.8856f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 17.0f, 8.1716f, 17.0f, 7.5858f, 17.5858f)
                curveTo(7.0f, 18.1716f, 7.0f, 19.1144f, 7.0f, 21.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.0f)
                horizontalLineTo(13.0f)
            }
        }
            .build()
        return _diskette!!
    }

private var _diskette: ImageVector? = null
