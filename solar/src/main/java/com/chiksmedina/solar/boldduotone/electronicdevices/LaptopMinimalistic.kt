package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                curveTo(1.0f, 19.8202f, 1.3436f, 19.48f, 1.7674f, 19.48f)
                horizontalLineTo(22.2326f)
                curveTo(22.6564f, 19.48f, 23.0f, 19.8202f, 23.0f, 20.24f)
                curveTo(23.0f, 20.6597f, 22.6564f, 21.0f, 22.2326f, 21.0f)
                horizontalLineTo(1.7674f)
                curveTo(1.3436f, 21.0f, 1.0f, 20.6597f, 1.0f, 20.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6901f, 3.8904f)
                curveTo(2.791f, 4.7808f, 2.791f, 6.2139f, 2.791f, 9.08f)
                verticalLineTo(14.1467f)
                curveTo(2.791f, 16.0574f, 2.791f, 17.0128f, 3.3904f, 17.6064f)
                curveTo(3.9898f, 18.2f, 4.9546f, 18.2f, 6.884f, 18.2f)
                horizontalLineTo(17.1166f)
                curveTo(19.0461f, 18.2f, 20.0108f, 18.2f, 20.6102f, 17.6064f)
                curveTo(21.2096f, 17.0128f, 21.2096f, 16.0574f, 21.2096f, 14.1467f)
                verticalLineTo(9.08f)
                curveTo(21.2096f, 6.2139f, 21.2096f, 4.7808f, 20.3105f, 3.8904f)
                curveTo(19.4114f, 3.0f, 17.9643f, 3.0f, 15.0701f, 3.0f)
                horizontalLineTo(8.9305f)
                curveTo(6.0363f, 3.0f, 4.5892f, 3.0f, 3.6901f, 3.8904f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9305f, 14.4004f)
                curveTo(8.5067f, 14.4004f, 8.1631f, 14.7407f, 8.1631f, 15.1604f)
                curveTo(8.1631f, 15.5801f, 8.5067f, 15.9204f, 8.9305f, 15.9204f)
                horizontalLineTo(15.0701f)
                curveTo(15.4939f, 15.9204f, 15.8375f, 15.5801f, 15.8375f, 15.1604f)
                curveTo(15.8375f, 14.7407f, 15.4939f, 14.4004f, 15.0701f, 14.4004f)
                horizontalLineTo(8.9305f)
                close()
            }
        }
        .build()
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: ImageVector? = null
