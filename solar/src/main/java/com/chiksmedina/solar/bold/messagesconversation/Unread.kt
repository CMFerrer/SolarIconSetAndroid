package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

public val MessagesConversationGroup.Unread: ImageVector
    get() {
        if (_unread != null) {
            return _unread!!
        }
        _unread = Builder(name = "Unread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                close()
                moveTo(17.4545f, 6.9034f)
                curveTo(17.784f, 7.1545f, 17.8476f, 7.6251f, 17.5966f, 7.9545f)
                lineTo(10.7394f, 16.9545f)
                curveTo(10.6029f, 17.1337f, 10.393f, 17.2421f, 10.1678f, 17.2496f)
                curveTo(9.9427f, 17.2571f, 9.726f, 17.163f, 9.5779f, 16.9932f)
                lineTo(6.435f, 13.3932f)
                curveTo(6.1626f, 13.0812f, 6.1947f, 12.6074f, 6.5068f, 12.335f)
                curveTo(6.8188f, 12.0626f, 7.2926f, 12.0947f, 7.565f, 12.4068f)
                lineTo(10.1033f, 15.3143f)
                lineTo(16.4034f, 7.0455f)
                curveTo(16.6545f, 6.716f, 17.1251f, 6.6524f, 17.4545f, 6.9034f)
                close()
            }
        }
        .build()
        return _unread!!
    }

private var _unread: ImageVector? = null
