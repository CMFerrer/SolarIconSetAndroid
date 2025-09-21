package dev.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.SquareAltArrowDown: ImageVector
    get() {
        if (_squareAltArrowDown != null) {
            return _squareAltArrowDown!!
        }
        _squareAltArrowDown = Builder(
            name = "SquareAltArrowDown", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5303f, 9.9697f)
                curveTo(9.2374f, 9.6768f, 8.7626f, 9.6768f, 8.4697f, 9.9697f)
                curveTo(8.1768f, 10.2626f, 8.1768f, 10.7374f, 8.4697f, 11.0303f)
                lineTo(11.4697f, 14.0303f)
                curveTo(11.6103f, 14.171f, 11.8011f, 14.25f, 12.0f, 14.25f)
                curveTo(12.1989f, 14.25f, 12.3897f, 14.171f, 12.5303f, 14.0303f)
                lineTo(15.5303f, 11.0303f)
                curveTo(15.8232f, 10.7374f, 15.8232f, 10.2626f, 15.5303f, 9.9697f)
                curveTo(15.2374f, 9.6768f, 14.7626f, 9.6768f, 14.4697f, 9.9697f)
                lineTo(12.0f, 12.4393f)
                lineTo(9.5303f, 9.9697f)
                close()
            }
        }
            .build()
        return _squareAltArrowDown!!
    }

private var _squareAltArrowDown: ImageVector? = null
