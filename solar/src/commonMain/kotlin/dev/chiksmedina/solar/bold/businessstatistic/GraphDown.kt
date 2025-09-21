package dev.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.GraphDown: ImageVector
    get() {
        if (_graphDown != null) {
            return _graphDown!!
        }
        _graphDown = Builder(
            name = "GraphDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(7.5303f, 9.4697f)
                curveTo(7.2374f, 9.1768f, 6.7626f, 9.1768f, 6.4697f, 9.4697f)
                curveTo(6.1768f, 9.7626f, 6.1768f, 10.2374f, 6.4697f, 10.5303f)
                lineTo(8.7626f, 12.8232f)
                curveTo(9.446f, 13.5066f, 10.554f, 13.5066f, 11.2374f, 12.8232f)
                lineTo(12.8232f, 11.2374f)
                curveTo(12.9209f, 11.1398f, 13.0791f, 11.1398f, 13.1768f, 11.2374f)
                lineTo(15.1893f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 13.25f, 13.75f, 13.5858f, 13.75f, 14.0f)
                curveTo(13.75f, 14.4142f, 14.0858f, 14.75f, 14.5f, 14.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 14.75f, 17.75f, 14.4142f, 17.75f, 14.0f)
                verticalLineTo(11.5f)
                curveTo(17.75f, 11.0858f, 17.4142f, 10.75f, 17.0f, 10.75f)
                curveTo(16.5858f, 10.75f, 16.25f, 11.0858f, 16.25f, 11.5f)
                verticalLineTo(12.1893f)
                lineTo(14.2374f, 10.1768f)
                curveTo(13.554f, 9.4934f, 12.446f, 9.4934f, 11.7626f, 10.1768f)
                lineTo(10.1768f, 11.7626f)
                curveTo(10.0791f, 11.8602f, 9.9208f, 11.8602f, 9.8232f, 11.7626f)
                lineTo(7.5303f, 9.4697f)
                close()
            }
        }
            .build()
        return _graphDown!!
    }

private var _graphDown: ImageVector? = null
