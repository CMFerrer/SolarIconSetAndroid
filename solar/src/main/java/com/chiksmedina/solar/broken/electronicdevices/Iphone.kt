package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Iphone: ImageVector
    get() {
        if (_iphone != null) {
            return _iphone!!
        }
        _iphone = Builder(
            name = "Iphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 14.0f)
                curveTo(20.0f, 17.7712f, 20.0f, 19.6569f, 18.8284f, 20.8284f)
                curveTo(17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f, 22.0f)
                curveTo(8.2288f, 22.0f, 6.3432f, 22.0f, 5.1716f, 20.8284f)
                curveTo(4.0f, 19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 6.2288f, 4.0f, 4.3432f, 5.1716f, 3.1716f)
                curveTo(6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7712f, 2.0f, 17.6569f, 2.0f, 18.8284f, 3.1716f)
                curveTo(20.0f, 4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7481f, 2.3774f)
                lineTo(16.664f, 2.5036f)
                curveTo(15.908f, 3.6377f, 15.5299f, 4.2048f, 14.9778f, 4.5479f)
                curveTo(14.868f, 4.6161f, 14.7539f, 4.6771f, 14.6362f, 4.7307f)
                curveTo(14.0444f, 4.9998f, 13.3629f, 4.9998f, 11.9999f, 4.9998f)
                curveTo(10.6369f, 4.9998f, 9.9554f, 4.9998f, 9.3636f, 4.7307f)
                curveTo(9.246f, 4.6771f, 9.1319f, 4.6161f, 9.0221f, 4.5479f)
                curveTo(8.4699f, 4.2048f, 8.0919f, 3.6377f, 7.3358f, 2.5036f)
                lineTo(7.2517f, 2.3774f)
            }
        }
            .build()
        return _iphone!!
    }

private var _iphone: ImageVector? = null
