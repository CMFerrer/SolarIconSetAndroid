package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.StarFall: ImageVector
    get() {
        if (_starFall != null) {
            return _starFall!!
        }
        _starFall = Builder(
            name = "StarFall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0136f, 3.1848f)
                lineTo(15.2917f, 3.5362f)
                curveTo(15.432f, 3.7133f, 15.511f, 3.8122f, 15.5754f, 3.8817f)
                curveTo(15.6102f, 3.9191f, 15.6285f, 3.9342f, 15.6351f, 3.9391f)
                curveTo(15.6427f, 3.9416f, 15.6633f, 3.9472f, 15.7068f, 3.9536f)
                curveTo(15.7959f, 3.9666f, 15.9163f, 3.9747f, 16.1366f, 3.9884f)
                lineTo(16.5747f, 4.0158f)
                curveTo(17.2574f, 4.0584f, 17.8552f, 4.0956f, 18.3102f, 4.1947f)
                curveTo(18.7919f, 4.2997f, 19.3161f, 4.5159f, 19.5944f, 5.0751f)
                curveTo(19.8693f, 5.6276f, 19.7352f, 6.1772f, 19.54f, 6.6314f)
                curveTo(19.3536f, 7.0653f, 19.0348f, 7.5831f, 18.6676f, 8.1797f)
                lineTo(18.6377f, 8.2282f)
                lineTo(18.4345f, 8.5584f)
                curveTo(18.3169f, 8.7496f, 18.2516f, 8.8566f, 18.2087f, 8.9406f)
                curveTo(18.1896f, 8.978f, 18.1808f, 8.9997f, 18.1768f, 9.0113f)
                curveTo(18.1733f, 9.0213f, 18.173f, 9.0244f, 18.173f, 9.0246f)
                curveTo(18.1729f, 9.0248f, 18.1722f, 9.0285f, 18.1728f, 9.0402f)
                curveTo(18.1734f, 9.0537f, 18.1757f, 9.0784f, 18.1835f, 9.1213f)
                curveTo(18.2008f, 9.2169f, 18.2329f, 9.3417f, 18.2904f, 9.5618f)
                lineTo(18.39f, 9.943f)
                lineTo(18.4043f, 9.9976f)
                curveTo(18.5847f, 10.6875f, 18.7405f, 11.2831f, 18.7944f, 11.7554f)
                curveTo(18.85f, 12.2422f, 18.8262f, 12.8172f, 18.3953f, 13.2656f)
                curveTo(17.9552f, 13.7236f, 17.3776f, 13.7534f, 16.8933f, 13.6957f)
                curveTo(16.432f, 13.6407f, 15.8525f, 13.4801f, 15.1905f, 13.2965f)
                lineTo(14.7654f, 13.1787f)
                curveTo(14.5518f, 13.1194f, 14.4345f, 13.0875f, 14.3458f, 13.0706f)
                curveTo(14.3089f, 13.0636f, 14.2884f, 13.0616f, 14.2788f, 13.0611f)
                curveTo(14.2698f, 13.0645f, 14.2509f, 13.0729f, 14.218f, 13.0911f)
                curveTo(14.1389f, 13.1349f, 14.0374f, 13.2019f, 13.853f, 13.3249f)
                lineTo(13.4859f, 13.5697f)
                curveTo(12.9142f, 13.951f, 12.4138f, 14.2848f, 11.9926f, 14.4812f)
                curveTo(11.5508f, 14.6873f, 10.9926f, 14.8396f, 10.4314f, 14.5419f)
                curveTo(10.0731f, 14.3518f, 9.8626f, 14.0565f, 9.7321f, 13.741f)
                curveTo(7.4591f, 14.7002f, 5.6013f, 16.3478f, 4.9586f, 18.241f)
                curveTo(4.8478f, 18.5674f, 4.5287f, 18.7763f, 4.1852f, 18.7472f)
                curveTo(3.8417f, 18.7182f, 3.5623f, 18.4587f, 3.5078f, 18.1183f)
                curveTo(2.5673f, 12.2345f, 4.3242f, 8.6859f, 6.8482f, 6.7518f)
                curveTo(7.0233f, 6.3559f, 7.3552f, 6.0914f, 7.6838f, 5.8978f)
                curveTo(8.0851f, 5.6615f, 8.6414f, 5.4392f, 9.2768f, 5.1854f)
                curveTo(9.2949f, 5.1782f, 9.3131f, 5.1709f, 9.3314f, 5.1636f)
                lineTo(9.6844f, 5.0226f)
                curveTo(9.8894f, 4.9406f, 10.0013f, 4.8953f, 10.0819f, 4.8551f)
                curveTo(10.1215f, 4.8354f, 10.1393f, 4.8236f, 10.1457f, 4.8188f)
                curveTo(10.1504f, 4.8121f, 10.1632f, 4.792f, 10.1846f, 4.7453f)
                curveTo(10.2243f, 4.6591f, 10.2685f, 4.5404f, 10.3465f, 4.3284f)
                lineTo(10.4813f, 3.9618f)
                curveTo(10.4879f, 3.9437f, 10.4946f, 3.9257f, 10.5012f, 3.9077f)
                curveTo(10.7446f, 3.2457f, 10.9557f, 2.6716f, 11.1805f, 2.258f)
                curveTo(11.412f, 1.8317f, 11.7674f, 1.3681f, 12.3929f, 1.2678f)
                curveTo(13.0186f, 1.1675f, 13.501f, 1.4971f, 13.8539f, 1.8298f)
                curveTo(14.1964f, 2.1525f, 14.576f, 2.6321f, 15.0136f, 3.1848f)
                close()
                moveTo(7.1599f, 8.4589f)
                curveTo(5.7367f, 9.8297f, 4.6402f, 12.049f, 4.7581f, 15.566f)
                curveTo(5.9257f, 14.0988f, 7.6324f, 12.9507f, 9.4566f, 12.234f)
                curveTo(9.4373f, 11.9865f, 9.4209f, 11.7206f, 9.4037f, 11.4395f)
                lineTo(9.3761f, 10.99f)
                curveTo(9.3621f, 10.7629f, 9.3537f, 10.6342f, 9.3403f, 10.538f)
                curveTo(9.3343f, 10.4948f, 9.3288f, 10.4707f, 9.3252f, 10.4576f)
                curveTo(9.3221f, 10.4463f, 9.3203f, 10.4431f, 9.3202f, 10.4429f)
                curveTo(9.3201f, 10.4426f, 9.3187f, 10.4396f, 9.3125f, 10.4316f)
                curveTo(9.3051f, 10.4219f, 9.29f, 10.4041f, 9.2602f, 10.3745f)
                curveTo(9.1932f, 10.3081f, 9.0979f, 10.2269f, 8.9266f, 10.0821f)
                lineTo(8.587f, 9.795f)
                curveTo(8.0522f, 9.3431f, 7.588f, 8.9507f, 7.2755f, 8.5967f)
                curveTo(7.2363f, 8.5524f, 7.1976f, 8.5064f, 7.1599f, 8.4589f)
                close()
                moveTo(11.0329f, 12.8376f)
                curveTo(11.0498f, 12.7239f, 11.0408f, 12.6045f, 11.0015f, 12.4881f)
                curveTo(10.9949f, 12.4686f, 10.9876f, 12.4495f, 10.9796f, 12.4309f)
                curveTo(10.9499f, 12.1345f, 10.9264f, 11.7634f, 10.8974f, 11.2913f)
                lineTo(10.8733f, 10.898f)
                curveTo(10.8715f, 10.8701f, 10.8699f, 10.8421f, 10.8682f, 10.8139f)
                curveTo(10.848f, 10.4691f, 10.8266f, 10.1032f, 10.6631f, 9.7747f)
                curveTo(10.4984f, 9.4437f, 10.2186f, 9.2085f, 9.9582f, 8.9897f)
                curveTo(9.9369f, 8.9719f, 9.9158f, 8.9541f, 9.8949f, 8.9365f)
                lineTo(9.5989f, 8.6862f)
                curveTo(9.0078f, 8.1867f, 8.6307f, 7.8653f, 8.4001f, 7.6041f)
                curveTo(8.2902f, 7.4797f, 8.2464f, 7.404f, 8.2298f, 7.3653f)
                curveTo(8.2278f, 7.3607f, 8.2264f, 7.3568f, 8.2253f, 7.3538f)
                curveTo(8.2258f, 7.3532f, 8.2263f, 7.3526f, 8.2269f, 7.3519f)
                curveTo(8.2492f, 7.3258f, 8.3076f, 7.2713f, 8.445f, 7.1903f)
                curveTo(8.7351f, 7.0195f, 9.1816f, 6.8388f, 9.888f, 6.5565f)
                lineTo(10.241f, 6.4155f)
                curveTo(10.2663f, 6.4054f, 10.2919f, 6.3952f, 10.3177f, 6.385f)
                curveTo(10.6256f, 6.2632f, 10.9686f, 6.1274f, 11.2271f, 5.8586f)
                curveTo(11.4821f, 5.5932f, 11.6088f, 5.2453f, 11.7251f, 4.9261f)
                curveTo(11.7349f, 4.8992f, 11.7446f, 4.8725f, 11.7543f, 4.8461f)
                lineTo(11.8891f, 4.4796f)
                curveTo(12.1583f, 3.7477f, 12.3326f, 3.2794f, 12.4985f, 2.9741f)
                curveTo(12.5597f, 2.8614f, 12.6048f, 2.7995f, 12.6331f, 2.7669f)
                curveTo(12.6701f, 2.789f, 12.7321f, 2.8337f, 12.8252f, 2.9214f)
                curveTo(13.0779f, 3.1596f, 13.3895f, 3.5499f, 13.8734f, 4.1612f)
                lineTo(14.1157f, 4.4673f)
                curveTo(14.1332f, 4.4893f, 14.1507f, 4.5116f, 14.1684f, 4.5341f)
                curveTo(14.3783f, 4.801f, 14.6072f, 5.092f, 14.9325f, 5.2645f)
                curveTo(15.2619f, 5.4393f, 15.6303f, 5.4611f, 15.9607f, 5.4806f)
                curveTo(15.9885f, 5.4822f, 16.016f, 5.4838f, 16.0431f, 5.4855f)
                lineTo(16.4225f, 5.5092f)
                curveTo(17.1815f, 5.5566f, 17.6621f, 5.5887f, 17.9908f, 5.6604f)
                curveTo(18.1467f, 5.6943f, 18.219f, 5.7278f, 18.2482f, 5.7456f)
                curveTo(18.2488f, 5.746f, 18.2494f, 5.7463f, 18.25f, 5.7467f)
                curveTo(18.2499f, 5.7499f, 18.2497f, 5.7539f, 18.2493f, 5.7589f)
                curveTo(18.2456f, 5.8009f, 18.2275f, 5.8865f, 18.1619f, 6.0392f)
                curveTo(18.0242f, 6.3595f, 17.7661f, 6.7827f, 17.3603f, 7.442f)
                lineTo(17.1571f, 7.7722f)
                curveTo(17.1427f, 7.7956f, 17.1282f, 7.819f, 17.1136f, 7.8426f)
                curveTo(16.9344f, 8.1319f, 16.7419f, 8.4426f, 16.6886f, 8.8084f)
                curveTo(16.6357f, 9.1715f, 16.7294f, 9.5258f, 16.8177f, 9.8597f)
                curveTo(16.8249f, 9.887f, 16.8321f, 9.9142f, 16.8392f, 9.9412f)
                lineTo(16.9388f, 10.3224f)
                curveTo(17.1375f, 11.0826f, 17.2638f, 11.5729f, 17.3041f, 11.9256f)
                curveTo(17.3225f, 12.0869f, 17.3169f, 12.1729f, 17.3096f, 12.2144f)
                curveTo(17.2713f, 12.2193f, 17.1984f, 12.2215f, 17.0708f, 12.2062f)
                curveTo(16.7374f, 12.1665f, 16.2704f, 12.0393f, 15.534f, 11.8352f)
                lineTo(15.1661f, 11.7332f)
                curveTo(15.1395f, 11.7258f, 15.1125f, 11.7182f, 15.0853f, 11.7105f)
                curveTo(14.7669f, 11.6211f, 14.4087f, 11.5204f, 14.0413f, 11.5793f)
                curveTo(13.6739f, 11.6382f, 13.3651f, 11.8457f, 13.0906f, 12.0302f)
                curveTo(13.067f, 12.046f, 13.0438f, 12.0616f, 13.0208f, 12.077f)
                lineTo(12.703f, 12.2888f)
                curveTo(12.0671f, 12.7129f, 11.663f, 12.9798f, 11.3586f, 13.1217f)
                curveTo(11.2425f, 13.1759f, 11.1726f, 13.1967f, 11.1346f, 13.2041f)
                curveTo(11.1148f, 13.1668f, 11.0828f, 13.0869f, 11.0502f, 12.9286f)
                curveTo(11.0441f, 12.8994f, 11.0384f, 12.8691f, 11.0329f, 12.8376f)
                close()
                moveTo(11.0969f, 13.2068f)
                curveTo(11.0974f, 13.2061f, 11.1023f, 13.2058f, 11.1104f, 13.2076f)
                curveTo(11.1005f, 13.2083f, 11.0964f, 13.2074f, 11.0969f, 13.2068f)
                close()
                moveTo(11.1474f, 13.2252f)
                curveTo(11.1526f, 13.2293f, 11.1548f, 13.2324f, 11.1546f, 13.2329f)
                curveTo(11.1545f, 13.2335f, 11.1519f, 13.2314f, 11.1474f, 13.2252f)
                close()
                moveTo(17.2997f, 12.2477f)
                curveTo(17.2993f, 12.2472f, 17.3005f, 12.2436f, 17.3041f, 12.2381f)
                curveTo(17.3018f, 12.2454f, 17.3f, 12.2482f, 17.2997f, 12.2477f)
                close()
                moveTo(17.3334f, 12.2102f)
                curveTo(17.3405f, 12.2059f, 17.3453f, 12.2047f, 17.346f, 12.2052f)
                curveTo(17.3466f, 12.2057f, 17.3431f, 12.2078f, 17.3334f, 12.2102f)
                close()
                moveTo(12.6688f, 2.7341f)
                curveTo(12.6688f, 2.7347f, 12.6656f, 2.7373f, 12.6592f, 2.7404f)
                curveTo(12.6656f, 2.735f, 12.6687f, 2.7335f, 12.6688f, 2.7341f)
                close()
                moveTo(12.6f, 2.7498f)
                curveTo(12.593f, 2.7489f, 12.5891f, 2.7474f, 12.5889f, 2.7468f)
                curveTo(12.5888f, 2.7463f, 12.5923f, 2.7467f, 12.6f, 2.7498f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.2808f, 16.0f)
                curveTo(10.2808f, 16.0f, 10.9135f, 17.3908f, 11.6935f, 17.8692f)
                curveTo(12.4735f, 18.3475f, 14.0f, 18.2808f, 14.0f, 18.2808f)
                curveTo(14.0f, 18.2808f, 12.6092f, 18.9135f, 12.1308f, 19.6935f)
                curveTo(11.6525f, 20.4735f, 11.7192f, 22.0f, 11.7192f, 22.0f)
                curveTo(11.7192f, 22.0f, 11.0865f, 20.6092f, 10.3065f, 20.1308f)
                curveTo(9.5265f, 19.6525f, 8.0f, 19.7192f, 8.0f, 19.7192f)
                curveTo(8.0f, 19.7192f, 9.3908f, 19.0865f, 9.8692f, 18.3065f)
                curveTo(10.3475f, 17.5265f, 10.2808f, 16.0f, 10.2808f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.4795f, 15.0f)
                curveTo(18.4795f, 15.0f, 18.0577f, 15.9272f, 17.5377f, 16.2461f)
                curveTo(17.0177f, 16.565f, 16.0f, 16.5205f, 16.0f, 16.5205f)
                curveTo(16.0f, 16.5205f, 16.9272f, 16.9423f, 17.2461f, 17.4623f)
                curveTo(17.565f, 17.9823f, 17.5205f, 19.0f, 17.5205f, 19.0f)
                curveTo(17.5205f, 19.0f, 17.9423f, 18.0728f, 18.4623f, 17.7539f)
                curveTo(18.9823f, 17.435f, 20.0f, 17.4795f, 20.0f, 17.4795f)
                curveTo(20.0f, 17.4795f, 19.0728f, 17.0577f, 18.7539f, 16.5377f)
                curveTo(18.435f, 16.0177f, 18.4795f, 15.0f, 18.4795f, 15.0f)
                close()
            }
        }
            .build()
        return _starFall!!
    }

private var _starFall: ImageVector? = null
