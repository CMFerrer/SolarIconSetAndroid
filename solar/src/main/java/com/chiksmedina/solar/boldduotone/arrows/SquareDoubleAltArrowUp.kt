package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.SquareDoubleAltArrowUp: ImageVector
    get() {
        if (_squareDoubleAltArrowUp != null) {
            return _squareDoubleAltArrowUp!!
        }
        _squareDoubleAltArrowUp = Builder(name = "SquareDoubleAltArrowUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5303f, 12.0303f)
                curveTo(9.2374f, 12.3232f, 8.7626f, 12.3232f, 8.4697f, 12.0303f)
                curveTo(8.1768f, 11.7374f, 8.1768f, 11.2626f, 8.4697f, 10.9697f)
                lineTo(11.4697f, 7.9697f)
                curveTo(11.7626f, 7.6768f, 12.2374f, 7.6768f, 12.5303f, 7.9697f)
                lineTo(15.5303f, 10.9697f)
                curveTo(15.8232f, 11.2626f, 15.8232f, 11.7374f, 15.5303f, 12.0303f)
                curveTo(15.2374f, 12.3232f, 14.7626f, 12.3232f, 14.4697f, 12.0303f)
                lineTo(12.0f, 9.5607f)
                lineTo(9.5303f, 12.0303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5303f, 16.0303f)
                curveTo(9.2374f, 16.3232f, 8.7626f, 16.3232f, 8.4697f, 16.0303f)
                curveTo(8.1768f, 15.7374f, 8.1768f, 15.2626f, 8.4697f, 14.9697f)
                lineTo(11.4697f, 11.9697f)
                curveTo(11.7626f, 11.6768f, 12.2374f, 11.6768f, 12.5303f, 11.9697f)
                lineTo(15.5303f, 14.9697f)
                curveTo(15.8232f, 15.2626f, 15.8232f, 15.7374f, 15.5303f, 16.0303f)
                curveTo(15.2374f, 16.3232f, 14.7626f, 16.3232f, 14.4697f, 16.0303f)
                lineTo(12.0f, 13.5607f)
                lineTo(9.5303f, 16.0303f)
                close()
            }
        }
        .build()
        return _squareDoubleAltArrowUp!!
    }

private var _squareDoubleAltArrowUp: ImageVector? = null
