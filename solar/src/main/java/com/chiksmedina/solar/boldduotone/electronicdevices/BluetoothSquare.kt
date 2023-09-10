package com.chiksmedina.solar.boldduotone.electronicdevices

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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.BluetoothSquare: ImageVector
    get() {
        if (_bluetoothSquare != null) {
            return _bluetoothSquare!!
        }
        _bluetoothSquare = Builder(
            name = "BluetoothSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.448f, 16.7737f)
                lineTo(12.4469f, 16.7706f)
                curveTo(12.4477f, 16.7735f, 12.4483f, 16.7748f, 12.4483f, 16.7748f)
                lineTo(12.448f, 16.7737f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.7884f, 6.1961f)
                curveTo(13.0413f, 6.3311f, 13.3347f, 6.5473f, 13.6423f, 6.7741f)
                lineTo(15.0204f, 7.7895f)
                curveTo(15.2311f, 7.9447f, 15.4485f, 8.1047f, 15.6067f, 8.261f)
                curveTo(15.786f, 8.4382f, 16.0f, 8.716f, 16.0f, 9.1128f)
                curveTo(16.0f, 9.5097f, 15.786f, 9.7874f, 15.6067f, 9.9646f)
                curveTo(15.4485f, 10.1209f, 15.2311f, 10.281f, 15.0204f, 10.4361f)
                lineTo(12.898f, 12.0f)
                lineTo(15.0204f, 13.5639f)
                curveTo(15.2311f, 13.719f, 15.4485f, 13.8791f, 15.6067f, 14.0354f)
                curveTo(15.786f, 14.2126f, 16.0f, 14.4903f, 16.0f, 14.8872f)
                curveTo(16.0f, 15.284f, 15.786f, 15.5618f, 15.6067f, 15.739f)
                curveTo(15.4485f, 15.8953f, 15.2311f, 16.0553f, 15.0204f, 16.2105f)
                lineTo(13.6423f, 17.2259f)
                curveTo(13.3347f, 17.4527f, 13.0413f, 17.6689f, 12.7884f, 17.8039f)
                curveTo(12.5296f, 17.9421f, 12.087f, 18.1195f, 11.6157f, 17.8879f)
                curveTo(11.1443f, 17.6564f, 11.0232f, 17.2022f, 10.9804f, 16.9158f)
                curveTo(10.9386f, 16.6361f, 10.9387f, 16.2757f, 10.9388f, 15.8979f)
                lineTo(10.9388f, 13.5411f)
                lineTo(9.2051f, 14.9605f)
                curveTo(8.8933f, 15.2157f, 8.4301f, 15.1743f, 8.1703f, 14.8681f)
                curveTo(7.9105f, 14.5618f, 7.9527f, 14.1067f, 8.2644f, 13.8515f)
                lineTo(10.5259f, 12.0f)
                lineTo(8.2644f, 10.1485f)
                curveTo(7.9527f, 9.8933f, 7.9105f, 9.4382f, 8.1703f, 9.132f)
                curveTo(8.4301f, 8.8257f, 8.8933f, 8.7843f, 9.2051f, 9.0395f)
                lineTo(10.9388f, 10.4589f)
                lineTo(10.9388f, 8.1021f)
                curveTo(10.9387f, 7.7243f, 10.9386f, 7.3639f, 10.9804f, 7.0842f)
                curveTo(11.0232f, 6.7978f, 11.1443f, 6.3436f, 11.6157f, 6.1121f)
                curveTo(12.087f, 5.8805f, 12.5296f, 6.0579f, 12.7884f, 6.1961f)
                close()
                moveTo(12.4082f, 15.8496f)
                verticalLineTo(13.4436f)
                lineTo(14.1061f, 14.6947f)
                curveTo(14.2085f, 14.7701f, 14.2926f, 14.8321f, 14.3646f, 14.8872f)
                curveTo(14.2926f, 14.9422f, 14.2085f, 15.0042f, 14.1061f, 15.0796f)
                lineTo(12.8f, 16.042f)
                curveTo(12.6437f, 16.1572f, 12.5166f, 16.2504f, 12.4109f, 16.3254f)
                curveTo(12.4085f, 16.1973f, 12.4082f, 16.0415f, 12.4082f, 15.8496f)
                close()
                moveTo(12.448f, 16.7737f)
                lineTo(12.4469f, 16.7706f)
                curveTo(12.4477f, 16.7735f, 12.4483f, 16.7748f, 12.4483f, 16.7748f)
                lineTo(12.448f, 16.7737f)
                close()
                moveTo(12.4082f, 8.1504f)
                verticalLineTo(10.5564f)
                lineTo(14.1061f, 9.3053f)
                curveTo(14.2085f, 9.2299f, 14.2926f, 9.1679f, 14.3646f, 9.1128f)
                curveTo(14.2926f, 9.0578f, 14.2085f, 8.9958f, 14.1061f, 8.9204f)
                lineTo(12.8f, 7.958f)
                curveTo(12.6437f, 7.8428f, 12.5166f, 7.7496f, 12.4109f, 7.6746f)
                curveTo(12.4085f, 7.8027f, 12.4082f, 7.9585f, 12.4082f, 8.1504f)
                close()
            }
        }
            .build()
        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
