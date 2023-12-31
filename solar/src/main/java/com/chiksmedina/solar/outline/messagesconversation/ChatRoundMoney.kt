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

val MessagesConversationGroup.ChatRoundMoney: ImageVector
    get() {
        if (_chatRoundMoney != null) {
            return _chatRoundMoney!!
        }
        _chatRoundMoney = Builder(
            name = "ChatRoundMoney", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 7.25f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                verticalLineTo(8.0102f)
                curveTo(13.8388f, 8.2845f, 14.75f, 9.143f, 14.75f, 10.3333f)
                curveTo(14.75f, 10.7475f, 14.4142f, 11.0833f, 14.0f, 11.0833f)
                curveTo(13.5858f, 11.0833f, 13.25f, 10.7475f, 13.25f, 10.3333f)
                curveTo(13.25f, 9.9493f, 12.8242f, 9.4167f, 12.0f, 9.4167f)
                curveTo(11.1758f, 9.4167f, 10.75f, 9.9493f, 10.75f, 10.3333f)
                curveTo(10.75f, 10.7174f, 11.1758f, 11.25f, 12.0f, 11.25f)
                curveTo(13.3849f, 11.25f, 14.75f, 12.2098f, 14.75f, 13.6667f)
                curveTo(14.75f, 14.857f, 13.8388f, 15.7155f, 12.75f, 15.9898f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(15.9898f)
                curveTo(10.1612f, 15.7155f, 9.25f, 14.857f, 9.25f, 13.6667f)
                curveTo(9.25f, 13.2525f, 9.5858f, 12.9167f, 10.0f, 12.9167f)
                curveTo(10.4142f, 12.9167f, 10.75f, 13.2525f, 10.75f, 13.6667f)
                curveTo(10.75f, 14.0507f, 11.1758f, 14.5833f, 12.0f, 14.5833f)
                curveTo(12.8242f, 14.5833f, 13.25f, 14.0507f, 13.25f, 13.6667f)
                curveTo(13.25f, 13.2826f, 12.8242f, 12.75f, 12.0f, 12.75f)
                curveTo(10.6151f, 12.75f, 9.25f, 11.7903f, 9.25f, 10.3333f)
                curveTo(9.25f, 9.143f, 10.1612f, 8.2845f, 11.25f, 8.0102f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.5858f, 11.5858f, 7.25f, 12.0f, 7.25f)
                close()
            }
        }
            .build()
        return _chatRoundMoney!!
    }

private var _chatRoundMoney: ImageVector? = null
