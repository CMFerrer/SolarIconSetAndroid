package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Turntable: ImageVector
    get() {
        if (_turntable != null) {
            return _turntable!!
        }
        _turntable = Builder(name = "Turntable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.1716f, 3.4645f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.8284f, 20.5355f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.6646f, 16.3292f)
                curveTo(14.2941f, 16.5144f, 14.1439f, 16.9649f, 14.3292f, 17.3354f)
                curveTo(14.5144f, 17.7059f, 14.9649f, 17.8561f, 15.3354f, 17.6708f)
                lineTo(14.6646f, 16.3292f)
                close()
                moveTo(15.8944f, 16.5528f)
                lineTo(15.559f, 15.882f)
                lineTo(15.559f, 15.882f)
                lineTo(15.8944f, 16.5528f)
                close()
                moveTo(15.3354f, 17.6708f)
                lineTo(16.2298f, 17.2236f)
                lineTo(15.559f, 15.882f)
                lineTo(14.6646f, 16.3292f)
                lineTo(15.3354f, 17.6708f)
                close()
                moveTo(17.75f, 14.7639f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.25f)
                verticalLineTo(14.7639f)
                horizontalLineTo(17.75f)
                close()
                moveTo(16.2298f, 17.2236f)
                curveTo(17.1615f, 16.7578f, 17.75f, 15.8056f, 17.75f, 14.7639f)
                horizontalLineTo(16.25f)
                curveTo(16.25f, 15.2374f, 15.9825f, 15.6702f, 15.559f, 15.882f)
                lineTo(16.2298f, 17.2236f)
                close()
                moveTo(17.0f, 9.75f)
                curveTo(16.5858f, 9.75f, 16.25f, 9.4142f, 16.25f, 9.0f)
                horizontalLineTo(14.75f)
                curveTo(14.75f, 10.2426f, 15.7574f, 11.25f, 17.0f, 11.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(17.75f, 9.0f)
                curveTo(17.75f, 9.4142f, 17.4142f, 9.75f, 17.0f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(18.2426f, 11.25f, 19.25f, 10.2426f, 19.25f, 9.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.0f, 8.25f)
                curveTo(17.4142f, 8.25f, 17.75f, 8.5858f, 17.75f, 9.0f)
                horizontalLineTo(19.25f)
                curveTo(19.25f, 7.7574f, 18.2426f, 6.75f, 17.0f, 6.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(17.0f, 6.75f)
                curveTo(15.7574f, 6.75f, 14.75f, 7.7574f, 14.75f, 9.0f)
                horizontalLineTo(16.25f)
                curveTo(16.25f, 8.5858f, 16.5858f, 8.25f, 17.0f, 8.25f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _turntable!!
    }

private var _turntable: ImageVector? = null
