package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.ChatRoundUnread: ImageVector
    get() {
        if (_chatRoundUnread != null) {
            return _chatRoundUnread!!
        }
        _chatRoundUnread = Builder(
            name = "ChatRoundUnread", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 5.0f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.2f)
                curveTo(13.3538f, 2.0689f, 12.6849f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1786f, 2.0f, 8.4709f, 2.487f, 7.0f, 3.3378f)
                moveTo(21.8f, 10.0f)
                curveTo(21.9311f, 10.6462f, 22.0f, 11.3151f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.4003f, 22.0f, 8.8884f, 21.6244f, 7.5475f, 20.9565f)
                curveTo(7.1912f, 20.7791f, 6.7839f, 20.72f, 6.3994f, 20.8229f)
                lineTo(4.1733f, 21.4185f)
                curveTo(3.207f, 21.677f, 2.3229f, 20.793f, 2.5815f, 19.8267f)
                lineTo(3.1771f, 17.6006f)
                curveTo(3.28f, 17.2161f, 3.2209f, 16.8088f, 3.0435f, 16.4525f)
                curveTo(2.3756f, 15.1116f, 2.0f, 13.5997f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _chatRoundUnread!!
    }

private var _chatRoundUnread: ImageVector? = null
