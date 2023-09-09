package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Turntable: ImageVector
    get() {
        if (_turntable != null) {
            return _turntable!!
        }
        _turntable = Builder(name = "Turntable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1716f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.1716f, 20.5355f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.8284f, 3.4645f)
                curveTo(19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 12.0f)
                curveTo(5.25f, 9.3766f, 7.3766f, 7.25f, 10.0f, 7.25f)
                curveTo(12.6234f, 7.25f, 14.75f, 9.3766f, 14.75f, 12.0f)
                curveTo(14.75f, 14.6234f, 12.6234f, 16.75f, 10.0f, 16.75f)
                curveTo(7.3766f, 16.75f, 5.25f, 14.6234f, 5.25f, 12.0f)
                close()
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 10.2051f, 8.2051f, 8.75f, 10.0f, 8.75f)
                curveTo(11.7949f, 8.75f, 13.25f, 10.2051f, 13.25f, 12.0f)
                curveTo(13.25f, 13.7949f, 11.7949f, 15.25f, 10.0f, 15.25f)
                curveTo(8.2051f, 15.25f, 6.75f, 13.7949f, 6.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.75f, 9.0f)
                curveTo(14.75f, 7.7574f, 15.7574f, 6.75f, 17.0f, 6.75f)
                curveTo(18.2426f, 6.75f, 19.25f, 7.7574f, 19.25f, 9.0f)
                curveTo(19.25f, 9.9797f, 18.6239f, 10.8131f, 17.75f, 11.122f)
                verticalLineTo(14.7639f)
                curveTo(17.75f, 15.8056f, 17.1615f, 16.7578f, 16.2298f, 17.2236f)
                lineTo(15.3354f, 17.6708f)
                curveTo(14.9649f, 17.8561f, 14.5144f, 17.7059f, 14.3292f, 17.3354f)
                curveTo(14.1439f, 16.9649f, 14.2941f, 16.5144f, 14.6646f, 16.3292f)
                lineTo(15.559f, 15.882f)
                curveTo(15.9825f, 15.6702f, 16.25f, 15.2374f, 16.25f, 14.7639f)
                verticalLineTo(11.122f)
                curveTo(15.3761f, 10.8131f, 14.75f, 9.9797f, 14.75f, 9.0f)
                close()
                moveTo(16.25f, 9.0f)
                curveTo(16.25f, 8.5858f, 16.5858f, 8.25f, 17.0f, 8.25f)
                curveTo(17.4142f, 8.25f, 17.75f, 8.5858f, 17.75f, 9.0f)
                curveTo(17.75f, 9.4142f, 17.4142f, 9.75f, 17.0f, 9.75f)
                curveTo(16.5858f, 9.75f, 16.25f, 9.4142f, 16.25f, 9.0f)
                close()
            }
        }
        .build()
        return _turntable!!
    }

private var _turntable: ImageVector? = null
