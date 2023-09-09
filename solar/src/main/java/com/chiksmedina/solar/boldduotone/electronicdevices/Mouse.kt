package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.9741f)
                verticalLineTo(14.986f)
                curveTo(19.0f, 18.8597f, 15.866f, 21.9999f, 12.0f, 21.9999f)
                curveTo(8.134f, 21.9999f, 5.0f, 18.8597f, 5.0f, 14.986f)
                verticalLineTo(8.9741f)
                curveTo(5.0f, 5.3543f, 7.7367f, 2.375f, 11.25f, 2.0f)
                verticalLineTo(5.3854f)
                curveTo(10.6588f, 5.6669f, 10.25f, 6.2707f, 10.25f, 6.9702f)
                verticalLineTo(8.9741f)
                curveTo(10.25f, 9.9426f, 11.0335f, 10.7276f, 12.0f, 10.7276f)
                curveTo(12.9665f, 10.7276f, 13.75f, 9.9426f, 13.75f, 8.9741f)
                verticalLineTo(6.9702f)
                curveTo(13.75f, 6.2707f, 13.3412f, 5.6669f, 12.75f, 5.3854f)
                verticalLineTo(2.0f)
                curveTo(16.2633f, 2.375f, 19.0f, 5.3543f, 19.0f, 8.9741f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 8.9739f)
                verticalLineTo(6.9699f)
                curveTo(13.75f, 6.2704f, 13.3412f, 5.6666f, 12.75f, 5.3851f)
                verticalLineTo(1.9997f)
                curveTo(12.5036f, 1.9734f, 12.2534f, 1.96f, 12.0f, 1.96f)
                curveTo(11.7466f, 1.96f, 11.4964f, 1.9734f, 11.25f, 1.9997f)
                verticalLineTo(5.3851f)
                curveTo(10.6588f, 5.6666f, 10.25f, 6.2704f, 10.25f, 6.9699f)
                verticalLineTo(8.9739f)
                curveTo(10.25f, 9.9423f, 11.0335f, 10.7273f, 12.0f, 10.7273f)
                curveTo(12.9665f, 10.7273f, 13.75f, 9.9423f, 13.75f, 8.9739f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
