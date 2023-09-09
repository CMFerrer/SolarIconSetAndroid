package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.MinimizeSquare: ImageVector
    get() {
        if (_minimizeSquare != null) {
            return _minimizeSquare!!
        }
        _minimizeSquare = Builder(name = "MinimizeSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.134f, 2.0f, 18.4553f, 2.0f, 19.9517f, 2.9877f)
                lineTo(14.75f, 8.1893f)
                verticalLineTo(6.25f)
                curveTo(14.75f, 5.8358f, 14.4142f, 5.5f, 14.0f, 5.5f)
                curveTo(13.5858f, 5.5f, 13.25f, 5.8358f, 13.25f, 6.25f)
                verticalLineTo(10.0f)
                curveTo(13.25f, 10.4142f, 13.5858f, 10.75f, 14.0f, 10.75f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 10.75f, 18.5f, 10.4142f, 18.5f, 10.0f)
                curveTo(18.5f, 9.5858f, 18.1642f, 9.25f, 17.75f, 9.25f)
                horizontalLineTo(15.8107f)
                lineTo(21.0123f, 4.0483f)
                curveTo(22.0f, 5.5447f, 22.0f, 7.866f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.866f, 22.0f, 5.5447f, 22.0f, 4.0483f, 21.0123f)
                lineTo(9.25f, 15.8107f)
                verticalLineTo(17.75f)
                curveTo(9.25f, 18.1642f, 9.5858f, 18.5f, 10.0f, 18.5f)
                curveTo(10.4142f, 18.5f, 10.75f, 18.1642f, 10.75f, 17.75f)
                verticalLineTo(14.0f)
                curveTo(10.75f, 13.5858f, 10.4142f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 13.25f, 5.5f, 13.5858f, 5.5f, 14.0f)
                curveTo(5.5f, 14.4142f, 5.8358f, 14.75f, 6.25f, 14.75f)
                horizontalLineTo(8.1893f)
                lineTo(2.9877f, 19.9517f)
                curveTo(2.0f, 18.4553f, 2.0f, 16.134f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _minimizeSquare!!
    }

private var _minimizeSquare: ImageVector? = null
