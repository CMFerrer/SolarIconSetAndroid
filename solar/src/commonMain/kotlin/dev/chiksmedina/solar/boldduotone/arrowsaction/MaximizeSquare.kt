package dev.chiksmedina.solar.boldduotone.arrowsaction

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
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.MaximizeSquare: ImageVector
    get() {
        if (_maximizeSquare != null) {
            return _maximizeSquare!!
        }
        _maximizeSquare = Builder(
            name = "MaximizeSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.25f, 6.25f)
                curveTo(12.8358f, 6.25f, 12.5f, 6.5858f, 12.5f, 7.0f)
                curveTo(12.5f, 7.4142f, 12.8358f, 7.75f, 13.25f, 7.75f)
                horizontalLineTo(15.1893f)
                lineTo(11.4697f, 11.4697f)
                lineTo(7.75f, 15.1893f)
                verticalLineTo(13.25f)
                curveTo(7.75f, 12.8358f, 7.4142f, 12.5f, 7.0f, 12.5f)
                curveTo(6.5858f, 12.5f, 6.25f, 12.8358f, 6.25f, 13.25f)
                verticalLineTo(17.0f)
                curveTo(6.25f, 17.4142f, 6.5858f, 17.75f, 7.0f, 17.75f)
                horizontalLineTo(10.75f)
                curveTo(11.1642f, 17.75f, 11.5f, 17.4142f, 11.5f, 17.0f)
                curveTo(11.5f, 16.5858f, 11.1642f, 16.25f, 10.75f, 16.25f)
                horizontalLineTo(8.8107f)
                lineTo(12.5303f, 12.5303f)
                lineTo(16.25f, 8.8107f)
                verticalLineTo(10.75f)
                curveTo(16.25f, 11.1642f, 16.5858f, 11.5f, 17.0f, 11.5f)
                curveTo(17.4142f, 11.5f, 17.75f, 11.1642f, 17.75f, 10.75f)
                verticalLineTo(7.0f)
                curveTo(17.75f, 6.5858f, 17.4142f, 6.25f, 17.0f, 6.25f)
                horizontalLineTo(13.25f)
                close()
            }
        }
            .build()
        return _maximizeSquare!!
    }

private var _maximizeSquare: ImageVector? = null
