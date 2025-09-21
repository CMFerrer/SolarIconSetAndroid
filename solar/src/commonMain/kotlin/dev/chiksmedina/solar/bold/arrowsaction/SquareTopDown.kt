package dev.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.SquareTopDown: ImageVector
    get() {
        if (_squareTopDown != null) {
            return _squareTopDown!!
        }
        _squareTopDown = Builder(
            name = "SquareTopDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.25f, 3.0f)
                curveTo(14.25f, 2.5858f, 14.5858f, 2.25f, 15.0f, 2.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 2.25f, 21.75f, 2.5858f, 21.75f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(21.75f, 9.4142f, 21.4142f, 9.75f, 21.0f, 9.75f)
                curveTo(20.5858f, 9.75f, 20.25f, 9.4142f, 20.25f, 9.0f)
                verticalLineTo(4.8107f)
                lineTo(13.5303f, 11.5303f)
                curveTo(13.2374f, 11.8232f, 12.7626f, 11.8232f, 12.4697f, 11.5303f)
                curveTo(12.1768f, 11.2374f, 12.1768f, 10.7626f, 12.4697f, 10.4697f)
                lineTo(19.1893f, 3.75f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 3.75f, 14.25f, 3.4142f, 14.25f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.9995f, 11.0164f)
                curveTo(21.6983f, 11.1659f, 21.359f, 11.25f, 21.0f, 11.25f)
                curveTo(19.7574f, 11.25f, 18.75f, 10.2426f, 18.75f, 9.0f)
                verticalLineTo(8.432f)
                lineTo(14.591f, 12.591f)
                curveTo(13.7123f, 13.4697f, 12.2877f, 13.4697f, 11.409f, 12.591f)
                curveTo(10.5303f, 11.7123f, 10.5303f, 10.2877f, 11.409f, 9.409f)
                lineTo(15.568f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(13.7574f, 5.25f, 12.75f, 4.2426f, 12.75f, 3.0f)
                curveTo(12.75f, 2.641f, 12.8341f, 2.3017f, 12.9836f, 2.0006f)
                curveTo(12.6676f, 2.0f, 12.3399f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 11.6601f, 22.0f, 11.3324f, 21.9995f, 11.0164f)
                close()
            }
        }
            .build()
        return _squareTopDown!!
    }

private var _squareTopDown: ImageVector? = null
