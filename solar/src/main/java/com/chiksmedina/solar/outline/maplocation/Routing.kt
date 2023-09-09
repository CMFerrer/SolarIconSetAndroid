package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.Routing: ImageVector
    get() {
        if (_routing != null) {
            return _routing!!
        }
        _routing = Builder(name = "Routing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.75f)
                curveTo(5.3096f, 3.75f, 4.75f, 4.3096f, 4.75f, 5.0f)
                curveTo(4.75f, 5.6904f, 5.3096f, 6.25f, 6.0f, 6.25f)
                curveTo(6.6904f, 6.25f, 7.25f, 5.6904f, 7.25f, 5.0f)
                curveTo(7.25f, 4.3096f, 6.6904f, 3.75f, 6.0f, 3.75f)
                close()
                moveTo(3.25f, 5.0f)
                curveTo(3.25f, 3.4812f, 4.4812f, 2.25f, 6.0f, 2.25f)
                curveTo(7.2588f, 2.25f, 8.32f, 3.0958f, 8.6465f, 4.25f)
                horizontalLineTo(16.5f)
                curveTo(18.8472f, 4.25f, 20.75f, 6.1528f, 20.75f, 8.5f)
                curveTo(20.75f, 10.8472f, 18.8472f, 12.75f, 16.5f, 12.75f)
                horizontalLineTo(7.5f)
                curveTo(5.9812f, 12.75f, 4.75f, 13.9812f, 4.75f, 15.5f)
                curveTo(4.75f, 17.0188f, 5.9812f, 18.25f, 7.5f, 18.25f)
                horizontalLineTo(18.1893f)
                lineTo(17.4697f, 17.5303f)
                curveTo(17.1768f, 17.2374f, 17.1768f, 16.7626f, 17.4697f, 16.4697f)
                curveTo(17.7626f, 16.1768f, 18.2374f, 16.1768f, 18.5303f, 16.4697f)
                lineTo(20.5303f, 18.4697f)
                curveTo(20.8232f, 18.7626f, 20.8232f, 19.2374f, 20.5303f, 19.5303f)
                lineTo(18.5303f, 21.5303f)
                curveTo(18.2374f, 21.8232f, 17.7626f, 21.8232f, 17.4697f, 21.5303f)
                curveTo(17.1768f, 21.2374f, 17.1768f, 20.7626f, 17.4697f, 20.4697f)
                lineTo(18.1893f, 19.75f)
                horizontalLineTo(7.5f)
                curveTo(5.1528f, 19.75f, 3.25f, 17.8472f, 3.25f, 15.5f)
                curveTo(3.25f, 13.1528f, 5.1528f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(16.5f)
                curveTo(18.0188f, 11.25f, 19.25f, 10.0188f, 19.25f, 8.5f)
                curveTo(19.25f, 6.9812f, 18.0188f, 5.75f, 16.5f, 5.75f)
                horizontalLineTo(8.6465f)
                curveTo(8.32f, 6.9043f, 7.2588f, 7.75f, 6.0f, 7.75f)
                curveTo(4.4812f, 7.75f, 3.25f, 6.5188f, 3.25f, 5.0f)
                close()
            }
        }
        .build()
        return _routing!!
    }

private var _routing: ImageVector? = null
