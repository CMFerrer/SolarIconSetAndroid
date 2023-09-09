package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.ChatSquareArrow: ImageVector
    get() {
        if (_chatSquareArrow != null) {
            return _chatSquareArrow!!
        }
        _chatSquareArrow = Builder(name = "ChatSquareArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9839f, 22.4937f)
                lineTo(13.521f, 21.5869f)
                curveTo(13.9375f, 20.8836f, 14.1458f, 20.5319f, 14.4804f, 20.3375f)
                curveTo(14.815f, 20.143f, 15.2362f, 20.1358f, 16.0786f, 20.1213f)
                curveTo(17.3224f, 20.0998f, 18.1024f, 20.0237f, 18.7566f, 19.7529f)
                curveTo(19.9704f, 19.2505f, 20.9348f, 18.2868f, 21.4375f, 17.0738f)
                curveTo(21.6226f, 16.6273f, 21.7169f, 16.1221f, 21.7648f, 15.4506f)
                curveTo(21.7903f, 15.0948f, 21.803f, 14.917f, 21.708f, 14.7746f)
                curveTo(21.6131f, 14.6323f, 21.4329f, 14.5718f, 21.0723f, 14.451f)
                curveTo(19.5606f, 13.9444f, 16.0584f, 12.6555f, 14.1f, 10.9998f)
                curveTo(11.8925f, 9.1335f, 9.9178f, 5.3394f, 9.2112f, 3.8852f)
                curveTo(9.0707f, 3.5961f, 9.0005f, 3.4515f, 8.8771f, 3.3752f)
                curveTo(8.7538f, 3.299f, 8.5974f, 3.3006f, 8.2846f, 3.3039f)
                curveTo(6.2504f, 3.3254f, 5.3292f, 3.438f, 4.3654f, 4.0282f)
                curveTo(3.6988f, 4.4364f, 3.1384f, 4.9964f, 2.73f, 5.6625f)
                curveTo(2.0f, 6.8529f, 2.0f, 8.4733f, 2.0f, 11.7142f)
                verticalLineTo(12.7043f)
                curveTo(2.0f, 15.0108f, 2.0f, 16.1641f, 2.3771f, 17.0738f)
                curveTo(2.8798f, 18.2868f, 3.8442f, 19.2505f, 5.058f, 19.7529f)
                curveTo(5.7122f, 20.0237f, 6.4922f, 20.0998f, 7.7359f, 20.1213f)
                curveTo(8.5784f, 20.1358f, 8.9996f, 20.143f, 9.3342f, 20.3375f)
                curveTo(9.6687f, 20.5319f, 9.877f, 20.8836f, 10.2936f, 21.5869f)
                lineTo(10.8307f, 22.4937f)
                curveTo(11.3094f, 23.3018f, 12.5052f, 23.3018f, 12.9839f, 22.4937f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.8719f, 0.2392f)
                curveTo(15.2073f, 0.5554f, 15.2039f, 1.0649f, 14.8643f, 1.3772f)
                lineTo(13.7622f, 2.3907f)
                curveTo(14.721f, 2.3997f, 15.6433f, 2.4214f, 16.4756f, 2.4739f)
                curveTo(17.1913f, 2.519f, 17.8616f, 2.5879f, 18.4457f, 2.6961f)
                curveTo(19.0178f, 2.8021f, 19.569f, 2.9564f, 20.0069f, 3.2031f)
                curveTo(20.8206f, 3.6617f, 21.5058f, 4.2914f, 22.0058f, 5.0416f)
                curveTo(22.4867f, 5.7633f, 22.6986f, 6.579f, 22.8003f, 7.5628f)
                curveTo(22.8998f, 8.5252f, 22.8998f, 9.7279f, 22.8998f, 11.253f)
                verticalLineTo(11.2953f)
                curveTo(22.8998f, 11.7397f, 22.5129f, 12.1f, 22.0355f, 12.1f)
                curveTo(21.5582f, 12.1f, 21.1712f, 11.7397f, 21.1712f, 11.2953f)
                curveTo(21.1712f, 9.7186f, 21.1703f, 8.5933f, 21.0797f, 7.717f)
                curveTo(20.9904f, 6.8531f, 20.8201f, 6.315f, 20.5369f, 5.89f)
                curveTo(20.1817f, 5.3569f, 19.6936f, 4.9078f, 19.1118f, 4.5799f)
                curveTo(18.9261f, 4.4753f, 18.6031f, 4.3661f, 18.1084f, 4.2745f)
                curveTo(17.6257f, 4.1851f, 17.0367f, 4.1223f, 16.3589f, 4.0796f)
                curveTo(15.5758f, 4.0302f, 14.7025f, 4.0092f, 13.7763f, 4.0003f)
                lineTo(14.8643f, 5.0007f)
                curveTo(15.2039f, 5.313f, 15.2073f, 5.8225f, 14.8719f, 6.1386f)
                curveTo(14.5364f, 6.4549f, 13.9892f, 6.458f, 13.6496f, 6.1457f)
                lineTo(11.0568f, 3.7615f)
                curveTo(10.8923f, 3.6103f, 10.7998f, 3.4041f, 10.7998f, 3.1889f)
                curveTo(10.7998f, 2.9738f, 10.8923f, 2.7676f, 11.0568f, 2.6164f)
                lineTo(13.6496f, 0.2322f)
                curveTo(13.9892f, -0.0801f, 14.5364f, -0.077f, 14.8719f, 0.2392f)
                close()
            }
        }
        .build()
        return _chatSquareArrow!!
    }

private var _chatSquareArrow: ImageVector? = null
