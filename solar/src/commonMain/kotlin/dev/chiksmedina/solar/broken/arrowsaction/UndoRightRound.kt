package dev.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ArrowsActionGroup

val ArrowsActionGroup.UndoRightRound: ImageVector
    get() {
        if (_undoRightRound != null) {
            return _undoRightRound!!
        }
        _undoRightRound = Builder(
            name = "UndoRightRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(6.2386f, 7.0f, 4.0f, 9.2386f, 4.0f, 12.0f)
                curveTo(4.0f, 14.7614f, 6.2386f, 17.0f, 9.0f, 17.0f)
                moveTo(20.0f, 7.0f)
                lineTo(17.0f, 4.0f)
                moveTo(20.0f, 7.0f)
                lineTo(17.0f, 10.0f)
                moveTo(16.0f, 17.0f)
                horizontalLineTo(13.0f)
            }
        }
            .build()
        return _undoRightRound!!
    }

private var _undoRightRound: ImageVector? = null
