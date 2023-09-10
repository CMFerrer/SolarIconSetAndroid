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

val ArrowsGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(
            name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.75f, 12.0f)
                curveTo(20.75f, 11.5858f, 20.4142f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(10.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 12.75f, 20.75f, 12.4142f, 20.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.75f, 18.0f)
                curveTo(10.75f, 18.3034f, 10.5673f, 18.5768f, 10.287f, 18.6929f)
                curveTo(10.0068f, 18.809f, 9.6842f, 18.7449f, 9.4697f, 18.5304f)
                lineTo(3.4697f, 12.5304f)
                curveTo(3.329f, 12.3897f, 3.25f, 12.1989f, 3.25f, 12.0f)
                curveTo(3.25f, 11.8011f, 3.329f, 11.6103f, 3.4697f, 11.4697f)
                lineTo(9.4697f, 5.4697f)
                curveTo(9.6842f, 5.2552f, 10.0068f, 5.191f, 10.287f, 5.3071f)
                curveTo(10.5673f, 5.4232f, 10.75f, 5.6967f, 10.75f, 6.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
            .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
