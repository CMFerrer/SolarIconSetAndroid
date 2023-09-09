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

public val MessagesConversationGroup.PaperclipRounded2: ImageVector
    get() {
        if (_paperclipRounded2 != null) {
            return _paperclipRounded2!!
        }
        _paperclipRounded2 = Builder(name = "PaperclipRounded2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5646f, 16.1299f)
                curveTo(22.8118f, 12.8975f, 22.8118f, 7.6567f, 19.5646f, 4.4243f)
                curveTo(16.3175f, 1.1919f, 11.0528f, 1.1919f, 7.8056f, 4.4243f)
                moveTo(15.8899f, 19.7878f)
                curveTo(14.2664f, 21.404f, 11.634f, 21.404f, 10.0104f, 19.7878f)
                curveTo(8.3869f, 18.1716f, 8.3869f, 15.5513f, 10.0104f, 13.9351f)
                lineTo(12.9502f, 11.0087f)
                moveTo(4.1309f, 8.0823f)
                curveTo(1.2897f, 10.9106f, 1.2897f, 15.4963f, 4.1309f, 18.3247f)
            }
        }
        .build()
        return _paperclipRounded2!!
    }

private var _paperclipRounded2: ImageVector? = null
