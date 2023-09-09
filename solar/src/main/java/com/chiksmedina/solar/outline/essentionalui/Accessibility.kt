package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(name = "Accessibility", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 7.0f)
                curveTo(9.25f, 5.4812f, 10.4812f, 4.25f, 12.0f, 4.25f)
                curveTo(13.5188f, 4.25f, 14.75f, 5.4812f, 14.75f, 7.0f)
                curveTo(14.75f, 8.5188f, 13.5188f, 9.75f, 12.0f, 9.75f)
                curveTo(10.4812f, 9.75f, 9.25f, 8.5188f, 9.25f, 7.0f)
                close()
                moveTo(12.0f, 5.75f)
                curveTo(11.3096f, 5.75f, 10.75f, 6.3096f, 10.75f, 7.0f)
                curveTo(10.75f, 7.6904f, 11.3096f, 8.25f, 12.0f, 8.25f)
                curveTo(12.6904f, 8.25f, 13.25f, 7.6904f, 13.25f, 7.0f)
                curveTo(13.25f, 6.3096f, 12.6904f, 5.75f, 12.0f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3095f, 9.7072f)
                curveTo(5.4712f, 9.3259f, 5.9113f, 9.1479f, 6.2927f, 9.3095f)
                lineTo(6.294f, 9.31f)
                lineTo(6.3003f, 9.3127f)
                lineTo(6.3275f, 9.324f)
                curveTo(6.352f, 9.3342f, 6.3891f, 9.3494f, 6.4377f, 9.3691f)
                curveTo(6.5349f, 9.4083f, 6.6779f, 9.465f, 6.8576f, 9.5333f)
                curveTo(7.2174f, 9.67f, 7.7224f, 9.8524f, 8.3015f, 10.0346f)
                curveTo(9.4797f, 10.4052f, 10.8888f, 10.75f, 12.0f, 10.75f)
                curveTo(13.1112f, 10.75f, 14.5203f, 10.4052f, 15.6985f, 10.0346f)
                curveTo(16.2775f, 9.8524f, 16.7826f, 9.67f, 17.1424f, 9.5333f)
                curveTo(17.3221f, 9.465f, 17.4651f, 9.4083f, 17.5623f, 9.3691f)
                curveTo(17.6109f, 9.3494f, 17.648f, 9.3342f, 17.6725f, 9.324f)
                lineTo(17.6997f, 9.3127f)
                lineTo(17.706f, 9.31f)
                lineTo(17.7072f, 9.3095f)
                curveTo(18.0885f, 9.1479f, 18.5288f, 9.3259f, 18.6905f, 9.7072f)
                curveTo(18.8522f, 10.0886f, 18.6739f, 10.5289f, 18.2926f, 10.6906f)
                lineTo(18.2889f, 10.6922f)
                lineTo(18.2798f, 10.696f)
                lineTo(18.2468f, 10.7097f)
                curveTo(18.2183f, 10.7215f, 18.1771f, 10.7385f, 18.1241f, 10.7599f)
                curveTo(18.0183f, 10.8026f, 17.8656f, 10.8631f, 17.6752f, 10.9355f)
                curveTo(17.2949f, 11.08f, 16.7617f, 11.2726f, 16.1486f, 11.4655f)
                curveTo(15.1597f, 11.7765f, 13.9122f, 12.1049f, 12.75f, 12.2131f)
                verticalLineTo(13.4522f)
                curveTo(12.75f, 13.8837f, 12.874f, 14.306f, 13.1073f, 14.6689f)
                lineTo(15.6309f, 18.5944f)
                curveTo(15.8549f, 18.9429f, 15.754f, 19.4069f, 15.4056f, 19.6309f)
                curveTo(15.0571f, 19.8549f, 14.5931f, 19.754f, 14.3691f, 19.4056f)
                lineTo(12.0f, 15.7203f)
                lineTo(9.6309f, 19.4056f)
                curveTo(9.4069f, 19.754f, 8.9429f, 19.8549f, 8.5944f, 19.6309f)
                curveTo(8.246f, 19.4069f, 8.1451f, 18.9429f, 8.3691f, 18.5944f)
                lineTo(10.8927f, 14.6689f)
                curveTo(11.126f, 14.306f, 11.25f, 13.8837f, 11.25f, 13.4522f)
                verticalLineTo(12.2131f)
                curveTo(10.0878f, 12.1049f, 8.8403f, 11.7765f, 7.8514f, 11.4655f)
                curveTo(7.2383f, 11.2726f, 6.7051f, 11.08f, 6.3248f, 10.9355f)
                curveTo(6.1344f, 10.8631f, 5.9817f, 10.8026f, 5.8759f, 10.7599f)
                curveTo(5.8229f, 10.7385f, 5.7817f, 10.7215f, 5.7532f, 10.7097f)
                lineTo(5.7202f, 10.696f)
                lineTo(5.7111f, 10.6922f)
                lineTo(5.7074f, 10.6906f)
                curveTo(5.3261f, 10.5289f, 5.1478f, 10.0886f, 5.3095f, 9.7072f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
        .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
