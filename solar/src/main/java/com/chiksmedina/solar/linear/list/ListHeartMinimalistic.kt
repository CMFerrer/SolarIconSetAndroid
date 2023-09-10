package com.chiksmedina.solar.linear.list

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
import com.chiksmedina.solar.linear.ListGroup

val ListGroup.ListHeartMinimalistic: ImageVector
    get() {
        if (_listHeartMinimalistic != null) {
            return _listHeartMinimalistic!!
        }
        _listHeartMinimalistic = Builder(
            name = "ListHeartMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 6.0f)
                lineTo(3.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 16.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 11.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.4901f, 16.3082f)
                lineTo(16.935f, 15.7045f)
                lineTo(16.935f, 15.7045f)
                lineTo(16.4901f, 16.3082f)
                close()
                moveTo(17.5f, 10.1062f)
                lineTo(16.9641f, 10.6309f)
                curveTo(17.1052f, 10.775f, 17.2983f, 10.8562f, 17.5f, 10.8562f)
                curveTo(17.7017f, 10.8562f, 17.8948f, 10.775f, 18.0359f, 10.6309f)
                lineTo(17.5f, 10.1062f)
                close()
                moveTo(18.5099f, 16.3083f)
                lineTo(18.9549f, 16.912f)
                lineTo(18.9549f, 16.912f)
                lineTo(18.5099f, 16.3083f)
                close()
                moveTo(17.5f, 16.8103f)
                lineTo(17.5f, 16.0603f)
                lineTo(17.5f, 16.0603f)
                lineTo(17.5f, 16.8103f)
                close()
                moveTo(16.935f, 15.7045f)
                curveTo(16.2914f, 15.2302f, 15.4675f, 14.5568f, 14.8118f, 13.808f)
                curveTo(14.1328f, 13.0325f, 13.75f, 12.3064f, 13.75f, 11.7148f)
                horizontalLineTo(12.25f)
                curveTo(12.25f, 12.8758f, 12.9489f, 13.9574f, 13.6832f, 14.7961f)
                curveTo(14.4409f, 15.6614f, 15.3619f, 16.4085f, 16.0451f, 16.912f)
                lineTo(16.935f, 15.7045f)
                close()
                moveTo(13.75f, 11.7148f)
                curveTo(13.75f, 10.607f, 14.2445f, 10.0237f, 14.7533f, 9.8335f)
                curveTo(15.2705f, 9.6401f, 16.0951f, 9.7433f, 16.9641f, 10.6309f)
                lineTo(18.0359f, 9.5815f)
                curveTo(16.88f, 8.4009f, 15.4546f, 7.9698f, 14.228f, 8.4285f)
                curveTo(12.993f, 8.8903f, 12.25f, 10.1453f, 12.25f, 11.7148f)
                horizontalLineTo(13.75f)
                close()
                moveTo(18.9549f, 16.912f)
                curveTo(19.6381f, 16.4085f, 20.5591f, 15.6614f, 21.3168f, 14.7961f)
                curveTo(22.0511f, 13.9574f, 22.75f, 12.8758f, 22.75f, 11.7148f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 12.3064f, 20.8672f, 13.0326f, 20.1882f, 13.808f)
                curveTo(19.5325f, 14.5568f, 18.7086f, 15.2302f, 18.065f, 15.7045f)
                lineTo(18.9549f, 16.912f)
                close()
                moveTo(22.75f, 11.7148f)
                curveTo(22.75f, 10.1453f, 22.007f, 8.8903f, 20.772f, 8.4285f)
                curveTo(19.5454f, 7.9699f, 18.12f, 8.4009f, 16.9641f, 9.5815f)
                lineTo(18.0359f, 10.6309f)
                curveTo(18.9049f, 9.7433f, 19.7295f, 9.6401f, 20.2467f, 9.8335f)
                curveTo(20.7555f, 10.0237f, 21.25f, 10.607f, 21.25f, 11.7148f)
                horizontalLineTo(22.75f)
                close()
                moveTo(16.0451f, 16.912f)
                curveTo(16.4368f, 17.2007f, 16.8752f, 17.5603f, 17.5f, 17.5603f)
                lineTo(17.5f, 16.0603f)
                curveTo(17.4852f, 16.0603f, 17.4682f, 16.0626f, 17.399f, 16.0252f)
                curveTo(17.3008f, 15.972f, 17.178f, 15.8836f, 16.935f, 15.7045f)
                lineTo(16.0451f, 16.912f)
                close()
                moveTo(18.065f, 15.7045f)
                curveTo(17.822f, 15.8836f, 17.6992f, 15.972f, 17.601f, 16.0252f)
                curveTo(17.5318f, 16.0626f, 17.5148f, 16.0603f, 17.5f, 16.0603f)
                lineTo(17.5f, 17.5603f)
                curveTo(18.1248f, 17.5603f, 18.5632f, 17.2007f, 18.9549f, 16.912f)
                lineTo(18.065f, 15.7045f)
                close()
            }
        }
            .build()
        return _listHeartMinimalistic!!
    }

private var _listHeartMinimalistic: ImageVector? = null
