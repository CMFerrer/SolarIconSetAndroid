package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5617f, 7.0f)
                curveTo(19.7904f, 5.6952f, 18.7863f, 4.5f, 17.4617f, 4.5f)
                horizontalLineTo(6.5379f)
                curveTo(5.2132f, 4.5f, 4.2092f, 5.6952f, 4.4378f, 7.0f)
                moveTo(17.4999f, 4.5f)
                curveTo(17.5283f, 4.2409f, 17.5425f, 4.1114f, 17.5427f, 4.0044f)
                curveTo(17.545f, 2.9807f, 16.7739f, 2.1206f, 15.7561f, 2.0114f)
                curveTo(15.6497f, 2.0f, 15.5194f, 2.0f, 15.2588f, 2.0f)
                horizontalLineTo(8.741f)
                curveTo(8.4803f, 2.0f, 8.35f, 2.0f, 8.2436f, 2.0114f)
                curveTo(7.2258f, 2.1206f, 6.4548f, 2.9807f, 6.457f, 4.0043f)
                curveTo(6.4573f, 4.1114f, 6.4715f, 4.2409f, 6.4998f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9999f, 20.0f)
                lineTo(17.1157f, 17.8514f)
                curveTo(16.1856f, 17.1586f, 14.8004f, 17.0896f, 13.7766f, 17.6851f)
                lineTo(13.5098f, 17.8403f)
                curveTo(12.7984f, 18.2542f, 11.8304f, 18.1848f, 11.2156f, 17.6758f)
                lineTo(7.3774f, 14.4989f)
                curveTo(6.6113f, 13.8648f, 5.3825f, 13.8309f, 4.5671f, 14.4214f)
                lineTo(3.2432f, 15.3803f)
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
