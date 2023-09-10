package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(
            name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                lineTo(12.75f, 13.25f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 4.0f)
                curveTo(11.25f, 3.5858f, 11.5858f, 3.25f, 12.0f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 13.25f)
                curveTo(5.6967f, 13.25f, 5.4232f, 13.4327f, 5.3071f, 13.713f)
                curveTo(5.191f, 13.9932f, 5.2552f, 14.3158f, 5.4697f, 14.5303f)
                lineTo(11.4697f, 20.5303f)
                curveTo(11.6103f, 20.671f, 11.8011f, 20.75f, 12.0f, 20.75f)
                curveTo(12.1989f, 20.75f, 12.3897f, 20.671f, 12.5304f, 20.5303f)
                lineTo(18.5304f, 14.5303f)
                curveTo(18.7449f, 14.3158f, 18.809f, 13.9932f, 18.6929f, 13.713f)
                curveTo(18.5768f, 13.4327f, 18.3034f, 13.25f, 18.0f, 13.25f)
                lineTo(6.0f, 13.25f)
                close()
            }
        }
            .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
