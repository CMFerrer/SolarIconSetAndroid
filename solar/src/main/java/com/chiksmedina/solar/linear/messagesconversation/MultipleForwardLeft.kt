package com.chiksmedina.solar.linear.messagesconversation

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
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.MultipleForwardLeft: ImageVector
    get() {
        if (_multipleForwardLeft != null) {
            return _multipleForwardLeft!!
        }
        _multipleForwardLeft = Builder(name = "MultipleForwardLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.3356f, 5.4797f)
                lineTo(7.3633f, 9.0107f)
                curveTo(5.7947f, 10.405f, 5.0104f, 11.1022f, 5.0104f, 12.0003f)
                curveTo(5.0104f, 12.8984f, 5.7947f, 13.5956f, 7.3633f, 14.9899f)
                lineTo(11.3356f, 18.5209f)
                curveTo(12.0517f, 19.1573f, 12.4097f, 19.4755f, 12.7048f, 19.343f)
                curveTo(13.0f, 19.2104f, 13.0f, 18.7314f, 13.0f, 17.7735f)
                verticalLineTo(15.4289f)
                curveTo(16.6f, 15.4289f, 20.5f, 17.1432f, 22.0f, 20.0003f)
                curveTo(22.0f, 10.8574f, 16.6667f, 8.5717f, 13.0f, 8.5717f)
                verticalLineTo(6.2271f)
                curveTo(13.0f, 5.2691f, 13.0f, 4.7902f, 12.7048f, 4.6576f)
                curveTo(12.4097f, 4.5251f, 12.0517f, 4.8433f, 11.3356f, 5.4797f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4613f, 4.5f)
                lineTo(3.2451f, 9.3436f)
                curveTo(2.451f, 10.081f, 1.9998f, 11.1158f, 1.9998f, 12.1994f)
                curveTo(1.9998f, 13.3418f, 2.501f, 14.4266f, 3.3709f, 15.1671f)
                lineTo(8.4613f, 19.5f)
            }
        }
        .build()
        return _multipleForwardLeft!!
    }

private var _multipleForwardLeft: ImageVector? = null
