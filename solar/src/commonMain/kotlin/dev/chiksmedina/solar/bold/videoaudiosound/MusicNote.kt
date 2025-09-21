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
                pathFillType = NonZero
            ) {
                moveTo(10.0909f, 11.9629f)
                lineTo(19.3636f, 8.6309f)
                verticalLineTo(14.1707f)
                curveTo(18.8126f, 13.8538f, 18.1574f, 13.67f, 17.4545f, 13.67f)
                curveTo(15.4964f, 13.67f, 13.9091f, 15.096f, 13.9091f, 16.855f)
                curveTo(13.9091f, 18.614f, 15.4964f, 20.04f, 17.4545f, 20.04f)
                curveTo(19.4126f, 20.04f, 21.0f, 18.614f, 21.0f, 16.855f)
                curveTo(21.0f, 16.855f, 21.0f, 16.8551f, 21.0f, 16.855f)
                lineTo(21.0f, 7.4924f)
                curveTo(21.0f, 6.3724f, 21.0f, 5.4331f, 20.9123f, 4.6847f)
                curveTo(20.8999f, 4.5789f, 20.8852f, 4.4738f, 20.869f, 4.3757f)
                curveTo(20.7845f, 3.8644f, 20.6352f, 3.3874f, 20.347f, 2.9892f)
                curveTo(20.2028f, 2.79f, 20.024f, 2.6105f, 19.8012f, 2.4563f)
                curveTo(19.7594f, 2.4274f, 19.716f, 2.3993f, 19.6711f, 2.3722f)
                lineTo(19.6621f, 2.3668f)
                curveTo(18.8906f, 1.9055f, 18.0233f, 1.9385f, 17.1298f, 2.143f)
                curveTo(16.2657f, 2.3409f, 15.1944f, 2.7437f, 13.8808f, 3.2376f)
                lineTo(11.5963f, 4.0966f)
                curveTo(10.9806f, 4.3281f, 10.4589f, 4.5242f, 10.0494f, 4.7273f)
                curveTo(9.6138f, 4.9435f, 9.2385f, 5.1984f, 8.9571f, 5.5783f)
                curveTo(8.6756f, 5.9582f, 8.5588f, 6.3676f, 8.505f, 6.812f)
                curveTo(8.4545f, 7.2298f, 8.4545f, 7.7378f, 8.4545f, 8.3374f)
                verticalLineTo(16.1307f)
                curveTo(7.9035f, 15.8138f, 7.2484f, 15.63f, 6.5455f, 15.63f)
                curveTo(4.5873f, 15.63f, 3.0f, 17.056f, 3.0f, 18.815f)
                curveTo(3.0f, 20.574f, 4.5873f, 22.0f, 6.5455f, 22.0f)
                curveTo(8.5035f, 22.0f, 10.0909f, 20.574f, 10.0909f, 18.815f)
                curveTo(10.0909f, 18.815f, 10.0909f, 18.8151f, 10.0909f, 18.815f)
                lineTo(10.0909f, 11.9629f)
                close()
            }
        }
            .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
