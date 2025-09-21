package dev.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.MoneyGroup

val MoneyGroup.WalletMoney: ImageVector
    get() {
        if (_walletMoney != null) {
            return _walletMoney!!
        }
        _walletMoney = Builder(
            name = "WalletMoney", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 10.0f)
                horizontalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.8333f, 11.0f)
                horizontalLineTo(18.2308f)
                curveTo(16.4465f, 11.0f, 15.0f, 12.3431f, 15.0f, 14.0f)
                curveTo(15.0f, 15.6569f, 16.4465f, 17.0f, 18.2308f, 17.0f)
                horizontalLineTo(20.8333f)
                curveTo(20.9167f, 17.0f, 20.9583f, 17.0f, 20.9935f, 16.9979f)
                curveTo(21.5328f, 16.965f, 21.9623f, 16.5662f, 21.9977f, 16.0654f)
                curveTo(22.0f, 16.0327f, 22.0f, 15.994f, 22.0f, 15.9167f)
                verticalLineTo(12.0833f)
                curveTo(22.0f, 12.006f, 22.0f, 11.9673f, 21.9977f, 11.9346f)
                curveTo(21.9623f, 11.4338f, 21.5328f, 11.035f, 20.9935f, 11.0021f)
                curveTo(20.9583f, 11.0f, 20.9167f, 11.0f, 20.8333f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.965f, 11.0f)
                curveTo(20.8873f, 9.1277f, 20.6366f, 7.9798f, 19.8284f, 7.1716f)
                curveTo(18.6569f, 6.0f, 16.7712f, 6.0f, 13.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 6.0f, 4.3432f, 6.0f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 22.0f, 18.6569f, 22.0f, 19.8284f, 20.8284f)
                curveTo(20.6366f, 20.0203f, 20.8873f, 18.8723f, 20.965f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.0f)
                lineTo(9.7355f, 3.5231f)
                curveTo(10.7874f, 2.8256f, 12.2126f, 2.8256f, 13.2645f, 3.5231f)
                lineTo(17.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9912f, 14.0f)
                horizontalLineTo(18.0002f)
            }
        }
            .build()
        return _walletMoney!!
    }

private var _walletMoney: ImageVector? = null
