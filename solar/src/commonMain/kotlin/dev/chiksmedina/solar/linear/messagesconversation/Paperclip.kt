package dev.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.MessagesConversationGroup

val MessagesConversationGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(
            name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.9175f, 17.8068f)
                lineTo(15.8084f, 10.2535f)
                curveTo(16.7558f, 9.3467f, 16.7558f, 7.8764f, 15.8084f, 6.9695f)
                curveTo(14.861f, 6.0627f, 13.325f, 6.0627f, 12.3776f, 6.9695f)
                lineTo(4.5439f, 14.4681f)
                curveTo(2.7438f, 16.1911f, 2.7438f, 18.9847f, 4.5439f, 20.7077f)
                curveTo(6.3439f, 22.4308f, 9.2624f, 22.4308f, 11.0624f, 20.7077f)
                lineTo(19.0105f, 13.0997f)
                curveTo(21.6632f, 10.5605f, 21.6632f, 6.4436f, 19.0105f, 3.9044f)
                curveTo(16.3578f, 1.3652f, 12.0569f, 1.3652f, 9.4042f, 3.9044f)
                lineTo(3.0f, 10.0346f)
            }
        }
            .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
