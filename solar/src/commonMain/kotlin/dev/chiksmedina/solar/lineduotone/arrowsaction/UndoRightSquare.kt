package dev.chiksmedina.solar.lineduotone.arrowsaction

import androidx.compose.ui.graphics.Color
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
import dev.chiksmedina.solar.lineduotone.ArrowsActionGroup

val ArrowsActionGroup.UndoRightSquare: ImageVector
    get() {
        if (_undoRightSquare != null) {
            return _undoRightSquare!!
        }
        _undoRightSquare = Builder(
            name = "UndoRightSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 9.5007f)
                horizontalLineTo(9.9615f)
                curveTo(8.5937f, 9.5007f, 7.9098f, 9.5007f, 7.4141f, 9.8212f)
                curveTo(7.1765f, 9.9749f, 6.9741f, 10.1772f, 6.8205f, 10.4148f)
                curveTo(6.5f, 10.9105f, 6.5f, 11.5944f, 6.5f, 12.9623f)
                curveTo(6.5f, 14.3301f, 6.5f, 15.0141f, 6.8205f, 15.5097f)
                curveTo(6.9741f, 15.7474f, 7.1764f, 15.9497f, 7.4141f, 16.1034f)
                curveTo(7.9098f, 16.4238f, 8.5937f, 16.4238f, 9.9615f, 16.4238f)
                horizontalLineTo(14.5f)
                moveTo(17.5f, 9.5007f)
                lineTo(15.25f, 7.4238f)
                moveTo(17.5f, 9.5007f)
                lineTo(15.25f, 11.5777f)
            }
        }
            .build()
        return _undoRightSquare!!
    }

private var _undoRightSquare: ImageVector? = null
