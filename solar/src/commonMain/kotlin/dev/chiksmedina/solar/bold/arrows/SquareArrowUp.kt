package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.SquareArrowUp: ImageVector
    get() {
        if (_squareArrowUp != null) {
            return _squareArrowUp!!
        }
        _squareArrowUp = Builder(
            name = "SquareArrowUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                close()
                moveTo(12.0f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16.0f)
                verticalLineTo(9.8107f)
                lineTo(14.4697f, 11.5303f)
                curveTo(14.7626f, 11.8232f, 15.2374f, 11.8232f, 15.5303f, 11.5303f)
                curveTo(15.8232f, 11.2374f, 15.8232f, 10.7626f, 15.5303f, 10.4697f)
                lineTo(12.5303f, 7.4697f)
                curveTo(12.3897f, 7.329f, 12.1989f, 7.25f, 12.0f, 7.25f)
                curveTo(11.8011f, 7.25f, 11.6103f, 7.329f, 11.4697f, 7.4697f)
                lineTo(8.4697f, 10.4697f)
                curveTo(8.1768f, 10.7626f, 8.1768f, 11.2374f, 8.4697f, 11.5303f)
                curveTo(8.7626f, 11.8232f, 9.2374f, 11.8232f, 9.5303f, 11.5303f)
                lineTo(11.25f, 9.8107f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                close()
            }
        }
            .build()
        return _squareArrowUp!!
    }

private var _squareArrowUp: ImageVector? = null
