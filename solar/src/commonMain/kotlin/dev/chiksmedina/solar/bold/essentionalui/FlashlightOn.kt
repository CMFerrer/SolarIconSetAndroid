package dev.chiksmedina.solar.bold.essentionalui

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
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.FlashlightOn: ImageVector
    get() {
        if (_flashlightOn != null) {
            return _flashlightOn!!
        }
        _flashlightOn = Builder(
            name = "FlashlightOn", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5303f, 2.4697f)
                curveTo(6.2374f, 2.1768f, 5.7626f, 2.1768f, 5.4697f, 2.4697f)
                curveTo(5.1768f, 2.7626f, 5.1768f, 3.2374f, 5.4697f, 3.5303f)
                lineTo(7.4697f, 5.5303f)
                curveTo(7.7626f, 5.8232f, 8.2374f, 5.8232f, 8.5303f, 5.5303f)
                curveTo(8.8232f, 5.2374f, 8.8232f, 4.7626f, 8.5303f, 4.4697f)
                lineTo(6.5303f, 2.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5303f, 2.4697f)
                curveTo(18.2374f, 2.1768f, 17.7626f, 2.1768f, 17.4697f, 2.4697f)
                lineTo(15.4697f, 4.4697f)
                curveTo(15.1768f, 4.7626f, 15.1768f, 5.2374f, 15.4697f, 5.5303f)
                curveTo(15.7626f, 5.8232f, 16.2374f, 5.8232f, 16.5303f, 5.5303f)
                lineTo(18.5303f, 3.5303f)
                curveTo(18.8232f, 3.2374f, 18.8232f, 2.7626f, 18.5303f, 2.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                lineTo(20.0f, 10.25f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 10.0f)
                curveTo(4.0f, 9.0572f, 4.0f, 8.5858f, 4.2929f, 8.2929f)
                curveTo(4.5858f, 8.0f, 5.0572f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(18.0f)
                curveTo(18.9428f, 8.0f, 19.4142f, 8.0f, 19.7071f, 8.2929f)
                curveTo(20.0f, 8.5858f, 20.0f, 9.0572f, 20.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1716f, 14.8284f)
                curveTo(16.0094f, 14.9906f, 15.87f, 15.13f, 15.75f, 15.2548f)
                verticalLineTo(15.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(15.2548f)
                curveTo(8.13f, 15.13f, 7.9906f, 14.9906f, 7.8285f, 14.8285f)
                lineTo(4.75f, 11.75f)
                horizontalLineTo(19.25f)
                lineTo(16.1716f, 14.8284f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 20.0f)
                verticalLineTo(17.6569f)
                curveTo(9.0f, 17.2795f, 9.0f, 16.9893f, 8.985f, 16.75f)
                horizontalLineTo(15.015f)
                curveTo(15.0f, 16.9893f, 15.0f, 17.2795f, 15.0f, 17.6569f)
                verticalLineTo(20.0f)
                curveTo(15.0f, 20.9428f, 15.0f, 21.4142f, 14.7071f, 21.7071f)
                curveTo(14.4142f, 22.0f, 13.9428f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(10.0572f, 22.0f, 9.5858f, 22.0f, 9.2929f, 21.7071f)
                curveTo(9.0f, 21.4142f, 9.0f, 20.9428f, 9.0f, 20.0f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 18.5858f, 12.75f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                close()
            }
        }
            .build()
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
