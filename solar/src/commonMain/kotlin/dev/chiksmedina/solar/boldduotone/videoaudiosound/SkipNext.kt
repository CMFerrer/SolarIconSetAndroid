package dev.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.75f, 5.0f)
                curveTo(22.75f, 4.5858f, 22.4142f, 4.25f, 22.0f, 4.25f)
                curveTo(21.5858f, 4.25f, 21.25f, 4.5858f, 21.25f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.25f, 19.4142f, 21.5858f, 19.75f, 22.0f, 19.75f)
                curveTo(22.4142f, 19.75f, 22.75f, 19.4142f, 22.75f, 19.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.6598f, 14.6474f)
                curveTo(18.4467f, 13.4935f, 18.4467f, 10.5065f, 16.6598f, 9.3526f)
                lineTo(5.8708f, 2.3855f)
                curveTo(4.1342f, 1.264f, 2.0f, 2.7237f, 2.0f, 5.0329f)
                verticalLineTo(18.9671f)
                curveTo(2.0f, 21.2763f, 4.1342f, 22.736f, 5.8708f, 21.6145f)
                lineTo(16.6598f, 14.6474f)
                close()
            }
        }
            .build()
        return _skipNext!!
    }

private var _skipNext: ImageVector? = null
