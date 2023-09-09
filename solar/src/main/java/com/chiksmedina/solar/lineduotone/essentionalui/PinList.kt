package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.PinList: ImageVector
    get() {
        if (_pinList != null) {
            return _pinList!!
        }
        _pinList = Builder(name = "PinList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6315f, 8.2238f)
                lineTo(13.2651f, 7.8574f)
                curveTo(11.735f, 6.3274f, 10.97f, 5.5623f, 10.1406f, 5.563f)
                curveTo(9.8697f, 5.5632f, 9.6017f, 5.6185f, 9.3527f, 5.7254f)
                curveTo(8.5907f, 6.0528f, 8.1906f, 7.0581f, 7.3905f, 9.0686f)
                lineTo(7.3326f, 9.2141f)
                curveTo(7.1057f, 9.784f, 6.9923f, 10.069f, 6.8102f, 10.2989f)
                curveTo(6.672f, 10.4733f, 6.5057f, 10.6235f, 6.318f, 10.7431f)
                curveTo(6.0708f, 10.9009f, 5.7757f, 10.9846f, 5.1855f, 11.1521f)
                curveTo(4.2704f, 11.4118f, 3.8129f, 11.5417f, 3.6098f, 11.8186f)
                curveTo(3.4589f, 12.0244f, 3.3924f, 12.2802f, 3.4239f, 12.5334f)
                curveTo(3.4663f, 12.8742f, 3.8026f, 13.2105f, 4.4753f, 13.8832f)
                lineTo(7.6058f, 17.0137f)
                curveTo(8.2784f, 17.6863f, 8.6147f, 18.0226f, 8.9555f, 18.065f)
                curveTo(9.2088f, 18.0966f, 9.4645f, 18.03f, 9.6703f, 17.8791f)
                curveTo(9.9473f, 17.6761f, 10.0771f, 17.2185f, 10.3369f, 16.3034f)
                curveTo(10.5044f, 15.7133f, 10.5881f, 15.4182f, 10.7458f, 15.1709f)
                curveTo(10.8655f, 14.9833f, 11.0156f, 14.817f, 11.19f, 14.6788f)
                curveTo(11.4199f, 14.4967f, 11.7049f, 14.3832f, 12.2749f, 14.1564f)
                lineTo(12.4204f, 14.0985f)
                curveTo(14.4309f, 13.2983f, 15.4361f, 12.8982f, 15.7635f, 12.1362f)
                curveTo(15.8705f, 11.8873f, 15.9257f, 11.6192f, 15.926f, 11.3483f)
                curveTo(15.9266f, 10.5189f, 15.1616f, 9.7539f, 13.6315f, 8.2238f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3468f, 18.142f)
                lineTo(6.0405f, 15.4482f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                horizontalLineTo(13.0f)
            }
        }
        .build()
        return _pinList!!
    }

private var _pinList: ImageVector? = null
