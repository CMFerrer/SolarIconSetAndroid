package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.ChatSquare: ImageVector
    get() {
        if (_chatSquare != null) {
            return _chatSquare!!
        }
        _chatSquare = Builder(name = "ChatSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9749f, 13.8133f)
                curveTo(20.4809f, 14.5722f, 18.7904f, 14.9999f, 17.0f, 14.9999f)
                curveTo(10.9249f, 14.9999f, 6.0f, 10.0751f, 6.0f, 3.9999f)
                curveTo(6.0f, 3.3707f, 6.0528f, 2.7537f, 6.1543f, 2.1533f)
                curveTo(5.4391f, 2.2587f, 4.8773f, 2.4366f, 4.3875f, 2.7367f)
                curveTo(3.7147f, 3.149f, 3.1491f, 3.7147f, 2.7368f, 4.3875f)
                curveTo(2.0f, 5.5898f, 2.0f, 7.2265f, 2.0f, 10.4999f)
                verticalLineTo(11.4999f)
                curveTo(2.0f, 13.8297f, 2.0f, 14.9945f, 2.3806f, 15.9134f)
                curveTo(2.8881f, 17.1385f, 3.8614f, 18.1119f, 5.0866f, 18.6193f)
                curveTo(5.7469f, 18.8929f, 6.5342f, 18.9698f, 7.7896f, 18.9914f)
                curveTo(8.6399f, 19.0061f, 9.0651f, 19.0134f, 9.4028f, 19.2098f)
                curveTo(9.7405f, 19.4062f, 9.9507f, 19.7614f, 10.3712f, 20.4718f)
                lineTo(10.9133f, 21.3876f)
                curveTo(11.3965f, 22.2039f, 12.6035f, 22.2039f, 13.0867f, 21.3876f)
                lineTo(13.6288f, 20.4718f)
                curveTo(14.0492f, 19.7614f, 14.2595f, 19.4062f, 14.5972f, 19.2098f)
                curveTo(14.9349f, 19.0134f, 15.36f, 19.0061f, 16.2104f, 18.9914f)
                curveTo(17.4658f, 18.9698f, 18.2531f, 18.8929f, 18.9134f, 18.6193f)
                curveTo(20.1386f, 18.1119f, 21.1119f, 17.1385f, 21.6194f, 15.9134f)
                curveTo(21.8463f, 15.3656f, 21.9379f, 14.7305f, 21.9749f, 13.8133f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0867f, 21.3876f)
                lineTo(13.6288f, 20.4718f)
                curveTo(14.0492f, 19.7614f, 14.2595f, 19.4062f, 14.5972f, 19.2098f)
                curveTo(14.9349f, 19.0134f, 15.36f, 19.0061f, 16.2104f, 18.9914f)
                curveTo(17.4658f, 18.9698f, 18.2531f, 18.8929f, 18.9134f, 18.6193f)
                curveTo(20.1386f, 18.1119f, 21.1119f, 17.1385f, 21.6194f, 15.9134f)
                curveTo(21.8463f, 15.3656f, 21.9379f, 14.7305f, 21.9749f, 13.8133f)
                curveTo(20.4809f, 14.5722f, 18.7904f, 14.9999f, 17.0f, 14.9999f)
                curveTo(10.9249f, 14.9999f, 6.0f, 10.0751f, 6.0f, 3.9999f)
                curveTo(6.0f, 3.3707f, 6.0528f, 2.7537f, 6.1543f, 2.1533f)
                curveTo(5.4391f, 2.2587f, 4.8773f, 2.4366f, 4.3875f, 2.7367f)
                curveTo(3.7147f, 3.149f, 3.1491f, 3.7147f, 2.7368f, 4.3875f)
                curveTo(2.0f, 5.5898f, 2.0f, 7.2265f, 2.0f, 10.4999f)
                verticalLineTo(11.4999f)
                curveTo(2.0f, 13.8297f, 2.0f, 14.9945f, 2.3806f, 15.9134f)
                curveTo(2.8881f, 17.1385f, 3.8614f, 18.1119f, 5.0866f, 18.6193f)
                curveTo(5.7469f, 18.8929f, 6.5342f, 18.9698f, 7.7896f, 18.9914f)
                curveTo(8.6399f, 19.0061f, 9.0651f, 19.0134f, 9.4028f, 19.2098f)
                curveTo(9.7405f, 19.4062f, 9.9507f, 19.7614f, 10.3712f, 20.4718f)
                lineTo(10.9133f, 21.3876f)
                curveTo(11.3965f, 22.2039f, 12.6035f, 22.2039f, 13.0867f, 21.3876f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 2.0f)
                horizontalLineTo(10.5f)
                curveTo(8.56f, 2.0f, 7.1949f, 2.0f, 6.1543f, 2.1534f)
                curveTo(6.0528f, 2.7538f, 6.0f, 3.3707f, 6.0f, 4.0f)
                curveTo(6.0f, 10.0751f, 10.9249f, 15.0f, 17.0f, 15.0f)
                curveTo(18.7904f, 15.0f, 20.4809f, 14.5722f, 21.9749f, 13.8134f)
                curveTo(22.0f, 13.1919f, 22.0f, 12.441f, 22.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(22.0f, 7.2266f, 22.0f, 5.5898f, 21.2632f, 4.3875f)
                curveTo(20.8509f, 3.7147f, 20.2853f, 3.1491f, 19.6125f, 2.7368f)
                curveTo(18.4101f, 2.0f, 16.7734f, 2.0f, 13.5f, 2.0f)
                close()
            }
        }
        .build()
        return _chatSquare!!
    }

private var _chatSquare: ImageVector? = null
