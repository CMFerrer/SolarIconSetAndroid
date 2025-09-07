package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.Maximize: ImageVector
    get() {
        if (_maximize != null) {
            return _maximize!!
        }
        _maximize = Builder(
            name = "Maximize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1429f, 1.25f)
                curveTo(15.7286f, 1.25f, 15.3929f, 1.5858f, 15.3929f, 2.0f)
                curveTo(15.3929f, 2.4142f, 15.7286f, 2.75f, 16.1429f, 2.75f)
                horizontalLineTo(20.1893f)
                lineTo(14.4697f, 8.4697f)
                curveTo(14.1768f, 8.7626f, 14.1768f, 9.2374f, 14.4697f, 9.5303f)
                curveTo(14.7626f, 9.8232f, 15.2374f, 9.8232f, 15.5303f, 9.5303f)
                lineTo(21.25f, 3.8107f)
                verticalLineTo(7.8571f)
                curveTo(21.25f, 8.2714f, 21.5858f, 8.6071f, 22.0f, 8.6071f)
                curveTo(22.4142f, 8.6071f, 22.75f, 8.2714f, 22.75f, 7.8571f)
                verticalLineTo(2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(16.1429f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.8571f, 22.75f)
                curveTo(8.2714f, 22.75f, 8.6071f, 22.4142f, 8.6071f, 22.0f)
                curveTo(8.6071f, 21.5858f, 8.2714f, 21.25f, 7.8571f, 21.25f)
                horizontalLineTo(3.8107f)
                lineTo(9.5303f, 15.5303f)
                curveTo(9.8232f, 15.2374f, 9.8232f, 14.7626f, 9.5303f, 14.4697f)
                curveTo(9.2374f, 14.1768f, 8.7626f, 14.1768f, 8.4697f, 14.4697f)
                lineTo(2.75f, 20.1893f)
                verticalLineTo(16.1429f)
                curveTo(2.75f, 15.7286f, 2.4142f, 15.3929f, 2.0f, 15.3929f)
                curveTo(1.5858f, 15.3929f, 1.25f, 15.7286f, 1.25f, 16.1429f)
                verticalLineTo(22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(7.8571f)
                close()
            }
        }
            .build()
        return _maximize!!
    }

private var _maximize: ImageVector? = null
