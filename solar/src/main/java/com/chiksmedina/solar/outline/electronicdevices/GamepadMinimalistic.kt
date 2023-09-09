package com.chiksmedina.solar.outline.electronicdevices

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
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.GamepadMinimalistic: ImageVector
    get() {
        if (_gamepadMinimalistic != null) {
            return _gamepadMinimalistic!!
        }
        _gamepadMinimalistic = Builder(name = "GamepadMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.25f)
                curveTo(15.4142f, 2.25f, 15.75f, 2.5858f, 15.75f, 3.0f)
                verticalLineTo(4.0f)
                curveTo(15.75f, 4.9665f, 14.9665f, 5.75f, 14.0f, 5.75f)
                horizontalLineTo(13.0f)
                curveTo(12.8619f, 5.75f, 12.75f, 5.8619f, 12.75f, 6.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(13.2828f)
                curveTo(14.5962f, 6.25f, 15.6371f, 6.25f, 16.477f, 6.3328f)
                curveTo(17.3394f, 6.4179f, 18.0598f, 6.5954f, 18.7112f, 6.9939f)
                curveTo(19.0194f, 7.1825f, 19.3059f, 7.4036f, 19.5654f, 7.6534f)
                curveTo(20.1156f, 8.183f, 20.4602f, 8.8308f, 20.7436f, 9.6341f)
                curveTo(21.0186f, 10.4138f, 21.2561f, 11.4025f, 21.5545f, 12.6449f)
                lineTo(22.649f, 17.2015f)
                curveTo(23.132f, 19.2123f, 21.8437f, 21.1948f, 19.8219f, 21.6539f)
                curveTo(18.1199f, 22.0404f, 16.3544f, 21.2355f, 15.5734f, 19.6838f)
                lineTo(15.4454f, 19.4294f)
                curveTo(15.0058f, 18.5559f, 14.0854f, 17.9899f, 13.0636f, 17.9899f)
                horizontalLineTo(10.9364f)
                curveTo(9.9147f, 17.9899f, 8.9942f, 18.5559f, 8.5546f, 19.4294f)
                lineTo(8.4266f, 19.6838f)
                curveTo(7.6456f, 21.2355f, 5.8801f, 22.0404f, 4.1781f, 21.6539f)
                curveTo(2.1563f, 21.1948f, 0.868f, 19.2123f, 1.351f, 17.2015f)
                lineTo(2.4455f, 12.645f)
                curveTo(2.7439f, 11.4026f, 2.9815f, 10.4138f, 3.2564f, 9.6341f)
                curveTo(3.5398f, 8.8308f, 3.8844f, 8.183f, 4.4346f, 7.6534f)
                curveTo(4.6941f, 7.4036f, 4.9806f, 7.1825f, 5.2888f, 6.9939f)
                curveTo(5.9402f, 6.5954f, 6.6606f, 6.4179f, 7.523f, 6.3328f)
                curveTo(8.3629f, 6.25f, 9.4038f, 6.25f, 10.7172f, 6.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.0335f, 12.0335f, 4.25f, 13.0f, 4.25f)
                horizontalLineTo(14.0f)
                curveTo(14.1381f, 4.25f, 14.25f, 4.1381f, 14.25f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(14.25f, 2.5858f, 14.5858f, 2.25f, 15.0f, 2.25f)
                close()
                moveTo(10.7569f, 7.75f)
                curveTo(9.395f, 7.75f, 8.4279f, 7.7509f, 7.6703f, 7.8256f)
                curveTo(6.9268f, 7.8989f, 6.4559f, 8.0383f, 6.0717f, 8.2734f)
                curveTo(5.8557f, 8.4056f, 5.6556f, 8.5601f, 5.4749f, 8.7341f)
                curveTo(5.1554f, 9.0416f, 4.9117f, 9.4507f, 4.671f, 10.1331f)
                curveTo(4.4249f, 10.8308f, 4.2046f, 11.7438f, 3.8944f, 13.0355f)
                lineTo(2.8096f, 17.5518f)
                curveTo(2.5299f, 18.7162f, 3.269f, 19.9093f, 4.5102f, 20.1911f)
                curveTo(5.5598f, 20.4295f, 6.6248f, 19.9273f, 7.0867f, 19.0094f)
                lineTo(7.2147f, 18.7551f)
                curveTo(7.9162f, 17.3613f, 9.3638f, 16.4899f, 10.9364f, 16.4899f)
                horizontalLineTo(13.0636f)
                curveTo(14.6362f, 16.4899f, 16.0838f, 17.3613f, 16.7853f, 18.7551f)
                lineTo(16.9133f, 19.0094f)
                curveTo(17.3752f, 19.9273f, 18.4402f, 20.4295f, 19.4898f, 20.1911f)
                curveTo(20.731f, 19.9093f, 21.4701f, 18.7162f, 21.1905f, 17.5518f)
                lineTo(20.1056f, 13.0355f)
                curveTo(19.7954f, 11.7439f, 19.5751f, 10.8308f, 19.329f, 10.1331f)
                curveTo(19.0883f, 9.4507f, 18.8447f, 9.0416f, 18.5252f, 8.7341f)
                curveTo(18.3444f, 8.5601f, 18.1443f, 8.4056f, 17.9283f, 8.2734f)
                curveTo(17.5441f, 8.0383f, 17.0732f, 7.8989f, 16.3297f, 7.8256f)
                curveTo(15.5721f, 7.7509f, 14.605f, 7.75f, 13.2432f, 7.75f)
                horizontalLineTo(10.7569f)
                close()
                moveTo(8.5f, 10.25f)
                curveTo(8.9142f, 10.25f, 9.25f, 10.5858f, 9.25f, 11.0f)
                verticalLineTo(11.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 11.75f, 10.75f, 12.0858f, 10.75f, 12.5f)
                curveTo(10.75f, 12.9142f, 10.4142f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(9.25f)
                verticalLineTo(14.0f)
                curveTo(9.25f, 14.4142f, 8.9142f, 14.75f, 8.5f, 14.75f)
                curveTo(8.0858f, 14.75f, 7.75f, 14.4142f, 7.75f, 14.0f)
                verticalLineTo(13.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 13.25f, 6.25f, 12.9142f, 6.25f, 12.5f)
                curveTo(6.25f, 12.0858f, 6.5858f, 11.75f, 7.0f, 11.75f)
                horizontalLineTo(7.75f)
                verticalLineTo(11.0f)
                curveTo(7.75f, 10.5858f, 8.0858f, 10.25f, 8.5f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                curveTo(16.0f, 11.5523f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.5523f, 14.0f, 11.0f)
                curveTo(14.0f, 10.4477f, 14.4477f, 10.0f, 15.0f, 10.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 14.5523f, 17.5523f, 15.0f, 17.0f, 15.0f)
                curveTo(16.4477f, 15.0f, 16.0f, 14.5523f, 16.0f, 14.0f)
                curveTo(16.0f, 13.4477f, 16.4477f, 13.0f, 17.0f, 13.0f)
                curveTo(17.5523f, 13.0f, 18.0f, 13.4477f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _gamepadMinimalistic!!
    }

private var _gamepadMinimalistic: ImageVector? = null
