package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

public val ElectronicDevicesGroup.WirelessCharge: ImageVector
    get() {
        if (_wirelessCharge != null) {
            return _wirelessCharge!!
        }
        _wirelessCharge = Builder(name = "WirelessCharge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8569f, 7.0f)
                lineTo(9.9997f, 10.0f)
                horizontalLineTo(13.9997f)
                lineTo(11.1426f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5815f, 7.0f)
                curveTo(4.2065f, 7.9264f, 4.0f, 8.9391f, 4.0f, 10.0f)
                curveTo(4.0f, 14.4183f, 7.5817f, 18.0f, 12.0f, 18.0f)
                curveTo(16.4183f, 18.0f, 20.0f, 14.4183f, 20.0f, 10.0f)
                curveTo(20.0f, 5.5817f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(10.9391f, 2.0f, 9.9264f, 2.2065f, 9.0f, 2.5815f)
            }
        }
        .build()
        return _wirelessCharge!!
    }

private var _wirelessCharge: ImageVector? = null
