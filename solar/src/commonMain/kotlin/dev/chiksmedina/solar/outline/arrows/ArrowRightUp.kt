package dev.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.ArrowRightUp: ImageVector
    get() {
        if (_arrowRightUp != null) {
            return _arrowRightUp!!
        }
        _arrowRightUp = Builder(
            name = "ArrowRightUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 6.75f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 5.25f, 18.75f, 5.5858f, 18.75f, 6.0f)
                verticalLineTo(15.0f)
                curveTo(18.75f, 15.4142f, 18.4142f, 15.75f, 18.0f, 15.75f)
                curveTo(17.5858f, 15.75f, 17.25f, 15.4142f, 17.25f, 15.0f)
                verticalLineTo(7.8107f)
                lineTo(6.5303f, 18.5303f)
                curveTo(6.2374f, 18.8232f, 5.7626f, 18.8232f, 5.4697f, 18.5303f)
                curveTo(5.1768f, 18.2374f, 5.1768f, 17.7626f, 5.4697f, 17.4697f)
                lineTo(16.1893f, 6.75f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
