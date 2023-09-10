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

val VideoAudioSoundGroup.MusicLibrary: ImageVector
    get() {
        if (_musicLibrary != null) {
            return _musicLibrary!!
        }
        _musicLibrary = Builder(
            name = "MusicLibrary", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.5885f, 10.165f)
                curveTo(13.3569f, 9.6388f, 11.9428f, 10.4304f, 11.8607f, 11.6924f)
                curveTo(11.8571f, 11.7475f, 11.8571f, 11.8163f, 11.8571f, 11.8993f)
                lineTo(11.8571f, 11.9262f)
                curveTo(11.8571f, 11.9558f, 11.8571f, 11.9822f, 11.8578f, 12.0077f)
                lineTo(11.8574f, 15.5219f)
                curveTo(11.4791f, 15.3176f, 11.0399f, 15.2007f, 10.5714f, 15.2007f)
                curveTo(9.1514f, 15.2007f, 8.0f, 16.275f, 8.0f, 17.6003f)
                curveTo(8.0f, 18.9257f, 9.1514f, 19.9999f, 10.5714f, 19.9999f)
                curveTo(11.9915f, 19.9999f, 13.1428f, 18.9256f, 13.1429f, 17.6003f)
                lineTo(13.1433f, 13.6814f)
                lineTo(14.0713f, 14.1432f)
                curveTo(14.1497f, 14.1823f, 14.2149f, 14.2147f, 14.2686f, 14.2377f)
                curveTo(15.5003f, 14.7639f, 16.9144f, 13.9723f, 16.9965f, 12.7103f)
                curveTo(17.0f, 12.6552f, 17.0f, 12.5864f, 17.0f, 12.5033f)
                lineTo(17.0f, 12.4766f)
                curveTo(17.0f, 12.4426f, 17.0f, 12.413f, 16.999f, 12.3841f)
                curveTo(16.9778f, 11.7606f, 16.6121f, 11.1919f, 16.0326f, 10.881f)
                curveTo(16.0057f, 10.8666f, 15.9777f, 10.8527f, 15.9456f, 10.8367f)
                lineTo(14.7858f, 10.2595f)
                curveTo(14.7074f, 10.2204f, 14.6423f, 10.188f, 14.5885f, 10.165f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0533f, 11.2561f)
                curveTo(13.6426f, 11.0806f, 13.1714f, 11.3446f, 13.144f, 11.7651f)
                curveTo(13.1432f, 11.7783f, 13.1429f, 11.8056f, 13.1429f, 11.919f)
                curveTo(13.1429f, 11.964f, 13.1429f, 11.9732f, 13.1432f, 11.9805f)
                curveTo(13.1503f, 12.1882f, 13.2721f, 12.3778f, 13.4653f, 12.4814f)
                curveTo(13.472f, 12.485f, 13.4807f, 12.4894f, 13.5232f, 12.5105f)
                lineTo(14.6576f, 13.0751f)
                curveTo(14.7649f, 13.1285f, 14.7909f, 13.1411f, 14.8038f, 13.1466f)
                curveTo(15.2145f, 13.3221f, 15.6858f, 13.0581f, 15.7131f, 12.6376f)
                curveTo(15.714f, 12.6244f, 15.7143f, 12.5971f, 15.7143f, 12.4836f)
                curveTo(15.7143f, 12.4387f, 15.7142f, 12.4295f, 15.714f, 12.4222f)
                curveTo(15.7069f, 12.2145f, 15.585f, 12.025f, 15.3919f, 11.9213f)
                lineTo(14.0533f, 11.2561f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5714f, 16.4006f)
                curveTo(11.2816f, 16.4006f, 11.8571f, 16.9378f, 11.8571f, 17.6003f)
                curveTo(11.8571f, 18.2628f, 11.2816f, 18.8f, 10.5714f, 18.8f)
                curveTo(9.8613f, 18.8f, 9.2857f, 18.2628f, 9.2857f, 17.6003f)
                curveTo(9.2857f, 16.9378f, 9.8613f, 16.4006f, 10.5714f, 16.4006f)
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
                horizontalLineTo(15.5323f)
                curveTo(17.1183f, 6.3549f, 18.4837f, 6.3548f, 19.564f, 6.4934f)
                curveTo(19.9835f, 6.5471f, 20.3979f, 6.6259f, 20.796f, 6.7465f)
                curveTo(20.7887f, 6.723f, 20.7811f, 6.6997f, 20.7732f, 6.6764f)
                curveTo(20.3927f, 5.5624f, 19.2524f, 4.7227f, 17.8618f, 4.7227f)
                horizontalLineTo(6.3107f)
                close()
            }
        }
            .build()
        return _musicLibrary!!
    }

private var _musicLibrary: ImageVector? = null
