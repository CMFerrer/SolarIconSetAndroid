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

val VideoAudioSoundGroup.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(
            name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.003f, 11.7155f)
                curveTo(5.0409f, 9.8733f, 5.0599f, 8.9522f, 5.681f, 8.1636f)
                curveTo(5.7944f, 8.0197f, 5.9607f, 7.8487f, 6.1001f, 7.7327f)
                curveTo(6.8639f, 7.0974f, 7.8724f, 7.0974f, 9.8893f, 7.0974f)
                curveTo(10.6099f, 7.0974f, 10.9702f, 7.0974f, 11.3137f, 7.0045f)
                curveTo(11.385f, 6.9852f, 11.4556f, 6.963f, 11.5253f, 6.9378f)
                curveTo(11.8608f, 6.8167f, 12.1616f, 6.6084f, 12.7632f, 6.1916f)
                curveTo(15.137f, 4.5474f, 16.3239f, 3.7253f, 17.3201f, 4.0824f)
                curveTo(17.5111f, 4.1509f, 17.6959f, 4.2497f, 17.8611f, 4.3716f)
                curveTo(18.7222f, 5.0074f, 18.7877f, 6.4868f, 18.9185f, 9.4454f)
                curveTo(18.967f, 10.5409f, 19.0f, 11.4785f, 19.0f, 12.0f)
                curveTo(19.0f, 12.5215f, 18.967f, 13.4591f, 18.9185f, 14.5546f)
                curveTo(18.7877f, 17.5132f, 18.7222f, 18.9926f, 17.8611f, 19.6284f)
                curveTo(17.6959f, 19.7503f, 17.5111f, 19.8491f, 17.3201f, 19.9176f)
                curveTo(16.3239f, 20.2747f, 15.137f, 19.4526f, 12.7632f, 17.8084f)
                curveTo(12.1616f, 17.3916f, 11.8608f, 17.1833f, 11.5253f, 17.0622f)
                curveTo(11.4556f, 17.037f, 11.385f, 17.0148f, 11.3137f, 16.9955f)
                curveTo(10.9702f, 16.9026f, 10.6099f, 16.9026f, 9.8893f, 16.9026f)
                curveTo(7.8724f, 16.9026f, 6.8639f, 16.9026f, 6.1001f, 16.2673f)
                curveTo(5.9607f, 16.1513f, 5.7944f, 15.9803f, 5.681f, 15.8364f)
                curveTo(5.0599f, 15.0478f, 5.0409f, 14.1267f, 5.003f, 12.2845f)
                curveTo(5.001f, 12.1878f, 5.0f, 12.0928f, 5.0f, 12.0f)
                curveTo(5.0f, 11.9072f, 5.001f, 11.8122f, 5.003f, 11.7155f)
                close()
            }
        }
            .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
