package dev.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TextFormattingGroup

val TextFormattingGroup.EraserCircle: ImageVector
    get() {
        if (_eraserCircle != null) {
            return _eraserCircle!!
        }
        _eraserCircle = Builder(
            name = "EraserCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.6064f, 7.67f)
                curveTo(12.7197f, 6.5567f, 13.2764f, 6.0f, 13.9682f, 6.0f)
                curveTo(14.6599f, 6.0f, 15.2166f, 6.5567f, 16.33f, 7.67f)
                curveTo(17.4433f, 8.7834f, 18.0f, 9.3401f, 18.0f, 10.0318f)
                curveTo(18.0f, 10.7236f, 17.4433f, 11.2803f, 16.33f, 12.3936f)
                lineTo(13.7114f, 15.0122f)
                lineTo(8.9878f, 10.2886f)
                lineTo(11.6064f, 7.67f)
                close()
                moveTo(7.9271f, 11.3493f)
                lineTo(12.6507f, 16.0729f)
                lineTo(12.3936f, 16.33f)
                curveTo(11.2803f, 17.4433f, 10.7236f, 18.0f, 10.0318f, 18.0f)
                curveTo(9.3401f, 18.0f, 8.7834f, 17.4433f, 7.67f, 16.33f)
                curveTo(6.5567f, 15.2166f, 6.0f, 14.6599f, 6.0f, 13.9682f)
                curveTo(6.0f, 13.2764f, 6.5567f, 12.7197f, 7.67f, 11.6064f)
                lineTo(7.9271f, 11.3493f)
                close()
            }
        }
            .build()
        return _eraserCircle!!
    }

private var _eraserCircle: ImageVector? = null
