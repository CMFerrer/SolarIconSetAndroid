package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Laptop2: ImageVector
    get() {
        if (_laptop2 != null) {
            return _laptop2!!
        }
        _laptop2 = Builder(name = "Laptop2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(20.5f, 7.1716f, 20.5f, 5.7574f, 19.6213f, 4.8787f)
                curveTo(18.7426f, 4.0f, 17.3284f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(14.0f)
                moveTo(3.5f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(3.5f, 7.1716f, 3.5f, 5.7574f, 4.3787f, 4.8787f)
                curveTo(5.2574f, 4.0f, 6.6716f, 4.0f, 9.5f, 4.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 20.0f, 2.0f, 18.6569f, 2.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 15.4477f, 2.4477f, 15.0f, 3.0f, 15.0f)
                horizontalLineTo(7.3333f)
                curveTo(7.7661f, 15.0f, 8.1871f, 15.1404f, 8.5333f, 15.4f)
                lineTo(9.4667f, 16.1f)
                curveTo(9.8129f, 16.3596f, 10.2339f, 16.5f, 10.6667f, 16.5f)
                horizontalLineTo(13.3333f)
                curveTo(13.7661f, 16.5f, 14.1871f, 16.3596f, 14.5333f, 16.1f)
                lineTo(15.4667f, 15.4f)
                curveTo(15.8129f, 15.1404f, 16.2339f, 15.0f, 16.6667f, 15.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 15.0f, 22.0f, 15.4477f, 22.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.6569f, 20.6569f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(16.0f)
            }
        }
        .build()
        return _laptop2!!
    }

private var _laptop2: ImageVector? = null
