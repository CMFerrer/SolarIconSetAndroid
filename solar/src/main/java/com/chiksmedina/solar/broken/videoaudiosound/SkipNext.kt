package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.SkipNext: ImageVector
    get() {
        if (_skipNext != null) {
            return _skipNext!!
        }
        _skipNext = Builder(
            name = "SkipNext", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 11.0f)
                lineTo(2.0f, 18.9671f)
                curveTo(2.0f, 21.2763f, 4.1342f, 22.736f, 5.8708f, 21.6145f)
                lineTo(16.6598f, 14.6474f)
                curveTo(18.4467f, 13.4935f, 18.4467f, 10.5065f, 16.6598f, 9.3526f)
                lineTo(5.8708f, 2.3855f)
                curveTo(4.1342f, 1.264f, 2.0f, 2.7237f, 2.0f, 5.0329f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 5.0f)
                verticalLineTo(12.0f)
                moveTo(22.0f, 16.0f)
                verticalLineTo(19.0f)
            }
        }
            .build()
        return _skipNext!!
    }

private var _skipNext: ImageVector? = null
