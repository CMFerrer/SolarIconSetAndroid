package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsCaseCharge: ImageVector
    get() {
        if (_airbudsCaseCharge != null) {
            return _airbudsCaseCharge!!
        }
        _airbudsCaseCharge = Builder(
            name = "AirbudsCaseCharge", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 11.0f)
                curveTo(3.0f, 7.2503f, 3.0f, 5.3754f, 3.9549f, 4.0611f)
                curveTo(4.2633f, 3.6366f, 4.6366f, 3.2633f, 5.0611f, 2.9549f)
                curveTo(6.3754f, 2.0f, 8.2503f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7497f, 2.0f, 17.6246f, 2.0f, 18.9389f, 2.9549f)
                curveTo(19.3634f, 3.2633f, 19.7367f, 3.6366f, 20.0451f, 4.0611f)
                curveTo(21.0f, 5.3754f, 21.0f, 7.2503f, 21.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 16.7497f, 21.0f, 18.6246f, 20.0451f, 19.9389f)
                curveTo(19.7367f, 20.3634f, 19.3634f, 20.7367f, 18.9389f, 21.0451f)
                curveTo(17.6246f, 22.0f, 15.7497f, 22.0f, 12.0f, 22.0f)
                curveTo(8.2503f, 22.0f, 6.3754f, 22.0f, 5.0611f, 21.0451f)
                curveTo(4.6366f, 20.7367f, 4.2633f, 20.3634f, 3.9549f, 19.9389f)
                curveTo(3.0f, 18.6246f, 3.0f, 16.7497f, 3.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                lineTo(14.0f, 15.5001f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 9.0f)
                horizontalLineTo(17.0f)
            }
        }
            .build()
        return _airbudsCaseCharge!!
    }

private var _airbudsCaseCharge: ImageVector? = null
