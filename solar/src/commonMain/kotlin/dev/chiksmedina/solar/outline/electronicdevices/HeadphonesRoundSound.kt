package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.HeadphonesRoundSound: ImageVector
    get() {
        if (_headphonesRoundSound != null) {
            return _headphonesRoundSound!!
        }
        _headphonesRoundSound = Builder(
            name = "HeadphonesRoundSound", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                verticalLineTo(16.9903f)
                curveTo(22.7501f, 17.0619f, 22.75f, 17.1355f, 22.75f, 17.2112f)
                curveTo(22.75f, 17.2497f, 22.75f, 17.2888f, 22.75f, 17.3285f)
                verticalLineTo(17.514f)
                curveTo(22.75f, 17.5543f, 22.75f, 17.5941f, 22.75f, 17.6333f)
                curveTo(22.7503f, 18.5472f, 22.7505f, 19.1599f, 22.5987f, 19.697f)
                curveTo(22.3018f, 20.7473f, 21.5885f, 21.6281f, 20.6227f, 22.1085f)
                curveTo(20.1281f, 22.3546f, 19.5366f, 22.452f, 18.6815f, 22.5929f)
                curveTo(18.6419f, 22.5994f, 18.6017f, 22.606f, 18.5609f, 22.6128f)
                lineTo(18.5392f, 22.6163f)
                curveTo(18.2352f, 22.6666f, 17.974f, 22.7097f, 17.757f, 22.732f)
                curveTo(17.5309f, 22.7552f, 17.2978f, 22.7626f, 17.0589f, 22.7134f)
                curveTo(16.2744f, 22.5518f, 15.6469f, 21.9787f, 15.3836f, 21.2269f)
                curveTo(15.3042f, 21.0001f, 15.2757f, 20.7692f, 15.2626f, 20.5365f)
                curveTo(15.25f, 20.3118f, 15.25f, 20.0379f, 15.25f, 19.714f)
                verticalLineTo(15.1871f)
                curveTo(15.25f, 15.1529f, 15.25f, 15.119f, 15.2499f, 15.0856f)
                curveTo(15.2494f, 14.6087f, 15.249f, 14.2125f, 15.3508f, 13.874f)
                curveTo(15.5835f, 13.0997f, 16.1985f, 12.492f, 16.989f, 12.3021f)
                curveTo(17.3343f, 12.2192f, 17.7272f, 12.2521f, 18.1754f, 12.2898f)
                curveTo(18.209f, 12.2926f, 18.243f, 12.2954f, 18.2772f, 12.2983f)
                curveTo(18.318f, 12.3016f, 18.3581f, 12.3049f, 18.3977f, 12.3082f)
                curveTo(19.2377f, 12.3772f, 19.8184f, 12.4249f, 20.3112f, 12.6156f)
                curveTo(20.6521f, 12.7475f, 20.9673f, 12.9276f, 21.25f, 13.1475f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                verticalLineTo(13.1475f)
                curveTo(3.0327f, 12.9276f, 3.3479f, 12.7475f, 3.6888f, 12.6156f)
                curveTo(4.1816f, 12.4249f, 4.7623f, 12.3772f, 5.6023f, 12.3082f)
                curveTo(5.6419f, 12.3049f, 5.682f, 12.3016f, 5.7228f, 12.2983f)
                curveTo(5.757f, 12.2954f, 5.791f, 12.2926f, 5.8246f, 12.2898f)
                curveTo(6.2729f, 12.2521f, 6.6657f, 12.2192f, 7.011f, 12.3021f)
                curveTo(7.8015f, 12.492f, 8.4165f, 13.0997f, 8.6492f, 13.874f)
                curveTo(8.751f, 14.2125f, 8.7506f, 14.6087f, 8.7501f, 15.0856f)
                curveTo(8.75f, 15.119f, 8.75f, 15.1529f, 8.75f, 15.1871f)
                verticalLineTo(19.7139f)
                curveTo(8.75f, 20.0379f, 8.75f, 20.3118f, 8.7374f, 20.5365f)
                curveTo(8.7243f, 20.7692f, 8.6958f, 21.0001f, 8.6164f, 21.2269f)
                curveTo(8.3531f, 21.9787f, 7.7256f, 22.5518f, 6.9411f, 22.7134f)
                curveTo(6.7022f, 22.7626f, 6.4691f, 22.7552f, 6.243f, 22.732f)
                curveTo(6.026f, 22.7097f, 5.7648f, 22.6666f, 5.4608f, 22.6163f)
                lineTo(5.4391f, 22.6128f)
                curveTo(5.3983f, 22.606f, 5.3581f, 22.5994f, 5.3184f, 22.5929f)
                curveTo(4.4634f, 22.452f, 3.8719f, 22.3546f, 3.3773f, 22.1085f)
                curveTo(2.4115f, 21.6281f, 1.6982f, 20.7473f, 1.4013f, 19.697f)
                curveTo(1.2708f, 19.2351f, 1.2526f, 18.7173f, 1.2503f, 18.0f)
                lineTo(1.25f, 17.8576f)
                curveTo(1.2499f, 17.7848f, 1.25f, 17.7101f, 1.25f, 17.6333f)
                curveTo(1.25f, 17.5941f, 1.25f, 17.5543f, 1.25f, 17.514f)
                verticalLineTo(17.3285f)
                curveTo(1.25f, 17.2889f, 1.25f, 17.2497f, 1.25f, 17.2112f)
                curveTo(1.25f, 17.1357f, 1.2499f, 17.0623f, 1.25f, 16.9909f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.75f, 17.514f)
                curveTo(2.75f, 18.5917f, 2.757f, 18.9785f, 2.8448f, 19.2891f)
                curveTo(3.0309f, 19.9477f, 3.4725f, 20.4805f, 4.0454f, 20.7655f)
                curveTo(4.3118f, 20.8981f, 4.6602f, 20.9638f, 5.6835f, 21.1328f)
                curveTo(6.0152f, 21.1876f, 6.2305f, 21.2228f, 6.3962f, 21.2398f)
                curveTo(6.5578f, 21.2564f, 6.6165f, 21.2488f, 6.6385f, 21.2442f)
                curveTo(6.8827f, 21.1939f, 7.1034f, 21.009f, 7.2007f, 20.7312f)
                curveTo(7.2127f, 20.6968f, 7.23f, 20.6263f, 7.2397f, 20.4523f)
                curveTo(7.2497f, 20.2748f, 7.25f, 20.0434f, 7.25f, 19.6934f)
                verticalLineTo(15.1871f)
                curveTo(7.25f, 14.5529f, 7.2419f, 14.4029f, 7.2127f, 14.3058f)
                curveTo(7.1262f, 14.0179f, 6.9076f, 13.8199f, 6.6606f, 13.7606f)
                curveTo(6.583f, 13.742f, 6.458f, 13.7427f, 5.8462f, 13.7932f)
                curveTo(4.8383f, 13.8764f, 4.4938f, 13.9125f, 4.2299f, 14.0146f)
                curveTo(3.5628f, 14.2726f, 3.0383f, 14.8557f, 2.8371f, 15.6001f)
                curveTo(2.7565f, 15.8985f, 2.75f, 16.2772f, 2.75f, 17.3285f)
                verticalLineTo(17.514f)
                close()
                moveTo(12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 6.0858f, 12.75f, 6.5f)
                lineTo(12.75f, 11.5f)
                curveTo(12.75f, 11.9142f, 12.4142f, 12.25f, 12.0f, 12.25f)
                curveTo(11.5858f, 12.25f, 11.25f, 11.9142f, 11.25f, 11.5f)
                lineTo(11.25f, 6.5f)
                curveTo(11.25f, 6.0858f, 11.5858f, 5.75f, 12.0f, 5.75f)
                close()
                moveTo(9.0f, 7.25f)
                curveTo(9.4142f, 7.25f, 9.75f, 7.5858f, 9.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(9.75f, 10.4142f, 9.4142f, 10.75f, 9.0f, 10.75f)
                curveTo(8.5858f, 10.75f, 8.25f, 10.4142f, 8.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(8.25f, 7.5858f, 8.5858f, 7.25f, 9.0f, 7.25f)
                close()
                moveTo(15.0f, 7.25f)
                curveTo(15.4142f, 7.25f, 15.75f, 7.5858f, 15.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(15.75f, 10.4142f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5858f, 10.75f, 14.25f, 10.4142f, 14.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(14.25f, 7.5858f, 14.5858f, 7.25f, 15.0f, 7.25f)
                close()
                moveTo(18.1538f, 13.7932f)
                curveTo(17.542f, 13.7427f, 17.417f, 13.742f, 17.3394f, 13.7606f)
                curveTo(17.0924f, 13.8199f, 16.8738f, 14.0179f, 16.7873f, 14.3058f)
                curveTo(16.7581f, 14.4029f, 16.75f, 14.5529f, 16.75f, 15.1871f)
                verticalLineTo(19.6934f)
                curveTo(16.75f, 20.0434f, 16.7503f, 20.2748f, 16.7603f, 20.4523f)
                curveTo(16.77f, 20.6263f, 16.7873f, 20.6968f, 16.7993f, 20.7312f)
                curveTo(16.8966f, 21.009f, 17.1173f, 21.1939f, 17.3615f, 21.2442f)
                curveTo(17.3835f, 21.2488f, 17.4422f, 21.2564f, 17.6038f, 21.2398f)
                curveTo(17.7695f, 21.2228f, 17.9848f, 21.1876f, 18.3165f, 21.1328f)
                curveTo(19.3398f, 20.9638f, 19.6882f, 20.8981f, 19.9546f, 20.7655f)
                curveTo(20.5275f, 20.4805f, 20.9691f, 19.9477f, 21.1552f, 19.2891f)
                curveTo(21.243f, 18.9785f, 21.25f, 18.5917f, 21.25f, 17.514f)
                verticalLineTo(17.3285f)
                curveTo(21.25f, 16.2772f, 21.2435f, 15.8985f, 21.1629f, 15.6001f)
                curveTo(20.9617f, 14.8557f, 20.4372f, 14.2726f, 19.7701f, 14.0146f)
                curveTo(19.5062f, 13.9125f, 19.1618f, 13.8764f, 18.1538f, 13.7932f)
                close()
            }
        }
            .build()
        return _headphonesRoundSound!!
    }

private var _headphonesRoundSound: ImageVector? = null
