package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(name = "Devices", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0088f, 8.0f)
                curveTo(6.0447f, 5.5204f, 6.2286f, 4.1147f, 7.1717f, 3.1716f)
                curveTo(8.3432f, 2.0f, 10.2289f, 2.0f, 14.0001f, 2.0f)
                curveTo(17.7713f, 2.0f, 19.657f, 2.0f, 20.8285f, 3.1716f)
                curveTo(22.0001f, 4.3432f, 22.0001f, 6.2288f, 22.0001f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0001f, 17.7712f, 22.0001f, 19.6569f, 20.8285f, 20.8284f)
                curveTo(19.657f, 22.0f, 17.7713f, 22.0f, 14.0001f, 22.0f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 14.5f)
                curveTo(2.0f, 13.0955f, 2.0f, 12.3933f, 2.3371f, 11.8889f)
                curveTo(2.483f, 11.6705f, 2.6705f, 11.483f, 2.8889f, 11.3371f)
                curveTo(3.3933f, 11.0f, 4.0955f, 11.0f, 5.5f, 11.0f)
                curveTo(6.9045f, 11.0f, 7.6067f, 11.0f, 8.1111f, 11.3371f)
                curveTo(8.3295f, 11.483f, 8.517f, 11.6705f, 8.6629f, 11.8889f)
                curveTo(9.0f, 12.3933f, 9.0f, 13.0955f, 9.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(9.0f, 19.9045f, 9.0f, 20.6067f, 8.6629f, 21.1111f)
                curveTo(8.517f, 21.3295f, 8.3295f, 21.517f, 8.1111f, 21.6629f)
                curveTo(7.6067f, 22.0f, 6.9045f, 22.0f, 5.5f, 22.0f)
                curveTo(4.0955f, 22.0f, 3.3933f, 22.0f, 2.8889f, 21.6629f)
                curveTo(2.6705f, 21.517f, 2.483f, 21.3295f, 2.3371f, 21.1111f)
                curveTo(2.0f, 20.6067f, 2.0f, 19.9045f, 2.0f, 18.5f)
                verticalLineTo(14.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 19.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
