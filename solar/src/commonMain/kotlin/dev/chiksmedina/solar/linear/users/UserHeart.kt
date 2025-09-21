package dev.chiksmedina.solar.linear.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.UsersGroup

val UsersGroup.UserHeart: ImageVector
    get() {
        if (_userHeart != null) {
            return _userHeart!!
        }
        _userHeart = Builder(
            name = "UserHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 17.5f)
                curveTo(18.0f, 19.9853f, 18.0f, 22.0f, 10.0f, 22.0f)
                curveTo(2.0f, 22.0f, 2.0f, 19.9853f, 2.0f, 17.5f)
                curveTo(2.0f, 15.0147f, 5.5817f, 13.0f, 10.0f, 13.0f)
                curveTo(14.4183f, 13.0f, 18.0f, 15.0147f, 18.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0885f, 12.5385f)
                lineTo(18.5435f, 11.9423f)
                lineTo(18.0885f, 12.5385f)
                close()
                moveTo(19.0f, 8.6435f)
                lineTo(18.4681f, 9.1723f)
                curveTo(18.6089f, 9.3139f, 18.8003f, 9.3935f, 19.0f, 9.3935f)
                curveTo(19.1997f, 9.3935f, 19.3911f, 9.3139f, 19.5319f, 9.1723f)
                lineTo(19.0f, 8.6435f)
                close()
                moveTo(19.9115f, 12.5385f)
                lineTo(19.4565f, 11.9423f)
                lineTo(19.9115f, 12.5385f)
                close()
                moveTo(18.5435f, 11.9423f)
                curveTo(18.0571f, 11.571f, 17.619f, 11.274f, 17.2659f, 10.8891f)
                curveTo(16.9387f, 10.5324f, 16.75f, 10.1638f, 16.75f, 9.6997f)
                horizontalLineTo(15.25f)
                curveTo(15.25f, 10.6481f, 15.6642f, 11.362f, 16.1606f, 11.9031f)
                curveTo(16.6311f, 12.4161f, 17.2372f, 12.8322f, 17.6335f, 13.1347f)
                lineTo(18.5435f, 11.9423f)
                close()
                moveTo(16.75f, 9.6997f)
                curveTo(16.75f, 9.2878f, 16.9898f, 8.9547f, 17.2973f, 8.8186f)
                curveTo(17.5635f, 8.7008f, 17.9874f, 8.6887f, 18.4681f, 9.1723f)
                lineTo(19.5319f, 8.1148f)
                curveTo(18.6627f, 7.2405f, 17.5865f, 7.0503f, 16.6903f, 7.4469f)
                curveTo(15.8352f, 7.8253f, 15.25f, 8.6993f, 15.25f, 9.6997f)
                horizontalLineTo(16.75f)
                close()
                moveTo(17.6335f, 13.1347f)
                curveTo(17.7825f, 13.2483f, 17.9756f, 13.3959f, 18.1793f, 13.5111f)
                curveTo(18.3832f, 13.6265f, 18.6656f, 13.75f, 19.0f, 13.75f)
                verticalLineTo(12.25f)
                curveTo(19.0344f, 12.25f, 19.0168f, 12.2615f, 18.9179f, 12.2056f)
                curveTo(18.8187f, 12.1495f, 18.7061f, 12.0663f, 18.5435f, 11.9423f)
                lineTo(17.6335f, 13.1347f)
                close()
                moveTo(20.3665f, 13.1347f)
                curveTo(20.7628f, 12.8322f, 21.3689f, 12.4161f, 21.8394f, 11.9031f)
                curveTo(22.3358f, 11.362f, 22.75f, 10.6481f, 22.75f, 9.6997f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 10.1638f, 21.0613f, 10.5324f, 20.7341f, 10.8891f)
                curveTo(20.381f, 11.274f, 19.9429f, 11.571f, 19.4565f, 11.9423f)
                lineTo(20.3665f, 13.1347f)
                close()
                moveTo(22.75f, 9.6997f)
                curveTo(22.75f, 8.6993f, 22.1648f, 7.8253f, 21.3097f, 7.4469f)
                curveTo(20.4135f, 7.0503f, 19.3373f, 7.2405f, 18.4681f, 8.1148f)
                lineTo(19.5319f, 9.1723f)
                curveTo(20.0126f, 8.6887f, 20.4365f, 8.7008f, 20.7027f, 8.8186f)
                curveTo(21.0102f, 8.9547f, 21.25f, 9.2878f, 21.25f, 9.6997f)
                horizontalLineTo(22.75f)
                close()
                moveTo(19.4565f, 11.9423f)
                curveTo(19.2939f, 12.0663f, 19.1813f, 12.1495f, 19.0821f, 12.2056f)
                curveTo(18.9832f, 12.2615f, 18.9656f, 12.25f, 19.0f, 12.25f)
                verticalLineTo(13.75f)
                curveTo(19.3344f, 13.75f, 19.6168f, 13.6265f, 19.8207f, 13.5111f)
                curveTo(20.0244f, 13.3959f, 20.2175f, 13.2483f, 20.3665f, 13.1347f)
                lineTo(19.4565f, 11.9423f)
                close()
            }
        }
            .build()
        return _userHeart!!
    }

private var _userHeart: ImageVector? = null
