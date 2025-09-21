package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.SquareDoubleAltArrowLeft: ImageVector
    get() {
        if (_squareDoubleAltArrowLeft != null) {
            return _squareDoubleAltArrowLeft!!
        }
        _squareDoubleAltArrowLeft = Builder(
            name = "SquareDoubleAltArrowLeft", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(16.0303f, 9.5303f)
                curveTo(16.3232f, 9.2374f, 16.3232f, 8.7626f, 16.0303f, 8.4697f)
                curveTo(15.7374f, 8.1768f, 15.2626f, 8.1768f, 14.9697f, 8.4697f)
                lineTo(11.9697f, 11.4697f)
                curveTo(11.6768f, 11.7626f, 11.6768f, 12.2374f, 11.9697f, 12.5303f)
                lineTo(14.9697f, 15.5303f)
                curveTo(15.2626f, 15.8232f, 15.7374f, 15.8232f, 16.0303f, 15.5303f)
                curveTo(16.3232f, 15.2374f, 16.3232f, 14.7626f, 16.0303f, 14.4697f)
                lineTo(13.5607f, 12.0f)
                lineTo(16.0303f, 9.5303f)
                close()
                moveTo(12.0303f, 8.4697f)
                curveTo(12.3232f, 8.7626f, 12.3232f, 9.2374f, 12.0303f, 9.5303f)
                lineTo(9.5607f, 12.0f)
                lineTo(12.0303f, 14.4697f)
                curveTo(12.3232f, 14.7626f, 12.3232f, 15.2374f, 12.0303f, 15.5303f)
                curveTo(11.7374f, 15.8232f, 11.2626f, 15.8232f, 10.9697f, 15.5303f)
                lineTo(7.9697f, 12.5303f)
                curveTo(7.6768f, 12.2374f, 7.6768f, 11.7626f, 7.9697f, 11.4697f)
                lineTo(10.9697f, 8.4697f)
                curveTo(11.2626f, 8.1768f, 11.7374f, 8.1768f, 12.0303f, 8.4697f)
                close()
            }
        }
            .build()
        return _squareDoubleAltArrowLeft!!
    }

private var _squareDoubleAltArrowLeft: ImageVector? = null
