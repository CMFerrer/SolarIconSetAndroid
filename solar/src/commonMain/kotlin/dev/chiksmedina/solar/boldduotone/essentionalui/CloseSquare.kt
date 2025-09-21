package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.CloseSquare: ImageVector
    get() {
        if (_closeSquare != null) {
            return _closeSquare!!
        }
        _closeSquare = Builder(
            name = "CloseSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9697f, 8.9697f)
                curveTo(9.2626f, 8.6768f, 9.7374f, 8.6768f, 10.0303f, 8.9697f)
                lineTo(12.0f, 10.9394f)
                lineTo(13.9697f, 8.9697f)
                curveTo(14.2626f, 8.6768f, 14.7374f, 8.6768f, 15.0303f, 8.9697f)
                curveTo(15.3232f, 9.2626f, 15.3232f, 9.7375f, 15.0303f, 10.0303f)
                lineTo(13.0607f, 12.0f)
                lineTo(15.0303f, 13.9697f)
                curveTo(15.3232f, 14.2625f, 15.3232f, 14.7374f, 15.0303f, 15.0303f)
                curveTo(14.7374f, 15.3232f, 14.2625f, 15.3232f, 13.9696f, 15.0303f)
                lineTo(12.0f, 13.0607f)
                lineTo(10.0304f, 15.0303f)
                curveTo(9.7375f, 15.3232f, 9.2626f, 15.3232f, 8.9697f, 15.0303f)
                curveTo(8.6768f, 14.7374f, 8.6768f, 14.2626f, 8.9697f, 13.9697f)
                lineTo(10.9394f, 12.0f)
                lineTo(8.9697f, 10.0303f)
                curveTo(8.6768f, 9.7374f, 8.6768f, 9.2626f, 8.9697f, 8.9697f)
                close()
            }
        }
            .build()
        return _closeSquare!!
    }

private var _closeSquare: ImageVector? = null
