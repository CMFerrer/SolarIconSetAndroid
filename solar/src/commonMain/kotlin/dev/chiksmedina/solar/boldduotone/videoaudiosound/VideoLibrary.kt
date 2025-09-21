package dev.chiksmedina.solar.boldduotone.videoaudiosound

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
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(15.3276f, 7.542f)
                horizontalLineTo(8.6724f)
                curveTo(5.2976f, 7.542f, 3.6102f, 7.542f, 2.6623f, 8.5288f)
                curveTo(1.7145f, 9.5156f, 1.9375f, 11.0403f, 2.3835f, 14.0895f)
                lineTo(2.8065f, 16.9811f)
                curveTo(3.1563f, 19.3723f, 3.3312f, 20.5679f, 4.2283f, 21.2839f)
                curveTo(5.1255f, 21.9999f, 6.4488f, 21.9999f, 9.0953f, 21.9999f)
                horizontalLineTo(14.9046f)
                curveTo(17.5512f, 21.9999f, 18.8745f, 21.9999f, 19.7717f, 21.2839f)
                curveTo(20.6689f, 20.5679f, 20.8437f, 19.3723f, 21.1935f, 16.9811f)
                lineTo(21.6165f, 14.0895f)
                curveTo(22.0625f, 11.0403f, 22.2855f, 9.5156f, 21.3377f, 8.5288f)
                curveTo(20.3898f, 7.542f, 18.7024f, 7.542f, 15.3276f, 7.542f)
                close()
                moveTo(14.5812f, 15.7942f)
                curveTo(15.1396f, 15.448f, 15.1396f, 14.5519f, 14.5812f, 14.2057f)
                lineTo(11.2096f, 12.1156f)
                curveTo(10.6669f, 11.7792f, 10.0f, 12.2171f, 10.0f, 12.9098f)
                verticalLineTo(17.0901f)
                curveTo(10.0f, 17.7828f, 10.6669f, 18.2207f, 11.2096f, 17.8843f)
                lineTo(14.5812f, 15.7942f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5096f, 2.0f)
                horizontalLineTo(15.4897f)
                curveTo(15.7221f, 2.0f, 15.9004f, 1.9999f, 16.0562f, 2.0152f)
                curveTo(17.164f, 2.1235f, 18.0708f, 2.7896f, 18.4553f, 3.6868f)
                horizontalLineTo(5.544f)
                curveTo(5.9285f, 2.7896f, 6.8352f, 2.1235f, 7.943f, 2.0152f)
                curveTo(8.0988f, 1.9999f, 8.2771f, 2.0f, 8.5096f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3102f, 4.7227f)
                curveTo(4.9196f, 4.7227f, 3.7793f, 5.5624f, 3.3988f, 6.6764f)
                curveTo(3.3909f, 6.6997f, 3.3832f, 6.723f, 3.376f, 6.7465f)
                curveTo(3.7741f, 6.6259f, 4.1885f, 6.5471f, 4.608f, 6.4934f)
                curveTo(5.6883f, 6.3548f, 7.0537f, 6.3549f, 8.6397f, 6.355f)
                horizontalLineTo(15.5318f)
                curveTo(17.1178f, 6.3549f, 18.4832f, 6.3548f, 19.5635f, 6.4934f)
                curveTo(19.983f, 6.5471f, 20.3974f, 6.6259f, 20.7955f, 6.7465f)
                curveTo(20.7883f, 6.723f, 20.7806f, 6.6997f, 20.7727f, 6.6764f)
                curveTo(20.3922f, 5.5624f, 19.2519f, 4.7227f, 17.8613f, 4.7227f)
                horizontalLineTo(6.3102f)
                close()
            }
        }
            .build()
        return _videoLibrary!!
    }

private var _videoLibrary: ImageVector? = null
