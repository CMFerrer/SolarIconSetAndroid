package com.chiksmedina.solar.bold.electronicdevices

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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(
            name = "Devices", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                curveTo(12.3009f, 22.0f, 10.9846f, 22.0f, 9.9439f, 21.8929f)
                curveTo(10.2787f, 21.368f, 10.3977f, 20.8107f, 10.4502f, 20.2949f)
                curveTo(10.5001f, 19.8039f, 10.5001f, 19.2114f, 10.5f, 18.566f)
                lineTo(10.5f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(10.5f, 14.434f)
                curveTo(10.5001f, 13.7886f, 10.5001f, 13.1961f, 10.4502f, 12.7051f)
                curveTo(10.396f, 12.1723f, 10.2708f, 11.5953f, 9.9101f, 11.0555f)
                curveTo(9.6548f, 10.6733f, 9.3267f, 10.3452f, 8.9445f, 10.0899f)
                curveTo(8.4047f, 9.7292f, 7.8277f, 9.604f, 7.2949f, 9.5498f)
                curveTo(6.9162f, 9.5113f, 6.4772f, 9.5025f, 6.0001f, 9.5006f)
                curveTo(6.0024f, 6.0599f, 6.0529f, 4.2902f, 7.1716f, 3.1716f)
                curveTo(8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f, 2.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                close()
                moveTo(11.25f, 19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 18.25f, 17.75f, 18.5858f, 17.75f, 19.0f)
                curveTo(17.75f, 19.4142f, 17.4142f, 19.75f, 17.0f, 19.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 19.75f, 11.25f, 19.4142f, 11.25f, 19.0f)
                close()
            }
        }
            .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
