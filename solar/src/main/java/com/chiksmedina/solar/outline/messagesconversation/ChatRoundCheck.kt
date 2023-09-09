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

public val MessagesConversationGroup.ChatRoundCheck: ImageVector
    get() {
        if (_chatRoundCheck != null) {
            return _chatRoundCheck!!
        }
        _chatRoundCheck = Builder(name = "ChatRoundCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4811f, 3.0975f, 14.8788f, 3.7148f, 16.1181f)
                curveTo(3.9625f, 16.6155f, 4.0579f, 17.2103f, 3.9016f, 17.7945f)
                lineTo(3.306f, 20.0205f)
                curveTo(3.1966f, 20.4293f, 3.5707f, 20.8034f, 3.9795f, 20.694f)
                lineTo(6.2055f, 20.0984f)
                curveTo(6.7897f, 19.9421f, 7.3845f, 20.0375f, 7.8819f, 20.2852f)
                curveTo(9.1212f, 20.9025f, 10.5189f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(10.2817f, 22.75f, 8.6555f, 22.3463f, 7.2132f, 21.6279f)
                curveTo(6.9979f, 21.5207f, 6.7781f, 21.4979f, 6.5932f, 21.5474f)
                lineTo(4.3672f, 22.143f)
                curveTo(2.8434f, 22.5507f, 1.4493f, 21.1566f, 1.857f, 19.6328f)
                lineTo(2.4526f, 17.4068f)
                curveTo(2.5021f, 17.2219f, 2.4793f, 17.0021f, 2.3721f, 16.7869f)
                curveTo(1.6537f, 15.3445f, 1.25f, 13.7183f, 1.25f, 12.0f)
                close()
                moveTo(15.5303f, 9.4697f)
                curveTo(15.8232f, 9.7626f, 15.8232f, 10.2374f, 15.5303f, 10.5303f)
                lineTo(11.5303f, 14.5303f)
                curveTo(11.2417f, 14.819f, 10.7751f, 14.8238f, 10.4806f, 14.541f)
                lineTo(8.4806f, 12.621f)
                curveTo(8.1818f, 12.3342f, 8.1721f, 11.8594f, 8.459f, 11.5606f)
                curveTo(8.7458f, 11.2618f, 9.2206f, 11.2521f, 9.5194f, 11.539f)
                lineTo(10.9893f, 12.9501f)
                lineTo(14.4697f, 9.4697f)
                curveTo(14.7626f, 9.1768f, 15.2374f, 9.1768f, 15.5303f, 9.4697f)
                close()
            }
        }
        .build()
        return _chatRoundCheck!!
    }

private var _chatRoundCheck: ImageVector? = null
