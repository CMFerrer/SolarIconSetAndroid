package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(
            name = "Telescope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.976f, 2.6021f)
                curveTo(18.4394f, 2.3426f, 18.742f, 2.1743f, 18.9825f, 2.0784f)
                curveTo(19.209f, 1.988f, 19.3082f, 1.9927f, 19.3758f, 2.0102f)
                curveTo(19.4425f, 2.0275f, 19.5291f, 2.0706f, 19.6774f, 2.257f)
                curveTo(19.8356f, 2.4559f, 20.0105f, 2.7475f, 20.2782f, 3.1975f)
                lineTo(21.3821f, 5.0525f)
                curveTo(21.6499f, 5.5026f, 21.8227f, 5.7951f, 21.921f, 6.0272f)
                curveTo(22.0133f, 6.2452f, 22.0063f, 6.3351f, 21.9904f, 6.393f)
                curveTo(21.9741f, 6.4518f, 21.9326f, 6.5347f, 21.7385f, 6.68f)
                curveTo(21.5329f, 6.834f, 21.2316f, 7.004f, 20.7681f, 7.2637f)
                lineTo(16.8361f, 9.4662f)
                curveTo(16.3975f, 9.7119f, 16.1138f, 9.8695f, 15.889f, 9.959f)
                curveTo(15.6784f, 10.0428f, 15.5925f, 10.0358f, 15.5381f, 10.0214f)
                curveTo(15.4837f, 10.007f, 15.4058f, 9.9707f, 15.2658f, 9.7942f)
                curveTo(15.1165f, 9.6058f, 14.9506f, 9.3293f, 14.6952f, 8.9001f)
                lineTo(13.5162f, 6.9188f)
                curveTo(13.2539f, 6.478f, 13.0851f, 6.1921f, 12.989f, 5.9655f)
                curveTo(12.8987f, 5.7528f, 12.9059f, 5.6664f, 12.9206f, 5.612f)
                curveTo(12.9354f, 5.5577f, 12.9729f, 5.4793f, 13.1589f, 5.3396f)
                curveTo(13.3569f, 5.1908f, 13.6479f, 5.0265f, 14.0984f, 4.7742f)
                lineTo(17.976f, 2.6021f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.6268f, 10.196f)
                lineTo(3.2319f, 12.0976f)
                curveTo(2.7684f, 12.3573f, 2.4671f, 12.5273f, 2.2615f, 12.6813f)
                curveTo(2.0674f, 12.8266f, 2.0259f, 12.9095f, 2.0096f, 12.9683f)
                curveTo(1.9936f, 13.0262f, 1.9867f, 13.1162f, 2.079f, 13.3342f)
                curveTo(2.1773f, 13.5662f, 2.3501f, 13.8587f, 2.6179f, 14.3088f)
                curveTo(2.8856f, 14.7587f, 3.0605f, 15.0503f, 3.2187f, 15.2492f)
                curveTo(3.367f, 15.4357f, 3.4536f, 15.4787f, 3.5203f, 15.4961f)
                curveTo(3.5879f, 15.5136f, 3.6871f, 15.5182f, 3.9136f, 15.4279f)
                curveTo(4.1541f, 15.332f, 4.4567f, 15.1637f, 4.9201f, 14.9041f)
                lineTo(8.2972f, 13.0124f)
                curveTo(8.1394f, 12.7877f, 7.9759f, 12.5128f, 7.7925f, 12.2046f)
                lineTo(7.1303f, 11.0918f)
                curveTo(6.9303f, 10.7558f, 6.7536f, 10.4589f, 6.6268f, 10.196f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6378f, 8.4507f)
                lineTo(12.087f, 6.5185f)
                curveTo(12.2139f, 6.7816f, 12.3907f, 7.0788f, 12.5908f, 7.415f)
                lineTo(13.8049f, 9.4553f)
                curveTo(13.9881f, 9.7632f, 14.1516f, 10.038f, 14.3093f, 10.2626f)
                lineTo(12.7624f, 11.1291f)
                lineTo(16.9384f, 20.9181f)
                curveTo(17.1076f, 21.3147f, 16.919f, 21.7716f, 16.5171f, 21.9386f)
                curveTo(16.1153f, 22.1056f, 15.6524f, 21.9195f, 15.4832f, 21.5228f)
                lineTo(12.0002f, 13.3584f)
                lineTo(8.5173f, 21.5228f)
                curveTo(8.3481f, 21.9195f, 7.8852f, 22.1056f, 7.4833f, 21.9386f)
                curveTo(7.0815f, 21.7716f, 6.8929f, 21.3147f, 7.0621f, 20.9181f)
                lineTo(10.7594f, 12.251f)
                curveTo(10.357f, 12.4763f, 10.0901f, 12.6229f, 9.8765f, 12.7079f)
                curveTo(9.6659f, 12.7918f, 9.58f, 12.7848f, 9.5256f, 12.7704f)
                curveTo(9.4712f, 12.756f, 9.3932f, 12.7197f, 9.2533f, 12.5432f)
                curveTo(9.104f, 12.3548f, 8.9381f, 12.0782f, 8.6827f, 11.649f)
                lineTo(8.0557f, 10.5953f)
                curveTo(7.7933f, 10.1544f, 7.6245f, 9.8686f, 7.5284f, 9.642f)
                curveTo(7.4381f, 9.4293f, 7.4453f, 9.3429f, 7.46f, 9.2885f)
                curveTo(7.4748f, 9.2341f, 7.5124f, 9.1558f, 7.6983f, 9.0161f)
                curveTo(7.8963f, 8.8673f, 8.1873f, 8.703f, 8.6378f, 8.4507f)
                close()
            }
        }
            .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
