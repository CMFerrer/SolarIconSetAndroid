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
                moveTo(14.5885f, 10.1651f)
                curveTo(13.3569f, 9.6389f, 11.9428f, 10.4305f, 11.8607f, 11.6925f)
                curveTo(11.8571f, 11.7476f, 11.8571f, 11.8164f, 11.8571f, 11.8994f)
                lineTo(11.8571f, 11.9262f)
                curveTo(11.8571f, 11.9559f, 11.8571f, 11.9823f, 11.8578f, 12.0077f)
                lineTo(11.8574f, 15.5219f)
                curveTo(11.4791f, 15.3177f, 11.0399f, 15.2008f, 10.5714f, 15.2008f)
                curveTo(9.1514f, 15.2008f, 8.0f, 16.275f, 8.0f, 17.6004f)
                curveTo(8.0f, 18.9257f, 9.1514f, 20.0f, 10.5714f, 20.0f)
                curveTo(11.9915f, 20.0f, 13.1428f, 18.9257f, 13.1429f, 17.6004f)
                lineTo(13.1433f, 13.6814f)
                lineTo(14.0713f, 14.1433f)
                curveTo(14.1497f, 14.1823f, 14.2149f, 14.2148f, 14.2686f, 14.2377f)
                curveTo(15.5003f, 14.7639f, 16.9144f, 13.9723f, 16.9965f, 12.7103f)
                curveTo(17.0f, 12.6552f, 17.0f, 12.5864f, 17.0f, 12.5034f)
                lineTo(17.0f, 12.4766f)
                curveTo(17.0f, 12.4427f, 17.0f, 12.413f, 16.999f, 12.3841f)
                curveTo(16.9778f, 11.7607f, 16.6121f, 11.1919f, 16.0326f, 10.8811f)
                curveTo(16.0057f, 10.8667f, 15.9777f, 10.8527f, 15.9456f, 10.8367f)
                lineTo(14.7858f, 10.2595f)
                curveTo(14.7074f, 10.2205f, 14.6423f, 10.188f, 14.5885f, 10.1651f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0533f, 11.2561f)
                curveTo(13.6426f, 11.0807f, 13.1714f, 11.3447f, 13.144f, 11.7651f)
                curveTo(13.1432f, 11.7783f, 13.1429f, 11.8057f, 13.1429f, 11.9191f)
                curveTo(13.1429f, 11.9641f, 13.1429f, 11.9733f, 13.1432f, 11.9805f)
                curveTo(13.1503f, 12.1883f, 13.2721f, 12.3778f, 13.4653f, 12.4814f)
                curveTo(13.472f, 12.4851f, 13.4807f, 12.4895f, 13.5232f, 12.5106f)
                lineTo(14.6576f, 13.0752f)
                curveTo(14.7649f, 13.1286f, 14.7909f, 13.1412f, 14.8038f, 13.1467f)
                curveTo(15.2145f, 13.3221f, 15.6858f, 13.0581f, 15.7131f, 12.6377f)
                curveTo(15.714f, 12.6245f, 15.7143f, 12.5971f, 15.7143f, 12.4837f)
                curveTo(15.7143f, 12.4387f, 15.7142f, 12.4296f, 15.714f, 12.4223f)
                curveTo(15.7069f, 12.2146f, 15.585f, 12.025f, 15.3919f, 11.9214f)
                lineTo(14.0533f, 11.2561f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5714f, 16.4007f)
                curveTo(11.2816f, 16.4007f, 11.8571f, 16.9378f, 11.8571f, 17.6003f)
                curveTo(11.8571f, 18.2628f, 11.2816f, 18.8001f, 10.5714f, 18.8001f)
                curveTo(9.8613f, 18.8001f, 9.2857f, 18.2629f, 9.2857f, 17.6004f)
                curveTo(9.2857f, 16.9379f, 9.8613f, 16.4007f, 10.5714f, 16.4007f)
                close()
            }
        }
            .build()
        return _musicLibrary!!
    }

private var _musicLibrary: ImageVector? = null
