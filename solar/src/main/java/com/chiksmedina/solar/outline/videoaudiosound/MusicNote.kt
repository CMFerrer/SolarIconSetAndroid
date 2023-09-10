package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

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
                moveTo(18.6731f, 3.6668f)
                curveTo(18.0356f, 3.7802f, 17.1965f, 4.0579f, 15.9723f, 4.466f)
                lineTo(11.9723f, 5.7993f)
                curveTo(11.2959f, 6.0248f, 10.8487f, 6.1751f, 10.5192f, 6.3283f)
                curveTo(10.2072f, 6.4735f, 10.0724f, 6.5903f, 9.986f, 6.7101f)
                curveTo(9.8995f, 6.83f, 9.8314f, 6.9949f, 9.7923f, 7.3368f)
                curveTo(9.7511f, 7.6978f, 9.75f, 8.1696f, 9.75f, 8.8826f)
                verticalLineTo(10.959f)
                lineTo(20.25f, 7.459f)
                curveTo(20.2499f, 6.2174f, 20.2459f, 5.3598f, 20.1541f, 4.7342f)
                curveTo(20.0627f, 4.111f, 19.906f, 3.8866f, 19.7309f, 3.7603f)
                curveTo(19.5557f, 3.6341f, 19.2933f, 3.5564f, 18.6731f, 3.6668f)
                close()
                moveTo(21.7402f, 5.9995f)
                curveTo(21.7279f, 5.435f, 21.7003f, 4.9399f, 21.6382f, 4.5166f)
                curveTo(21.522f, 3.7239f, 21.2634f, 3.0159f, 20.608f, 2.5435f)
                curveTo(19.9525f, 2.0711f, 19.1991f, 2.0496f, 18.4103f, 2.19f)
                curveTo(17.6516f, 2.325f, 16.7078f, 2.6397f, 15.5559f, 3.0236f)
                lineTo(11.4584f, 4.3895f)
                curveTo(10.8321f, 4.5982f, 10.3027f, 4.7747f, 9.8865f, 4.9683f)
                curveTo(9.4441f, 5.1741f, 9.0602f, 5.4292f, 8.7691f, 5.8331f)
                curveTo(8.478f, 6.237f, 8.3574f, 6.6818f, 8.302f, 7.1666f)
                curveTo(8.2738f, 7.4142f, 8.2608f, 7.6918f, 8.2549f, 7.9995f)
                horizontalLineTo(8.25f)
                verticalLineTo(8.7587f)
                curveTo(8.25f, 8.7859f, 8.25f, 8.8134f, 8.25f, 8.841f)
                lineTo(8.25f, 15.9992f)
                curveTo(7.6233f, 15.5285f, 6.8442f, 15.2495f, 6.0f, 15.2495f)
                curveTo(3.9289f, 15.2495f, 2.25f, 16.9285f, 2.25f, 18.9995f)
                curveTo(2.25f, 21.0706f, 3.9289f, 22.7495f, 6.0f, 22.7495f)
                curveTo(8.0711f, 22.7495f, 9.75f, 21.0706f, 9.75f, 18.9995f)
                verticalLineTo(12.5401f)
                lineTo(20.25f, 9.0401f)
                verticalLineTo(13.9992f)
                curveTo(19.6233f, 13.5285f, 18.8442f, 13.2495f, 18.0f, 13.2495f)
                curveTo(15.9289f, 13.2495f, 14.25f, 14.9285f, 14.25f, 16.9995f)
                curveTo(14.25f, 19.0706f, 15.9289f, 20.7495f, 18.0f, 20.7495f)
                curveTo(20.0711f, 20.7495f, 21.75f, 19.0706f, 21.75f, 16.9995f)
                verticalLineTo(7.4881f)
                curveTo(21.75f, 7.4524f, 21.75f, 7.4169f, 21.75f, 7.3816f)
                verticalLineTo(5.9995f)
                horizontalLineTo(21.7402f)
                close()
                moveTo(20.25f, 16.9995f)
                curveTo(20.25f, 15.7569f, 19.2426f, 14.7495f, 18.0f, 14.7495f)
                curveTo(16.7574f, 14.7495f, 15.75f, 15.7569f, 15.75f, 16.9995f)
                curveTo(15.75f, 18.2422f, 16.7574f, 19.2495f, 18.0f, 19.2495f)
                curveTo(19.2426f, 19.2495f, 20.25f, 18.2422f, 20.25f, 16.9995f)
                close()
                moveTo(8.25f, 18.9995f)
                curveTo(8.25f, 17.7569f, 7.2426f, 16.7495f, 6.0f, 16.7495f)
                curveTo(4.7574f, 16.7495f, 3.75f, 17.7569f, 3.75f, 18.9995f)
                curveTo(3.75f, 20.2422f, 4.7574f, 21.2495f, 6.0f, 21.2495f)
                curveTo(7.2426f, 21.2495f, 8.25f, 20.2422f, 8.25f, 18.9995f)
                close()
            }
        }
            .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
