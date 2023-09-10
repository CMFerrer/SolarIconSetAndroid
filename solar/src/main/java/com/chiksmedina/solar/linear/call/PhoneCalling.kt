package com.chiksmedina.solar.linear.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.CallGroup

val CallGroup.PhoneCalling: ImageVector
    get() {
        if (_phoneCalling != null) {
            return _phoneCalling!!
        }
        _phoneCalling = Builder(
            name = "PhoneCalling", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5001f, 2.0001f)
                curveTo(13.5001f, 2.0001f, 15.8335f, 2.2122f, 18.8034f, 5.182f)
                curveTo(21.7732f, 8.1519f, 21.9853f, 10.4853f, 21.9853f, 10.4853f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.207f, 5.5356f)
                curveTo(14.207f, 5.5356f, 15.197f, 5.8185f, 16.6819f, 7.3034f)
                curveTo(18.1668f, 8.7883f, 18.4497f, 9.7783f, 18.4497f, 9.7783f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.1007f, 15.0272f)
                lineTo(14.5569f, 14.5107f)
                lineTo(14.5569f, 14.5107f)
                lineTo(15.1007f, 15.0272f)
                close()
                moveTo(15.5562f, 14.5477f)
                lineTo(16.1f, 15.0642f)
                lineTo(16.1f, 15.0642f)
                lineTo(15.5562f, 14.5477f)
                close()
                moveTo(17.9728f, 14.2123f)
                lineTo(17.5987f, 14.8623f)
                lineTo(17.5987f, 14.8623f)
                lineTo(17.9728f, 14.2123f)
                close()
                moveTo(19.8833f, 15.312f)
                lineTo(19.5092f, 15.962f)
                lineTo(19.8833f, 15.312f)
                close()
                moveTo(20.4217f, 18.7584f)
                lineTo(20.9655f, 19.2749f)
                lineTo(20.9655f, 19.2749f)
                lineTo(20.4217f, 18.7584f)
                close()
                moveTo(19.0011f, 20.254f)
                lineTo(18.4573f, 19.7375f)
                lineTo(18.4573f, 19.7375f)
                lineTo(19.0011f, 20.254f)
                close()
                moveTo(17.6763f, 20.9631f)
                lineTo(17.7499f, 21.7095f)
                lineTo(17.7499f, 21.7095f)
                lineTo(17.6763f, 20.9631f)
                close()
                moveTo(7.8154f, 16.4752f)
                lineTo(8.3591f, 15.9587f)
                lineTo(7.8154f, 16.4752f)
                close()
                moveTo(3.0029f, 6.9659f)
                lineTo(2.254f, 7.0061f)
                lineTo(2.254f, 7.0061f)
                lineTo(3.0029f, 6.9659f)
                close()
                moveTo(9.4775f, 8.5031f)
                lineTo(10.0213f, 9.0196f)
                lineTo(10.0213f, 9.0196f)
                lineTo(9.4775f, 8.5031f)
                close()
                moveTo(9.6342f, 5.6931f)
                lineTo(10.2466f, 5.2601f)
                lineTo(10.2466f, 5.2601f)
                lineTo(9.6342f, 5.6931f)
                close()
                moveTo(8.3733f, 3.9096f)
                lineTo(7.7609f, 4.3426f)
                lineTo(7.7609f, 4.3426f)
                lineTo(8.3733f, 3.9096f)
                close()
                moveTo(5.2614f, 3.6086f)
                lineTo(5.8052f, 4.1252f)
                lineTo(5.8052f, 4.1252f)
                lineTo(5.2614f, 3.6086f)
                close()
                moveTo(3.6918f, 5.2611f)
                lineTo(3.1481f, 4.7446f)
                lineTo(3.1481f, 4.7446f)
                lineTo(3.6918f, 5.2611f)
                close()
                moveTo(11.0631f, 13.0559f)
                lineTo(11.6069f, 12.5394f)
                lineTo(11.0631f, 13.0559f)
                close()
                moveTo(15.6445f, 15.5437f)
                lineTo(16.1f, 15.0642f)
                lineTo(15.0124f, 14.0312f)
                lineTo(14.5569f, 14.5107f)
                lineTo(15.6445f, 15.5437f)
                close()
                moveTo(17.5987f, 14.8623f)
                lineTo(19.5092f, 15.962f)
                lineTo(20.2575f, 14.662f)
                lineTo(18.347f, 13.5623f)
                lineTo(17.5987f, 14.8623f)
                close()
                moveTo(19.8779f, 18.2419f)
                lineTo(18.4573f, 19.7375f)
                lineTo(19.5449f, 20.7705f)
                lineTo(20.9655f, 19.2749f)
                lineTo(19.8779f, 18.2419f)
                close()
                moveTo(17.6026f, 20.2167f)
                curveTo(16.1676f, 20.3584f, 12.4233f, 20.2375f, 8.3591f, 15.9587f)
                lineTo(7.2716f, 16.9917f)
                curveTo(11.7009f, 21.655f, 15.9261f, 21.8895f, 17.7499f, 21.7095f)
                lineTo(17.6026f, 20.2167f)
                close()
                moveTo(8.3591f, 15.9587f)
                curveTo(4.483f, 11.8778f, 3.8328f, 8.4356f, 3.7518f, 6.9257f)
                lineTo(2.254f, 7.0061f)
                curveTo(2.3532f, 8.8554f, 3.1384f, 12.6403f, 7.2716f, 16.9917f)
                lineTo(8.3591f, 15.9587f)
                close()
                moveTo(9.7345f, 9.3216f)
                lineTo(10.0213f, 9.0196f)
                lineTo(8.9337f, 7.9866f)
                lineTo(8.6469f, 8.2886f)
                lineTo(9.7345f, 9.3216f)
                close()
                moveTo(10.2466f, 5.2601f)
                lineTo(8.9857f, 3.4766f)
                lineTo(7.7609f, 4.3426f)
                lineTo(9.0218f, 6.1261f)
                lineTo(10.2466f, 5.2601f)
                close()
                moveTo(4.7177f, 3.0921f)
                lineTo(3.1481f, 4.7446f)
                lineTo(4.2356f, 5.7776f)
                lineTo(5.8052f, 4.1252f)
                lineTo(4.7177f, 3.0921f)
                close()
                moveTo(9.1907f, 8.8051f)
                curveTo(8.6469f, 8.2886f, 8.6462f, 8.2893f, 8.6455f, 8.29f)
                curveTo(8.6453f, 8.2903f, 8.6446f, 8.291f, 8.6441f, 8.2915f)
                curveTo(8.6432f, 8.2925f, 8.6422f, 8.2936f, 8.6412f, 8.2946f)
                curveTo(8.6392f, 8.2968f, 8.6372f, 8.299f, 8.6351f, 8.3013f)
                curveTo(8.6309f, 8.3059f, 8.6265f, 8.3109f, 8.6218f, 8.3162f)
                curveTo(8.6124f, 8.327f, 8.6021f, 8.3393f, 8.5912f, 8.3532f)
                curveTo(8.5692f, 8.381f, 8.5443f, 8.4151f, 8.5182f, 8.4559f)
                curveTo(8.4659f, 8.5376f, 8.4092f, 8.6453f, 8.3611f, 8.7803f)
                curveTo(8.2634f, 9.0549f, 8.2102f, 9.4185f, 8.2767f, 9.8726f)
                curveTo(8.4074f, 10.7647f, 8.992f, 11.9644f, 10.5193f, 13.5724f)
                lineTo(11.6069f, 12.5394f)
                curveTo(10.1793f, 11.0363f, 9.8276f, 10.1106f, 9.7609f, 9.6551f)
                curveTo(9.7287f, 9.4354f, 9.7614f, 9.3196f, 9.7743f, 9.2832f)
                curveTo(9.7816f, 9.2628f, 9.7864f, 9.2571f, 9.7817f, 9.2644f)
                curveTo(9.7794f, 9.2679f, 9.7749f, 9.2745f, 9.7674f, 9.2841f)
                curveTo(9.7636f, 9.2888f, 9.759f, 9.2944f, 9.7536f, 9.3006f)
                curveTo(9.7509f, 9.3038f, 9.7479f, 9.3071f, 9.7448f, 9.3106f)
                curveTo(9.7432f, 9.3123f, 9.7415f, 9.3141f, 9.7398f, 9.3159f)
                curveTo(9.739f, 9.3169f, 9.7381f, 9.3178f, 9.7372f, 9.3187f)
                curveTo(9.7368f, 9.3192f, 9.7361f, 9.3199f, 9.7359f, 9.3202f)
                curveTo(9.7352f, 9.3209f, 9.7345f, 9.3216f, 9.1907f, 8.8051f)
                close()
                moveTo(10.5193f, 13.5724f)
                curveTo(12.0422f, 15.1757f, 13.1923f, 15.806f, 14.0698f, 15.9485f)
                curveTo(14.5201f, 16.0216f, 14.8846f, 15.9632f, 15.1606f, 15.8544f)
                curveTo(15.2955f, 15.8012f, 15.4022f, 15.7387f, 15.4823f, 15.6819f)
                curveTo(15.5223f, 15.6535f, 15.5556f, 15.6266f, 15.5824f, 15.6031f)
                curveTo(15.5959f, 15.5913f, 15.6077f, 15.5803f, 15.618f, 15.5703f)
                curveTo(15.6232f, 15.5654f, 15.628f, 15.5606f, 15.6324f, 15.5562f)
                curveTo(15.6346f, 15.554f, 15.6367f, 15.5518f, 15.6387f, 15.5497f)
                curveTo(15.6397f, 15.5487f, 15.6407f, 15.5477f, 15.6417f, 15.5467f)
                curveTo(15.6422f, 15.5462f, 15.6429f, 15.5454f, 15.6431f, 15.5452f)
                curveTo(15.6438f, 15.5444f, 15.6445f, 15.5437f, 15.1007f, 15.0272f)
                curveTo(14.5569f, 14.5107f, 14.5576f, 14.51f, 14.5583f, 14.5093f)
                curveTo(14.5585f, 14.509f, 14.5592f, 14.5083f, 14.5596f, 14.5078f)
                curveTo(14.5605f, 14.5069f, 14.5614f, 14.506f, 14.5623f, 14.5051f)
                curveTo(14.5641f, 14.5033f, 14.5658f, 14.5015f, 14.5674f, 14.4998f)
                curveTo(14.5708f, 14.4965f, 14.574f, 14.4933f, 14.577f, 14.4904f)
                curveTo(14.583f, 14.4846f, 14.5885f, 14.4796f, 14.5933f, 14.4754f)
                curveTo(14.6028f, 14.467f, 14.6099f, 14.4616f, 14.6145f, 14.4583f)
                curveTo(14.6239f, 14.4517f, 14.6229f, 14.454f, 14.6102f, 14.459f)
                curveTo(14.5909f, 14.4666f, 14.5f, 14.4987f, 14.3103f, 14.4679f)
                curveTo(13.9077f, 14.4025f, 13.0391f, 14.0472f, 11.6069f, 12.5394f)
                lineTo(10.5193f, 13.5724f)
                close()
                moveTo(8.9857f, 3.4766f)
                curveTo(7.9721f, 2.0431f, 5.9438f, 1.8012f, 4.7177f, 3.0921f)
                lineTo(5.8052f, 4.1252f)
                curveTo(6.3281f, 3.5747f, 7.2485f, 3.6179f, 7.7609f, 4.3426f)
                lineTo(8.9857f, 3.4766f)
                close()
                moveTo(3.7518f, 6.9257f)
                curveTo(3.7304f, 6.5264f, 3.9042f, 6.1265f, 4.2356f, 5.7776f)
                lineTo(3.1481f, 4.7446f)
                curveTo(2.6122f, 5.3088f, 2.2049f, 6.0925f, 2.254f, 7.0061f)
                lineTo(3.7518f, 6.9257f)
                close()
                moveTo(18.4573f, 19.7375f)
                curveTo(18.1783f, 20.0313f, 17.8864f, 20.1887f, 17.6026f, 20.2167f)
                lineTo(17.7499f, 21.7095f)
                curveTo(18.497f, 21.6357f, 19.1016f, 21.2373f, 19.5449f, 20.7705f)
                lineTo(18.4573f, 19.7375f)
                close()
                moveTo(10.0213f, 9.0196f)
                curveTo(10.9889f, 8.0009f, 11.0574f, 6.4068f, 10.2466f, 5.2601f)
                lineTo(9.0218f, 6.1261f)
                curveTo(9.444f, 6.7231f, 9.3793f, 7.5175f, 8.9337f, 7.9866f)
                lineTo(10.0213f, 9.0196f)
                close()
                moveTo(19.5092f, 15.962f)
                curveTo(20.33f, 16.4345f, 20.4907f, 17.5968f, 19.8779f, 18.2419f)
                lineTo(20.9655f, 19.2749f)
                curveTo(22.2704f, 17.901f, 21.8904f, 15.6019f, 20.2575f, 14.662f)
                lineTo(19.5092f, 15.962f)
                close()
                moveTo(16.1f, 15.0642f)
                curveTo(16.4854f, 14.6584f, 17.086f, 14.5672f, 17.5987f, 14.8623f)
                lineTo(18.347f, 13.5623f)
                curveTo(17.2485f, 12.93f, 15.8861f, 13.1113f, 15.0124f, 14.0312f)
                lineTo(16.1f, 15.0642f)
                close()
            }
        }
            .build()
        return _phoneCalling!!
    }

private var _phoneCalling: ImageVector? = null
