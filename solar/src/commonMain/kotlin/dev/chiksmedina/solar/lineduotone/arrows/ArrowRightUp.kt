package dev.chiksmedina.solar.lineduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ArrowsGroup

val ArrowsGroup.ArrowRightUp: ImageVector
    get() {
        if (_arrowRightUp != null) {
            return _arrowRightUp!!
        }
        _arrowRightUp = Builder(
            name = "ArrowRightUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.4697f, 17.4697f)
                curveTo(5.1768f, 17.7626f, 5.1768f, 18.2374f, 5.4697f, 18.5303f)
                curveTo(5.7626f, 18.8232f, 6.2374f, 18.8232f, 6.5303f, 18.5303f)
                lineTo(5.4697f, 17.4697f)
                close()
                moveTo(6.5303f, 18.5303f)
                lineTo(18.5303f, 6.5303f)
                lineTo(17.4697f, 5.4697f)
                lineTo(5.4697f, 17.4697f)
                lineTo(6.5303f, 18.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
            }
        }
            .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
