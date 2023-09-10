package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.Rewind5SecondsBack: ImageVector
    get() {
        if (_rewind5SecondsBack != null) {
            return _rewind5SecondsBack!!
        }
        _rewind5SecondsBack = Builder(
            name = "Rewind5SecondsBack", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.1745f, 8.6047f)
                curveTo(10.3447f, 8.0943f, 10.8223f, 7.75f, 11.3604f, 7.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 7.75f, 14.75f, 8.0858f, 14.75f, 8.5f)
                curveTo(14.75f, 8.9142f, 14.4142f, 9.25f, 14.0f, 9.25f)
                horizontalLineTo(11.5406f)
                lineTo(11.0406f, 10.75f)
                horizontalLineTo(12.0f)
                curveTo(13.5188f, 10.75f, 14.75f, 11.9812f, 14.75f, 13.5f)
                curveTo(14.75f, 15.0188f, 13.5188f, 16.25f, 12.0f, 16.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 16.25f, 9.25f, 15.9142f, 9.25f, 15.5f)
                curveTo(9.25f, 15.0858f, 9.5858f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(12.0f)
                curveTo(12.6904f, 14.75f, 13.25f, 14.1904f, 13.25f, 13.5f)
                curveTo(13.25f, 12.8096f, 12.6904f, 12.25f, 12.0f, 12.25f)
                horizontalLineTo(10.6937f)
                curveTo(9.8405f, 12.25f, 9.2381f, 11.4141f, 9.5079f, 10.6047f)
                lineTo(10.1745f, 8.6047f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.324f, 1.6751f)
                curveTo(11.4489f, 1.4153f, 11.7117f, 1.25f, 12.0f, 1.25f)
                curveTo(12.7353f, 1.25f, 13.4541f, 1.3239f, 14.1492f, 1.465f)
                curveTo(19.0563f, 2.4611f, 22.75f, 6.7984f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                curveTo(1.25f, 7.5907f, 3.9046f, 3.803f, 7.6997f, 2.1448f)
                curveTo(8.0793f, 1.979f, 8.5214f, 2.1522f, 8.6873f, 2.5318f)
                curveTo(8.8531f, 2.9114f, 8.6798f, 3.3535f, 8.3003f, 3.5194f)
                curveTo(5.0318f, 4.9474f, 2.75f, 8.2081f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 7.8495f, 18.5158f, 4.3362f, 14.75f, 3.1654f)
                verticalLineTo(4.5f)
                curveTo(14.75f, 4.8185f, 14.5488f, 5.1023f, 14.2483f, 5.2077f)
                curveTo(13.9477f, 5.3131f, 13.6133f, 5.2172f, 13.4143f, 4.9685f)
                lineTo(11.4143f, 2.4685f)
                curveTo(11.2342f, 2.2434f, 11.1991f, 1.935f, 11.324f, 1.6751f)
                close()
            }
        }
            .build()
        return _rewind5SecondsBack!!
    }

private var _rewind5SecondsBack: ImageVector? = null
