package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

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
                curveTo(8.0516f, 7.75f, 7.3904f, 7.7507f, 6.8778f, 7.7972f)
                curveTo(6.3755f, 7.8427f, 6.0899f, 7.9274f, 5.875f, 8.0514f)
                curveTo(5.533f, 8.2489f, 5.2489f, 8.533f, 5.0514f, 8.875f)
                curveTo(4.9274f, 9.0899f, 4.8427f, 9.3755f, 4.7972f, 9.8778f)
                curveTo(4.7507f, 10.3904f, 4.75f, 11.0516f, 4.75f, 12.0f)
                curveTo(4.75f, 12.9484f, 4.7507f, 13.6096f, 4.7972f, 14.1222f)
                curveTo(4.8427f, 14.6245f, 4.9274f, 14.9101f, 5.0514f, 15.125f)
                curveTo(5.2489f, 15.467f, 5.533f, 15.7511f, 5.875f, 15.9486f)
                curveTo(6.0899f, 16.0726f, 6.3755f, 16.1573f, 6.8778f, 16.2028f)
                curveTo(7.3904f, 16.2493f, 8.0516f, 16.25f, 9.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.25f, 16.75f, 16.5858f, 16.75f, 17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                horizontalLineTo(8.9642f)
                curveTo(8.06f, 17.75f, 7.3307f, 17.75f, 6.7424f, 17.6967f)
                curveTo(6.1361f, 17.6417f, 5.6062f, 17.5254f, 5.125f, 17.2476f)
                curveTo(4.5549f, 16.9185f, 4.0815f, 16.4451f, 3.7524f, 15.875f)
                curveTo(3.4746f, 15.3937f, 3.3583f, 14.8639f, 3.3033f, 14.2576f)
                curveTo(3.25f, 13.6693f, 3.25f, 12.94f, 3.25f, 12.0358f)
                verticalLineTo(11.9642f)
                curveTo(3.25f, 11.06f, 3.25f, 10.3307f, 3.3033f, 9.7424f)
                curveTo(3.3583f, 9.136f, 3.4746f, 8.6062f, 3.7524f, 8.125f)
                curveTo(4.0815f, 7.5549f, 4.5549f, 7.0815f, 5.125f, 6.7524f)
                curveTo(5.6062f, 6.4746f, 6.1361f, 6.3583f, 6.7424f, 6.3033f)
                curveTo(7.3307f, 6.25f, 8.06f, 6.25f, 8.9642f, 6.25f)
                lineTo(18.1893f, 6.25f)
                lineTo(16.4697f, 4.5303f)
                curveTo(16.1768f, 4.2374f, 16.1768f, 3.7626f, 16.4697f, 3.4697f)
                close()
            }
        }
            .build()
        return _undoRight!!
    }

private var _undoRight: ImageVector? = null
