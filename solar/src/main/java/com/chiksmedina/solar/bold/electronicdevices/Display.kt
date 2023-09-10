package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(
            name = "Display", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.7599f)
                curveTo(2.0f, 6.0447f, 2.0f, 4.687f, 2.8787f, 3.8435f)
                curveTo(3.7574f, 3.0f, 5.1716f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 3.0f, 20.2426f, 3.0f, 21.1213f, 3.8435f)
                curveTo(22.0f, 4.687f, 22.0f, 6.0447f, 22.0f, 8.7599f)
                verticalLineTo(9.7199f)
                curveTo(22.0f, 12.4352f, 22.0f, 13.7928f, 21.1213f, 14.6363f)
                curveTo(20.2426f, 15.4799f, 18.8284f, 15.4799f, 16.0f, 15.4799f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.8409f)
                lineTo(18.2372f, 19.5968f)
                curveTo(18.6301f, 19.7225f, 18.8425f, 20.1303f, 18.7115f, 20.5075f)
                curveTo(18.5805f, 20.8847f, 18.1558f, 21.0886f, 17.7628f, 20.9629f)
                lineTo(12.0f, 19.1188f)
                lineTo(6.2372f, 20.9629f)
                curveTo(5.8442f, 21.0886f, 5.4195f, 20.8847f, 5.2885f, 20.5075f)
                curveTo(5.1575f, 20.1303f, 5.3699f, 19.7225f, 5.7628f, 19.5968f)
                lineTo(11.25f, 17.8409f)
                verticalLineTo(15.4799f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 15.4799f, 3.7574f, 15.4799f, 2.8787f, 14.6363f)
                curveTo(2.0f, 13.7928f, 2.0f, 12.4352f, 2.0f, 9.7199f)
                verticalLineTo(8.7599f)
                close()
            }
        }
            .build()
        return _display!!
    }

private var _display: ImageVector? = null
