package dev.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.Muted: ImageVector
    get() {
        if (_muted != null) {
            return _muted!!
        }
        _muted = Builder(
            name = "Muted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.6589f, 6.0f)
                curveTo(16.5186f, 5.2022f, 16.2887f, 4.6847f, 15.8669f, 4.3716f)
                curveTo(15.7026f, 4.2497f, 15.5186f, 4.1509f, 15.3286f, 4.0824f)
                curveTo(14.3375f, 3.7253f, 13.1569f, 4.5473f, 10.7955f, 6.1913f)
                lineTo(10.5922f, 6.3328f)
                curveTo(10.1953f, 6.6092f, 9.9968f, 6.7474f, 9.7831f, 6.847f)
                curveTo(9.5719f, 6.9454f, 9.3498f, 7.0158f, 9.1222f, 7.0564f)
                curveTo(8.8919f, 7.0974f, 8.6541f, 7.0974f, 8.1786f, 7.0974f)
                curveTo(6.9029f, 7.0974f, 6.265f, 7.0974f, 5.7085f, 7.3693f)
                curveTo(5.2f, 7.6177f, 4.6915f, 8.1229f, 4.4258f, 8.6437f)
                curveTo(4.1349f, 9.2137f, 4.1007f, 9.8063f, 4.0323f, 10.9916f)
                curveTo(4.0121f, 11.3423f, 4.0f, 11.6839f, 4.0f, 12.0f)
                curveTo(4.0f, 12.3161f, 4.0121f, 12.6577f, 4.0323f, 13.0084f)
                curveTo(4.1007f, 14.1936f, 4.1349f, 14.7863f, 4.4258f, 15.3563f)
                curveTo(4.6915f, 15.8771f, 5.2f, 16.3823f, 5.7085f, 16.6307f)
                curveTo(6.265f, 16.9026f, 6.9029f, 16.9026f, 8.1786f, 16.9026f)
                curveTo(8.6541f, 16.9026f, 8.8919f, 16.9026f, 9.1222f, 16.9436f)
                curveTo(9.3498f, 16.9842f, 9.5719f, 17.0546f, 9.7831f, 17.153f)
                curveTo(9.9968f, 17.2526f, 10.1953f, 17.3908f, 10.5922f, 17.6672f)
                lineTo(10.7955f, 17.8087f)
                curveTo(13.1569f, 19.4527f, 14.3375f, 20.2747f, 15.3286f, 19.9176f)
                curveTo(15.5186f, 19.8491f, 15.7026f, 19.7503f, 15.8669f, 19.6284f)
                curveTo(16.2887f, 19.3153f, 16.5186f, 18.7978f, 16.6589f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 9.0f)
                lineTo(14.0f, 15.0f)
                moveTo(14.0f, 9.0f)
                lineTo(19.9999f, 15.0f)
            }
        }
            .build()
        return _muted!!
    }

private var _muted: ImageVector? = null
