package dev.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.MaximizeSquareMinimalistic: ImageVector
    get() {
        if (_maximizeSquareMinimalistic != null) {
            return _maximizeSquareMinimalistic!!
        }
        _maximizeSquareMinimalistic = Builder(
            name = "MaximizeSquareMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
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
                moveTo(13.25f, 7.0f)
                curveTo(13.25f, 7.4142f, 13.5858f, 7.75f, 14.0f, 7.75f)
                horizontalLineTo(15.1893f)
                lineTo(12.9697f, 9.9697f)
                curveTo(12.6768f, 10.2626f, 12.6768f, 10.7374f, 12.9697f, 11.0303f)
                curveTo(13.2626f, 11.3232f, 13.7374f, 11.3232f, 14.0303f, 11.0303f)
                lineTo(16.25f, 8.8107f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 10.4142f, 16.5858f, 10.75f, 17.0f, 10.75f)
                curveTo(17.4142f, 10.75f, 17.75f, 10.4142f, 17.75f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(17.75f, 6.5858f, 17.4142f, 6.25f, 17.0f, 6.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 6.25f, 13.25f, 6.5858f, 13.25f, 7.0f)
                close()
                moveTo(11.0303f, 14.0303f)
                curveTo(11.3232f, 13.7374f, 11.3232f, 13.2626f, 11.0303f, 12.9697f)
                curveTo(10.7374f, 12.6768f, 10.2626f, 12.6768f, 9.9697f, 12.9697f)
                lineTo(7.75f, 15.1893f)
                verticalLineTo(14.0f)
                curveTo(7.75f, 13.5858f, 7.4142f, 13.25f, 7.0f, 13.25f)
                curveTo(6.5858f, 13.25f, 6.25f, 13.5858f, 6.25f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(6.25f, 17.4142f, 6.5858f, 17.75f, 7.0f, 17.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 17.75f, 10.75f, 17.4142f, 10.75f, 17.0f)
                curveTo(10.75f, 16.5858f, 10.4142f, 16.25f, 10.0f, 16.25f)
                horizontalLineTo(8.8107f)
                lineTo(11.0303f, 14.0303f)
                close()
            }
        }
            .build()
        return _maximizeSquareMinimalistic!!
    }

private var _maximizeSquareMinimalistic: ImageVector? = null
