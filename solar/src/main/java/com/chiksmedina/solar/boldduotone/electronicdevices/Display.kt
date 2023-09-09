package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
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

public val ElectronicDevicesGroup.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(name = "Display", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.8787f, 3.8435f)
                curveTo(2.0f, 4.687f, 2.0f, 6.0447f, 2.0f, 8.7599f)
                verticalLineTo(9.7199f)
                curveTo(2.0f, 12.4352f, 2.0f, 13.7928f, 2.8787f, 14.6363f)
                curveTo(3.7574f, 15.4799f, 5.1716f, 15.4799f, 8.0f, 15.4799f)
                horizontalLineTo(11.25f)
                horizontalLineTo(12.75f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 15.4799f, 20.2426f, 15.4799f, 21.1213f, 14.6363f)
                curveTo(22.0f, 13.7928f, 22.0f, 12.4352f, 22.0f, 9.7199f)
                verticalLineTo(8.7599f)
                curveTo(22.0f, 6.0447f, 22.0f, 4.687f, 21.1213f, 3.8435f)
                curveTo(20.2426f, 3.0f, 18.8284f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 3.0f, 3.7574f, 3.0f, 2.8787f, 3.8435f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.2374f, 19.5964f)
                lineTo(12.7502f, 17.8405f)
                verticalLineTo(15.4795f)
                horizontalLineTo(11.2502f)
                verticalLineTo(17.8405f)
                lineTo(5.763f, 19.5964f)
                curveTo(5.3701f, 19.7221f, 5.1577f, 20.1299f, 5.2887f, 20.5071f)
                curveTo(5.4197f, 20.8844f, 5.8444f, 21.0882f, 6.2374f, 20.9625f)
                lineTo(12.0002f, 19.1184f)
                lineTo(17.763f, 20.9625f)
                curveTo(18.156f, 21.0882f, 18.5807f, 20.8844f, 18.7117f, 20.5071f)
                curveTo(18.8427f, 20.1299f, 18.6303f, 19.7221f, 18.2374f, 19.5964f)
                close()
            }
        }
        .build()
        return _display!!
    }

private var _display: ImageVector? = null
