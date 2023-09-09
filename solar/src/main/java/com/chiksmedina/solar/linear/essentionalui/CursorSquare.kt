package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.CursorSquare: ImageVector
    get() {
        if (_cursorSquare != null) {
            return _cursorSquare!!
        }
        _cursorSquare = Builder(name = "CursorSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.859f, 16.4999f)
                lineTo(12.3975f, 14.0385f)
                lineTo(11.6459f, 14.7902f)
                curveTo(10.8764f, 15.5597f, 10.4916f, 15.9444f, 10.0781f, 15.8536f)
                curveTo(9.6645f, 15.7628f, 9.4764f, 15.2522f, 9.1002f, 14.231f)
                lineTo(7.8454f, 10.8253f)
                curveTo(7.0949f, 8.7882f, 6.7197f, 7.7696f, 7.2446f, 7.2446f)
                curveTo(7.7696f, 6.7197f, 8.7882f, 7.0949f, 10.8253f, 7.8454f)
                lineTo(14.231f, 9.1002f)
                curveTo(15.2522f, 9.4764f, 15.7628f, 9.6645f, 15.8536f, 10.0781f)
                curveTo(15.9444f, 10.4916f, 15.5597f, 10.8764f, 14.7902f, 11.6459f)
                lineTo(14.0385f, 12.3975f)
                lineTo(16.4999f, 14.859f)
                curveTo(16.7548f, 15.1138f, 16.8822f, 15.2413f, 16.9411f, 15.3834f)
                curveTo(17.0196f, 15.573f, 17.0196f, 15.7859f, 16.9411f, 15.9755f)
                curveTo(16.8822f, 16.1176f, 16.7548f, 16.2451f, 16.4999f, 16.4999f)
                curveTo(16.2451f, 16.7548f, 16.1176f, 16.8822f, 15.9755f, 16.9411f)
                curveTo(15.7859f, 17.0196f, 15.573f, 17.0196f, 15.3834f, 16.9411f)
                curveTo(15.2413f, 16.8822f, 15.1138f, 16.7548f, 14.859f, 16.4999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
        }
        .build()
        return _cursorSquare!!
    }

private var _cursorSquare: ImageVector? = null
