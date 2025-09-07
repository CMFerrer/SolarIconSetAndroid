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

val VideoAudioSoundGroup.PlaybackSpeed: ImageVector
    get() {
        if (_playbackSpeed != null) {
            return _playbackSpeed!!
        }
        _playbackSpeed = Builder(
            name = "PlaybackSpeed", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.6075f, 1.5174f)
                curveTo(10.3776f, 1.3423f, 11.1785f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(11.1785f, 22.75f, 10.3776f, 22.6577f, 9.6075f, 22.4826f)
                curveTo(9.2036f, 22.3908f, 8.9506f, 21.9889f, 9.0424f, 21.585f)
                curveTo(9.1343f, 21.1811f, 9.5361f, 20.9281f, 9.9401f, 21.02f)
                curveTo(10.6018f, 21.1704f, 11.2911f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                curveTo(11.2911f, 2.75f, 10.6018f, 2.8296f, 9.9401f, 2.98f)
                curveTo(9.5361f, 3.0719f, 9.1343f, 2.8189f, 9.0424f, 2.415f)
                curveTo(8.9506f, 2.0111f, 9.2036f, 1.6092f, 9.6075f, 1.5174f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.3137f, 3.132f)
                curveTo(7.5344f, 3.4825f, 7.4292f, 3.9456f, 7.0787f, 4.1663f)
                curveTo(5.9035f, 4.9062f, 4.9062f, 5.9035f, 4.1663f, 7.0787f)
                curveTo(3.9456f, 7.4292f, 3.4825f, 7.5344f, 3.132f, 7.3137f)
                curveTo(2.7815f, 7.093f, 2.6762f, 6.63f, 2.8969f, 6.2794f)
                curveTo(3.7565f, 4.9144f, 4.9144f, 3.7565f, 6.2794f, 2.8969f)
                curveTo(6.63f, 2.6762f, 7.093f, 2.7815f, 7.3137f, 3.132f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.98f, 9.9401f)
                curveTo(3.0719f, 9.5361f, 2.8189f, 9.1343f, 2.415f, 9.0424f)
                curveTo(2.0111f, 8.9506f, 1.6092f, 9.2036f, 1.5174f, 9.6075f)
                curveTo(1.3423f, 10.3776f, 1.25f, 11.1785f, 1.25f, 12.0f)
                curveTo(1.25f, 12.8215f, 1.3423f, 13.6224f, 1.5174f, 14.3925f)
                curveTo(1.6092f, 14.7964f, 2.0111f, 15.0494f, 2.415f, 14.9576f)
                curveTo(2.8189f, 14.8657f, 3.0719f, 14.4639f, 2.98f, 14.06f)
                curveTo(2.8296f, 13.3982f, 2.75f, 12.7089f, 2.75f, 12.0f)
                curveTo(2.75f, 11.2911f, 2.8296f, 10.6018f, 2.98f, 9.9401f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.132f, 16.6863f)
                curveTo(3.4825f, 16.4656f, 3.9456f, 16.5708f, 4.1663f, 16.9213f)
                curveTo(4.9062f, 18.0965f, 5.9035f, 19.0938f, 7.0787f, 19.8337f)
                curveTo(7.4292f, 20.0544f, 7.5344f, 20.5175f, 7.3137f, 20.868f)
                curveTo(7.093f, 21.2185f, 6.63f, 21.3238f, 6.2794f, 21.1031f)
                curveTo(4.9144f, 20.2435f, 3.7565f, 19.0856f, 2.8969f, 17.7206f)
                curveTo(2.6762f, 17.37f, 2.7815f, 16.907f, 3.132f, 16.6863f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.4137f, 10.941f)
                curveTo(16.1954f, 11.4026f, 16.1954f, 12.5974f, 15.4137f, 13.059f)
                lineTo(10.6935f, 15.8458f)
                curveTo(9.9337f, 16.2944f, 9.0f, 15.7105f, 9.0f, 14.7868f)
                verticalLineTo(9.2132f)
                curveTo(9.0f, 8.2895f, 9.9337f, 7.7056f, 10.6935f, 8.1542f)
                lineTo(15.4137f, 10.941f)
                close()
            }
        }
            .build()
        return _playbackSpeed!!
    }

private var _playbackSpeed: ImageVector? = null
