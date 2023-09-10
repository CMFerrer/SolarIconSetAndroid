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

val MessagesConversationGroup.ChatRoundVideo: ImageVector
    get() {
        if (_chatRoundVideo != null) {
            return _chatRoundVideo!!
        }
        _chatRoundVideo = Builder(
            name = "ChatRoundVideo", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4811f, 3.0975f, 14.8788f, 3.7148f, 16.1181f)
                curveTo(3.9625f, 16.6155f, 4.0579f, 17.2103f, 3.9016f, 17.7945f)
                lineTo(3.306f, 20.0205f)
                curveTo(3.1966f, 20.4293f, 3.5707f, 20.8034f, 3.9795f, 20.694f)
                lineTo(6.2055f, 20.0984f)
                curveTo(6.7897f, 19.9421f, 7.3845f, 20.0375f, 7.8819f, 20.2852f)
                curveTo(9.1212f, 20.9025f, 10.5189f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(10.2817f, 22.75f, 8.6555f, 22.3463f, 7.2132f, 21.6279f)
                curveTo(6.9979f, 21.5207f, 6.7781f, 21.4979f, 6.5932f, 21.5474f)
                lineTo(4.3672f, 22.143f)
                curveTo(2.8434f, 22.5507f, 1.4493f, 21.1566f, 1.857f, 19.6328f)
                lineTo(2.4526f, 17.4068f)
                curveTo(2.5021f, 17.2219f, 2.4793f, 17.0021f, 2.3721f, 16.7869f)
                curveTo(1.6537f, 15.3445f, 1.25f, 13.7183f, 1.25f, 12.0f)
                close()
                moveTo(13.5574f, 8.7743f)
                lineTo(13.6652f, 8.8405f)
                curveTo(14.5468f, 9.3822f, 15.2815f, 9.8336f, 15.788f, 10.2603f)
                curveTo(16.3147f, 10.7039f, 16.75f, 11.2479f, 16.75f, 12.0f)
                curveTo(16.75f, 12.7521f, 16.3147f, 13.2961f, 15.788f, 13.7397f)
                curveTo(15.2815f, 14.1664f, 14.5469f, 14.6178f, 13.6652f, 15.1595f)
                lineTo(13.5574f, 15.2257f)
                curveTo(12.6647f, 15.7744f, 11.9203f, 16.2318f, 11.3103f, 16.4898f)
                curveTo(10.6827f, 16.7552f, 9.9771f, 16.905f, 9.3123f, 16.5028f)
                curveTo(8.6625f, 16.1096f, 8.4409f, 15.4216f, 8.3448f, 14.7348f)
                curveTo(8.2499f, 14.0568f, 8.25f, 13.1547f, 8.25f, 12.0599f)
                verticalLineTo(11.9401f)
                curveTo(8.25f, 10.8453f, 8.2499f, 9.9432f, 8.3448f, 9.2652f)
                curveTo(8.4409f, 8.5784f, 8.6625f, 7.8904f, 9.3123f, 7.4972f)
                curveTo(9.9771f, 7.095f, 10.6827f, 7.2449f, 11.3103f, 7.5102f)
                curveTo(11.9203f, 7.7682f, 12.6647f, 8.2256f, 13.5574f, 8.7743f)
                close()
                moveTo(10.0888f, 8.7806f)
                curveTo(10.038f, 8.8113f, 9.9094f, 8.9081f, 9.8303f, 9.473f)
                curveTo(9.7518f, 10.0344f, 9.75f, 10.8303f, 9.75f, 12.0f)
                curveTo(9.75f, 13.1697f, 9.7518f, 13.9656f, 9.8303f, 14.527f)
                curveTo(9.9094f, 15.0919f, 10.038f, 15.1887f, 10.0888f, 15.2194f)
                curveTo(10.1255f, 15.2416f, 10.2427f, 15.3126f, 10.7261f, 15.1082f)
                curveTo(11.2182f, 14.9001f, 11.8651f, 14.5051f, 12.8269f, 13.9141f)
                curveTo(13.7753f, 13.3313f, 14.4116f, 12.9379f, 14.8217f, 12.5924f)
                curveTo(15.2219f, 12.2554f, 15.25f, 12.0924f, 15.25f, 12.0f)
                curveTo(15.25f, 11.9076f, 15.2219f, 11.7446f, 14.8217f, 11.4076f)
                curveTo(14.4116f, 11.0621f, 13.7753f, 10.6687f, 12.8269f, 10.0859f)
                curveTo(11.8651f, 9.4949f, 11.2182f, 9.0999f, 10.7261f, 8.8918f)
                curveTo(10.2427f, 8.6874f, 10.1255f, 8.7584f, 10.0888f, 8.7806f)
                close()
            }
        }
            .build()
        return _chatRoundVideo!!
    }

private var _chatRoundVideo: ImageVector? = null
