package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0004f, 19.0f)
                verticalLineTo(17.6569f)
                curveTo(9.0004f, 16.8394f, 9.0004f, 16.4306f, 8.8481f, 16.0631f)
                curveTo(8.8393f, 16.0418f, 8.8301f, 16.0208f, 8.8203f, 16.0f)
                horizontalLineTo(15.1804f)
                curveTo(15.1707f, 16.0208f, 15.1614f, 16.0418f, 15.1526f, 16.0631f)
                curveTo(15.0004f, 16.4306f, 15.0004f, 16.8394f, 15.0004f, 17.6569f)
                verticalLineTo(20.0f)
                curveTo(15.0004f, 20.9428f, 15.0004f, 21.4142f, 14.7075f, 21.7071f)
                curveTo(14.4146f, 22.0f, 13.9432f, 22.0f, 13.0004f, 22.0f)
                horizontalLineTo(11.0004f)
                curveTo(10.0576f, 22.0f, 9.5862f, 22.0f, 9.2933f, 21.7071f)
                curveTo(9.0004f, 21.4142f, 9.0004f, 20.9428f, 9.0004f, 20.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 18.5858f, 12.75f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.1716f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 9.0572f, 20.0f, 8.5858f, 19.7071f, 8.2929f)
                curveTo(19.4142f, 8.0f, 18.9428f, 8.0f, 18.0f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 8.0f, 4.5858f, 8.0f, 4.2929f, 8.2929f)
                curveTo(4.0f, 8.5858f, 4.0f, 9.0572f, 4.0f, 10.0f)
                verticalLineTo(10.1716f)
                curveTo(4.0f, 10.5803f, 4.0f, 10.7847f, 4.0761f, 10.9685f)
                curveTo(4.0805f, 10.9791f, 4.0852f, 10.9896f, 4.09f, 11.0f)
                horizontalLineTo(19.91f)
                curveTo(19.9148f, 10.9896f, 19.9195f, 10.9791f, 19.9239f, 10.9685f)
                curveTo(20.0f, 10.7847f, 20.0f, 10.5803f, 20.0f, 10.1716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1714f, 14.8284f)
                lineTo(19.414f, 11.5858f)
                curveTo(19.6863f, 11.3135f, 19.8304f, 11.1694f, 19.9098f, 11.0f)
                horizontalLineTo(4.0898f)
                curveTo(4.1693f, 11.1694f, 4.3133f, 11.3135f, 4.5856f, 11.5858f)
                lineTo(7.8282f, 14.8284f)
                curveTo(8.3729f, 15.3731f, 8.6609f, 15.6611f, 8.8197f, 16.0f)
                horizontalLineTo(15.1799f)
                curveTo(15.3387f, 15.6611f, 15.6268f, 15.373f, 16.1714f, 14.8284f)
                close()
            }
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
        }
            .build()
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
