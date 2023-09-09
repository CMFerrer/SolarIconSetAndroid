package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.LaptopMinimalistic: ImageVector
    get() {
        if (_laptopMinimalistic != null) {
            return _laptopMinimalistic!!
        }
        _laptopMinimalistic = Builder(name = "LaptopMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 20.24f)
                curveTo(1.0f, 19.8203f, 1.3436f, 19.48f, 1.7674f, 19.48f)
                horizontalLineTo(22.2326f)
                curveTo(22.6564f, 19.48f, 23.0f, 19.8203f, 23.0f, 20.24f)
                curveTo(23.0f, 20.6597f, 22.6564f, 21.0f, 22.2326f, 21.0f)
                horizontalLineTo(1.7674f)
                curveTo(1.3436f, 21.0f, 1.0f, 20.6597f, 1.0f, 20.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.6898f, 3.8904f)
                curveTo(2.7907f, 4.7808f, 2.7907f, 6.2139f, 2.7907f, 9.08f)
                verticalLineTo(14.1467f)
                curveTo(2.7907f, 16.0574f, 2.7907f, 17.0128f, 3.3901f, 17.6064f)
                curveTo(3.9895f, 18.2f, 4.9542f, 18.2f, 6.8837f, 18.2f)
                horizontalLineTo(17.1163f)
                curveTo(19.0457f, 18.2f, 20.0105f, 18.2f, 20.6099f, 17.6064f)
                curveTo(21.2093f, 17.0128f, 21.2093f, 16.0574f, 21.2093f, 14.1467f)
                verticalLineTo(9.08f)
                curveTo(21.2093f, 6.2139f, 21.2093f, 4.7808f, 20.3102f, 3.8904f)
                curveTo(19.4111f, 3.0f, 17.964f, 3.0f, 15.0698f, 3.0f)
                horizontalLineTo(8.9302f)
                curveTo(6.036f, 3.0f, 4.5889f, 3.0f, 3.6898f, 3.8904f)
                close()
                moveTo(8.1628f, 15.16f)
                curveTo(8.1628f, 14.7403f, 8.5064f, 14.4f, 8.9302f, 14.4f)
                horizontalLineTo(15.0698f)
                curveTo(15.4936f, 14.4f, 15.8372f, 14.7403f, 15.8372f, 15.16f)
                curveTo(15.8372f, 15.5797f, 15.4936f, 15.92f, 15.0698f, 15.92f)
                horizontalLineTo(8.9302f)
                curveTo(8.5064f, 15.92f, 8.1628f, 15.5797f, 8.1628f, 15.16f)
                close()
            }
        }
        .build()
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: ImageVector? = null
