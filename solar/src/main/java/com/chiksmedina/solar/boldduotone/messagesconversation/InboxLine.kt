package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.InboxLine: ImageVector
    get() {
        if (_inboxLine != null) {
            return _inboxLine!!
        }
        _inboxLine = Builder(name = "InboxLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.929f, 22.0f, 7.2861f, 22.0f, 12.0003f, 22.0f)
                curveTo(16.7145f, 22.0f, 19.0716f, 22.0f, 20.5361f, 20.5355f)
                curveTo(21.8931f, 19.1785f, 21.9927f, 17.0551f, 22.0f, 13.0f)
                horizontalLineTo(18.8402f)
                curveTo(17.935f, 13.0f, 17.4824f, 13.0f, 17.0846f, 13.183f)
                curveTo(16.6868f, 13.3659f, 16.3922f, 13.7096f, 15.8031f, 14.3968f)
                lineTo(15.1977f, 15.1032f)
                lineTo(15.1977f, 15.1032f)
                curveTo(14.6086f, 15.7904f, 14.314f, 16.1341f, 13.9162f, 16.317f)
                curveTo(13.5184f, 16.5f, 13.0658f, 16.5f, 12.1606f, 16.5f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.25f)
                curveTo(7.5858f, 6.25f, 7.25f, 6.5858f, 7.25f, 7.0f)
                curveTo(7.25f, 7.4142f, 7.5858f, 7.75f, 8.0f, 7.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 7.75f, 16.75f, 7.4142f, 16.75f, 7.0f)
                curveTo(16.75f, 6.5858f, 16.4142f, 6.25f, 16.0f, 6.25f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.75f)
                curveTo(9.5858f, 9.75f, 9.25f, 10.0858f, 9.25f, 10.5f)
                curveTo(9.25f, 10.9142f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.25f, 14.75f, 10.9142f, 14.75f, 10.5f)
                curveTo(14.75f, 10.0858f, 14.4142f, 9.75f, 14.0f, 9.75f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _inboxLine!!
    }

private var _inboxLine: ImageVector? = null
