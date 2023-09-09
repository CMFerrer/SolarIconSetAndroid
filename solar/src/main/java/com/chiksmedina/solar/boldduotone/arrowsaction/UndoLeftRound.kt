package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.UndoLeftRound: ImageVector
    get() {
        if (_undoLeftRound != null) {
            return _undoLeftRound!!
        }
        _undoLeftRound = Builder(name = "UndoLeftRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5303f, 3.4697f)
                curveTo(7.2374f, 3.1768f, 6.7626f, 3.1768f, 6.4697f, 3.4697f)
                lineTo(3.4697f, 6.4697f)
                curveTo(3.1768f, 6.7626f, 3.1768f, 7.2374f, 3.4697f, 7.5303f)
                lineTo(6.4697f, 10.5303f)
                curveTo(6.7626f, 10.8232f, 7.2374f, 10.8232f, 7.5303f, 10.5303f)
                curveTo(7.8232f, 10.2374f, 7.8232f, 9.7626f, 7.5303f, 9.4697f)
                lineTo(5.0607f, 7.0f)
                lineTo(7.5303f, 4.5303f)
                curveTo(7.8232f, 4.2374f, 7.8232f, 3.7626f, 7.5303f, 3.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8107f, 6.25f)
                horizontalLineTo(15.0f)
                curveTo(18.1756f, 6.25f, 20.75f, 8.8244f, 20.75f, 12.0f)
                curveTo(20.75f, 15.1756f, 18.1756f, 17.75f, 15.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(15.0f)
                curveTo(17.3472f, 16.25f, 19.25f, 14.3472f, 19.25f, 12.0f)
                curveTo(19.25f, 9.6528f, 17.3472f, 7.75f, 15.0f, 7.75f)
                horizontalLineTo(5.8107f)
                lineTo(5.0607f, 7.0f)
                lineTo(5.8107f, 6.25f)
                close()
            }
        }
        .build()
        return _undoLeftRound!!
    }

private var _undoLeftRound: ImageVector? = null
