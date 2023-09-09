package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

public val VideoAudioSoundGroup.SkipNext: ImageVector
    get() {
        if (_skipNext != null) {
            return _skipNext!!
        }
        _skipNext = Builder(name = "SkipNext", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.2777f, 1.7555f)
                curveTo(5.1348f, 1.0175f, 3.8396f, 1.1343f, 2.8608f, 1.8037f)
                curveTo(1.8942f, 2.4648f, 1.25f, 3.6451f, 1.25f, 5.033f)
                verticalLineTo(18.9672f)
                curveTo(1.25f, 20.3551f, 1.8942f, 21.5354f, 2.8608f, 22.1965f)
                curveTo(3.8396f, 22.8659f, 5.1348f, 22.9827f, 6.2777f, 22.2447f)
                lineTo(17.0667f, 15.2775f)
                curveTo(18.217f, 14.5347f, 18.75f, 13.2342f, 18.75f, 12.0001f)
                curveTo(18.75f, 10.7659f, 18.217f, 9.4654f, 17.0667f, 8.7226f)
                lineTo(6.2777f, 1.7555f)
                close()
                moveTo(2.75f, 5.033f)
                curveTo(2.75f, 4.1117f, 3.1729f, 3.4075f, 3.7076f, 3.0418f)
                curveTo(4.2301f, 2.6845f, 4.8702f, 2.6322f, 5.464f, 3.0156f)
                lineTo(16.253f, 9.9827f)
                curveTo(16.8895f, 10.3938f, 17.25f, 11.1637f, 17.25f, 12.0001f)
                curveTo(17.25f, 12.8364f, 16.8895f, 13.6064f, 16.253f, 14.0174f)
                lineTo(5.464f, 20.9846f)
                curveTo(4.8702f, 21.368f, 4.2301f, 21.3157f, 3.7076f, 20.9583f)
                curveTo(3.1729f, 20.5926f, 2.75f, 19.8885f, 2.75f, 18.9672f)
                lineTo(2.75f, 5.033f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 5.0001f)
                curveTo(22.75f, 4.5859f, 22.4142f, 4.2501f, 22.0f, 4.2501f)
                curveTo(21.5858f, 4.2501f, 21.25f, 4.5859f, 21.25f, 5.0001f)
                verticalLineTo(19.0001f)
                curveTo(21.25f, 19.4143f, 21.5858f, 19.7501f, 22.0f, 19.7501f)
                curveTo(22.4142f, 19.7501f, 22.75f, 19.4143f, 22.75f, 19.0001f)
                verticalLineTo(5.0001f)
                close()
            }
        }
        .build()
        return _skipNext!!
    }

private var _skipNext: ImageVector? = null
