package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(
            name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4221f, 3.0712f)
                curveTo(12.0479f, 3.4265f, 11.594f, 4.0004f, 10.9207f, 4.8564f)
                lineTo(10.5803f, 5.2891f)
                curveTo(10.5579f, 5.3176f, 10.5357f, 5.346f, 10.5135f, 5.3742f)
                curveTo(10.2082f, 5.7639f, 9.9264f, 6.1235f, 9.5306f, 6.3347f)
                curveTo(9.1282f, 6.5494f, 8.6772f, 6.5744f, 8.2025f, 6.6007f)
                curveTo(8.1681f, 6.6026f, 8.1336f, 6.6045f, 8.099f, 6.6065f)
                lineTo(7.5716f, 6.6368f)
                curveTo(6.5258f, 6.697f, 5.8321f, 6.7391f, 5.3485f, 6.8436f)
                curveTo(4.8826f, 6.9442f, 4.8126f, 7.0614f, 4.7828f, 7.1216f)
                curveTo(4.7472f, 7.1932f, 4.6989f, 7.3445f, 4.8939f, 7.8189f)
                curveTo(5.0925f, 8.302f, 5.4612f, 8.9291f, 6.012f, 9.8602f)
                lineTo(6.2906f, 10.331f)
                curveTo(6.3081f, 10.3606f, 6.3255f, 10.3899f, 6.3428f, 10.4191f)
                curveTo(6.5974f, 10.8479f, 6.8265f, 11.2338f, 6.8868f, 11.6834f)
                curveTo(6.9466f, 12.1294f, 6.8304f, 12.5663f, 6.6994f, 13.0586f)
                curveTo(6.6905f, 13.0921f, 6.6815f, 13.1258f, 6.6725f, 13.1598f)
                lineTo(6.5296f, 13.7004f)
                curveTo(6.2473f, 14.7681f, 6.058f, 15.491f, 5.9944f, 16.0208f)
                curveTo(5.9307f, 16.5508f, 6.023f, 16.6697f, 6.0599f, 16.7095f)
                curveTo(6.0604f, 16.71f, 6.061f, 16.7106f, 6.0616f, 16.7113f)
                curveTo(6.0859f, 16.7379f, 6.1671f, 16.8269f, 6.6337f, 16.773f)
                curveTo(7.0818f, 16.7213f, 7.6849f, 16.5627f, 8.5622f, 16.321f)
                curveTo(8.2774f, 16.0838f, 8.0304f, 15.8642f, 7.838f, 15.6576f)
                curveTo(7.498f, 15.2925f, 7.1756f, 14.8085f, 7.2647f, 14.1833f)
                curveTo(7.3544f, 13.5534f, 7.8038f, 13.1828f, 8.2353f, 12.9345f)
                curveTo(8.6488f, 12.6965f, 9.224f, 12.4713f, 9.8858f, 12.2122f)
                lineTo(10.3071f, 12.0472f)
                curveTo(10.5194f, 11.964f, 10.6376f, 11.9171f, 10.7232f, 11.8754f)
                curveTo(10.7717f, 11.8517f, 10.7912f, 11.8383f, 10.7969f, 11.8338f)
                curveTo(10.8013f, 11.8279f, 10.8143f, 11.8084f, 10.837f, 11.76f)
                curveTo(10.8772f, 11.674f, 10.922f, 11.5554f, 11.0015f, 11.3421f)
                lineTo(11.1593f, 10.9187f)
                curveTo(11.4069f, 10.254f, 11.6223f, 9.676f, 11.8533f, 9.259f)
                curveTo(12.0949f, 8.823f, 12.4581f, 8.3692f, 13.0858f, 8.2685f)
                curveTo(13.7083f, 8.1687f, 14.198f, 8.4802f, 14.5705f, 8.813f)
                curveTo(14.9292f, 9.1336f, 15.3285f, 9.6114f, 15.7901f, 10.1638f)
                lineTo(16.0823f, 10.5134f)
                curveTo(16.2298f, 10.6899f, 16.3134f, 10.7891f, 16.3818f, 10.8589f)
                curveTo(16.4123f, 10.8901f, 16.431f, 10.9061f, 16.4414f, 10.9142f)
                curveTo(16.4464f, 10.9181f, 16.4494f, 10.9201f, 16.4508f, 10.921f)
                lineTo(16.4534f, 10.9225f)
                lineTo(16.456f, 10.9236f)
                curveTo(16.4574f, 10.9241f, 16.4607f, 10.9253f, 16.4666f, 10.9269f)
                curveTo(16.4789f, 10.9303f, 16.5025f, 10.9357f, 16.5453f, 10.9414f)
                curveTo(16.6413f, 10.9543f, 16.7698f, 10.9618f, 16.9985f, 10.9742f)
                lineTo(17.4518f, 10.9987f)
                curveTo(17.666f, 11.0103f, 17.8716f, 11.0214f, 18.0672f, 11.0339f)
                curveTo(18.5366f, 10.6206f, 18.8497f, 10.3167f, 19.0452f, 10.0614f)
                curveTo(19.2545f, 9.788f, 19.2566f, 9.6644f, 19.247f, 9.5926f)
                curveTo(19.2375f, 9.5214f, 19.2053f, 9.3848f, 18.7962f, 9.1347f)
                curveTo(18.3719f, 8.8753f, 17.729f, 8.6054f, 16.7599f, 8.2021f)
                lineTo(16.271f, 7.9986f)
                curveTo(16.2391f, 7.9853f, 16.2073f, 7.9722f, 16.1757f, 7.9591f)
                curveTo(15.7344f, 7.7765f, 15.3179f, 7.6042f, 15.0079f, 7.2696f)
                curveTo(14.7031f, 6.9406f, 14.5528f, 6.5096f, 14.3888f, 6.0392f)
                curveTo(14.377f, 6.0054f, 14.3652f, 5.9714f, 14.3532f, 5.9372f)
                lineTo(14.1702f, 5.4154f)
                curveTo(13.8082f, 4.3835f, 13.5628f, 3.6896f, 13.3225f, 3.2288f)
                curveTo(13.0865f, 2.7763f, 12.9599f, 2.7562f, 12.9361f, 2.7525f)
                curveTo(12.9356f, 2.7524f, 12.9351f, 2.7523f, 12.9346f, 2.7522f)
                curveTo(12.9342f, 2.7522f, 12.9336f, 2.7521f, 12.933f, 2.7519f)
                curveTo(12.9108f, 2.7477f, 12.7873f, 2.7244f, 12.4221f, 3.0712f)
                close()
                moveTo(19.8916f, 11.3732f)
                curveTo(20.02f, 11.2376f, 20.1356f, 11.1046f, 20.2362f, 10.9732f)
                curveTo(20.5795f, 10.5248f, 20.816f, 10.0071f, 20.7337f, 9.3932f)
                curveTo(20.6355f, 8.6607f, 20.1413f, 8.1989f, 19.5786f, 7.8549f)
                curveTo(19.0428f, 7.5273f, 18.2896f, 7.2139f, 17.3948f, 6.8416f)
                lineTo(16.8473f, 6.6137f)
                curveTo(16.2495f, 6.365f, 16.1671f, 6.3137f, 16.1082f, 6.2502f)
                curveTo(16.0437f, 6.1805f, 15.9918f, 6.0771f, 15.7686f, 5.4408f)
                lineTo(15.5654f, 4.8612f)
                curveTo(15.2289f, 3.9019f, 14.949f, 3.1037f, 14.6525f, 2.5351f)
                curveTo(14.3512f, 1.9575f, 13.9232f, 1.399f, 13.1865f, 1.2735f)
                curveTo(12.4477f, 1.1477f, 11.8608f, 1.5358f, 11.3892f, 1.9835f)
                curveTo(10.926f, 2.4232f, 10.4051f, 3.0856f, 9.7799f, 3.8805f)
                lineTo(9.4014f, 4.3617f)
                curveTo(8.9856f, 4.8903f, 8.9051f, 4.9683f, 8.8245f, 5.0113f)
                curveTo(8.7508f, 5.0506f, 8.6589f, 5.0718f, 8.0129f, 5.109f)
                lineTo(7.4855f, 5.1393f)
                curveTo(7.4641f, 5.1405f, 7.4429f, 5.1418f, 7.4217f, 5.143f)
                curveTo(6.4568f, 5.1984f, 5.6439f, 5.2451f, 5.0318f, 5.3774f)
                curveTo(4.3885f, 5.5164f, 3.769f, 5.7905f, 3.4393f, 6.4544f)
                curveTo(3.1153f, 7.1069f, 3.2531f, 7.7726f, 3.5065f, 8.3892f)
                curveTo(3.7515f, 8.9852f, 4.1781f, 9.7063f, 4.6904f, 10.5722f)
                lineTo(4.9996f, 11.0948f)
                curveTo(5.3366f, 11.6645f, 5.3856f, 11.7741f, 5.4001f, 11.8828f)
                curveTo(5.4152f, 11.9952f, 5.3951f, 12.123f, 5.2224f, 12.7764f)
                lineTo(5.0644f, 13.374f)
                curveTo(4.8009f, 14.3701f, 4.5827f, 15.1953f, 4.5051f, 15.8419f)
                curveTo(4.426f, 16.5007f, 4.4625f, 17.1923f, 4.9595f, 17.7289f)
                curveTo(5.4711f, 18.2811f, 6.1597f, 18.3377f, 6.8057f, 18.2631f)
                curveTo(7.426f, 18.1915f, 8.2153f, 17.9733f, 9.1526f, 17.7142f)
                lineTo(9.281f, 17.6787f)
                lineTo(9.8786f, 17.3883f)
                curveTo(9.8941f, 17.402f, 9.9082f, 17.4148f, 9.9214f, 17.4271f)
                curveTo(9.9532f, 17.4571f, 9.9696f, 17.4754f, 9.9778f, 17.4856f)
                curveTo(9.9817f, 17.4904f, 9.9838f, 17.4934f, 9.9846f, 17.4947f)
                lineTo(9.9861f, 17.497f)
                lineTo(9.9871f, 17.4993f)
                curveTo(9.9876f, 17.5006f, 9.9888f, 17.5037f, 9.9905f, 17.5094f)
                curveTo(9.9941f, 17.5214f, 9.9998f, 17.5446f, 10.0063f, 17.587f)
                curveTo(10.0209f, 17.6823f, 10.0308f, 17.81f, 10.0473f, 18.038f)
                lineTo(10.0802f, 18.49f)
                curveTo(10.1319f, 19.2023f, 10.1767f, 19.8199f, 10.2812f, 20.2878f)
                curveTo(10.3904f, 20.7768f, 10.6083f, 21.3108f, 11.1706f, 21.5932f)
                curveTo(11.7349f, 21.8766f, 12.2931f, 21.7295f, 12.7484f, 21.5217f)
                curveTo(13.1829f, 21.3234f, 13.6995f, 20.9869f, 14.294f, 20.5998f)
                lineTo(14.6722f, 20.3536f)
                curveTo(14.8629f, 20.2294f, 14.9694f, 20.1607f, 15.0531f, 20.1154f)
                curveTo(15.0902f, 20.0953f, 15.1114f, 20.0862f, 15.1223f, 20.0822f)
                curveTo(15.1274f, 20.0803f, 15.1302f, 20.0795f, 15.131f, 20.0792f)
                lineTo(15.132f, 20.079f)
                lineTo(15.1334f, 20.0789f)
                curveTo(15.1345f, 20.0788f, 15.1377f, 20.0787f, 15.1436f, 20.0789f)
                curveTo(15.156f, 20.0794f, 15.1799f, 20.0815f, 15.2226f, 20.089f)
                curveTo(15.3181f, 20.1059f, 15.4432f, 20.1379f, 15.6655f, 20.1958f)
                lineTo(16.106f, 20.3104f)
                curveTo(16.8007f, 20.4912f, 17.4024f, 20.6477f, 17.8792f, 20.6995f)
                curveTo(18.3737f, 20.7533f, 18.9568f, 20.7215f, 19.4022f, 20.2691f)
                curveTo(19.8482f, 19.816f, 19.8696f, 19.2323f, 19.8066f, 18.739f)
                curveTo(19.746f, 18.2639f, 19.5781f, 17.6664f, 19.3843f, 16.9769f)
                lineTo(19.2614f, 16.5393f)
                curveTo(19.1994f, 16.3186f, 19.1651f, 16.1946f, 19.1465f, 16.0999f)
                curveTo(19.1381f, 16.0576f, 19.1357f, 16.034f, 19.135f, 16.0219f)
                curveTo(19.1347f, 16.0162f, 19.1348f, 16.0132f, 19.1348f, 16.0123f)
                curveTo(19.1348f, 16.0122f, 19.1349f, 16.0113f, 19.135f, 16.011f)
                curveTo(19.1351f, 16.0103f, 19.1358f, 16.0076f, 19.1376f, 16.0026f)
                curveTo(19.1414f, 15.9919f, 19.15f, 15.9708f, 19.1695f, 15.9334f)
                curveTo(19.2133f, 15.8493f, 19.2801f, 15.7419f, 19.4011f, 15.5494f)
                lineTo(19.6412f, 15.1675f)
                curveTo(20.0183f, 14.5677f, 20.3462f, 14.046f, 20.5371f, 13.6089f)
                curveTo(20.7373f, 13.1506f, 20.8752f, 12.5893f, 20.58f, 12.0298f)
                curveTo(20.4124f, 11.712f, 20.1646f, 11.5082f, 19.8916f, 11.3732f)
                close()
                moveTo(13.3016f, 9.7489f)
                curveTo(13.3014f, 9.7482f, 13.3051f, 9.7481f, 13.3133f, 9.7506f)
                curveTo(13.306f, 9.7507f, 13.3019f, 9.7495f, 13.3016f, 9.7489f)
                close()
                moveTo(13.3259f, 9.7551f)
                curveTo(13.3611f, 9.7693f, 13.4372f, 9.812f, 13.571f, 9.9315f)
                curveTo(13.8378f, 10.1699f, 14.1668f, 10.5605f, 14.6761f, 11.1699f)
                lineTo(14.9313f, 11.4753f)
                curveTo(14.9494f, 11.497f, 14.9676f, 11.5189f, 14.9859f, 11.5408f)
                curveTo(15.2087f, 11.8091f, 15.4466f, 12.0954f, 15.7802f, 12.2629f)
                curveTo(16.1146f, 12.4308f, 16.4861f, 12.4499f, 16.8328f, 12.4676f)
                curveTo(16.8612f, 12.469f, 16.8894f, 12.4705f, 16.9174f, 12.472f)
                lineTo(17.313f, 12.4934f)
                curveTo(18.1025f, 12.5361f, 18.6092f, 12.5655f, 18.9579f, 12.6365f)
                curveTo(19.1244f, 12.6703f, 19.2061f, 12.705f, 19.2425f, 12.7261f)
                curveTo(19.2453f, 12.7277f, 19.2476f, 12.7291f, 19.2497f, 12.7304f)
                curveTo(19.2496f, 12.7315f, 19.2495f, 12.7327f, 19.2494f, 12.734f)
                curveTo(19.2463f, 12.7722f, 19.2293f, 12.8557f, 19.1625f, 13.0086f)
                curveTo(19.0223f, 13.3295f, 18.7575f, 13.7547f, 18.3401f, 14.4188f)
                lineTo(18.1312f, 14.7511f)
                curveTo(18.1163f, 14.7749f, 18.1012f, 14.7987f, 18.0859f, 14.8228f)
                curveTo(17.9026f, 15.1125f, 17.7028f, 15.4281f, 17.6498f, 15.7999f)
                curveTo(17.5971f, 16.1701f, 17.6994f, 16.5299f, 17.794f, 16.8626f)
                curveTo(17.8018f, 16.8903f, 17.8096f, 16.9178f, 17.8173f, 16.945f)
                lineTo(17.9245f, 17.3266f)
                curveTo(18.1385f, 18.0884f, 18.2739f, 18.5775f, 18.3187f, 18.9288f)
                curveTo(18.3391f, 19.0888f, 18.334f, 19.1723f, 18.3271f, 19.2113f)
                curveTo(18.2881f, 19.219f, 18.2039f, 19.226f, 18.0412f, 19.2083f)
                curveTo(17.6878f, 19.1699f, 17.1948f, 19.0437f, 16.4275f, 18.8441f)
                lineTo(16.0432f, 18.7441f)
                curveTo(16.0157f, 18.7369f, 15.9881f, 18.7297f, 15.9603f, 18.7223f)
                curveTo(15.6248f, 18.634f, 15.2634f, 18.5388f, 14.8946f, 18.5979f)
                curveTo(14.5238f, 18.6574f, 14.2118f, 18.8619f, 13.9246f, 19.0502f)
                curveTo(13.9008f, 19.0658f, 13.8772f, 19.0813f, 13.8538f, 19.0965f)
                lineTo(13.5244f, 19.3109f)
                curveTo(12.8666f, 19.7393f, 12.4451f, 20.0113f, 12.1256f, 20.1571f)
                curveTo(11.9735f, 20.2265f, 11.8896f, 20.2452f, 11.8506f, 20.2491f)
                curveTo(11.8484f, 20.2494f, 11.8464f, 20.2495f, 11.8446f, 20.2496f)
                curveTo(11.8431f, 20.2475f, 11.8415f, 20.245f, 11.8397f, 20.242f)
                curveTo(11.8182f, 20.2064f, 11.782f, 20.126f, 11.7452f, 19.9609f)
                curveTo(11.6679f, 19.6148f, 11.6292f, 19.1104f, 11.572f, 18.3235f)
                lineTo(11.5434f, 17.9294f)
                curveTo(11.5414f, 17.9014f, 11.5394f, 17.8732f, 11.5374f, 17.8449f)
                curveTo(11.5134f, 17.4996f, 11.4875f, 17.1283f, 11.3127f, 16.7971f)
                curveTo(11.1386f, 16.467f, 10.8472f, 16.2348f, 10.5745f, 16.0175f)
                curveTo(10.5521f, 15.9997f, 10.5298f, 15.9819f, 10.5077f, 15.9642f)
                lineTo(10.197f, 15.7152f)
                curveTo(9.577f, 15.2182f, 9.1795f, 14.8972f, 8.9357f, 14.6353f)
                curveTo(8.8165f, 14.5073f, 8.7718f, 14.4329f, 8.756f, 14.3974f)
                curveTo(8.7815f, 14.3693f, 8.8434f, 14.3151f, 8.9834f, 14.2346f)
                curveTo(9.2874f, 14.0597f, 9.755f, 13.8744f, 10.4875f, 13.5875f)
                lineTo(10.8541f, 13.4439f)
                curveTo(10.8804f, 13.4336f, 10.9069f, 13.4233f, 10.9336f, 13.4129f)
                curveTo(11.2537f, 13.2887f, 11.6028f, 13.1533f, 11.8659f, 12.886f)
                curveTo(12.1292f, 12.6185f, 12.2588f, 12.2673f, 12.3775f, 11.9458f)
                curveTo(12.3874f, 11.9189f, 12.3972f, 11.8923f, 12.407f, 11.8659f)
                lineTo(12.5443f, 11.4976f)
                curveTo(12.8186f, 10.7616f, 12.9957f, 10.2922f, 13.1654f, 9.9861f)
                curveTo(13.2449f, 9.8425f, 13.2984f, 9.7801f, 13.3259f, 9.7551f)
                close()
                moveTo(8.7484f, 14.3717f)
                curveTo(8.7491f, 14.3719f, 8.7504f, 14.376f, 8.7505f, 14.3833f)
                curveTo(8.7478f, 14.3752f, 8.7478f, 14.3715f, 8.7484f, 14.3717f)
                close()
                moveTo(8.7465f, 14.409f)
                curveTo(8.7439f, 14.4166f, 8.7411f, 14.4204f, 8.7403f, 14.4204f)
                curveTo(8.7395f, 14.4205f, 8.7407f, 14.4166f, 8.7465f, 14.409f)
                close()
                moveTo(18.318f, 19.2404f)
                curveTo(18.3175f, 19.2398f, 18.3188f, 19.2354f, 18.3231f, 19.229f)
                curveTo(18.3206f, 19.2377f, 18.3184f, 19.241f, 18.318f, 19.2404f)
                close()
                moveTo(18.3448f, 19.2069f)
                curveTo(18.351f, 19.2025f, 18.3552f, 19.2012f, 18.3558f, 19.2016f)
                curveTo(18.3564f, 19.202f, 18.3533f, 19.2042f, 18.3448f, 19.2069f)
                close()
                moveTo(13.336f, 9.7466f)
                curveTo(13.3436f, 9.7407f, 13.3475f, 9.7394f, 13.3475f, 9.7402f)
                curveTo(13.3475f, 9.741f, 13.3437f, 9.744f, 13.336f, 9.7466f)
                close()
            }
        }
            .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
