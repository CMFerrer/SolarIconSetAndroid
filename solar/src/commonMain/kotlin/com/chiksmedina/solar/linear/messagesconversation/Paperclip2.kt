package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

val MessagesConversationGroup.Paperclip2: ImageVector
    get() {
        if (_paperclip2 != null) {
            return _paperclip2!!
        }
        _paperclip2 = Builder(
            name = "Paperclip2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.1069f, 17.4174f)
                lineTo(15.4868f, 10.3512f)
                curveTo(15.9348f, 9.9221f, 16.1589f, 9.7076f, 16.2759f, 9.4748f)
                curveTo(16.4856f, 9.0579f, 16.4856f, 8.5722f, 16.2759f, 8.1552f)
                curveTo(16.1589f, 7.9225f, 15.9348f, 7.7079f, 15.4868f, 7.2789f)
                curveTo(15.0387f, 6.8499f, 14.8147f, 6.6354f, 14.5715f, 6.5233f)
                curveTo(14.1361f, 6.3225f, 13.6288f, 6.3225f, 13.1934f, 6.5233f)
                curveTo(12.9502f, 6.6354f, 12.7262f, 6.8499f, 12.2781f, 7.2789f)
                lineTo(4.9518f, 14.2939f)
                curveTo(3.853f, 15.3459f, 3.3037f, 15.872f, 3.1118f, 16.4836f)
                curveTo(2.9627f, 16.9591f, 2.9627f, 17.466f, 3.1118f, 17.9414f)
                curveTo(3.3037f, 18.5531f, 3.853f, 19.0791f, 4.9518f, 20.1312f)
                curveTo(6.0505f, 21.1832f, 6.5999f, 21.7092f, 7.2387f, 21.8929f)
                curveTo(7.7353f, 22.0357f, 8.2647f, 22.0357f, 8.7612f, 21.8929f)
                curveTo(9.4f, 21.7092f, 9.9494f, 21.1832f, 11.0482f, 20.1312f)
                lineTo(18.4815f, 13.0138f)
                curveTo(19.5258f, 12.0138f, 20.048f, 11.5138f, 20.3617f, 10.9937f)
                curveTo(21.2128f, 9.5822f, 21.2128f, 7.8431f, 20.3617f, 6.4316f)
                curveTo(20.048f, 5.9115f, 19.5258f, 5.4115f, 18.4815f, 4.4115f)
                curveTo(17.4371f, 3.4115f, 16.9149f, 2.9115f, 16.3717f, 2.6112f)
                curveTo(14.8975f, 1.7963f, 13.0813f, 1.7963f, 11.6071f, 2.6112f)
                curveTo(11.0639f, 2.9115f, 10.5417f, 3.4115f, 9.4973f, 4.4115f)
                lineTo(3.5079f, 10.1464f)
            }
        }
            .build()
        return _paperclip2!!
    }

private var _paperclip2: ImageVector? = null
