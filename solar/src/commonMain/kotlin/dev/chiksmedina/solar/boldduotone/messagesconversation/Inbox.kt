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

val MessagesConversationGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(
            name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 6.8145f, 1.0f, 4.2218f, 2.6109f, 2.6109f)
                curveTo(4.2218f, 1.0f, 6.8145f, 1.0f, 12.0f, 1.0f)
                curveTo(17.1854f, 1.0f, 19.7782f, 1.0f, 21.3891f, 2.6109f)
                curveTo(23.0f, 4.2218f, 23.0f, 6.8145f, 23.0f, 12.0f)
                curveTo(23.0f, 17.1854f, 23.0f, 19.7782f, 21.3891f, 21.3891f)
                curveTo(19.7782f, 23.0f, 17.1854f, 23.0f, 12.0f, 23.0f)
                curveTo(6.8145f, 23.0f, 4.2218f, 23.0f, 2.6109f, 21.3891f)
                curveTo(1.0f, 19.7782f, 1.0f, 17.1854f, 1.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.6109f, 21.3887f)
                curveTo(4.2218f, 22.9996f, 6.8145f, 22.9996f, 12.0f, 22.9996f)
                curveTo(17.1854f, 22.9996f, 19.7782f, 22.9996f, 21.3891f, 21.3887f)
                curveTo(22.8818f, 19.896f, 22.9913f, 17.5602f, 22.9994f, 13.0996f)
                horizontalLineTo(19.5237f)
                curveTo(18.528f, 13.0996f, 18.0302f, 13.0996f, 17.5926f, 13.3009f)
                curveTo(17.155f, 13.5022f, 16.831f, 13.8801f, 16.183f, 14.6361f)
                lineTo(16.183f, 14.6361f)
                lineTo(15.517f, 15.4131f)
                lineTo(15.517f, 15.4131f)
                curveTo(14.869f, 16.1691f, 14.545f, 16.5471f, 14.1074f, 16.7483f)
                curveTo(13.6698f, 16.9496f, 13.172f, 16.9496f, 12.1763f, 16.9496f)
                horizontalLineTo(11.8237f)
                curveTo(10.828f, 16.9496f, 10.3302f, 16.9496f, 9.8926f, 16.7483f)
                curveTo(9.455f, 16.5471f, 9.131f, 16.1691f, 8.483f, 15.4131f)
                lineTo(7.817f, 14.6361f)
                curveTo(7.169f, 13.8801f, 6.845f, 13.5022f, 6.4074f, 13.3009f)
                curveTo(5.9698f, 13.0996f, 5.472f, 13.0996f, 4.4763f, 13.0996f)
                horizontalLineTo(1.0f)
                curveTo(1.008f, 17.5602f, 1.1182f, 19.896f, 2.6109f, 21.3887f)
                close()
            }
        }
            .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
