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

public val ElectronicDevicesGroup.BluetoothWave: ImageVector
    get() {
        if (_bluetoothWave != null) {
            return _bluetoothWave!!
        }
        _bluetoothWave = Builder(name = "BluetoothWave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2633f, 8.2624f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(5.2246f)
                curveTo(8.0f, 3.3382f, 8.0f, 2.395f, 8.6046f, 2.0856f)
                curveTo(9.2093f, 1.7763f, 9.9813f, 2.3245f, 11.5253f, 3.4209f)
                lineTo(13.2633f, 4.6551f)
                curveTo(14.4211f, 5.4773f, 15.0f, 5.8884f, 15.0f, 6.4587f)
                curveTo(15.0f, 7.0291f, 14.4211f, 7.4402f, 13.2633f, 8.2624f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2633f, 19.3449f)
                lineTo(11.5253f, 20.5791f)
                curveTo(9.9813f, 21.6755f, 9.2093f, 22.2238f, 8.6046f, 21.9144f)
                curveTo(8.0f, 21.605f, 8.0f, 20.6618f, 8.0f, 18.7754f)
                verticalLineTo(12.0f)
                lineTo(13.2633f, 15.7376f)
                curveTo(14.4211f, 16.5598f, 15.0f, 16.9709f, 15.0f, 17.5413f)
                curveTo(15.0f, 18.1116f, 14.4211f, 18.5227f, 13.2633f, 19.3449f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5699f, 14.8856f)
                curveTo(2.2306f, 15.1231f, 2.148f, 15.5908f, 2.3856f, 15.9301f)
                curveTo(2.6231f, 16.2694f, 3.0908f, 16.352f, 3.4301f, 16.1144f)
                lineTo(2.5699f, 14.8856f)
                close()
                moveTo(3.4301f, 16.1144f)
                lineTo(8.4301f, 12.6144f)
                lineTo(7.5699f, 11.3856f)
                lineTo(2.5699f, 14.8856f)
                lineTo(3.4301f, 16.1144f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5699f, 9.1144f)
                curveTo(2.2306f, 8.8769f, 2.148f, 8.4092f, 2.3856f, 8.0699f)
                curveTo(2.6231f, 7.7306f, 3.0908f, 7.648f, 3.4301f, 7.8856f)
                lineTo(2.5699f, 9.1144f)
                close()
                moveTo(3.4301f, 7.8856f)
                lineTo(8.4301f, 11.3856f)
                lineTo(7.5699f, 12.6144f)
                lineTo(2.5699f, 9.1144f)
                lineTo(3.4301f, 7.8856f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                curveTo(19.0f, 5.0f, 21.0f, 7.1f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9f, 19.0f, 19.0f, 19.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                curveTo(17.0f, 8.0f, 18.0f, 9.9f, 18.0f, 12.0f)
                curveTo(18.0f, 14.1f, 17.0f, 16.0f, 17.0f, 16.0f)
            }
        }
        .build()
        return _bluetoothWave!!
    }

private var _bluetoothWave: ImageVector? = null
