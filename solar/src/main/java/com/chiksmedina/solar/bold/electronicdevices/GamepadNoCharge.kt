package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.GamepadNoCharge: ImageVector
    get() {
        if (_gamepadNoCharge != null) {
            return _gamepadNoCharge!!
        }
        _gamepadNoCharge = Builder(name = "GamepadNoCharge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.4695f, 17.4697f)
                curveTo(10.7624f, 17.1768f, 11.2373f, 17.1768f, 11.5302f, 17.4697f)
                lineTo(11.9999f, 17.9393f)
                lineTo(12.4695f, 17.4697f)
                curveTo(12.7624f, 17.1768f, 13.2373f, 17.1768f, 13.5302f, 17.4697f)
                curveTo(13.8231f, 17.7626f, 13.8231f, 18.2374f, 13.5302f, 18.5303f)
                lineTo(13.0605f, 19.0f)
                lineTo(13.5302f, 19.4697f)
                curveTo(13.8231f, 19.7626f, 13.8231f, 20.2374f, 13.5302f, 20.5303f)
                curveTo(13.2373f, 20.8232f, 12.7624f, 20.8232f, 12.4695f, 20.5303f)
                lineTo(11.9999f, 20.0607f)
                lineTo(11.5302f, 20.5303f)
                curveTo(11.2373f, 20.8232f, 10.7624f, 20.8232f, 10.4695f, 20.5303f)
                curveTo(10.1766f, 20.2374f, 10.1766f, 19.7626f, 10.4695f, 19.4697f)
                lineTo(10.9392f, 19.0f)
                lineTo(10.4695f, 18.5303f)
                curveTo(10.1766f, 18.2374f, 10.1766f, 17.7626f, 10.4695f, 17.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6669f, 5.1344f)
                lineTo(10.165f, 4.7792f)
                curveTo(9.4486f, 4.2723f, 8.5926f, 4.0f, 7.715f, 4.0f)
                horizontalLineTo(7.1026f)
                curveTo(6.6984f, 4.0f, 6.2901f, 4.0255f, 5.9092f, 4.1606f)
                curveTo(3.5264f, 5.0057f, 1.8875f, 8.095f, 2.006f, 15.1026f)
                curveTo(2.0299f, 16.5145f, 2.3603f, 18.075f, 3.6342f, 18.6842f)
                curveTo(4.0312f, 18.8741f, 4.4967f, 19.0f, 5.0267f, 19.0f)
                curveTo(5.6627f, 19.0f, 6.1678f, 18.8187f, 6.5576f, 18.5632f)
                curveTo(6.9664f, 18.2953f, 7.3263f, 17.9471f, 7.6861f, 17.599f)
                curveTo(8.1307f, 17.1688f, 8.5751f, 16.7389f, 9.1112f, 16.4609f)
                curveTo(9.6952f, 16.1581f, 10.3434f, 16.0f, 11.0011f, 16.0f)
                horizontalLineTo(12.9989f)
                curveTo(13.6566f, 16.0f, 14.3048f, 16.1581f, 14.8888f, 16.4609f)
                curveTo(15.4249f, 16.7389f, 15.8693f, 17.1688f, 16.3139f, 17.599f)
                curveTo(16.6737f, 17.9471f, 17.0336f, 18.2953f, 17.4424f, 18.5632f)
                curveTo(17.8322f, 18.8187f, 18.3373f, 19.0f, 18.9733f, 19.0f)
                curveTo(19.5033f, 19.0f, 19.9688f, 18.8741f, 20.3658f, 18.6842f)
                curveTo(21.6397f, 18.075f, 21.9701f, 16.5145f, 21.994f, 15.1026f)
                curveTo(22.1125f, 8.095f, 20.4735f, 5.0057f, 18.0908f, 4.1606f)
                curveTo(17.7099f, 4.0255f, 17.3016f, 4.0f, 16.8974f, 4.0f)
                horizontalLineTo(16.2849f)
                curveTo(15.4074f, 4.0f, 14.5514f, 4.2723f, 13.8351f, 4.7792f)
                lineTo(13.3332f, 5.1344f)
                curveTo(12.9434f, 5.4103f, 12.4776f, 5.5584f, 12.0f, 5.5584f)
                curveTo(11.5225f, 5.5584f, 11.0567f, 5.4103f, 10.6669f, 5.1344f)
                close()
                moveTo(16.75f, 8.0f)
                curveTo(17.1642f, 8.0f, 17.5f, 8.3358f, 17.5f, 8.75f)
                curveTo(17.5f, 9.1642f, 17.1642f, 9.5f, 16.75f, 9.5f)
                curveTo(16.3358f, 9.5f, 16.0f, 9.1642f, 16.0f, 8.75f)
                curveTo(16.0f, 8.3358f, 16.3358f, 8.0f, 16.75f, 8.0f)
                close()
                moveTo(7.5f, 8.25f)
                curveTo(7.9142f, 8.25f, 8.25f, 8.5858f, 8.25f, 9.0f)
                verticalLineTo(9.75f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 9.75f, 9.75f, 10.0858f, 9.75f, 10.5f)
                curveTo(9.75f, 10.9142f, 9.4142f, 11.25f, 9.0f, 11.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(12.0f)
                curveTo(8.25f, 12.4142f, 7.9142f, 12.75f, 7.5f, 12.75f)
                curveTo(7.0858f, 12.75f, 6.75f, 12.4142f, 6.75f, 12.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.25f, 5.25f, 10.9142f, 5.25f, 10.5f)
                curveTo(5.25f, 10.0858f, 5.5858f, 9.75f, 6.0f, 9.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(9.0f)
                curveTo(6.75f, 8.5858f, 7.0858f, 8.25f, 7.5f, 8.25f)
                close()
                moveTo(19.0f, 10.25f)
                curveTo(19.0f, 10.6642f, 18.6642f, 11.0f, 18.25f, 11.0f)
                curveTo(17.8358f, 11.0f, 17.5f, 10.6642f, 17.5f, 10.25f)
                curveTo(17.5f, 9.8358f, 17.8358f, 9.5f, 18.25f, 9.5f)
                curveTo(18.6642f, 9.5f, 19.0f, 9.8358f, 19.0f, 10.25f)
                close()
                moveTo(15.25f, 11.0f)
                curveTo(15.6642f, 11.0f, 16.0f, 10.6642f, 16.0f, 10.25f)
                curveTo(16.0f, 9.8358f, 15.6642f, 9.5f, 15.25f, 9.5f)
                curveTo(14.8358f, 9.5f, 14.5f, 9.8358f, 14.5f, 10.25f)
                curveTo(14.5f, 10.6642f, 14.8358f, 11.0f, 15.25f, 11.0f)
                close()
                moveTo(17.5f, 11.75f)
                curveTo(17.5f, 11.3358f, 17.1642f, 11.0f, 16.75f, 11.0f)
                curveTo(16.3358f, 11.0f, 16.0f, 11.3358f, 16.0f, 11.75f)
                curveTo(16.0f, 12.1642f, 16.3358f, 12.5f, 16.75f, 12.5f)
                curveTo(17.1642f, 12.5f, 17.5f, 12.1642f, 17.5f, 11.75f)
                close()
            }
        }
        .build()
        return _gamepadNoCharge!!
    }

private var _gamepadNoCharge: ImageVector? = null
