package dev.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(
            name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 13.75f)
                curveTo(20.0f, 13.3358f, 19.6642f, 13.0f, 19.25f, 13.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 13.0f, 15.5f, 13.3358f, 15.5f, 13.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.25f)
                curveTo(14.0f, 3.5217f, 13.9984f, 3.0509f, 13.9518f, 2.704f)
                curveTo(13.908f, 2.3787f, 13.8374f, 2.2768f, 13.7803f, 2.2197f)
                curveTo(13.7232f, 2.1626f, 13.6213f, 2.092f, 13.296f, 2.0482f)
                curveTo(12.9491f, 2.0016f, 12.4783f, 2.0f, 11.75f, 2.0f)
                curveTo(11.0217f, 2.0f, 10.5509f, 2.0016f, 10.204f, 2.0482f)
                curveTo(9.8787f, 2.092f, 9.7768f, 2.1626f, 9.7197f, 2.2197f)
                curveTo(9.6626f, 2.2768f, 9.592f, 2.3787f, 9.5482f, 2.704f)
                curveTo(9.5016f, 3.0509f, 9.5f, 3.5217f, 9.5f, 4.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.75f)
                curveTo(8.0f, 8.3358f, 7.6642f, 8.0f, 7.25f, 8.0f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 8.0f, 3.5f, 8.3358f, 3.5f, 8.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(2.0f)
                horizontalLineTo(1.75f)
                curveTo(1.3358f, 20.5f, 1.0f, 20.8358f, 1.0f, 21.25f)
                curveTo(1.0f, 21.6642f, 1.3358f, 22.0f, 1.75f, 22.0f)
                horizontalLineTo(21.75f)
                curveTo(22.1642f, 22.0f, 22.5f, 21.6642f, 22.5f, 21.25f)
                curveTo(22.5f, 20.8358f, 22.1642f, 20.5f, 21.75f, 20.5f)
                horizontalLineTo(21.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.75f)
                close()
            }
        }
            .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
