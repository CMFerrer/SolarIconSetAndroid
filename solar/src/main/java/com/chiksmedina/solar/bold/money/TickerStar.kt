package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.TickerStar: ImageVector
    get() {
        if (_tickerStar != null) {
            return _tickerStar!!
        }
        _tickerStar = Builder(name = "TickerStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9963f, 4.0f)
                horizontalLineTo(14.0037f)
                curveTo(17.7819f, 4.0f, 19.671f, 4.0f, 20.8448f, 5.1716f)
                curveTo(21.7234f, 6.0486f, 21.9443f, 7.3257f, 21.9998f, 9.4944f)
                curveTo(22.007f, 9.7725f, 21.7788f, 9.9947f, 21.5092f, 10.0652f)
                curveTo(20.6493f, 10.2901f, 20.0148f, 11.0711f, 20.0148f, 12.0f)
                curveTo(20.0148f, 12.9289f, 20.6493f, 13.7099f, 21.5092f, 13.9348f)
                curveTo(21.7788f, 14.0053f, 22.007f, 14.2275f, 21.9998f, 14.5056f)
                curveTo(21.9443f, 16.6743f, 21.7234f, 17.9514f, 20.8448f, 18.8284f)
                curveTo(19.671f, 20.0f, 17.7819f, 20.0f, 14.0037f, 20.0f)
                horizontalLineTo(9.9963f)
                curveTo(6.2181f, 20.0f, 4.329f, 20.0f, 3.1553f, 18.8284f)
                curveTo(2.2766f, 17.9514f, 2.0557f, 16.6743f, 2.0002f, 14.5056f)
                curveTo(1.993f, 14.2275f, 2.2212f, 14.0053f, 2.4908f, 13.9348f)
                curveTo(3.3507f, 13.7099f, 3.9852f, 12.9289f, 3.9852f, 12.0f)
                curveTo(3.9852f, 11.0711f, 3.3507f, 10.2901f, 2.4908f, 10.0652f)
                curveTo(2.2212f, 9.9947f, 1.993f, 9.7725f, 2.0002f, 9.4944f)
                curveTo(2.0557f, 7.3257f, 2.2766f, 6.0486f, 3.1553f, 5.1716f)
                curveTo(4.329f, 4.0f, 6.2181f, 4.0f, 9.9963f, 4.0f)
                close()
                moveTo(12.9541f, 10.1989f)
                lineTo(12.8556f, 10.0225f)
                curveTo(12.4749f, 9.3408f, 12.2846f, 9.0f, 12.0f, 9.0f)
                curveTo(11.7154f, 9.0f, 11.5251f, 9.3408f, 11.1444f, 10.0225f)
                lineTo(11.0459f, 10.1989f)
                curveTo(10.9377f, 10.3926f, 10.8836f, 10.4894f, 10.7993f, 10.5533f)
                curveTo(10.7149f, 10.6172f, 10.6099f, 10.641f, 10.3998f, 10.6884f)
                lineTo(10.2086f, 10.7316f)
                curveTo(9.4693f, 10.8986f, 9.0997f, 10.982f, 9.0117f, 11.2643f)
                curveTo(8.9238f, 11.5466f, 9.1758f, 11.8407f, 9.6798f, 12.429f)
                lineTo(9.8101f, 12.5812f)
                curveTo(9.9534f, 12.7483f, 10.025f, 12.8319f, 10.0572f, 12.9353f)
                curveTo(10.0894f, 13.0387f, 10.0786f, 13.1502f, 10.0569f, 13.3733f)
                lineTo(10.0372f, 13.5763f)
                curveTo(9.961f, 14.3612f, 9.9229f, 14.7536f, 10.1531f, 14.9281f)
                curveTo(10.3834f, 15.1025f, 10.7295f, 14.9435f, 11.4216f, 14.6254f)
                lineTo(11.6007f, 14.5431f)
                curveTo(11.7974f, 14.4527f, 11.8958f, 14.4075f, 12.0f, 14.4075f)
                curveTo(12.1042f, 14.4075f, 12.2026f, 14.4527f, 12.3993f, 14.5431f)
                lineTo(12.5784f, 14.6254f)
                curveTo(13.2705f, 14.9435f, 13.6166f, 15.1025f, 13.8469f, 14.9281f)
                curveTo(14.0771f, 14.7536f, 14.039f, 14.3612f, 13.9628f, 13.5763f)
                lineTo(13.9431f, 13.3733f)
                curveTo(13.9214f, 13.1502f, 13.9106f, 13.0387f, 13.9428f, 12.9353f)
                curveTo(13.975f, 12.8319f, 14.0466f, 12.7483f, 14.1899f, 12.5812f)
                lineTo(14.3203f, 12.429f)
                curveTo(14.8242f, 11.8407f, 15.0762f, 11.5466f, 14.9883f, 11.2643f)
                curveTo(14.9003f, 10.982f, 14.5307f, 10.8986f, 13.7914f, 10.7316f)
                lineTo(13.6002f, 10.6884f)
                curveTo(13.3901f, 10.641f, 13.2851f, 10.6172f, 13.2007f, 10.5533f)
                curveTo(13.1164f, 10.4894f, 13.0623f, 10.3926f, 12.9541f, 10.1989f)
                close()
            }
        }
        .build()
        return _tickerStar!!
    }

private var _tickerStar: ImageVector? = null
