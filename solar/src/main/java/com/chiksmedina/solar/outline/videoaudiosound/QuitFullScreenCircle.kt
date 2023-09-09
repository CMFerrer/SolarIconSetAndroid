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

public val VideoAudioSoundGroup.QuitFullScreenCircle: ImageVector
    get() {
        if (_quitFullScreenCircle != null) {
            return _quitFullScreenCircle!!
        }
        _quitFullScreenCircle = Builder(name = "QuitFullScreenCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(10.0039f, 5.2502f)
                curveTo(10.4181f, 5.2537f, 10.751f, 5.5923f, 10.7475f, 6.0065f)
                curveTo(10.7403f, 6.8572f, 10.714f, 7.5831f, 10.596f, 8.1855f)
                curveTo(10.4739f, 8.8089f, 10.2444f, 9.3521f, 9.7983f, 9.7983f)
                curveTo(9.3521f, 10.2444f, 8.8089f, 10.4739f, 8.1855f, 10.596f)
                curveTo(7.5831f, 10.714f, 6.8572f, 10.7403f, 6.0065f, 10.7475f)
                curveTo(5.5923f, 10.751f, 5.2537f, 10.4181f, 5.2502f, 10.0039f)
                curveTo(5.2467f, 9.5897f, 5.5796f, 9.2511f, 5.9938f, 9.2476f)
                curveTo(6.8497f, 9.2403f, 7.4475f, 9.2121f, 7.8972f, 9.124f)
                curveTo(8.326f, 9.04f, 8.5633f, 8.9119f, 8.7376f, 8.7376f)
                curveTo(8.9119f, 8.5633f, 9.04f, 8.326f, 9.124f, 7.8972f)
                curveTo(9.2121f, 7.4475f, 9.2403f, 6.8497f, 9.2476f, 5.9938f)
                curveTo(9.2511f, 5.5796f, 9.5897f, 5.2467f, 10.0039f, 5.2502f)
                close()
                moveTo(13.9936f, 5.2502f)
                curveTo(14.4078f, 5.2467f, 14.7465f, 5.5796f, 14.75f, 5.9938f)
                curveTo(14.7572f, 6.8497f, 14.7855f, 7.4475f, 14.8736f, 7.8972f)
                curveTo(14.9576f, 8.326f, 15.0857f, 8.5633f, 15.26f, 8.7376f)
                curveTo(15.4342f, 8.9119f, 15.6716f, 9.04f, 16.1004f, 9.124f)
                curveTo(16.5501f, 9.2121f, 17.1479f, 9.2403f, 18.0038f, 9.2476f)
                curveTo(18.4179f, 9.2511f, 18.7509f, 9.5897f, 18.7474f, 10.0039f)
                curveTo(18.7439f, 10.4181f, 18.4052f, 10.751f, 17.991f, 10.7475f)
                curveTo(17.1403f, 10.7403f, 16.4144f, 10.714f, 15.812f, 10.596f)
                curveTo(15.1887f, 10.4739f, 14.6454f, 10.2444f, 14.1993f, 9.7983f)
                curveTo(13.7532f, 9.3521f, 13.5237f, 8.8089f, 13.4016f, 8.1855f)
                curveTo(13.2836f, 7.5831f, 13.2572f, 6.8572f, 13.25f, 6.0065f)
                curveTo(13.2465f, 5.5923f, 13.5794f, 5.2537f, 13.9936f, 5.2502f)
                close()
                moveTo(5.2502f, 13.9936f)
                curveTo(5.2537f, 13.5794f, 5.5923f, 13.2465f, 6.0065f, 13.25f)
                curveTo(6.8572f, 13.2572f, 7.5831f, 13.2836f, 8.1855f, 13.4016f)
                curveTo(8.8089f, 13.5237f, 9.3521f, 13.7532f, 9.7983f, 14.1993f)
                curveTo(10.2444f, 14.6454f, 10.4739f, 15.1887f, 10.596f, 15.812f)
                curveTo(10.714f, 16.4144f, 10.7403f, 17.1403f, 10.7475f, 17.991f)
                curveTo(10.751f, 18.4052f, 10.4181f, 18.7439f, 10.0039f, 18.7474f)
                curveTo(9.5897f, 18.7509f, 9.2511f, 18.4179f, 9.2476f, 18.0038f)
                curveTo(9.2403f, 17.1479f, 9.2121f, 16.5501f, 9.124f, 16.1004f)
                curveTo(9.04f, 15.6716f, 8.9119f, 15.4342f, 8.7376f, 15.26f)
                curveTo(8.5633f, 15.0857f, 8.326f, 14.9576f, 7.8972f, 14.8736f)
                curveTo(7.4475f, 14.7855f, 6.8497f, 14.7572f, 5.9938f, 14.75f)
                curveTo(5.5796f, 14.7465f, 5.2467f, 14.4078f, 5.2502f, 13.9936f)
                close()
                moveTo(18.7474f, 13.9936f)
                curveTo(18.7509f, 14.4078f, 18.4179f, 14.7465f, 18.0038f, 14.75f)
                curveTo(17.1479f, 14.7572f, 16.5501f, 14.7855f, 16.1004f, 14.8736f)
                curveTo(15.6716f, 14.9576f, 15.4342f, 15.0857f, 15.26f, 15.26f)
                curveTo(15.0857f, 15.4342f, 14.9576f, 15.6716f, 14.8736f, 16.1004f)
                curveTo(14.7855f, 16.5501f, 14.7572f, 17.1479f, 14.75f, 18.0038f)
                curveTo(14.7465f, 18.4179f, 14.4078f, 18.7509f, 13.9936f, 18.7474f)
                curveTo(13.5794f, 18.7439f, 13.2465f, 18.4052f, 13.25f, 17.991f)
                curveTo(13.2572f, 17.1403f, 13.2836f, 16.4144f, 13.4016f, 15.812f)
                curveTo(13.5237f, 15.1887f, 13.7532f, 14.6454f, 14.1993f, 14.1993f)
                curveTo(14.6454f, 13.7532f, 15.1887f, 13.5237f, 15.812f, 13.4016f)
                curveTo(16.4144f, 13.2836f, 17.1403f, 13.2572f, 17.991f, 13.25f)
                curveTo(18.4052f, 13.2465f, 18.7439f, 13.5794f, 18.7474f, 13.9936f)
                close()
            }
        }
        .build()
        return _quitFullScreenCircle!!
    }

private var _quitFullScreenCircle: ImageVector? = null
