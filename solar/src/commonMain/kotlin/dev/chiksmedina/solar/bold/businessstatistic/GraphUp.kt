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

val BusinessStatisticGroup.GraphUp: ImageVector
    get() {
        if (_graphUp != null) {
            return _graphUp!!
        }
        _graphUp = Builder(
            name = "GraphUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.75f, 10.0f)
                curveTo(13.75f, 10.4142f, 14.0858f, 10.75f, 14.5f, 10.75f)
                horizontalLineTo(15.1893f)
                lineTo(13.1768f, 12.7626f)
                curveTo(13.0791f, 12.8602f, 12.9209f, 12.8602f, 12.8232f, 12.7626f)
                lineTo(11.2374f, 11.1768f)
                curveTo(10.554f, 10.4934f, 9.446f, 10.4934f, 8.7626f, 11.1768f)
                lineTo(6.4697f, 13.4697f)
                curveTo(6.1768f, 13.7626f, 6.1768f, 14.2374f, 6.4697f, 14.5303f)
                curveTo(6.7626f, 14.8232f, 7.2374f, 14.8232f, 7.5303f, 14.5303f)
                lineTo(9.8232f, 12.2374f)
                curveTo(9.9208f, 12.1398f, 10.0791f, 12.1398f, 10.1768f, 12.2374f)
                lineTo(11.7626f, 13.8232f)
                curveTo(12.446f, 14.5066f, 13.554f, 14.5066f, 14.2374f, 13.8232f)
                lineTo(16.25f, 11.8107f)
                verticalLineTo(12.5f)
                curveTo(16.25f, 12.9142f, 16.5858f, 13.25f, 17.0f, 13.25f)
                curveTo(17.4142f, 13.25f, 17.75f, 12.9142f, 17.75f, 12.5f)
                verticalLineTo(10.0f)
                curveTo(17.75f, 9.5858f, 17.4142f, 9.25f, 17.0f, 9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 9.25f, 13.75f, 9.5858f, 13.75f, 10.0f)
                close()
            }
        }
            .build()
        return _graphUp!!
    }

private var _graphUp: ImageVector? = null
