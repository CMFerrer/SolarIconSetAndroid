package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6669f, 6.1344f)
                lineTo(10.165f, 5.7792f)
                curveTo(9.4486f, 5.2723f, 8.5926f, 5.0f, 7.715f, 5.0f)
                horizontalLineTo(7.1026f)
                curveTo(6.6984f, 5.0f, 6.2901f, 5.0255f, 5.9092f, 5.1606f)
                curveTo(3.5264f, 6.0057f, 1.8875f, 9.095f, 2.006f, 16.1026f)
                curveTo(2.0299f, 17.5145f, 2.3603f, 19.075f, 3.6342f, 19.6842f)
                curveTo(4.0312f, 19.8741f, 4.4967f, 20.0f, 5.0267f, 20.0f)
                curveTo(5.6627f, 20.0f, 6.1678f, 19.8187f, 6.5576f, 19.5632f)
                curveTo(6.9664f, 19.2953f, 7.3263f, 18.9471f, 7.6861f, 18.599f)
                curveTo(8.1307f, 18.1688f, 8.5751f, 17.7389f, 9.1112f, 17.4609f)
                curveTo(9.6952f, 17.1581f, 10.3434f, 17.0f, 11.0011f, 17.0f)
                horizontalLineTo(12.9989f)
                curveTo(13.6566f, 17.0f, 14.3048f, 17.1581f, 14.8888f, 17.4609f)
                curveTo(15.4249f, 17.7389f, 15.8693f, 18.1688f, 16.3139f, 18.599f)
                curveTo(16.6737f, 18.9471f, 17.0336f, 19.2953f, 17.4424f, 19.5632f)
                curveTo(17.8322f, 19.8187f, 18.3373f, 20.0f, 18.9733f, 20.0f)
                curveTo(19.5033f, 20.0f, 19.9688f, 19.8741f, 20.3658f, 19.6842f)
                curveTo(21.6397f, 19.075f, 21.9701f, 17.5145f, 21.994f, 16.1026f)
                curveTo(22.1125f, 9.095f, 20.4735f, 6.0057f, 18.0908f, 5.1606f)
                curveTo(17.7099f, 5.0255f, 17.3016f, 5.0f, 16.8974f, 5.0f)
                horizontalLineTo(16.2849f)
                curveTo(15.4074f, 5.0f, 14.5514f, 5.2723f, 13.8351f, 5.7792f)
                lineTo(13.3332f, 6.1344f)
                curveTo(12.9434f, 6.4103f, 12.4776f, 6.5584f, 12.0f, 6.5584f)
                curveTo(11.5225f, 6.5584f, 11.0567f, 6.4103f, 10.6669f, 6.1344f)
                close()
                moveTo(16.75f, 9.0f)
                curveTo(17.1642f, 9.0f, 17.5f, 9.3358f, 17.5f, 9.75f)
                curveTo(17.5f, 10.1642f, 17.1642f, 10.5f, 16.75f, 10.5f)
                curveTo(16.3358f, 10.5f, 16.0f, 10.1642f, 16.0f, 9.75f)
                curveTo(16.0f, 9.3358f, 16.3358f, 9.0f, 16.75f, 9.0f)
                close()
                moveTo(7.5f, 9.25f)
                curveTo(7.9142f, 9.25f, 8.25f, 9.5858f, 8.25f, 10.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 10.75f, 9.75f, 11.0858f, 9.75f, 11.5f)
                curveTo(9.75f, 11.9142f, 9.4142f, 12.25f, 9.0f, 12.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(13.0f)
                curveTo(8.25f, 13.4142f, 7.9142f, 13.75f, 7.5f, 13.75f)
                curveTo(7.0858f, 13.75f, 6.75f, 13.4142f, 6.75f, 13.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 12.25f, 5.25f, 11.9142f, 5.25f, 11.5f)
                curveTo(5.25f, 11.0858f, 5.5858f, 10.75f, 6.0f, 10.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(10.0f)
                curveTo(6.75f, 9.5858f, 7.0858f, 9.25f, 7.5f, 9.25f)
                close()
                moveTo(19.0f, 11.25f)
                curveTo(19.0f, 11.6642f, 18.6642f, 12.0f, 18.25f, 12.0f)
                curveTo(17.8358f, 12.0f, 17.5f, 11.6642f, 17.5f, 11.25f)
                curveTo(17.5f, 10.8358f, 17.8358f, 10.5f, 18.25f, 10.5f)
                curveTo(18.6642f, 10.5f, 19.0f, 10.8358f, 19.0f, 11.25f)
                close()
                moveTo(15.25f, 12.0f)
                curveTo(15.6642f, 12.0f, 16.0f, 11.6642f, 16.0f, 11.25f)
                curveTo(16.0f, 10.8358f, 15.6642f, 10.5f, 15.25f, 10.5f)
                curveTo(14.8358f, 10.5f, 14.5f, 10.8358f, 14.5f, 11.25f)
                curveTo(14.5f, 11.6642f, 14.8358f, 12.0f, 15.25f, 12.0f)
                close()
                moveTo(17.5f, 12.75f)
                curveTo(17.5f, 12.3358f, 17.1642f, 12.0f, 16.75f, 12.0f)
                curveTo(16.3358f, 12.0f, 16.0f, 12.3358f, 16.0f, 12.75f)
                curveTo(16.0f, 13.1642f, 16.3358f, 13.5f, 16.75f, 13.5f)
                curveTo(17.1642f, 13.5f, 17.5f, 13.1642f, 17.5f, 12.75f)
                close()
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
