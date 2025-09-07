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

val ArrowsActionGroup.UndoLeftRoundSquare: ImageVector
    get() {
        if (_undoLeftRoundSquare != null) {
            return _undoLeftRoundSquare!!
        }
        _undoLeftRoundSquare = Builder(
            name = "UndoLeftRoundSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.7141f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(9.2587f, 7.9739f)
                curveTo(9.5631f, 7.693f, 9.5821f, 7.2185f, 9.3011f, 6.9141f)
                curveTo(9.0202f, 6.6098f, 8.5456f, 6.5908f, 8.2413f, 6.8717f)
                lineTo(5.9913f, 8.9487f)
                curveTo(5.8375f, 9.0906f, 5.75f, 9.2905f, 5.75f, 9.4998f)
                curveTo(5.75f, 9.7091f, 5.8375f, 9.9089f, 5.9913f, 10.0509f)
                lineTo(8.2413f, 12.1278f)
                curveTo(8.5456f, 12.4088f, 9.0202f, 12.3898f, 9.3011f, 12.0854f)
                curveTo(9.5821f, 11.781f, 9.5631f, 11.3065f, 9.2587f, 11.0256f)
                lineTo(8.4182f, 10.2498f)
                horizontalLineTo(14.0385f)
                curveTo(15.536f, 10.2498f, 16.75f, 11.4638f, 16.75f, 12.9613f)
                curveTo(16.75f, 14.4589f, 15.536f, 15.6729f, 14.0385f, 15.6729f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 15.6729f, 8.75f, 16.0086f, 8.75f, 16.4229f)
                curveTo(8.75f, 16.8371f, 9.0858f, 17.1729f, 9.5f, 17.1729f)
                horizontalLineTo(14.0385f)
                curveTo(16.3644f, 17.1729f, 18.25f, 15.2873f, 18.25f, 12.9613f)
                curveTo(18.25f, 10.6353f, 16.3644f, 8.7498f, 14.0385f, 8.7498f)
                horizontalLineTo(8.4182f)
                lineTo(9.2587f, 7.9739f)
                close()
            }
        }
            .build()
        return _undoLeftRoundSquare!!
    }

private var _undoLeftRoundSquare: ImageVector? = null
