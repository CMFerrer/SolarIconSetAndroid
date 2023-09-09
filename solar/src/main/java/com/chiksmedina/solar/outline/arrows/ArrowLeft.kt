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

public val ArrowsGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5303f, 5.4697f)
                curveTo(10.8232f, 5.7626f, 10.8232f, 6.2374f, 10.5303f, 6.5303f)
                lineTo(5.8107f, 11.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 11.25f, 20.75f, 11.5858f, 20.75f, 12.0f)
                curveTo(20.75f, 12.4142f, 20.4142f, 12.75f, 20.0f, 12.75f)
                horizontalLineTo(5.8107f)
                lineTo(10.5303f, 17.4697f)
                curveTo(10.8232f, 17.7626f, 10.8232f, 18.2374f, 10.5303f, 18.5303f)
                curveTo(10.2374f, 18.8232f, 9.7626f, 18.8232f, 9.4697f, 18.5303f)
                lineTo(3.4697f, 12.5303f)
                curveTo(3.1768f, 12.2374f, 3.1768f, 11.7626f, 3.4697f, 11.4697f)
                lineTo(9.4697f, 5.4697f)
                curveTo(9.7626f, 5.1768f, 10.2374f, 5.1768f, 10.5303f, 5.4697f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
