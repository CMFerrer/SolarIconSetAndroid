package dev.chiksmedina.solar.bold.videoaudiosound

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
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                horizontalLineTo(15.5321f)
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
                moveTo(15.3276f, 7.542f)
                horizontalLineTo(8.6724f)
                curveTo(5.2976f, 7.542f, 3.6102f, 7.542f, 2.6623f, 8.5289f)
                curveTo(1.7145f, 9.5157f, 1.9375f, 11.0403f, 2.3835f, 14.0896f)
                lineTo(2.8065f, 16.9811f)
                curveTo(3.1563f, 19.3724f, 3.3312f, 20.568f, 4.2283f, 21.284f)
                curveTo(5.1255f, 22.0f, 6.4488f, 22.0f, 9.0953f, 22.0f)
                horizontalLineTo(14.9046f)
                curveTo(17.5512f, 22.0f, 18.8745f, 22.0f, 19.7717f, 21.284f)
                curveTo(20.6689f, 20.568f, 20.8437f, 19.3724f, 21.1935f, 16.9811f)
                lineTo(21.6165f, 14.0896f)
                curveTo(22.0625f, 11.0404f, 22.2855f, 9.5157f, 21.3377f, 8.5289f)
                curveTo(20.3898f, 7.542f, 18.7024f, 7.542f, 15.3276f, 7.542f)
                close()
                moveTo(14.5812f, 15.7942f)
                curveTo(15.1396f, 15.4481f, 15.1396f, 14.5519f, 14.5812f, 14.2058f)
                lineTo(11.2096f, 12.1156f)
                curveTo(10.6669f, 11.7792f, 10.0f, 12.2171f, 10.0f, 12.9099f)
                verticalLineTo(17.0901f)
                curveTo(10.0f, 17.7829f, 10.6669f, 18.2208f, 11.2096f, 17.8844f)
                lineTo(14.5812f, 15.7942f)
                close()
            }
        }
            .build()
        return _videoLibrary!!
    }

private var _videoLibrary: ImageVector? = null
