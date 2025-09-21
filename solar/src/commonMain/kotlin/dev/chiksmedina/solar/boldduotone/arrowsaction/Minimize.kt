package dev.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.3929f, 15.0f)
                curveTo(2.3929f, 14.5858f, 2.7286f, 14.25f, 3.1429f, 14.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 14.25f, 9.75f, 14.5858f, 9.75f, 15.0f)
                verticalLineTo(20.8571f)
                curveTo(9.75f, 21.2714f, 9.4142f, 21.6071f, 9.0f, 21.6071f)
                curveTo(8.5858f, 21.6071f, 8.25f, 21.2714f, 8.25f, 20.8571f)
                verticalLineTo(16.8107f)
                lineTo(2.5303f, 22.5303f)
                curveTo(2.2374f, 22.8232f, 1.7626f, 22.8232f, 1.4697f, 22.5303f)
                curveTo(1.1768f, 22.2374f, 1.1768f, 21.7626f, 1.4697f, 21.4697f)
                lineTo(7.1893f, 15.75f)
                horizontalLineTo(3.1429f)
                curveTo(2.7286f, 15.75f, 2.3929f, 15.4142f, 2.3929f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.6071f, 9.0f)
                curveTo(21.6071f, 9.4142f, 21.2714f, 9.75f, 20.8571f, 9.75f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 9.75f, 14.25f, 9.4142f, 14.25f, 9.0f)
                verticalLineTo(3.1429f)
                curveTo(14.25f, 2.7286f, 14.5858f, 2.3929f, 15.0f, 2.3929f)
                curveTo(15.4142f, 2.3929f, 15.75f, 2.7286f, 15.75f, 3.1429f)
                verticalLineTo(7.1893f)
                lineTo(21.4697f, 1.4697f)
                curveTo(21.7626f, 1.1768f, 22.2374f, 1.1768f, 22.5303f, 1.4697f)
                curveTo(22.8232f, 1.7626f, 22.8232f, 2.2374f, 22.5303f, 2.5303f)
                lineTo(16.8107f, 8.25f)
                horizontalLineTo(20.8571f)
                curveTo(21.2714f, 8.25f, 21.6071f, 8.5858f, 21.6071f, 9.0f)
                close()
            }
        }
            .build()
        return _minimize!!
    }

private var _minimize: ImageVector? = null
