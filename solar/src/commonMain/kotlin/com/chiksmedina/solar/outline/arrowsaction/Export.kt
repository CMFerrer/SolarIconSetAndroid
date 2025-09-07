package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(
            name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4697f, 7.5303f)
                curveTo(14.7626f, 7.8232f, 15.2374f, 7.8232f, 15.5303f, 7.5303f)
                curveTo(15.8232f, 7.2374f, 15.8232f, 6.7626f, 15.5303f, 6.4697f)
                lineTo(12.5303f, 3.4697f)
                curveTo(12.2374f, 3.1768f, 11.7626f, 3.1768f, 11.4697f, 3.4697f)
                lineTo(8.4697f, 6.4697f)
                curveTo(8.1768f, 6.7626f, 8.1768f, 7.2374f, 8.4697f, 7.5303f)
                curveTo(8.7626f, 7.8232f, 9.2374f, 7.8232f, 9.5303f, 7.5303f)
                lineTo(11.25f, 5.8107f)
                verticalLineTo(14.0f)
                curveTo(11.25f, 14.4142f, 11.5858f, 14.75f, 12.0f, 14.75f)
                curveTo(12.4142f, 14.75f, 12.75f, 14.4142f, 12.75f, 14.0f)
                verticalLineTo(5.8107f)
                lineTo(14.4697f, 7.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.75f, 12.0f)
                curveTo(20.75f, 11.5858f, 20.4142f, 11.25f, 20.0f, 11.25f)
                curveTo(19.5858f, 11.25f, 19.25f, 11.5858f, 19.25f, 12.0f)
                curveTo(19.25f, 16.0041f, 16.0041f, 19.25f, 12.0f, 19.25f)
                curveTo(7.9959f, 19.25f, 4.75f, 16.0041f, 4.75f, 12.0f)
                curveTo(4.75f, 11.5858f, 4.4142f, 11.25f, 4.0f, 11.25f)
                curveTo(3.5858f, 11.25f, 3.25f, 11.5858f, 3.25f, 12.0f)
                curveTo(3.25f, 16.8325f, 7.1675f, 20.75f, 12.0f, 20.75f)
                curveTo(16.8325f, 20.75f, 20.75f, 16.8325f, 20.75f, 12.0f)
                close()
            }
        }
            .build()
        return _export!!
    }

private var _export: ImageVector? = null
