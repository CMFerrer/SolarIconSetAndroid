package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

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
                moveTo(12.6361f, 15.2616f)
                lineTo(11.4334f, 16.4643f)
                curveTo(10.2022f, 17.6955f, 9.5866f, 18.3111f, 8.9249f, 18.1658f)
                curveTo(8.2632f, 18.0204f, 7.9623f, 17.2035f, 7.3603f, 15.5696f)
                lineTo(5.3527f, 10.1205f)
                curveTo(4.1519f, 6.8611f, 3.5515f, 5.2314f, 4.3914f, 4.3914f)
                curveTo(5.2314f, 3.5515f, 6.8611f, 4.1519f, 10.1205f, 5.3527f)
                lineTo(15.5696f, 7.3603f)
                curveTo(17.2035f, 7.9623f, 18.0204f, 8.2632f, 18.1658f, 8.9249f)
                curveTo(18.3111f, 9.5866f, 17.6955f, 10.2022f, 16.4643f, 11.4334f)
                lineTo(15.2616f, 12.6361f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.636f, 15.2618f)
                lineTo(16.5743f, 19.2001f)
                curveTo(16.9821f, 19.6079f, 17.186f, 19.8117f, 17.4134f, 19.906f)
                curveTo(17.7167f, 20.0316f, 18.0574f, 20.0316f, 18.3607f, 19.906f)
                curveTo(18.5882f, 19.8117f, 18.792f, 19.6078f, 19.1998f, 19.2001f)
                curveTo(19.6076f, 18.7923f, 19.8115f, 18.5884f, 19.9057f, 18.3609f)
                curveTo(20.0313f, 18.0577f, 20.0313f, 17.7169f, 19.9057f, 17.4137f)
                curveTo(19.8115f, 17.1862f, 19.6076f, 16.9823f, 19.1998f, 16.5745f)
                lineTo(15.2615f, 12.6362f)
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
