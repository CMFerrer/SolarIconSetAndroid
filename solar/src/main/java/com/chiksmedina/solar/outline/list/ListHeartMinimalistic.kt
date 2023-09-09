package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

public val ListGroup.ListHeartMinimalistic: ImageVector
    get() {
        if (_listHeartMinimalistic != null) {
            return _listHeartMinimalistic!!
        }
        _listHeartMinimalistic = Builder(name = "ListHeartMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 5.25f, 20.75f, 5.5858f, 20.75f, 6.0f)
                curveTo(20.75f, 6.4142f, 20.4142f, 6.75f, 20.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(20.772f, 8.4285f)
                curveTo(22.007f, 8.8903f, 22.75f, 10.1453f, 22.75f, 11.7147f)
                curveTo(22.75f, 12.8757f, 22.0511f, 13.9574f, 21.3168f, 14.7961f)
                curveTo(20.5591f, 15.6614f, 19.6381f, 16.4085f, 18.9549f, 16.912f)
                curveTo(18.9283f, 16.9316f, 18.9015f, 16.9515f, 18.8745f, 16.9716f)
                curveTo(18.5029f, 17.2478f, 18.0824f, 17.5603f, 17.5f, 17.5603f)
                curveTo(16.9176f, 17.5603f, 16.4971f, 17.2478f, 16.1255f, 16.9716f)
                curveTo(16.0985f, 16.9515f, 16.0717f, 16.9316f, 16.0451f, 16.912f)
                curveTo(15.3619f, 16.4085f, 14.4409f, 15.6614f, 13.6832f, 14.7961f)
                curveTo(12.9489f, 13.9574f, 12.25f, 12.8757f, 12.25f, 11.7148f)
                curveTo(12.25f, 10.1453f, 12.993f, 8.8903f, 14.228f, 8.4285f)
                curveTo(15.2709f, 8.0385f, 16.4575f, 8.2917f, 17.5f, 9.1019f)
                curveTo(18.5425f, 8.2917f, 19.7291f, 8.0385f, 20.772f, 8.4285f)
                close()
                moveTo(20.2467f, 9.8335f)
                curveTo(19.7295f, 9.6401f, 18.9049f, 9.7433f, 18.0359f, 10.6309f)
                curveTo(17.8948f, 10.7749f, 17.7017f, 10.8561f, 17.5f, 10.8561f)
                curveTo(17.2983f, 10.8561f, 17.1052f, 10.7749f, 16.9641f, 10.6309f)
                curveTo(16.0951f, 9.7433f, 15.2705f, 9.6401f, 14.7533f, 9.8335f)
                curveTo(14.2445f, 10.0237f, 13.75f, 10.607f, 13.75f, 11.7148f)
                curveTo(13.75f, 12.3064f, 14.1328f, 13.0325f, 14.8118f, 13.808f)
                curveTo(15.4675f, 14.5568f, 16.2914f, 15.2302f, 16.935f, 15.7045f)
                curveTo(17.178f, 15.8836f, 17.3008f, 15.972f, 17.399f, 16.0252f)
                curveTo(17.4645f, 16.0606f, 17.4832f, 16.0605f, 17.4976f, 16.0603f)
                curveTo(17.4984f, 16.0603f, 17.4992f, 16.0603f, 17.5f, 16.0603f)
                curveTo(17.5008f, 16.0603f, 17.5016f, 16.0603f, 17.5024f, 16.0603f)
                curveTo(17.5168f, 16.0605f, 17.5355f, 16.0606f, 17.601f, 16.0252f)
                curveTo(17.6992f, 15.972f, 17.822f, 15.8836f, 18.065f, 15.7045f)
                curveTo(18.7086f, 15.2302f, 19.5325f, 14.5568f, 20.1882f, 13.808f)
                curveTo(20.8672f, 13.0326f, 21.25f, 12.3064f, 21.25f, 11.7147f)
                curveTo(21.25f, 10.607f, 20.7555f, 10.0237f, 20.2467f, 9.8335f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 10.25f, 9.75f, 10.5858f, 9.75f, 11.0f)
                curveTo(9.75f, 11.4142f, 9.4142f, 11.75f, 9.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
        }
        .build()
        return _listHeartMinimalistic!!
    }

private var _listHeartMinimalistic: ImageVector? = null
