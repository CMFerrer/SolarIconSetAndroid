package dev.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(
            name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.9548f, 5.1834f)
                lineTo(18.9327f, 9.6081f)
                curveTo(19.8632f, 10.4353f, 20.3285f, 10.8489f, 20.5f, 11.3373f)
                curveTo(20.6506f, 11.7662f, 20.6506f, 12.2335f, 20.5f, 12.6624f)
                curveTo(20.3285f, 13.1508f, 19.8632f, 13.5644f, 18.9327f, 14.3916f)
                lineTo(13.9548f, 18.8163f)
                curveTo(13.5325f, 19.1917f, 13.3214f, 19.3794f, 13.142f, 19.3861f)
                curveTo(12.9862f, 19.3919f, 12.8366f, 19.3247f, 12.7375f, 19.2044f)
                curveTo(12.6233f, 19.0659f, 12.6233f, 18.7834f, 12.6233f, 18.2184f)
                verticalLineTo(15.4284f)
                curveTo(10.1952f, 15.4284f, 7.6307f, 16.2083f, 5.7581f, 17.5926f)
                curveTo(4.7832f, 18.3133f, 4.2957f, 18.6737f, 4.1101f, 18.6595f)
                curveTo(3.9291f, 18.6456f, 3.8142f, 18.575f, 3.7203f, 18.4196f)
                curveTo(3.624f, 18.2603f, 3.7091f, 17.7624f, 3.8792f, 16.7666f)
                curveTo(4.9842f, 10.3004f, 9.4342f, 8.5713f, 12.6233f, 8.5713f)
                verticalLineTo(5.7813f)
                curveTo(12.6233f, 5.2163f, 12.6233f, 4.9338f, 12.7375f, 4.7953f)
                curveTo(12.8366f, 4.675f, 12.9862f, 4.6078f, 13.142f, 4.6136f)
                curveTo(13.3214f, 4.6203f, 13.5325f, 4.808f, 13.9548f, 5.1834f)
                close()
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
