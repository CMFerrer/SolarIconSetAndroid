package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

public val VideoAudioSoundGroup.VolumeSmall: ImageVector
    get() {
        if (_volumeSmall != null) {
            return _volumeSmall!!
        }
        _volumeSmall = Builder(name = "VolumeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 9.0f, 18.5f, 9.9f, 18.5f, 12.0f)
                curveTo(18.5f, 14.1f, 18.0f, 15.0f, 18.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9586f, 8.5768f)
                curveTo(2.2448f, 8.0456f, 2.7924f, 7.5304f, 3.34f, 7.2771f)
                curveTo(3.9393f, 6.9998f, 4.6263f, 6.9998f, 6.0002f, 6.9998f)
                curveTo(6.5122f, 6.9998f, 6.7683f, 6.9998f, 7.0163f, 6.9579f)
                curveTo(7.2615f, 6.9165f, 7.5006f, 6.8448f, 7.728f, 6.7444f)
                curveTo(7.9581f, 6.6428f, 8.1719f, 6.5019f, 8.5994f, 6.22f)
                lineTo(8.8183f, 6.0757f)
                curveTo(11.3613f, 4.399f, 12.6328f, 3.5606f, 13.7001f, 3.9249f)
                curveTo(13.9048f, 3.9947f, 14.1029f, 4.0955f, 14.2798f, 4.2198f)
                curveTo(15.2025f, 4.8683f, 15.2726f, 6.377f, 15.4128f, 9.3944f)
                curveTo(15.4647f, 10.5117f, 15.5001f, 11.4679f, 15.5001f, 11.9998f)
                curveTo(15.5001f, 12.5317f, 15.4647f, 13.4879f, 15.4128f, 14.6052f)
                curveTo(15.2726f, 17.6226f, 15.2025f, 19.1313f, 14.2798f, 19.7797f)
                curveTo(14.1029f, 19.9041f, 13.9048f, 20.0049f, 13.7001f, 20.0747f)
                curveTo(12.6328f, 20.4389f, 11.3613f, 19.6006f, 8.8183f, 17.9239f)
                lineTo(8.5994f, 17.7796f)
                curveTo(8.1719f, 17.4977f, 7.9581f, 17.3567f, 7.728f, 17.2552f)
                curveTo(7.5006f, 17.1548f, 7.2615f, 17.0831f, 7.0163f, 17.0417f)
                curveTo(6.7683f, 16.9998f, 6.5122f, 16.9998f, 6.0002f, 16.9998f)
                curveTo(4.6263f, 16.9998f, 3.9393f, 16.9998f, 3.34f, 16.7225f)
                curveTo(2.7924f, 16.4692f, 2.2448f, 15.9539f, 1.9586f, 15.4228f)
                curveTo(1.6454f, 14.8414f, 1.6086f, 14.237f, 1.5349f, 13.0282f)
                curveTo(1.524f, 12.849f, 1.5152f, 12.6722f, 1.5093f, 12.4998f)
            }
        }
        .build()
        return _volumeSmall!!
    }

private var _volumeSmall: ImageVector? = null
