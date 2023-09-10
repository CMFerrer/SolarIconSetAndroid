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

val VideoAudioSoundGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(
            name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 5.8596f)
                curveTo(22.0f, 5.0651f, 21.2094f, 4.3337f, 19.883f, 3.7528f)
                curveTo(18.7083f, 3.2383f, 17.5f, 4.2196f, 17.5f, 5.502f)
                verticalLineTo(8.7195f)
                moveTo(22.0f, 5.8596f)
                verticalLineTo(18.5761f)
                curveTo(22.0f, 20.467f, 17.5228f, 21.9998f, 12.0f, 21.9998f)
                curveTo(6.4771f, 21.9998f, 2.0f, 20.467f, 2.0f, 18.5761f)
                verticalLineTo(5.8596f)
                moveTo(22.0f, 5.8596f)
                curveTo(22.0f, 7.0549f, 20.2111f, 8.107f, 17.5f, 8.7195f)
                moveTo(2.0f, 5.8596f)
                curveTo(2.0f, 5.0651f, 2.7905f, 4.3337f, 4.1171f, 3.7528f)
                curveTo(5.2917f, 3.2383f, 6.5f, 4.2196f, 6.5f, 5.502f)
                verticalLineTo(8.7195f)
                moveTo(2.0f, 5.8596f)
                curveTo(2.0f, 7.0549f, 3.7889f, 8.107f, 6.5f, 8.7195f)
                moveTo(6.5f, 8.7195f)
                curveTo(8.0779f, 9.0759f, 9.9682f, 9.2833f, 12.0f, 9.2833f)
                curveTo(14.0318f, 9.2833f, 15.9221f, 9.0759f, 17.5f, 8.7195f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 13.0f)
                curveTo(19.5f, 13.8284f, 18.8284f, 14.5f, 18.0f, 14.5f)
                curveTo(17.1716f, 14.5f, 16.5f, 13.8284f, 16.5f, 13.0f)
                curveTo(16.5f, 12.1716f, 17.1716f, 11.5f, 18.0f, 11.5f)
                curveTo(18.8284f, 11.5f, 19.5f, 12.1716f, 19.5f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 20.0f)
                lineTo(18.5044f, 17.8514f)
                curveTo(17.6996f, 17.1586f, 16.501f, 17.0896f, 15.6152f, 17.6851f)
                lineTo(15.3843f, 17.8403f)
                curveTo(14.7687f, 18.2542f, 13.9312f, 18.1848f, 13.3991f, 17.6758f)
                lineTo(10.0781f, 14.4989f)
                curveTo(9.4152f, 13.8648f, 8.3519f, 13.8309f, 7.6464f, 14.4214f)
                lineTo(6.2903f, 15.5565f)
                lineTo(2.5f, 19.1035f)
            }
        }
            .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
