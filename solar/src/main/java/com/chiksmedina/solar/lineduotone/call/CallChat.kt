package com.chiksmedina.solar.lineduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.CallGroup

val CallGroup.CallChat: ImageVector
    get() {
        if (_callChat != null) {
            return _callChat!!
        }
        _callChat = Builder(
            name = "CallChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.0f)
                curveTo(19.7614f, 12.0f, 22.0f, 9.7614f, 22.0f, 7.0f)
                curveTo(22.0f, 4.2386f, 19.7614f, 2.0f, 17.0f, 2.0f)
                curveTo(14.2386f, 2.0f, 12.0f, 4.2386f, 12.0f, 7.0f)
                curveTo(12.0f, 7.7998f, 12.1878f, 8.5558f, 12.5217f, 9.2262f)
                curveTo(12.6105f, 9.4044f, 12.64f, 9.608f, 12.5886f, 9.8003f)
                lineTo(12.2908f, 10.9133f)
                curveTo(12.1615f, 11.3965f, 12.6035f, 11.8385f, 13.0867f, 11.7092f)
                lineTo(14.1997f, 11.4114f)
                curveTo(14.392f, 11.36f, 14.5956f, 11.3895f, 14.7738f, 11.4783f)
                curveTo(15.4442f, 11.8122f, 16.2002f, 12.0f, 17.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.1007f, 16.0272f)
                lineTo(13.5569f, 15.5107f)
                lineTo(13.5569f, 15.5107f)
                lineTo(14.1007f, 16.0272f)
                close()
                moveTo(14.5562f, 15.5477f)
                lineTo(15.1f, 16.0642f)
                lineTo(15.1f, 16.0642f)
                lineTo(14.5562f, 15.5477f)
                close()
                moveTo(16.9728f, 15.2123f)
                lineTo(16.5987f, 15.8623f)
                lineTo(16.5987f, 15.8623f)
                lineTo(16.9728f, 15.2123f)
                close()
                moveTo(18.8833f, 16.312f)
                lineTo(18.5092f, 16.962f)
                lineTo(18.8833f, 16.312f)
                close()
                moveTo(19.4217f, 19.7584f)
                lineTo(19.9655f, 20.2749f)
                lineTo(19.9655f, 20.2749f)
                lineTo(19.4217f, 19.7584f)
                close()
                moveTo(18.0011f, 21.254f)
                lineTo(17.4573f, 20.7375f)
                lineTo(17.4573f, 20.7375f)
                lineTo(18.0011f, 21.254f)
                close()
                moveTo(16.6763f, 21.9631f)
                lineTo(16.7499f, 22.7095f)
                lineTo(16.7499f, 22.7095f)
                lineTo(16.6763f, 21.9631f)
                close()
                moveTo(6.8154f, 17.4752f)
                lineTo(7.3591f, 16.9587f)
                lineTo(6.8154f, 17.4752f)
                close()
                moveTo(2.0029f, 7.9659f)
                lineTo(1.254f, 8.0061f)
                lineTo(1.254f, 8.0061f)
                lineTo(2.0029f, 7.9659f)
                close()
                moveTo(8.4775f, 9.5031f)
                lineTo(9.0213f, 10.0196f)
                lineTo(9.0213f, 10.0196f)
                lineTo(8.4775f, 9.5031f)
                close()
                moveTo(8.6342f, 6.6931f)
                lineTo(9.2466f, 6.2601f)
                lineTo(9.2466f, 6.2601f)
                lineTo(8.6342f, 6.6931f)
                close()
                moveTo(7.3733f, 4.9096f)
                lineTo(6.7609f, 5.3426f)
                lineTo(6.7609f, 5.3426f)
                lineTo(7.3733f, 4.9096f)
                close()
                moveTo(4.2614f, 4.6086f)
                lineTo(4.8052f, 5.1252f)
                lineTo(4.8052f, 5.1252f)
                lineTo(4.2614f, 4.6086f)
                close()
                moveTo(2.6918f, 6.2611f)
                lineTo(2.1481f, 5.7446f)
                lineTo(2.1481f, 5.7446f)
                lineTo(2.6918f, 6.2611f)
                close()
                moveTo(10.0631f, 14.0559f)
                lineTo(10.6069f, 13.5394f)
                lineTo(10.0631f, 14.0559f)
                close()
                moveTo(14.6445f, 16.5437f)
                lineTo(15.1f, 16.0642f)
                lineTo(14.0124f, 15.0312f)
                lineTo(13.5569f, 15.5107f)
                lineTo(14.6445f, 16.5437f)
                close()
                moveTo(16.5987f, 15.8623f)
                lineTo(18.5092f, 16.962f)
                lineTo(19.2575f, 15.662f)
                lineTo(17.347f, 14.5623f)
                lineTo(16.5987f, 15.8623f)
                close()
                moveTo(18.8779f, 19.2419f)
                lineTo(17.4573f, 20.7375f)
                lineTo(18.5449f, 21.7705f)
                lineTo(19.9655f, 20.2749f)
                lineTo(18.8779f, 19.2419f)
                close()
                moveTo(16.6026f, 21.2167f)
                curveTo(15.1676f, 21.3584f, 11.4233f, 21.2375f, 7.3591f, 16.9587f)
                lineTo(6.2716f, 17.9917f)
                curveTo(10.7009f, 22.655f, 14.9261f, 22.8895f, 16.7499f, 22.7095f)
                lineTo(16.6026f, 21.2167f)
                close()
                moveTo(7.3591f, 16.9587f)
                curveTo(3.483f, 12.8778f, 2.8328f, 9.4356f, 2.7518f, 7.9257f)
                lineTo(1.254f, 8.0061f)
                curveTo(1.3532f, 9.8554f, 2.1384f, 13.6403f, 6.2716f, 17.9917f)
                lineTo(7.3591f, 16.9587f)
                close()
                moveTo(8.7345f, 10.3216f)
                lineTo(9.0213f, 10.0196f)
                lineTo(7.9337f, 8.9866f)
                lineTo(7.6469f, 9.2886f)
                lineTo(8.7345f, 10.3216f)
                close()
                moveTo(9.2466f, 6.2601f)
                lineTo(7.9857f, 4.4766f)
                lineTo(6.7609f, 5.3426f)
                lineTo(8.0218f, 7.1261f)
                lineTo(9.2466f, 6.2601f)
                close()
                moveTo(3.7177f, 4.0921f)
                lineTo(2.1481f, 5.7446f)
                lineTo(3.2356f, 6.7776f)
                lineTo(4.8052f, 5.1252f)
                lineTo(3.7177f, 4.0921f)
                close()
                moveTo(8.1907f, 9.8051f)
                curveTo(7.6469f, 9.2886f, 7.6462f, 9.2893f, 7.6455f, 9.29f)
                curveTo(7.6453f, 9.2903f, 7.6446f, 9.291f, 7.6441f, 9.2915f)
                curveTo(7.6432f, 9.2925f, 7.6422f, 9.2936f, 7.6412f, 9.2946f)
                curveTo(7.6392f, 9.2968f, 7.6372f, 9.299f, 7.6351f, 9.3013f)
                curveTo(7.6309f, 9.3059f, 7.6265f, 9.3109f, 7.6218f, 9.3162f)
                curveTo(7.6124f, 9.327f, 7.6021f, 9.3393f, 7.5912f, 9.3532f)
                curveTo(7.5692f, 9.381f, 7.5443f, 9.4151f, 7.5182f, 9.4559f)
                curveTo(7.4659f, 9.5376f, 7.4092f, 9.6453f, 7.3611f, 9.7803f)
                curveTo(7.2634f, 10.0549f, 7.2102f, 10.4185f, 7.2767f, 10.8726f)
                curveTo(7.4074f, 11.7647f, 7.992f, 12.9644f, 9.5193f, 14.5724f)
                lineTo(10.6069f, 13.5394f)
                curveTo(9.1793f, 12.0363f, 8.8276f, 11.1106f, 8.7609f, 10.6551f)
                curveTo(8.7287f, 10.4354f, 8.7614f, 10.3196f, 8.7743f, 10.2832f)
                curveTo(8.7816f, 10.2628f, 8.7864f, 10.2571f, 8.7817f, 10.2644f)
                curveTo(8.7794f, 10.2679f, 8.7749f, 10.2745f, 8.7674f, 10.2841f)
                curveTo(8.7636f, 10.2888f, 8.759f, 10.2944f, 8.7536f, 10.3006f)
                curveTo(8.7509f, 10.3038f, 8.7479f, 10.3071f, 8.7448f, 10.3106f)
                curveTo(8.7432f, 10.3123f, 8.7415f, 10.3141f, 8.7398f, 10.3159f)
                curveTo(8.739f, 10.3169f, 8.7381f, 10.3178f, 8.7372f, 10.3187f)
                curveTo(8.7368f, 10.3192f, 8.7361f, 10.3199f, 8.7359f, 10.3202f)
                curveTo(8.7352f, 10.3209f, 8.7345f, 10.3216f, 8.1907f, 9.8051f)
                close()
                moveTo(9.5193f, 14.5724f)
                curveTo(11.0422f, 16.1757f, 12.1923f, 16.806f, 13.0698f, 16.9485f)
                curveTo(13.5201f, 17.0216f, 13.8846f, 16.9632f, 14.1606f, 16.8544f)
                curveTo(14.2955f, 16.8012f, 14.4022f, 16.7387f, 14.4823f, 16.6819f)
                curveTo(14.5223f, 16.6535f, 14.5556f, 16.6266f, 14.5824f, 16.6031f)
                curveTo(14.5959f, 16.5913f, 14.6077f, 16.5803f, 14.618f, 16.5703f)
                curveTo(14.6232f, 16.5654f, 14.628f, 16.5606f, 14.6324f, 16.5562f)
                curveTo(14.6346f, 16.554f, 14.6367f, 16.5518f, 14.6387f, 16.5497f)
                curveTo(14.6397f, 16.5487f, 14.6407f, 16.5477f, 14.6417f, 16.5467f)
                curveTo(14.6422f, 16.5462f, 14.6429f, 16.5454f, 14.6431f, 16.5452f)
                curveTo(14.6438f, 16.5444f, 14.6445f, 16.5437f, 14.1007f, 16.0272f)
                curveTo(13.5569f, 15.5107f, 13.5576f, 15.51f, 13.5583f, 15.5093f)
                curveTo(13.5585f, 15.509f, 13.5592f, 15.5083f, 13.5596f, 15.5078f)
                curveTo(13.5605f, 15.5069f, 13.5614f, 15.506f, 13.5623f, 15.5051f)
                curveTo(13.5641f, 15.5033f, 13.5658f, 15.5015f, 13.5674f, 15.4998f)
                curveTo(13.5708f, 15.4965f, 13.574f, 15.4933f, 13.577f, 15.4904f)
                curveTo(13.583f, 15.4846f, 13.5885f, 15.4796f, 13.5933f, 15.4754f)
                curveTo(13.6028f, 15.467f, 13.6099f, 15.4616f, 13.6145f, 15.4583f)
                curveTo(13.6239f, 15.4517f, 13.6229f, 15.454f, 13.6102f, 15.459f)
                curveTo(13.5909f, 15.4666f, 13.5f, 15.4987f, 13.3103f, 15.4679f)
                curveTo(12.9077f, 15.4025f, 12.0391f, 15.0472f, 10.6069f, 13.5394f)
                lineTo(9.5193f, 14.5724f)
                close()
                moveTo(7.9857f, 4.4766f)
                curveTo(6.9721f, 3.0431f, 4.9438f, 2.8012f, 3.7177f, 4.0921f)
                lineTo(4.8052f, 5.1252f)
                curveTo(5.3281f, 4.5747f, 6.2485f, 4.6179f, 6.7609f, 5.3426f)
                lineTo(7.9857f, 4.4766f)
                close()
                moveTo(2.7518f, 7.9257f)
                curveTo(2.7304f, 7.5264f, 2.9042f, 7.1265f, 3.2356f, 6.7776f)
                lineTo(2.1481f, 5.7446f)
                curveTo(1.6122f, 6.3088f, 1.2049f, 7.0925f, 1.254f, 8.0061f)
                lineTo(2.7518f, 7.9257f)
                close()
                moveTo(17.4573f, 20.7375f)
                curveTo(17.1783f, 21.0313f, 16.8864f, 21.1887f, 16.6026f, 21.2167f)
                lineTo(16.7499f, 22.7095f)
                curveTo(17.497f, 22.6357f, 18.1016f, 22.2373f, 18.5449f, 21.7705f)
                lineTo(17.4573f, 20.7375f)
                close()
                moveTo(9.0213f, 10.0196f)
                curveTo(9.9889f, 9.0009f, 10.0574f, 7.4068f, 9.2466f, 6.2601f)
                lineTo(8.0218f, 7.1261f)
                curveTo(8.444f, 7.7231f, 8.3793f, 8.5175f, 7.9337f, 8.9866f)
                lineTo(9.0213f, 10.0196f)
                close()
                moveTo(18.5092f, 16.962f)
                curveTo(19.33f, 17.4345f, 19.4907f, 18.5968f, 18.8779f, 19.2419f)
                lineTo(19.9655f, 20.2749f)
                curveTo(21.2704f, 18.901f, 20.8904f, 16.6019f, 19.2575f, 15.662f)
                lineTo(18.5092f, 16.962f)
                close()
                moveTo(15.1f, 16.0642f)
                curveTo(15.4854f, 15.6584f, 16.086f, 15.5672f, 16.5987f, 15.8623f)
                lineTo(17.347f, 14.5623f)
                curveTo(16.2485f, 13.93f, 14.8861f, 14.1113f, 14.0124f, 15.0312f)
                lineTo(15.1f, 16.0642f)
                close()
            }
        }
            .build()
        return _callChat!!
    }

private var _callChat: ImageVector? = null
