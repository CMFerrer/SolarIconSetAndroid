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

val ArrowsActionGroup.ArrowToTopLeft: ImageVector
    get() {
        if (_arrowToTopLeft != null) {
            return _arrowToTopLeft!!
        }
        _arrowToTopLeft = Builder(
            name = "ArrowToTopLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.5303f, 10.0303f)
                curveTo(17.8232f, 9.7374f, 17.8232f, 9.2626f, 17.5303f, 8.9697f)
                lineTo(12.5303f, 3.9697f)
                curveTo(12.2374f, 3.6768f, 11.7626f, 3.6768f, 11.4697f, 3.9697f)
                lineTo(6.4697f, 8.9697f)
                curveTo(6.1768f, 9.2626f, 6.1768f, 9.7374f, 6.4697f, 10.0303f)
                curveTo(6.7626f, 10.3232f, 7.2374f, 10.3232f, 7.5303f, 10.0303f)
                lineTo(11.25f, 6.3107f)
                lineTo(11.25f, 14.5f)
                curveTo(11.25f, 15.2133f, 11.0298f, 16.3f, 10.3913f, 17.1868f)
                curveTo(9.7804f, 18.0353f, 8.7556f, 18.75f, 7.0f, 18.75f)
                curveTo(6.5858f, 18.75f, 6.25f, 19.0858f, 6.25f, 19.5f)
                curveTo(6.25f, 19.9142f, 6.5858f, 20.25f, 7.0f, 20.25f)
                curveTo(9.2444f, 20.25f, 10.7196f, 19.298f, 11.6087f, 18.0632f)
                curveTo(12.4702f, 16.8667f, 12.75f, 15.4534f, 12.75f, 14.5f)
                lineTo(12.75f, 6.3107f)
                lineTo(16.4697f, 10.0303f)
                curveTo(16.7626f, 10.3232f, 17.2374f, 10.3232f, 17.5303f, 10.0303f)
                close()
            }
        }
            .build()
        return _arrowToTopLeft!!
    }

private var _arrowToTopLeft: ImageVector? = null
