package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                pathFillType = NonZero
            ) {
                moveTo(21.4086f, 9.3526f)
                curveTo(23.5305f, 10.5065f, 23.5305f, 13.4935f, 21.4086f, 14.6474f)
                lineTo(8.5966f, 21.6145f)
                curveTo(6.5343f, 22.736f, 4.0f, 21.2763f, 4.0f, 18.9671f)
                lineTo(4.0f, 5.0329f)
                curveTo(4.0f, 2.7237f, 6.5343f, 1.264f, 8.5966f, 2.3855f)
                lineTo(21.4086f, 9.3526f)
                close()
            }
        }
            .build()
        return _play!!
    }

private var _play: ImageVector? = null
