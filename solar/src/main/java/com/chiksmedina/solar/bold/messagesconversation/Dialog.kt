package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.MessagesConversationGroup

public val MessagesConversationGroup.Dialog: ImageVector
    get() {
        if (_dialog != null) {
            return _dialog!!
        }
        _dialog = Builder(name = "Dialog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 4.9102f, 19.0899f, 2.0f, 15.5f, 2.0f)
                curveTo(13.4171f, 2.0f, 11.5631f, 2.9823f, 10.3735f, 4.5072f)
                curveTo(15.4471f, 4.7034f, 19.5f, 8.8784f, 19.5f, 14.0f)
                curveTo(19.5f, 14.1103f, 19.4981f, 14.2202f, 19.4944f, 14.3296f)
                lineTo(19.8267f, 14.4185f)
                curveTo(20.793f, 14.677f, 21.677f, 13.793f, 21.4185f, 12.8267f)
                lineTo(21.2911f, 12.3506f)
                curveTo(21.1882f, 11.9661f, 21.2501f, 11.5598f, 21.4155f, 11.1977f)
                curveTo(21.7908f, 10.376f, 22.0f, 9.4624f, 22.0f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
        }
        .build()
        return _dialog!!
    }

private var _dialog: ImageVector? = null
