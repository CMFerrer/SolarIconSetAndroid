package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.BluetoothCircle: ImageVector
    get() {
        if (_bluetoothCircle != null) {
            return _bluetoothCircle!!
        }
        _bluetoothCircle = Builder(
            name = "BluetoothCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 12.0f)
                lineTo(14.2f, 9.5929f)
                curveTo(14.7333f, 9.1917f, 15.0f, 8.9911f, 15.0f, 8.7176f)
                curveTo(15.0f, 8.444f, 14.7333f, 8.2435f, 14.2f, 7.8423f)
                lineTo(12.7455f, 6.7481f)
                curveTo(11.9838f, 6.1752f, 11.603f, 5.8888f, 11.3015f, 6.04f)
                curveTo(11.0f, 6.1912f, 11.0f, 6.6686f, 11.0f, 7.6234f)
                verticalLineTo(12.0f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineTo(16.3766f)
                curveTo(11.0f, 17.3314f, 11.0f, 17.8088f, 11.3015f, 17.96f)
                curveTo(11.603f, 18.1112f, 11.9838f, 17.8248f, 12.7455f, 17.2519f)
                lineTo(14.2f, 16.1577f)
                curveTo(14.7333f, 15.7565f, 15.0f, 15.5559f, 15.0f, 15.2824f)
                curveTo(15.0f, 15.0089f, 14.7333f, 14.8083f, 14.2f, 14.4071f)
                lineTo(11.0f, 12.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(8.0f, 9.5f)
                moveTo(11.0f, 12.0f)
                lineTo(8.0f, 14.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
        }
            .build()
        return _bluetoothCircle!!
    }

private var _bluetoothCircle: ImageVector? = null
