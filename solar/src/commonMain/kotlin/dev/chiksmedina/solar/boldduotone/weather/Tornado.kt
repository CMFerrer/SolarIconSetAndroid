package dev.chiksmedina.solar.boldduotone.weather

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
import dev.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(
            name = "Tornado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.3127f, 4.5f)
                curveTo(4.68f, 4.3878f, 5.165f, 4.2782f, 5.7593f, 4.1791f)
                curveTo(7.3361f, 3.9163f, 9.5429f, 3.75f, 12.0f, 3.75f)
                curveTo(12.4142f, 3.75f, 12.75f, 3.4142f, 12.75f, 3.0f)
                curveTo(12.75f, 2.5858f, 12.4142f, 2.25f, 12.0f, 2.25f)
                curveTo(9.4866f, 2.25f, 7.1933f, 2.4194f, 5.5127f, 2.6995f)
                curveTo(4.6785f, 2.8386f, 3.9597f, 3.0106f, 3.4323f, 3.2183f)
                curveTo(3.1724f, 3.3208f, 2.9148f, 3.4487f, 2.7092f, 3.6162f)
                curveTo(2.5129f, 3.7761f, 2.25f, 4.0689f, 2.25f, 4.5f)
                curveTo(2.25f, 4.9311f, 2.5129f, 5.2239f, 2.7092f, 5.3838f)
                curveTo(2.9148f, 5.5513f, 3.1724f, 5.6792f, 3.4323f, 5.7817f)
                curveTo(3.9597f, 5.9894f, 4.6785f, 6.1614f, 5.5127f, 6.3005f)
                curveTo(7.1933f, 6.5806f, 9.4866f, 6.75f, 12.0f, 6.75f)
                curveTo(14.5135f, 6.75f, 16.8067f, 6.5806f, 18.4873f, 6.3005f)
                curveTo(19.3215f, 6.1614f, 20.0403f, 5.9894f, 20.5677f, 5.7817f)
                curveTo(20.8276f, 5.6792f, 21.0852f, 5.5513f, 21.2908f, 5.3838f)
                curveTo(21.4871f, 5.2239f, 21.75f, 4.9311f, 21.75f, 4.5f)
                curveTo(21.75f, 3.9646f, 21.3529f, 3.643f, 21.1206f, 3.4932f)
                curveTo(20.8491f, 3.3181f, 20.4993f, 3.1796f, 20.1234f, 3.0649f)
                curveTo(19.361f, 2.8321f, 18.3088f, 2.6439f, 17.0832f, 2.5072f)
                curveTo(16.6715f, 2.4613f, 16.3006f, 2.7578f, 16.2546f, 3.1694f)
                curveTo(16.2087f, 3.5811f, 16.5052f, 3.952f, 16.9168f, 3.998f)
                curveTo(18.1032f, 4.1303f, 19.051f, 4.3058f, 19.6855f, 4.4995f)
                lineTo(19.6872f, 4.5f)
                curveTo(19.32f, 4.6122f, 18.8349f, 4.7218f, 18.2407f, 4.8209f)
                curveTo(16.6639f, 5.0837f, 14.4571f, 5.25f, 12.0f, 5.25f)
                curveTo(9.5429f, 5.25f, 7.3361f, 5.0837f, 5.7593f, 4.8209f)
                curveTo(5.165f, 4.7218f, 4.68f, 4.6122f, 4.3127f, 4.5f)
                close()
                moveTo(20.3582f, 4.7915f)
                curveTo(20.3582f, 4.7915f, 20.3527f, 4.7878f, 20.3454f, 4.78f)
                curveTo(20.3551f, 4.7876f, 20.3582f, 4.7915f, 20.3582f, 4.7915f)
                close()
                moveTo(6.5911f, 10.5381f)
                curveTo(6.3737f, 10.2593f, 5.9822f, 10.1655f, 5.6565f, 10.3333f)
                curveTo(5.2883f, 10.523f, 5.1436f, 10.9753f, 5.3333f, 11.3435f)
                lineTo(6.0f, 11.0f)
                curveTo(5.3333f, 11.3435f, 5.3342f, 11.3454f, 5.3342f, 11.3454f)
                lineTo(5.3352f, 11.3472f)
                lineTo(5.3372f, 11.3509f)
                lineTo(5.3412f, 11.3584f)
                lineTo(5.3497f, 11.3738f)
                curveTo(5.3556f, 11.3841f, 5.362f, 11.3946f, 5.3688f, 11.4054f)
                curveTo(5.3824f, 11.427f, 5.3978f, 11.4493f, 5.4152f, 11.4721f)
                curveTo(5.4499f, 11.5179f, 5.4921f, 11.5655f, 5.5429f, 11.614f)
                curveTo(5.6445f, 11.7108f, 5.78f, 11.8105f, 5.9607f, 11.9087f)
                curveTo(6.3183f, 12.1028f, 6.8755f, 12.3029f, 7.7612f, 12.4595f)
                curveTo(8.1691f, 12.5317f, 8.5582f, 12.2595f, 8.6303f, 11.8516f)
                curveTo(8.7025f, 11.4437f, 8.4303f, 11.0546f, 8.0224f, 10.9825f)
                curveTo(7.2354f, 10.8432f, 6.8467f, 10.6828f, 6.6765f, 10.5904f)
                curveTo(6.6333f, 10.567f, 6.6061f, 10.5489f, 6.5911f, 10.5381f)
                close()
                moveTo(18.3435f, 10.3333f)
                curveTo(18.7117f, 10.523f, 18.8564f, 10.9753f, 18.6667f, 11.3435f)
                lineTo(18.0f, 11.0f)
                curveTo(18.6667f, 11.3435f, 18.6652f, 11.3463f, 18.6652f, 11.3463f)
                lineTo(18.6638f, 11.3492f)
                lineTo(18.6607f, 11.3549f)
                lineTo(18.6543f, 11.3666f)
                curveTo(18.6499f, 11.3744f, 18.6453f, 11.3824f, 18.6404f, 11.3905f)
                curveTo(18.6306f, 11.4067f, 18.6198f, 11.4234f, 18.6079f, 11.4405f)
                curveTo(18.5839f, 11.4748f, 18.5558f, 11.5104f, 18.5227f, 11.5468f)
                curveTo(18.4565f, 11.6198f, 18.3717f, 11.6952f, 18.2637f, 11.7708f)
                curveTo(18.0495f, 11.9206f, 17.7376f, 12.0755f, 17.2769f, 12.217f)
                curveTo(16.3613f, 12.498f, 14.7774f, 12.75f, 12.0f, 12.75f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                curveTo(14.7073f, 11.25f, 16.1235f, 11.002f, 16.8367f, 10.783f)
                curveTo(17.1904f, 10.6745f, 17.3501f, 10.5794f, 17.4039f, 10.5417f)
                curveTo(17.4057f, 10.5404f, 17.4089f, 10.5381f, 17.4089f, 10.5381f)
                curveTo(17.6263f, 10.2593f, 18.0178f, 10.1655f, 18.3435f, 10.3333f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.7097f, 16.2575f)
                curveTo(16.8436f, 16.6495f, 16.6344f, 17.0758f, 16.2425f, 17.2097f)
                curveTo(15.4416f, 17.4833f, 14.4567f, 17.75f, 13.0f, 17.75f)
                curveTo(11.6032f, 17.75f, 10.566f, 17.6245f, 9.8619f, 17.4925f)
                curveTo(9.4548f, 17.4163f, 9.1866f, 17.0244f, 9.2628f, 16.6173f)
                curveTo(9.3391f, 16.2101f, 9.731f, 15.9419f, 10.1381f, 16.0182f)
                curveTo(10.7489f, 16.1326f, 11.6936f, 16.25f, 13.0f, 16.25f)
                curveTo(14.2465f, 16.25f, 15.0634f, 16.0274f, 15.7575f, 15.7903f)
                curveTo(16.1495f, 15.6564f, 16.5758f, 15.8656f, 16.7097f, 16.2575f)
                close()
                moveTo(12.25f, 22.0f)
                curveTo(12.25f, 21.5858f, 12.5858f, 21.25f, 13.0f, 21.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 21.25f, 14.25f, 21.5858f, 14.25f, 22.0f)
                curveTo(14.25f, 22.4142f, 13.9142f, 22.75f, 13.5f, 22.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 22.75f, 12.25f, 22.4142f, 12.25f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.2406f, 19.266f)
                curveTo(15.3068f, 19.6749f, 15.029f, 20.06f, 14.6201f, 20.1262f)
                curveTo(14.1456f, 20.203f, 13.6131f, 20.2502f, 13.0003f, 20.2502f)
                curveTo(12.5141f, 20.2502f, 12.0715f, 20.235f, 11.6713f, 20.2096f)
                curveTo(11.2579f, 20.1833f, 10.944f, 19.8269f, 10.9703f, 19.4136f)
                curveTo(10.9965f, 19.0002f, 11.3529f, 18.6863f, 11.7663f, 18.7126f)
                curveTo(12.1345f, 18.7359f, 12.5454f, 18.7502f, 13.0003f, 18.7502f)
                curveTo(13.5346f, 18.7502f, 13.987f, 18.7092f, 14.3804f, 18.6455f)
                curveTo(14.7893f, 18.5793f, 15.1744f, 18.8571f, 15.2406f, 19.266f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.3033f, 13.7231f)
                curveTo(7.4558f, 13.3395f, 7.8893f, 13.1515f, 8.2733f, 13.3017f)
                lineTo(8.2756f, 13.3026f)
                curveTo(8.28f, 13.3042f, 8.2893f, 13.3076f, 8.3036f, 13.3125f)
                curveTo(8.3321f, 13.3223f, 8.3806f, 13.3382f, 8.4495f, 13.3583f)
                curveTo(8.5873f, 13.3985f, 8.8069f, 13.4554f, 9.1119f, 13.5134f)
                curveTo(9.7218f, 13.6294f, 10.6749f, 13.7502f, 12.0002f, 13.7502f)
                curveTo(13.3255f, 13.7502f, 14.2786f, 13.6294f, 14.8885f, 13.5134f)
                curveTo(15.1935f, 13.4554f, 15.4131f, 13.3985f, 15.5509f, 13.3583f)
                curveTo(15.6198f, 13.3382f, 15.6683f, 13.3223f, 15.6968f, 13.3125f)
                curveTo(15.7111f, 13.3076f, 15.7204f, 13.3042f, 15.7248f, 13.3026f)
                lineTo(15.7262f, 13.302f)
                curveTo(16.1104f, 13.1512f, 16.5445f, 13.3392f, 16.6971f, 13.7231f)
                curveTo(16.8502f, 14.108f, 16.6622f, 14.5441f, 16.2773f, 14.6971f)
                lineTo(16.0002f, 14.0002f)
                curveTo(16.2773f, 14.6971f, 16.2762f, 14.6976f, 16.2762f, 14.6976f)
                lineTo(16.275f, 14.698f)
                lineTo(16.2723f, 14.6991f)
                lineTo(16.2654f, 14.7018f)
                lineTo(16.2461f, 14.7091f)
                curveTo(16.2307f, 14.7148f, 16.2102f, 14.7221f, 16.1848f, 14.7309f)
                curveTo(16.1338f, 14.7484f, 16.0626f, 14.7716f, 15.9708f, 14.7983f)
                curveTo(15.7871f, 14.8519f, 15.5209f, 14.92f, 15.1687f, 14.987f)
                curveTo(14.4642f, 15.121f, 13.4172f, 15.2502f, 12.0002f, 15.2502f)
                curveTo(10.5832f, 15.2502f, 9.5362f, 15.121f, 8.8317f, 14.987f)
                curveTo(8.4795f, 14.92f, 8.2133f, 14.8519f, 8.0296f, 14.7983f)
                curveTo(7.9378f, 14.7716f, 7.8666f, 14.7484f, 7.8156f, 14.7309f)
                curveTo(7.7902f, 14.7221f, 7.7698f, 14.7148f, 7.7543f, 14.7091f)
                lineTo(7.735f, 14.7018f)
                lineTo(7.7281f, 14.6991f)
                lineTo(7.7254f, 14.698f)
                lineTo(7.7242f, 14.6976f)
                lineTo(7.7231f, 14.6971f)
                curveTo(7.3382f, 14.5441f, 7.1502f, 14.108f, 7.3033f, 13.7231f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.7062f, 7.7472f)
                curveTo(20.8459f, 8.1372f, 20.6431f, 8.5665f, 20.2532f, 8.7062f)
                lineTo(20.2509f, 8.707f)
                lineTo(20.2477f, 8.7082f)
                lineTo(20.2381f, 8.7115f)
                lineTo(20.2065f, 8.7223f)
                curveTo(20.1801f, 8.7312f, 20.1427f, 8.7435f, 20.0943f, 8.7587f)
                curveTo(19.9977f, 8.789f, 19.8575f, 8.831f, 19.6738f, 8.8805f)
                curveTo(19.3064f, 8.9797f, 18.7655f, 9.1094f, 18.0524f, 9.2382f)
                curveTo(16.6261f, 9.496f, 14.5125f, 9.7502f, 11.7243f, 9.7502f)
                curveTo(8.9363f, 9.7502f, 6.9556f, 9.496f, 5.6579f, 9.2355f)
                curveTo(5.0091f, 9.1053f, 4.5313f, 8.9735f, 4.2091f, 8.8714f)
                curveTo(4.048f, 8.8203f, 3.9258f, 8.7766f, 3.8407f, 8.7442f)
                curveTo(3.7981f, 8.7281f, 3.7648f, 8.7147f, 3.7405f, 8.7047f)
                lineTo(3.7108f, 8.6922f)
                lineTo(3.7009f, 8.6879f)
                lineTo(3.6972f, 8.6863f)
                lineTo(3.6957f, 8.6856f)
                curveTo(3.6957f, 8.6856f, 3.6944f, 8.685f, 4.0002f, 8.0002f)
                lineTo(3.6944f, 8.685f)
                curveTo(3.3162f, 8.5161f, 3.1465f, 8.0726f, 3.3154f, 7.6944f)
                curveTo(3.4838f, 7.3172f, 3.9253f, 7.1474f, 4.3028f, 7.3139f)
                lineTo(4.3129f, 7.3182f)
                curveTo(4.3241f, 7.3228f, 4.3442f, 7.3309f, 4.3736f, 7.3421f)
                curveTo(4.4323f, 7.3644f, 4.5279f, 7.3989f, 4.6625f, 7.4415f)
                curveTo(4.9316f, 7.5268f, 5.3564f, 7.6451f, 5.9531f, 7.7649f)
                curveTo(7.1462f, 8.0044f, 9.0276f, 8.2502f, 11.7243f, 8.2502f)
                curveTo(14.4209f, 8.2502f, 16.4452f, 8.0044f, 17.7857f, 7.7621f)
                curveTo(18.456f, 7.641f, 18.9556f, 7.5207f, 19.283f, 7.4323f)
                curveTo(19.4466f, 7.3882f, 19.5673f, 7.352f, 19.6447f, 7.3276f)
                curveTo(19.6835f, 7.3155f, 19.7114f, 7.3063f, 19.7285f, 7.3005f)
                lineTo(19.7472f, 7.2941f)
                curveTo(20.1371f, 7.1547f, 20.5666f, 7.3574f, 20.7062f, 7.7472f)
                close()
            }
        }
            .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
