package com.chiksmedina.solar.boldduotone.money

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
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(
            name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 7.0f)
                curveTo(5.3358f, 7.0f, 5.0f, 7.3358f, 5.0f, 7.75f)
                curveTo(5.0f, 8.1642f, 5.3358f, 8.5f, 5.75f, 8.5f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 8.5f, 10.5f, 8.1642f, 10.5f, 7.75f)
                curveTo(10.5f, 7.3358f, 10.1642f, 7.0f, 9.75f, 7.0f)
                horizontalLineTo(5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.1884f, 8.0038f)
                curveTo(21.1262f, 7.9999f, 21.0584f, 8.0f, 20.9881f, 8.0f)
                lineTo(20.9706f, 8.0f)
                horizontalLineTo(18.2149f)
                curveTo(15.9435f, 8.0f, 14.0f, 9.7361f, 14.0f, 12.0f)
                curveTo(14.0f, 14.2639f, 15.9435f, 16.0f, 18.2149f, 16.0f)
                horizontalLineTo(20.9706f)
                lineTo(20.9881f, 16.0f)
                curveTo(21.0584f, 16.0f, 21.1262f, 16.0f, 21.1884f, 15.9962f)
                curveTo(22.111f, 15.9397f, 22.927f, 15.2386f, 22.9956f, 14.2594f)
                curveTo(23.0001f, 14.1952f, 23.0f, 14.126f, 23.0f, 14.0619f)
                lineTo(23.0f, 14.0444f)
                verticalLineTo(9.9556f)
                lineTo(23.0f, 9.9382f)
                curveTo(23.0f, 9.874f, 23.0001f, 9.8048f, 22.9956f, 9.7406f)
                curveTo(22.927f, 8.7614f, 22.111f, 8.0603f, 21.1884f, 8.0038f)
                close()
                moveTo(17.9706f, 13.0667f)
                curveTo(18.5554f, 13.0667f, 19.0294f, 12.5891f, 19.0294f, 12.0f)
                curveTo(19.0294f, 11.4109f, 18.5554f, 10.9333f, 17.9706f, 10.9333f)
                curveTo(17.3858f, 10.9333f, 16.9118f, 11.4109f, 16.9118f, 12.0f)
                curveTo(16.9118f, 12.5891f, 17.3858f, 13.0667f, 17.9706f, 13.0667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.1394f, 8.0015f)
                curveTo(21.1394f, 6.8209f, 21.0965f, 5.5545f, 20.3418f, 4.6466f)
                curveTo(20.2689f, 4.5589f, 20.1914f, 4.4738f, 20.1088f, 4.3912f)
                curveTo(19.3604f, 3.6429f, 18.4114f, 3.3108f, 17.239f, 3.1531f)
                curveTo(16.0998f, 3.0f, 14.6442f, 3.0f, 12.8064f, 3.0f)
                horizontalLineTo(10.6936f)
                curveTo(8.8558f, 3.0f, 7.4002f, 3.0f, 6.261f, 3.1531f)
                curveTo(5.0886f, 3.3108f, 4.1396f, 3.6429f, 3.3912f, 4.3912f)
                curveTo(2.6429f, 5.1396f, 2.3108f, 6.0886f, 2.1531f, 7.261f)
                curveTo(2.0f, 8.4002f, 2.0f, 9.8558f, 2.0f, 11.6936f)
                verticalLineTo(11.8064f)
                curveTo(2.0f, 13.6442f, 2.0f, 15.0998f, 2.1531f, 16.239f)
                curveTo(2.3108f, 17.4114f, 2.6429f, 18.3604f, 3.3912f, 19.1088f)
                curveTo(4.1396f, 19.8571f, 5.0886f, 20.1892f, 6.261f, 20.3469f)
                curveTo(7.4002f, 20.5f, 8.8558f, 20.5f, 10.6935f, 20.5f)
                horizontalLineTo(12.8064f)
                curveTo(14.6442f, 20.5f, 16.0998f, 20.5f, 17.239f, 20.3469f)
                curveTo(18.4114f, 20.1892f, 19.3604f, 19.8571f, 20.1088f, 19.1088f)
                curveTo(20.3133f, 18.9042f, 20.487f, 18.6844f, 20.6346f, 18.4486f)
                curveTo(21.0851f, 17.7291f, 21.1394f, 16.8473f, 21.1394f, 15.9985f)
                curveTo(21.0912f, 16.0f, 21.0404f, 16.0f, 20.9882f, 16.0f)
                lineTo(18.2149f, 16.0f)
                curveTo(15.9435f, 16.0f, 14.0f, 14.2639f, 14.0f, 12.0f)
                curveTo(14.0f, 9.7361f, 15.9435f, 8.0f, 18.2149f, 8.0f)
                lineTo(20.9881f, 8.0f)
                curveTo(21.0403f, 8.0f, 21.0912f, 8.0f, 21.1394f, 8.0015f)
                close()
            }
        }
            .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
