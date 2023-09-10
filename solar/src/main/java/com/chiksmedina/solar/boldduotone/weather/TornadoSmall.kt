package com.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.WeatherGroup

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
                curveTo(19.6861f, 6.4997f, 19.6866f, 6.4998f, 19.6872f, 6.5f)
                curveTo(19.32f, 6.6122f, 18.8349f, 6.7218f, 18.2407f, 6.8209f)
                curveTo(16.6639f, 7.0837f, 14.4571f, 7.25f, 12.0f, 7.25f)
                curveTo(9.5429f, 7.25f, 7.3361f, 7.0837f, 5.7593f, 6.8209f)
                curveTo(5.165f, 6.7218f, 4.68f, 6.6122f, 4.3127f, 6.5f)
                close()
                moveTo(3.648f, 6.7867f)
                curveTo(3.6479f, 6.7867f, 3.6488f, 6.7857f, 3.651f, 6.7838f)
                curveTo(3.6491f, 6.7857f, 3.648f, 6.7867f, 3.648f, 6.7867f)
                close()
                moveTo(20.3582f, 6.7915f)
                curveTo(20.3576f, 6.7915f, 20.3527f, 6.7878f, 20.3454f, 6.78f)
                curveTo(20.3551f, 6.7876f, 20.3588f, 6.7914f, 20.3582f, 6.7915f)
                close()
                moveTo(20.349f, 6.2162f)
                curveTo(20.3509f, 6.2143f, 20.352f, 6.2133f, 20.352f, 6.2133f)
                curveTo(20.3521f, 6.2133f, 20.3512f, 6.2143f, 20.349f, 6.2162f)
                close()
                moveTo(3.651f, 6.2162f)
                curveTo(3.6488f, 6.2143f, 3.6479f, 6.2133f, 3.648f, 6.2133f)
                curveTo(3.648f, 6.2133f, 3.6491f, 6.2143f, 3.651f, 6.2162f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.706f, 9.7472f)
                curveTo(20.8457f, 10.1372f, 20.6428f, 10.5665f, 20.2529f, 10.7062f)
                lineTo(19.9999f, 10.0002f)
                curveTo(20.2529f, 10.7062f, 20.2529f, 10.7062f, 20.2529f, 10.7062f)
                lineTo(20.2519f, 10.7066f)
                lineTo(20.2507f, 10.707f)
                lineTo(20.2474f, 10.7082f)
                lineTo(20.2378f, 10.7115f)
                lineTo(20.2063f, 10.7223f)
                curveTo(20.1798f, 10.7312f, 20.1424f, 10.7435f, 20.0941f, 10.7587f)
                curveTo(19.9975f, 10.789f, 19.8572f, 10.831f, 19.6736f, 10.8805f)
                curveTo(19.3062f, 10.9797f, 18.7652f, 11.1094f, 18.0522f, 11.2382f)
                curveTo(16.6259f, 11.496f, 14.5123f, 11.7502f, 11.7241f, 11.7502f)
                curveTo(8.936f, 11.7502f, 6.9553f, 11.496f, 5.6576f, 11.2355f)
                curveTo(5.0088f, 11.1053f, 4.5311f, 10.9735f, 4.2088f, 10.8714f)
                curveTo(4.0477f, 10.8203f, 3.9256f, 10.7766f, 3.8404f, 10.7442f)
                curveTo(3.7978f, 10.728f, 3.7645f, 10.7147f, 3.7402f, 10.7047f)
                lineTo(3.7105f, 10.6922f)
                lineTo(3.7007f, 10.6879f)
                lineTo(3.697f, 10.6863f)
                lineTo(3.6955f, 10.6856f)
                curveTo(3.6955f, 10.6856f, 3.6941f, 10.685f, 3.9999f, 10.0002f)
                lineTo(3.6941f, 10.685f)
                curveTo(3.3159f, 10.5161f, 3.1462f, 10.0726f, 3.3151f, 9.6944f)
                curveTo(3.4835f, 9.3172f, 3.925f, 9.1474f, 4.3025f, 9.3139f)
                moveTo(4.3025f, 9.3139f)
                lineTo(4.3126f, 9.3182f)
                curveTo(4.3238f, 9.3228f, 4.344f, 9.3309f, 4.3733f, 9.3421f)
                curveTo(4.4321f, 9.3644f, 4.5277f, 9.3989f, 4.6623f, 9.4415f)
                curveTo(4.9313f, 9.5268f, 5.3562f, 9.6451f, 5.9528f, 9.7648f)
                curveTo(7.146f, 10.0044f, 9.0274f, 10.2502f, 11.7241f, 10.2502f)
                curveTo(14.4206f, 10.2502f, 16.445f, 10.0044f, 17.7854f, 9.7621f)
                curveTo(18.4557f, 9.641f, 18.9553f, 9.5207f, 19.2827f, 9.4323f)
                curveTo(19.4464f, 9.3882f, 19.5671f, 9.352f, 19.6445f, 9.3276f)
                curveTo(19.6832f, 9.3155f, 19.7111f, 9.3063f, 19.7282f, 9.3005f)
                lineTo(19.747f, 9.2941f)
                lineTo(19.9812f, 9.9478f)
                curveTo(19.747f, 9.2941f, 19.747f, 9.2941f, 19.747f, 9.2941f)
                curveTo(20.1368f, 9.1547f, 20.5663f, 9.3574f, 20.706f, 9.7472f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(8.273f, 15.3017f)
                curveTo(7.8891f, 15.1515f, 7.4555f, 15.3395f, 7.303f, 15.7231f)
                curveTo(7.15f, 16.108f, 7.338f, 16.5441f, 7.7229f, 16.6971f)
                lineTo(8.0f, 16.0002f)
                curveTo(7.7229f, 16.6971f, 7.7231f, 16.6972f, 7.7234f, 16.6973f)
                lineTo(7.7239f, 16.6976f)
                lineTo(7.7251f, 16.698f)
                lineTo(7.7279f, 16.6991f)
                lineTo(7.7347f, 16.7018f)
                lineTo(7.7541f, 16.7091f)
                curveTo(7.7695f, 16.7148f, 7.7899f, 16.7221f, 7.8154f, 16.7309f)
                curveTo(7.8663f, 16.7484f, 7.9375f, 16.7716f, 8.0294f, 16.7983f)
                curveTo(8.2131f, 16.8519f, 8.4793f, 16.92f, 8.8314f, 16.987f)
                curveTo(9.536f, 17.121f, 10.5829f, 17.2502f, 12.0f, 17.2502f)
                curveTo(13.417f, 17.2502f, 14.464f, 17.121f, 15.1685f, 16.987f)
                curveTo(15.5206f, 16.92f, 15.7868f, 16.8519f, 15.9706f, 16.7983f)
                curveTo(16.0624f, 16.7716f, 16.1336f, 16.7484f, 16.1845f, 16.7309f)
                curveTo(16.21f, 16.7221f, 16.2304f, 16.7148f, 16.2458f, 16.7091f)
                lineTo(16.2652f, 16.7018f)
                lineTo(16.272f, 16.6991f)
                lineTo(16.2748f, 16.698f)
                lineTo(16.276f, 16.6976f)
                lineTo(16.2765f, 16.6973f)
                curveTo(16.2768f, 16.6972f, 16.277f, 16.6971f, 16.0f, 16.0002f)
                lineTo(16.277f, 16.6971f)
                curveTo(16.662f, 16.5441f, 16.8499f, 16.108f, 16.6969f, 15.7231f)
                curveTo(16.5444f, 15.3395f, 16.1108f, 15.1515f, 15.7269f, 15.3017f)
                curveTo(15.7273f, 15.3015f, 15.7275f, 15.3014f, 15.7274f, 15.3015f)
                lineTo(15.726f, 15.302f)
                lineTo(15.7247f, 15.3025f)
                moveTo(15.7245f, 15.3026f)
                curveTo(15.7202f, 15.3042f, 15.7109f, 15.3076f, 15.6966f, 15.3125f)
                curveTo(15.6681f, 15.3223f, 15.6196f, 15.3382f, 15.5506f, 15.3583f)
                curveTo(15.4129f, 15.3985f, 15.1933f, 15.4554f, 14.8882f, 15.5134f)
                curveTo(14.2783f, 15.6294f, 13.3253f, 15.7502f, 12.0f, 15.7502f)
                curveTo(10.6746f, 15.7502f, 9.7216f, 15.6294f, 9.1117f, 15.5134f)
                curveTo(8.8067f, 15.4554f, 8.5871f, 15.3985f, 8.4493f, 15.3583f)
                curveTo(8.3804f, 15.3382f, 8.3319f, 15.3223f, 8.3033f, 15.3125f)
                curveTo(8.289f, 15.3076f, 8.2798f, 15.3042f, 8.2754f, 15.3026f)
                moveTo(15.7234f, 15.3031f)
                lineTo(15.7238f, 15.3029f)
                lineTo(15.7245f, 15.3026f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.7096f, 18.2577f)
                curveTo(16.8435f, 18.6497f, 16.6343f, 19.076f, 16.2424f, 19.2099f)
                curveTo(15.4415f, 19.4835f, 14.4566f, 19.7502f, 12.9999f, 19.7502f)
                curveTo(11.6031f, 19.7502f, 10.5659f, 19.6247f, 9.8618f, 19.4927f)
                curveTo(9.4546f, 19.4165f, 9.1864f, 19.0246f, 9.2627f, 18.6175f)
                curveTo(9.339f, 18.2103f, 9.7309f, 17.9421f, 10.138f, 18.0184f)
                curveTo(10.7488f, 18.1328f, 11.6935f, 18.2502f, 12.9999f, 18.2502f)
                curveTo(14.2464f, 18.2502f, 15.0633f, 18.0276f, 15.7574f, 17.7905f)
                curveTo(16.1494f, 17.6566f, 16.5757f, 17.8658f, 16.7096f, 18.2577f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.591f, 12.5383f)
                curveTo(6.3736f, 12.2595f, 5.9821f, 12.1656f, 5.6564f, 12.3335f)
                curveTo(5.2882f, 12.5232f, 5.1435f, 12.9755f, 5.3332f, 13.3437f)
                lineTo(5.9999f, 13.0002f)
                curveTo(5.3332f, 13.3437f, 5.3337f, 13.3446f, 5.3342f, 13.3455f)
                lineTo(5.3351f, 13.3474f)
                lineTo(5.3371f, 13.3511f)
                lineTo(5.3411f, 13.3586f)
                lineTo(5.3496f, 13.3739f)
                curveTo(5.3556f, 13.3842f, 5.3619f, 13.3948f, 5.3687f, 13.4056f)
                curveTo(5.3823f, 13.4271f, 5.3977f, 13.4494f, 5.4151f, 13.4723f)
                curveTo(5.4498f, 13.5181f, 5.492f, 13.5656f, 5.5429f, 13.6141f)
                curveTo(5.6444f, 13.7109f, 5.7799f, 13.8107f, 5.9606f, 13.9088f)
                curveTo(6.3182f, 14.1029f, 6.8754f, 14.303f, 7.7611f, 14.4597f)
                curveTo(8.169f, 14.5318f, 8.5581f, 14.2597f, 8.6302f, 13.8518f)
                curveTo(8.7024f, 13.4439f, 8.4302f, 13.0548f, 8.0223f, 12.9826f)
                curveTo(7.2353f, 12.8434f, 6.8466f, 12.683f, 6.6764f, 12.5906f)
                curveTo(6.6332f, 12.5671f, 6.606f, 12.5491f, 6.591f, 12.5383f)
                close()
                moveTo(18.3434f, 12.3335f)
                curveTo(18.7116f, 12.5232f, 18.8563f, 12.9755f, 18.6666f, 13.3437f)
                lineTo(17.9999f, 13.0002f)
                curveTo(18.6666f, 13.3437f, 18.6659f, 13.3451f, 18.6652f, 13.3465f)
                lineTo(18.6637f, 13.3493f)
                lineTo(18.6606f, 13.3551f)
                lineTo(18.6542f, 13.3667f)
                curveTo(18.6499f, 13.3746f, 18.6452f, 13.3825f, 18.6403f, 13.3906f)
                curveTo(18.6305f, 13.4069f, 18.6197f, 13.4236f, 18.6078f, 13.4407f)
                curveTo(18.5838f, 13.475f, 18.5557f, 13.5105f, 18.5226f, 13.547f)
                curveTo(18.4564f, 13.62f, 18.3717f, 13.6954f, 18.2636f, 13.7709f)
                curveTo(18.0494f, 13.9208f, 17.7375f, 14.0757f, 17.2768f, 14.2171f)
                curveTo(16.3612f, 14.4982f, 14.7773f, 14.7502f, 11.9999f, 14.7502f)
                curveTo(11.5857f, 14.7502f, 11.2499f, 14.4144f, 11.2499f, 14.0002f)
                curveTo(11.2499f, 13.5859f, 11.5857f, 13.2502f, 11.9999f, 13.2502f)
                curveTo(14.7072f, 13.2502f, 16.1234f, 13.0021f, 16.8366f, 12.7832f)
                curveTo(17.1903f, 12.6746f, 17.35f, 12.5795f, 17.4038f, 12.5419f)
                curveTo(17.4056f, 12.5406f, 17.4073f, 12.5394f, 17.4088f, 12.5383f)
                curveTo(17.6262f, 12.2595f, 18.0177f, 12.1656f, 18.3434f, 12.3335f)
                close()
            }
        }
            .build()
        return _tornadoSmall!!
    }

private var _tornadoSmall: ImageVector? = null
