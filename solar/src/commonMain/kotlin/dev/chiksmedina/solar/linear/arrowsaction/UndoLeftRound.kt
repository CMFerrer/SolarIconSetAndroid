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

val ArrowsActionGroup.UndoLeftRound: ImageVector
    get() {
        if (_undoLeftRound != null) {
            return _undoLeftRound!!
        }
        _undoLeftRound = Builder(
            name = "UndoLeftRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(17.7614f, 7.0f, 20.0f, 9.2386f, 20.0f, 12.0f)
                curveTo(20.0f, 14.7614f, 17.7614f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(8.0f)
                moveTo(4.0f, 7.0f)
                lineTo(7.0f, 4.0f)
                moveTo(4.0f, 7.0f)
                lineTo(7.0f, 10.0f)
            }
        }
            .build()
        return _undoLeftRound!!
    }

private var _undoLeftRound: ImageVector? = null
