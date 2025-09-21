package dev.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(
            name = "Mailbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.3715f, 3.0291f)
                curveTo(17.9435f, 2.8641f, 17.4778f, 2.8227f, 17.0274f, 2.9095f)
                lineTo(16.75f, 2.9629f)
                verticalLineTo(4.6181f)
                curveTo(17.4742f, 4.4798f, 18.2228f, 4.547f, 18.9109f, 4.8122f)
                curveTo(19.338f, 4.9768f, 19.8019f, 5.0181f, 20.25f, 4.9327f)
                verticalLineTo(3.2744f)
                curveTo(19.6437f, 3.3538f, 19.025f, 3.2809f, 18.4506f, 3.0596f)
                lineTo(18.3715f, 3.0291f)
                close()
                moveTo(16.75f, 6.1457f)
                lineTo(17.0274f, 6.0923f)
                curveTo(17.4778f, 6.0055f, 17.9435f, 6.0469f, 18.3715f, 6.2119f)
                curveTo(19.1193f, 6.5001f, 19.9371f, 6.5539f, 20.7163f, 6.3662f)
                lineTo(20.7829f, 6.3502f)
                curveTo(21.3502f, 6.2135f, 21.75f, 5.706f, 21.75f, 5.1225f)
                verticalLineTo(2.901f)
                curveTo(21.75f, 2.1316f, 21.0305f, 1.5649f, 20.2825f, 1.745f)
                curveTo(19.8531f, 1.8484f, 19.4023f, 1.8188f, 18.99f, 1.6599f)
                lineTo(18.9109f, 1.6294f)
                curveTo(18.2207f, 1.3635f, 17.4698f, 1.2966f, 16.7436f, 1.4366f)
                lineTo(16.2575f, 1.5302f)
                curveTo(15.6726f, 1.6429f, 15.25f, 2.1548f, 15.25f, 2.7504f)
                verticalLineTo(6.2496f)
                horizontalLineTo(7.0f)
                curveTo(6.9534f, 6.2496f, 6.9078f, 6.2538f, 6.8635f, 6.262f)
                curveTo(6.7434f, 6.2537f, 6.6222f, 6.2496f, 6.5f, 6.2496f)
                curveTo(3.6005f, 6.2496f, 1.25f, 8.6001f, 1.25f, 11.4996f)
                verticalLineTo(16.767f)
                curveTo(1.25f, 18.4142f, 2.5853f, 19.7496f, 4.2326f, 19.7496f)
                horizontalLineTo(9.75f)
                verticalLineTo(21.9996f)
                curveTo(9.75f, 22.4138f, 10.0858f, 22.7496f, 10.5f, 22.7496f)
                curveTo(10.9142f, 22.7496f, 11.25f, 22.4138f, 11.25f, 21.9996f)
                verticalLineTo(19.7496f)
                horizontalLineTo(13.75f)
                verticalLineTo(21.9996f)
                curveTo(13.75f, 22.4138f, 14.0858f, 22.7496f, 14.5f, 22.7496f)
                curveTo(14.9142f, 22.7496f, 15.25f, 22.4138f, 15.25f, 21.9996f)
                verticalLineTo(19.7496f)
                horizontalLineTo(19.7931f)
                curveTo(21.4261f, 19.7496f, 22.75f, 18.4257f, 22.75f, 16.7927f)
                verticalLineTo(11.4996f)
                curveTo(22.75f, 8.6001f, 20.3995f, 6.2496f, 17.5f, 6.2496f)
                horizontalLineTo(16.75f)
                verticalLineTo(6.1457f)
                close()
                moveTo(15.25f, 7.7496f)
                verticalLineTo(10.9996f)
                curveTo(15.25f, 11.4138f, 15.5858f, 11.7496f, 16.0f, 11.7496f)
                curveTo(16.4142f, 11.7496f, 16.75f, 11.4138f, 16.75f, 10.9996f)
                verticalLineTo(7.7496f)
                horizontalLineTo(17.5f)
                curveTo(19.5711f, 7.7496f, 21.25f, 9.4285f, 21.25f, 11.4996f)
                verticalLineTo(16.7927f)
                curveTo(21.25f, 17.5973f, 20.5977f, 18.2496f, 19.7931f, 18.2496f)
                horizontalLineTo(11.75f)
                verticalLineTo(11.4996f)
                curveTo(11.75f, 10.0305f, 11.1466f, 8.7024f, 10.1742f, 7.7496f)
                horizontalLineTo(15.25f)
                close()
                moveTo(10.25f, 18.2496f)
                verticalLineTo(11.4996f)
                curveTo(10.25f, 9.4285f, 8.5711f, 7.7496f, 6.5f, 7.7496f)
                curveTo(4.4289f, 7.7496f, 2.75f, 9.4285f, 2.75f, 11.4996f)
                verticalLineTo(16.767f)
                curveTo(2.75f, 17.5858f, 3.4138f, 18.2496f, 4.2326f, 18.2496f)
                horizontalLineTo(10.25f)
                close()
                moveTo(4.25f, 15.9996f)
                curveTo(4.25f, 15.5853f, 4.5858f, 15.2496f, 5.0f, 15.2496f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 15.2496f, 8.75f, 15.5853f, 8.75f, 15.9996f)
                curveTo(8.75f, 16.4138f, 8.4142f, 16.7496f, 8.0f, 16.7496f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 16.7496f, 4.25f, 16.4138f, 4.25f, 15.9996f)
                close()
            }
        }
            .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
