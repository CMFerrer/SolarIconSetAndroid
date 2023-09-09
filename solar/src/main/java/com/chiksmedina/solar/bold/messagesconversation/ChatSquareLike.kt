package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

public val MessagesConversationGroup.ChatSquareLike: ImageVector
    get() {
        if (_chatSquareLike != null) {
            return _chatSquareLike!!
        }
        _chatSquareLike = Builder(name = "ChatSquareLike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0867f, 21.3877f)
                lineTo(13.6288f, 20.4718f)
                curveTo(14.0492f, 19.7614f, 14.2595f, 19.4062f, 14.5972f, 19.2098f)
                curveTo(14.9349f, 19.0134f, 15.36f, 19.0061f, 16.2104f, 18.9915f)
                curveTo(17.4658f, 18.9698f, 18.2531f, 18.8929f, 18.9134f, 18.6194f)
                curveTo(20.1386f, 18.1119f, 21.1119f, 17.1386f, 21.6194f, 15.9134f)
                curveTo(22.0f, 14.9946f, 22.0f, 13.8297f, 22.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(22.0f, 7.2266f, 22.0f, 5.5898f, 21.2632f, 4.3875f)
                curveTo(20.8509f, 3.7147f, 20.2853f, 3.1491f, 19.6125f, 2.7368f)
                curveTo(18.4101f, 2.0f, 16.7734f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(10.5f)
                curveTo(7.2266f, 2.0f, 5.5898f, 2.0f, 4.3875f, 2.7368f)
                curveTo(3.7147f, 3.1491f, 3.1491f, 3.7147f, 2.7368f, 4.3875f)
                curveTo(2.0f, 5.5898f, 2.0f, 7.2266f, 2.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 13.8297f, 2.0f, 14.9946f, 2.3806f, 15.9134f)
                curveTo(2.8881f, 17.1386f, 3.8614f, 18.1119f, 5.0866f, 18.6194f)
                curveTo(5.7469f, 18.8929f, 6.5342f, 18.9698f, 7.7896f, 18.9915f)
                curveTo(8.6399f, 19.0061f, 9.0651f, 19.0134f, 9.4028f, 19.2098f)
                curveTo(9.7405f, 19.4063f, 9.9507f, 19.7614f, 10.3712f, 20.4718f)
                lineTo(10.9133f, 21.3877f)
                curveTo(11.3965f, 22.204f, 12.6035f, 22.204f, 13.0867f, 21.3877f)
                close()
                moveTo(7.5f, 9.7148f)
                curveTo(7.5f, 11.4673f, 9.6633f, 13.3304f, 10.9901f, 14.3082f)
                curveTo(11.4442f, 14.6429f, 11.6713f, 14.8103f, 12.0f, 14.8103f)
                curveTo(12.3287f, 14.8103f, 12.5558f, 14.643f, 13.0099f, 14.3082f)
                curveTo(14.3367f, 13.3304f, 16.5f, 11.4674f, 16.5f, 9.7147f)
                curveTo(16.5f, 7.0376f, 14.0249f, 6.0381f, 12.0f, 8.1061f)
                curveTo(9.9751f, 6.0381f, 7.5f, 7.0376f, 7.5f, 9.7148f)
                close()
            }
        }
        .build()
        return _chatSquareLike!!
    }

private var _chatSquareLike: ImageVector? = null
