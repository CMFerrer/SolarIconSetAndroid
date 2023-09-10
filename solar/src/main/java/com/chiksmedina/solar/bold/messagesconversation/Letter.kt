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

val MessagesConversationGroup.Letter: ImageVector
    get() {
        if (_letter != null) {
            return _letter!!
        }
        _letter = Builder(
            name = "Letter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 20.0f, 19.6569f, 20.0f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                close()
                moveTo(18.5762f, 7.5199f)
                curveTo(18.8413f, 7.8381f, 18.7983f, 8.311f, 18.4801f, 8.5762f)
                lineTo(16.2837f, 10.4066f)
                curveTo(15.3973f, 11.1452f, 14.6789f, 11.7439f, 14.0448f, 12.1517f)
                curveTo(13.3843f, 12.5765f, 12.7411f, 12.8449f, 12.0f, 12.8449f)
                curveTo(11.2589f, 12.8449f, 10.6157f, 12.5765f, 9.9552f, 12.1517f)
                curveTo(9.3211f, 11.7439f, 8.6027f, 11.1452f, 7.7164f, 10.4066f)
                lineTo(5.5199f, 8.5762f)
                curveTo(5.2017f, 8.311f, 5.1587f, 7.8381f, 5.4238f, 7.5199f)
                curveTo(5.689f, 7.2017f, 6.1619f, 7.1587f, 6.4801f, 7.4238f)
                lineTo(8.639f, 9.2229f)
                curveTo(9.572f, 10.0004f, 10.2197f, 10.5384f, 10.7666f, 10.8901f)
                curveTo(11.2959f, 11.2306f, 11.6549f, 11.3449f, 12.0f, 11.3449f)
                curveTo(12.3451f, 11.3449f, 12.7041f, 11.2306f, 13.2334f, 10.8901f)
                curveTo(13.7803f, 10.5384f, 14.428f, 10.0004f, 15.361f, 9.2229f)
                lineTo(17.5199f, 7.4238f)
                curveTo(17.8381f, 7.1587f, 18.311f, 7.2017f, 18.5762f, 7.5199f)
                close()
            }
        }
            .build()
        return _letter!!
    }

private var _letter: ImageVector? = null
