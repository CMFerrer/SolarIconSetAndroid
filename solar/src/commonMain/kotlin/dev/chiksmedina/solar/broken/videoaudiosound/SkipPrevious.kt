package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 18.9671f)
                curveTo(22.0f, 21.2763f, 19.8658f, 22.736f, 18.1292f, 21.6145f)
                lineTo(7.3402f, 14.6474f)
                curveTo(5.5533f, 13.4935f, 5.5533f, 10.5065f, 7.3401f, 9.3526f)
                lineTo(18.1292f, 2.3855f)
                curveTo(19.8658f, 1.264f, 22.0f, 2.7237f, 22.0f, 5.0329f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 5.0f)
                verticalLineTo(12.0f)
                moveTo(2.0f, 19.0f)
                verticalLineTo(16.0f)
            }
        }
            .build()
        return _skipPrevious!!
    }

private var _skipPrevious: ImageVector? = null
