package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Pip: ImageVector
    get() {
        if (_pip != null) {
            return _pip!!
        }
        _pip = Builder(
            name = "Pip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 7.2288f, 22.0f, 5.3432f, 20.8284f, 4.1716f)
                curveTo(19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 3.0f, 4.3432f, 3.0f, 3.1716f, 4.1716f)
                curveTo(2.0f, 5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(11.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0f)
                curveTo(13.0f, 15.1144f, 13.0f, 14.1716f, 13.5858f, 13.5858f)
                curveTo(14.1716f, 13.0f, 15.1144f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 13.0f, 20.8284f, 13.0f, 21.4142f, 13.5858f)
                curveTo(22.0f, 14.1716f, 22.0f, 15.1144f, 22.0f, 17.0f)
                curveTo(22.0f, 18.8856f, 22.0f, 19.8284f, 21.4142f, 20.4142f)
                curveTo(20.8284f, 21.0f, 19.8856f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(15.1144f, 21.0f, 14.1716f, 21.0f, 13.5858f, 20.4142f)
                curveTo(13.0f, 19.8284f, 13.0f, 18.8856f, 13.0f, 17.0f)
                close()
            }
        }
            .build()
        return _pip!!
    }

private var _pip: ImageVector? = null
