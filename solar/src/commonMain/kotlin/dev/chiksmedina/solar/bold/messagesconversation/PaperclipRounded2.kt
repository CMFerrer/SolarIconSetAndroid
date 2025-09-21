package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.PaperclipRounded2: ImageVector
    get() {
        if (_paperclipRounded2 != null) {
            return _paperclipRounded2!!
        }
        _paperclipRounded2 = Builder(
            name = "PaperclipRounded2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.9638f, 6.8626f)
                curveTo(11.2024f, 4.7125f, 14.8198f, 4.7125f, 17.0583f, 6.8626f)
                curveTo(19.3139f, 9.0292f, 19.3139f, 12.5548f, 17.0583f, 14.7213f)
                lineTo(14.8535f, 16.8391f)
                curveTo(13.5891f, 18.0536f, 11.5511f, 18.0536f, 10.2867f, 16.8391f)
                curveTo(9.0053f, 15.6083f, 9.0053f, 13.5997f, 10.2867f, 12.3689f)
                lineTo(12.0506f, 10.6747f)
                curveTo(12.3493f, 10.3877f, 12.8241f, 10.3973f, 13.111f, 10.696f)
                curveTo(13.398f, 10.9947f, 13.3884f, 11.4695f, 13.0897f, 11.7564f)
                lineTo(11.3258f, 13.4507f)
                curveTo(10.6589f, 14.0912f, 10.6589f, 15.1168f, 11.3258f, 15.7573f)
                curveTo(12.0097f, 16.4142f, 13.1305f, 16.4142f, 13.8144f, 15.7573f)
                lineTo(16.0192f, 13.6395f)
                curveTo(17.6603f, 12.0633f, 17.6603f, 9.5207f, 16.0192f, 7.9444f)
                curveTo(14.3612f, 6.3519f, 11.661f, 6.3519f, 10.0029f, 7.9444f)
                lineTo(7.7981f, 10.0622f)
                curveTo(6.4006f, 11.4045f, 6.4006f, 13.5679f, 7.7981f, 14.9102f)
                curveTo(8.0969f, 15.1972f, 8.1064f, 15.6719f, 7.8195f, 15.9707f)
                curveTo(7.5325f, 16.2694f, 7.0578f, 16.279f, 6.759f, 15.992f)
                curveTo(4.747f, 14.0594f, 4.747f, 10.913f, 6.759f, 8.9804f)
                lineTo(8.9638f, 6.8626f)
                close()
            }
        }
            .build()
        return _paperclipRounded2!!
    }

private var _paperclipRounded2: ImageVector? = null
