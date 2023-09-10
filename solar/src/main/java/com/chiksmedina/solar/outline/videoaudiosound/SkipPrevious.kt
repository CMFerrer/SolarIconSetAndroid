package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.SkipPrevious: ImageVector
    get() {
        if (_skipPrevious != null) {
            return _skipPrevious!!
        }
        _skipPrevious = Builder(
            name = "SkipPrevious", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.1392f, 1.8037f)
                curveTo(22.1058f, 2.4648f, 22.75f, 3.6451f, 22.75f, 5.033f)
                verticalLineTo(18.9672f)
                curveTo(22.75f, 20.3551f, 22.1058f, 21.5354f, 21.1392f, 22.1965f)
                curveTo(20.1604f, 22.8659f, 18.8652f, 22.9827f, 17.7223f, 22.2447f)
                lineTo(6.9333f, 15.2775f)
                curveTo(5.783f, 14.5347f, 5.25f, 13.2342f, 5.25f, 12.0001f)
                curveTo(5.25f, 10.7659f, 5.783f, 9.4654f, 6.9333f, 8.7226f)
                lineTo(17.7223f, 1.7555f)
                curveTo(18.8652f, 1.0175f, 20.1604f, 1.1343f, 21.1392f, 1.8037f)
                close()
                moveTo(20.2924f, 3.0418f)
                curveTo(19.7699f, 2.6845f, 19.1298f, 2.6322f, 18.536f, 3.0156f)
                lineTo(7.747f, 9.9827f)
                curveTo(7.1105f, 10.3938f, 6.75f, 11.1637f, 6.75f, 12.0001f)
                curveTo(6.75f, 12.8364f, 7.1105f, 13.6064f, 7.747f, 14.0174f)
                lineTo(18.536f, 20.9846f)
                curveTo(19.1298f, 21.368f, 19.7699f, 21.3157f, 20.2924f, 20.9583f)
                curveTo(20.8271f, 20.5926f, 21.25f, 19.8885f, 21.25f, 18.9672f)
                verticalLineTo(5.033f)
                curveTo(21.25f, 4.1117f, 20.8271f, 3.4075f, 20.2924f, 3.0418f)
                close()
                moveTo(2.0f, 4.2501f)
                curveTo(2.4142f, 4.2501f, 2.75f, 4.5859f, 2.75f, 5.0001f)
                verticalLineTo(19.0001f)
                curveTo(2.75f, 19.4143f, 2.4142f, 19.7501f, 2.0f, 19.7501f)
                curveTo(1.5858f, 19.7501f, 1.25f, 19.4143f, 1.25f, 19.0001f)
                verticalLineTo(5.0001f)
                curveTo(1.25f, 4.5859f, 1.5858f, 4.2501f, 2.0f, 4.2501f)
                close()
            }
        }
            .build()
        return _skipPrevious!!
    }

private var _skipPrevious: ImageVector? = null
