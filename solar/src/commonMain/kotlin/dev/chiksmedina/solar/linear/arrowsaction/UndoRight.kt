package dev.chiksmedina.solar.linear.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.UndoRight: ImageVector
    get() {
        if (_undoRight != null) {
            return _undoRight!!
        }
        _undoRight = Builder(
            name = "UndoRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1308f, 7.0f, 6.1961f, 7.0f, 5.5f, 7.4019f)
                curveTo(5.044f, 7.6652f, 4.6652f, 8.0439f, 4.4019f, 8.5f)
                curveTo(4.0f, 9.1961f, 4.0f, 10.1308f, 4.0f, 12.0f)
                curveTo(4.0f, 13.8692f, 4.0f, 14.8038f, 4.4019f, 15.5f)
                curveTo(4.6652f, 15.9561f, 5.0439f, 16.3348f, 5.5f, 16.5981f)
                curveTo(6.1961f, 17.0f, 7.1308f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(16.0f)
                moveTo(20.0f, 7.0f)
                lineTo(17.0f, 4.0f)
                moveTo(20.0f, 7.0f)
                lineTo(17.0f, 10.0f)
            }
        }
            .build()
        return _undoRight!!
    }

private var _undoRight: ImageVector? = null
