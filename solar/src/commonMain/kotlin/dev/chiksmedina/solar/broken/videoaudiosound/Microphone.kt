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

val VideoAudioSoundGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(
            name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 5.2386f, 9.2386f, 3.0f, 12.0f, 3.0f)
                curveTo(14.7614f, 3.0f, 17.0f, 5.2386f, 17.0f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 13.7614f, 14.7614f, 16.0f, 12.0f, 16.0f)
                curveTo(9.2386f, 16.0f, 7.0f, 13.7614f, 7.0f, 11.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 8.0f)
                lineTo(17.0f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 11.0f)
                lineTo(17.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.75f, 10.0f)
                curveTo(20.75f, 9.5858f, 20.4142f, 9.25f, 20.0f, 9.25f)
                curveTo(19.5858f, 9.25f, 19.25f, 9.5858f, 19.25f, 10.0f)
                horizontalLineTo(20.75f)
                close()
                moveTo(4.75f, 10.0f)
                curveTo(4.75f, 9.5858f, 4.4142f, 9.25f, 4.0f, 9.25f)
                curveTo(3.5858f, 9.25f, 3.25f, 9.5858f, 3.25f, 10.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(15.5121f, 17.3442f)
                curveTo(15.1499f, 17.5452f, 15.0192f, 18.0017f, 15.2202f, 18.3639f)
                curveTo(15.4212f, 18.7261f, 15.8777f, 18.8568f, 16.2399f, 18.6558f)
                lineTo(15.5121f, 17.3442f)
                close()
                moveTo(19.25f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.25f)
                close()
                moveTo(4.75f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(7.9959f, 18.25f, 4.75f, 15.0041f, 4.75f, 11.0f)
                horizontalLineTo(3.25f)
                curveTo(3.25f, 15.8325f, 7.1675f, 19.75f, 12.0f, 19.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(19.25f, 11.0f)
                curveTo(19.25f, 13.7287f, 17.7429f, 16.1063f, 15.5121f, 17.3442f)
                lineTo(16.2399f, 18.6558f)
                curveTo(18.928f, 17.1642f, 20.75f, 14.2954f, 20.75f, 11.0f)
                horizontalLineTo(19.25f)
                close()
            }
        }
            .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
