package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(
            name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.9586f, 8.5768f)
                curveTo(6.2448f, 8.0456f, 6.7924f, 7.5304f, 7.34f, 7.2771f)
                curveTo(7.9393f, 6.9998f, 8.6263f, 6.9998f, 10.0002f, 6.9998f)
                curveTo(10.5122f, 6.9998f, 10.7683f, 6.9998f, 11.0163f, 6.9579f)
                curveTo(11.2615f, 6.9165f, 11.5006f, 6.8448f, 11.728f, 6.7444f)
                curveTo(11.9581f, 6.6428f, 12.1719f, 6.5019f, 12.5994f, 6.22f)
                lineTo(12.8183f, 6.0757f)
                curveTo(15.3613f, 4.399f, 16.6328f, 3.5606f, 17.7001f, 3.9249f)
                curveTo(17.9048f, 3.9947f, 18.1029f, 4.0955f, 18.2798f, 4.2198f)
                curveTo(19.2025f, 4.8683f, 19.2726f, 6.377f, 19.4128f, 9.3944f)
                curveTo(19.4647f, 10.5117f, 19.5001f, 11.4679f, 19.5001f, 11.9998f)
                curveTo(19.5001f, 12.5317f, 19.4647f, 13.4879f, 19.4128f, 14.6052f)
                curveTo(19.2726f, 17.6226f, 19.2025f, 19.1313f, 18.2798f, 19.7797f)
                curveTo(18.1029f, 19.9041f, 17.9048f, 20.0049f, 17.7001f, 20.0747f)
                curveTo(16.6328f, 20.4389f, 15.3613f, 19.6006f, 12.8183f, 17.9239f)
                lineTo(12.5994f, 17.7796f)
                curveTo(12.1719f, 17.4977f, 11.9581f, 17.3567f, 11.728f, 17.2552f)
                curveTo(11.5006f, 17.1548f, 11.2615f, 17.0831f, 11.0163f, 17.0417f)
                curveTo(10.7683f, 16.9998f, 10.5122f, 16.9998f, 10.0002f, 16.9998f)
                curveTo(8.6263f, 16.9998f, 7.9393f, 16.9998f, 7.34f, 16.7225f)
                curveTo(6.7924f, 16.4692f, 6.2448f, 15.9539f, 5.9586f, 15.4228f)
                curveTo(5.6454f, 14.8414f, 5.6086f, 14.237f, 5.5349f, 13.0282f)
                curveTo(5.524f, 12.849f, 5.5153f, 12.6722f, 5.5093f, 12.4998f)
            }
        }
            .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
