package com.chiksmedina.solar.linear.videoaudiosound

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
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.Library: ImageVector
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = Builder(
            name = "Library", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.562f, 7.0f)
                curveTo(19.7906f, 5.6952f, 18.7866f, 4.5f, 17.4619f, 4.5f)
                horizontalLineTo(6.5381f)
                curveTo(5.2135f, 4.5f, 4.2095f, 5.6952f, 4.4381f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5001f, 4.5f)
                curveTo(17.5284f, 4.2409f, 17.5426f, 4.1114f, 17.5429f, 4.0044f)
                curveTo(17.5451f, 2.9807f, 16.774f, 2.1206f, 15.7563f, 2.0114f)
                curveTo(15.6499f, 2.0f, 15.5195f, 2.0f, 15.2589f, 2.0f)
                horizontalLineTo(8.7411f)
                curveTo(8.4805f, 2.0f, 8.3501f, 2.0f, 8.2437f, 2.0114f)
                curveTo(7.226f, 2.1206f, 6.4549f, 2.9807f, 6.4572f, 4.0043f)
                curveTo(6.4574f, 4.1114f, 6.4716f, 4.2409f, 6.4999f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(9.0f)
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
        return _library!!
    }

private var _library: ImageVector? = null
