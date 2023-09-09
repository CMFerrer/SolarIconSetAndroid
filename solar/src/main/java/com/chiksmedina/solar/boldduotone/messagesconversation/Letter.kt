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

public val MessagesConversationGroup.Letter: ImageVector
    get() {
        if (_letter != null) {
            return _letter!!
        }
        _letter = Builder(name = "Letter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.2f, 3.0f)
                horizontalLineTo(9.8f)
                curveTo(5.6516f, 3.0f, 3.5775f, 3.0f, 2.2887f, 4.318f)
                curveTo(1.0f, 5.636f, 1.0f, 7.7574f, 1.0f, 12.0f)
                curveTo(1.0f, 16.2426f, 1.0f, 18.364f, 2.2887f, 19.682f)
                curveTo(3.5775f, 21.0f, 5.6516f, 21.0f, 9.8f, 21.0f)
                horizontalLineTo(14.2f)
                curveTo(18.3484f, 21.0f, 20.4225f, 21.0f, 21.7113f, 19.682f)
                curveTo(23.0f, 18.364f, 23.0f, 16.2426f, 23.0f, 12.0f)
                curveTo(23.0f, 7.7574f, 23.0f, 5.636f, 21.7113f, 4.318f)
                curveTo(20.4225f, 3.0f, 18.3484f, 3.0f, 14.2f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1284f, 8.034f)
                curveTo(19.4784f, 7.7423f, 19.5257f, 7.2221f, 19.234f, 6.8721f)
                curveTo(18.9423f, 6.522f, 18.4221f, 6.4747f, 18.0721f, 6.7664f)
                lineTo(15.6973f, 8.7454f)
                curveTo(14.671f, 9.6006f, 13.9585f, 10.1925f, 13.357f, 10.5794f)
                curveTo(12.7747f, 10.9539f, 12.3798f, 11.0796f, 12.0002f, 11.0796f)
                curveTo(11.6206f, 11.0796f, 11.2258f, 10.9539f, 10.6435f, 10.5794f)
                curveTo(10.0419f, 10.1925f, 9.3294f, 9.6006f, 8.3032f, 8.7454f)
                lineTo(5.9284f, 6.7664f)
                curveTo(5.5783f, 6.4747f, 5.0581f, 6.522f, 4.7664f, 6.8721f)
                curveTo(4.4747f, 7.2221f, 4.522f, 7.7423f, 4.8721f, 8.034f)
                lineTo(7.2882f, 10.0475f)
                curveTo(8.2632f, 10.86f, 9.0534f, 11.5185f, 9.7509f, 11.9671f)
                curveTo(10.4775f, 12.4344f, 11.185f, 12.7296f, 12.0002f, 12.7296f)
                curveTo(12.8154f, 12.7296f, 13.523f, 12.4344f, 14.2495f, 11.9671f)
                curveTo(14.947f, 11.5185f, 15.7372f, 10.86f, 16.7122f, 10.0474f)
                lineTo(19.1284f, 8.034f)
                close()
            }
        }
        .build()
        return _letter!!
    }

private var _letter: ImageVector? = null
