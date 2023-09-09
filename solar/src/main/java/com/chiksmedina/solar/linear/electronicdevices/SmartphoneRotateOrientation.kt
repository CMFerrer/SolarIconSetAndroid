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

public val ElectronicDevicesGroup.SmartphoneRotateOrientation: ImageVector
    get() {
        if (_smartphoneRotateOrientation != null) {
            return _smartphoneRotateOrientation!!
        }
        _smartphoneRotateOrientation = Builder(name = "SmartphoneRotateOrientation", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 5.1716f, 2.0f, 3.7574f, 2.8787f, 2.8787f)
                curveTo(3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(11.8284f, 2.0f, 13.2426f, 2.0f, 14.1213f, 2.8787f)
                curveTo(15.0f, 3.7574f, 15.0f, 5.1716f, 15.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 18.8284f, 15.0f, 20.2426f, 14.1213f, 21.1213f)
                curveTo(13.2426f, 22.0f, 11.8284f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1213f)
                curveTo(2.0f, 20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 10.0063f)
                curveTo(19.3597f, 10.0333f, 20.414f, 10.1712f, 21.1213f, 10.8785f)
                curveTo(22.0f, 11.7572f, 22.0f, 13.1714f, 22.0f, 15.9998f)
                curveTo(22.0f, 18.8283f, 22.0f, 20.2425f, 21.1213f, 21.1212f)
                curveTo(20.414f, 21.8285f, 19.3597f, 21.9664f, 17.5f, 21.9933f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.5f)
                curveTo(10.0f, 18.3284f, 9.3284f, 19.0f, 8.5f, 19.0f)
                curveTo(7.6716f, 19.0f, 7.0f, 18.3284f, 7.0f, 17.5f)
                curveTo(7.0f, 16.6716f, 7.6716f, 16.0f, 8.5f, 16.0f)
                curveTo(9.3284f, 16.0f, 10.0f, 16.6716f, 10.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 6.986f)
                lineTo(22.0f, 8.0f)
                curveTo(22.0f, 4.9853f, 19.8377f, 2.4827f, 17.0f, 2.0f)
            }
        }
        .build()
        return _smartphoneRotateOrientation!!
    }

private var _smartphoneRotateOrientation: ImageVector? = null
