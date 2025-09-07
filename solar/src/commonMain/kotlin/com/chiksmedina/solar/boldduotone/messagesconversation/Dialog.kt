package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.Dialog: ImageVector
    get() {
        if (_dialog != null) {
            return _dialog!!
        }
        _dialog = Builder(
            name = "Dialog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 18.4183f, 14.4183f, 22.0f, 10.0f, 22.0f)
                curveTo(8.7645f, 22.0f, 7.5944f, 21.7199f, 6.5498f, 21.2198f)
                curveTo(6.1907f, 21.0479f, 5.7839f, 20.9876f, 5.3994f, 21.0904f)
                lineTo(4.1733f, 21.4185f)
                curveTo(3.207f, 21.677f, 2.3229f, 20.793f, 2.5815f, 19.8267f)
                lineTo(2.9095f, 18.6006f)
                curveTo(3.0124f, 18.2161f, 2.9521f, 17.8093f, 2.7802f, 17.4502f)
                curveTo(2.2801f, 16.4056f, 2.0f, 15.2355f, 2.0f, 14.0f)
                curveTo(2.0f, 9.5817f, 5.5817f, 6.0f, 10.0f, 6.0f)
                curveTo(14.4183f, 6.0f, 18.0f, 9.5817f, 18.0f, 14.0f)
                close()
                moveTo(6.5f, 15.0f)
                curveTo(7.0523f, 15.0f, 7.5f, 14.5523f, 7.5f, 14.0f)
                curveTo(7.5f, 13.4477f, 7.0523f, 13.0f, 6.5f, 13.0f)
                curveTo(5.9477f, 13.0f, 5.5f, 13.4477f, 5.5f, 14.0f)
                curveTo(5.5f, 14.5523f, 5.9477f, 15.0f, 6.5f, 15.0f)
                close()
                moveTo(10.0f, 15.0f)
                curveTo(10.5523f, 15.0f, 11.0f, 14.5523f, 11.0f, 14.0f)
                curveTo(11.0f, 13.4477f, 10.5523f, 13.0f, 10.0f, 13.0f)
                curveTo(9.4477f, 13.0f, 9.0f, 13.4477f, 9.0f, 14.0f)
                curveTo(9.0f, 14.5523f, 9.4477f, 15.0f, 10.0f, 15.0f)
                close()
                moveTo(13.5f, 15.0f)
                curveTo(14.0523f, 15.0f, 14.5f, 14.5523f, 14.5f, 14.0f)
                curveTo(14.5f, 13.4477f, 14.0523f, 13.0f, 13.5f, 13.0f)
                curveTo(12.9477f, 13.0f, 12.5f, 13.4477f, 12.5f, 14.0f)
                curveTo(12.5f, 14.5523f, 12.9477f, 15.0f, 13.5f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.984f, 14.5084f)
                curveTo(18.0919f, 14.4638f, 18.1983f, 14.4163f, 18.3032f, 14.3661f)
                curveTo(18.5949f, 14.2264f, 18.9255f, 14.1774f, 19.2379f, 14.261f)
                lineTo(20.2341f, 14.5275f)
                curveTo(21.0192f, 14.7376f, 21.7375f, 14.0193f, 21.5274f, 13.2342f)
                lineTo(21.2609f, 12.238f)
                curveTo(21.1773f, 11.9256f, 21.2263f, 11.595f, 21.366f, 11.3033f)
                curveTo(21.7723f, 10.4545f, 21.9999f, 9.5038f, 21.9999f, 8.5f)
                curveTo(21.9999f, 4.9102f, 19.0897f, 2.0f, 15.4999f, 2.0f)
                curveTo(12.7899f, 2.0f, 10.4672f, 3.6585f, 9.4915f, 6.0159f)
                curveTo(9.6596f, 6.0054f, 9.8291f, 6.0f, 9.9999f, 6.0f)
                curveTo(14.4182f, 6.0f, 17.9999f, 9.5817f, 17.9999f, 14.0f)
                curveTo(17.9999f, 14.1708f, 17.9945f, 14.3403f, 17.984f, 14.5084f)
                close()
            }
        }
            .build()
        return _dialog!!
    }

private var _dialog: ImageVector? = null
