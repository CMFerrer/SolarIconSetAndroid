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

val ArrowsGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(
            name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                lineTo(12.75f, 18.1893f)
                lineTo(17.4697f, 13.4697f)
                curveTo(17.7626f, 13.1768f, 18.2374f, 13.1768f, 18.5303f, 13.4697f)
                curveTo(18.8232f, 13.7626f, 18.8232f, 14.2374f, 18.5303f, 14.5303f)
                lineTo(12.5303f, 20.5303f)
                curveTo(12.3897f, 20.671f, 12.1989f, 20.75f, 12.0f, 20.75f)
                curveTo(11.8011f, 20.75f, 11.6103f, 20.671f, 11.4697f, 20.5303f)
                lineTo(5.4697f, 14.5303f)
                curveTo(5.1768f, 14.2374f, 5.1768f, 13.7626f, 5.4697f, 13.4697f)
                curveTo(5.7626f, 13.1768f, 6.2374f, 13.1768f, 6.5303f, 13.4697f)
                lineTo(11.25f, 18.1893f)
                lineTo(11.25f, 4.0f)
                curveTo(11.25f, 3.5858f, 11.5858f, 3.25f, 12.0f, 3.25f)
                close()
            }
        }
            .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
