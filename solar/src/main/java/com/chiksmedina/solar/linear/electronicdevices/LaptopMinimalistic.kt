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

public val ElectronicDevicesGroup.LaptopMinimalistic: ImageVector
    get() {
        if (_laptopMinimalistic != null) {
            return _laptopMinimalistic!!
        }
        _laptopMinimalistic = Builder(name = "LaptopMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                curveTo(3.0f, 6.1716f, 3.0f, 4.7574f, 3.8787f, 3.8787f)
                curveTo(4.7574f, 3.0f, 6.1716f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 3.0f, 19.2426f, 3.0f, 20.1213f, 3.8787f)
                curveTo(21.0f, 4.7574f, 21.0f, 6.1716f, 21.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 15.8856f, 21.0f, 16.8284f, 20.4142f, 17.4142f)
                curveTo(19.8284f, 18.0f, 18.8856f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.1144f, 18.0f, 4.1716f, 18.0f, 3.5858f, 17.4142f)
                curveTo(3.0f, 16.8284f, 3.0f, 15.8856f, 3.0f, 14.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(9.0f)
            }
        }
        .build()
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: ImageVector? = null
