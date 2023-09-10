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

val MessagesConversationGroup.InboxUnread: ImageVector
    get() {
        if (_inboxUnread != null) {
            return _inboxUnread!!
        }
        _inboxUnread = Builder(
            name = "InboxUnread", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 13.0f)
                horizontalLineTo(5.1603f)
                curveTo(6.0654f, 13.0f, 6.518f, 13.0f, 6.9158f, 13.183f)
                curveTo(7.3137f, 13.3659f, 7.6082f, 13.7096f, 8.1973f, 14.3968f)
                lineTo(8.8027f, 15.1032f)
                curveTo(9.3918f, 15.7904f, 9.6863f, 16.1341f, 10.0842f, 16.317f)
                curveTo(10.482f, 16.5f, 10.9346f, 16.5f, 11.8397f, 16.5f)
                horizontalLineTo(12.1603f)
                curveTo(13.0654f, 16.5f, 13.518f, 16.5f, 13.9158f, 16.317f)
                curveTo(14.3137f, 16.1341f, 14.6082f, 15.7904f, 15.1973f, 15.1032f)
                lineTo(15.8027f, 14.3968f)
                curveTo(16.3918f, 13.7096f, 16.6863f, 13.3659f, 17.0842f, 13.183f)
                curveTo(17.482f, 13.0f, 17.9346f, 13.0f, 18.8397f, 13.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 11.2801f, 22.0f, 10.6152f, 21.9948f, 10.0f)
                moveTo(14.0f, 2.0052f)
                curveTo(13.3848f, 2.0f, 12.7199f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.4907f, 4.4382f, 2.1644f, 5.8066f, 2.0551f, 8.0f)
            }
        }
            .build()
        return _inboxUnread!!
    }

private var _inboxUnread: ImageVector? = null
