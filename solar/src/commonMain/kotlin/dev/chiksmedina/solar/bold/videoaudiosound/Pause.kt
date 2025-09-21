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

val VideoAudioSoundGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(
            name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.1144f, 2.0f, 3.1716f, 2.5858f, 2.5858f)
                curveTo(3.1716f, 2.0f, 4.1144f, 2.0f, 6.0f, 2.0f)
                curveTo(7.8856f, 2.0f, 8.8284f, 2.0f, 9.4142f, 2.5858f)
                curveTo(10.0f, 3.1716f, 10.0f, 4.1144f, 10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 19.8856f, 10.0f, 20.8284f, 9.4142f, 21.4142f)
                curveTo(8.8284f, 22.0f, 7.8856f, 22.0f, 6.0f, 22.0f)
                curveTo(4.1144f, 22.0f, 3.1716f, 22.0f, 2.5858f, 21.4142f)
                curveTo(2.0f, 20.8284f, 2.0f, 19.8856f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 6.0f)
                curveTo(14.0f, 4.1144f, 14.0f, 3.1716f, 14.5858f, 2.5858f)
                curveTo(15.1716f, 2.0f, 16.1144f, 2.0f, 18.0f, 2.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.8856f, 22.0f, 20.8284f, 21.4142f, 21.4142f)
                curveTo(20.8284f, 22.0f, 19.8856f, 22.0f, 18.0f, 22.0f)
                curveTo(16.1144f, 22.0f, 15.1716f, 22.0f, 14.5858f, 21.4142f)
                curveTo(14.0f, 20.8284f, 14.0f, 19.8856f, 14.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
