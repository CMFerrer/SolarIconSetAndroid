package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

public val WeatherGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.7061f, 7.747f)
                curveTo(20.8458f, 8.137f, 20.6429f, 8.5663f, 20.253f, 8.706f)
                lineTo(20.0f, 8.0f)
                curveTo(20.253f, 8.706f, 20.253f, 8.706f, 20.253f, 8.706f)
                lineTo(20.2507f, 8.7069f)
                lineTo(20.2475f, 8.708f)
                lineTo(20.2379f, 8.7114f)
                lineTo(20.2064f, 8.7221f)
                curveTo(20.1799f, 8.731f, 20.1425f, 8.7433f, 20.0942f, 8.7585f)
                curveTo(19.9975f, 8.7888f, 19.8573f, 8.8308f, 19.6736f, 8.8803f)
                curveTo(19.3063f, 8.9795f, 18.7653f, 9.1092f, 18.0522f, 9.238f)
                curveTo(16.626f, 9.4958f, 14.5124f, 9.75f, 11.7241f, 9.75f)
                curveTo(8.9361f, 9.75f, 6.9554f, 9.4958f, 5.6577f, 9.2353f)
                curveTo(5.0089f, 9.1051f, 4.5311f, 8.9733f, 4.2089f, 8.8712f)
                curveTo(4.0478f, 8.8201f, 3.9256f, 8.7764f, 3.8405f, 8.744f)
                curveTo(3.7979f, 8.7279f, 3.7646f, 8.7145f, 3.7403f, 8.7045f)
                lineTo(3.7106f, 8.692f)
                lineTo(3.7007f, 8.6877f)
                lineTo(3.697f, 8.6861f)
                lineTo(3.6955f, 8.6854f)
                curveTo(3.6955f, 8.6854f, 3.6942f, 8.6848f, 4.0f, 8.0f)
                lineTo(3.6942f, 8.6848f)
                curveTo(3.316f, 8.5159f, 3.1463f, 8.0724f, 3.3152f, 7.6942f)
                curveTo(3.4836f, 7.317f, 3.9251f, 7.1473f, 4.3026f, 7.3137f)
                moveTo(4.3026f, 7.3137f)
                lineTo(4.3127f, 7.318f)
                curveTo(4.3239f, 7.3226f, 4.344f, 7.3307f, 4.3734f, 7.3419f)
                curveTo(4.4321f, 7.3642f, 4.5278f, 7.3987f, 4.6623f, 7.4413f)
                curveTo(4.9314f, 7.5266f, 5.3562f, 7.6449f, 5.9529f, 7.7647f)
                curveTo(7.1461f, 8.0042f, 9.0274f, 8.25f, 11.7241f, 8.25f)
                curveTo(14.4207f, 8.25f, 16.445f, 8.0042f, 17.7855f, 7.762f)
                curveTo(18.4558f, 7.6408f, 18.9554f, 7.5205f, 19.2828f, 7.4322f)
                curveTo(19.4465f, 7.388f, 19.5671f, 7.3518f, 19.6446f, 7.3274f)
                curveTo(19.6833f, 7.3153f, 19.7112f, 7.3061f, 19.7283f, 7.3003f)
                lineTo(19.747f, 7.294f)
                lineTo(19.9812f, 7.9476f)
                curveTo(19.747f, 7.2939f, 19.747f, 7.294f, 19.747f, 7.294f)
                curveTo(20.1369f, 7.1545f, 20.5664f, 7.3572f, 20.7061f, 7.747f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.2731f, 13.3015f)
                curveTo(7.8891f, 13.1513f, 7.4556f, 13.3393f, 7.3031f, 13.7229f)
                curveTo(7.15f, 14.1078f, 7.338f, 14.5439f, 7.7229f, 14.6969f)
                lineTo(8.0f, 14.0f)
                curveTo(7.7229f, 14.6969f, 7.7229f, 14.6969f, 7.7229f, 14.6969f)
                lineTo(7.724f, 14.6974f)
                lineTo(7.7252f, 14.6978f)
                lineTo(7.7279f, 14.6989f)
                lineTo(7.7348f, 14.7016f)
                lineTo(7.7541f, 14.7089f)
                curveTo(7.7695f, 14.7146f, 7.79f, 14.7219f, 7.8154f, 14.7307f)
                curveTo(7.8664f, 14.7482f, 7.9376f, 14.7714f, 8.0294f, 14.7981f)
                curveTo(8.2131f, 14.8517f, 8.4793f, 14.9198f, 8.8315f, 14.9868f)
                curveTo(9.536f, 15.1208f, 10.583f, 15.25f, 12.0f, 15.25f)
                curveTo(13.417f, 15.25f, 14.464f, 15.1208f, 15.1685f, 14.9868f)
                curveTo(15.5207f, 14.9198f, 15.7869f, 14.8517f, 15.9706f, 14.7981f)
                curveTo(16.0624f, 14.7714f, 16.1336f, 14.7482f, 16.1846f, 14.7307f)
                curveTo(16.21f, 14.7219f, 16.2305f, 14.7146f, 16.2459f, 14.7089f)
                lineTo(16.2652f, 14.7016f)
                lineTo(16.2721f, 14.6989f)
                lineTo(16.2748f, 14.6978f)
                lineTo(16.276f, 14.6974f)
                curveTo(16.276f, 14.6974f, 16.2771f, 14.6969f, 16.0f, 14.0f)
                lineTo(16.2771f, 14.6969f)
                curveTo(16.662f, 14.5439f, 16.85f, 14.1078f, 16.6969f, 13.7229f)
                curveTo(16.5444f, 13.3393f, 16.1109f, 13.1513f, 15.7269f, 13.3015f)
                lineTo(15.7247f, 13.3023f)
                moveTo(15.7247f, 13.3023f)
                curveTo(15.7204f, 13.304f, 15.7109f, 13.3074f, 15.6966f, 13.3123f)
                curveTo(15.6681f, 13.3221f, 15.6196f, 13.338f, 15.5507f, 13.3581f)
                curveTo(15.4129f, 13.3983f, 15.1933f, 13.4552f, 14.8883f, 13.5132f)
                curveTo(14.2784f, 13.6292f, 13.3253f, 13.75f, 12.0f, 13.75f)
                curveTo(10.6747f, 13.75f, 9.7216f, 13.6292f, 9.1117f, 13.5132f)
                curveTo(8.8067f, 13.4552f, 8.5871f, 13.3983f, 8.4493f, 13.3581f)
                curveTo(8.3804f, 13.338f, 8.3319f, 13.3221f, 8.3034f, 13.3123f)
                curveTo(8.2891f, 13.3074f, 8.2798f, 13.304f, 8.2754f, 13.3024f)
                moveTo(15.7234f, 13.3029f)
                lineTo(15.7247f, 13.3023f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.2406f, 19.2659f)
                curveTo(15.3068f, 19.6748f, 15.029f, 20.0599f, 14.6201f, 20.1261f)
                curveTo(14.1456f, 20.2029f, 13.613f, 20.25f, 13.0002f, 20.25f)
                curveTo(12.5141f, 20.25f, 12.0715f, 20.2348f, 11.6713f, 20.2094f)
                curveTo(11.2579f, 20.1832f, 10.944f, 19.8268f, 10.9703f, 19.4134f)
                curveTo(10.9965f, 19.0001f, 11.3529f, 18.6862f, 11.7662f, 18.7125f)
                curveTo(12.1345f, 18.7358f, 12.5454f, 18.75f, 13.0002f, 18.75f)
                curveTo(13.5346f, 18.75f, 13.9869f, 18.7091f, 14.3804f, 18.6454f)
                curveTo(14.7893f, 18.5792f, 15.1744f, 18.857f, 15.2406f, 19.2659f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                curveTo(6.6332f, 10.567f, 6.6061f, 10.5489f, 6.5911f, 10.5381f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.25f, 22.0f)
                curveTo(12.25f, 21.5858f, 12.5858f, 21.25f, 13.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(12.5858f, 22.75f, 12.25f, 22.4142f, 12.25f, 22.0f)
                close()
                moveTo(13.0f, 22.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 22.75f, 14.25f, 22.4142f, 14.25f, 22.0f)
                curveTo(14.25f, 21.5858f, 13.9142f, 21.25f, 13.5f, 21.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.75f)
                close()
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
