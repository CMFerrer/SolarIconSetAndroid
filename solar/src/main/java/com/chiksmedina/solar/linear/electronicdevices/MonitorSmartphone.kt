package com.chiksmedina.solar.linear.electronicdevices

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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.MonitorSmartphone: ImageVector
    get() {
        if (_monitorSmartphone != null) {
            return _monitorSmartphone!!
        }
        _monitorSmartphone = Builder(name = "MonitorSmartphone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 17.0f, 3.7574f, 17.0f, 2.8787f, 16.1213f)
                curveTo(2.0f, 15.2426f, 2.0f, 13.8284f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(17.8346f, 2.0f, 19.0019f, 2.0f, 19.8856f, 2.4723f)
                curveTo(20.5833f, 2.8452f, 21.1548f, 3.4167f, 21.5277f, 4.1144f)
                curveTo(22.0f, 4.9981f, 22.0f, 6.1654f, 22.0f, 8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 13.1144f, 14.0f, 12.1716f, 14.5858f, 11.5858f)
                curveTo(15.1716f, 11.0f, 16.1144f, 11.0f, 18.0f, 11.0f)
                curveTo(19.8856f, 11.0f, 20.8284f, 11.0f, 21.4142f, 11.5858f)
                curveTo(22.0f, 12.1716f, 22.0f, 13.1144f, 22.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.8856f, 22.0f, 20.8284f, 21.4142f, 21.4142f)
                curveTo(20.8284f, 22.0f, 19.8856f, 22.0f, 18.0f, 22.0f)
                curveTo(16.1144f, 22.0f, 15.1716f, 22.0f, 14.5858f, 21.4142f)
                curveTo(14.0f, 20.8284f, 14.0f, 19.8856f, 14.0f, 18.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                horizontalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _monitorSmartphone!!
    }

private var _monitorSmartphone: ImageVector? = null
