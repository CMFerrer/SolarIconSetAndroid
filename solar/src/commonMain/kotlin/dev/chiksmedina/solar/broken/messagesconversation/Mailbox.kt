package dev.chiksmedina.solar.broken.messagesconversation

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
import dev.chiksmedina.solar.broken.MessagesConversationGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 22.0f)
                verticalLineTo(20.0f)
                moveTo(14.5f, 22.0f)
                verticalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 20.0f)
                verticalLineTo(20.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 12.4142f, 1.5858f, 12.75f, 2.0f, 12.75f)
                curveTo(2.4142f, 12.75f, 2.75f, 12.4142f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(2.75f, 16.0f)
                curveTo(2.75f, 15.5858f, 2.4142f, 15.25f, 2.0f, 15.25f)
                curveTo(1.5858f, 15.25f, 1.25f, 15.5858f, 1.25f, 16.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(14.0f, 19.25f)
                curveTo(13.5858f, 19.25f, 13.25f, 19.5858f, 13.25f, 20.0f)
                curveTo(13.25f, 20.4142f, 13.5858f, 20.75f, 14.0f, 20.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(21.25f, 11.25f)
                curveTo(21.25f, 11.6642f, 21.5858f, 12.0f, 22.0f, 12.0f)
                curveTo(22.4142f, 12.0f, 22.75f, 11.6642f, 22.75f, 11.25f)
                horizontalLineTo(21.25f)
                close()
                moveTo(17.5f, 5.25f)
                curveTo(17.0858f, 5.25f, 16.75f, 5.5858f, 16.75f, 6.0f)
                curveTo(16.75f, 6.4142f, 17.0858f, 6.75f, 17.5f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(22.75f, 15.0f)
                curveTo(22.75f, 14.5858f, 22.4142f, 14.25f, 22.0f, 14.25f)
                curveTo(21.5858f, 14.25f, 21.25f, 14.5858f, 21.25f, 15.0f)
                horizontalLineTo(22.75f)
                close()
                moveTo(7.0f, 5.25f)
                curveTo(6.5858f, 5.25f, 6.25f, 5.5858f, 6.25f, 6.0f)
                curveTo(6.25f, 6.4142f, 6.5858f, 6.75f, 7.0f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.0f, 19.25f)
                curveTo(8.5858f, 19.25f, 8.25f, 19.5858f, 8.25f, 20.0f)
                curveTo(8.25f, 20.4142f, 8.5858f, 20.75f, 9.0f, 20.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(15.0f, 20.75f)
                curveTo(15.4142f, 20.75f, 15.75f, 20.4142f, 15.75f, 20.0f)
                curveTo(15.75f, 19.5858f, 15.4142f, 19.25f, 15.0f, 19.25f)
                verticalLineTo(20.75f)
                close()
                moveTo(11.0f, 19.25f)
                horizontalLineTo(4.2326f)
                verticalLineTo(20.75f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.25f)
                close()
                moveTo(4.2326f, 19.25f)
                curveTo(3.5181f, 19.25f, 2.75f, 18.5323f, 2.75f, 17.3953f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 19.1354f, 2.481f, 20.75f, 4.2326f, 20.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(6.5f, 6.75f)
                curveTo(8.4668f, 6.75f, 10.25f, 8.6521f, 10.25f, 11.25f)
                horizontalLineTo(11.75f)
                curveTo(11.75f, 8.0489f, 9.5038f, 5.25f, 6.5f, 5.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(6.5f, 5.25f)
                curveTo(3.4962f, 5.25f, 1.25f, 8.0489f, 1.25f, 11.25f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 8.6521f, 4.5332f, 6.75f, 6.5f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(10.25f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(10.25f, 11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(10.25f)
                close()
                moveTo(2.75f, 12.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(1.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 17.3953f)
                verticalLineTo(16.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(17.3953f)
                horizontalLineTo(2.75f)
                close()
                moveTo(19.7931f, 19.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.75f)
                horizontalLineTo(19.7931f)
                verticalLineTo(19.25f)
                close()
                moveTo(21.25f, 17.4253f)
                curveTo(21.25f, 18.5457f, 20.4934f, 19.25f, 19.7931f, 19.25f)
                verticalLineTo(20.75f)
                curveTo(21.5305f, 20.75f, 22.75f, 19.1488f, 22.75f, 17.4253f)
                horizontalLineTo(21.25f)
                close()
                moveTo(22.75f, 11.25f)
                curveTo(22.75f, 8.0489f, 20.5038f, 5.25f, 17.5f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(19.4668f, 6.75f, 21.25f, 8.6521f, 21.25f, 11.25f)
                horizontalLineTo(22.75f)
                close()
                moveTo(21.25f, 15.0f)
                verticalLineTo(17.4253f)
                horizontalLineTo(22.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(7.0f, 6.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.0f, 20.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 16.0f)
                horizontalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 9.8843f)
                verticalLineTo(5.4112f)
                moveTo(16.0f, 5.4112f)
                verticalLineTo(2.6352f)
                curveTo(16.0f, 2.399f, 16.1676f, 2.1961f, 16.3994f, 2.1514f)
                lineTo(16.8855f, 2.0578f)
                curveTo(17.4738f, 1.9444f, 18.0821f, 1.9986f, 18.6412f, 2.214f)
                lineTo(18.7203f, 2.2445f)
                curveTo(19.2746f, 2.4581f, 19.8807f, 2.498f, 20.4582f, 2.3589f)
                curveTo(20.7343f, 2.2924f, 21.0f, 2.5017f, 21.0f, 2.7857f)
                verticalLineTo(5.0072f)
                curveTo(21.0f, 5.2442f, 20.8376f, 5.4503f, 20.6073f, 5.5058f)
                lineTo(20.5407f, 5.5218f)
                curveTo(19.9095f, 5.6739f, 19.247f, 5.6303f, 18.6412f, 5.3968f)
                curveTo(18.0821f, 5.1814f, 17.4738f, 5.1272f, 16.8855f, 5.2406f)
                lineTo(16.0f, 5.4112f)
                close()
            }
        }
            .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
