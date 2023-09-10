package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Plate: ImageVector
    get() {
        if (_plate != null) {
            return _plate!!
        }
        _plate = Builder(
            name = "Plate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 8.2503f, 1.0f, 6.3754f, 1.9549f, 5.0611f)
                curveTo(2.2633f, 4.6366f, 2.6366f, 4.2633f, 3.0611f, 3.9549f)
                curveTo(4.3754f, 3.0f, 6.2503f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7497f, 3.0f, 19.6246f, 3.0f, 20.9389f, 3.9549f)
                curveTo(21.3634f, 4.2633f, 21.7367f, 4.6366f, 22.0451f, 5.0611f)
                curveTo(23.0f, 6.3754f, 23.0f, 8.2503f, 23.0f, 12.0f)
                curveTo(23.0f, 15.7497f, 23.0f, 17.6246f, 22.0451f, 18.9389f)
                curveTo(21.7367f, 19.3634f, 21.3634f, 19.7367f, 20.9389f, 20.0451f)
                curveTo(19.6246f, 21.0f, 17.7497f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2503f, 21.0f, 4.3754f, 21.0f, 3.0611f, 20.0451f)
                curveTo(2.6366f, 19.7367f, 2.2633f, 19.3634f, 1.9549f, 18.9389f)
                curveTo(1.0f, 17.6246f, 1.0f, 15.7497f, 1.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 3.0f)
                curveTo(12.75f, 2.5858f, 12.4142f, 2.25f, 12.0f, 2.25f)
                curveTo(11.5858f, 2.25f, 11.25f, 2.5858f, 11.25f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 9.75f)
                curveTo(7.5858f, 9.75f, 7.25f, 10.0858f, 7.25f, 10.5f)
                curveTo(7.25f, 10.9142f, 7.5858f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.25f, 16.75f, 10.9142f, 16.75f, 10.5f)
                curveTo(16.75f, 10.0858f, 16.4142f, 9.75f, 16.0f, 9.75f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.25f)
                curveTo(7.5858f, 13.25f, 7.25f, 13.5858f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.75f, 14.25f, 14.4142f, 14.25f, 14.0f)
                curveTo(14.25f, 13.5858f, 13.9142f, 13.25f, 13.5f, 13.25f)
                horizontalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _plate!!
    }

private var _plate: ImageVector? = null
