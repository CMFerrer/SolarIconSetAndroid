package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5303f, 7.5303f)
                curveTo(15.2374f, 7.8232f, 14.7626f, 7.8232f, 14.4697f, 7.5303f)
                lineTo(12.75f, 5.8107f)
                lineTo(12.75f, 14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                lineTo(11.25f, 5.8107f)
                lineTo(9.5303f, 7.5303f)
                curveTo(9.2374f, 7.8232f, 8.7626f, 7.8232f, 8.4697f, 7.5303f)
                curveTo(8.1768f, 7.2374f, 8.1768f, 6.7626f, 8.4697f, 6.4697f)
                lineTo(11.4697f, 3.4697f)
                curveTo(11.7626f, 3.1768f, 12.2374f, 3.1768f, 12.5303f, 3.4697f)
                lineTo(15.5303f, 6.4697f)
                curveTo(15.8232f, 6.7626f, 15.8232f, 7.2374f, 15.5303f, 7.5303f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
