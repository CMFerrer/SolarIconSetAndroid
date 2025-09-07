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

val ArrowsActionGroup.Minimize: ImageVector
    get() {
        if (_minimize != null) {
            return _minimize!!
        }
        _minimize = Builder(
            name = "Minimize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.8571f, 9.75f)
                curveTo(21.2714f, 9.75f, 21.6071f, 9.4142f, 21.6071f, 9.0f)
                curveTo(21.6071f, 8.5858f, 21.2714f, 8.25f, 20.8571f, 8.25f)
                horizontalLineTo(16.8107f)
                lineTo(22.5303f, 2.5303f)
                curveTo(22.8232f, 2.2374f, 22.8232f, 1.7626f, 22.5303f, 1.4697f)
                curveTo(22.2374f, 1.1768f, 21.7626f, 1.1768f, 21.4697f, 1.4697f)
                lineTo(15.75f, 7.1893f)
                verticalLineTo(3.1429f)
                curveTo(15.75f, 2.7286f, 15.4142f, 2.3929f, 15.0f, 2.3929f)
                curveTo(14.5858f, 2.3929f, 14.25f, 2.7286f, 14.25f, 3.1429f)
                verticalLineTo(9.0f)
                curveTo(14.25f, 9.4142f, 14.5858f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(20.8571f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.1429f, 14.25f)
                curveTo(2.7286f, 14.25f, 2.3929f, 14.5858f, 2.3929f, 15.0f)
                curveTo(2.3929f, 15.4142f, 2.7286f, 15.75f, 3.1429f, 15.75f)
                horizontalLineTo(7.1893f)
                lineTo(1.4697f, 21.4697f)
                curveTo(1.1768f, 21.7626f, 1.1768f, 22.2374f, 1.4697f, 22.5303f)
                curveTo(1.7626f, 22.8232f, 2.2374f, 22.8232f, 2.5303f, 22.5303f)
                lineTo(8.25f, 16.8107f)
                verticalLineTo(20.8571f)
                curveTo(8.25f, 21.2714f, 8.5858f, 21.6071f, 9.0f, 21.6071f)
                curveTo(9.4142f, 21.6071f, 9.75f, 21.2714f, 9.75f, 20.8571f)
                verticalLineTo(15.0f)
                curveTo(9.75f, 14.5858f, 9.4142f, 14.25f, 9.0f, 14.25f)
                horizontalLineTo(3.1429f)
                close()
            }
        }
            .build()
        return _minimize!!
    }

private var _minimize: ImageVector? = null
