package dev.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.4933f, 6.935f)
                curveTo(18.8053f, 7.2074f, 18.8374f, 7.6812f, 18.565f, 7.9932f)
                lineTo(10.7079f, 16.9933f)
                curveTo(10.5654f, 17.1564f, 10.3594f, 17.25f, 10.1429f, 17.25f)
                curveTo(9.9263f, 17.25f, 9.7203f, 17.1564f, 9.5779f, 16.9933f)
                lineTo(6.435f, 13.3933f)
                curveTo(6.1626f, 13.0812f, 6.1947f, 12.6074f, 6.5068f, 12.335f)
                curveTo(6.8188f, 12.0626f, 7.2926f, 12.0947f, 7.565f, 12.4068f)
                lineTo(10.1429f, 15.3596f)
                lineTo(17.435f, 7.0068f)
                curveTo(17.7074f, 6.6947f, 18.1812f, 6.6626f, 18.4933f, 6.935f)
                close()
            }
        }
            .build()
        return _unread!!
    }

private var _unread: ImageVector? = null
