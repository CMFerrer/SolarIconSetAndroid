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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 5.0f)
                curveTo(22.0f, 6.6568f, 20.6569f, 8.0f, 19.0f, 8.0f)
                curveTo(17.3431f, 8.0f, 16.0f, 6.6568f, 16.0f, 5.0f)
                curveTo(16.0f, 3.3431f, 17.3431f, 2.0f, 19.0f, 2.0f)
                curveTo(20.6569f, 2.0f, 22.0f, 3.3431f, 22.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(21.8063f, 19.2647f, 21.9744f, 17.3219f, 21.9966f, 13.75f)
                horizontalLineTo(18.8397f)
                curveTo(17.8659f, 13.75f, 17.6113f, 13.766f, 17.3975f, 13.8644f)
                curveTo(17.1838f, 13.9627f, 17.0059f, 14.1456f, 16.3722f, 14.8849f)
                lineTo(15.6794f, 15.6933f)
                curveTo(15.1773f, 16.2803f, 14.7796f, 16.7453f, 14.2292f, 16.9984f)
                curveTo(13.6789f, 17.2515f, 13.067f, 17.2509f, 12.2945f, 17.2501f)
                horizontalLineTo(11.7055f)
                curveTo(10.933f, 17.2509f, 10.3211f, 17.2515f, 9.7708f, 16.9984f)
                curveTo(9.2204f, 16.7453f, 8.8227f, 16.2803f, 8.3206f, 15.6933f)
                lineTo(7.6278f, 14.8849f)
                curveTo(6.9941f, 14.1456f, 6.8162f, 13.9627f, 6.6024f, 13.8644f)
                curveTo(6.3887f, 13.766f, 6.1341f, 13.75f, 5.1603f, 13.75f)
                horizontalLineTo(2.0034f)
                curveTo(2.0256f, 17.3219f, 2.1937f, 19.2647f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                lineTo(2.0f, 12.25f)
                lineTo(5.2945f, 12.2499f)
                curveTo(6.067f, 12.2491f, 6.6789f, 12.2485f, 7.2292f, 12.5016f)
                curveTo(7.7796f, 12.7547f, 8.1773f, 13.2197f, 8.6794f, 13.8067f)
                lineTo(9.3722f, 14.6151f)
                curveTo(10.0059f, 15.3544f, 10.1838f, 15.5373f, 10.3975f, 15.6356f)
                curveTo(10.6113f, 15.734f, 10.8659f, 15.75f, 11.8397f, 15.75f)
                horizontalLineTo(12.1603f)
                curveTo(13.1341f, 15.75f, 13.3887f, 15.734f, 13.6025f, 15.6356f)
                curveTo(13.8162f, 15.5373f, 13.9941f, 15.3544f, 14.6278f, 14.6151f)
                lineTo(15.3206f, 13.8067f)
                curveTo(15.8227f, 13.2197f, 16.2204f, 12.7547f, 16.7708f, 12.5016f)
                curveTo(17.3211f, 12.2485f, 17.933f, 12.2491f, 18.7055f, 12.2499f)
                lineTo(22.0f, 12.25f)
                lineTo(22.0f, 12.0f)
                curveTo(22.0f, 10.8781f, 22.0f, 9.8897f, 21.9803f, 9.0151f)
                curveTo(21.148f, 9.6339f, 20.1168f, 10.0f, 19.0f, 10.0f)
                curveTo(16.2386f, 10.0f, 14.0f, 7.7614f, 14.0f, 5.0f)
                curveTo(14.0f, 3.8832f, 14.3661f, 2.852f, 14.9849f, 2.0197f)
                curveTo(14.1103f, 2.0f, 13.1219f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
            .build()
        return _inboxUnread!!
    }

private var _inboxUnread: ImageVector? = null
