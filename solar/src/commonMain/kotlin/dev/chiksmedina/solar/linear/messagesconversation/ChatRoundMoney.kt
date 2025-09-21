package dev.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.MessagesConversationGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 15.3333f)
                curveTo(13.1046f, 15.3333f, 14.0f, 14.5871f, 14.0f, 13.6667f)
                curveTo(14.0f, 12.7462f, 13.1046f, 12.0f, 12.0f, 12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 11.2538f, 10.0f, 10.3333f)
                curveTo(10.0f, 9.4129f, 10.8954f, 8.6667f, 12.0f, 8.6667f)
                moveTo(12.0f, 15.3333f)
                curveTo(10.8954f, 15.3333f, 10.0f, 14.5871f, 10.0f, 13.6667f)
                moveTo(12.0f, 15.3333f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 8.0f)
                verticalLineTo(8.6667f)
                moveTo(12.0f, 8.6667f)
                curveTo(13.1046f, 8.6667f, 14.0f, 9.4129f, 14.0f, 10.3333f)
            }
        }
            .build()
        return _chatRoundMoney!!
    }

private var _chatRoundMoney: ImageVector? = null
