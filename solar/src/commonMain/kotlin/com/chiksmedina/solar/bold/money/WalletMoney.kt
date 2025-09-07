package com.chiksmedina.solar.bold.money

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
import com.chiksmedina.solar.bold.MoneyGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.4105f, 9.8606f)
                curveTo(20.3559f, 9.8571f, 20.2964f, 9.8571f, 20.2348f, 9.8572f)
                lineTo(20.2194f, 9.8572f)
                horizontalLineTo(17.8015f)
                curveTo(15.8086f, 9.8572f, 14.1033f, 11.4382f, 14.1033f, 13.5f)
                curveTo(14.1033f, 15.5618f, 15.8086f, 17.1429f, 17.8015f, 17.1429f)
                horizontalLineTo(20.2194f)
                lineTo(20.2348f, 17.1429f)
                curveTo(20.2964f, 17.1429f, 20.3559f, 17.1429f, 20.4105f, 17.1394f)
                curveTo(21.22f, 17.0879f, 21.9359f, 16.4495f, 21.9961f, 15.5577f)
                curveTo(22.0001f, 15.4992f, 22.0f, 15.4362f, 22.0f, 15.3778f)
                lineTo(22.0f, 15.3619f)
                verticalLineTo(11.6381f)
                lineTo(22.0f, 11.6222f)
                curveTo(22.0f, 11.5638f, 22.0001f, 11.5008f, 21.9961f, 11.4423f)
                curveTo(21.9359f, 10.5506f, 21.22f, 9.9121f, 20.4105f, 9.8606f)
                close()
                moveTo(17.5872f, 14.4714f)
                curveTo(18.1002f, 14.4714f, 18.5162f, 14.0365f, 18.5162f, 13.5f)
                curveTo(18.5162f, 12.9635f, 18.1002f, 12.5286f, 17.5872f, 12.5286f)
                curveTo(17.0741f, 12.5286f, 16.6581f, 12.9635f, 16.6581f, 13.5f)
                curveTo(16.6581f, 14.0365f, 17.0741f, 14.4714f, 17.5872f, 14.4714f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.2341f, 18.6f)
                curveTo(20.3778f, 18.5963f, 20.4866f, 18.7304f, 20.4476f, 18.8699f)
                curveTo(20.2541f, 19.562f, 19.947f, 20.1518f, 19.4542f, 20.6485f)
                curveTo(18.7329f, 21.3755f, 17.8183f, 21.6981f, 16.6882f, 21.8512f)
                curveTo(15.5902f, 22.0f, 14.1872f, 22.0f, 12.4158f, 22.0f)
                horizontalLineTo(10.3794f)
                curveTo(8.608f, 22.0f, 7.205f, 22.0f, 6.107f, 21.8512f)
                curveTo(4.9769f, 21.6981f, 4.0623f, 21.3755f, 3.341f, 20.6485f)
                curveTo(2.6196f, 19.9215f, 2.2995f, 18.9997f, 2.1476f, 17.8608f)
                curveTo(2.0f, 16.7541f, 2.0f, 15.3401f, 2.0f, 13.5548f)
                verticalLineTo(13.4452f)
                curveTo(2.0f, 11.6599f, 2.0f, 10.2459f, 2.1476f, 9.1392f)
                curveTo(2.2995f, 8.0003f, 2.6196f, 7.0785f, 3.341f, 6.3515f)
                curveTo(4.0623f, 5.6245f, 4.9769f, 5.3019f, 6.107f, 5.1488f)
                curveTo(7.205f, 5.0f, 8.608f, 5.0f, 10.3794f, 5.0f)
                lineTo(12.4158f, 5.0f)
                curveTo(14.1872f, 5.0f, 15.5902f, 5.0f, 16.6882f, 5.1488f)
                curveTo(17.8183f, 5.3019f, 18.7329f, 5.6245f, 19.4542f, 6.3515f)
                curveTo(19.947f, 6.8482f, 20.2541f, 7.438f, 20.4476f, 8.1301f)
                curveTo(20.4866f, 8.2696f, 20.3778f, 8.4038f, 20.2341f, 8.4f)
                lineTo(17.8015f, 8.4f)
                curveTo(15.0673f, 8.4f, 12.6575f, 10.5769f, 12.6575f, 13.5f)
                curveTo(12.6575f, 16.4231f, 15.0673f, 18.6f, 17.8015f, 18.6f)
                lineTo(20.2341f, 18.6f)
                close()
                moveTo(5.6145f, 8.8857f)
                curveTo(5.2152f, 8.8857f, 4.8916f, 9.2119f, 4.8916f, 9.6143f)
                curveTo(4.8916f, 10.0167f, 5.2152f, 10.3429f, 5.6145f, 10.3429f)
                horizontalLineTo(9.4699f)
                curveTo(9.8691f, 10.3429f, 10.1928f, 10.0167f, 10.1928f, 9.6143f)
                curveTo(10.1928f, 9.2119f, 9.8691f, 8.8857f, 9.4699f, 8.8857f)
                horizontalLineTo(5.6145f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.7767f, 4.0244f)
                lineTo(9.7355f, 2.5813f)
                curveTo(10.7874f, 1.8062f, 12.2126f, 1.8062f, 13.2645f, 2.5813f)
                lineTo(15.2336f, 4.032f)
                curveTo(14.4103f, 3.9999f, 13.4909f, 4.0f, 12.4829f, 4.0f)
                horizontalLineTo(10.3123f)
                curveTo(9.3912f, 4.0f, 8.5441f, 4.0f, 7.7767f, 4.0244f)
                close()
            }
        }
            .build()
        return _walletMoney!!
    }

private var _walletMoney: ImageVector? = null
