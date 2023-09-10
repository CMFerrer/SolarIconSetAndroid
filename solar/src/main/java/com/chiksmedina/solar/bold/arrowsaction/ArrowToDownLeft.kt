package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.ArrowToDownLeft: ImageVector
    get() {
        if (_arrowToDownLeft != null) {
            return _arrowToDownLeft!!
        }
        _arrowToDownLeft = Builder(
            name = "ArrowToDownLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.5303f, 13.9697f)
                curveTo(17.8232f, 14.2626f, 17.8232f, 14.7374f, 17.5303f, 15.0303f)
                lineTo(12.5303f, 20.0303f)
                curveTo(12.2374f, 20.3232f, 11.7626f, 20.3232f, 11.4697f, 20.0303f)
                lineTo(6.4697f, 15.0303f)
                curveTo(6.1768f, 14.7374f, 6.1768f, 14.2626f, 6.4697f, 13.9697f)
                curveTo(6.7626f, 13.6768f, 7.2374f, 13.6768f, 7.5303f, 13.9697f)
                lineTo(11.25f, 17.6893f)
                lineTo(11.25f, 9.5f)
                curveTo(11.25f, 8.7867f, 11.0298f, 7.7f, 10.3913f, 6.8132f)
                curveTo(9.7804f, 5.9647f, 8.7556f, 5.25f, 7.0f, 5.25f)
                curveTo(6.5858f, 5.25f, 6.25f, 4.9142f, 6.25f, 4.5f)
                curveTo(6.25f, 4.0858f, 6.5858f, 3.75f, 7.0f, 3.75f)
                curveTo(9.2444f, 3.75f, 10.7196f, 4.702f, 11.6087f, 5.9368f)
                curveTo(12.4702f, 7.1333f, 12.75f, 8.5466f, 12.75f, 9.5f)
                lineTo(12.75f, 17.6893f)
                lineTo(16.4697f, 13.9697f)
                curveTo(16.7626f, 13.6768f, 17.2374f, 13.6768f, 17.5303f, 13.9697f)
                close()
            }
        }
            .build()
        return _arrowToDownLeft!!
    }

private var _arrowToDownLeft: ImageVector? = null
