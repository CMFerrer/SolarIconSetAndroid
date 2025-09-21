package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.ChatUnread: ImageVector
    get() {
        if (_chatUnread != null) {
            return _chatUnread!!
        }
        _chatUnread = Builder(
            name = "ChatUnread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0867f, 21.3877f)
                lineTo(13.6288f, 20.4718f)
                curveTo(14.0492f, 19.7614f, 14.2595f, 19.4062f, 14.5972f, 19.2098f)
                curveTo(14.9349f, 19.0134f, 15.36f, 19.0061f, 16.2104f, 18.9915f)
                curveTo(17.4658f, 18.9698f, 18.2531f, 18.8929f, 18.9134f, 18.6194f)
                curveTo(20.1386f, 18.1119f, 21.1119f, 17.1386f, 21.6194f, 15.9134f)
                curveTo(22.0f, 14.9946f, 22.0f, 13.8297f, 22.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(22.0f, 10.1303f, 22.0f, 9.7815f, 21.9989f, 9.4519f)
                curveTo(21.9976f, 9.0245f, 21.4751f, 8.7831f, 21.0971f, 8.9825f)
                curveTo(20.4709f, 9.3129f, 19.7573f, 9.5f, 19.0f, 9.5f)
                curveTo(16.5147f, 9.5f, 14.5f, 7.4853f, 14.5f, 5.0f)
                curveTo(14.5f, 4.2427f, 14.6871f, 3.5291f, 15.0175f, 2.9029f)
                curveTo(15.2169f, 2.5249f, 14.9755f, 2.0024f, 14.5481f, 2.0011f)
                curveTo(14.2185f, 2.0f, 13.8697f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(10.5f)
                curveTo(7.2266f, 2.0f, 5.5898f, 2.0f, 4.3875f, 2.7368f)
                curveTo(3.7147f, 3.1491f, 3.1491f, 3.7147f, 2.7368f, 4.3875f)
                curveTo(2.0f, 5.5898f, 2.0f, 7.2266f, 2.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 13.8297f, 2.0f, 14.9946f, 2.3806f, 15.9134f)
                curveTo(2.8881f, 17.1386f, 3.8614f, 18.1119f, 5.0866f, 18.6194f)
                curveTo(5.7469f, 18.8929f, 6.5342f, 18.9698f, 7.7896f, 18.9915f)
                curveTo(8.6399f, 19.0061f, 9.0651f, 19.0134f, 9.4028f, 19.2098f)
                curveTo(9.7405f, 19.4063f, 9.9507f, 19.7614f, 10.3712f, 20.4718f)
                lineTo(10.9133f, 21.3877f)
                curveTo(11.3965f, 22.204f, 12.6035f, 22.204f, 13.0867f, 21.3877f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
            .build()
        return _chatUnread!!
    }

private var _chatUnread: ImageVector? = null
