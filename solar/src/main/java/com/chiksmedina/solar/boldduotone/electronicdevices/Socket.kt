package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Socket: ImageVector
    get() {
        if (_socket != null) {
            return _socket!!
        }
        _socket = Builder(name = "Socket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 7.4998f)
                verticalLineTo(6.803f)
                verticalLineTo(5.291f)
                curveTo(7.875f, 5.6641f, 5.25f, 8.5254f, 5.25f, 11.9998f)
                curveTo(5.25f, 15.4742f, 7.875f, 18.3355f, 11.25f, 18.7086f)
                verticalLineTo(17.1967f)
                verticalLineTo(16.4998f)
                curveTo(11.25f, 16.0855f, 11.5858f, 15.7498f, 12.0f, 15.7498f)
                curveTo(12.4142f, 15.7498f, 12.75f, 16.0855f, 12.75f, 16.4998f)
                verticalLineTo(17.1967f)
                verticalLineTo(18.7086f)
                curveTo(16.125f, 18.3355f, 18.75f, 15.4742f, 18.75f, 11.9998f)
                curveTo(18.75f, 8.5254f, 16.125f, 5.6641f, 12.75f, 5.291f)
                verticalLineTo(6.803f)
                verticalLineTo(7.4998f)
                curveTo(12.75f, 7.914f, 12.4142f, 8.2498f, 12.0f, 8.2498f)
                curveTo(11.5858f, 8.2498f, 11.25f, 7.914f, 11.25f, 7.4998f)
                close()
                moveTo(15.0f, 11.9998f)
                curveTo(15.0f, 12.5521f, 14.5523f, 12.9998f, 14.0f, 12.9998f)
                curveTo(13.4477f, 12.9998f, 13.0f, 12.5521f, 13.0f, 11.9998f)
                curveTo(13.0f, 11.4475f, 13.4477f, 10.9998f, 14.0f, 10.9998f)
                curveTo(14.5523f, 10.9998f, 15.0f, 11.4475f, 15.0f, 11.9998f)
                close()
                moveTo(10.0f, 12.9998f)
                curveTo(10.5523f, 12.9998f, 11.0f, 12.5521f, 11.0f, 11.9998f)
                curveTo(11.0f, 11.4475f, 10.5523f, 10.9998f, 10.0f, 10.9998f)
                curveTo(9.4477f, 10.9998f, 9.0f, 11.4475f, 9.0f, 11.9998f)
                curveTo(9.0f, 12.5521f, 9.4477f, 12.9998f, 10.0f, 12.9998f)
                close()
            }
        }
        .build()
        return _socket!!
    }

private var _socket: ImageVector? = null
