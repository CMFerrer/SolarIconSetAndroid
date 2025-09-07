package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.ChatRoundCheck: ImageVector
    get() {
        if (_chatRoundCheck != null) {
            return _chatRoundCheck!!
        }
        _chatRoundCheck = Builder(
            name = "ChatRoundCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.5997f, 2.3756f, 15.1116f, 3.0435f, 16.4525f)
                curveTo(3.2209f, 16.8088f, 3.28f, 17.2161f, 3.1771f, 17.6006f)
                lineTo(2.5815f, 19.8267f)
                curveTo(2.3229f, 20.793f, 3.207f, 21.677f, 4.1733f, 21.4185f)
                lineTo(6.3994f, 20.8229f)
                curveTo(6.7839f, 20.72f, 7.1912f, 20.7791f, 7.5475f, 20.9565f)
                curveTo(8.8884f, 21.6244f, 10.4003f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
