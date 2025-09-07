package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5303f, 5.4697f)
                curveTo(18.8232f, 5.7626f, 18.8232f, 6.2374f, 18.5303f, 6.5303f)
                lineTo(7.8107f, 17.25f)
                lineTo(15.0f, 17.25f)
                curveTo(15.4142f, 17.25f, 15.75f, 17.5858f, 15.75f, 18.0f)
                curveTo(15.75f, 18.4142f, 15.4142f, 18.75f, 15.0f, 18.75f)
                lineTo(6.0f, 18.75f)
                curveTo(5.5858f, 18.75f, 5.25f, 18.4142f, 5.25f, 18.0f)
                lineTo(5.25f, 9.0f)
                curveTo(5.25f, 8.5858f, 5.5858f, 8.25f, 6.0f, 8.25f)
                curveTo(6.4142f, 8.25f, 6.75f, 8.5858f, 6.75f, 9.0f)
                lineTo(6.75f, 16.1893f)
                lineTo(17.4697f, 5.4697f)
                curveTo(17.7626f, 5.1768f, 18.2374f, 5.1768f, 18.5303f, 5.4697f)
                close()
            }
        }
            .build()
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: ImageVector? = null
