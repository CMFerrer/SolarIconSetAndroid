package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0004f, 11.6569f)
                verticalLineTo(19.0f)
                curveTo(9.0004f, 19.9319f, 9.0004f, 20.3978f, 9.1526f, 20.7654f)
                curveTo(9.3556f, 21.2554f, 9.745f, 21.6448f, 10.235f, 21.8478f)
                curveTo(10.6025f, 22.0f, 11.0685f, 22.0f, 12.0004f, 22.0f)
                curveTo(12.9323f, 22.0f, 13.3982f, 22.0f, 13.7657f, 21.8478f)
                curveTo(14.2558f, 21.6448f, 14.6451f, 21.2554f, 14.8481f, 20.7654f)
                curveTo(15.0004f, 20.3978f, 15.0004f, 19.9319f, 15.0004f, 19.0f)
                verticalLineTo(11.6569f)
                curveTo(15.0004f, 10.8394f, 15.0004f, 10.4306f, 15.1526f, 10.0631f)
                curveTo(15.1614f, 10.0418f, 15.1707f, 10.0208f, 15.1804f, 10.0f)
                horizontalLineTo(8.8203f)
                curveTo(8.8301f, 10.0208f, 8.8393f, 10.0418f, 8.8481f, 10.0631f)
                curveTo(9.0004f, 10.4306f, 9.0004f, 10.8394f, 9.0004f, 11.6569f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.25f)
                curveTo(12.4142f, 12.25f, 12.75f, 12.5858f, 12.75f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 15.4142f, 12.4142f, 15.75f, 12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                verticalLineTo(13.0f)
                curveTo(11.25f, 12.5858f, 11.5858f, 12.25f, 12.0f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.1716f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 3.0572f, 20.0f, 2.5858f, 19.7071f, 2.2929f)
                curveTo(19.4142f, 2.0f, 18.9428f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 2.0f, 4.5858f, 2.0f, 4.2929f, 2.2929f)
                curveTo(4.0f, 2.5858f, 4.0f, 3.0572f, 4.0f, 4.0f)
                verticalLineTo(4.1716f)
                curveTo(4.0f, 4.5803f, 4.0f, 4.7847f, 4.0761f, 4.9685f)
                curveTo(4.0805f, 4.9791f, 4.0852f, 4.9896f, 4.09f, 5.0f)
                horizontalLineTo(19.91f)
                curveTo(19.9148f, 4.9896f, 19.9195f, 4.9791f, 19.9239f, 4.9685f)
                curveTo(20.0f, 4.7847f, 20.0f, 4.5803f, 20.0f, 4.1716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1714f, 8.8284f)
                lineTo(19.414f, 5.5858f)
                curveTo(19.6863f, 5.3135f, 19.8304f, 5.1694f, 19.9098f, 5.0f)
                horizontalLineTo(4.0898f)
                curveTo(4.1693f, 5.1694f, 4.3133f, 5.3135f, 4.5856f, 5.5858f)
                lineTo(7.8282f, 8.8284f)
                curveTo(8.3729f, 9.373f, 8.6609f, 9.6611f, 8.8197f, 10.0f)
                horizontalLineTo(15.1799f)
                curveTo(15.3387f, 9.6611f, 15.6268f, 9.373f, 16.1714f, 8.8284f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
