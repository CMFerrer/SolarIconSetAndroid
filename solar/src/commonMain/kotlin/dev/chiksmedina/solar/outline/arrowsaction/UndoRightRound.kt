package dev.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsActionGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.4697f, 3.4697f)
                curveTo(16.7626f, 3.1768f, 17.2374f, 3.1768f, 17.5303f, 3.4697f)
                lineTo(20.5303f, 6.4697f)
                curveTo(20.8232f, 6.7626f, 20.8232f, 7.2374f, 20.5303f, 7.5303f)
                lineTo(17.5303f, 10.5303f)
                curveTo(17.2374f, 10.8232f, 16.7626f, 10.8232f, 16.4697f, 10.5303f)
                curveTo(16.1768f, 10.2374f, 16.1768f, 9.7626f, 16.4697f, 9.4697f)
                lineTo(18.1893f, 7.75f)
                horizontalLineTo(9.0f)
                curveTo(6.6528f, 7.75f, 4.75f, 9.6528f, 4.75f, 12.0f)
                curveTo(4.75f, 14.3472f, 6.6528f, 16.25f, 9.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.25f, 16.75f, 16.5858f, 16.75f, 17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                horizontalLineTo(9.0f)
                curveTo(5.8244f, 17.75f, 3.25f, 15.1756f, 3.25f, 12.0f)
                curveTo(3.25f, 8.8244f, 5.8244f, 6.25f, 9.0f, 6.25f)
                horizontalLineTo(18.1893f)
                lineTo(16.4697f, 4.5303f)
                curveTo(16.1768f, 4.2374f, 16.1768f, 3.7626f, 16.4697f, 3.4697f)
                close()
            }
        }
            .build()
        return _undoRightRound!!
    }

private var _undoRightRound: ImageVector? = null
