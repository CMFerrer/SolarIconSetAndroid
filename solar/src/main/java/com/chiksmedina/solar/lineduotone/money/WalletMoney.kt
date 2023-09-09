package com.chiksmedina.solar.lineduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MoneyGroup

public val MoneyGroup.WalletMoney: ImageVector
    get() {
        if (_walletMoney != null) {
            return _walletMoney!!
        }
        _walletMoney = Builder(name = "WalletMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.8333f, 10.0f)
                horizontalLineTo(18.2308f)
                curveTo(16.4465f, 10.0f, 15.0f, 11.3431f, 15.0f, 13.0f)
                curveTo(15.0f, 14.6569f, 16.4465f, 16.0f, 18.2308f, 16.0f)
                horizontalLineTo(20.8333f)
                curveTo(20.9167f, 16.0f, 20.9583f, 16.0f, 20.9935f, 15.9979f)
                curveTo(21.5328f, 15.965f, 21.9623f, 15.5662f, 21.9977f, 15.0654f)
                curveTo(22.0f, 15.0327f, 22.0f, 14.994f, 22.0f, 14.9167f)
                verticalLineTo(11.0833f)
                curveTo(22.0f, 11.006f, 22.0f, 10.9673f, 21.9977f, 10.9346f)
                curveTo(21.9623f, 10.4338f, 21.5328f, 10.035f, 20.9935f, 10.0021f)
                curveTo(20.9583f, 10.0f, 20.9167f, 10.0f, 20.8333f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.965f, 10.0f)
                curveTo(20.8873f, 8.1277f, 20.6366f, 6.9798f, 19.8284f, 6.1716f)
                curveTo(18.6569f, 5.0f, 16.7712f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 5.0f, 4.3432f, 5.0f, 3.1716f, 6.1716f)
                curveTo(2.0f, 7.3432f, 2.0f, 9.2288f, 2.0f, 13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 21.0f, 18.6569f, 21.0f, 19.8284f, 19.8284f)
                curveTo(20.6366f, 19.0203f, 20.8873f, 17.8723f, 20.965f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(9.7355f, 2.5231f)
                curveTo(10.7874f, 1.8256f, 12.2126f, 1.8256f, 13.2645f, 2.5231f)
                lineTo(17.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.991f, 13.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _walletMoney!!
    }

private var _walletMoney: ImageVector? = null
