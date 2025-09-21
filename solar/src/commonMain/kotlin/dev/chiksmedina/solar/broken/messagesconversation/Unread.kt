package dev.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.Unread: ImageVector
    get() {
        if (_unread != null) {
            return _unread!!
        }
        _unread = Builder(
            name = "Unread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 12.9f)
                lineTo(10.1429f, 16.5f)
                lineTo(12.1071f, 14.25f)
                moveTo(18.0f, 7.5f)
                lineTo(14.0714f, 12.0f)
            }
        }
            .build()
        return _unread!!
    }

private var _unread: ImageVector? = null
