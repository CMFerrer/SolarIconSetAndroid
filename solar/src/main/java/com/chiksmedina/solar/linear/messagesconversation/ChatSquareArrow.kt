package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.ChatSquareArrow: ImageVector
    get() {
        if (_chatSquareArrow != null) {
            return _chatSquareArrow!!
        }
        _chatSquareArrow = Builder(name = "ChatSquareArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.978f, 21.4558f)
                lineTo(13.6213f, 21.8413f)
                lineTo(13.6213f, 21.8413f)
                lineTo(12.978f, 21.4558f)
                close()
                moveTo(13.4659f, 20.6417f)
                lineTo(12.8226f, 20.2562f)
                lineTo(12.8226f, 20.2562f)
                lineTo(13.4659f, 20.6417f)
                close()
                moveTo(10.5341f, 20.6417f)
                lineTo(9.8908f, 21.0272f)
                lineTo(9.8908f, 21.0272f)
                lineTo(10.5341f, 20.6417f)
                close()
                moveTo(11.022f, 21.4558f)
                lineTo(11.6653f, 21.0703f)
                lineTo(11.6653f, 21.0703f)
                lineTo(11.022f, 21.4558f)
                close()
                moveTo(12.0f, 4.2222f)
                lineTo(11.473f, 3.6886f)
                curveTo(11.3303f, 3.8295f, 11.25f, 4.0217f, 11.25f, 4.2222f)
                curveTo(11.25f, 4.4228f, 11.3303f, 4.6149f, 11.473f, 4.7558f)
                lineTo(12.0f, 4.2222f)
                close()
                moveTo(20.25f, 11.7778f)
                curveTo(20.25f, 12.192f, 20.5858f, 12.5278f, 21.0f, 12.5278f)
                curveTo(21.4142f, 12.5278f, 21.75f, 12.192f, 21.75f, 11.7778f)
                horizontalLineTo(20.25f)
                close()
                moveTo(3.3425f, 16.5897f)
                lineTo(4.0342f, 16.2997f)
                lineTo(4.0342f, 16.2997f)
                lineTo(3.3425f, 16.5897f)
                close()
                moveTo(8.2106f, 19.3258f)
                lineTo(8.1979f, 20.0757f)
                lineTo(8.1979f, 20.0757f)
                lineTo(8.2106f, 19.3258f)
                close()
                moveTo(5.7779f, 18.9951f)
                lineTo(5.4939f, 19.6892f)
                lineTo(5.4939f, 19.6892f)
                lineTo(5.7779f, 18.9951f)
                close()
                moveTo(20.6575f, 16.5897f)
                lineTo(21.3491f, 16.8798f)
                lineTo(21.3491f, 16.8798f)
                lineTo(20.6575f, 16.5897f)
                close()
                moveTo(15.7893f, 19.3258f)
                lineTo(15.7766f, 18.5759f)
                lineTo(15.7766f, 18.5759f)
                lineTo(15.7893f, 19.3258f)
                close()
                moveTo(18.2221f, 18.9951f)
                lineTo(18.5061f, 19.6892f)
                lineTo(18.5061f, 19.6892f)
                lineTo(18.2221f, 18.9951f)
                close()
                moveTo(18.8512f, 4.8771f)
                lineTo(18.4629f, 5.5187f)
                lineTo(18.4629f, 5.5187f)
                lineTo(18.8512f, 4.8771f)
                close()
                moveTo(20.3369f, 6.3444f)
                lineTo(20.9742f, 5.949f)
                lineTo(20.9742f, 5.949f)
                lineTo(20.3369f, 6.3444f)
                close()
                moveTo(5.1488f, 4.8771f)
                lineTo(4.7604f, 4.2354f)
                lineTo(4.7604f, 4.2354f)
                lineTo(5.1488f, 4.8771f)
                close()
                moveTo(3.6631f, 6.3444f)
                lineTo(3.0258f, 5.949f)
                lineTo(3.0258f, 5.949f)
                lineTo(3.6631f, 6.3444f)
                close()
                moveTo(9.6625f, 19.5199f)
                lineTo(10.0361f, 18.8696f)
                lineTo(10.0361f, 18.8696f)
                lineTo(9.6625f, 19.5199f)
                close()
                moveTo(14.777f, 2.5336f)
                curveTo(15.0717f, 2.2425f, 15.0747f, 1.7677f, 14.7836f, 1.473f)
                curveTo(14.4925f, 1.1783f, 14.0177f, 1.1753f, 13.723f, 1.4664f)
                lineTo(14.777f, 2.5336f)
                close()
                moveTo(13.723f, 6.9781f)
                curveTo(14.0177f, 7.2692f, 14.4925f, 7.2662f, 14.7836f, 6.9715f)
                curveTo(15.0747f, 6.6768f, 15.0717f, 6.2019f, 14.777f, 5.9109f)
                lineTo(13.723f, 6.9781f)
                close()
                moveTo(9.3023f, 4.9731f)
                curveTo(9.7165f, 4.9718f, 10.0513f, 4.635f, 10.05f, 4.2208f)
                curveTo(10.0487f, 3.8066f, 9.7119f, 3.4718f, 9.2977f, 3.4731f)
                lineTo(9.3023f, 4.9731f)
                close()
                moveTo(21.7365f, 14.4646f)
                curveTo(21.7476f, 14.0506f, 21.4209f, 13.7059f, 21.0068f, 13.6948f)
                curveTo(20.5928f, 13.6837f, 20.2481f, 14.0104f, 20.237f, 14.4245f)
                lineTo(21.7365f, 14.4646f)
                close()
                moveTo(13.6213f, 21.8413f)
                lineTo(14.1092f, 21.0272f)
                lineTo(12.8226f, 20.2562f)
                lineTo(12.3347f, 21.0703f)
                lineTo(13.6213f, 21.8413f)
                close()
                moveTo(9.8908f, 21.0272f)
                lineTo(10.3787f, 21.8413f)
                lineTo(11.6653f, 21.0703f)
                lineTo(11.1774f, 20.2562f)
                lineTo(9.8908f, 21.0272f)
                close()
                moveTo(12.3347f, 21.0703f)
                curveTo(12.2671f, 21.183f, 12.1458f, 21.25f, 12.0f, 21.25f)
                curveTo(11.8541f, 21.25f, 11.7329f, 21.183f, 11.6653f, 21.0703f)
                lineTo(10.3787f, 21.8413f)
                curveTo(11.1047f, 23.0529f, 12.8952f, 23.0529f, 13.6213f, 21.8413f)
                lineTo(12.3347f, 21.0703f)
                close()
                moveTo(3.75f, 12.6667f)
                verticalLineTo(11.7778f)
                horizontalLineTo(2.25f)
                verticalLineTo(12.6667f)
                horizontalLineTo(3.75f)
                close()
                moveTo(2.25f, 12.6667f)
                curveTo(2.25f, 13.6917f, 2.2496f, 14.4985f, 2.2946f, 15.1502f)
                curveTo(2.3401f, 15.8087f, 2.4346f, 16.3639f, 2.6509f, 16.8798f)
                lineTo(4.0342f, 16.2997f)
                curveTo(3.908f, 15.9988f, 3.8312f, 15.6279f, 3.791f, 15.0468f)
                curveTo(3.7504f, 14.4588f, 3.75f, 13.7125f, 3.75f, 12.6667f)
                horizontalLineTo(2.25f)
                close()
                moveTo(8.2234f, 18.5759f)
                curveTo(7.0933f, 18.5567f, 6.5128f, 18.4854f, 6.0619f, 18.3009f)
                lineTo(5.4939f, 19.6892f)
                curveTo(6.2316f, 19.991f, 7.0683f, 20.0565f, 8.1979f, 20.0757f)
                lineTo(8.2234f, 18.5759f)
                close()
                moveTo(2.6509f, 16.8798f)
                curveTo(3.1853f, 18.1541f, 4.2091f, 19.1636f, 5.4939f, 19.6892f)
                lineTo(6.0619f, 18.3009f)
                curveTo(5.1416f, 17.9244f, 4.4132f, 17.2035f, 4.0342f, 16.2997f)
                lineTo(2.6509f, 16.8798f)
                close()
                moveTo(15.8021f, 20.0757f)
                curveTo(16.9317f, 20.0565f, 17.7684f, 19.991f, 18.5061f, 19.6892f)
                lineTo(17.9381f, 18.3009f)
                curveTo(17.4872f, 18.4854f, 16.9067f, 18.5567f, 15.7766f, 18.5759f)
                lineTo(15.8021f, 20.0757f)
                close()
                moveTo(19.9658f, 16.2997f)
                curveTo(19.5868f, 17.2035f, 18.8585f, 17.9244f, 17.9381f, 18.3009f)
                lineTo(18.5061f, 19.6892f)
                curveTo(19.791f, 19.1636f, 20.8147f, 18.1541f, 21.3491f, 16.8798f)
                lineTo(19.9658f, 16.2997f)
                close()
                moveTo(12.0f, 4.9722f)
                curveTo(13.4807f, 4.9722f, 14.8952f, 4.9726f, 16.074f, 5.0524f)
                curveTo(16.6621f, 5.0922f, 17.1733f, 5.1507f, 17.5922f, 5.234f)
                curveTo(18.0215f, 5.3195f, 18.3018f, 5.4212f, 18.4629f, 5.5187f)
                lineTo(19.2396f, 4.2354f)
                curveTo(18.8597f, 4.0055f, 18.3813f, 3.8616f, 17.8849f, 3.7629f)
                curveTo(17.378f, 3.662f, 16.7964f, 3.5978f, 16.1753f, 3.5558f)
                curveTo(14.9354f, 3.4719f, 13.4654f, 3.4722f, 12.0f, 3.4722f)
                verticalLineTo(4.9722f)
                close()
                moveTo(21.75f, 11.7778f)
                curveTo(21.75f, 10.3376f, 21.7508f, 9.2042f, 21.6637f, 8.2988f)
                curveTo(21.5754f, 7.382f, 21.3915f, 6.6216f, 20.9742f, 5.949f)
                lineTo(19.6996f, 6.7398f)
                curveTo(19.9453f, 7.1359f, 20.093f, 7.6374f, 20.1706f, 8.4426f)
                curveTo(20.2492f, 9.2593f, 20.25f, 10.3082f, 20.25f, 11.7778f)
                horizontalLineTo(21.75f)
                close()
                moveTo(18.4629f, 5.5187f)
                curveTo(18.9677f, 5.8243f, 19.3913f, 6.2429f, 19.6996f, 6.7398f)
                lineTo(20.9742f, 5.949f)
                curveTo(20.5404f, 5.2498f, 19.9457f, 4.6628f, 19.2396f, 4.2354f)
                lineTo(18.4629f, 5.5187f)
                close()
                moveTo(3.75f, 11.7778f)
                curveTo(3.75f, 10.3082f, 3.7508f, 9.2593f, 3.8294f, 8.4426f)
                curveTo(3.9069f, 7.6374f, 4.0547f, 7.1359f, 4.3004f, 6.7398f)
                lineTo(3.0258f, 5.949f)
                curveTo(2.6085f, 6.6216f, 2.4246f, 7.382f, 2.3363f, 8.2988f)
                curveTo(2.2492f, 9.2042f, 2.25f, 10.3376f, 2.25f, 11.7778f)
                horizontalLineTo(3.75f)
                close()
                moveTo(4.7604f, 4.2354f)
                curveTo(4.0543f, 4.6628f, 3.4596f, 5.2498f, 3.0258f, 5.949f)
                lineTo(4.3004f, 6.7398f)
                curveTo(4.6087f, 6.2429f, 5.0322f, 5.8243f, 5.5371f, 5.5187f)
                lineTo(4.7604f, 4.2354f)
                close()
                moveTo(11.1774f, 20.2562f)
                curveTo(10.9955f, 19.9526f, 10.8327f, 19.6795f, 10.6738f, 19.4641f)
                curveTo(10.5054f, 19.2359f, 10.3094f, 19.0265f, 10.0361f, 18.8696f)
                lineTo(9.2889f, 20.1702f)
                curveTo(9.3196f, 20.1879f, 9.3701f, 20.2236f, 9.4669f, 20.3548f)
                curveTo(9.5732f, 20.4988f, 9.6943f, 20.6993f, 9.8908f, 21.0272f)
                lineTo(11.1774f, 20.2562f)
                close()
                moveTo(8.1979f, 20.0757f)
                curveTo(8.5943f, 20.0824f, 8.841f, 20.0874f, 9.0281f, 20.1078f)
                curveTo(9.2015f, 20.1268f, 9.2602f, 20.1538f, 9.2889f, 20.1702f)
                lineTo(10.0361f, 18.8696f)
                curveTo(9.7608f, 18.7115f, 9.4763f, 18.6479f, 9.1911f, 18.6167f)
                curveTo(8.9195f, 18.587f, 8.5923f, 18.5822f, 8.2234f, 18.5759f)
                lineTo(8.1979f, 20.0757f)
                close()
                moveTo(14.1092f, 21.0272f)
                curveTo(14.3057f, 20.6993f, 14.4268f, 20.4988f, 14.5331f, 20.3548f)
                curveTo(14.6299f, 20.2236f, 14.6804f, 20.1879f, 14.711f, 20.1702f)
                lineTo(13.9639f, 18.8696f)
                curveTo(13.6906f, 19.0265f, 13.4945f, 19.2359f, 13.3261f, 19.4641f)
                curveTo(13.1672f, 19.6795f, 13.0045f, 19.9526f, 12.8226f, 20.2562f)
                lineTo(14.1092f, 21.0272f)
                close()
                moveTo(15.7766f, 18.5759f)
                curveTo(15.4077f, 18.5822f, 15.0804f, 18.587f, 14.8088f, 18.6167f)
                curveTo(14.5237f, 18.6479f, 14.2391f, 18.7115f, 13.9639f, 18.8696f)
                lineTo(14.711f, 20.1702f)
                curveTo(14.7397f, 20.1538f, 14.7984f, 20.1268f, 14.9719f, 20.1078f)
                curveTo(15.159f, 20.0874f, 15.4057f, 20.0824f, 15.8021f, 20.0757f)
                lineTo(15.7766f, 18.5759f)
                close()
                moveTo(12.527f, 4.7558f)
                lineTo(14.777f, 2.5336f)
                lineTo(13.723f, 1.4664f)
                lineTo(11.473f, 3.6886f)
                lineTo(12.527f, 4.7558f)
                close()
                moveTo(11.473f, 4.7558f)
                lineTo(13.723f, 6.9781f)
                lineTo(14.777f, 5.9109f)
                lineTo(12.527f, 3.6886f)
                lineTo(11.473f, 4.7558f)
                close()
                moveTo(9.2977f, 3.4731f)
                curveTo(7.0617f, 3.4799f, 5.9301f, 3.5275f, 4.7604f, 4.2354f)
                lineTo(5.5371f, 5.5187f)
                curveTo(6.295f, 5.06f, 6.9973f, 4.9802f, 9.3023f, 4.9731f)
                lineTo(9.2977f, 3.4731f)
                close()
                moveTo(20.237f, 14.4245f)
                curveTo(20.2114f, 15.3805f, 20.1349f, 15.8964f, 19.9658f, 16.2997f)
                lineTo(21.3491f, 16.8798f)
                curveTo(21.6333f, 16.2021f, 21.7102f, 15.4457f, 21.7365f, 14.4646f)
                lineTo(20.237f, 14.4245f)
                close()
            }
        }
        .build()
        return _chatSquareArrow!!
    }

private var _chatSquareArrow: ImageVector? = null
