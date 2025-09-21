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

val VideoAudioSoundGroup.MusicNote3: ImageVector
    get() {
        if (_musicNote3 != null) {
            return _musicNote3!!
        }
        _musicNote3 = Builder(
            name = "MusicNote3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.3187f, 2.505f)
                curveTo(13.0514f, 2.3572f, 11.8489f, 3.1003f, 11.4144f, 4.2999f)
                curveTo(11.3165f, 4.5702f, 11.2821f, 4.8625f, 11.266f, 5.1689f)
                curveTo(11.2539f, 5.4f, 11.2509f, 5.6755f, 11.2503f, 6.0f)
                lineTo(11.25f, 6.455f)
                curveTo(11.25f, 6.4598f, 11.25f, 6.4646f, 11.25f, 6.4694f)
                verticalLineTo(14.5359f)
                curveTo(10.4003f, 13.7384f, 9.2572f, 13.25f, 8.0f, 13.25f)
                curveTo(5.3766f, 13.25f, 3.25f, 15.3766f, 3.25f, 18.0f)
                curveTo(3.25f, 20.6234f, 5.3766f, 22.75f, 8.0f, 22.75f)
                curveTo(10.6234f, 22.75f, 12.75f, 20.6234f, 12.75f, 18.0f)
                verticalLineTo(9.2106f)
                curveTo(12.8548f, 9.2665f, 12.9683f, 9.3232f, 13.0927f, 9.3853f)
                lineTo(15.8002f, 10.739f)
                curveTo(16.2185f, 10.9481f, 16.5589f, 11.1183f, 16.8378f, 11.2399f)
                curveTo(17.119f, 11.3625f, 17.3958f, 11.4625f, 17.6814f, 11.4958f)
                curveTo(18.9486f, 11.6436f, 20.1511f, 10.9004f, 20.5856f, 9.7009f)
                curveTo(20.6836f, 9.4305f, 20.7179f, 9.1383f, 20.7341f, 8.8319f)
                curveTo(20.75f, 8.5281f, 20.75f, 8.1475f, 20.75f, 7.6799f)
                lineTo(20.7501f, 7.5971f)
                curveTo(20.7502f, 7.2493f, 20.7503f, 6.9773f, 20.701f, 6.7195f)
                curveTo(20.574f, 6.0559f, 20.2071f, 5.4622f, 19.6704f, 5.0518f)
                curveTo(19.4618f, 4.8924f, 19.2185f, 4.7709f, 18.9074f, 4.6155f)
                lineTo(16.1999f, 3.2618f)
                curveTo(15.7816f, 3.0526f, 15.4412f, 2.8824f, 15.1623f, 2.7609f)
                curveTo(14.8811f, 2.6383f, 14.6043f, 2.5383f, 14.3187f, 2.505f)
                close()
            }
        }
            .build()
        return _musicNote3!!
    }

private var _musicNote3: ImageVector? = null
