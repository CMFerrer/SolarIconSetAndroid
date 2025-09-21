package dev.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.SquareTopUp: ImageVector
    get() {
        if (_squareTopUp != null) {
            return _squareTopUp!!
        }
        _squareTopUp = Builder(
            name = "SquareTopUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.432f, 8.75f)
                lineTo(21.6373f, 5.5447f)
                curveTo(22.0f, 7.0087f, 22.0f, 9.0395f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(14.9605f, 2.0f, 16.9913f, 2.0f, 18.4553f, 2.3627f)
                lineTo(15.25f, 5.568f)
                verticalLineTo(5.0f)
                curveTo(15.25f, 3.7574f, 14.2426f, 2.75f, 13.0f, 2.75f)
                curveTo(11.7574f, 2.75f, 10.75f, 3.7574f, 10.75f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(10.75f, 12.2426f, 11.7574f, 13.25f, 13.0f, 13.25f)
                horizontalLineTo(19.0f)
                curveTo(20.2426f, 13.25f, 21.25f, 12.2426f, 21.25f, 11.0f)
                curveTo(21.25f, 9.7574f, 20.2426f, 8.75f, 19.0f, 8.75f)
                horizontalLineTo(18.432f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 11.75f)
                curveTo(19.4142f, 11.75f, 19.75f, 11.4142f, 19.75f, 11.0f)
                curveTo(19.75f, 10.5858f, 19.4142f, 10.25f, 19.0f, 10.25f)
                horizontalLineTo(14.8107f)
                lineTo(21.5303f, 3.5303f)
                curveTo(21.8232f, 3.2374f, 21.8232f, 2.7626f, 21.5303f, 2.4697f)
                curveTo(21.2374f, 2.1768f, 20.7626f, 2.1768f, 20.4697f, 2.4697f)
                lineTo(13.75f, 9.1893f)
                verticalLineTo(5.0f)
                curveTo(13.75f, 4.5858f, 13.4142f, 4.25f, 13.0f, 4.25f)
                curveTo(12.5858f, 4.25f, 12.25f, 4.5858f, 12.25f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(12.25f, 11.4142f, 12.5858f, 11.75f, 13.0f, 11.75f)
                horizontalLineTo(19.0f)
                close()
            }
        }
            .build()
        return _squareTopUp!!
    }

private var _squareTopUp: ImageVector? = null
