package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.942f)
                curveTo(6.4756f, 4.0269f, 5.129f, 3.6538f, 4.3914f, 4.3914f)
                curveTo(3.5515f, 5.2314f, 4.1519f, 6.8611f, 5.3527f, 10.1205f)
                lineTo(7.3603f, 15.5696f)
                curveTo(7.9623f, 17.2035f, 8.2632f, 18.0204f, 8.9249f, 18.1658f)
                curveTo(9.5866f, 18.3111f, 10.2022f, 17.6955f, 11.4334f, 16.4643f)
                lineTo(12.6361f, 15.2616f)
                lineTo(16.5744f, 19.1999f)
                curveTo(16.9821f, 19.6077f, 17.186f, 19.8116f, 17.4135f, 19.9058f)
                curveTo(17.7168f, 20.0314f, 18.0575f, 20.0314f, 18.3608f, 19.9058f)
                curveTo(18.5882f, 19.8116f, 18.7921f, 19.6077f, 19.1999f, 19.1999f)
                curveTo(19.6077f, 18.7921f, 19.8116f, 18.5882f, 19.9058f, 18.3608f)
                curveTo(20.0314f, 18.0575f, 20.0314f, 17.7168f, 19.9058f, 17.4135f)
                curveTo(19.8116f, 17.186f, 19.6077f, 16.9821f, 19.1999f, 16.5744f)
                lineTo(15.2616f, 12.6361f)
                lineTo(16.4643f, 11.4334f)
                curveTo(17.6955f, 10.2022f, 18.3111f, 9.5866f, 18.1658f, 8.9249f)
                curveTo(18.0204f, 8.2632f, 17.2035f, 7.9623f, 15.5696f, 7.3603f)
                lineTo(13.0f, 6.4136f)
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
