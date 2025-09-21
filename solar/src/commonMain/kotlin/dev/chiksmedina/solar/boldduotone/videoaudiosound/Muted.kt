package dev.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 16.0f)
                curveTo(15.1144f, 16.0f, 14.1716f, 16.0f, 13.5858f, 15.4142f)
                curveTo(13.0f, 14.8284f, 13.0f, 13.8856f, 13.0f, 12.0f)
                curveTo(13.0f, 10.1144f, 13.0f, 9.1716f, 13.5858f, 8.5858f)
                curveTo(14.1716f, 8.0f, 15.1144f, 8.0f, 17.0f, 8.0f)
                curveTo(18.8856f, 8.0f, 19.8284f, 8.0f, 20.4142f, 8.5858f)
                curveTo(21.0f, 9.1716f, 21.0f, 10.1144f, 21.0f, 12.0f)
                curveTo(21.0f, 13.8856f, 21.0f, 14.8284f, 20.4142f, 15.4142f)
                curveTo(19.8284f, 16.0f, 18.8856f, 16.0f, 17.0f, 16.0f)
                close()
                moveTo(15.6936f, 9.7508f)
                curveTo(15.4333f, 9.4905f, 15.0112f, 9.4905f, 14.7508f, 9.7508f)
                curveTo(14.4905f, 10.0112f, 14.4905f, 10.4333f, 14.7508f, 10.6936f)
                lineTo(16.0572f, 12.0f)
                lineTo(14.7508f, 13.3064f)
                curveTo(14.4905f, 13.5667f, 14.4905f, 13.9888f, 14.7508f, 14.2492f)
                curveTo(15.0112f, 14.5095f, 15.4333f, 14.5095f, 15.6936f, 14.2492f)
                lineTo(17.0f, 12.9428f)
                lineTo(18.3064f, 14.2492f)
                curveTo(18.5667f, 14.5095f, 18.9888f, 14.5095f, 19.2492f, 14.2492f)
                curveTo(19.5095f, 13.9888f, 19.5095f, 13.5667f, 19.2492f, 13.3064f)
                lineTo(17.9428f, 12.0f)
                lineTo(19.2492f, 10.6936f)
                curveTo(19.5095f, 10.4333f, 19.5095f, 10.0112f, 19.2492f, 9.7508f)
                curveTo(18.9888f, 9.4905f, 18.5667f, 9.4905f, 18.3064f, 9.7508f)
                lineTo(17.0f, 11.0572f)
                lineTo(15.6936f, 9.7508f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.003f, 11.7155f)
                curveTo(3.0409f, 9.8733f, 3.0599f, 8.9522f, 3.681f, 8.1636f)
                curveTo(3.7944f, 8.0197f, 3.9607f, 7.8487f, 4.1001f, 7.7327f)
                curveTo(4.8639f, 7.0974f, 5.8724f, 7.0974f, 7.8893f, 7.0974f)
                curveTo(8.6099f, 7.0974f, 8.9702f, 7.0974f, 9.3137f, 7.0045f)
                curveTo(9.385f, 6.9852f, 9.4557f, 6.963f, 9.5253f, 6.9378f)
                curveTo(9.8608f, 6.8168f, 10.1616f, 6.6084f, 10.7632f, 6.1916f)
                curveTo(13.137f, 4.5474f, 14.3239f, 3.7253f, 15.3201f, 4.0824f)
                curveTo(15.5111f, 4.1509f, 15.6959f, 4.2497f, 15.861f, 4.3716f)
                curveTo(16.5687f, 4.8941f, 16.739f, 5.9859f, 16.8499f, 8.0f)
                curveTo(15.0639f, 8.0004f, 14.1558f, 8.0158f, 13.5858f, 8.5858f)
                curveTo(13.0f, 9.1716f, 13.0f, 10.1144f, 13.0f, 12.0f)
                curveTo(13.0f, 13.8856f, 13.0f, 14.8284f, 13.5858f, 15.4142f)
                curveTo(14.1558f, 15.9842f, 15.0639f, 15.9996f, 16.8499f, 16.0f)
                curveTo(16.739f, 18.0141f, 16.5687f, 19.1059f, 15.861f, 19.6284f)
                curveTo(15.6959f, 19.7503f, 15.5111f, 19.8491f, 15.3201f, 19.9176f)
                curveTo(14.3239f, 20.2747f, 13.137f, 19.4526f, 10.7632f, 17.8084f)
                curveTo(10.1616f, 17.3916f, 9.8608f, 17.1833f, 9.5253f, 17.0622f)
                curveTo(9.4557f, 17.037f, 9.385f, 17.0148f, 9.3137f, 16.9955f)
                curveTo(8.9702f, 16.9026f, 8.6099f, 16.9026f, 7.8893f, 16.9026f)
                curveTo(5.8724f, 16.9026f, 4.8639f, 16.9026f, 4.1001f, 16.2673f)
                curveTo(3.9607f, 16.1513f, 3.7944f, 15.9803f, 3.681f, 15.8364f)
                curveTo(3.0599f, 15.0478f, 3.0409f, 14.1267f, 3.003f, 12.2845f)
                curveTo(3.001f, 12.1878f, 3.0f, 12.0928f, 3.0f, 12.0f)
                curveTo(3.0f, 11.9072f, 3.001f, 11.8122f, 3.003f, 11.7155f)
                close()
            }
        }
            .build()
        return _muted!!
    }

private var _muted: ImageVector? = null
