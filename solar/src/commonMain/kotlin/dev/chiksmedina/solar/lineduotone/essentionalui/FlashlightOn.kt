package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 22.0f)
                verticalLineTo(17.6569f)
                curveTo(9.0f, 16.8394f, 9.0f, 16.4306f, 8.8478f, 16.0631f)
                curveTo(8.6955f, 15.6955f, 8.4065f, 15.4065f, 7.8284f, 14.8284f)
                lineTo(4.5858f, 11.5858f)
                curveTo(4.2968f, 11.2968f, 4.1522f, 11.1522f, 4.0761f, 10.9685f)
                curveTo(4.0f, 10.7847f, 4.0f, 10.5803f, 4.0f, 10.1716f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 9.0572f, 4.0f, 8.5858f, 4.2929f, 8.2929f)
                curveTo(4.5858f, 8.0f, 5.0572f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(18.0f)
                curveTo(18.9428f, 8.0f, 19.4142f, 8.0f, 19.7071f, 8.2929f)
                curveTo(20.0f, 8.5858f, 20.0f, 9.0572f, 20.0f, 10.0f)
                verticalLineTo(10.1716f)
                curveTo(20.0f, 10.5803f, 20.0f, 10.7847f, 19.9239f, 10.9685f)
                curveTo(19.8478f, 11.1522f, 19.7032f, 11.2968f, 19.4142f, 11.5858f)
                lineTo(16.1716f, 14.8284f)
                curveTo(15.5935f, 15.4065f, 15.3045f, 15.6955f, 15.1522f, 16.0631f)
                curveTo(15.0f, 16.4306f, 15.0f, 16.8394f, 15.0f, 17.6569f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 16.0f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 11.0f)
                horizontalLineTo(19.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 5.0f)
                lineTo(6.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 5.0f)
                lineTo(18.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(21.0f)
            }
        }
            .build()
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
