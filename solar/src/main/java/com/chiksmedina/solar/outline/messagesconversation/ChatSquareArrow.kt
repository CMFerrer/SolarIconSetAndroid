package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.ChatSquareArrow: ImageVector
    get() {
        if (_chatSquareArrow != null) {
            return _chatSquareArrow!!
        }
        _chatSquareArrow = Builder(
            name = "ChatSquareArrow", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.7836f, 1.473f)
                curveTo(15.0747f, 1.7677f, 15.0717f, 2.2425f, 14.777f, 2.5336f)
                lineTo(13.8206f, 3.4782f)
                curveTo(14.6527f, 3.4866f, 15.453f, 3.5069f, 16.1753f, 3.5558f)
                curveTo(16.7964f, 3.5978f, 17.378f, 3.662f, 17.8849f, 3.7629f)
                curveTo(18.3813f, 3.8616f, 18.8597f, 4.0055f, 19.2396f, 4.2354f)
                curveTo(19.9457f, 4.6628f, 20.5404f, 5.2498f, 20.9742f, 5.949f)
                curveTo(21.3915f, 6.6216f, 21.5754f, 7.382f, 21.6637f, 8.2988f)
                curveTo(21.75f, 9.1959f, 21.75f, 10.3169f, 21.75f, 11.7383f)
                verticalLineTo(11.7778f)
                curveTo(21.75f, 12.192f, 21.4142f, 12.5278f, 21.0f, 12.5278f)
                curveTo(20.5858f, 12.5278f, 20.25f, 12.192f, 20.25f, 11.7778f)
                curveTo(20.25f, 10.3082f, 20.2492f, 9.2593f, 20.1706f, 8.4426f)
                curveTo(20.093f, 7.6374f, 19.9453f, 7.1359f, 19.6996f, 6.7398f)
                curveTo(19.3913f, 6.2429f, 18.9677f, 5.8243f, 18.4629f, 5.5187f)
                curveTo(18.3018f, 5.4212f, 18.0215f, 5.3195f, 17.5922f, 5.234f)
                curveTo(17.1733f, 5.1507f, 16.6621f, 5.0922f, 16.074f, 5.0524f)
                curveTo(15.3945f, 5.0064f, 14.6366f, 4.9868f, 13.8329f, 4.9784f)
                lineTo(14.777f, 5.9109f)
                curveTo(15.0717f, 6.2019f, 15.0747f, 6.6768f, 14.7836f, 6.9715f)
                curveTo(14.4925f, 7.2662f, 14.0177f, 7.2692f, 13.723f, 6.9781f)
                lineTo(11.473f, 4.7558f)
                curveTo(11.3303f, 4.6149f, 11.25f, 4.4228f, 11.25f, 4.2222f)
                curveTo(11.25f, 4.0217f, 11.3303f, 3.8295f, 11.473f, 3.6886f)
                lineTo(13.723f, 1.4664f)
                curveTo(14.0177f, 1.1753f, 14.4925f, 1.1783f, 14.7836f, 1.473f)
                close()
                moveTo(10.05f, 4.2208f)
                curveTo(10.0513f, 4.635f, 9.7165f, 4.9718f, 9.3023f, 4.9731f)
                curveTo(6.9973f, 4.9802f, 6.295f, 5.06f, 5.5371f, 5.5187f)
                curveTo(5.0322f, 5.8243f, 4.6087f, 6.2429f, 4.3004f, 6.7398f)
                curveTo(4.0547f, 7.1359f, 3.9069f, 7.6374f, 3.8294f, 8.4426f)
                curveTo(3.7508f, 9.2593f, 3.75f, 10.3082f, 3.75f, 11.7778f)
                verticalLineTo(12.6667f)
                curveTo(3.75f, 13.7125f, 3.7504f, 14.4588f, 3.791f, 15.0468f)
                curveTo(3.8312f, 15.6279f, 3.908f, 15.9988f, 4.0342f, 16.2997f)
                curveTo(4.4132f, 17.2035f, 5.1416f, 17.9244f, 6.0619f, 18.3009f)
                curveTo(6.5128f, 18.4854f, 7.0933f, 18.5567f, 8.2234f, 18.5759f)
                lineTo(8.254f, 18.5764f)
                curveTo(8.6104f, 18.5825f, 8.9271f, 18.5878f, 9.1911f, 18.6167f)
                curveTo(9.4763f, 18.6479f, 9.7608f, 18.7115f, 10.0361f, 18.8696f)
                curveTo(10.3093f, 19.0265f, 10.5054f, 19.2359f, 10.6738f, 19.4641f)
                curveTo(10.8281f, 19.6732f, 10.9859f, 19.9366f, 11.1614f, 20.2295f)
                lineTo(11.6653f, 21.0703f)
                curveTo(11.7329f, 21.183f, 11.8541f, 21.25f, 12.0f, 21.25f)
                curveTo(12.1458f, 21.25f, 12.2671f, 21.183f, 12.3347f, 21.0703f)
                lineTo(12.8385f, 20.2295f)
                curveTo(13.014f, 19.9366f, 13.1719f, 19.6732f, 13.3261f, 19.4641f)
                curveTo(13.4945f, 19.2359f, 13.6906f, 19.0265f, 13.9639f, 18.8696f)
                curveTo(14.2391f, 18.7115f, 14.5237f, 18.6479f, 14.8088f, 18.6167f)
                curveTo(15.0729f, 18.5878f, 15.3895f, 18.5825f, 15.7459f, 18.5764f)
                lineTo(15.7766f, 18.5759f)
                curveTo(16.9067f, 18.5567f, 17.4872f, 18.4854f, 17.9381f, 18.3009f)
                curveTo(18.8585f, 17.9244f, 19.5868f, 17.2035f, 19.9658f, 16.2997f)
                curveTo(20.1349f, 15.8964f, 20.2114f, 15.3805f, 20.237f, 14.4245f)
                curveTo(20.2481f, 14.0104f, 20.5928f, 13.6837f, 21.0068f, 13.6948f)
                curveTo(21.4209f, 13.7059f, 21.7476f, 14.0506f, 21.7365f, 14.4646f)
                curveTo(21.7102f, 15.4457f, 21.6333f, 16.2021f, 21.3491f, 16.8798f)
                curveTo(20.8147f, 18.1541f, 19.791f, 19.1636f, 18.5061f, 19.6892f)
                curveTo(17.7684f, 19.991f, 16.9317f, 20.0565f, 15.8021f, 20.0757f)
                curveTo(15.4057f, 20.0824f, 15.159f, 20.0874f, 14.9719f, 20.1078f)
                curveTo(14.7984f, 20.1268f, 14.7397f, 20.1538f, 14.711f, 20.1702f)
                curveTo(14.6804f, 20.1879f, 14.6299f, 20.2236f, 14.5331f, 20.3548f)
                curveTo(14.4268f, 20.4988f, 14.3057f, 20.6993f, 14.1092f, 21.0272f)
                lineTo(13.6213f, 21.8413f)
                curveTo(12.8952f, 23.0529f, 11.1047f, 23.0529f, 10.3787f, 21.8413f)
                lineTo(9.8908f, 21.0272f)
                curveTo(9.6943f, 20.6993f, 9.5732f, 20.4988f, 9.4669f, 20.3548f)
                curveTo(9.3701f, 20.2236f, 9.3196f, 20.1879f, 9.2889f, 20.1702f)
                curveTo(9.2602f, 20.1538f, 9.2015f, 20.1268f, 9.0281f, 20.1078f)
                curveTo(8.841f, 20.0874f, 8.5943f, 20.0824f, 8.1979f, 20.0757f)
                curveTo(7.0683f, 20.0565f, 6.2316f, 19.991f, 5.4939f, 19.6892f)
                curveTo(4.2091f, 19.1636f, 3.1853f, 18.1541f, 2.6509f, 16.8798f)
                curveTo(2.4346f, 16.3639f, 2.3401f, 15.8087f, 2.2946f, 15.1502f)
                curveTo(2.25f, 14.5044f, 2.25f, 13.7064f, 2.25f, 12.6946f)
                verticalLineTo(11.7383f)
                curveTo(2.25f, 10.3169f, 2.25f, 9.1959f, 2.3363f, 8.2988f)
                curveTo(2.4246f, 7.382f, 2.6085f, 6.6216f, 3.0258f, 5.949f)
                curveTo(3.4596f, 5.2498f, 4.0543f, 4.6628f, 4.7604f, 4.2354f)
                curveTo(5.9301f, 3.5275f, 7.0617f, 3.4799f, 9.2977f, 3.4731f)
                curveTo(9.7119f, 3.4718f, 10.0487f, 3.8066f, 10.05f, 4.2208f)
                close()
            }
        }
            .build()
        return _chatSquareArrow!!
    }

private var _chatSquareArrow: ImageVector? = null
