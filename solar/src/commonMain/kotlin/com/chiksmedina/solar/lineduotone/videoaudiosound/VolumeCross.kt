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

val VideoAudioSoundGroup.VolumeCross: ImageVector
    get() {
        if (_volumeCross != null) {
            return _volumeCross!!
        }
        _volumeCross = Builder(
            name = "VolumeCross", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0162f, 17.0417f)
                curveTo(6.7682f, 16.9998f, 6.5121f, 16.9998f, 6.0001f, 16.9998f)
                curveTo(4.6262f, 16.9998f, 3.9392f, 16.9998f, 3.3399f, 16.7225f)
                curveTo(2.7923f, 16.4692f, 2.2447f, 15.9539f, 1.9585f, 15.4228f)
                curveTo(1.6453f, 14.8414f, 1.6085f, 14.237f, 1.5348f, 13.0282f)
                curveTo(1.513f, 12.6706f, 1.5f, 12.3222f, 1.5f, 11.9998f)
                curveTo(1.5f, 11.6774f, 1.513f, 11.329f, 1.5348f, 10.9714f)
                curveTo(1.6085f, 9.7626f, 1.6453f, 9.1581f, 1.9585f, 8.5768f)
                curveTo(2.2447f, 8.0456f, 2.7923f, 7.5304f, 3.3399f, 7.2771f)
                curveTo(3.9392f, 6.9998f, 4.6262f, 6.9998f, 6.0001f, 6.9998f)
                curveTo(6.5121f, 6.9998f, 6.7682f, 6.9998f, 7.0162f, 6.9579f)
                curveTo(7.2614f, 6.9165f, 7.5005f, 6.8448f, 7.728f, 6.7444f)
                curveTo(7.9581f, 6.6428f, 8.1718f, 6.5019f, 8.5993f, 6.22f)
                lineTo(8.8182f, 6.0757f)
                curveTo(11.3612f, 4.399f, 12.6327f, 3.5606f, 13.7001f, 3.9249f)
                curveTo(13.9047f, 3.9947f, 14.1028f, 4.0955f, 14.2797f, 4.2198f)
                curveTo(15.115f, 4.8068f, 15.2516f, 6.0988f, 15.374f, 8.5768f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 8.5f)
                verticalLineTo(12.0f)
                curveTo(15.5f, 12.5319f, 15.4646f, 13.4881f, 15.4127f, 14.6054f)
                curveTo(15.2725f, 17.6228f, 15.2024f, 19.1315f, 14.2797f, 19.78f)
                curveTo(14.1028f, 19.9043f, 13.9047f, 20.0051f, 13.7001f, 20.0749f)
                curveTo(12.7327f, 20.405f, 11.5975f, 19.7473f, 9.5f, 18.3727f)
                curveTo(8.8333f, 17.9152f, 7.4f, 17.0f, 7.0f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 18.0f)
                curveTo(20.0f, 18.0f, 21.5f, 16.2f, 21.5f, 12.0f)
                curveTo(21.5f, 9.5666f, 20.9965f, 7.9388f, 20.5729f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 15.0f)
                curveTo(18.0f, 15.0f, 18.5f, 14.1f, 18.5f, 12.0f)
                curveTo(18.5f, 11.1381f, 18.4158f, 10.4784f, 18.3165f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
            .build()
        return _volumeCross!!
    }

private var _volumeCross: ImageVector? = null
