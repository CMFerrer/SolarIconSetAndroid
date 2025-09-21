package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

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
                pathFillType = NonZero
            ) {
                moveTo(11.9853f, 21.449f)
                lineTo(12.4736f, 20.6246f)
                curveTo(12.8523f, 19.9853f, 13.0417f, 19.6656f, 13.3458f, 19.4888f)
                curveTo(13.65f, 19.312f, 14.0329f, 19.3054f, 14.7988f, 19.2922f)
                curveTo(15.9294f, 19.2728f, 16.6386f, 19.2035f, 17.2333f, 18.9574f)
                curveTo(18.3367f, 18.5006f, 19.2134f, 17.6245f, 19.6705f, 16.5218f)
                curveTo(19.8323f, 16.1314f, 19.9177f, 15.6917f, 19.9628f, 15.1156f)
                curveTo(19.9905f, 14.7619f, 20.0044f, 14.5851f, 19.9097f, 14.4418f)
                curveTo(19.8151f, 14.2985f, 19.634f, 14.2373f, 19.2718f, 14.1151f)
                curveTo(17.8637f, 13.6398f, 14.7522f, 12.4814f, 13.0f, 11.0f)
                curveTo(11.0199f, 9.3259f, 9.2459f, 5.9458f, 8.5819f, 4.5861f)
                curveTo(8.4403f, 4.296f, 8.3694f, 4.151f, 8.2461f, 4.075f)
                curveTo(8.1227f, 3.9989f, 7.9664f, 4.0008f, 7.6538f, 4.0044f)
                curveTo(5.8459f, 4.0255f, 5.017f, 4.1314f, 4.1503f, 4.6622f)
                curveTo(3.5444f, 5.0333f, 3.0349f, 5.5424f, 2.6636f, 6.1479f)
                curveTo(2.0f, 7.2301f, 2.0f, 8.7032f, 2.0f, 11.6495f)
                verticalLineTo(12.5495f)
                curveTo(2.0f, 14.6464f, 2.0f, 15.6948f, 2.3428f, 16.5218f)
                curveTo(2.7998f, 17.6245f, 3.6765f, 18.5006f, 4.78f, 18.9574f)
                curveTo(5.3747f, 19.2035f, 6.0838f, 19.2728f, 7.2145f, 19.2922f)
                curveTo(7.9803f, 19.3054f, 8.3633f, 19.312f, 8.6674f, 19.4888f)
                curveTo(8.9716f, 19.6656f, 9.1609f, 19.9853f, 9.5396f, 20.6246f)
                lineTo(10.0279f, 21.449f)
                curveTo(10.4631f, 22.1837f, 11.5502f, 22.1837f, 11.9853f, 21.449f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.7019f, 1.2175f)
                curveTo(14.0068f, 1.5049f, 14.0037f, 1.9681f, 13.695f, 2.252f)
                lineTo(12.693f, 3.1733f)
                curveTo(13.5647f, 3.1815f, 14.4032f, 3.2013f, 15.1598f, 3.249f)
                curveTo(15.8105f, 3.29f, 16.4199f, 3.3526f, 16.9508f, 3.451f)
                curveTo(17.4709f, 3.5473f, 17.972f, 3.6876f, 18.37f, 3.9119f)
                curveTo(19.1098f, 4.3288f, 19.7328f, 4.9013f, 20.1872f, 5.5832f)
                curveTo(20.6245f, 6.2393f, 20.8171f, 6.9809f, 20.9095f, 7.8752f)
                curveTo(21.0f, 8.7502f, 21.0f, 9.8436f, 21.0f, 11.23f)
                verticalLineTo(11.2685f)
                curveTo(21.0f, 11.6725f, 20.6482f, 12.0f, 20.2143f, 12.0f)
                curveTo(19.7803f, 12.0f, 19.4286f, 11.6725f, 19.4286f, 11.2685f)
                curveTo(19.4286f, 9.8351f, 19.4277f, 8.8121f, 19.3453f, 8.0154f)
                curveTo(19.2641f, 7.2301f, 19.1094f, 6.7409f, 18.8519f, 6.3546f)
                curveTo(18.529f, 5.87f, 18.0853f, 5.4616f, 17.5564f, 5.1636f)
                curveTo(17.3876f, 5.0684f, 17.0939f, 4.9692f, 16.6442f, 4.8859f)
                curveTo(16.2053f, 4.8046f, 15.6699f, 4.7475f, 15.0537f, 4.7087f)
                curveTo(14.3418f, 4.6638f, 13.5479f, 4.6447f, 12.7059f, 4.6366f)
                lineTo(13.695f, 5.5461f)
                curveTo(14.0037f, 5.83f, 14.0068f, 6.2931f, 13.7019f, 6.5806f)
                curveTo(13.3969f, 6.868f, 12.8995f, 6.8709f, 12.5907f, 6.587f)
                lineTo(10.2336f, 4.4195f)
                curveTo(10.0841f, 4.2821f, 10.0f, 4.0946f, 10.0f, 3.899f)
                curveTo(10.0f, 3.7034f, 10.0841f, 3.516f, 10.2336f, 3.3786f)
                lineTo(12.5907f, 1.2111f)
                curveTo(12.8995f, 0.9272f, 13.3969f, 0.93f, 13.7019f, 1.2175f)
                close()
            }
        }
            .build()
        return _chatSquareArrow!!
    }

private var _chatSquareArrow: ImageVector? = null
