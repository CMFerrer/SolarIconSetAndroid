package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.4142f, 17.2561f)
                curveTo(11.4113f, 17.2571f, 11.41f, 17.2574f, 11.41f, 17.2574f)
                lineTo(11.4142f, 17.2561f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7969f, 17.4467f)
                curveTo(11.798f, 17.4493f, 11.7984f, 17.4509f, 11.7984f, 17.4509f)
                lineTo(11.7969f, 17.4467f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7969f, 6.5528f)
                curveTo(11.798f, 6.5502f, 11.7984f, 6.5486f, 11.7984f, 6.5486f)
                lineTo(11.7978f, 6.5502f)
                lineTo(11.7969f, 6.5528f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.2099f, 5.4637f)
                curveTo(12.487f, 5.6148f, 12.8101f, 5.8579f, 13.155f, 6.1174f)
                lineTo(14.6854f, 7.2686f)
                curveTo(14.9218f, 7.4463f, 15.1601f, 7.6255f, 15.3326f, 7.7995f)
                curveTo(15.5269f, 7.9955f, 15.75f, 8.294f, 15.75f, 8.7173f)
                curveTo(15.75f, 9.1406f, 15.5269f, 9.4392f, 15.3326f, 9.6352f)
                curveTo(15.1601f, 9.8091f, 14.9218f, 9.9883f, 14.6854f, 10.166f)
                lineTo(12.2477f, 11.9997f)
                lineTo(14.6854f, 13.8335f)
                curveTo(14.9218f, 14.0112f, 15.1601f, 14.1904f, 15.3326f, 14.3643f)
                curveTo(15.5269f, 14.5603f, 15.75f, 14.8589f, 15.75f, 15.2822f)
                curveTo(15.75f, 15.7055f, 15.5269f, 16.004f, 15.3326f, 16.2f)
                curveTo(15.1601f, 16.374f, 14.9218f, 16.5532f, 14.6854f, 16.7309f)
                lineTo(13.155f, 17.8821f)
                curveTo(12.8101f, 18.1416f, 12.487f, 18.3847f, 12.2099f, 18.5357f)
                curveTo(11.9267f, 18.6901f, 11.4599f, 18.8782f, 10.9653f, 18.6302f)
                curveTo(10.4717f, 18.3826f, 10.3423f, 17.8969f, 10.2956f, 17.578f)
                curveTo(10.2499f, 17.2654f, 10.2499f, 16.8605f, 10.25f, 16.4279f)
                lineTo(10.25f, 13.601f)
                lineTo(8.4802f, 15.0759f)
                curveTo(8.162f, 15.3411f, 7.689f, 15.2981f, 7.4239f, 14.9799f)
                curveTo(7.1587f, 14.6617f, 7.2017f, 14.1888f, 7.5199f, 13.9236f)
                lineTo(9.8285f, 11.9997f)
                lineTo(7.5199f, 10.0759f)
                curveTo(7.2017f, 9.8107f, 7.1587f, 9.3378f, 7.4239f, 9.0196f)
                curveTo(7.689f, 8.7014f, 8.162f, 8.6584f, 8.4802f, 8.9236f)
                lineTo(10.25f, 10.3985f)
                lineTo(10.25f, 7.5716f)
                curveTo(10.2499f, 7.139f, 10.2499f, 6.7341f, 10.2956f, 6.4215f)
                curveTo(10.3423f, 6.1026f, 10.4717f, 5.6169f, 10.9653f, 5.3693f)
                curveTo(11.4599f, 5.1213f, 11.9267f, 5.3094f, 12.2099f, 5.4637f)
                close()
                moveTo(11.75f, 16.3763f)
                verticalLineTo(13.5024f)
                lineTo(13.7492f, 15.0062f)
                curveTo(13.8849f, 15.1083f, 13.9928f, 15.1895f, 14.0833f, 15.2615f)
                lineTo(14.1091f, 15.2822f)
                lineTo(14.0833f, 15.3028f)
                curveTo(13.9928f, 15.3748f, 13.8849f, 15.456f, 13.7492f, 15.5581f)
                lineTo(12.2946f, 16.6522f)
                curveTo(12.0676f, 16.823f, 11.8944f, 16.9525f, 11.7563f, 17.0494f)
                curveTo(11.7507f, 16.8799f, 11.75f, 16.6623f, 11.75f, 16.3763f)
                close()
                moveTo(11.4142f, 17.2561f)
                curveTo(11.4113f, 17.2571f, 11.41f, 17.2574f, 11.41f, 17.2574f)
                lineTo(11.4142f, 17.2561f)
                close()
                moveTo(11.7969f, 17.4467f)
                curveTo(11.798f, 17.4493f, 11.7984f, 17.4509f, 11.7984f, 17.4509f)
                lineTo(11.7969f, 17.4467f)
                close()
                moveTo(11.75f, 7.6232f)
                verticalLineTo(10.4971f)
                lineTo(13.7492f, 8.9933f)
                curveTo(13.8849f, 8.8912f, 13.9928f, 8.81f, 14.0833f, 8.738f)
                lineTo(14.1091f, 8.7173f)
                lineTo(14.0833f, 8.6967f)
                curveTo(13.9928f, 8.6247f, 13.8849f, 8.5435f, 13.7492f, 8.4414f)
                lineTo(12.2946f, 7.3472f)
                curveTo(12.0676f, 7.1765f, 11.8944f, 7.047f, 11.7563f, 6.9501f)
                curveTo(11.7507f, 7.1196f, 11.75f, 7.3372f, 11.75f, 7.6232f)
                close()
                moveTo(11.7969f, 6.5528f)
                curveTo(11.798f, 6.5502f, 11.7984f, 6.5486f, 11.7984f, 6.5486f)
                lineTo(11.7978f, 6.5502f)
                lineTo(11.7969f, 6.5528f)
                close()
            }
        }
            .build()
        return _bluetoothCircle!!
    }

private var _bluetoothCircle: ImageVector? = null
