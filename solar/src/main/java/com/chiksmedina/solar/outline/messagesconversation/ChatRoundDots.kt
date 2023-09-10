package com.chiksmedina.solar.outline.messagesconversation

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
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.ChatRoundDots: ImageVector
    get() {
        if (_chatRoundDots != null) {
            return _chatRoundDots!!
        }
        _chatRoundDots = Builder(
            name = "ChatRoundDots", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 12.5523f, 8.5523f, 13.0f, 8.0f, 13.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                curveTo(8.5523f, 11.0f, 9.0f, 11.4477f, 9.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
                curveTo(12.5523f, 11.0f, 13.0f, 11.4477f, 13.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                curveTo(15.4477f, 13.0f, 15.0f, 12.5523f, 15.0f, 12.0f)
                curveTo(15.0f, 11.4477f, 15.4477f, 11.0f, 16.0f, 11.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 13.7183f, 1.6537f, 15.3445f, 2.3721f, 16.7869f)
                curveTo(2.4793f, 17.0021f, 2.5021f, 17.2219f, 2.4526f, 17.4068f)
                lineTo(1.857f, 19.6328f)
                curveTo(1.4493f, 21.1566f, 2.8434f, 22.5507f, 4.3672f, 22.143f)
                lineTo(6.5932f, 21.5474f)
                curveTo(6.7781f, 21.4979f, 6.9979f, 21.5207f, 7.2132f, 21.6279f)
                curveTo(8.6555f, 22.3463f, 10.2817f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(10.5189f, 21.25f, 9.1212f, 20.9025f, 7.8819f, 20.2852f)
                curveTo(7.3845f, 20.0375f, 6.7897f, 19.9421f, 6.2055f, 20.0984f)
                lineTo(3.9795f, 20.694f)
                curveTo(3.5707f, 20.8034f, 3.1966f, 20.4293f, 3.306f, 20.0205f)
                lineTo(3.9016f, 17.7945f)
                curveTo(4.0579f, 17.2103f, 3.9625f, 16.6155f, 3.7148f, 16.1181f)
                curveTo(3.0975f, 14.8788f, 2.75f, 13.4811f, 2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
            .build()
        return _chatRoundDots!!
    }

private var _chatRoundDots: ImageVector? = null
