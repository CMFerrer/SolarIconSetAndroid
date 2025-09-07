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

val MessagesConversationGroup.ChatRoundMoney: ImageVector
    get() {
        if (_chatRoundMoney != null) {
            return _chatRoundMoney!!
        }
        _chatRoundMoney = Builder(
            name = "ChatRoundMoney", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.75f, 8.0f)
                curveTo(12.75f, 7.5858f, 12.4142f, 7.25f, 12.0f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                verticalLineTo(8.0102f)
                curveTo(10.1612f, 8.2845f, 9.25f, 9.143f, 9.25f, 10.3333f)
                curveTo(9.25f, 11.7903f, 10.6151f, 12.75f, 12.0f, 12.75f)
                curveTo(12.8242f, 12.75f, 13.25f, 13.2826f, 13.25f, 13.6667f)
                curveTo(13.25f, 14.0507f, 12.8242f, 14.5833f, 12.0f, 14.5833f)
                curveTo(11.1758f, 14.5833f, 10.75f, 14.0507f, 10.75f, 13.6667f)
                curveTo(10.75f, 13.2525f, 10.4142f, 12.9167f, 10.0f, 12.9167f)
                curveTo(9.5858f, 12.9167f, 9.25f, 13.2525f, 9.25f, 13.6667f)
                curveTo(9.25f, 14.857f, 10.1612f, 15.7155f, 11.25f, 15.9898f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16.0f)
                verticalLineTo(15.9898f)
                curveTo(13.8388f, 15.7155f, 14.75f, 14.857f, 14.75f, 13.6667f)
                curveTo(14.75f, 12.2097f, 13.3849f, 11.25f, 12.0f, 11.25f)
                curveTo(11.1758f, 11.25f, 10.75f, 10.7174f, 10.75f, 10.3333f)
                curveTo(10.75f, 9.9493f, 11.1758f, 9.4167f, 12.0f, 9.4167f)
                curveTo(12.8242f, 9.4167f, 13.25f, 9.9493f, 13.25f, 10.3333f)
                curveTo(13.25f, 10.7475f, 13.5858f, 11.0833f, 14.0f, 11.0833f)
                curveTo(14.4142f, 11.0833f, 14.75f, 10.7475f, 14.75f, 10.3333f)
                curveTo(14.75f, 9.143f, 13.8388f, 8.2845f, 12.75f, 8.0102f)
                verticalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _chatRoundMoney!!
    }

private var _chatRoundMoney: ImageVector? = null
