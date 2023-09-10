package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.Letter: ImageVector
    get() {
        if (_letter != null) {
            return _letter!!
        }
        _letter = Builder(
            name = "Letter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(21.4816f, 5.8247f, 21.7706f, 6.6999f, 21.8985f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 8.0f)
                lineTo(15.8411f, 9.7991f)
                curveTo(14.0045f, 11.3296f, 13.0861f, 12.0949f, 12.0f, 12.0949f)
                curveTo(11.3507f, 12.0949f, 10.7614f, 11.8214f, 10.0f, 11.2744f)
                moveTo(6.0f, 8.0f)
                lineTo(6.9f, 8.75f)
                lineTo(7.8f, 9.5f)
            }
        }
            .build()
        return _letter!!
    }

private var _letter: ImageVector? = null
