package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(
            name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 11.6569f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 19.9319f, 9.0f, 20.3978f, 9.1522f, 20.7654f)
                curveTo(9.3552f, 21.2554f, 9.7446f, 21.6448f, 10.2346f, 21.8478f)
                curveTo(10.6022f, 22.0f, 11.0681f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9319f, 22.0f, 13.3978f, 22.0f, 13.7654f, 21.8478f)
                curveTo(14.2554f, 21.6448f, 14.6448f, 21.2554f, 14.8478f, 20.7654f)
                curveTo(15.0f, 20.3978f, 15.0f, 19.9319f, 15.0f, 19.0f)
                verticalLineTo(11.6569f)
                curveTo(15.0f, 10.8394f, 15.0f, 10.4306f, 15.1522f, 10.0631f)
                curveTo(15.3045f, 9.6955f, 15.5935f, 9.4065f, 16.1716f, 8.8284f)
                lineTo(16.1716f, 8.8284f)
                lineTo(19.4142f, 5.5858f)
                curveTo(19.7032f, 5.2968f, 19.8478f, 5.1522f, 19.9239f, 4.9685f)
                curveTo(20.0f, 4.7847f, 20.0f, 4.5803f, 20.0f, 4.1716f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 3.0572f, 20.0f, 2.5858f, 19.7071f, 2.2929f)
                curveTo(19.4142f, 2.0f, 18.9428f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 2.0f, 4.5858f, 2.0f, 4.2929f, 2.2929f)
                curveTo(4.0f, 2.5858f, 4.0f, 3.0572f, 4.0f, 4.0f)
                verticalLineTo(4.1716f)
                curveTo(4.0f, 4.5803f, 4.0f, 4.7847f, 4.0761f, 4.9685f)
                curveTo(4.1522f, 5.1522f, 4.2968f, 5.2968f, 4.5858f, 5.5858f)
                lineTo(7.8284f, 8.8284f)
                curveTo(8.4065f, 9.4065f, 8.6955f, 9.6955f, 8.8478f, 10.0631f)
                curveTo(9.0f, 10.4306f, 9.0f, 10.8394f, 9.0f, 11.6569f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 10.0f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 5.0f)
                horizontalLineTo(19.5f)
            }
        }
            .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
