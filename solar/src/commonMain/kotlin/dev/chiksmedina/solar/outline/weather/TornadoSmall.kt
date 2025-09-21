package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.TornadoSmall: ImageVector
    get() {
        if (_tornadoSmall != null) {
            return _tornadoSmall!!
        }
        _tornadoSmall = Builder(
            name = "TornadoSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.3127f, 6.5f)
                curveTo(4.68f, 6.3878f, 5.165f, 6.2782f, 5.7593f, 6.1791f)
                curveTo(7.3361f, 5.9163f, 9.5429f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                curveTo(12.75f, 4.5858f, 12.4142f, 4.25f, 12.0f, 4.25f)
                curveTo(9.4866f, 4.25f, 7.1933f, 4.4194f, 5.5127f, 4.6995f)
                curveTo(4.6785f, 4.8386f, 3.9597f, 5.0106f, 3.4323f, 5.2183f)
                curveTo(3.1724f, 5.3208f, 2.9148f, 5.4487f, 2.7092f, 5.6162f)
                curveTo(2.5129f, 5.7761f, 2.25f, 6.0689f, 2.25f, 6.5f)
                curveTo(2.25f, 6.9311f, 2.5129f, 7.2239f, 2.7092f, 7.3838f)
                curveTo(2.9148f, 7.5513f, 3.1724f, 7.6792f, 3.4323f, 7.7817f)
                curveTo(3.9597f, 7.9894f, 4.6785f, 8.1614f, 5.5127f, 8.3005f)
                curveTo(7.1933f, 8.5806f, 9.4866f, 8.75f, 12.0f, 8.75f)
                curveTo(14.5135f, 8.75f, 16.8067f, 8.5806f, 18.4873f, 8.3005f)
                curveTo(19.3215f, 8.1614f, 20.0403f, 7.9894f, 20.5677f, 7.7817f)
                curveTo(20.8276f, 7.6792f, 21.0852f, 7.5513f, 21.2908f, 7.3838f)
                curveTo(21.4871f, 7.2239f, 21.75f, 6.9311f, 21.75f, 6.5f)
                curveTo(21.75f, 5.9646f, 21.3529f, 5.643f, 21.1206f, 5.4932f)
                curveTo(20.8491f, 5.3181f, 20.4993f, 5.1796f, 20.1234f, 5.0648f)
                curveTo(19.361f, 4.8321f, 18.3088f, 4.6439f, 17.0832f, 4.5072f)
                curveTo(16.6715f, 4.4613f, 16.3006f, 4.7578f, 16.2546f, 5.1694f)
                curveTo(16.2087f, 5.5811f, 16.5052f, 5.952f, 16.9168f, 5.998f)
                curveTo(18.1032f, 6.1303f, 19.051f, 6.3058f, 19.6855f, 6.4995f)
                lineTo(19.6872f, 6.5f)
                curveTo(19.32f, 6.6122f, 18.8349f, 6.7218f, 18.2407f, 6.8209f)
                curveTo(16.6639f, 7.0837f, 14.4571f, 7.25f, 12.0f, 7.25f)
                curveTo(9.5429f, 7.25f, 7.3361f, 7.0837f, 5.7593f, 6.8209f)
                curveTo(5.165f, 6.7218f, 4.68f, 6.6122f, 4.3127f, 6.5f)
                close()
                moveTo(20.3582f, 6.7915f)
                curveTo(20.3582f, 6.7915f, 20.3527f, 6.7878f, 20.3454f, 6.78f)
                curveTo(20.3551f, 6.7876f, 20.3582f, 6.7915f, 20.3582f, 6.7915f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.7061f, 9.747f)
                curveTo(20.8458f, 10.137f, 20.6429f, 10.5663f, 20.253f, 10.7061f)
                lineTo(20.0f, 10.0f)
                curveTo(20.253f, 10.7061f, 20.253f, 10.7061f, 20.253f, 10.7061f)
                lineTo(20.2507f, 10.7068f)
                lineTo(20.2475f, 10.708f)
                lineTo(20.2379f, 10.7114f)
                lineTo(20.2064f, 10.7221f)
                curveTo(20.1799f, 10.731f, 20.1425f, 10.7433f, 20.0942f, 10.7585f)
                curveTo(19.9975f, 10.7888f, 19.8573f, 10.8308f, 19.6736f, 10.8803f)
                curveTo(19.3063f, 10.9795f, 18.7653f, 11.1092f, 18.0522f, 11.238f)
                curveTo(16.626f, 11.4958f, 14.5124f, 11.75f, 11.7241f, 11.75f)
                curveTo(8.9361f, 11.75f, 6.9554f, 11.4958f, 5.6577f, 11.2353f)
                curveTo(5.0089f, 11.1051f, 4.5311f, 10.9733f, 4.2089f, 10.8712f)
                curveTo(4.0478f, 10.8201f, 3.9256f, 10.7764f, 3.8405f, 10.744f)
                curveTo(3.7979f, 10.7279f, 3.7646f, 10.7145f, 3.7403f, 10.7045f)
                lineTo(3.7106f, 10.692f)
                lineTo(3.7007f, 10.6877f)
                lineTo(3.697f, 10.6861f)
                lineTo(3.6955f, 10.6854f)
                curveTo(3.6955f, 10.6854f, 3.6942f, 10.6848f, 4.0f, 10.0f)
                lineTo(3.6942f, 10.6848f)
                curveTo(3.316f, 10.5159f, 3.1463f, 10.0724f, 3.3152f, 9.6942f)
                curveTo(3.4836f, 9.317f, 3.9251f, 9.1473f, 4.3026f, 9.3138f)
                moveTo(4.3026f, 9.3138f)
                lineTo(4.3127f, 9.318f)
                curveTo(4.3239f, 9.3226f, 4.344f, 9.3307f, 4.3734f, 9.3419f)
                curveTo(4.4321f, 9.3642f, 4.5278f, 9.3987f, 4.6623f, 9.4413f)
                curveTo(4.9314f, 9.5267f, 5.3562f, 9.6449f, 5.9529f, 9.7647f)
                curveTo(7.1461f, 10.0042f, 9.0274f, 10.25f, 11.7241f, 10.25f)
                curveTo(14.4207f, 10.25f, 16.445f, 10.0042f, 17.7855f, 9.7619f)
                curveTo(18.4558f, 9.6408f, 18.9554f, 9.5205f, 19.2828f, 9.4322f)
                curveTo(19.4465f, 9.388f, 19.5671f, 9.3518f, 19.6446f, 9.3274f)
                curveTo(19.6833f, 9.3153f, 19.7112f, 9.3061f, 19.7283f, 9.3003f)
                lineTo(19.747f, 9.294f)
                lineTo(19.9812f, 9.9476f)
                curveTo(19.747f, 9.2939f, 19.747f, 9.294f, 19.747f, 9.294f)
                curveTo(20.1369f, 9.1545f, 20.5664f, 9.3572f, 20.7061f, 9.747f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2731f, 15.3015f)
                curveTo(7.8891f, 15.1513f, 7.4556f, 15.3393f, 7.3031f, 15.7229f)
                curveTo(7.15f, 16.1078f, 7.338f, 16.5439f, 7.7229f, 16.6969f)
                lineTo(8.0f, 16.0f)
                curveTo(7.7229f, 16.6969f, 7.7229f, 16.6969f, 7.7229f, 16.6969f)
                lineTo(7.724f, 16.6974f)
                lineTo(7.7252f, 16.6978f)
                lineTo(7.7279f, 16.6989f)
                lineTo(7.7348f, 16.7016f)
                lineTo(7.7541f, 16.7089f)
                curveTo(7.7695f, 16.7146f, 7.79f, 16.7219f, 7.8154f, 16.7307f)
                curveTo(7.8664f, 16.7482f, 7.9376f, 16.7714f, 8.0294f, 16.7981f)
                curveTo(8.2131f, 16.8517f, 8.4793f, 16.9198f, 8.8315f, 16.9868f)
                curveTo(9.536f, 17.1208f, 10.583f, 17.25f, 12.0f, 17.25f)
                curveTo(13.417f, 17.25f, 14.464f, 17.1208f, 15.1685f, 16.9868f)
                curveTo(15.5207f, 16.9198f, 15.7869f, 16.8517f, 15.9706f, 16.7981f)
                curveTo(16.0624f, 16.7714f, 16.1336f, 16.7482f, 16.1846f, 16.7307f)
                curveTo(16.21f, 16.7219f, 16.2305f, 16.7146f, 16.2459f, 16.7089f)
                lineTo(16.2652f, 16.7016f)
                lineTo(16.2721f, 16.6989f)
                lineTo(16.2748f, 16.6978f)
                lineTo(16.276f, 16.6974f)
                curveTo(16.276f, 16.6974f, 16.2771f, 16.6969f, 16.0f, 16.0f)
                lineTo(16.2771f, 16.6969f)
                curveTo(16.662f, 16.5439f, 16.85f, 16.1078f, 16.6969f, 15.7229f)
                curveTo(16.5444f, 15.3393f, 16.1109f, 15.1513f, 15.7269f, 15.3015f)
                lineTo(15.7247f, 15.3023f)
                moveTo(15.7247f, 15.3023f)
                curveTo(15.7204f, 15.304f, 15.7109f, 15.3074f, 15.6966f, 15.3123f)
                curveTo(15.6681f, 15.3221f, 15.6196f, 15.338f, 15.5507f, 15.3581f)
                curveTo(15.4129f, 15.3983f, 15.1933f, 15.4552f, 14.8883f, 15.5132f)
                curveTo(14.2784f, 15.6292f, 13.3253f, 15.75f, 12.0f, 15.75f)
                curveTo(10.6747f, 15.75f, 9.7216f, 15.6292f, 9.1117f, 15.5132f)
                curveTo(8.8067f, 15.4552f, 8.5871f, 15.3983f, 8.4493f, 15.3581f)
                curveTo(8.3804f, 15.338f, 8.3319f, 15.3221f, 8.3034f, 15.3123f)
                curveTo(8.2891f, 15.3074f, 8.2798f, 15.304f, 8.2754f, 15.3024f)
                moveTo(15.7234f, 15.3029f)
                lineTo(15.7247f, 15.3023f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.7097f, 18.2575f)
                curveTo(16.8436f, 18.6495f, 16.6344f, 19.0758f, 16.2425f, 19.2097f)
                curveTo(15.4416f, 19.4833f, 14.4567f, 19.75f, 13.0f, 19.75f)
                curveTo(11.6032f, 19.75f, 10.566f, 19.6245f, 9.8619f, 19.4925f)
                curveTo(9.4548f, 19.4163f, 9.1866f, 19.0244f, 9.2628f, 18.6173f)
                curveTo(9.3391f, 18.2101f, 9.731f, 17.9419f, 10.1381f, 18.0182f)
                curveTo(10.7489f, 18.1326f, 11.6936f, 18.25f, 13.0f, 18.25f)
                curveTo(14.2465f, 18.25f, 15.0634f, 18.0274f, 15.7575f, 17.7903f)
                curveTo(16.1495f, 17.6564f, 16.5758f, 17.8656f, 16.7097f, 18.2575f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.5911f, 12.5381f)
                curveTo(6.3737f, 12.2593f, 5.9822f, 12.1655f, 5.6565f, 12.3333f)
                curveTo(5.2883f, 12.523f, 5.1436f, 12.9753f, 5.3333f, 13.3435f)
                lineTo(6.0f, 13.0f)
                curveTo(5.3333f, 13.3435f, 5.3342f, 13.3454f, 5.3342f, 13.3454f)
                lineTo(5.3352f, 13.3472f)
                lineTo(5.3372f, 13.3509f)
                lineTo(5.3412f, 13.3584f)
                lineTo(5.3497f, 13.3738f)
                curveTo(5.3556f, 13.3841f, 5.362f, 13.3946f, 5.3688f, 13.4054f)
                curveTo(5.3824f, 13.427f, 5.3978f, 13.4493f, 5.4152f, 13.4721f)
                curveTo(5.4499f, 13.5179f, 5.4921f, 13.5655f, 5.5429f, 13.614f)
                curveTo(5.6445f, 13.7108f, 5.78f, 13.8105f, 5.9607f, 13.9087f)
                curveTo(6.3183f, 14.1028f, 6.8755f, 14.3029f, 7.7612f, 14.4595f)
                curveTo(8.1691f, 14.5317f, 8.5582f, 14.2595f, 8.6303f, 13.8516f)
                curveTo(8.7025f, 13.4437f, 8.4303f, 13.0546f, 8.0224f, 12.9825f)
                curveTo(7.2354f, 12.8432f, 6.8467f, 12.6828f, 6.6765f, 12.5904f)
                curveTo(6.6332f, 12.567f, 6.6061f, 12.5489f, 6.5911f, 12.5381f)
                close()
                moveTo(18.3435f, 12.3333f)
                curveTo(18.7117f, 12.523f, 18.8564f, 12.9753f, 18.6667f, 13.3435f)
                lineTo(18.0f, 13.0f)
                curveTo(18.6667f, 13.3435f, 18.6652f, 13.3463f, 18.6652f, 13.3463f)
                lineTo(18.6638f, 13.3492f)
                lineTo(18.6607f, 13.3549f)
                lineTo(18.6543f, 13.3666f)
                curveTo(18.6499f, 13.3744f, 18.6453f, 13.3824f, 18.6404f, 13.3905f)
                curveTo(18.6306f, 13.4067f, 18.6198f, 13.4234f, 18.6079f, 13.4405f)
                curveTo(18.5839f, 13.4748f, 18.5558f, 13.5104f, 18.5227f, 13.5468f)
                curveTo(18.4565f, 13.6198f, 18.3717f, 13.6952f, 18.2637f, 13.7708f)
                curveTo(18.0495f, 13.9206f, 17.7376f, 14.0755f, 17.2769f, 14.217f)
                curveTo(16.3613f, 14.498f, 14.7774f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                curveTo(11.25f, 13.5858f, 11.5858f, 13.25f, 12.0f, 13.25f)
                curveTo(14.7073f, 13.25f, 16.1235f, 13.002f, 16.8367f, 12.783f)
                curveTo(17.1904f, 12.6745f, 17.3501f, 12.5794f, 17.4039f, 12.5417f)
                curveTo(17.4057f, 12.5404f, 17.4089f, 12.5381f, 17.4089f, 12.5381f)
                curveTo(17.6263f, 12.2593f, 18.0178f, 12.1655f, 18.3435f, 12.3333f)
                close()
            }
        }
            .build()
        return _tornadoSmall!!
    }

private var _tornadoSmall: ImageVector? = null
