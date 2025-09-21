package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(
            name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 12.0f)
                lineTo(3.0f, 18.9671f)
                curveTo(3.0f, 21.2763f, 5.5343f, 22.736f, 7.5966f, 21.6145f)
                lineTo(10.7996f, 19.8727f)
                moveTo(3.0f, 8.0f)
                lineTo(3.0f, 5.0329f)
                curveTo(3.0f, 2.7237f, 5.5343f, 1.264f, 7.5966f, 2.3855f)
                lineTo(20.4086f, 9.3526f)
                curveTo(22.5305f, 10.5065f, 22.5305f, 13.4935f, 20.4086f, 14.6474f)
                lineTo(14.0026f, 18.131f)
            }
        }
            .build()
        return _play!!
    }

private var _play: ImageVector? = null
