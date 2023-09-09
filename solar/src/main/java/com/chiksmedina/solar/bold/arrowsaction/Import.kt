package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = Builder(name = "Import", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5303f, 10.4697f)
                curveTo(15.2374f, 10.1768f, 14.7626f, 10.1768f, 14.4697f, 10.4697f)
                lineTo(12.75f, 12.1893f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 3.5858f, 12.4142f, 3.25f, 12.0f, 3.25f)
                curveTo(11.5858f, 3.25f, 11.25f, 3.5858f, 11.25f, 4.0f)
                lineTo(11.25f, 12.1893f)
                lineTo(9.5303f, 10.4697f)
                curveTo(9.2374f, 10.1768f, 8.7626f, 10.1768f, 8.4697f, 10.4697f)
                curveTo(8.1768f, 10.7626f, 8.1768f, 11.2374f, 8.4697f, 11.5303f)
                lineTo(11.4697f, 14.5303f)
                curveTo(11.7626f, 14.8232f, 12.2374f, 14.8232f, 12.5303f, 14.5303f)
                lineTo(15.5303f, 11.5303f)
                curveTo(15.8232f, 11.2374f, 15.8232f, 10.7626f, 15.5303f, 10.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7476f, 12.0f)
                curveTo(17.2996f, 12.0f, 16.9077f, 12.2742f, 16.591f, 12.591f)
                lineTo(13.591f, 15.591f)
                curveTo(12.7123f, 16.4697f, 11.2877f, 16.4697f, 10.409f, 15.591f)
                lineTo(7.409f, 12.591f)
                curveTo(7.0923f, 12.2742f, 6.7004f, 12.0f, 6.2524f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                horizontalLineTo(17.7476f)
                close()
            }
        }
        .build()
        return _import!!
    }

private var _import: ImageVector? = null
