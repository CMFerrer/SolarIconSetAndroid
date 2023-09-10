package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.4086f, 9.3526f)
                curveTo(22.5305f, 10.5065f, 22.5305f, 13.4935f, 20.4086f, 14.6474f)
                lineTo(7.5966f, 21.6145f)
                curveTo(5.5343f, 22.736f, 3.0f, 21.2763f, 3.0f, 18.9671f)
                lineTo(3.0f, 5.0329f)
                curveTo(3.0f, 2.7237f, 5.5343f, 1.264f, 7.5966f, 2.3855f)
                lineTo(20.4086f, 9.3526f)
                close()
            }
        }
            .build()
        return _play!!
    }

private var _play: ImageVector? = null
