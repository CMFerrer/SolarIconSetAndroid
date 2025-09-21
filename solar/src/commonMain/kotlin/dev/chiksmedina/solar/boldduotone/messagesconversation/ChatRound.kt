package dev.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.ChatRound: ImageVector
    get() {
        if (_chatRound != null) {
            return _chatRound!!
        }
        _chatRound = Builder(
            name = "ChatRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4565f, 3.0898f)
                curveTo(4.2175f, 4.7447f, 2.0f, 8.1136f, 2.0f, 12.0004f)
                curveTo(2.0f, 13.6001f, 2.3756f, 15.1121f, 3.0435f, 16.4529f)
                curveTo(3.2209f, 16.8092f, 3.28f, 17.2165f, 3.1771f, 17.6011f)
                lineTo(2.5815f, 19.8271f)
                curveTo(2.3229f, 20.7934f, 3.207f, 21.6775f, 4.1733f, 21.4189f)
                lineTo(6.3994f, 20.8233f)
                curveTo(6.7839f, 20.7204f, 7.1912f, 20.7795f, 7.5475f, 20.957f)
                curveTo(8.8884f, 21.6248f, 10.4003f, 22.0005f, 12.0f, 22.0005f)
                curveTo(16.8853f, 22.0005f, 20.9524f, 18.4973f, 21.8263f, 13.866f)
                curveTo(20.1758f, 15.7851f, 17.7298f, 17.0004f, 15.0f, 17.0004f)
                curveTo(10.0294f, 17.0004f, 6.0f, 12.971f, 6.0f, 8.0005f)
                curveTo(6.0f, 6.1887f, 6.5353f, 4.502f, 7.4565f, 3.0898f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.8263f, 13.8655f)
                curveTo(21.9403f, 13.2611f, 22.0f, 12.6375f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(10.4467f, 2.0f, 8.9761f, 2.3542f, 7.6646f, 2.9861f)
                curveTo(7.5948f, 3.0198f, 7.5254f, 3.0542f, 7.4565f, 3.0894f)
                curveTo(6.5353f, 4.5015f, 6.0f, 6.1882f, 6.0f, 8.0f)
                curveTo(6.0f, 12.9706f, 10.0294f, 17.0f, 15.0f, 17.0f)
                curveTo(17.7298f, 17.0f, 20.1758f, 15.7847f, 21.8263f, 13.8655f)
                close()
            }
        }
            .build()
        return _chatRound!!
    }

private var _chatRound: ImageVector? = null
