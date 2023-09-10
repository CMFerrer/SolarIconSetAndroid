package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.9549f, 4.0611f)
                curveTo(3.0f, 5.3754f, 3.0f, 7.2503f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 16.7497f, 3.0f, 18.6246f, 3.9549f, 19.9389f)
                curveTo(4.2633f, 20.3634f, 4.6366f, 20.7367f, 5.0611f, 21.0451f)
                curveTo(6.3754f, 22.0f, 8.2503f, 22.0f, 12.0f, 22.0f)
                curveTo(15.7497f, 22.0f, 17.6246f, 22.0f, 18.9389f, 21.0451f)
                curveTo(19.3634f, 20.7367f, 19.7367f, 20.3634f, 20.0451f, 19.9389f)
                curveTo(21.0f, 18.6246f, 21.0f, 16.7497f, 21.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 7.2503f, 21.0f, 5.3754f, 20.0451f, 4.0611f)
                curveTo(19.7367f, 3.6366f, 19.3634f, 3.2633f, 18.9389f, 2.9549f)
                curveTo(17.6246f, 2.0f, 15.7497f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2503f, 2.0f, 6.3754f, 2.0f, 5.0611f, 2.9549f)
                curveTo(4.6366f, 3.2633f, 4.2633f, 3.6366f, 3.9549f, 4.0611f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.25f)
                curveTo(6.5858f, 8.25f, 6.25f, 8.5858f, 6.25f, 9.0f)
                curveTo(6.25f, 9.4142f, 6.5858f, 9.75f, 7.0f, 9.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 9.75f, 17.75f, 9.4142f, 17.75f, 9.0f)
                curveTo(17.75f, 8.5858f, 17.4142f, 8.25f, 17.0f, 8.25f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5857f, 13.4685f)
                curveTo(12.8444f, 13.1451f, 12.792f, 12.6731f, 12.4685f, 12.4143f)
                curveTo(12.1451f, 12.1556f, 11.6731f, 12.208f, 11.4143f, 12.5315f)
                lineTo(9.4143f, 15.0316f)
                curveTo(9.2342f, 15.2567f, 9.1991f, 15.5652f, 9.324f, 15.825f)
                curveTo(9.4489f, 16.0848f, 9.7117f, 16.2501f, 10.0f, 16.2501f)
                horizontalLineTo(12.4395f)
                lineTo(11.4144f, 17.5315f)
                curveTo(11.1556f, 17.8549f, 11.208f, 18.3269f, 11.5315f, 18.5856f)
                curveTo(11.8549f, 18.8444f, 12.3269f, 18.792f, 12.5856f, 18.4685f)
                lineTo(14.5856f, 15.9686f)
                curveTo(14.7658f, 15.7435f, 14.8009f, 15.4351f, 14.676f, 15.1752f)
                curveTo(14.5511f, 14.9154f, 14.2883f, 14.7501f, 14.0f, 14.7501f)
                horizontalLineTo(11.5604f)
                lineTo(12.5857f, 13.4685f)
                close()
            }
        }
            .build()
        return _airbudsCaseCharge!!
    }

private var _airbudsCaseCharge: ImageVector? = null
