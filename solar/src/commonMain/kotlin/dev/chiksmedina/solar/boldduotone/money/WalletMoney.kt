package dev.chiksmedina.solar.boldduotone.money

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
import dev.chiksmedina.solar.boldduotone.MoneyGroup

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
                pathFillType = NonZero
            ) {
                moveTo(4.8916f, 9.6143f)
                curveTo(4.8916f, 9.2119f, 5.2153f, 8.8857f, 5.6145f, 8.8857f)
                horizontalLineTo(9.4699f)
                curveTo(9.8692f, 8.8857f, 10.1928f, 9.2119f, 10.1928f, 9.6143f)
                curveTo(10.1928f, 10.0167f, 9.8692f, 10.3429f, 9.4699f, 10.3429f)
                horizontalLineTo(5.6145f)
                curveTo(5.2153f, 10.3429f, 4.8916f, 10.0167f, 4.8916f, 9.6143f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.1884f, 10.0038f)
                curveTo(21.1262f, 10.0f, 21.0584f, 10.0f, 20.9881f, 10.0f)
                lineTo(20.9706f, 10.0f)
                horizontalLineTo(18.2149f)
                curveTo(15.9435f, 10.0f, 14.0f, 11.7361f, 14.0f, 14.0f)
                curveTo(14.0f, 16.2639f, 15.9435f, 18.0f, 18.2149f, 18.0f)
                horizontalLineTo(20.9706f)
                lineTo(20.9881f, 18.0f)
                curveTo(21.0584f, 18.0f, 21.1262f, 18.0f, 21.1884f, 17.9962f)
                curveTo(22.111f, 17.9397f, 22.927f, 17.2386f, 22.9956f, 16.2594f)
                curveTo(23.0001f, 16.1952f, 23.0f, 16.126f, 23.0f, 16.0619f)
                lineTo(23.0f, 16.0444f)
                verticalLineTo(11.9556f)
                lineTo(23.0f, 11.9381f)
                curveTo(23.0f, 11.874f, 23.0001f, 11.8048f, 22.9956f, 11.7406f)
                curveTo(22.927f, 10.7614f, 22.111f, 10.0603f, 21.1884f, 10.0038f)
                close()
                moveTo(17.9706f, 15.0667f)
                curveTo(18.5554f, 15.0667f, 19.0294f, 14.5891f, 19.0294f, 14.0f)
                curveTo(19.0294f, 13.4109f, 18.5554f, 12.9333f, 17.9706f, 12.9333f)
                curveTo(17.3858f, 12.9333f, 16.9118f, 13.4109f, 16.9118f, 14.0f)
                curveTo(16.9118f, 14.5891f, 17.3858f, 15.0667f, 17.9706f, 15.0667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.1394f, 10.0015f)
                curveTo(21.1394f, 8.8209f, 21.0965f, 7.5545f, 20.3418f, 6.6466f)
                curveTo(20.2689f, 6.5589f, 20.1914f, 6.4738f, 20.1088f, 6.3912f)
                curveTo(19.3604f, 5.6429f, 18.4114f, 5.3108f, 17.239f, 5.1531f)
                curveTo(16.0998f, 5.0f, 14.6442f, 5.0f, 12.8064f, 5.0f)
                horizontalLineTo(10.6936f)
                curveTo(8.8558f, 5.0f, 7.4002f, 5.0f, 6.261f, 5.1531f)
                curveTo(5.0886f, 5.3108f, 4.1396f, 5.6429f, 3.3912f, 6.3912f)
                curveTo(2.6429f, 7.1396f, 2.3108f, 8.0886f, 2.1531f, 9.261f)
                curveTo(2.0f, 10.4002f, 2.0f, 11.8558f, 2.0f, 13.6936f)
                verticalLineTo(13.8064f)
                curveTo(2.0f, 15.6442f, 2.0f, 17.0998f, 2.1531f, 18.239f)
                curveTo(2.3108f, 19.4114f, 2.6429f, 20.3604f, 3.3912f, 21.1088f)
                curveTo(4.1396f, 21.8571f, 5.0886f, 22.1892f, 6.261f, 22.3469f)
                curveTo(7.4002f, 22.5f, 8.8558f, 22.5f, 10.6935f, 22.5f)
                horizontalLineTo(12.8064f)
                curveTo(14.6442f, 22.5f, 16.0998f, 22.5f, 17.239f, 22.3469f)
                curveTo(18.4114f, 22.1892f, 19.3604f, 21.8571f, 20.1088f, 21.1088f)
                curveTo(20.3133f, 20.9042f, 20.487f, 20.6844f, 20.6346f, 20.4486f)
                curveTo(21.0851f, 19.7291f, 21.1394f, 18.8473f, 21.1394f, 17.9985f)
                curveTo(21.0912f, 18.0f, 21.0404f, 18.0f, 20.9882f, 18.0f)
                lineTo(18.2149f, 18.0f)
                curveTo(15.9435f, 18.0f, 14.0f, 16.2639f, 14.0f, 14.0f)
                curveTo(14.0f, 11.7361f, 15.9435f, 10.0f, 18.2149f, 10.0f)
                lineTo(20.9881f, 10.0f)
                curveTo(21.0403f, 10.0f, 21.0912f, 10.0f, 21.1394f, 10.0015f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.1013f, 2.5721f)
                lineTo(7.9999f, 3.9925f)
                lineTo(6.2666f, 5.1524f)
                curveTo(7.405f, 5.0f, 8.8588f, 5.0f, 10.6935f, 5.0f)
                horizontalLineTo(12.8063f)
                curveTo(14.6441f, 5.0f, 16.0997f, 5.0f, 17.2389f, 5.1531f)
                curveTo(17.4681f, 5.1839f, 17.6887f, 5.2214f, 17.9009f, 5.2674f)
                lineTo(15.9999f, 4.0f)
                lineTo(13.8874f, 2.5721f)
                curveTo(12.7588f, 1.8093f, 11.2299f, 1.8093f, 10.1013f, 2.5721f)
                close()
            }
        }
            .build()
        return _walletMoney!!
    }

private var _walletMoney: ImageVector? = null
