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

val ArrowsGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(
            name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.4697f, 3.4697f)
                curveTo(11.7626f, 3.1768f, 12.2374f, 3.1768f, 12.5303f, 3.4697f)
                lineTo(18.5303f, 9.4697f)
                curveTo(18.8232f, 9.7626f, 18.8232f, 10.2374f, 18.5303f, 10.5303f)
                curveTo(18.2374f, 10.8232f, 17.7626f, 10.8232f, 17.4697f, 10.5303f)
                lineTo(12.75f, 5.8107f)
                lineTo(12.75f, 20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                lineTo(11.25f, 5.8107f)
                lineTo(6.5303f, 10.5303f)
                curveTo(6.2374f, 10.8232f, 5.7626f, 10.8232f, 5.4697f, 10.5303f)
                curveTo(5.1768f, 10.2374f, 5.1768f, 9.7626f, 5.4697f, 9.4697f)
                lineTo(11.4697f, 3.4697f)
                close()
            }
        }
            .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
