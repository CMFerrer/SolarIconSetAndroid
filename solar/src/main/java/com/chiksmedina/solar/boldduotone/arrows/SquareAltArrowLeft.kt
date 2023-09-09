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

public val ArrowsGroup.SquareAltArrowLeft: ImageVector
    get() {
        if (_squareAltArrowLeft != null) {
            return _squareAltArrowLeft!!
        }
        _squareAltArrowLeft = Builder(name = "SquareAltArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0303f, 14.4697f)
                curveTo(14.3232f, 14.7626f, 14.3232f, 15.2374f, 14.0303f, 15.5303f)
                curveTo(13.7374f, 15.8232f, 13.2626f, 15.8232f, 12.9697f, 15.5303f)
                lineTo(9.9697f, 12.5303f)
                curveTo(9.829f, 12.3897f, 9.75f, 12.1989f, 9.75f, 12.0f)
                curveTo(9.75f, 11.8011f, 9.829f, 11.6103f, 9.9697f, 11.4697f)
                lineTo(12.9697f, 8.4697f)
                curveTo(13.2626f, 8.1768f, 13.7374f, 8.1768f, 14.0303f, 8.4697f)
                curveTo(14.3232f, 8.7626f, 14.3232f, 9.2374f, 14.0303f, 9.5303f)
                lineTo(11.5607f, 12.0f)
                lineTo(14.0303f, 14.4697f)
                close()
            }
        }
        .build()
        return _squareAltArrowLeft!!
    }

private var _squareAltArrowLeft: ImageVector? = null
