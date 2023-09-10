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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 16.0f)
                curveTo(5.75f, 15.0203f, 6.3761f, 14.1869f, 7.25f, 13.878f)
                verticalLineTo(15.0f)
                curveTo(7.25f, 15.4142f, 7.5858f, 15.75f, 8.0f, 15.75f)
                curveTo(8.4142f, 15.75f, 8.75f, 15.4142f, 8.75f, 15.0f)
                verticalLineTo(13.878f)
                curveTo(9.6239f, 14.1869f, 10.25f, 15.0203f, 10.25f, 16.0f)
                curveTo(10.25f, 17.2426f, 9.2426f, 18.25f, 8.0f, 18.25f)
                curveTo(6.7574f, 18.25f, 5.75f, 17.2426f, 5.75f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.409f, 14.409f)
                curveTo(15.1017f, 13.7163f, 16.1338f, 13.5697f, 16.9701f, 13.9692f)
                lineTo(16.1768f, 14.7626f)
                curveTo(15.8839f, 15.0555f, 15.8839f, 15.5303f, 16.1768f, 15.8232f)
                curveTo(16.4697f, 16.1161f, 16.9445f, 16.1161f, 17.2374f, 15.8232f)
                lineTo(18.0308f, 15.0299f)
                curveTo(18.4303f, 15.8662f, 18.2837f, 16.8983f, 17.591f, 17.591f)
                curveTo(16.7123f, 18.4697f, 15.2877f, 18.4697f, 14.409f, 17.591f)
                curveTo(13.5303f, 16.7123f, 13.5303f, 15.2877f, 14.409f, 14.409f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.052f, 1.25f)
                horizontalLineTo(11.948f)
                curveTo(11.0495f, 1.25f, 10.3003f, 1.25f, 9.7055f, 1.3299f)
                curveTo(9.0777f, 1.4143f, 8.5109f, 1.6f, 8.0555f, 2.0555f)
                curveTo(7.6f, 2.5109f, 7.4143f, 3.0777f, 7.3299f, 3.7055f)
                curveTo(7.2499f, 4.3003f, 7.25f, 5.0495f, 7.25f, 5.948f)
                verticalLineTo(6.0257f)
                curveTo(5.2288f, 6.0918f, 4.0151f, 6.328f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                curveTo(22.0f, 10.2288f, 22.0f, 8.3432f, 20.8284f, 7.1716f)
                curveTo(19.9849f, 6.328f, 18.7712f, 6.0918f, 16.75f, 6.0257f)
                verticalLineTo(5.948f)
                curveTo(16.75f, 5.0495f, 16.7501f, 4.3003f, 16.6701f, 3.7055f)
                curveTo(16.5857f, 3.0777f, 16.4f, 2.5109f, 15.9445f, 2.0555f)
                curveTo(15.4891f, 1.6f, 14.9223f, 1.4143f, 14.2945f, 1.3299f)
                curveTo(13.6997f, 1.25f, 12.9505f, 1.25f, 12.052f, 1.25f)
                close()
                moveTo(15.2479f, 6.0019f)
                curveTo(15.2434f, 5.1552f, 15.229f, 4.2441f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.771f, 4.2441f, 8.7566f, 5.1552f, 8.7521f, 6.0019f)
                curveTo(9.1435f, 6.0f, 9.5589f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4412f, 6.0f, 14.8565f, 6.0f, 15.2479f, 6.0019f)
                close()
                moveTo(8.0f, 12.25f)
                curveTo(5.9289f, 12.25f, 4.25f, 13.9289f, 4.25f, 16.0f)
                curveTo(4.25f, 18.0711f, 5.9289f, 19.75f, 8.0f, 19.75f)
                curveTo(10.0711f, 19.75f, 11.75f, 18.0711f, 11.75f, 16.0f)
                curveTo(11.75f, 13.9289f, 10.0711f, 12.25f, 8.0f, 12.25f)
                close()
                moveTo(18.6516f, 13.3484f)
                curveTo(17.1872f, 11.8839f, 14.8128f, 11.8839f, 13.3483f, 13.3484f)
                curveTo(11.8839f, 14.8128f, 11.8839f, 17.1872f, 13.3483f, 18.6517f)
                curveTo(14.8128f, 20.1161f, 17.1872f, 20.1161f, 18.6516f, 18.6517f)
                curveTo(20.1161f, 17.1872f, 20.1161f, 14.8128f, 18.6516f, 13.3484f)
                close()
                moveTo(5.25f, 9.5f)
                curveTo(5.25f, 9.0858f, 5.5858f, 8.75f, 6.0f, 8.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 8.75f, 18.75f, 9.0858f, 18.75f, 9.5f)
                curveTo(18.75f, 9.9142f, 18.4142f, 10.25f, 18.0f, 10.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 10.25f, 5.25f, 9.9142f, 5.25f, 9.5f)
                close()
            }
        }
            .build()
        return _boombox!!
    }

private var _boombox: ImageVector? = null
