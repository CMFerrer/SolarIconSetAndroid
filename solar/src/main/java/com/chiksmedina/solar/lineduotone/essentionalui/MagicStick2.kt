package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.MagicStick2: ImageVector
    get() {
        if (_magicStick2 != null) {
            return _magicStick2!!
        }
        _magicStick2 = Builder(name = "MagicStick2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0356f, 3.6516f)
                curveTo(15.2506f, 2.3398f, 16.3582f, 1.6839f, 17.1715f, 2.1493f)
                curveTo(17.9849f, 2.6147f, 17.9655f, 3.8931f, 17.9266f, 6.4499f)
                lineTo(17.9166f, 7.1114f)
                curveTo(17.9055f, 7.838f, 17.9f, 8.2013f, 18.0354f, 8.5205f)
                curveTo(18.1708f, 8.8398f, 18.4318f, 9.0789f, 18.9538f, 9.557f)
                lineTo(19.4291f, 9.9923f)
                curveTo(21.266f, 11.675f, 22.1845f, 12.5163f, 21.9691f, 13.4611f)
                curveTo(21.7538f, 14.4059f, 20.5474f, 14.8284f, 18.1344f, 15.6735f)
                lineTo(17.5101f, 15.8921f)
                curveTo(16.8244f, 16.1322f, 16.4816f, 16.2523f, 16.2186f, 16.4931f)
                curveTo(15.9555f, 16.7338f, 15.8021f, 17.0679f, 15.4953f, 17.7362f)
                lineTo(15.2159f, 18.3446f)
                curveTo(14.1362f, 20.6963f, 13.5963f, 21.8722f, 12.6498f, 21.9907f)
                curveTo(11.7034f, 22.1092f, 10.9772f, 21.092f, 9.5247f, 19.0574f)
                lineTo(9.149f, 18.5311f)
                curveTo(8.7362f, 17.9529f, 8.5299f, 17.6638f, 8.2319f, 17.4934f)
                curveTo(7.9339f, 17.3229f, 7.5781f, 17.2903f, 6.8665f, 17.2252f)
                lineTo(6.2186f, 17.1659f)
                curveTo(3.7144f, 16.9367f, 2.4622f, 16.8221f, 2.0926f, 15.9505f)
                curveTo(1.723f, 15.079f, 2.4806f, 14.0278f, 3.9959f, 11.9253f)
                lineTo(4.388f, 11.3813f)
                curveTo(4.8186f, 10.7839f, 5.0339f, 10.4851f, 5.1128f, 10.139f)
                curveTo(5.1916f, 9.7929f, 5.1251f, 9.4387f, 4.9922f, 8.7302f)
                lineTo(4.8711f, 8.0851f)
                curveTo(4.4031f, 5.5917f, 4.1692f, 4.345f, 4.8872f, 3.6879f)
                curveTo(5.6052f, 3.0307f, 6.7997f, 3.3983f, 9.1886f, 4.1334f)
                lineTo(9.8067f, 4.3236f)
                curveTo(10.4855f, 4.5325f, 10.825f, 4.637f, 11.1717f, 4.5935f)
                curveTo(11.5184f, 4.5501f, 11.8331f, 4.3637f, 12.4625f, 3.991f)
                lineTo(13.0356f, 3.6516f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5303f, 16.4697f)
                curveTo(17.2374f, 16.1768f, 16.7626f, 16.1768f, 16.4697f, 16.4697f)
                curveTo(16.1768f, 16.7626f, 16.1768f, 17.2374f, 16.4697f, 17.5303f)
                lineTo(17.5303f, 16.4697f)
                close()
                moveTo(20.4697f, 21.5303f)
                curveTo(20.7626f, 21.8232f, 21.2374f, 21.8232f, 21.5303f, 21.5303f)
                curveTo(21.8232f, 21.2374f, 21.8232f, 20.7626f, 21.5303f, 20.4697f)
                lineTo(20.4697f, 21.5303f)
                close()
                moveTo(16.4697f, 17.5303f)
                lineTo(20.4697f, 21.5303f)
                lineTo(21.5303f, 20.4697f)
                lineTo(17.5303f, 16.4697f)
                lineTo(16.4697f, 17.5303f)
                close()
            }
        }
        .build()
        return _magicStick2!!
    }

private var _magicStick2: ImageVector? = null
