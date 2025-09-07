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

val ElectronicDevicesGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(
            name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.75f, 12.25f)
                verticalLineTo(11.5f)
                curveTo(15.75f, 11.0858f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5858f, 10.75f, 14.25f, 11.0858f, 14.25f, 11.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(7.0f)
                curveTo(6.3096f, 12.25f, 5.75f, 11.6904f, 5.75f, 11.0f)
                curveTo(5.75f, 10.3096f, 6.3096f, 9.75f, 7.0f, 9.75f)
                horizontalLineTo(17.0f)
                curveTo(17.6904f, 9.75f, 18.25f, 10.3096f, 18.25f, 11.0f)
                curveTo(18.25f, 11.6904f, 17.6904f, 12.25f, 17.0f, 12.25f)
                horizontalLineTo(15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.75f, 17.0f)
                curveTo(6.75f, 16.5858f, 7.0858f, 16.25f, 7.5f, 16.25f)
                curveTo(7.9142f, 16.25f, 8.25f, 16.5858f, 8.25f, 17.0f)
                curveTo(8.25f, 17.4142f, 7.9142f, 17.75f, 7.5f, 17.75f)
                curveTo(7.0858f, 17.75f, 6.75f, 17.4142f, 6.75f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.3195f, 3.6788f)
                curveTo(15.6943f, 3.5024f, 15.8552f, 3.0556f, 15.6788f, 2.6808f)
                curveTo(15.5024f, 2.306f, 15.0556f, 2.1452f, 14.6808f, 2.3216f)
                lineTo(6.7669f, 6.0458f)
                curveTo(5.0315f, 6.1349f, 3.9457f, 6.3975f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                curveTo(22.0f, 10.2288f, 22.0f, 8.3431f, 20.8284f, 7.1716f)
                curveTo(19.6569f, 6.0f, 17.7712f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(10.387f)
                lineTo(15.3195f, 3.6788f)
                close()
                moveTo(7.0f, 8.25f)
                curveTo(5.4812f, 8.25f, 4.25f, 9.4812f, 4.25f, 11.0f)
                curveTo(4.25f, 12.5188f, 5.4812f, 13.75f, 7.0f, 13.75f)
                horizontalLineTo(17.0f)
                curveTo(18.5188f, 13.75f, 19.75f, 12.5188f, 19.75f, 11.0f)
                curveTo(19.75f, 9.4812f, 18.5188f, 8.25f, 17.0f, 8.25f)
                horizontalLineTo(7.0f)
                close()
                moveTo(5.25f, 17.0f)
                curveTo(5.25f, 15.7574f, 6.2574f, 14.75f, 7.5f, 14.75f)
                curveTo(8.7426f, 14.75f, 9.75f, 15.7574f, 9.75f, 17.0f)
                curveTo(9.75f, 18.2426f, 8.7426f, 19.25f, 7.5f, 19.25f)
                curveTo(6.2574f, 19.25f, 5.25f, 18.2426f, 5.25f, 17.0f)
                close()
                moveTo(12.25f, 17.0f)
                curveTo(12.25f, 16.5858f, 12.5858f, 16.25f, 13.0f, 16.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                curveTo(18.75f, 17.4142f, 18.4142f, 17.75f, 18.0f, 17.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 17.75f, 12.25f, 17.4142f, 12.25f, 17.0f)
                close()
            }
        }
            .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
