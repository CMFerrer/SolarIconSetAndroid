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

val VideoAudioSoundGroup.Reel: ImageVector
    get() {
        if (_reel != null) {
            return _reel!!
        }
        _reel = Builder(
            name = "Reel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(17.4805f, 21.25f)
                curveTo(20.6354f, 19.3767f, 22.75f, 15.9353f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(17.4805f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.5858f, 6.75f, 11.25f, 7.0858f, 11.25f, 7.5f)
                curveTo(11.25f, 7.9142f, 11.5858f, 8.25f, 12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 7.9142f, 12.75f, 7.5f)
                curveTo(12.75f, 7.0858f, 12.4142f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(9.75f, 7.5f)
                curveTo(9.75f, 6.2574f, 10.7574f, 5.25f, 12.0f, 5.25f)
                curveTo(13.2426f, 5.25f, 14.25f, 6.2574f, 14.25f, 7.5f)
                curveTo(14.25f, 8.7426f, 13.2426f, 9.75f, 12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 8.7426f, 9.75f, 7.5f)
                close()
                moveTo(7.5f, 11.25f)
                curveTo(7.0858f, 11.25f, 6.75f, 11.5858f, 6.75f, 12.0f)
                curveTo(6.75f, 12.4142f, 7.0858f, 12.75f, 7.5f, 12.75f)
                curveTo(7.9142f, 12.75f, 8.25f, 12.4142f, 8.25f, 12.0f)
                curveTo(8.25f, 11.5858f, 7.9142f, 11.25f, 7.5f, 11.25f)
                close()
                moveTo(5.25f, 12.0f)
                curveTo(5.25f, 10.7574f, 6.2574f, 9.75f, 7.5f, 9.75f)
                curveTo(8.7426f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 8.7426f, 14.25f, 7.5f, 14.25f)
                curveTo(6.2574f, 14.25f, 5.25f, 13.2426f, 5.25f, 12.0f)
                close()
                moveTo(16.5f, 11.25f)
                curveTo(16.0858f, 11.25f, 15.75f, 11.5858f, 15.75f, 12.0f)
                curveTo(15.75f, 12.4142f, 16.0858f, 12.75f, 16.5f, 12.75f)
                curveTo(16.9142f, 12.75f, 17.25f, 12.4142f, 17.25f, 12.0f)
                curveTo(17.25f, 11.5858f, 16.9142f, 11.25f, 16.5f, 11.25f)
                close()
                moveTo(14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 15.2574f, 9.75f, 16.5f, 9.75f)
                curveTo(17.7426f, 9.75f, 18.75f, 10.7574f, 18.75f, 12.0f)
                curveTo(18.75f, 13.2426f, 17.7426f, 14.25f, 16.5f, 14.25f)
                curveTo(15.2574f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                close()
                moveTo(12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 16.0858f, 11.25f, 16.5f)
                curveTo(11.25f, 16.9142f, 11.5858f, 17.25f, 12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 16.9142f, 12.75f, 16.5f)
                curveTo(12.75f, 16.0858f, 12.4142f, 15.75f, 12.0f, 15.75f)
                close()
                moveTo(9.75f, 16.5f)
                curveTo(9.75f, 15.2574f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 15.2574f, 14.25f, 16.5f)
                curveTo(14.25f, 17.7426f, 13.2426f, 18.75f, 12.0f, 18.75f)
                curveTo(10.7574f, 18.75f, 9.75f, 17.7426f, 9.75f, 16.5f)
                close()
            }
        }
            .build()
        return _reel!!
    }

private var _reel: ImageVector? = null
