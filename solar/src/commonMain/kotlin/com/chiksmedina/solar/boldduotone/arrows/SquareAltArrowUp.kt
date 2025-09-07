package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.SquareAltArrowUp: ImageVector
    get() {
        if (_squareAltArrowUp != null) {
            return _squareAltArrowUp!!
        }
        _squareAltArrowUp = Builder(
            name = "SquareAltArrowUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4697f, 14.0303f)
                curveTo(14.7626f, 14.3232f, 15.2374f, 14.3232f, 15.5303f, 14.0303f)
                curveTo(15.8232f, 13.7374f, 15.8232f, 13.2626f, 15.5303f, 12.9697f)
                lineTo(12.5303f, 9.9697f)
                curveTo(12.3897f, 9.829f, 12.1989f, 9.75f, 12.0f, 9.75f)
                curveTo(11.8011f, 9.75f, 11.6103f, 9.829f, 11.4697f, 9.9697f)
                lineTo(8.4697f, 12.9697f)
                curveTo(8.1768f, 13.2626f, 8.1768f, 13.7374f, 8.4697f, 14.0303f)
                curveTo(8.7626f, 14.3232f, 9.2374f, 14.3232f, 9.5303f, 14.0303f)
                lineTo(12.0f, 11.5607f)
                lineTo(14.4697f, 14.0303f)
                close()
            }
        }
            .build()
        return _squareAltArrowUp!!
    }

private var _squareAltArrowUp: ImageVector? = null
