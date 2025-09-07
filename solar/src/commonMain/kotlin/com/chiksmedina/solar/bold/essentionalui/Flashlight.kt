package com.chiksmedina.solar.bold.essentionalui

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
import com.chiksmedina.solar.bold.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 4.25f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 4.0f)
                curveTo(4.0f, 3.0572f, 4.0f, 2.5858f, 4.2929f, 2.2929f)
                curveTo(4.5858f, 2.0f, 5.0572f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.9428f, 2.0f, 19.4142f, 2.0f, 19.7071f, 2.2929f)
                curveTo(20.0f, 2.5858f, 20.0f, 3.0572f, 20.0f, 4.0f)
                lineTo(20.0f, 4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1716f, 8.8284f)
                curveTo(16.0094f, 8.9906f, 15.87f, 9.13f, 15.75f, 9.2548f)
                verticalLineTo(9.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(9.2548f)
                curveTo(8.13f, 9.13f, 7.9906f, 8.9906f, 7.8285f, 8.8285f)
                lineTo(4.75f, 5.75f)
                horizontalLineTo(19.25f)
                lineTo(16.1716f, 8.8284f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                curveTo(15.0f, 11.2795f, 15.0f, 10.9893f, 15.015f, 10.75f)
                horizontalLineTo(8.985f)
                curveTo(9.0f, 10.9893f, 9.0f, 11.2795f, 9.0f, 11.6569f)
                close()
                moveTo(12.75f, 13.0f)
                curveTo(12.75f, 12.5858f, 12.4142f, 12.25f, 12.0f, 12.25f)
                curveTo(11.5858f, 12.25f, 11.25f, 12.5858f, 11.25f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 15.4142f, 11.5858f, 15.75f, 12.0f, 15.75f)
                curveTo(12.4142f, 15.75f, 12.75f, 15.4142f, 12.75f, 15.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
            .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
