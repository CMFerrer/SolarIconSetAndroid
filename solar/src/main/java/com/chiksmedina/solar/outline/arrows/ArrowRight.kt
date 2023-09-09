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

public val ArrowsGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.4697f, 5.4697f)
                curveTo(13.7626f, 5.1768f, 14.2374f, 5.1768f, 14.5303f, 5.4697f)
                lineTo(20.5303f, 11.4697f)
                curveTo(20.8232f, 11.7626f, 20.8232f, 12.2374f, 20.5303f, 12.5303f)
                lineTo(14.5303f, 18.5303f)
                curveTo(14.2374f, 18.8232f, 13.7626f, 18.8232f, 13.4697f, 18.5303f)
                curveTo(13.1768f, 18.2374f, 13.1768f, 17.7626f, 13.4697f, 17.4697f)
                lineTo(18.1893f, 12.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(18.1893f)
                lineTo(13.4697f, 6.5303f)
                curveTo(13.1768f, 6.2374f, 13.1768f, 5.7626f, 13.4697f, 5.4697f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
