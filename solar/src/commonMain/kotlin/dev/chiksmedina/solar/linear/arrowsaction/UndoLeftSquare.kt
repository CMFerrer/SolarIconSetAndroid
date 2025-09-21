package dev.chiksmedina.solar.linear.arrowsaction

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
import dev.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.UndoLeftSquare: ImageVector
    get() {
        if (_undoLeftSquare != null) {
            return _undoLeftSquare!!
        }
        _undoLeftSquare = Builder(
            name = "UndoLeftSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 9.4998f)
                horizontalLineTo(14.0385f)
                curveTo(15.4063f, 9.4998f, 16.0902f, 9.4998f, 16.5859f, 9.8202f)
                curveTo(16.8235f, 9.9739f, 17.0259f, 10.1762f, 17.1795f, 10.4139f)
                curveTo(17.5f, 10.9095f, 17.5f, 11.5935f, 17.5f, 12.9613f)
                curveTo(17.5f, 14.3292f, 17.5f, 15.0131f, 17.1795f, 15.5087f)
                curveTo(17.0259f, 15.7464f, 16.8235f, 15.9487f, 16.5859f, 16.1024f)
                curveTo(16.0902f, 16.4229f, 15.4063f, 16.4229f, 14.0385f, 16.4229f)
                horizontalLineTo(9.5f)
                moveTo(6.5f, 9.4998f)
                lineTo(8.75f, 7.4229f)
                moveTo(6.5f, 9.4998f)
                lineTo(8.75f, 11.5767f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
        }
            .build()
        return _undoLeftSquare!!
    }

private var _undoLeftSquare: ImageVector? = null
