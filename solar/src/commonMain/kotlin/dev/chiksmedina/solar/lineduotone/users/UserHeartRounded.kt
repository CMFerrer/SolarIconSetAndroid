package dev.chiksmedina.solar.lineduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.UsersGroup

val UsersGroup.UserHeartRounded: ImageVector
    get() {
        if (_userHeartRounded != null) {
            return _userHeartRounded!!
        }
        _userHeartRounded = Builder(
            name = "UserHeartRounded", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 17.0f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, -14.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0885f, 12.5385f)
                lineTo(17.5435f, 11.9423f)
                lineTo(17.0885f, 12.5385f)
                close()
                moveTo(18.0f, 8.6435f)
                lineTo(17.4681f, 9.1723f)
                curveTo(17.6089f, 9.3139f, 17.8003f, 9.3935f, 18.0f, 9.3935f)
                curveTo(18.1997f, 9.3935f, 18.3911f, 9.3139f, 18.5319f, 9.1723f)
                lineTo(18.0f, 8.6435f)
                close()
                moveTo(18.9115f, 12.5385f)
                lineTo(18.4565f, 11.9423f)
                lineTo(18.9115f, 12.5385f)
                close()
                moveTo(17.5435f, 11.9423f)
                curveTo(17.0571f, 11.571f, 16.619f, 11.274f, 16.2659f, 10.8891f)
                curveTo(15.9387f, 10.5324f, 15.75f, 10.1638f, 15.75f, 9.6997f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 10.6481f, 14.6642f, 11.362f, 15.1606f, 11.9031f)
                curveTo(15.6311f, 12.4161f, 16.2372f, 12.8322f, 16.6335f, 13.1347f)
                lineTo(17.5435f, 11.9423f)
                close()
                moveTo(15.75f, 9.6997f)
                curveTo(15.75f, 9.2878f, 15.9898f, 8.9547f, 16.2973f, 8.8186f)
                curveTo(16.5635f, 8.7008f, 16.9874f, 8.6887f, 17.4681f, 9.1723f)
                lineTo(18.5319f, 8.1148f)
                curveTo(17.6627f, 7.2405f, 16.5865f, 7.0503f, 15.6903f, 7.4469f)
                curveTo(14.8352f, 7.8253f, 14.25f, 8.6993f, 14.25f, 9.6997f)
                horizontalLineTo(15.75f)
                close()
                moveTo(16.6335f, 13.1347f)
                curveTo(16.7825f, 13.2483f, 16.9756f, 13.3959f, 17.1793f, 13.5111f)
                curveTo(17.3832f, 13.6265f, 17.6656f, 13.75f, 18.0f, 13.75f)
                verticalLineTo(12.25f)
                curveTo(18.0344f, 12.25f, 18.0168f, 12.2615f, 17.9179f, 12.2056f)
                curveTo(17.8187f, 12.1495f, 17.7061f, 12.0663f, 17.5435f, 11.9423f)
                lineTo(16.6335f, 13.1347f)
                close()
                moveTo(19.3665f, 13.1347f)
                curveTo(19.7628f, 12.8322f, 20.3689f, 12.4161f, 20.8394f, 11.9031f)
                curveTo(21.3358f, 11.362f, 21.75f, 10.6481f, 21.75f, 9.6997f)
                horizontalLineTo(20.25f)
                curveTo(20.25f, 10.1638f, 20.0613f, 10.5324f, 19.7341f, 10.8891f)
                curveTo(19.381f, 11.274f, 18.9429f, 11.571f, 18.4565f, 11.9423f)
                lineTo(19.3665f, 13.1347f)
                close()
                moveTo(21.75f, 9.6997f)
                curveTo(21.75f, 8.6993f, 21.1648f, 7.8253f, 20.3097f, 7.4469f)
                curveTo(19.4135f, 7.0503f, 18.3373f, 7.2405f, 17.4681f, 8.1148f)
                lineTo(18.5319f, 9.1723f)
                curveTo(19.0126f, 8.6887f, 19.4365f, 8.7008f, 19.7027f, 8.8186f)
                curveTo(20.0102f, 8.9547f, 20.25f, 9.2878f, 20.25f, 9.6997f)
                horizontalLineTo(21.75f)
                close()
                moveTo(18.4565f, 11.9423f)
                curveTo(18.2939f, 12.0663f, 18.1813f, 12.1495f, 18.0821f, 12.2056f)
                curveTo(17.9832f, 12.2615f, 17.9656f, 12.25f, 18.0f, 12.25f)
                verticalLineTo(13.75f)
                curveTo(18.3344f, 13.75f, 18.6168f, 13.6265f, 18.8207f, 13.5111f)
                curveTo(19.0244f, 13.3959f, 19.2175f, 13.2483f, 19.3665f, 13.1347f)
                lineTo(18.4565f, 11.9423f)
                close()
            }
        }
            .build()
        return _userHeartRounded!!
    }

private var _userHeartRounded: ImageVector? = null
