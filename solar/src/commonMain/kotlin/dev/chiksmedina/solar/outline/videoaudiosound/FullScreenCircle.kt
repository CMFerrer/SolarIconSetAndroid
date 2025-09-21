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

val VideoAudioSoundGroup.FullScreenCircle: ImageVector
    get() {
        if (_fullScreenCircle != null) {
            return _fullScreenCircle!!
        }
        _fullScreenCircle = Builder(
            name = "FullScreenCircle", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(10.7474f, 5.9936f)
                curveTo(10.7509f, 6.4078f, 10.4179f, 6.7465f, 10.0038f, 6.75f)
                curveTo(9.1479f, 6.7572f, 8.5501f, 6.7855f, 8.1004f, 6.8736f)
                curveTo(7.6716f, 6.9576f, 7.4342f, 7.0857f, 7.26f, 7.26f)
                curveTo(7.0857f, 7.4342f, 6.9576f, 7.6716f, 6.8736f, 8.1004f)
                curveTo(6.7855f, 8.5501f, 6.7572f, 9.1479f, 6.75f, 10.0038f)
                curveTo(6.7465f, 10.4179f, 6.4078f, 10.7509f, 5.9936f, 10.7474f)
                curveTo(5.5794f, 10.7439f, 5.2465f, 10.4052f, 5.25f, 9.991f)
                curveTo(5.2572f, 9.1404f, 5.2836f, 8.4144f, 5.4016f, 7.812f)
                curveTo(5.5237f, 7.1887f, 5.7532f, 6.6454f, 6.1993f, 6.1993f)
                curveTo(6.6454f, 5.7532f, 7.1887f, 5.5237f, 7.812f, 5.4016f)
                curveTo(8.4144f, 5.2836f, 9.1404f, 5.2572f, 9.991f, 5.25f)
                curveTo(10.4052f, 5.2465f, 10.7439f, 5.5794f, 10.7474f, 5.9936f)
                close()
                moveTo(13.2502f, 5.9936f)
                curveTo(13.2537f, 5.5794f, 13.5923f, 5.2465f, 14.0065f, 5.25f)
                curveTo(14.8572f, 5.2572f, 15.5831f, 5.2836f, 16.1855f, 5.4016f)
                curveTo(16.8089f, 5.5237f, 17.3521f, 5.7532f, 17.7983f, 6.1993f)
                curveTo(18.2444f, 6.6454f, 18.4739f, 7.1887f, 18.596f, 7.812f)
                curveTo(18.714f, 8.4144f, 18.7403f, 9.1404f, 18.7475f, 9.991f)
                curveTo(18.751f, 10.4052f, 18.4181f, 10.7439f, 18.0039f, 10.7474f)
                curveTo(17.5897f, 10.7509f, 17.2511f, 10.4179f, 17.2476f, 10.0038f)
                curveTo(17.2403f, 9.1479f, 17.2121f, 8.5501f, 17.124f, 8.1004f)
                curveTo(17.04f, 7.6716f, 16.9119f, 7.4342f, 16.7376f, 7.26f)
                curveTo(16.5633f, 7.0857f, 16.326f, 6.9576f, 15.8972f, 6.8736f)
                curveTo(15.4475f, 6.7855f, 14.8497f, 6.7572f, 13.9938f, 6.75f)
                curveTo(13.5796f, 6.7465f, 13.2467f, 6.4078f, 13.2502f, 5.9936f)
                close()
                moveTo(5.9936f, 13.2502f)
                curveTo(6.4078f, 13.2467f, 6.7465f, 13.5796f, 6.75f, 13.9938f)
                curveTo(6.7572f, 14.8497f, 6.7855f, 15.4475f, 6.8736f, 15.8972f)
                curveTo(6.9576f, 16.326f, 7.0857f, 16.5633f, 7.26f, 16.7376f)
                curveTo(7.4342f, 16.9119f, 7.6716f, 17.04f, 8.1004f, 17.124f)
                curveTo(8.5501f, 17.2121f, 9.1479f, 17.2403f, 10.0038f, 17.2476f)
                curveTo(10.4179f, 17.2511f, 10.7509f, 17.5897f, 10.7474f, 18.0039f)
                curveTo(10.7439f, 18.4181f, 10.4052f, 18.751f, 9.991f, 18.7475f)
                curveTo(9.1404f, 18.7403f, 8.4144f, 18.714f, 7.812f, 18.596f)
                curveTo(7.1887f, 18.4739f, 6.6454f, 18.2444f, 6.1993f, 17.7983f)
                curveTo(5.7532f, 17.3521f, 5.5237f, 16.8089f, 5.4016f, 16.1855f)
                curveTo(5.2836f, 15.5831f, 5.2572f, 14.8572f, 5.25f, 14.0065f)
                curveTo(5.2465f, 13.5923f, 5.5794f, 13.2537f, 5.9936f, 13.2502f)
                close()
                moveTo(18.0039f, 13.2502f)
                curveTo(18.4181f, 13.2537f, 18.751f, 13.5923f, 18.7475f, 14.0065f)
                curveTo(18.7403f, 14.8572f, 18.714f, 15.5831f, 18.596f, 16.1855f)
                curveTo(18.4739f, 16.8089f, 18.2444f, 17.3521f, 17.7983f, 17.7983f)
                curveTo(17.3521f, 18.2444f, 16.8089f, 18.4739f, 16.1855f, 18.596f)
                curveTo(15.5831f, 18.714f, 14.8572f, 18.7403f, 14.0065f, 18.7475f)
                curveTo(13.5923f, 18.751f, 13.2537f, 18.4181f, 13.2502f, 18.0039f)
                curveTo(13.2467f, 17.5897f, 13.5796f, 17.2511f, 13.9938f, 17.2476f)
                curveTo(14.8497f, 17.2403f, 15.4475f, 17.2121f, 15.8972f, 17.124f)
                curveTo(16.326f, 17.04f, 16.5633f, 16.9119f, 16.7376f, 16.7376f)
                curveTo(16.9119f, 16.5633f, 17.04f, 16.326f, 17.124f, 15.8972f)
                curveTo(17.2121f, 15.4475f, 17.2403f, 14.8497f, 17.2476f, 13.9938f)
                curveTo(17.2511f, 13.5796f, 17.5897f, 13.2467f, 18.0039f, 13.2502f)
                close()
            }
        }
            .build()
        return _fullScreenCircle!!
    }

private var _fullScreenCircle: ImageVector? = null
