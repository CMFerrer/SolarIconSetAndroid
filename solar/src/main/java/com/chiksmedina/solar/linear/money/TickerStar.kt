package com.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MoneyGroup

public val MoneyGroup.TickerStar: ImageVector
    get() {
        if (_tickerStar != null) {
            return _tickerStar!!
        }
        _tickerStar = Builder(name = "TickerStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0037f, 4.0f)
                horizontalLineTo(9.9963f)
                curveTo(6.2181f, 4.0f, 4.329f, 4.0f, 3.1553f, 5.1716f)
                curveTo(2.2766f, 6.0486f, 2.0557f, 7.3257f, 2.0002f, 9.4944f)
                curveTo(1.993f, 9.7725f, 2.2212f, 9.9947f, 2.4908f, 10.0652f)
                curveTo(3.3507f, 10.2901f, 3.9852f, 11.0711f, 3.9852f, 12.0f)
                curveTo(3.9852f, 12.9289f, 3.3507f, 13.7099f, 2.4908f, 13.9348f)
                curveTo(2.2212f, 14.0053f, 1.993f, 14.2275f, 2.0002f, 14.5056f)
                curveTo(2.0557f, 16.6743f, 2.2766f, 17.9514f, 3.1553f, 18.8284f)
                curveTo(4.329f, 20.0f, 6.2181f, 20.0f, 9.9963f, 20.0f)
                horizontalLineTo(14.0037f)
                curveTo(17.7819f, 20.0f, 19.671f, 20.0f, 20.8448f, 18.8284f)
                curveTo(21.7234f, 17.9514f, 21.9443f, 16.6743f, 21.9998f, 14.5056f)
                curveTo(22.007f, 14.2275f, 21.7788f, 14.0053f, 21.5092f, 13.9348f)
                curveTo(20.6493f, 13.7099f, 20.0148f, 12.9289f, 20.0148f, 12.0f)
                curveTo(20.0148f, 11.0711f, 20.6493f, 10.2901f, 21.5092f, 10.0652f)
                curveTo(21.7788f, 9.9947f, 22.007f, 9.7725f, 21.9998f, 9.4944f)
                curveTo(21.9443f, 7.3257f, 21.7234f, 6.0486f, 20.8448f, 5.1716f)
                curveTo(19.671f, 4.0f, 17.7819f, 4.0f, 14.0037f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.1459f, 10.0225f)
                curveTo(11.5259f, 9.3408f, 11.7159f, 9.0f, 12.0f, 9.0f)
                curveTo(12.2841f, 9.0f, 12.4741f, 9.3408f, 12.8541f, 10.0225f)
                lineTo(12.9524f, 10.1989f)
                curveTo(13.0603f, 10.3926f, 13.1143f, 10.4894f, 13.1985f, 10.5533f)
                curveTo(13.2827f, 10.6172f, 13.3875f, 10.641f, 13.5972f, 10.6884f)
                lineTo(13.7881f, 10.7316f)
                curveTo(14.526f, 10.8986f, 14.895f, 10.982f, 14.9828f, 11.2643f)
                curveTo(15.0706f, 11.5466f, 14.819f, 11.8407f, 14.316f, 12.429f)
                lineTo(14.1858f, 12.5812f)
                curveTo(14.0429f, 12.7483f, 13.9714f, 12.8319f, 13.9392f, 12.9353f)
                curveTo(13.9071f, 13.0387f, 13.9179f, 13.1502f, 13.9395f, 13.3733f)
                lineTo(13.9592f, 13.5763f)
                curveTo(14.0352f, 14.3612f, 14.0733f, 14.7536f, 13.8435f, 14.9281f)
                curveTo(13.6136f, 15.1025f, 13.2682f, 14.9435f, 12.5773f, 14.6254f)
                lineTo(12.3986f, 14.5431f)
                curveTo(12.2022f, 14.4527f, 12.1041f, 14.4075f, 12.0f, 14.4075f)
                curveTo(11.8959f, 14.4075f, 11.7978f, 14.4527f, 11.6014f, 14.5431f)
                lineTo(11.4227f, 14.6254f)
                curveTo(10.7318f, 14.9435f, 10.3864f, 15.1025f, 10.1565f, 14.9281f)
                curveTo(9.9267f, 14.7536f, 9.9648f, 14.3612f, 10.0408f, 13.5763f)
                lineTo(10.0605f, 13.3733f)
                curveTo(10.0821f, 13.1502f, 10.0929f, 13.0387f, 10.0608f, 12.9353f)
                curveTo(10.0286f, 12.8319f, 9.9571f, 12.7483f, 9.8142f, 12.5812f)
                lineTo(9.684f, 12.429f)
                curveTo(9.181f, 11.8407f, 8.9295f, 11.5466f, 9.0172f, 11.2643f)
                curveTo(9.105f, 10.982f, 9.474f, 10.8986f, 10.2119f, 10.7316f)
                lineTo(10.4028f, 10.6884f)
                curveTo(10.6125f, 10.641f, 10.7173f, 10.6172f, 10.8015f, 10.5533f)
                curveTo(10.8857f, 10.4894f, 10.9397f, 10.3926f, 11.0476f, 10.1989f)
                lineTo(11.1459f, 10.0225f)
                close()
            }
        }
        .build()
        return _tickerStar!!
    }

private var _tickerStar: ImageVector? = null
