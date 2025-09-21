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

val MessagesConversationGroup.InboxIn: ImageVector
    get() {
        if (_inboxIn != null) {
            return _inboxIn!!
        }
        _inboxIn = Builder(
            name = "InboxIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.929f, 22.0f, 7.2861f, 22.0f, 12.0003f, 22.0f)
                curveTo(16.7145f, 22.0f, 19.0716f, 22.0f, 20.5361f, 20.5355f)
                curveTo(21.8931f, 19.1785f, 21.9927f, 17.0551f, 22.0f, 13.0f)
                horizontalLineTo(18.8402f)
                curveTo(17.935f, 13.0f, 17.4824f, 13.0f, 17.0846f, 13.183f)
                curveTo(16.6868f, 13.3659f, 16.3922f, 13.7096f, 15.8031f, 14.3968f)
                lineTo(15.1977f, 15.1032f)
                curveTo(14.6086f, 15.7904f, 14.314f, 16.1341f, 13.9162f, 16.317f)
                curveTo(13.5183f, 16.5f, 13.0658f, 16.5f, 12.1606f, 16.5f)
                horizontalLineTo(11.84f)
                curveTo(10.9348f, 16.5f, 10.4822f, 16.5f, 10.0844f, 16.317f)
                curveTo(9.6866f, 16.1341f, 9.392f, 15.7904f, 8.8029f, 15.1032f)
                lineTo(8.1975f, 14.3968f)
                curveTo(7.6084f, 13.7096f, 7.3138f, 13.3659f, 6.916f, 13.183f)
                curveTo(6.5181f, 13.0f, 6.0655f, 13.0f, 5.1603f, 13.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0073f, 17.0551f, 2.1074f, 19.1785f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5305f, 11.3301f)
                curveTo(12.3899f, 11.4708f, 12.1991f, 11.5498f, 12.0002f, 11.5498f)
                curveTo(11.8013f, 11.5498f, 11.6105f, 11.4708f, 11.4699f, 11.3301f)
                lineTo(8.1699f, 8.0301f)
                curveTo(7.877f, 7.7372f, 7.877f, 7.2624f, 8.1699f, 6.9695f)
                curveTo(8.4628f, 6.6766f, 8.9376f, 6.6766f, 9.2305f, 6.9695f)
                lineTo(11.2502f, 8.9891f)
                lineTo(11.2502f, 2.0002f)
                curveTo(11.4933f, 2.0f, 11.7431f, 2.0f, 12.0f, 2.0f)
                curveTo(12.257f, 2.0f, 12.507f, 2.0f, 12.7502f, 2.0002f)
                verticalLineTo(8.9891f)
                lineTo(14.7699f, 6.9695f)
                curveTo(15.0628f, 6.6766f, 15.5376f, 6.6766f, 15.8305f, 6.9695f)
                curveTo(16.1234f, 7.2624f, 16.1234f, 7.7372f, 15.8305f, 8.0301f)
                lineTo(12.5305f, 11.3301f)
                close()
            }
        }
            .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null
