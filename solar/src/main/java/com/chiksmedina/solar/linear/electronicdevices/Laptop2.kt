package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Laptop2: ImageVector
    get() {
        if (_laptop2 != null) {
            return _laptop2!!
        }
        _laptop2 = Builder(name = "Laptop2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(20.5f, 7.1716f, 20.5f, 5.7574f, 19.6213f, 4.8787f)
                curveTo(18.7426f, 4.0f, 17.3284f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(6.6716f, 4.0f, 5.2574f, 4.0f, 4.3787f, 4.8787f)
                curveTo(3.5f, 5.7574f, 3.5f, 7.1716f, 3.5f, 10.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 20.0f, 22.0f, 18.6569f, 22.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 15.4477f, 21.5523f, 15.0f, 21.0f, 15.0f)
                horizontalLineTo(16.6667f)
                curveTo(16.2339f, 15.0f, 15.8129f, 15.1404f, 15.4667f, 15.4f)
                lineTo(14.5333f, 16.1f)
                curveTo(14.1871f, 16.3596f, 13.7661f, 16.5f, 13.3333f, 16.5f)
                horizontalLineTo(10.6667f)
                curveTo(10.2339f, 16.5f, 9.8129f, 16.3596f, 9.4667f, 16.1f)
                lineTo(8.5333f, 15.4f)
                curveTo(8.1871f, 15.1404f, 7.7661f, 15.0f, 7.3333f, 15.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 15.0f, 2.0f, 15.4477f, 2.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.6569f, 3.3431f, 20.0f, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _laptop2!!
    }

private var _laptop2: ImageVector? = null
