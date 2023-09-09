package com.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MessagesConversationGroup

public val MessagesConversationGroup.Dialog: ImageVector
    get() {
        if (_dialog != null) {
            return _dialog!!
        }
        _dialog = Builder(name = "Dialog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                curveTo(14.4183f, 22.0f, 18.0f, 18.4183f, 18.0f, 14.0f)
                curveTo(18.0f, 9.5817f, 14.4183f, 6.0f, 10.0f, 6.0f)
                curveTo(5.5817f, 6.0f, 2.0f, 9.5817f, 2.0f, 14.0f)
                curveTo(2.0f, 15.2355f, 2.2801f, 16.4056f, 2.7802f, 17.4502f)
                curveTo(2.9521f, 17.8093f, 3.0124f, 18.2161f, 2.9095f, 18.6006f)
                lineTo(2.5815f, 19.8267f)
                curveTo(2.3229f, 20.793f, 3.207f, 21.677f, 4.1733f, 21.4185f)
                lineTo(5.3994f, 21.0904f)
                curveTo(5.7839f, 20.9876f, 6.1907f, 21.0479f, 6.5498f, 21.2198f)
                curveTo(7.5944f, 21.7199f, 8.7645f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 14.5018f)
                curveTo(18.0665f, 14.4741f, 18.1324f, 14.4453f, 18.1977f, 14.4155f)
                curveTo(18.5598f, 14.2501f, 18.9661f, 14.1882f, 19.3506f, 14.2911f)
                lineTo(19.8267f, 14.4185f)
                curveTo(20.793f, 14.677f, 21.677f, 13.793f, 21.4185f, 12.8267f)
                lineTo(21.2911f, 12.3506f)
                curveTo(21.1882f, 11.9661f, 21.2501f, 11.5598f, 21.4155f, 11.1977f)
                curveTo(21.7908f, 10.376f, 22.0f, 9.4624f, 22.0f, 8.5f)
                curveTo(22.0f, 4.9102f, 19.0899f, 2.0f, 15.5f, 2.0f)
                curveTo(12.7977f, 2.0f, 10.4806f, 3.649f, 9.5f, 5.9956f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5183f, 14.0f)
                horizontalLineTo(6.5273f)
                moveTo(10.009f, 14.0f)
                horizontalLineTo(10.018f)
                moveTo(13.5f, 14.0f)
                horizontalLineTo(13.509f)
            }
        }
        .build()
        return _dialog!!
    }

private var _dialog: ImageVector? = null
