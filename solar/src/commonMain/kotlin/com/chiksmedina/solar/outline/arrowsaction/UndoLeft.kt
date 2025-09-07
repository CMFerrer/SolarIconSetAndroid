package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.UndoLeft: ImageVector
    get() {
        if (_undoLeft != null) {
            return _undoLeft!!
        }
        _undoLeft = Builder(
            name = "UndoLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5303f, 3.4697f)
                curveTo(7.8232f, 3.7626f, 7.8232f, 4.2374f, 7.5303f, 4.5303f)
                lineTo(5.8107f, 6.25f)
                lineTo(15.0358f, 6.25f)
                curveTo(15.94f, 6.25f, 16.6693f, 6.25f, 17.2576f, 6.3033f)
                curveTo(17.864f, 6.3583f, 18.3938f, 6.4746f, 18.875f, 6.7524f)
                curveTo(19.4451f, 7.0815f, 19.9185f, 7.5549f, 20.2476f, 8.125f)
                curveTo(20.5254f, 8.6062f, 20.6417f, 9.136f, 20.6967f, 9.7424f)
                curveTo(20.75f, 10.3307f, 20.75f, 11.06f, 20.75f, 11.9643f)
                verticalLineTo(12.0358f)
                curveTo(20.75f, 12.94f, 20.75f, 13.6693f, 20.6967f, 14.2576f)
                curveTo(20.6418f, 14.8639f, 20.5255f, 15.3937f, 20.2476f, 15.875f)
                curveTo(19.9185f, 16.4451f, 19.4451f, 16.9185f, 18.875f, 17.2476f)
                curveTo(18.3938f, 17.5254f, 17.864f, 17.6417f, 17.2576f, 17.6967f)
                curveTo(16.6693f, 17.75f, 15.94f, 17.75f, 15.0358f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(15.0f)
                curveTo(15.9484f, 16.25f, 16.6096f, 16.2493f, 17.1222f, 16.2028f)
                curveTo(17.6245f, 16.1573f, 17.9101f, 16.0726f, 18.125f, 15.9486f)
                curveTo(18.4671f, 15.7511f, 18.7511f, 15.467f, 18.9486f, 15.125f)
                curveTo(19.0726f, 14.9101f, 19.1573f, 14.6245f, 19.2028f, 14.1222f)
                curveTo(19.2493f, 13.6096f, 19.25f, 12.9484f, 19.25f, 12.0f)
                curveTo(19.25f, 11.0516f, 19.2493f, 10.3904f, 19.2028f, 9.8778f)
                curveTo(19.1573f, 9.3755f, 19.0726f, 9.0899f, 18.9486f, 8.875f)
                curveTo(18.7511f, 8.533f, 18.467f, 8.2489f, 18.125f, 8.0514f)
                curveTo(17.9101f, 7.9274f, 17.6245f, 7.8427f, 17.1222f, 7.7972f)
                curveTo(16.6096f, 7.7507f, 15.9484f, 7.75f, 15.0f, 7.75f)
                horizontalLineTo(5.8107f)
                lineTo(7.5303f, 9.4697f)
                curveTo(7.8232f, 9.7626f, 7.8232f, 10.2374f, 7.5303f, 10.5303f)
                curveTo(7.2374f, 10.8232f, 6.7626f, 10.8232f, 6.4697f, 10.5303f)
                lineTo(3.4697f, 7.5303f)
                curveTo(3.1768f, 7.2374f, 3.1768f, 6.7626f, 3.4697f, 6.4697f)
                lineTo(6.4697f, 3.4697f)
                curveTo(6.7626f, 3.1768f, 7.2374f, 3.1768f, 7.5303f, 3.4697f)
                close()
            }
        }
            .build()
        return _undoLeft!!
    }

private var _undoLeft: ImageVector? = null
