package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.Pen2: ImageVector
    get() {
        if (_pen2 != null) {
            return _pen2!!
        }
        _pen2 = Builder(name = "Pen2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                horizontalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.8881f, 3.6629f)
                lineTo(14.6296f, 2.9214f)
                curveTo(15.8581f, 1.6929f, 17.85f, 1.6929f, 19.0786f, 2.9214f)
                curveTo(20.3071f, 4.15f, 20.3071f, 6.1419f, 19.0786f, 7.3704f)
                lineTo(18.3371f, 8.1119f)
                moveTo(13.8881f, 3.6629f)
                curveTo(13.8881f, 3.6629f, 13.9807f, 5.2386f, 15.3711f, 6.6289f)
                curveTo(16.7614f, 8.0193f, 18.3371f, 8.1119f, 18.3371f, 8.1119f)
                moveTo(13.8881f, 3.6629f)
                lineTo(7.0711f, 10.4799f)
                curveTo(6.6093f, 10.9416f, 6.3785f, 11.1725f, 6.1799f, 11.4271f)
                curveTo(5.9457f, 11.7273f, 5.7449f, 12.0522f, 5.5811f, 12.396f)
                curveTo(5.4422f, 12.6874f, 5.3389f, 12.9972f, 5.1325f, 13.6167f)
                lineTo(4.2575f, 16.2417f)
                moveTo(18.3371f, 8.1119f)
                lineTo(11.5201f, 14.9289f)
                curveTo(11.0584f, 15.3907f, 10.8275f, 15.6215f, 10.5729f, 15.8201f)
                curveTo(10.2727f, 16.0543f, 9.9478f, 16.2551f, 9.604f, 16.4189f)
                curveTo(9.3126f, 16.5578f, 9.0028f, 16.6611f, 8.3833f, 16.8675f)
                lineTo(5.7583f, 17.7426f)
                moveTo(5.7583f, 17.7426f)
                lineTo(5.1167f, 17.9564f)
                curveTo(4.8118f, 18.0581f, 4.4757f, 17.9787f, 4.2485f, 17.7515f)
                curveTo(4.0213f, 17.5243f, 3.9419f, 17.1882f, 4.0436f, 16.8833f)
                lineTo(4.2575f, 16.2417f)
                moveTo(5.7583f, 17.7426f)
                lineTo(4.2575f, 16.2417f)
            }
        }
        .build()
        return _pen2!!
    }

private var _pen2: ImageVector? = null
