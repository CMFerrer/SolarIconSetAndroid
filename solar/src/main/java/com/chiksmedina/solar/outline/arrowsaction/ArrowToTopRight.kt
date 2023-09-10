package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.ArrowToTopRight: ImageVector
    get() {
        if (_arrowToTopRight != null) {
            return _arrowToTopRight!!
        }
        _arrowToTopRight = Builder(
            name = "ArrowToTopRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.4697f, 10.0303f)
                curveTo(6.1768f, 9.7374f, 6.1768f, 9.2626f, 6.4697f, 8.9697f)
                lineTo(11.4697f, 3.9697f)
                curveTo(11.7626f, 3.6768f, 12.2374f, 3.6768f, 12.5303f, 3.9697f)
                lineTo(17.5303f, 8.9697f)
                curveTo(17.8232f, 9.2626f, 17.8232f, 9.7374f, 17.5303f, 10.0303f)
                curveTo(17.2374f, 10.3232f, 16.7626f, 10.3232f, 16.4697f, 10.0303f)
                lineTo(12.75f, 6.3107f)
                lineTo(12.75f, 14.5f)
                curveTo(12.75f, 15.2133f, 12.9702f, 16.3f, 13.6087f, 17.1868f)
                curveTo(14.2196f, 18.0353f, 15.2444f, 18.75f, 17.0f, 18.75f)
                curveTo(17.4142f, 18.75f, 17.75f, 19.0858f, 17.75f, 19.5f)
                curveTo(17.75f, 19.9142f, 17.4142f, 20.25f, 17.0f, 20.25f)
                curveTo(14.7556f, 20.25f, 13.2804f, 19.298f, 12.3913f, 18.0632f)
                curveTo(11.5298f, 16.8667f, 11.25f, 15.4534f, 11.25f, 14.5f)
                lineTo(11.25f, 6.3107f)
                lineTo(7.5303f, 10.0303f)
                curveTo(7.2374f, 10.3232f, 6.7626f, 10.3232f, 6.4697f, 10.0303f)
                close()
            }
        }
            .build()
        return _arrowToTopRight!!
    }

private var _arrowToTopRight: ImageVector? = null
