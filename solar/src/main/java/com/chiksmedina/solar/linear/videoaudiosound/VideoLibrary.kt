package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.VideoLibrary: ImageVector
    get() {
        if (_videoLibrary != null) {
            return _videoLibrary!!
        }
        _videoLibrary = Builder(
            name = "VideoLibrary", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5619f, 7.0f)
                curveTo(19.7905f, 5.6952f, 18.7865f, 4.5f, 17.4619f, 4.5f)
                horizontalLineTo(6.5381f)
                curveTo(5.2134f, 4.5f, 4.2094f, 5.6952f, 4.438f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 4.5f)
                curveTo(17.5284f, 4.2409f, 17.5426f, 4.1114f, 17.5428f, 4.0044f)
                curveTo(17.545f, 2.9807f, 16.774f, 2.1206f, 15.7562f, 2.0114f)
                curveTo(15.6498f, 2.0f, 15.5195f, 2.0f, 15.2588f, 2.0f)
                horizontalLineTo(8.741f)
                curveTo(8.4804f, 2.0f, 8.3501f, 2.0f, 8.2437f, 2.0114f)
                curveTo(7.2259f, 2.1206f, 6.4549f, 2.9807f, 6.4571f, 4.0043f)
                curveTo(6.4573f, 4.1114f, 6.4715f, 4.2409f, 6.4999f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5812f, 13.6159f)
                curveTo(15.1396f, 13.9621f, 15.1396f, 14.8582f, 14.5812f, 15.2044f)
                lineTo(11.2096f, 17.2945f)
                curveTo(10.6669f, 17.6309f, 10.0f, 17.1931f, 10.0f, 16.5003f)
                lineTo(10.0f, 12.32f)
                curveTo(10.0f, 11.6273f, 10.6669f, 11.1894f, 11.2096f, 11.5258f)
                lineTo(14.5812f, 13.6159f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.3835f, 13.793f)
                curveTo(1.9375f, 10.6294f, 1.7145f, 9.0477f, 2.6623f, 8.0238f)
                curveTo(3.6102f, 7.0f, 5.2976f, 7.0f, 8.6724f, 7.0f)
                horizontalLineTo(15.3276f)
                curveTo(18.7024f, 7.0f, 20.3898f, 7.0f, 21.3377f, 8.0238f)
                curveTo(22.2855f, 9.0477f, 22.0625f, 10.6294f, 21.6165f, 13.793f)
                lineTo(21.1935f, 16.793f)
                curveTo(20.8437f, 19.2739f, 20.6689f, 20.5143f, 19.7717f, 21.2572f)
                curveTo(18.8745f, 22.0f, 17.5512f, 22.0f, 14.9046f, 22.0f)
                horizontalLineTo(9.0954f)
                curveTo(6.4488f, 22.0f, 5.1255f, 22.0f, 4.2283f, 21.2572f)
                curveTo(3.3312f, 20.5143f, 3.1563f, 19.2739f, 2.8065f, 16.793f)
                lineTo(2.3835f, 13.793f)
                close()
            }
        }
            .build()
        return _videoLibrary!!
    }

private var _videoLibrary: ImageVector? = null
