package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsLeft: ImageVector
    get() {
        if (_airbudsLeft != null) {
            return _airbudsLeft!!
        }
        _airbudsLeft = Builder(
            name = "AirbudsLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.6667f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 19.6393f, 2.0f, 19.7089f, 2.0029f, 19.7678f)
                curveTo(2.0634f, 20.973f, 3.027f, 21.9366f, 4.2322f, 21.997f)
                curveTo(4.2911f, 22.0f, 4.3607f, 22.0f, 4.5f, 22.0f)
                curveTo(4.6393f, 22.0f, 4.7089f, 22.0f, 4.7678f, 21.997f)
                curveTo(5.973f, 21.9366f, 6.9366f, 20.973f, 6.997f, 19.7678f)
                curveTo(7.0f, 19.7089f, 7.0f, 19.6393f, 7.0f, 19.5f)
                verticalLineTo(18.6667f)
                moveTo(2.0f, 18.6667f)
                horizontalLineTo(7.0f)
                moveTo(2.0f, 18.6667f)
                lineTo(2.0029f, 13.0f)
                moveTo(7.0f, 18.6667f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                curveTo(9.6568f, 11.0f, 11.0f, 9.6568f, 11.0f, 8.0f)
                verticalLineTo(5.375f)
                lineTo(11.0f, 5.3356f)
                curveTo(10.9905f, 3.4974f, 9.5026f, 2.0095f, 7.6644f, 2.0f)
                lineTo(7.625f, 2.0f)
                lineTo(7.5594f, 2.0001f)
                curveTo(4.4956f, 2.0159f, 2.0159f, 4.4956f, 2.0001f, 7.5594f)
                lineTo(2.0f, 7.625f)
                lineTo(2.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.67647f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 5.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 11.0f)
                curveTo(12.4624f, 11.0f, 10.0f, 13.4624f, 10.0f, 16.5f)
                curveTo(10.0f, 19.5376f, 12.4624f, 22.0f, 15.5f, 22.0f)
                curveTo(18.5376f, 22.0f, 21.0f, 19.5376f, 21.0f, 16.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0009f, 5.1001f)
                curveTo(15.96f, 5.4978f, 17.5032f, 7.0409f, 17.9009f, 9.0001f)
            }
        }
            .build()
        return _airbudsLeft!!
    }

private var _airbudsLeft: ImageVector? = null
