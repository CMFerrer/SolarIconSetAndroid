package dev.chiksmedina.solar.linear.electronicdevices

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
import dev.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.WirelessCharge: ImageVector
    get() {
        if (_wirelessCharge != null) {
            return _wirelessCharge!!
        }
        _wirelessCharge = Builder(
            name = "WirelessCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0646f, 17.9997f)
                curveTo(16.4827f, 18.0354f, 20.0354f, 14.4827f, 19.9997f, 10.0646f)
                curveTo(19.9641f, 5.6464f, 16.3536f, 2.0359f, 11.9354f, 2.0003f)
                curveTo(7.5173f, 1.9646f, 3.9646f, 5.5173f, 4.0003f, 9.9354f)
                curveTo(4.0359f, 14.3536f, 7.6464f, 17.9641f, 12.0646f, 17.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.8569f, 7.0f)
                lineTo(9.9997f, 10.0f)
                horizontalLineTo(13.9997f)
                lineTo(11.1426f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 18.0f)
                verticalLineTo(19.5f)
                curveTo(13.5f, 19.9659f, 13.5f, 20.1989f, 13.4239f, 20.3827f)
                curveTo(13.3224f, 20.6277f, 13.1277f, 20.8224f, 12.8827f, 20.9239f)
                curveTo(12.6989f, 21.0f, 12.4659f, 21.0f, 12.0f, 21.0f)
                curveTo(11.5341f, 21.0f, 11.3011f, 21.0f, 11.1173f, 20.9239f)
                curveTo(10.8723f, 20.8224f, 10.6776f, 20.6277f, 10.5761f, 20.3827f)
                curveTo(10.5f, 20.1989f, 10.5f, 19.9659f, 10.5f, 19.5f)
                verticalLineTo(18.0f)
            }
        }
            .build()
        return _wirelessCharge!!
    }

private var _wirelessCharge: ImageVector? = null
