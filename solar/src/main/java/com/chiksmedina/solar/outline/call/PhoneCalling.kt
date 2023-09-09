package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

public val CallGroup.PhoneCalling: ImageVector
    get() {
        if (_phoneCalling != null) {
            return _phoneCalling!!
        }
        _phoneCalling = Builder(name = "PhoneCalling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.7176f, 3.0921f)
                curveTo(5.9438f, 1.8012f, 7.972f, 2.0431f, 8.9856f, 3.4766f)
                lineTo(10.2466f, 5.2601f)
                curveTo(11.0573f, 6.4068f, 10.9889f, 8.001f, 10.0213f, 9.0197f)
                lineTo(9.7764f, 9.2774f)
                curveTo(9.7758f, 9.2792f, 9.775f, 9.2811f, 9.7743f, 9.2832f)
                curveTo(9.7614f, 9.3196f, 9.7286f, 9.4354f, 9.7608f, 9.6551f)
                curveTo(9.8276f, 10.1107f, 10.1792f, 11.0364f, 11.6069f, 12.5394f)
                curveTo(13.039f, 14.0472f, 13.9077f, 14.4025f, 14.3103f, 14.4679f)
                curveTo(14.4839f, 14.4961f, 14.5748f, 14.4716f, 14.6037f, 14.4614f)
                lineTo(15.0123f, 14.0312f)
                curveTo(15.8861f, 13.1113f, 17.2485f, 12.9301f, 18.3469f, 13.5623f)
                lineTo(20.2574f, 14.662f)
                curveTo(21.8904f, 15.6019f, 22.2704f, 17.9011f, 20.9654f, 19.275f)
                lineTo(19.5449f, 20.7705f)
                curveTo(19.1015f, 21.2373f, 18.497f, 21.6358f, 17.7499f, 21.7095f)
                curveTo(15.9261f, 21.8895f, 11.7009f, 21.655f, 7.2715f, 16.9917f)
                curveTo(3.1384f, 12.6403f, 2.3532f, 8.8554f, 2.2539f, 7.0061f)
                lineTo(2.92f, 6.9704f)
                lineTo(2.2539f, 7.0061f)
                curveTo(2.2049f, 6.0925f, 2.6122f, 5.3088f, 3.148f, 4.7446f)
                lineTo(4.7176f, 3.0921f)
                close()
                moveTo(7.7608f, 4.3426f)
                curveTo(7.2485f, 3.618f, 6.3281f, 3.5747f, 5.8052f, 4.1252f)
                lineTo(4.2356f, 5.7777f)
                curveTo(3.9042f, 6.1266f, 3.7304f, 6.5265f, 3.7518f, 6.9258f)
                curveTo(3.8328f, 8.4356f, 4.483f, 11.8779f, 8.3591f, 15.9587f)
                curveTo(12.4233f, 20.2375f, 16.1676f, 20.3584f, 17.6026f, 20.2167f)
                curveTo(17.8863f, 20.1887f, 18.1783f, 20.0313f, 18.4573f, 19.7375f)
                lineTo(19.8779f, 18.2419f)
                curveTo(20.4907f, 17.5968f, 20.33f, 16.4345f, 19.5092f, 15.962f)
                lineTo(17.5987f, 14.8624f)
                curveTo(17.086f, 14.5673f, 16.4854f, 14.6584f, 16.0999f, 15.0642f)
                lineTo(15.6445f, 15.5437f)
                lineTo(15.1173f, 15.043f)
                curveTo(15.6445f, 15.5438f, 15.6438f, 15.5445f, 15.6431f, 15.5452f)
                lineTo(15.6417f, 15.5467f)
                lineTo(15.6387f, 15.5498f)
                lineTo(15.6324f, 15.5562f)
                lineTo(15.618f, 15.5704f)
                curveTo(15.6077f, 15.5803f, 15.5958f, 15.5913f, 15.5824f, 15.6031f)
                curveTo(15.5555f, 15.6266f, 15.5223f, 15.6535f, 15.4823f, 15.6819f)
                curveTo(15.4022f, 15.7387f, 15.2955f, 15.8012f, 15.1606f, 15.8544f)
                curveTo(14.8846f, 15.9633f, 14.5201f, 16.0216f, 14.0698f, 15.9485f)
                curveTo(13.1923f, 15.806f, 12.0422f, 15.1757f, 10.5193f, 13.5724f)
                curveTo(8.992f, 11.9644f, 8.4074f, 10.7647f, 8.2767f, 9.8726f)
                curveTo(8.2102f, 9.4185f, 8.2634f, 9.0549f, 8.3611f, 8.7803f)
                curveTo(8.4092f, 8.6453f, 8.4659f, 8.5377f, 8.5182f, 8.4559f)
                curveTo(8.5443f, 8.4151f, 8.5692f, 8.381f, 8.5911f, 8.3532f)
                curveTo(8.6021f, 8.3393f, 8.6124f, 8.327f, 8.6218f, 8.3163f)
                lineTo(8.6351f, 8.3013f)
                lineTo(8.6412f, 8.2947f)
                lineTo(8.6441f, 8.2915f)
                lineTo(8.6455f, 8.29f)
                curveTo(8.6462f, 8.2893f, 8.6469f, 8.2886f, 9.1785f, 8.7936f)
                lineTo(8.6469f, 8.2886f)
                lineTo(8.9337f, 7.9866f)
                curveTo(9.3792f, 7.5175f, 9.444f, 6.7232f, 9.0218f, 6.1261f)
                lineTo(7.7608f, 4.3426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2595f, 1.8801f)
                curveTo(13.3257f, 1.4712f, 13.7122f, 1.1938f, 14.1211f, 1.26f)
                curveTo(14.1464f, 1.2649f, 14.2279f, 1.2801f, 14.2705f, 1.2896f)
                curveTo(14.3559f, 1.3086f, 14.4749f, 1.3378f, 14.6233f, 1.3811f)
                curveTo(14.9201f, 1.4675f, 15.3347f, 1.6099f, 15.8323f, 1.8381f)
                curveTo(16.8286f, 2.2948f, 18.1544f, 3.0938f, 19.5302f, 4.4696f)
                curveTo(20.906f, 5.8454f, 21.705f, 7.1712f, 22.1617f, 8.1675f)
                curveTo(22.3899f, 8.6651f, 22.5323f, 9.0797f, 22.6187f, 9.3765f)
                curveTo(22.6619f, 9.5249f, 22.6912f, 9.6439f, 22.7102f, 9.7293f)
                curveTo(22.7197f, 9.7719f, 22.7267f, 9.8062f, 22.7315f, 9.8315f)
                lineTo(22.7373f, 9.8627f)
                curveTo(22.8034f, 10.2716f, 22.5286f, 10.6741f, 22.1197f, 10.7403f)
                curveTo(21.712f, 10.8063f, 21.3279f, 10.5303f, 21.2601f, 10.1233f)
                curveTo(21.258f, 10.1124f, 21.2522f, 10.083f, 21.2461f, 10.0553f)
                curveTo(21.2337f, 9.9999f, 21.2124f, 9.9121f, 21.1786f, 9.796f)
                curveTo(21.1109f, 9.5636f, 20.9934f, 9.2183f, 20.7982f, 8.7926f)
                curveTo(20.4084f, 7.9423f, 19.7074f, 6.7681f, 18.4695f, 5.5303f)
                curveTo(17.2317f, 4.2924f, 16.0575f, 3.5914f, 15.2072f, 3.2016f)
                curveTo(14.7815f, 3.0064f, 14.4362f, 2.8889f, 14.2038f, 2.8212f)
                curveTo(14.0877f, 2.7874f, 13.9417f, 2.7539f, 13.8863f, 2.7415f)
                curveTo(13.4793f, 2.6737f, 13.1935f, 2.2878f, 13.2595f, 1.8801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.4861f, 5.3295f)
                curveTo(13.5999f, 4.9313f, 14.015f, 4.7007f, 14.4133f, 4.8144f)
                lineTo(14.2072f, 5.5356f)
                curveTo(14.4133f, 4.8144f, 14.4136f, 4.8145f, 14.414f, 4.8147f)
                lineTo(14.4147f, 4.8149f)
                lineTo(14.4162f, 4.8153f)
                lineTo(14.4196f, 4.8163f)
                lineTo(14.4273f, 4.8186f)
                lineTo(14.4471f, 4.8248f)
                curveTo(14.4622f, 4.8296f, 14.481f, 4.8359f, 14.5035f, 4.8438f)
                curveTo(14.5484f, 4.8598f, 14.6077f, 4.8824f, 14.6805f, 4.9136f)
                curveTo(14.8262f, 4.9761f, 15.0253f, 5.0725f, 15.2698f, 5.2172f)
                curveTo(15.7593f, 5.5069f, 16.4275f, 5.9881f, 17.2124f, 6.773f)
                curveTo(17.9974f, 7.558f, 18.4786f, 8.2262f, 18.7683f, 8.7156f)
                curveTo(18.913f, 8.9602f, 19.0094f, 9.1592f, 19.0718f, 9.3049f)
                curveTo(19.103f, 9.3777f, 19.1257f, 9.4371f, 19.1416f, 9.482f)
                curveTo(19.1496f, 9.5044f, 19.1559f, 9.5233f, 19.1607f, 9.5384f)
                lineTo(19.1669f, 9.5581f)
                lineTo(19.1692f, 9.5659f)
                lineTo(19.1702f, 9.5692f)
                lineTo(19.1706f, 9.5708f)
                lineTo(19.1708f, 9.5715f)
                curveTo(19.1709f, 9.5718f, 19.171f, 9.5722f, 18.4499f, 9.7782f)
                lineTo(19.171f, 9.5722f)
                curveTo(19.2848f, 9.9705f, 19.0542f, 10.3856f, 18.6559f, 10.4994f)
                curveTo(18.261f, 10.6122f, 17.8496f, 10.3864f, 17.7317f, 9.9944f)
                lineTo(17.728f, 9.9836f)
                curveTo(17.7227f, 9.9686f, 17.7116f, 9.939f, 17.6931f, 9.8958f)
                curveTo(17.6561f, 9.8095f, 17.589f, 9.6682f, 17.4774f, 9.4796f)
                curveTo(17.2544f, 9.1029f, 16.8517f, 8.5336f, 16.1518f, 7.8337f)
                curveTo(15.4518f, 7.1337f, 14.8826f, 6.731f, 14.5058f, 6.5081f)
                curveTo(14.3172f, 6.3965f, 14.176f, 6.3293f, 14.0897f, 6.2923f)
                curveTo(14.0465f, 6.2738f, 14.0169f, 6.2628f, 14.0019f, 6.2575f)
                lineTo(13.9911f, 6.2538f)
                curveTo(13.599f, 6.1359f, 13.3733f, 5.7245f, 13.4861f, 5.3295f)
                close()
            }
        }
        .build()
        return _phoneCalling!!
    }

private var _phoneCalling: ImageVector? = null
