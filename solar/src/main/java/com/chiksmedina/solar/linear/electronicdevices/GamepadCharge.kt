package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadCharge: ImageVector
    get() {
        if (_gamepadCharge != null) {
            return _gamepadCharge!!
        }
        _gamepadCharge = Builder(
            name = "GamepadCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.165f, 4.7792f)
                lineTo(10.6669f, 5.1344f)
                curveTo(11.0567f, 5.4103f, 11.5225f, 5.5584f, 12.0f, 5.5584f)
                curveTo(12.4776f, 5.5584f, 12.9434f, 5.4103f, 13.3332f, 5.1344f)
                lineTo(13.8351f, 4.7792f)
                curveTo(14.5514f, 4.2723f, 15.4074f, 4.0f, 16.2849f, 4.0f)
                horizontalLineTo(16.8974f)
                curveTo(17.3016f, 4.0f, 17.7099f, 4.0255f, 18.0908f, 4.1606f)
                curveTo(20.4735f, 5.0057f, 22.1125f, 8.095f, 21.994f, 15.1026f)
                curveTo(21.9701f, 16.5145f, 21.6397f, 18.075f, 20.3658f, 18.6842f)
                curveTo(19.9688f, 18.8741f, 19.5033f, 19.0f, 18.9733f, 19.0f)
                curveTo(18.3373f, 19.0f, 17.8322f, 18.8187f, 17.4424f, 18.5632f)
                curveTo(16.5285f, 17.9642f, 15.8588f, 16.9639f, 14.8888f, 16.4609f)
                curveTo(14.3048f, 16.1581f, 13.6566f, 16.0f, 12.9989f, 16.0f)
                horizontalLineTo(11.0011f)
                curveTo(10.3434f, 16.0f, 9.6952f, 16.1581f, 9.1112f, 16.4609f)
                curveTo(8.1412f, 16.9639f, 7.4715f, 17.9642f, 6.5576f, 18.5632f)
                curveTo(6.1678f, 18.8187f, 5.6627f, 19.0f, 5.0267f, 19.0f)
                curveTo(4.4967f, 19.0f, 4.0312f, 18.8741f, 3.6342f, 18.6842f)
                curveTo(2.3603f, 18.075f, 2.0299f, 16.5145f, 2.006f, 15.1026f)
                curveTo(1.8875f, 8.095f, 3.5264f, 5.0057f, 5.9092f, 4.1606f)
                curveTo(6.2901f, 4.0255f, 6.6984f, 4.0f, 7.1026f, 4.0f)
                horizontalLineTo(7.715f)
                curveTo(8.5926f, 4.0f, 9.4486f, 4.2723f, 10.165f, 4.7792f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 16.5f)
                verticalLineTo(18.0f)
                curveTo(10.5f, 18.5523f, 10.9477f, 19.0f, 11.5f, 19.0f)
                horizontalLineTo(12.5f)
                curveTo(13.0523f, 19.0f, 13.5f, 18.5523f, 13.5f, 18.0f)
                verticalLineTo(16.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 9.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 10.5f)
                lineTo(9.0f, 10.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 10.25f)
                curveTo(19.0f, 10.6642f, 18.6642f, 11.0f, 18.25f, 11.0f)
                curveTo(17.8358f, 11.0f, 17.5f, 10.6642f, 17.5f, 10.25f)
                curveTo(17.5f, 9.8358f, 17.8358f, 9.5f, 18.25f, 9.5f)
                curveTo(18.6642f, 9.5f, 19.0f, 9.8358f, 19.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 10.25f)
                curveTo(16.0f, 10.6642f, 15.6642f, 11.0f, 15.25f, 11.0f)
                curveTo(14.8358f, 11.0f, 14.5f, 10.6642f, 14.5f, 10.25f)
                curveTo(14.5f, 9.8358f, 14.8358f, 9.5f, 15.25f, 9.5f)
                curveTo(15.6642f, 9.5f, 16.0f, 9.8358f, 16.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.75f, 8.0f)
                curveTo(17.1642f, 8.0f, 17.5f, 8.3358f, 17.5f, 8.75f)
                curveTo(17.5f, 9.1642f, 17.1642f, 9.5f, 16.75f, 9.5f)
                curveTo(16.3358f, 9.5f, 16.0f, 9.1642f, 16.0f, 8.75f)
                curveTo(16.0f, 8.3358f, 16.3358f, 8.0f, 16.75f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.75f, 11.0f)
                curveTo(17.1642f, 11.0f, 17.5f, 11.3358f, 17.5f, 11.75f)
                curveTo(17.5f, 12.1642f, 17.1642f, 12.5f, 16.75f, 12.5f)
                curveTo(16.3358f, 12.5f, 16.0f, 12.1642f, 16.0f, 11.75f)
                curveTo(16.0f, 11.3358f, 16.3358f, 11.0f, 16.75f, 11.0f)
                close()
            }
        }
            .build()
        return _gamepadCharge!!
    }

private var _gamepadCharge: ImageVector? = null
