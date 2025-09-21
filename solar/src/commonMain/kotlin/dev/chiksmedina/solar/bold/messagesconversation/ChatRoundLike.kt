package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.ChatRoundLike: ImageVector
    get() {
        if (_chatRoundLike != null) {
            return _chatRoundLike!!
        }
        _chatRoundLike = Builder(
            name = "ChatRoundLike", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.4003f, 22.0f, 8.8884f, 21.6244f, 7.5475f, 20.9565f)
                curveTo(7.1912f, 20.7791f, 6.7839f, 20.72f, 6.3994f, 20.8229f)
                lineTo(4.1733f, 21.4185f)
                curveTo(3.207f, 21.677f, 2.3229f, 20.793f, 2.5815f, 19.8267f)
                lineTo(3.1771f, 17.6006f)
                curveTo(3.28f, 17.2161f, 3.2209f, 16.8088f, 3.0435f, 16.4525f)
                curveTo(2.3756f, 15.1116f, 2.0f, 13.5997f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(7.5f, 11.1084f)
                curveTo(7.5f, 12.4768f, 8.8188f, 13.9126f, 10.0286f, 14.9417f)
                curveTo(10.8524f, 15.6426f, 11.2644f, 15.9931f, 12.0f, 15.9931f)
                curveTo(12.7356f, 15.9931f, 13.1476f, 15.6426f, 13.9714f, 14.9417f)
                curveTo(15.1812f, 13.9126f, 16.5f, 12.4768f, 16.5f, 11.1084f)
                curveTo(16.5f, 8.4312f, 14.0249f, 7.4317f, 12.0f, 9.4998f)
                curveTo(9.9751f, 7.4317f, 7.5f, 8.4312f, 7.5f, 11.1084f)
                close()
            }
        }
            .build()
        return _chatRoundLike!!
    }

private var _chatRoundLike: ImageVector? = null
