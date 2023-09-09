package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

public val MessagesConversationGroup.InboxIn: ImageVector
    get() {
        if (_inboxIn != null) {
            return _inboxIn!!
        }
        _inboxIn = Builder(name = "InboxIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 10.0f)
                moveTo(12.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                moveTo(12.0f, 10.0f)
                lineTo(9.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0001f)
                curveTo(22.0f, 16.7141f, 22.0f, 19.0712f, 20.5355f, 20.5356f)
                curveTo(19.0711f, 22.0001f, 16.714f, 22.0001f, 12.0f, 22.0001f)
                curveTo(7.286f, 22.0001f, 4.9289f, 22.0001f, 3.4645f, 20.5356f)
                curveTo(2.0f, 19.0712f, 2.0f, 16.7141f, 2.0f, 12.0001f)
                curveTo(2.0f, 7.286f, 2.0f, 4.929f, 3.4645f, 3.4646f)
                curveTo(4.2809f, 2.6481f, 5.3749f, 2.2868f, 7.0f, 2.127f)
                moveTo(17.0f, 2.127f)
                curveTo(18.6251f, 2.2868f, 19.7191f, 2.6481f, 20.5355f, 3.4646f)
                curveTo(21.5093f, 4.4383f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
        .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null