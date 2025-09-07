package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5099f, 2.0f)
                horizontalLineTo(15.49f)
                curveTo(15.7225f, 2.0f, 15.9007f, 1.9999f, 16.0565f, 2.0152f)
                curveTo(17.1643f, 2.1235f, 18.0711f, 2.7896f, 18.4556f, 3.6868f)
                horizontalLineTo(5.5443f)
                curveTo(5.9288f, 2.7896f, 6.8355f, 2.1235f, 7.9434f, 2.0152f)
                curveTo(8.0992f, 1.9999f, 8.2774f, 2.0f, 8.5099f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.3105f, 4.7231f)
                curveTo(4.9199f, 4.7231f, 3.7796f, 5.5629f, 3.3991f, 6.6769f)
                curveTo(3.3912f, 6.7001f, 3.3836f, 6.7235f, 3.3763f, 6.7469f)
                curveTo(3.7744f, 6.6264f, 4.1888f, 6.5476f, 4.6083f, 6.4938f)
                curveTo(5.6887f, 6.3553f, 7.054f, 6.3554f, 8.64f, 6.3555f)
                lineTo(8.7585f, 6.3555f)
                lineTo(15.5321f, 6.3555f)
                curveTo(17.1181f, 6.3554f, 18.4835f, 6.3553f, 19.5639f, 6.4938f)
                curveTo(19.9833f, 6.5476f, 20.3977f, 6.6264f, 20.7958f, 6.7469f)
                curveTo(20.7886f, 6.7235f, 20.781f, 6.7001f, 20.773f, 6.6769f)
                curveTo(20.3925f, 5.5629f, 19.2522f, 4.7231f, 17.8616f, 4.7231f)
                horizontalLineTo(6.3105f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.6724f, 7.542f)
                horizontalLineTo(15.3276f)
                curveTo(18.7024f, 7.542f, 20.3898f, 7.542f, 21.3377f, 8.5289f)
                curveTo(22.2855f, 9.5157f, 22.0625f, 11.0403f, 21.6165f, 14.0896f)
                lineTo(21.1935f, 16.9811f)
                curveTo(20.8437f, 19.3724f, 20.6689f, 20.568f, 19.7717f, 21.284f)
                curveTo(18.8745f, 22.0f, 17.5512f, 22.0f, 14.9046f, 22.0f)
                horizontalLineTo(9.0954f)
                curveTo(6.4488f, 22.0f, 5.1255f, 22.0f, 4.2283f, 21.284f)
                curveTo(3.3312f, 20.568f, 3.1563f, 19.3724f, 2.8065f, 16.9811f)
                lineTo(2.3835f, 14.0896f)
                curveTo(1.9375f, 11.0403f, 1.7145f, 9.5157f, 2.6623f, 8.5289f)
                curveTo(3.6102f, 7.542f, 5.2976f, 7.542f, 8.6724f, 7.542f)
                close()
                moveTo(8.0f, 18.0001f)
                curveTo(8.0f, 17.5859f, 8.3731f, 17.2501f, 8.8333f, 17.2501f)
                horizontalLineTo(15.1667f)
                curveTo(15.6269f, 17.2501f, 16.0f, 17.5859f, 16.0f, 18.0001f)
                curveTo(16.0f, 18.4144f, 15.6269f, 18.7502f, 15.1667f, 18.7502f)
                horizontalLineTo(8.8333f)
                curveTo(8.3731f, 18.7502f, 8.0f, 18.4144f, 8.0f, 18.0001f)
                close()
            }
        }
            .build()
        return _library!!
    }

private var _library: ImageVector? = null
