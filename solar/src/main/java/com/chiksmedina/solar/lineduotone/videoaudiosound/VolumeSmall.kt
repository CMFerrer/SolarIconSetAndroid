package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeSmall: ImageVector
    get() {
        if (_volumeSmall != null) {
            return _volumeSmall!!
        }
        _volumeSmall = Builder(
            name = "VolumeSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(1.5348f, 10.9714f)
                curveTo(1.6085f, 9.7626f, 1.6453f, 9.1581f, 1.9585f, 8.5768f)
                curveTo(2.2447f, 8.0456f, 2.7923f, 7.5304f, 3.3399f, 7.2771f)
                curveTo(3.9392f, 6.9998f, 4.6262f, 6.9998f, 6.0001f, 6.9998f)
                curveTo(6.5121f, 6.9998f, 6.7682f, 6.9998f, 7.0162f, 6.9579f)
                curveTo(7.2614f, 6.9165f, 7.5005f, 6.8448f, 7.728f, 6.7444f)
                curveTo(7.9581f, 6.6428f, 8.1718f, 6.5019f, 8.5993f, 6.22f)
                lineTo(8.8182f, 6.0757f)
                curveTo(11.3612f, 4.399f, 12.6327f, 3.5606f, 13.7001f, 3.9249f)
                curveTo(13.9047f, 3.9947f, 14.1028f, 4.0955f, 14.2797f, 4.2198f)
                curveTo(15.2024f, 4.8683f, 15.2725f, 6.377f, 15.4127f, 9.3944f)
                curveTo(15.4646f, 10.5117f, 15.5f, 11.4679f, 15.5f, 11.9998f)
                curveTo(15.5f, 12.5317f, 15.4646f, 13.4879f, 15.4127f, 14.6052f)
                curveTo(15.2725f, 17.6226f, 15.2024f, 19.1313f, 14.2797f, 19.7797f)
                curveTo(14.1028f, 19.9041f, 13.9047f, 20.0049f, 13.7001f, 20.0747f)
                curveTo(12.6327f, 20.4389f, 11.3612f, 19.6006f, 8.8182f, 17.9239f)
                lineTo(8.5993f, 17.7796f)
                curveTo(8.1718f, 17.4977f, 7.9581f, 17.3567f, 7.728f, 17.2552f)
                curveTo(7.5005f, 17.1548f, 7.2614f, 17.0831f, 7.0162f, 17.0417f)
                curveTo(6.7682f, 16.9998f, 6.5121f, 16.9998f, 6.0001f, 16.9998f)
                curveTo(4.6262f, 16.9998f, 3.9392f, 16.9998f, 3.3399f, 16.7225f)
                curveTo(2.7923f, 16.4692f, 2.2447f, 15.9539f, 1.9585f, 15.4228f)
                curveTo(1.6453f, 14.8414f, 1.6085f, 14.237f, 1.5348f, 13.0282f)
                curveTo(1.513f, 12.6706f, 1.5f, 12.3222f, 1.5f, 11.9998f)
                curveTo(1.5f, 11.6774f, 1.513f, 11.329f, 1.5348f, 10.9714f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 9.0f, 18.5f, 9.9f, 18.5f, 12.0f)
                curveTo(18.5f, 14.1f, 18.0f, 15.0f, 18.0f, 15.0f)
            }
        }
            .build()
        return _volumeSmall!!
    }

private var _volumeSmall: ImageVector? = null
