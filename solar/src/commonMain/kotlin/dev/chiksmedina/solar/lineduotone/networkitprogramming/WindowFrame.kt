package dev.chiksmedina.solar.lineduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.WindowFrame: ImageVector
    get() {
        if (_windowFrame != null) {
            return _windowFrame!!
        }
        _windowFrame = Builder(
            name = "WindowFrame", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 6.5523f, 6.5523f, 7.0f, 6.0f, 7.0f)
                curveTo(5.4477f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                curveTo(6.5523f, 5.0f, 7.0f, 5.4477f, 7.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 6.5523f, 9.5523f, 7.0f, 9.0f, 7.0f)
                curveTo(8.4477f, 7.0f, 8.0f, 6.5523f, 8.0f, 6.0f)
                curveTo(8.0f, 5.4477f, 8.4477f, 5.0f, 9.0f, 5.0f)
                curveTo(9.5523f, 5.0f, 10.0f, 5.4477f, 10.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 6.0f)
                curveTo(13.0f, 6.5523f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 6.5523f, 11.0f, 6.0f)
                curveTo(11.0f, 5.4477f, 11.4477f, 5.0f, 12.0f, 5.0f)
                curveTo(12.5523f, 5.0f, 13.0f, 5.4477f, 13.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.75f)
                curveTo(1.5858f, 8.75f, 1.25f, 9.0858f, 1.25f, 9.5f)
                curveTo(1.25f, 9.9142f, 1.5858f, 10.25f, 2.0f, 10.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(22.0f, 10.25f)
                curveTo(22.4142f, 10.25f, 22.75f, 9.9142f, 22.75f, 9.5f)
                curveTo(22.75f, 9.0858f, 22.4142f, 8.75f, 22.0f, 8.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(8.25f, 21.0f)
                curveTo(8.25f, 21.4142f, 8.5858f, 21.75f, 9.0f, 21.75f)
                curveTo(9.4142f, 21.75f, 9.75f, 21.4142f, 9.75f, 21.0f)
                lineTo(8.25f, 21.0f)
                close()
                moveTo(9.75f, 10.0f)
                curveTo(9.75f, 9.5858f, 9.4142f, 9.25f, 9.0f, 9.25f)
                curveTo(8.5858f, 9.25f, 8.25f, 9.5858f, 8.25f, 10.0f)
                lineTo(9.75f, 10.0f)
                close()
                moveTo(2.0f, 10.25f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.75f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.25f)
                close()
                moveTo(9.75f, 21.0f)
                lineTo(9.75f, 10.0f)
                lineTo(8.25f, 10.0f)
                lineTo(8.25f, 21.0f)
                lineTo(9.75f, 21.0f)
                close()
            }
        }
            .build()
        return _windowFrame!!
    }

private var _windowFrame: ImageVector? = null
