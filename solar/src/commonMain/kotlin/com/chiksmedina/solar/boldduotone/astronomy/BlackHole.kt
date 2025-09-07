package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.BlackHole: ImageVector
    get() {
        if (_blackHole != null) {
            return _blackHole!!
        }
        _blackHole = Builder(
            name = "BlackHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.7349f, 14.6536f)
                curveTo(12.4655f, 14.6313f, 12.2173f, 14.4637f, 12.105f, 14.1973f)
                curveTo(11.944f, 13.8156f, 12.123f, 13.3758f, 12.5047f, 13.2148f)
                curveTo(12.7291f, 13.1202f, 12.9461f, 12.9775f, 13.15f, 12.7735f)
                curveTo(13.4222f, 12.5014f, 13.8515f, 12.4821f, 14.1459f, 12.7157f)
                curveTo(14.2078f, 12.7171f, 14.2706f, 12.7263f, 14.333f, 12.7439f)
                curveTo(14.7316f, 12.8565f, 14.9635f, 13.2709f, 14.851f, 13.6695f)
                curveTo(14.6401f, 14.4163f, 14.2512f, 15.1473f, 13.7461f, 15.817f)
                curveTo(13.4967f, 16.1477f, 13.0264f, 16.2136f, 12.6957f, 15.9642f)
                curveTo(12.365f, 15.7148f, 12.2991f, 15.2445f, 12.5485f, 14.9138f)
                curveTo(12.6137f, 14.8274f, 12.6759f, 14.7406f, 12.7349f, 14.6536f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.4866f, 14.6947f)
                curveTo(10.8852f, 14.8073f, 11.2996f, 14.5754f, 11.4122f, 14.1768f)
                curveTo(11.4299f, 14.1139f, 11.4391f, 14.0507f, 11.4404f, 13.9883f)
                curveTo(11.673f, 13.694f, 11.6534f, 13.2655f, 11.3816f, 12.9938f)
                curveTo(11.1776f, 12.7898f, 11.0349f, 12.5728f, 10.9403f, 12.3484f)
                curveTo(10.7794f, 11.9667f, 10.3395f, 11.7878f, 9.9578f, 11.9487f)
                curveTo(9.6916f, 12.0609f, 9.5241f, 12.3088f, 9.5016f, 12.5781f)
                curveTo(9.4149f, 12.5192f, 9.3284f, 12.4573f, 9.2423f, 12.3923f)
                curveTo(8.9116f, 12.1429f, 8.4413f, 12.2088f, 8.1919f, 12.5395f)
                curveTo(7.9425f, 12.8702f, 8.0084f, 13.3405f, 8.3391f, 13.5899f)
                curveTo(9.0088f, 14.095f, 9.7398f, 14.4838f, 10.4866f, 14.6947f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.676f, 11.9462f)
                curveTo(6.9315f, 12.2722f, 7.403f, 12.3292f, 7.7289f, 12.0737f)
                curveTo(8.0549f, 11.8181f, 8.112f, 11.3467f, 7.8564f, 11.0207f)
                curveTo(7.4558f, 10.5098f, 7.1105f, 9.9424f, 6.847f, 9.3436f)
                curveTo(6.6801f, 8.9645f, 6.2374f, 8.7925f, 5.8583f, 8.9594f)
                curveTo(5.4792f, 9.1263f, 5.3072f, 9.5689f, 5.4741f, 9.948f)
                curveTo(5.7908f, 10.6673f, 6.2022f, 11.3419f, 6.676f, 11.9462f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.8399f, 7.6716f)
                curveTo(4.8889f, 8.0829f, 5.2621f, 8.3766f, 5.6734f, 8.3276f)
                curveTo(6.0847f, 8.2786f, 6.3783f, 7.9054f, 6.3293f, 7.4941f)
                curveTo(6.2549f, 6.8693f, 6.2845f, 6.2425f, 6.4381f, 5.6321f)
                curveTo(6.5393f, 5.2305f, 6.2957f, 4.8228f, 5.894f, 4.7217f)
                curveTo(5.4923f, 4.6205f, 5.0847f, 4.8642f, 4.9836f, 5.2658f)
                curveTo(4.781f, 6.0701f, 4.7458f, 6.8825f, 4.8399f, 7.6716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0079f, 3.0793f)
                curveTo(5.7661f, 3.4156f, 5.8428f, 3.8842f, 6.1791f, 4.126f)
                curveTo(6.5155f, 4.3678f, 6.9841f, 4.2911f, 7.2259f, 3.9548f)
                curveTo(7.4029f, 3.7086f, 7.6088f, 3.4655f, 7.8467f, 3.2276f)
                curveTo(8.1396f, 2.9347f, 8.1396f, 2.4598f, 7.8467f, 2.1669f)
                curveTo(7.5538f, 1.874f, 7.079f, 1.874f, 6.7861f, 2.1669f)
                curveTo(6.4928f, 2.4602f, 6.2339f, 2.7649f, 6.0079f, 3.0793f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.7628f, 9.086f)
                curveTo(11.6976f, 9.1725f, 11.6355f, 9.2593f, 11.5764f, 9.3463f)
                curveTo(11.8459f, 9.3685f, 12.0941f, 9.5362f, 12.2064f, 9.8026f)
                curveTo(12.3673f, 10.1842f, 12.1884f, 10.6241f, 11.8067f, 10.785f)
                curveTo(11.5823f, 10.8796f, 11.3653f, 11.0224f, 11.1613f, 11.2263f)
                curveTo(10.8892f, 11.4985f, 10.4599f, 11.5177f, 10.1655f, 11.2841f)
                curveTo(10.1036f, 11.2827f, 10.0408f, 11.2735f, 9.9784f, 11.2559f)
                curveTo(9.5797f, 11.1433f, 9.3478f, 10.7289f, 9.4604f, 10.3303f)
                curveTo(9.6713f, 9.5836f, 10.0602f, 8.8526f, 10.5652f, 8.1828f)
                curveTo(10.8147f, 7.8521f, 11.2849f, 7.7862f, 11.6156f, 8.0356f)
                curveTo(11.9464f, 8.2851f, 12.0123f, 8.7553f, 11.7628f, 9.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.8248f, 9.3051f)
                curveTo(13.4262f, 9.1926f, 13.0118f, 9.4245f, 12.8992f, 9.8231f)
                curveTo(12.8815f, 9.8859f, 12.8723f, 9.9491f, 12.871f, 10.0115f)
                curveTo(12.6384f, 10.3059f, 12.658f, 10.7343f, 12.9298f, 11.0061f)
                curveTo(13.1338f, 11.21f, 13.2765f, 11.427f, 13.3711f, 11.6514f)
                curveTo(13.532f, 12.0331f, 13.9719f, 12.2121f, 14.3535f, 12.0512f)
                curveTo(14.6197f, 11.9389f, 14.7873f, 11.691f, 14.8098f, 11.4218f)
                curveTo(14.8964f, 11.4807f, 14.9829f, 11.5426f, 15.0691f, 11.6076f)
                curveTo(15.3998f, 11.857f, 15.8701f, 11.7911f, 16.1195f, 11.4604f)
                curveTo(16.3689f, 11.1297f, 16.303f, 10.6594f, 15.9723f, 10.41f)
                curveTo(15.3026f, 9.9049f, 14.5716f, 9.516f, 13.8248f, 9.3051f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6354f, 12.0537f)
                curveTo(17.3798f, 11.7277f, 16.9084f, 11.6706f, 16.5824f, 11.9262f)
                curveTo(16.2565f, 12.1818f, 16.1994f, 12.6532f, 16.455f, 12.9792f)
                curveTo(16.8555f, 13.4901f, 17.2008f, 14.0575f, 17.4644f, 14.6562f)
                curveTo(17.6313f, 15.0353f, 18.0739f, 15.2074f, 18.453f, 15.0405f)
                curveTo(18.8321f, 14.8736f, 19.0042f, 14.431f, 18.8373f, 14.0519f)
                curveTo(18.5206f, 13.3325f, 18.1092f, 12.6579f, 17.6354f, 12.0537f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.4715f, 16.3282f)
                curveTo(19.4225f, 15.9169f, 19.0493f, 15.6232f, 18.638f, 15.6723f)
                curveTo(18.2267f, 15.7213f, 17.933f, 16.0944f, 17.982f, 16.5057f)
                curveTo(18.0565f, 17.1305f, 18.0269f, 17.7574f, 17.8732f, 18.3677f)
                curveTo(17.7721f, 18.7694f, 18.0157f, 19.177f, 18.4174f, 19.2782f)
                curveTo(18.8191f, 19.3793f, 19.2267f, 19.1357f, 19.3278f, 18.734f)
                curveTo(19.5304f, 17.9297f, 19.5656f, 17.1173f, 19.4715f, 16.3282f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.3035f, 20.9206f)
                curveTo(18.5452f, 20.5843f, 18.4686f, 20.1156f, 18.1322f, 19.8738f)
                curveTo(17.7959f, 19.6321f, 17.3273f, 19.7087f, 17.0855f, 20.0451f)
                curveTo(16.9085f, 20.2913f, 16.7026f, 20.5343f, 16.4646f, 20.7723f)
                curveTo(16.1718f, 21.0652f, 16.1718f, 21.54f, 16.4646f, 21.8329f)
                curveTo(16.7575f, 22.1258f, 17.2324f, 22.1258f, 17.5253f, 21.8329f)
                curveTo(17.8186f, 21.5397f, 18.0775f, 21.2349f, 18.3035f, 20.9206f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0815f, 7.5727f)
                curveTo(11.8259f, 7.2467f, 11.883f, 6.7753f, 12.2089f, 6.5197f)
                curveTo(12.8132f, 6.0459f, 13.4878f, 5.6345f, 14.2071f, 5.3178f)
                curveTo(14.5862f, 5.1509f, 15.0289f, 5.323f, 15.1958f, 5.7021f)
                curveTo(15.3626f, 6.0812f, 15.1906f, 6.5238f, 14.8115f, 6.6907f)
                curveTo(14.2127f, 6.9543f, 13.6453f, 7.2996f, 13.1344f, 7.7002f)
                curveTo(12.8085f, 7.9557f, 12.337f, 7.8987f, 12.0815f, 7.5727f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.8275f, 5.5171f)
                curveTo(15.7785f, 5.1058f, 16.0722f, 4.7326f, 16.4835f, 4.6836f)
                curveTo(17.2726f, 4.5896f, 18.085f, 4.6248f, 18.8893f, 4.8273f)
                curveTo(19.291f, 4.9285f, 19.5346f, 5.3361f, 19.4334f, 5.7378f)
                curveTo(19.3323f, 6.1394f, 18.9247f, 6.383f, 18.523f, 6.2819f)
                curveTo(17.9127f, 6.1282f, 17.2858f, 6.0986f, 16.661f, 6.1731f)
                curveTo(16.2497f, 6.2221f, 15.8765f, 5.9284f, 15.8275f, 5.5171f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0291f, 6.0229f)
                curveTo(20.2709f, 5.6866f, 20.7395f, 5.6099f, 21.0759f, 5.8517f)
                curveTo(21.3902f, 6.0776f, 21.6949f, 6.3366f, 21.9882f, 6.6298f)
                curveTo(22.2811f, 6.9227f, 22.2811f, 7.3976f, 21.9882f, 7.6905f)
                curveTo(21.6953f, 7.9834f, 21.2204f, 7.9834f, 20.9275f, 7.6905f)
                curveTo(20.6896f, 7.4526f, 20.4466f, 7.2466f, 20.2003f, 7.0696f)
                curveTo(19.864f, 6.8279f, 19.7873f, 6.3592f, 20.0291f, 6.0229f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.1025f, 17.4801f)
                curveTo(12.4284f, 17.2246f, 12.4855f, 16.7531f, 12.2299f, 16.4272f)
                curveTo(11.9744f, 16.1012f, 11.5029f, 16.0441f, 11.177f, 16.2997f)
                curveTo(10.666f, 16.7003f, 10.0986f, 17.0456f, 9.4999f, 17.3092f)
                curveTo(9.1208f, 17.476f, 8.9487f, 17.9187f, 9.1156f, 18.2978f)
                curveTo(9.2825f, 18.6769f, 9.7251f, 18.8489f, 10.1042f, 18.682f)
                curveTo(10.8236f, 18.3653f, 11.4982f, 17.9539f, 12.1025f, 17.4801f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.8279f, 19.3162f)
                curveTo(8.2392f, 19.2672f, 8.5329f, 18.8941f, 8.4838f, 18.4827f)
                curveTo(8.4348f, 18.0714f, 8.0617f, 17.7778f, 7.6504f, 17.8268f)
                curveTo(7.0256f, 17.9012f, 6.3987f, 17.8716f, 5.7884f, 17.718f)
                curveTo(5.3867f, 17.6168f, 4.9791f, 17.8604f, 4.8779f, 18.2621f)
                curveTo(4.7768f, 18.6638f, 5.0204f, 19.0714f, 5.4221f, 19.1725f)
                curveTo(6.2264f, 19.3751f, 7.0388f, 19.4103f, 7.8279f, 19.3162f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.2355f, 18.1482f)
                curveTo(3.5719f, 18.39f, 4.0405f, 18.3133f, 4.2823f, 17.977f)
                curveTo(4.524f, 17.6406f, 4.4474f, 17.172f, 4.111f, 16.9302f)
                curveTo(3.8648f, 16.7532f, 3.6218f, 16.5473f, 3.3839f, 16.3094f)
                curveTo(3.091f, 16.0165f, 2.6161f, 16.0165f, 2.3232f, 16.3094f)
                curveTo(2.0303f, 16.6023f, 2.0303f, 17.0771f, 2.3232f, 17.37f)
                curveTo(2.6165f, 17.6633f, 2.9212f, 17.9222f, 3.2355f, 18.1482f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9276f, 12.4529f)
                curveTo(9.3338f, 13.2885f, 9.9443f, 13.9944f, 10.7532f, 14.395f)
                curveTo(9.9602f, 14.5776f, 9.043f, 14.6153f, 8.1052f, 14.4824f)
                curveTo(5.3141f, 14.087f, 2.75f, 12.2842f, 2.75f, 9.0f)
                curveTo(2.75f, 8.5858f, 2.4142f, 8.25f, 2.0f, 8.25f)
                curveTo(1.5858f, 8.25f, 1.25f, 8.5858f, 1.25f, 9.0f)
                curveTo(1.25f, 13.3158f, 4.6859f, 15.513f, 7.8948f, 15.9676f)
                curveTo(9.5072f, 16.196f, 11.1645f, 16.0102f, 12.4529f, 15.3839f)
                curveTo(13.3211f, 14.9619f, 14.0493f, 14.3192f, 14.4405f, 13.4626f)
                curveTo(14.583f, 14.2041f, 14.6034f, 15.041f, 14.4824f, 15.8948f)
                curveTo(14.087f, 18.6858f, 12.2842f, 21.25f, 9.0f, 21.25f)
                curveTo(8.5858f, 21.25f, 8.25f, 21.5858f, 8.25f, 22.0f)
                curveTo(8.25f, 22.4142f, 8.5858f, 22.75f, 9.0f, 22.75f)
                curveTo(13.3158f, 22.75f, 15.513f, 19.3142f, 15.9676f, 16.1052f)
                curveTo(16.196f, 14.4928f, 16.0102f, 12.8355f, 15.3839f, 11.5471f)
                curveTo(15.0377f, 10.835f, 14.5432f, 10.2171f, 13.9039f, 9.802f)
                curveTo(14.5291f, 9.7259f, 15.2064f, 9.7316f, 15.8948f, 9.8291f)
                curveTo(18.6858f, 10.2245f, 21.25f, 12.0274f, 21.25f, 15.3115f)
                curveTo(21.25f, 15.7257f, 21.5858f, 16.0615f, 22.0f, 16.0615f)
                curveTo(22.4142f, 16.0615f, 22.75f, 15.7257f, 22.75f, 15.3115f)
                curveTo(22.75f, 10.9957f, 19.3141f, 8.7985f, 16.1052f, 8.3439f)
                curveTo(14.4928f, 8.1155f, 12.8355f, 8.3013f, 11.5471f, 8.9276f)
                curveTo(10.8555f, 9.2638f, 10.2527f, 9.74f, 9.8384f, 10.3528f)
                curveTo(9.7261f, 9.6583f, 9.7181f, 8.8889f, 9.8291f, 8.1052f)
                curveTo(10.2245f, 5.3141f, 12.0274f, 2.75f, 15.3115f, 2.75f)
                curveTo(15.7257f, 2.75f, 16.0615f, 2.4142f, 16.0615f, 2.0f)
                curveTo(16.0615f, 1.5858f, 15.7257f, 1.25f, 15.3115f, 1.25f)
                curveTo(10.9957f, 1.25f, 8.7985f, 4.6859f, 8.3439f, 7.8948f)
                curveTo(8.1155f, 9.5072f, 8.3013f, 11.1645f, 8.9276f, 12.4529f)
                close()
            }
        }
            .build()
        return _blackHole!!
    }

private var _blackHole: ImageVector? = null
