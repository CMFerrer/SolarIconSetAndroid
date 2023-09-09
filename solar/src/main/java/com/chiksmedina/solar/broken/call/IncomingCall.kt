package com.chiksmedina.solar.broken.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.CallGroup

public val CallGroup.IncomingCall: ImageVector
    get() {
        if (_incomingCall != null) {
            return _incomingCall!!
        }
        _incomingCall = Builder(name = "IncomingCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(15.0f, 9.0f)
                moveTo(15.0f, 9.0f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1008f, 15.0272f)
                lineTo(15.6446f, 15.5437f)
                lineTo(15.6446f, 15.5437f)
                lineTo(15.1008f, 15.0272f)
                close()
                moveTo(15.5562f, 14.5477f)
                lineTo(15.0124f, 14.0312f)
                lineTo(15.0124f, 14.0312f)
                lineTo(15.5562f, 14.5477f)
                close()
                moveTo(17.9729f, 14.2123f)
                lineTo(17.5987f, 14.8623f)
                lineTo(17.5987f, 14.8623f)
                lineTo(17.9729f, 14.2123f)
                close()
                moveTo(19.8834f, 15.312f)
                lineTo(19.5092f, 15.962f)
                lineTo(19.8834f, 15.312f)
                close()
                moveTo(20.4217f, 18.7584f)
                lineTo(20.9655f, 19.2749f)
                lineTo(20.9655f, 19.2749f)
                lineTo(20.4217f, 18.7584f)
                close()
                moveTo(19.0012f, 20.254f)
                lineTo(18.4574f, 19.7375f)
                lineTo(18.4574f, 19.7375f)
                lineTo(19.0012f, 20.254f)
                close()
                moveTo(17.6763f, 20.9631f)
                lineTo(17.75f, 21.7095f)
                lineTo(17.75f, 21.7095f)
                lineTo(17.6763f, 20.9631f)
                close()
                moveTo(7.8154f, 16.4752f)
                lineTo(8.3592f, 15.9587f)
                lineTo(7.8154f, 16.4752f)
                close()
                moveTo(3.7518f, 6.9257f)
                curveTo(3.7297f, 6.5121f, 3.3763f, 6.1948f, 2.9627f, 6.217f)
                curveTo(2.5491f, 6.2392f, 2.2318f, 6.5925f, 2.254f, 7.0061f)
                lineTo(3.7518f, 6.9257f)
                close()
                moveTo(9.1908f, 8.8051f)
                lineTo(9.7345f, 9.3216f)
                lineTo(9.7345f, 9.3216f)
                lineTo(9.1908f, 8.8051f)
                close()
                moveTo(9.4776f, 8.5031f)
                lineTo(10.0214f, 9.0196f)
                lineTo(10.0214f, 9.0196f)
                lineTo(9.4776f, 8.5031f)
                close()
                moveTo(9.6343f, 5.6931f)
                lineTo(10.2467f, 5.2601f)
                lineTo(10.2467f, 5.2601f)
                lineTo(9.6343f, 5.6931f)
                close()
                moveTo(8.3733f, 3.9096f)
                lineTo(7.7609f, 4.3426f)
                lineTo(7.7609f, 4.3426f)
                lineTo(8.3733f, 3.9096f)
                close()
                moveTo(4.7177f, 3.0921f)
                curveTo(4.4324f, 3.3925f, 4.4447f, 3.8672f, 4.745f, 4.1524f)
                curveTo(5.0453f, 4.4377f, 5.52f, 4.4255f, 5.8053f, 4.1252f)
                lineTo(4.7177f, 3.0921f)
                close()
                moveTo(11.0632f, 13.0559f)
                lineTo(11.607f, 12.5394f)
                lineTo(11.607f, 12.5394f)
                lineTo(11.0632f, 13.0559f)
                close()
                moveTo(10.6641f, 19.8123f)
                curveTo(11.0148f, 20.0327f, 11.4778f, 19.9271f, 11.6982f, 19.5764f)
                curveTo(11.9186f, 19.2257f, 11.8129f, 18.7627f, 11.4622f, 18.5423f)
                lineTo(10.6641f, 19.8123f)
                close()
                moveTo(15.113f, 20.0584f)
                curveTo(14.7076f, 19.9735f, 14.3101f, 20.2334f, 14.2252f, 20.6388f)
                curveTo(14.1403f, 21.0442f, 14.4001f, 21.4417f, 14.8056f, 21.5266f)
                lineTo(15.113f, 20.0584f)
                close()
                moveTo(15.6446f, 15.5437f)
                lineTo(16.1f, 15.0642f)
                lineTo(15.0124f, 14.0312f)
                lineTo(14.557f, 14.5107f)
                lineTo(15.6446f, 15.5437f)
                close()
                moveTo(17.5987f, 14.8623f)
                lineTo(19.5092f, 15.962f)
                lineTo(20.2575f, 14.662f)
                lineTo(18.347f, 13.5623f)
                lineTo(17.5987f, 14.8623f)
                close()
                moveTo(19.8779f, 18.2419f)
                lineTo(18.4574f, 19.7375f)
                lineTo(19.545f, 20.7705f)
                lineTo(20.9655f, 19.2749f)
                lineTo(19.8779f, 18.2419f)
                close()
                moveTo(8.3592f, 15.9587f)
                curveTo(4.4831f, 11.8778f, 3.8329f, 8.4356f, 3.7518f, 6.9257f)
                lineTo(2.254f, 7.0061f)
                curveTo(2.3533f, 8.8554f, 3.1384f, 12.6403f, 7.2716f, 16.9917f)
                lineTo(8.3592f, 15.9587f)
                close()
                moveTo(9.7345f, 9.3216f)
                lineTo(10.0214f, 9.0196f)
                lineTo(8.9338f, 7.9866f)
                lineTo(8.6469f, 8.2886f)
                lineTo(9.7345f, 9.3216f)
                close()
                moveTo(10.2467f, 5.2601f)
                lineTo(8.9857f, 3.4766f)
                lineTo(7.7609f, 4.3426f)
                lineTo(9.0219f, 6.1261f)
                lineTo(10.2467f, 5.2601f)
                close()
                moveTo(9.1908f, 8.8051f)
                curveTo(8.6469f, 8.2886f, 8.6463f, 8.2893f, 8.6456f, 8.29f)
                curveTo(8.6453f, 8.2903f, 8.6446f, 8.291f, 8.6441f, 8.2915f)
                curveTo(8.6432f, 8.2925f, 8.6422f, 8.2936f, 8.6412f, 8.2946f)
                curveTo(8.6393f, 8.2968f, 8.6372f, 8.299f, 8.6351f, 8.3013f)
                curveTo(8.6309f, 8.3059f, 8.6265f, 8.3109f, 8.6218f, 8.3162f)
                curveTo(8.6125f, 8.327f, 8.6022f, 8.3393f, 8.5912f, 8.3532f)
                curveTo(8.5692f, 8.381f, 8.5443f, 8.4151f, 8.5183f, 8.4559f)
                curveTo(8.466f, 8.5376f, 8.4092f, 8.6453f, 8.3612f, 8.7803f)
                curveTo(8.2635f, 9.0549f, 8.2102f, 9.4185f, 8.2767f, 9.8726f)
                curveTo(8.4075f, 10.7647f, 8.992f, 11.9644f, 10.5194f, 13.5724f)
                lineTo(11.607f, 12.5394f)
                curveTo(10.1793f, 11.0363f, 9.8277f, 10.1106f, 9.7609f, 9.6551f)
                curveTo(9.7287f, 9.4354f, 9.7614f, 9.3196f, 9.7744f, 9.2832f)
                curveTo(9.7816f, 9.2628f, 9.7864f, 9.2571f, 9.7817f, 9.2644f)
                curveTo(9.7795f, 9.2679f, 9.775f, 9.2745f, 9.7674f, 9.2841f)
                curveTo(9.7636f, 9.2888f, 9.7591f, 9.2944f, 9.7536f, 9.3006f)
                curveTo(9.7509f, 9.3038f, 9.748f, 9.3071f, 9.7448f, 9.3106f)
                curveTo(9.7432f, 9.3123f, 9.7416f, 9.3141f, 9.7399f, 9.3159f)
                curveTo(9.739f, 9.3169f, 9.7381f, 9.3178f, 9.7372f, 9.3187f)
                curveTo(9.7368f, 9.3192f, 9.7361f, 9.3199f, 9.7359f, 9.3202f)
                curveTo(9.7352f, 9.3209f, 9.7345f, 9.3216f, 9.1908f, 8.8051f)
                close()
                moveTo(10.5194f, 13.5724f)
                curveTo(12.0422f, 15.1757f, 13.1924f, 15.806f, 14.0699f, 15.9485f)
                curveTo(14.5201f, 16.0216f, 14.8846f, 15.9632f, 15.1606f, 15.8544f)
                curveTo(15.2955f, 15.8012f, 15.4023f, 15.7387f, 15.4824f, 15.6819f)
                curveTo(15.5223f, 15.6535f, 15.5556f, 15.6266f, 15.5825f, 15.6031f)
                curveTo(15.5959f, 15.5913f, 15.6078f, 15.5803f, 15.6181f, 15.5703f)
                curveTo(15.6233f, 15.5654f, 15.628f, 15.5606f, 15.6324f, 15.5562f)
                curveTo(15.6346f, 15.554f, 15.6368f, 15.5518f, 15.6388f, 15.5497f)
                curveTo(15.6398f, 15.5487f, 15.6408f, 15.5477f, 15.6417f, 15.5467f)
                curveTo(15.6422f, 15.5462f, 15.6429f, 15.5454f, 15.6432f, 15.5452f)
                curveTo(15.6439f, 15.5444f, 15.6446f, 15.5437f, 15.1008f, 15.0272f)
                curveTo(14.557f, 14.5107f, 14.5577f, 14.51f, 14.5583f, 14.5093f)
                curveTo(14.5586f, 14.509f, 14.5592f, 14.5083f, 14.5597f, 14.5078f)
                curveTo(14.5606f, 14.5069f, 14.5615f, 14.506f, 14.5623f, 14.5051f)
                curveTo(14.5641f, 14.5033f, 14.5658f, 14.5015f, 14.5675f, 14.4998f)
                curveTo(14.5708f, 14.4965f, 14.574f, 14.4933f, 14.577f, 14.4904f)
                curveTo(14.5831f, 14.4846f, 14.5885f, 14.4796f, 14.5933f, 14.4754f)
                curveTo(14.6029f, 14.467f, 14.61f, 14.4616f, 14.6146f, 14.4583f)
                curveTo(14.6239f, 14.4517f, 14.623f, 14.454f, 14.6102f, 14.459f)
                curveTo(14.5909f, 14.4666f, 14.5001f, 14.4987f, 14.3103f, 14.4679f)
                curveTo(13.9078f, 14.4025f, 13.0391f, 14.0472f, 11.607f, 12.5394f)
                lineTo(10.5194f, 13.5724f)
                close()
                moveTo(8.9857f, 3.4766f)
                curveTo(7.9721f, 2.0431f, 5.9439f, 1.8012f, 4.7177f, 3.0921f)
                lineTo(5.8053f, 4.1252f)
                curveTo(6.3281f, 3.5747f, 7.2485f, 3.6179f, 7.7609f, 4.3426f)
                lineTo(8.9857f, 3.4766f)
                close()
                moveTo(18.4574f, 19.7375f)
                curveTo(18.1783f, 20.0313f, 17.8864f, 20.1887f, 17.6026f, 20.2167f)
                lineTo(17.75f, 21.7095f)
                curveTo(18.497f, 21.6357f, 19.1016f, 21.2373f, 19.545f, 20.7705f)
                lineTo(18.4574f, 19.7375f)
                close()
                moveTo(10.0214f, 9.0196f)
                curveTo(10.9889f, 8.0009f, 11.0574f, 6.4068f, 10.2467f, 5.2601f)
                lineTo(9.0219f, 6.1261f)
                curveTo(9.444f, 6.7231f, 9.3793f, 7.5175f, 8.9338f, 7.9866f)
                lineTo(10.0214f, 9.0196f)
                close()
                moveTo(19.5092f, 15.962f)
                curveTo(20.3301f, 16.4345f, 20.4907f, 17.5968f, 19.8779f, 18.2419f)
                lineTo(20.9655f, 19.2749f)
                curveTo(22.2705f, 17.901f, 21.8904f, 15.6019f, 20.2575f, 14.662f)
                lineTo(19.5092f, 15.962f)
                close()
                moveTo(16.1f, 15.0642f)
                curveTo(16.4854f, 14.6584f, 17.086f, 14.5672f, 17.5987f, 14.8623f)
                lineTo(18.347f, 13.5623f)
                curveTo(17.2485f, 12.93f, 15.8862f, 13.1113f, 15.0124f, 14.0312f)
                lineTo(16.1f, 15.0642f)
                close()
                moveTo(11.4622f, 18.5423f)
                curveTo(10.4785f, 17.9241f, 9.4315f, 17.0876f, 8.3592f, 15.9587f)
                lineTo(7.2716f, 16.9917f)
                curveTo(8.4256f, 18.2067f, 9.569f, 19.1241f, 10.6641f, 19.8123f)
                lineTo(11.4622f, 18.5423f)
                close()
                moveTo(17.6026f, 20.2167f)
                curveTo(17.0561f, 20.2707f, 16.1912f, 20.2842f, 15.113f, 20.0584f)
                lineTo(14.8056f, 21.5266f)
                curveTo(16.0541f, 21.788f, 17.0742f, 21.7762f, 17.75f, 21.7095f)
                lineTo(17.6026f, 20.2167f)
                close()
            }
        }
        .build()
        return _incomingCall!!
    }

private var _incomingCall: ImageVector? = null
