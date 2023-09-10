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

val ArrowsGroup.ArrowLeftUp: ImageVector
    get() {
        if (_arrowLeftUp != null) {
            return _arrowLeftUp!!
        }
        _arrowLeftUp = Builder(
            name = "ArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 6.0f)
                curveTo(5.25f, 5.5858f, 5.5858f, 5.25f, 6.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(7.8107f)
                lineTo(18.5303f, 17.4697f)
                curveTo(18.8232f, 17.7626f, 18.8232f, 18.2374f, 18.5303f, 18.5303f)
                curveTo(18.2374f, 18.8232f, 17.7626f, 18.8232f, 17.4697f, 18.5303f)
                lineTo(6.75f, 7.8107f)
                verticalLineTo(15.0f)
                curveTo(6.75f, 15.4142f, 6.4142f, 15.75f, 6.0f, 15.75f)
                curveTo(5.5858f, 15.75f, 5.25f, 15.4142f, 5.25f, 15.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: ImageVector? = null
