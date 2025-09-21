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

val VideoAudioSoundGroup.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(
            name = "MusicNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.091f, 11.9629f)
                lineTo(19.3637f, 8.6309f)
                lineTo(21.0f, 7.9524f)
                verticalLineTo(7.4924f)
                curveTo(21.0001f, 6.3724f, 21.0001f, 5.4331f, 20.9123f, 4.6847f)
                curveTo(20.8999f, 4.5789f, 20.8852f, 4.4738f, 20.8691f, 4.3757f)
                curveTo(20.7846f, 3.8644f, 20.6352f, 3.3874f, 20.347f, 2.9892f)
                curveTo(20.2029f, 2.79f, 20.024f, 2.6105f, 19.8012f, 2.4563f)
                curveTo(19.7594f, 2.4274f, 19.7161f, 2.3993f, 19.6712f, 2.3722f)
                lineTo(19.6621f, 2.3668f)
                curveTo(18.8906f, 1.9055f, 18.0233f, 1.9385f, 17.1298f, 2.143f)
                curveTo(16.2657f, 2.3409f, 15.1945f, 2.7437f, 13.8808f, 3.2376f)
                lineTo(11.5964f, 4.0966f)
                curveTo(10.9806f, 4.3281f, 10.4589f, 4.5242f, 10.0495f, 4.7273f)
                curveTo(9.6138f, 4.9435f, 9.2385f, 5.1984f, 8.9571f, 5.5783f)
                curveTo(8.6757f, 5.9582f, 8.5588f, 6.3676f, 8.5051f, 6.812f)
                curveTo(8.4545f, 7.2298f, 8.4546f, 7.7378f, 8.4546f, 8.3374f)
                verticalLineTo(12.6016f)
                lineTo(10.091f, 11.9629f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.4545f, 16.1305f)
                curveTo(7.9035f, 15.8136f, 7.2484f, 15.6298f, 6.5455f, 15.6298f)
                curveTo(4.5873f, 15.6298f, 3.0f, 17.0558f, 3.0f, 18.8148f)
                curveTo(3.0f, 20.5738f, 4.5873f, 21.9998f, 6.5455f, 21.9998f)
                curveTo(8.5035f, 21.9998f, 10.0909f, 20.5738f, 10.0909f, 18.8148f)
                lineTo(10.0909f, 11.9627f)
                lineTo(8.4545f, 12.6014f)
                verticalLineTo(16.1305f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.3636f, 8.6307f)
                verticalLineTo(14.1705f)
                curveTo(18.8126f, 13.8536f, 18.1574f, 13.6698f, 17.4545f, 13.6698f)
                curveTo(15.4964f, 13.6698f, 13.9091f, 15.0958f, 13.9091f, 16.8548f)
                curveTo(13.9091f, 18.6138f, 15.4964f, 20.0398f, 17.4545f, 20.0398f)
                curveTo(19.4126f, 20.0398f, 21.0f, 18.6138f, 21.0f, 16.8548f)
                lineTo(21.0f, 7.9521f)
                lineTo(19.3636f, 8.6307f)
                close()
            }
        }
            .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
