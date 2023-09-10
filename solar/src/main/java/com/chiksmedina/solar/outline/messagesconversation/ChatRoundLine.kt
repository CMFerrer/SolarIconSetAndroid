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

val MessagesConversationGroup.ChatRoundLine: ImageVector
    get() {
        if (_chatRoundLine != null) {
            return _chatRoundLine!!
        }
        _chatRoundLine = Builder(
            name = "ChatRoundLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(7.25f, 10.5f)
                curveTo(7.25f, 10.0858f, 7.5858f, 9.75f, 8.0f, 9.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 9.75f, 16.75f, 10.0858f, 16.75f, 10.5f)
                curveTo(16.75f, 10.9142f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                close()
                moveTo(7.25f, 14.0f)
                curveTo(7.25f, 13.5858f, 7.5858f, 13.25f, 8.0f, 13.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 13.25f, 14.25f, 13.5858f, 14.25f, 14.0f)
                curveTo(14.25f, 14.4142f, 13.9142f, 14.75f, 13.5f, 14.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 14.75f, 7.25f, 14.4142f, 7.25f, 14.0f)
                close()
            }
        }
            .build()
        return _chatRoundLine!!
    }

private var _chatRoundLine: ImageVector? = null
