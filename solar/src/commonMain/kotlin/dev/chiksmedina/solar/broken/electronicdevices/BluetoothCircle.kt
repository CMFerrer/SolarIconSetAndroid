package dev.chiksmedina.solar.broken.electronicdevices

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
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.2f, 9.5929f)
                lineTo(11.0f, 12.0f)
                verticalLineTo(7.6234f)
                curveTo(11.0f, 6.6686f, 11.0f, 6.1912f, 11.3015f, 6.04f)
                curveTo(11.603f, 5.8888f, 11.9838f, 6.1752f, 12.7455f, 6.7481f)
                lineTo(14.2f, 7.8423f)
                curveTo(14.7333f, 8.2435f, 15.0f, 8.444f, 15.0f, 8.7176f)
                curveTo(15.0f, 8.9911f, 14.7333f, 9.1917f, 14.2f, 9.5929f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.2f, 16.1577f)
                lineTo(12.7455f, 17.2519f)
                curveTo(11.9838f, 17.8248f, 11.603f, 18.1112f, 11.3015f, 17.96f)
                curveTo(11.0f, 17.8088f, 11.0f, 17.3314f, 11.0f, 16.3766f)
                verticalLineTo(12.0f)
                lineTo(14.2f, 14.4071f)
                curveTo(14.7333f, 14.8083f, 15.0f, 15.0089f, 15.0f, 15.2824f)
                curveTo(15.0f, 15.5559f, 14.7333f, 15.7565f, 14.2f, 16.1577f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4801f, 8.9238f)
                curveTo(8.1619f, 8.6587f, 7.689f, 8.7016f, 7.4238f, 9.0199f)
                curveTo(7.1587f, 9.3381f, 7.2017f, 9.811f, 7.5199f, 10.0762f)
                lineTo(8.4801f, 8.9238f)
                close()
                moveTo(11.4801f, 11.4238f)
                lineTo(8.4801f, 8.9238f)
                lineTo(7.5199f, 10.0762f)
                lineTo(10.5199f, 12.5762f)
                lineTo(11.4801f, 11.4238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4801f, 15.0762f)
                curveTo(8.1619f, 15.3413f, 7.689f, 15.2983f, 7.4238f, 14.9801f)
                curveTo(7.1587f, 14.6619f, 7.2017f, 14.189f, 7.5199f, 13.9238f)
                lineTo(8.4801f, 15.0762f)
                close()
                moveTo(11.4801f, 12.5762f)
                lineTo(8.4801f, 15.0762f)
                lineTo(7.5199f, 13.9238f)
                lineTo(10.5199f, 11.4238f)
                lineTo(11.4801f, 12.5762f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _bluetoothCircle!!
    }

private var _bluetoothCircle: ImageVector? = null
