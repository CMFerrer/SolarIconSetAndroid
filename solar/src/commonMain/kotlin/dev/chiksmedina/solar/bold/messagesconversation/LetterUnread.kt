package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.LetterUnread: ImageVector
    get() {
        if (_letterUnread != null) {
            return _letterUnread!!
        }
        _letterUnread = Builder(
            name = "LetterUnread", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 6.0f)
                curveTo(22.0f, 7.6568f, 20.6569f, 9.0f, 19.0f, 9.0f)
                curveTo(17.3431f, 9.0f, 16.0f, 7.6568f, 16.0f, 6.0f)
                curveTo(16.0f, 4.3432f, 17.3431f, 3.0f, 19.0f, 3.0f)
                curveTo(20.6569f, 3.0f, 22.0f, 4.3432f, 22.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 5.0f, 4.3432f, 5.0f, 3.1716f, 6.1716f)
                curveTo(2.0f, 7.3432f, 2.0f, 9.2288f, 2.0f, 13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 21.0f, 19.6569f, 21.0f, 20.8284f, 19.8284f)
                curveTo(22.0f, 18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f)
                curveTo(22.0f, 11.5466f, 22.0f, 10.3733f, 21.9329f, 9.413f)
                curveTo(21.1453f, 10.0905f, 20.1205f, 10.5f, 19.0f, 10.5f)
                curveTo(18.5213f, 10.5f, 18.0601f, 10.4253f, 17.6274f, 10.2868f)
                lineTo(16.2837f, 11.4066f)
                curveTo(15.3973f, 12.1452f, 14.6789f, 12.7439f, 14.0448f, 13.1517f)
                curveTo(13.3843f, 13.5765f, 12.7411f, 13.8449f, 12.0f, 13.8449f)
                curveTo(11.2589f, 13.8449f, 10.6157f, 13.5765f, 9.9552f, 13.1517f)
                curveTo(9.3211f, 12.7439f, 8.6027f, 12.1452f, 7.7164f, 11.4066f)
                lineTo(5.5199f, 9.5762f)
                curveTo(5.2017f, 9.311f, 5.1587f, 8.8381f, 5.4238f, 8.5199f)
                curveTo(5.689f, 8.2016f, 6.1619f, 8.1587f, 6.4801f, 8.4238f)
                lineTo(8.639f, 10.2229f)
                curveTo(9.572f, 11.0004f, 10.2197f, 11.5384f, 10.7666f, 11.8901f)
                curveTo(11.2959f, 12.2306f, 11.6549f, 12.3449f, 12.0f, 12.3449f)
                curveTo(12.3451f, 12.3449f, 12.7041f, 12.2306f, 13.2334f, 11.8901f)
                curveTo(13.7803f, 11.5384f, 14.428f, 11.0004f, 15.361f, 10.2229f)
                lineTo(16.2004f, 9.5233f)
                curveTo(15.1643f, 8.6989f, 14.5f, 7.427f, 14.5f, 6.0f)
                curveTo(14.5f, 5.6564f, 14.5385f, 5.3218f, 14.6115f, 5.0002f)
                curveTo(14.4133f, 5.0f, 14.2096f, 5.0f, 14.0f, 5.0f)
                close()
            }
        }
            .build()
        return _letterUnread!!
    }

private var _letterUnread: ImageVector? = null
