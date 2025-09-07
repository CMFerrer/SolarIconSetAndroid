package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.EraserSquare: ImageVector
    get() {
        if (_eraserSquare != null) {
            return _eraserSquare!!
        }
        _eraserSquare = Builder(
            name = "EraserSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9878f, 10.2886f)
                lineTo(13.7114f, 15.0122f)
                lineTo(16.33f, 12.3936f)
                curveTo(17.4433f, 11.2803f, 18.0f, 10.7236f, 18.0f, 10.0318f)
                curveTo(18.0f, 9.3401f, 17.4433f, 8.7834f, 16.33f, 7.67f)
                curveTo(15.2166f, 6.5567f, 14.6599f, 6.0f, 13.9682f, 6.0f)
                curveTo(13.2764f, 6.0f, 12.7197f, 6.5567f, 11.6064f, 7.67f)
                lineTo(8.9878f, 10.2886f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.3936f, 16.33f)
                lineTo(12.6507f, 16.0729f)
                lineTo(7.9271f, 11.3493f)
                lineTo(7.67f, 11.6064f)
                curveTo(6.5567f, 12.7197f, 6.0f, 13.2764f, 6.0f, 13.9682f)
                curveTo(6.0f, 14.6599f, 6.5567f, 15.2166f, 7.67f, 16.33f)
                curveTo(8.7834f, 17.4433f, 9.3401f, 18.0f, 10.0318f, 18.0f)
                curveTo(10.7236f, 18.0f, 11.2803f, 17.4433f, 12.3936f, 16.33f)
                close()
            }
        }
            .build()
        return _eraserSquare!!
    }

private var _eraserSquare: ImageVector? = null
