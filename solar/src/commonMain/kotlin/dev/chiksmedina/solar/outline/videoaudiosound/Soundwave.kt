package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Soundwave: ImageVector
    get() {
        if (_soundwave != null) {
            return _soundwave!!
        }
        _soundwave = Builder(
            name = "Soundwave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                lineTo(12.75f, 20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                lineTo(11.25f, 4.0f)
                curveTo(11.25f, 3.5858f, 11.5858f, 3.25f, 12.0f, 3.25f)
                close()
                moveTo(8.0f, 6.25f)
                curveTo(8.4142f, 6.25f, 8.75f, 6.5858f, 8.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(8.75f, 17.4142f, 8.4142f, 17.75f, 8.0f, 17.75f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(7.25f, 6.5858f, 7.5858f, 6.25f, 8.0f, 6.25f)
                close()
                moveTo(16.0f, 6.25f)
                curveTo(16.4142f, 6.25f, 16.75f, 6.5858f, 16.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                curveTo(15.5858f, 17.75f, 15.25f, 17.4142f, 15.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(15.25f, 6.5858f, 15.5858f, 6.25f, 16.0f, 6.25f)
                close()
                moveTo(4.0f, 10.25f)
                curveTo(4.4142f, 10.25f, 4.75f, 10.5858f, 4.75f, 11.0f)
                lineTo(4.75f, 13.0f)
                curveTo(4.75f, 13.4142f, 4.4142f, 13.75f, 4.0f, 13.75f)
                curveTo(3.5858f, 13.75f, 3.25f, 13.4142f, 3.25f, 13.0f)
                lineTo(3.25f, 11.0f)
                curveTo(3.25f, 10.5858f, 3.5858f, 10.25f, 4.0f, 10.25f)
                close()
                moveTo(20.0f, 10.25f)
                curveTo(20.4142f, 10.25f, 20.75f, 10.5858f, 20.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(20.75f, 13.4142f, 20.4142f, 13.75f, 20.0f, 13.75f)
                curveTo(19.5858f, 13.75f, 19.25f, 13.4142f, 19.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(19.25f, 10.5858f, 19.5858f, 10.25f, 20.0f, 10.25f)
                close()
            }
        }
            .build()
        return _soundwave!!
    }

private var _soundwave: ImageVector? = null
