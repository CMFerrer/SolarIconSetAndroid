package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.VideoFrame: ImageVector
    get() {
        if (_videoFrame != null) {
            return _videoFrame!!
        }
        _videoFrame = Builder(
            name = "VideoFrame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 2.5f)
                lineTo(17.0f, 21.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 2.5f)
                lineTo(7.0f, 21.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.5f, 6.25f)
                curveTo(2.0858f, 6.25f, 1.75f, 6.5858f, 1.75f, 7.0f)
                curveTo(1.75f, 7.4142f, 2.0858f, 7.75f, 2.5f, 7.75f)
                lineTo(2.5f, 6.25f)
                close()
                moveTo(7.0f, 7.75f)
                curveTo(7.4142f, 7.75f, 7.75f, 7.4142f, 7.75f, 7.0f)
                curveTo(7.75f, 6.5858f, 7.4142f, 6.25f, 7.0f, 6.25f)
                lineTo(7.0f, 7.75f)
                close()
                moveTo(17.0f, 6.25f)
                curveTo(16.5858f, 6.25f, 16.25f, 6.5858f, 16.25f, 7.0f)
                curveTo(16.25f, 7.4142f, 16.5858f, 7.75f, 17.0f, 7.75f)
                lineTo(17.0f, 6.25f)
                close()
                moveTo(2.5f, 7.75f)
                lineTo(7.0f, 7.75f)
                lineTo(7.0f, 6.25f)
                lineTo(2.5f, 6.25f)
                lineTo(2.5f, 7.75f)
                close()
                moveTo(17.0f, 7.75f)
                lineTo(22.0f, 7.75f)
                lineTo(22.0f, 6.25f)
                lineTo(17.0f, 6.25f)
                lineTo(17.0f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5f, 17.75f)
                curveTo(21.9142f, 17.75f, 22.25f, 17.4142f, 22.25f, 17.0f)
                curveTo(22.25f, 16.5858f, 21.9142f, 16.25f, 21.5f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(17.0f, 16.25f)
                curveTo(16.5858f, 16.25f, 16.25f, 16.5858f, 16.25f, 17.0f)
                curveTo(16.25f, 17.4142f, 16.5858f, 17.75f, 17.0f, 17.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(7.0f, 17.75f)
                curveTo(7.4142f, 17.75f, 7.75f, 17.4142f, 7.75f, 17.0f)
                curveTo(7.75f, 16.5858f, 7.4142f, 16.25f, 7.0f, 16.25f)
                lineTo(7.0f, 17.75f)
                close()
                moveTo(17.0f, 17.75f)
                lineTo(21.5f, 17.75f)
                verticalLineTo(16.25f)
                lineTo(17.0f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(2.0f, 17.75f)
                lineTo(7.0f, 17.75f)
                lineTo(7.0f, 16.25f)
                lineTo(2.0f, 16.25f)
                lineTo(2.0f, 17.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.352f, 4.2809f, 21.7133f, 5.3749f, 21.8731f, 7.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.648f, 19.7191f, 2.2867f, 18.6251f, 2.1269f, 17.0f)
            }
        }
            .build()
        return _videoFrame!!
    }

private var _videoFrame: ImageVector? = null
