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

public val ArrowsActionGroup.MinimizeSquareMinimalistic: ImageVector
    get() {
        if (_minimizeSquareMinimalistic != null) {
            return _minimizeSquareMinimalistic!!
        }
        _minimizeSquareMinimalistic = Builder(name = "MinimizeSquareMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(6.4697f, 17.5303f)
                curveTo(6.1768f, 17.2374f, 6.1768f, 16.7626f, 6.4697f, 16.4697f)
                lineTo(8.6893f, 14.25f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 14.25f, 6.75f, 13.9142f, 6.75f, 13.5f)
                curveTo(6.75f, 13.0858f, 7.0858f, 12.75f, 7.5f, 12.75f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 12.75f, 11.25f, 13.0858f, 11.25f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(11.25f, 16.9142f, 10.9142f, 17.25f, 10.5f, 17.25f)
                curveTo(10.0858f, 17.25f, 9.75f, 16.9142f, 9.75f, 16.5f)
                verticalLineTo(15.3107f)
                lineTo(7.5303f, 17.5303f)
                curveTo(7.2374f, 17.8232f, 6.7626f, 17.8232f, 6.4697f, 17.5303f)
                close()
                moveTo(16.5f, 11.25f)
                curveTo(16.9142f, 11.25f, 17.25f, 10.9142f, 17.25f, 10.5f)
                curveTo(17.25f, 10.0858f, 16.9142f, 9.75f, 16.5f, 9.75f)
                horizontalLineTo(15.3107f)
                lineTo(17.5303f, 7.5303f)
                curveTo(17.8232f, 7.2374f, 17.8232f, 6.7626f, 17.5303f, 6.4697f)
                curveTo(17.2374f, 6.1768f, 16.7626f, 6.1768f, 16.4697f, 6.4697f)
                lineTo(14.25f, 8.6893f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.0858f, 13.9142f, 6.75f, 13.5f, 6.75f)
                curveTo(13.0858f, 6.75f, 12.75f, 7.0858f, 12.75f, 7.5f)
                verticalLineTo(10.5f)
                curveTo(12.75f, 10.9142f, 13.0858f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _minimizeSquareMinimalistic!!
    }

private var _minimizeSquareMinimalistic: ImageVector? = null
