package dev.chiksmedina.solar.boldduotone.astronomy

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
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(
            name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(13.0861f, 5.0412f)
                lineTo(2.3324f, 10.3592f)
                curveTo(1.9611f, 10.5428f, 1.5113f, 10.3906f, 1.3276f, 10.0193f)
                curveTo(1.144f, 9.6481f, 1.2962f, 9.1982f, 1.6675f, 9.0146f)
                lineTo(14.0954f, 2.8686f)
                lineTo(14.2403f, 3.8793f)
                curveTo(14.2408f, 3.8816f, 14.2415f, 3.8846f, 14.2424f, 3.8885f)
                curveTo(14.2472f, 3.9083f, 14.2581f, 3.9497f, 14.2793f, 4.0121f)
                curveTo(14.3217f, 4.1366f, 14.4055f, 4.3461f, 14.5643f, 4.6361f)
                curveTo(14.8821f, 5.2162f, 15.5011f, 6.1202f, 16.6905f, 7.3096f)
                curveTo(17.8798f, 8.4989f, 18.7837f, 9.1179f, 19.3638f, 9.4355f)
                curveTo(19.6537f, 9.5943f, 19.8631f, 9.6781f, 19.9877f, 9.7204f)
                curveTo(20.05f, 9.7416f, 20.0913f, 9.7525f, 20.1112f, 9.7573f)
                curveTo(20.115f, 9.7582f, 20.1181f, 9.7589f, 20.1203f, 9.7594f)
                lineTo(21.1311f, 9.9042f)
                lineTo(14.9854f, 22.3324f)
                curveTo(14.8018f, 22.7037f, 14.352f, 22.8559f, 13.9807f, 22.6723f)
                curveTo(13.6094f, 22.4887f, 13.4573f, 22.0389f, 13.6409f, 21.6676f)
                lineTo(18.9586f, 10.9137f)
                curveTo(18.8606f, 10.8665f, 18.7555f, 10.8126f, 18.6433f, 10.7511f)
                curveTo(18.0245f, 10.4123f, 17.1927f, 9.8439f, 16.1694f, 8.8913f)
                lineTo(5.5303f, 19.5303f)
                curveTo(5.2374f, 19.8232f, 4.7625f, 19.8232f, 4.4696f, 19.5303f)
                curveTo(4.1767f, 19.2374f, 4.1767f, 18.7626f, 4.4696f, 18.4697f)
                lineTo(15.1087f, 7.8306f)
                curveTo(14.1561f, 6.8073f, 13.5877f, 5.9755f, 13.2487f, 5.3567f)
                curveTo(13.1873f, 5.2444f, 13.1333f, 5.1392f, 13.0861f, 5.0412f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.8236f, 10.5271f)
                lineTo(21.1314f, 9.9047f)
                lineTo(20.1206f, 9.7599f)
                lineTo(20.1114f, 9.7578f)
                curveTo(20.0916f, 9.753f, 20.0502f, 9.7421f, 19.9879f, 9.7209f)
                curveTo(19.8634f, 9.6786f, 19.6539f, 9.5948f, 19.364f, 9.436f)
                curveTo(18.784f, 9.1183f, 17.8801f, 8.4994f, 16.6907f, 7.3101f)
                curveTo(15.5014f, 6.1207f, 14.8823f, 5.2167f, 14.5646f, 4.6366f)
                curveTo(14.4058f, 4.3466f, 14.3219f, 4.1371f, 14.2796f, 4.0125f)
                curveTo(14.2584f, 3.9502f, 14.2475f, 3.9088f, 14.2427f, 3.889f)
                lineTo(14.2406f, 3.8798f)
                lineTo(14.0956f, 2.8691f)
                lineTo(13.47f, 3.1785f)
                curveTo(15.522f, 1.4976f, 18.5545f, 1.6148f, 20.4698f, 3.5301f)
                curveTo(22.3842f, 5.4445f, 22.5022f, 8.4751f, 20.8236f, 10.5271f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.3144f, 12.2174f)
                lineTo(18.9588f, 10.9142f)
                curveTo(18.8608f, 10.867f, 18.7557f, 10.8131f, 18.6435f, 10.7516f)
                curveTo(18.0248f, 10.4128f, 17.193f, 9.8443f, 16.1696f, 8.8918f)
                lineTo(13.6505f, 11.4109f)
                curveTo(15.01f, 12.4284f, 16.7525f, 12.6972f, 18.3144f, 12.2174f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5897f, 10.3504f)
                lineTo(15.109f, 7.8311f)
                curveTo(14.1564f, 6.8078f, 13.5879f, 5.9759f, 13.249f, 5.3572f)
                curveTo(13.1875f, 5.2449f, 13.1336f, 5.1397f, 13.0863f, 5.0416f)
                lineTo(11.782f, 5.6867f)
                curveTo(11.3026f, 7.2487f, 11.5718f, 8.9911f, 12.5897f, 10.3504f)
                close()
            }
        }
            .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
