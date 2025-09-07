package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadNoCharge: ImageVector
    get() {
        if (_gamepadNoCharge != null) {
            return _gamepadNoCharge!!
        }
        _gamepadNoCharge = Builder(
            name = "GamepadNoCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4042f, 17.2468f)
                curveTo(16.5877f, 17.8312f, 17.3584f, 19.0f, 18.9733f, 19.0f)
                curveTo(19.5033f, 19.0f, 19.9688f, 18.8741f, 20.3658f, 18.6842f)
                curveTo(21.6397f, 18.075f, 21.9701f, 16.5145f, 21.994f, 15.1026f)
                curveTo(22.1125f, 8.095f, 20.4735f, 5.0057f, 18.0908f, 4.1606f)
                curveTo(17.7099f, 4.0255f, 17.3016f, 4.0f, 16.8974f, 4.0f)
                horizontalLineTo(16.2849f)
                curveTo(15.4074f, 4.0f, 14.5514f, 4.2723f, 13.8351f, 4.7792f)
                lineTo(13.3332f, 5.1344f)
                curveTo(12.9434f, 5.4103f, 12.4776f, 5.5584f, 12.0f, 5.5584f)
                curveTo(11.5225f, 5.5584f, 11.0567f, 5.4103f, 10.6669f, 5.1344f)
                lineTo(10.165f, 4.7792f)
                curveTo(9.4486f, 4.2723f, 8.5926f, 4.0f, 7.715f, 4.0f)
                horizontalLineTo(7.1026f)
                curveTo(6.6984f, 4.0f, 6.2901f, 4.0255f, 5.9092f, 4.1606f)
                curveTo(3.5264f, 5.0057f, 1.8875f, 8.095f, 2.006f, 15.1026f)
                curveTo(2.0299f, 16.5145f, 2.3603f, 18.075f, 3.6342f, 18.6842f)
                curveTo(4.0312f, 18.8741f, 4.4967f, 19.0f, 5.0267f, 19.0f)
                curveTo(6.6416f, 19.0f, 7.4123f, 17.8312f, 7.5958f, 17.2468f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 17.0f)
                lineTo(10.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 17.0f)
                lineTo(14.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 9.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 10.5f)
                lineTo(9.0f, 10.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 10.25f)
                curveTo(19.0f, 10.6642f, 18.6642f, 11.0f, 18.25f, 11.0f)
                curveTo(17.8358f, 11.0f, 17.5f, 10.6642f, 17.5f, 10.25f)
                curveTo(17.5f, 9.8358f, 17.8358f, 9.5f, 18.25f, 9.5f)
                curveTo(18.6642f, 9.5f, 19.0f, 9.8358f, 19.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 10.25f)
                curveTo(16.0f, 10.6642f, 15.6642f, 11.0f, 15.25f, 11.0f)
                curveTo(14.8358f, 11.0f, 14.5f, 10.6642f, 14.5f, 10.25f)
                curveTo(14.5f, 9.8358f, 14.8358f, 9.5f, 15.25f, 9.5f)
                curveTo(15.6642f, 9.5f, 16.0f, 9.8358f, 16.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.75f, 8.0f)
                curveTo(17.1642f, 8.0f, 17.5f, 8.3358f, 17.5f, 8.75f)
                curveTo(17.5f, 9.1642f, 17.1642f, 9.5f, 16.75f, 9.5f)
                curveTo(16.3358f, 9.5f, 16.0f, 9.1642f, 16.0f, 8.75f)
                curveTo(16.0f, 8.3358f, 16.3358f, 8.0f, 16.75f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
        return _gamepadNoCharge!!
    }

private var _gamepadNoCharge: ImageVector? = null
