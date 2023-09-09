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

public val ArrowsActionGroup.UndoRightRoundSquare: ImageVector
    get() {
        if (_undoRightRoundSquare != null) {
            return _undoRightRoundSquare!!
        }
        _undoRightRoundSquare = Builder(name = "UndoRightRoundSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.6989f, 6.9142f)
                curveTo(14.9799f, 6.6098f, 15.4543f, 6.5908f, 15.7587f, 6.8717f)
                lineTo(18.0087f, 8.9487f)
                curveTo(18.1625f, 9.0907f, 18.25f, 9.2905f, 18.25f, 9.4998f)
                curveTo(18.25f, 9.7091f, 18.1625f, 9.9089f, 18.0087f, 10.0509f)
                lineTo(15.7587f, 12.1278f)
                curveTo(15.4543f, 12.4088f, 14.9799f, 12.3898f, 14.6989f, 12.0854f)
                curveTo(14.4179f, 11.781f, 14.4369f, 11.3066f, 14.7413f, 11.0256f)
                lineTo(15.5818f, 10.2498f)
                horizontalLineTo(9.9615f)
                curveTo(8.464f, 10.2498f, 7.25f, 11.4638f, 7.25f, 12.9613f)
                curveTo(7.25f, 14.4589f, 8.464f, 15.6729f, 9.9615f, 15.6729f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 15.6729f, 15.25f, 16.0086f, 15.25f, 16.4229f)
                curveTo(15.25f, 16.8371f, 14.9142f, 17.1729f, 14.5f, 17.1729f)
                horizontalLineTo(9.9615f)
                curveTo(7.6356f, 17.1729f, 5.75f, 15.2873f, 5.75f, 12.9613f)
                curveTo(5.75f, 10.6353f, 7.6356f, 8.7498f, 9.9615f, 8.7498f)
                horizontalLineTo(15.5818f)
                lineTo(14.7413f, 7.974f)
                curveTo(14.4369f, 7.693f, 14.4179f, 7.2185f, 14.6989f, 6.9142f)
                close()
            }
        }
        .build()
        return _undoRightRoundSquare!!
    }

private var _undoRightRoundSquare: ImageVector? = null
