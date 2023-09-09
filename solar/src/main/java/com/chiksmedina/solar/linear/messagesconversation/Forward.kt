package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.6644f, 5.4797f)
                lineTo(18.6367f, 9.0107f)
                curveTo(20.2053f, 10.405f, 20.9896f, 11.1022f, 20.9896f, 12.0003f)
                curveTo(20.9896f, 12.8984f, 20.2053f, 13.5956f, 18.6367f, 14.9899f)
                lineTo(14.6644f, 18.5209f)
                curveTo(13.9484f, 19.1573f, 13.5903f, 19.4755f, 13.2952f, 19.343f)
                curveTo(13.0f, 19.2104f, 13.0f, 18.7314f, 13.0f, 17.7735f)
                verticalLineTo(15.4289f)
                curveTo(9.4f, 15.4289f, 5.5f, 17.1432f, 4.0f, 20.0003f)
                curveTo(4.0f, 10.8574f, 9.3333f, 8.5717f, 13.0f, 8.5717f)
                verticalLineTo(6.2271f)
                curveTo(13.0f, 5.2691f, 13.0f, 4.7902f, 13.2952f, 4.6576f)
                curveTo(13.5903f, 4.5251f, 13.9484f, 4.8433f, 14.6644f, 5.4797f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
