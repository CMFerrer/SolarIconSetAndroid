package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

public val MessagesConversationGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.8856f, 3.3626f)
                curveTo(11.8283f, 0.5458f, 16.5864f, 0.5458f, 19.5291f, 3.3626f)
                curveTo(22.4903f, 6.1971f, 22.4903f, 10.807f, 19.5291f, 13.6415f)
                lineTo(11.581f, 21.2495f)
                curveTo(9.491f, 23.2502f, 6.1153f, 23.2502f, 4.0252f, 21.2495f)
                curveTo(1.9167f, 19.2312f, 1.9167f, 15.9446f, 4.0252f, 13.9263f)
                lineTo(11.859f, 6.4277f)
                curveTo(13.0964f, 5.2432f, 15.0896f, 5.2432f, 16.327f, 6.4277f)
                curveTo(17.5829f, 7.6299f, 17.5829f, 9.5932f, 16.327f, 10.7953f)
                lineTo(8.4361f, 18.3486f)
                curveTo(8.1369f, 18.635f, 7.6621f, 18.6247f, 7.3757f, 18.3254f)
                curveTo(7.0893f, 18.0262f, 7.0997f, 17.5515f, 7.3989f, 17.265f)
                lineTo(15.2898f, 9.7118f)
                curveTo(15.9286f, 9.1002f, 15.9286f, 8.1229f, 15.2898f, 7.5113f)
                curveTo(14.6324f, 6.8821f, 13.5536f, 6.8821f, 12.8962f, 7.5113f)
                lineTo(5.0625f, 15.0098f)
                curveTo(3.571f, 16.4376f, 3.571f, 18.7382f, 5.0625f, 20.1659f)
                curveTo(6.5725f, 21.6114f, 9.0338f, 21.6114f, 10.5438f, 20.1659f)
                lineTo(18.4919f, 12.5579f)
                curveTo(20.836f, 10.314f, 20.836f, 6.6901f, 18.4919f, 4.4462f)
                curveTo(16.1292f, 2.1846f, 12.2855f, 2.1846f, 9.9228f, 4.4462f)
                lineTo(3.5186f, 10.5764f)
                curveTo(3.2194f, 10.8628f, 2.7446f, 10.8524f, 2.4582f, 10.5532f)
                curveTo(2.1718f, 10.254f, 2.1822f, 9.7792f, 2.4814f, 9.4928f)
                lineTo(8.8856f, 3.3626f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
