package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsRight: ImageVector
    get() {
        if (_airbudsRight != null) {
            return _airbudsRight!!
        }
        _airbudsRight = Builder(
            name = "AirbudsRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 18.6667f)
                verticalLineTo(19.5f)
                curveTo(21.0f, 19.6393f, 21.0f, 19.7089f, 20.997f, 19.7678f)
                curveTo(20.9366f, 20.973f, 19.973f, 21.9366f, 18.7678f, 21.997f)
                curveTo(18.7089f, 22.0f, 18.6393f, 22.0f, 18.5f, 22.0f)
                curveTo(18.3607f, 22.0f, 18.2911f, 22.0f, 18.2322f, 21.997f)
                curveTo(17.027f, 21.9366f, 16.0634f, 20.973f, 16.003f, 19.7678f)
                curveTo(16.0f, 19.7089f, 16.0f, 19.6393f, 16.0f, 19.5f)
                verticalLineTo(18.6667f)
                moveTo(21.0f, 18.6667f)
                horizontalLineTo(16.0f)
                moveTo(21.0f, 18.6667f)
                lineTo(20.997f, 13.0f)
                moveTo(16.0f, 18.6667f)
                verticalLineTo(12.0f)
                curveTo(16.0f, 11.4477f, 15.5523f, 11.0f, 15.0f, 11.0f)
                curveTo(13.3431f, 11.0f, 12.0f, 9.6568f, 12.0f, 8.0f)
                verticalLineTo(5.375f)
                lineTo(12.0f, 5.3356f)
                curveTo(12.0095f, 3.4974f, 13.4974f, 2.0095f, 15.3356f, 2.0f)
                lineTo(15.375f, 2.0f)
                lineTo(15.4406f, 2.0001f)
                curveTo(18.5044f, 2.0159f, 20.9841f, 4.4956f, 20.9999f, 7.5594f)
                lineTo(21.0f, 7.625f)
                lineTo(21.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.67647f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 5.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 22.0f)
                curveTo(10.5376f, 22.0f, 13.0f, 19.5376f, 13.0f, 16.5f)
                curveTo(13.0f, 13.4624f, 10.5376f, 11.0f, 7.5f, 11.0f)
                curveTo(4.4624f, 11.0f, 2.0f, 13.4624f, 2.0f, 16.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0001f, 5.1001f)
                curveTo(7.0409f, 5.4978f, 5.4978f, 7.0409f, 5.1001f, 9.0001f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 14.0f)
                verticalLineTo(13.25f)
                curveTo(5.5858f, 13.25f, 5.25f, 13.5858f, 5.25f, 14.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.25f, 19.0f)
                curveTo(5.25f, 19.4142f, 5.5858f, 19.75f, 6.0f, 19.75f)
                curveTo(6.4142f, 19.75f, 6.75f, 19.4142f, 6.75f, 19.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.0f, 16.5f)
                horizontalLineTo(5.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(8.3569f, 19.3859f)
                curveTo(8.57f, 19.7411f, 9.0307f, 19.8562f, 9.3859f, 19.6431f)
                curveTo(9.7411f, 19.43f, 9.8562f, 18.9693f, 9.6431f, 18.6141f)
                lineTo(8.3569f, 19.3859f)
                close()
                moveTo(6.0f, 14.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.25f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.75f)
                close()
                moveTo(6.75f, 16.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(8.25f, 15.25f)
                curveTo(8.25f, 15.4039f, 8.0481f, 15.75f, 7.5f, 15.75f)
                verticalLineTo(17.25f)
                curveTo(8.6088f, 17.25f, 9.75f, 16.4768f, 9.75f, 15.25f)
                horizontalLineTo(8.25f)
                close()
                moveTo(7.5f, 14.75f)
                curveTo(8.0481f, 14.75f, 8.25f, 15.0961f, 8.25f, 15.25f)
                horizontalLineTo(9.75f)
                curveTo(9.75f, 14.0232f, 8.6088f, 13.25f, 7.5f, 13.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(5.25f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(7.5f, 15.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.75f)
                close()
                moveTo(6.8569f, 16.8859f)
                lineTo(8.3569f, 19.3859f)
                lineTo(9.6431f, 18.6141f)
                lineTo(8.1431f, 16.1141f)
                lineTo(6.8569f, 16.8859f)
                close()
            }
        }
            .build()
        return _airbudsRight!!
    }

private var _airbudsRight: ImageVector? = null
