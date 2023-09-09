package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.MusicNote4: ImageVector
    get() {
        if (_musicNote4 != null) {
            return _musicNote4!!
        }
        _musicNote4 = Builder(name = "MusicNote4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8497f, 4.7006f)
                curveTo(19.4524f, 3.5758f, 18.353f, 2.879f, 17.1944f, 3.0176f)
                curveTo(16.9333f, 3.0488f, 16.6802f, 3.1425f, 16.4231f, 3.2575f)
                curveTo(16.1681f, 3.3715f, 15.8568f, 3.5311f, 15.4744f, 3.7272f)
                lineTo(12.999f, 4.9965f)
                curveTo(12.7146f, 5.1422f, 12.4921f, 5.2561f, 12.3014f, 5.4056f)
                curveTo(11.8107f, 5.7904f, 11.4753f, 6.347f, 11.3591f, 6.9692f)
                curveTo(11.314f, 7.211f, 11.3141f, 7.466f, 11.3143f, 7.7921f)
                lineTo(11.3143f, 7.8697f)
                curveTo(11.3143f, 7.9744f, 11.3143f, 8.0744f, 11.3145f, 8.1699f)
                lineTo(11.3143f, 14.2982f)
                curveTo(10.5374f, 13.5505f, 9.4923f, 13.0925f, 8.3428f, 13.0925f)
                curveTo(5.9444f, 13.0925f, 4.0f, 15.0866f, 4.0f, 17.5463f)
                curveTo(4.0f, 20.0061f, 5.9444f, 22.0001f, 8.3428f, 22.0001f)
                curveTo(10.7413f, 22.0001f, 12.6857f, 20.0061f, 12.6857f, 17.5463f)
                verticalLineTo(11.1833f)
                curveTo(13.1164f, 11.4089f, 13.6124f, 11.5084f, 14.1199f, 11.4477f)
                curveTo(14.381f, 11.4165f, 14.6341f, 11.3227f, 14.8912f, 11.2078f)
                curveTo(15.1462f, 11.0938f, 15.4574f, 10.9342f, 15.8399f, 10.7381f)
                lineTo(18.3152f, 9.4688f)
                curveTo(18.5997f, 9.3231f, 18.8222f, 9.2092f, 19.0128f, 9.0597f)
                curveTo(19.5036f, 8.6749f, 19.839f, 8.1183f, 19.9551f, 7.4961f)
                curveTo(20.0002f, 7.2543f, 20.0001f, 6.9993f, 20.0f, 6.6732f)
                lineTo(20.0f, 6.5956f)
                curveTo(20.0f, 6.1571f, 20.0f, 5.8002f, 19.9854f, 5.5154f)
                curveTo(19.9706f, 5.2281f, 19.9392f, 4.954f, 19.8497f, 4.7006f)
                close()
            }
        }
        .build()
        return _musicNote4!!
    }

private var _musicNote4: ImageVector? = null
