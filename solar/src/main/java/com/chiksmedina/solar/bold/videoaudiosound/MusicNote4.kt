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

val VideoAudioSoundGroup.MusicNote4: ImageVector
    get() {
        if (_musicNote4 != null) {
            return _musicNote4!!
        }
        _musicNote4 = Builder(
            name = "MusicNote4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.8497f, 4.7005f)
                curveTo(19.4524f, 3.5757f, 18.353f, 2.8789f, 17.1944f, 3.0175f)
                curveTo(16.9333f, 3.0487f, 16.6802f, 3.1425f, 16.4231f, 3.2574f)
                curveTo(16.1681f, 3.3714f, 15.8568f, 3.531f, 15.4744f, 3.7271f)
                lineTo(12.999f, 4.9964f)
                curveTo(12.7146f, 5.1421f, 12.4921f, 5.256f, 12.3014f, 5.4055f)
                curveTo(11.8107f, 5.7903f, 11.4753f, 6.3469f, 11.3591f, 6.9692f)
                curveTo(11.314f, 7.2109f, 11.3141f, 7.4659f, 11.3143f, 7.792f)
                lineTo(11.3143f, 7.8696f)
                curveTo(11.3143f, 7.9743f, 11.3143f, 8.0743f, 11.3145f, 8.1698f)
                lineTo(11.3143f, 14.2981f)
                curveTo(10.5374f, 13.5504f, 9.4923f, 13.0924f, 8.3428f, 13.0924f)
                curveTo(5.9443f, 13.0924f, 4.0f, 15.0865f, 4.0f, 17.5462f)
                curveTo(4.0f, 20.006f, 5.9443f, 22.0f, 8.3428f, 22.0f)
                curveTo(10.7413f, 22.0f, 12.6857f, 20.006f, 12.6857f, 17.5462f)
                verticalLineTo(11.1832f)
                curveTo(13.1164f, 11.4088f, 13.6124f, 11.5083f, 14.1199f, 11.4476f)
                curveTo(14.381f, 11.4164f, 14.6341f, 11.3227f, 14.8912f, 11.2077f)
                curveTo(15.1462f, 11.0937f, 15.4574f, 10.9341f, 15.8399f, 10.738f)
                lineTo(18.3152f, 9.4687f)
                curveTo(18.5997f, 9.323f, 18.8222f, 9.2091f, 19.0128f, 9.0596f)
                curveTo(19.5036f, 8.6748f, 19.839f, 8.1182f, 19.9551f, 7.496f)
                curveTo(20.0002f, 7.2543f, 20.0001f, 6.9992f, 20.0f, 6.6731f)
                lineTo(20.0f, 6.5955f)
                curveTo(20.0f, 6.157f, 20.0f, 5.8001f, 19.9854f, 5.5153f)
                curveTo(19.9706f, 5.228f, 19.9392f, 4.9539f, 19.8497f, 4.7005f)
                close()
            }
        }
            .build()
        return _musicNote4!!
    }

private var _musicNote4: ImageVector? = null
