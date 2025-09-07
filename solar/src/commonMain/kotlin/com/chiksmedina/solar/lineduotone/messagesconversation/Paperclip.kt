package com.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MessagesConversationGroup

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
                moveTo(3.0f, 10.0346f)
                lineTo(9.4042f, 3.9044f)
                curveTo(12.0569f, 1.3652f, 16.3578f, 1.3652f, 19.0105f, 3.9044f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0105f, 13.0996f)
                lineTo(19.5291f, 13.6414f)
                lineTo(19.5291f, 13.6414f)
                lineTo(19.0105f, 13.0996f)
                close()
                moveTo(11.0624f, 20.7076f)
                lineTo(10.5438f, 20.1658f)
                lineTo(10.5438f, 20.1658f)
                lineTo(11.0624f, 20.7076f)
                close()
                moveTo(4.5439f, 14.4679f)
                lineTo(5.0625f, 15.0097f)
                lineTo(5.0625f, 15.0097f)
                lineTo(4.5439f, 14.4679f)
                close()
                moveTo(12.3776f, 6.9694f)
                lineTo(11.859f, 6.4276f)
                lineTo(12.3776f, 6.9694f)
                close()
                moveTo(19.5291f, 3.3625f)
                curveTo(19.2299f, 3.0761f, 18.7551f, 3.0865f, 18.4687f, 3.3857f)
                curveTo(18.1823f, 3.6849f, 18.1927f, 4.1597f, 18.4919f, 4.4461f)
                lineTo(19.5291f, 3.3625f)
                close()
                moveTo(18.4919f, 12.5578f)
                lineTo(10.5438f, 20.1658f)
                lineTo(11.581f, 21.2494f)
                lineTo(19.5291f, 13.6414f)
                lineTo(18.4919f, 12.5578f)
                close()
                moveTo(5.0625f, 15.0097f)
                lineTo(12.8962f, 7.5112f)
                lineTo(11.859f, 6.4276f)
                lineTo(4.0253f, 13.9262f)
                lineTo(5.0625f, 15.0097f)
                close()
                moveTo(16.327f, 6.4276f)
                curveTo(15.0896f, 5.2431f, 13.0964f, 5.2431f, 11.859f, 6.4276f)
                lineTo(12.8962f, 7.5112f)
                curveTo(13.5536f, 6.8819f, 14.6324f, 6.8819f, 15.2898f, 7.5112f)
                lineTo(16.327f, 6.4276f)
                close()
                moveTo(5.0625f, 20.1658f)
                curveTo(3.571f, 18.7381f, 3.571f, 16.4375f, 5.0625f, 15.0097f)
                lineTo(4.0253f, 13.9261f)
                curveTo(1.9167f, 15.9445f, 1.9167f, 19.2311f, 4.0253f, 21.2494f)
                lineTo(5.0625f, 20.1658f)
                close()
                moveTo(10.5438f, 20.1658f)
                curveTo(9.0338f, 21.6112f, 6.5725f, 21.6112f, 5.0625f, 20.1658f)
                lineTo(4.0253f, 21.2494f)
                curveTo(6.1153f, 23.25f, 9.491f, 23.25f, 11.581f, 21.2494f)
                lineTo(10.5438f, 20.1658f)
                close()
                moveTo(18.4919f, 4.4461f)
                curveTo(20.8361f, 6.69f, 20.8361f, 10.3139f, 18.4919f, 12.5578f)
                lineTo(19.5291f, 13.6414f)
                curveTo(22.4903f, 10.8069f, 22.4903f, 6.197f, 19.5291f, 3.3625f)
                lineTo(18.4919f, 4.4461f)
                close()
            }
        }
            .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
