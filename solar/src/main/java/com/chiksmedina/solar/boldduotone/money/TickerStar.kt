package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.TickerStar: ImageVector
    get() {
        if (_tickerStar != null) {
            return _tickerStar!!
        }
        _tickerStar = Builder(
            name = "TickerStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.9543f, 10.1989f)
                lineTo(12.8558f, 10.0225f)
                curveTo(12.4751f, 9.3408f, 12.2848f, 9.0f, 12.0002f, 9.0f)
                curveTo(11.7156f, 9.0f, 11.5252f, 9.3408f, 11.1445f, 10.0225f)
                lineTo(11.1445f, 10.0225f)
                lineTo(11.0461f, 10.1989f)
                curveTo(10.9379f, 10.3926f, 10.8838f, 10.4894f, 10.7994f, 10.5533f)
                curveTo(10.7151f, 10.6172f, 10.6101f, 10.641f, 10.4f, 10.6884f)
                lineTo(10.2087f, 10.7316f)
                curveTo(9.4695f, 10.8986f, 9.0998f, 10.982f, 9.0119f, 11.2643f)
                curveTo(8.924f, 11.5466f, 9.1759f, 11.8407f, 9.6799f, 12.429f)
                lineTo(9.8103f, 12.5812f)
                curveTo(9.9535f, 12.7483f, 10.0251f, 12.8319f, 10.0573f, 12.9353f)
                curveTo(10.0896f, 13.0387f, 10.0787f, 13.1502f, 10.0571f, 13.3733f)
                lineTo(10.0374f, 13.5763f)
                curveTo(9.9612f, 14.3612f, 9.9231f, 14.7536f, 10.1533f, 14.9281f)
                curveTo(10.3835f, 15.1025f, 10.7296f, 14.9435f, 11.4218f, 14.6254f)
                lineTo(11.6009f, 14.5431f)
                curveTo(11.7976f, 14.4527f, 11.8959f, 14.4075f, 12.0002f, 14.4075f)
                curveTo(12.1044f, 14.4075f, 12.2028f, 14.4527f, 12.3995f, 14.5431f)
                lineTo(12.5785f, 14.6254f)
                lineTo(12.5785f, 14.6254f)
                curveTo(13.2707f, 14.9435f, 13.6168f, 15.1025f, 13.847f, 14.9281f)
                curveTo(14.0773f, 14.7536f, 14.0392f, 14.3612f, 13.963f, 13.5763f)
                verticalLineTo(13.5763f)
                lineTo(13.9433f, 13.3733f)
                verticalLineTo(13.3733f)
                curveTo(13.9216f, 13.1502f, 13.9108f, 13.0387f, 13.943f, 12.9353f)
                curveTo(13.9752f, 12.8319f, 14.0468f, 12.7483f, 14.19f, 12.5812f)
                lineTo(14.3204f, 12.429f)
                curveTo(14.8244f, 11.8407f, 15.0764f, 11.5466f, 14.9885f, 11.2643f)
                curveTo(14.9005f, 10.982f, 14.5309f, 10.8986f, 13.7916f, 10.7316f)
                lineTo(13.6004f, 10.6884f)
                curveTo(13.3903f, 10.641f, 13.2852f, 10.6172f, 13.2009f, 10.5533f)
                curveTo(13.1166f, 10.4894f, 13.0625f, 10.3926f, 12.9543f, 10.1989f)
                close()
            }
        }
            .build()
        return _tickerStar!!
    }

private var _tickerStar: ImageVector? = null
