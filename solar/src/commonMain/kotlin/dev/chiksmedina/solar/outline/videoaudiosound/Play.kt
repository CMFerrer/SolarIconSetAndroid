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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.2383f, 3.0445f)
                curveTo(5.652f, 2.1818f, 3.75f, 3.3196f, 3.75f, 5.033f)
                lineTo(3.75f, 18.9672f)
                curveTo(3.75f, 20.6806f, 5.652f, 21.8184f, 7.2383f, 20.9557f)
                lineTo(20.0503f, 13.9886f)
                curveTo(21.6499f, 13.1188f, 21.6499f, 10.8814f, 20.0503f, 10.0116f)
                lineTo(7.2383f, 3.0445f)
                close()
                moveTo(2.25f, 5.033f)
                curveTo(2.25f, 2.128f, 5.4167f, 0.3464f, 7.9549f, 1.7267f)
                lineTo(20.7669f, 8.6938f)
                curveTo(23.411f, 10.1317f, 23.411f, 13.8685f, 20.7669f, 15.3064f)
                lineTo(7.9549f, 22.2735f)
                curveTo(5.4167f, 23.6537f, 2.25f, 21.8722f, 2.25f, 18.9672f)
                lineTo(2.25f, 5.033f)
                close()
            }
        }
            .build()
        return _play!!
    }

private var _play: ImageVector? = null
