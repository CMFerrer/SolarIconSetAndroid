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

val VideoAudioSoundGroup.Rewind15SecondsForward: ImageVector
    get() {
        if (_rewind15SecondsForward != null) {
            return _rewind15SecondsForward!!
        }
        _rewind15SecondsForward = Builder(
            name = "Rewind15SecondsForward", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(12.2883f, 1.25f, 12.5511f, 1.4153f, 12.676f, 1.6751f)
                curveTo(12.8009f, 1.935f, 12.7658f, 2.2434f, 12.5857f, 2.4685f)
                lineTo(10.5857f, 4.9685f)
                curveTo(10.3269f, 5.292f, 9.8549f, 5.3444f, 9.5315f, 5.0856f)
                curveTo(9.208f, 4.8269f, 9.1556f, 4.3549f, 9.4143f, 4.0315f)
                lineTo(10.3174f, 2.9027f)
                curveTo(6.0121f, 3.6939f, 2.75f, 7.466f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 8.2081f, 18.9682f, 4.9474f, 15.6997f, 3.5194f)
                curveTo(15.3202f, 3.3535f, 15.1469f, 2.9114f, 15.3127f, 2.5318f)
                curveTo(15.4786f, 2.1522f, 15.9207f, 1.979f, 16.3003f, 2.1448f)
                curveTo(20.0954f, 3.803f, 22.75f, 7.5907f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(10.3249f, 7.824f)
                curveTo(10.5847f, 7.9489f, 10.75f, 8.2117f, 10.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(10.75f, 15.9142f, 10.4142f, 16.25f, 10.0f, 16.25f)
                curveTo(9.5858f, 16.25f, 9.25f, 15.9142f, 9.25f, 15.5f)
                verticalLineTo(10.0605f)
                lineTo(7.9685f, 11.0857f)
                curveTo(7.6451f, 11.3444f, 7.1731f, 11.292f, 6.9144f, 10.9685f)
                curveTo(6.6556f, 10.6451f, 6.708f, 10.1731f, 7.0315f, 9.9143f)
                lineTo(9.5315f, 7.9144f)
                curveTo(9.7566f, 7.7343f, 10.065f, 7.6991f, 10.3249f, 7.824f)
                close()
                moveTo(12.6745f, 8.6047f)
                curveTo(12.8447f, 8.0943f, 13.3223f, 7.75f, 13.8604f, 7.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 7.75f, 17.25f, 8.0858f, 17.25f, 8.5f)
                curveTo(17.25f, 8.9142f, 16.9142f, 9.25f, 16.5f, 9.25f)
                horizontalLineTo(14.0406f)
                lineTo(13.5406f, 10.75f)
                horizontalLineTo(14.5f)
                curveTo(16.0188f, 10.75f, 17.25f, 11.9812f, 17.25f, 13.5f)
                curveTo(17.25f, 15.0188f, 16.0188f, 16.25f, 14.5f, 16.25f)
                horizontalLineTo(12.5f)
                curveTo(12.0858f, 16.25f, 11.75f, 15.9142f, 11.75f, 15.5f)
                curveTo(11.75f, 15.0858f, 12.0858f, 14.75f, 12.5f, 14.75f)
                horizontalLineTo(14.5f)
                curveTo(15.1904f, 14.75f, 15.75f, 14.1904f, 15.75f, 13.5f)
                curveTo(15.75f, 12.8096f, 15.1904f, 12.25f, 14.5f, 12.25f)
                horizontalLineTo(13.1937f)
                curveTo(12.3405f, 12.25f, 11.7381f, 11.4141f, 12.0079f, 10.6047f)
                lineTo(12.6745f, 8.6047f)
                close()
                moveTo(13.4309f, 11.0791f)
                lineTo(13.431f, 11.0787f)
                close()
            }
        }
            .build()
        return _rewind15SecondsForward!!
    }

private var _rewind15SecondsForward: ImageVector? = null
