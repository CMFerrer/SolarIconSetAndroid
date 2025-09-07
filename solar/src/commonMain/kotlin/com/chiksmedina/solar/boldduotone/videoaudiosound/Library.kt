package com.chiksmedina.solar.boldduotone.videoaudiosound

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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(8.6724f, 7.542f)
                horizontalLineTo(15.3276f)
                curveTo(18.7024f, 7.542f, 20.3898f, 7.542f, 21.3377f, 8.5288f)
                curveTo(22.2855f, 9.5156f, 22.0625f, 11.0403f, 21.6165f, 14.0895f)
                lineTo(21.1935f, 16.9811f)
                curveTo(20.8437f, 19.3723f, 20.6689f, 20.5679f, 19.7717f, 21.2839f)
                curveTo(18.8745f, 21.9999f, 17.5512f, 21.9999f, 14.9046f, 21.9999f)
                horizontalLineTo(9.0954f)
                curveTo(6.4488f, 21.9999f, 5.1255f, 21.9999f, 4.2283f, 21.2839f)
                curveTo(3.3312f, 20.5679f, 3.1563f, 19.3723f, 2.8065f, 16.9811f)
                lineTo(2.3835f, 14.0895f)
                curveTo(1.9375f, 11.0403f, 1.7145f, 9.5156f, 2.6623f, 8.5288f)
                curveTo(3.6102f, 7.542f, 5.2976f, 7.542f, 8.6724f, 7.542f)
                close()
                moveTo(8.0f, 18.0001f)
                curveTo(8.0f, 17.5859f, 8.3731f, 17.2501f, 8.8333f, 17.2501f)
                horizontalLineTo(15.1667f)
                curveTo(15.6269f, 17.2501f, 16.0f, 17.5859f, 16.0f, 18.0001f)
                curveTo(16.0f, 18.4143f, 15.6269f, 18.7501f, 15.1667f, 18.7501f)
                horizontalLineTo(8.8333f)
                curveTo(8.3731f, 18.7501f, 8.0f, 18.4143f, 8.0f, 18.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.51f, 2.0f)
                horizontalLineTo(15.4901f)
                curveTo(15.7226f, 2.0f, 15.9009f, 1.9999f, 16.0567f, 2.0152f)
                curveTo(17.1645f, 2.1235f, 18.0712f, 2.7896f, 18.4558f, 3.6868f)
                horizontalLineTo(5.5444f)
                curveTo(5.9289f, 2.7896f, 6.8357f, 2.1235f, 7.9435f, 2.0152f)
                curveTo(8.0993f, 1.9999f, 8.2776f, 2.0f, 8.51f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3107f, 4.7227f)
                curveTo(4.9201f, 4.7227f, 3.7798f, 5.5624f, 3.3993f, 6.6764f)
                curveTo(3.3913f, 6.6997f, 3.3837f, 6.723f, 3.3765f, 6.7465f)
                curveTo(3.7746f, 6.6259f, 4.189f, 6.5471f, 4.6084f, 6.4934f)
                curveTo(5.6888f, 6.3548f, 7.0542f, 6.3549f, 8.6402f, 6.355f)
                lineTo(8.7586f, 6.355f)
                lineTo(15.5323f, 6.355f)
                curveTo(17.1183f, 6.3549f, 18.4837f, 6.3548f, 19.564f, 6.4934f)
                curveTo(19.9835f, 6.5471f, 20.3979f, 6.6259f, 20.796f, 6.7465f)
                curveTo(20.7887f, 6.723f, 20.7811f, 6.6997f, 20.7732f, 6.6764f)
                curveTo(20.3927f, 5.5624f, 19.2524f, 4.7227f, 17.8618f, 4.7227f)
                horizontalLineTo(6.3107f)
                close()
            }
        }
            .build()
        return _library!!
    }

private var _library: ImageVector? = null
