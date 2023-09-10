package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.ChatSquare: ImageVector
    get() {
        if (_chatSquare != null) {
            return _chatSquare!!
        }
        _chatSquare = Builder(
            name = "ChatSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.6288f, 20.4718f)
                lineTo(13.0867f, 21.3877f)
                curveTo(12.6035f, 22.204f, 11.3965f, 22.204f, 10.9133f, 21.3877f)
                lineTo(10.3712f, 20.4718f)
                curveTo(9.9507f, 19.7614f, 9.7405f, 19.4063f, 9.4028f, 19.2098f)
                curveTo(9.0651f, 19.0134f, 8.6399f, 19.0061f, 7.7896f, 18.9915f)
                curveTo(6.5342f, 18.9698f, 5.7469f, 18.8929f, 5.0866f, 18.6194f)
                curveTo(3.8614f, 18.1119f, 2.8881f, 17.1386f, 2.3806f, 15.9134f)
                curveTo(2.0f, 14.9946f, 2.0f, 13.8297f, 2.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(2.0f, 7.2266f, 2.0f, 5.5898f, 2.7368f, 4.3875f)
                curveTo(3.1491f, 3.7147f, 3.7147f, 3.1491f, 4.3875f, 2.7368f)
                curveTo(5.5898f, 2.0f, 7.2266f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(16.7734f, 2.0f, 18.4101f, 2.0f, 19.6125f, 2.7368f)
                curveTo(20.2853f, 3.1491f, 20.8509f, 3.7147f, 21.2632f, 4.3875f)
                curveTo(22.0f, 5.5898f, 22.0f, 7.2266f, 22.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(22.0f, 13.8297f, 22.0f, 14.9946f, 21.6194f, 15.9134f)
                curveTo(21.1119f, 17.1386f, 20.1386f, 18.1119f, 18.9134f, 18.6194f)
                curveTo(18.2531f, 18.8929f, 17.4658f, 18.9698f, 16.2104f, 18.9915f)
                curveTo(15.36f, 19.0061f, 14.9349f, 19.0134f, 14.5972f, 19.2098f)
                curveTo(14.2595f, 19.4062f, 14.0492f, 19.7614f, 13.6288f, 20.4718f)
                close()
            }
        }
            .build()
        return _chatSquare!!
    }

private var _chatSquare: ImageVector? = null
