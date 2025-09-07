package com.chiksmedina.solar.lineduotone.arrows

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
import com.chiksmedina.solar.lineduotone.ArrowsGroup

val ArrowsGroup.ArrowLeftDown: ImageVector
    get() {
        if (_arrowLeftDown != null) {
            return _arrowLeftDown!!
        }
        _arrowLeftDown = Builder(
            name = "ArrowLeftDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5303f, 6.5303f)
                curveTo(18.8232f, 6.2374f, 18.8232f, 5.7626f, 18.5303f, 5.4697f)
                curveTo(18.2374f, 5.1768f, 17.7626f, 5.1768f, 17.4697f, 5.4697f)
                lineTo(18.5303f, 6.5303f)
                close()
                moveTo(17.4697f, 5.4697f)
                lineTo(5.4697f, 17.4697f)
                lineTo(6.5303f, 18.5303f)
                lineTo(18.5303f, 6.5303f)
                lineTo(17.4697f, 5.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 18.0f)
                lineTo(15.0f, 18.0f)
            }
        }
            .build()
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: ImageVector? = null
