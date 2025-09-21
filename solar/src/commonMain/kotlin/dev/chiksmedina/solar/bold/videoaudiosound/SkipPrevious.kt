package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                pathFillType = NonZero
            ) {
                moveTo(8.0901f, 14.6474f)
                curveTo(6.3033f, 13.4935f, 6.3033f, 10.5065f, 8.0901f, 9.3526f)
                lineTo(18.8792f, 2.3855f)
                curveTo(20.6158f, 1.264f, 22.75f, 2.7237f, 22.75f, 5.0329f)
                verticalLineTo(18.9671f)
                curveTo(22.75f, 21.2763f, 20.6158f, 22.736f, 18.8792f, 21.6145f)
                lineTo(8.0901f, 14.6474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 4.5858f, 2.3358f, 4.25f, 2.75f, 4.25f)
                curveTo(3.1642f, 4.25f, 3.5f, 4.5858f, 3.5f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.5f, 19.4142f, 3.1642f, 19.75f, 2.75f, 19.75f)
                curveTo(2.3358f, 19.75f, 2.0f, 19.4142f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
            .build()
        return _skipPrevious!!
    }

private var _skipPrevious: ImageVector? = null
