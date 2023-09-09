package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.BluetoothCircle: ImageVector
    get() {
        if (_bluetoothCircle != null) {
            return _bluetoothCircle!!
        }
        _bluetoothCircle = Builder(name = "BluetoothCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(13.1549f, 6.1177f)
                curveTo(13.1687f, 6.128f, 13.1825f, 6.1384f, 13.1963f, 6.1488f)
                lineTo(14.6509f, 7.2429f)
                curveTo(14.6624f, 7.2516f, 14.6739f, 7.2602f, 14.6854f, 7.2689f)
                curveTo(14.9218f, 7.4466f, 15.1601f, 7.6258f, 15.3326f, 7.7998f)
                curveTo(15.5269f, 7.9957f, 15.75f, 8.2943f, 15.75f, 8.7176f)
                curveTo(15.75f, 9.1409f, 15.5269f, 9.4395f, 15.3326f, 9.6354f)
                curveTo(15.1601f, 9.8094f, 14.9218f, 9.9886f, 14.6854f, 10.1663f)
                curveTo(14.6739f, 10.1749f, 14.6624f, 10.1836f, 14.6509f, 10.1923f)
                lineTo(12.2476f, 12.0f)
                lineTo(14.6509f, 13.8077f)
                curveTo(14.6624f, 13.8164f, 14.6739f, 13.8251f, 14.6854f, 13.8337f)
                curveTo(14.9218f, 14.0114f, 15.1601f, 14.1906f, 15.3326f, 14.3646f)
                curveTo(15.5269f, 14.5605f, 15.75f, 14.8591f, 15.75f, 15.2824f)
                curveTo(15.75f, 15.7057f, 15.5269f, 16.0043f, 15.3326f, 16.2002f)
                curveTo(15.1601f, 16.3742f, 14.9218f, 16.5534f, 14.6854f, 16.7311f)
                curveTo(14.6739f, 16.7398f, 14.6624f, 16.7484f, 14.6509f, 16.7571f)
                lineTo(13.1963f, 17.8512f)
                curveTo(13.1825f, 17.8616f, 13.1687f, 17.872f, 13.155f, 17.8823f)
                curveTo(12.8101f, 18.1418f, 12.487f, 18.385f, 12.2099f, 18.536f)
                curveTo(11.9267f, 18.6904f, 11.4599f, 18.8784f, 10.9653f, 18.6304f)
                curveTo(10.4717f, 18.3829f, 10.3423f, 17.8972f, 10.2956f, 17.5782f)
                curveTo(10.2499f, 17.2656f, 10.2499f, 16.8608f, 10.25f, 16.4282f)
                curveTo(10.25f, 16.411f, 10.25f, 16.3938f, 10.25f, 16.3766f)
                verticalLineTo(13.6013f)
                lineTo(8.4801f, 15.0762f)
                curveTo(8.1619f, 15.3413f, 7.689f, 15.2983f, 7.4238f, 14.9801f)
                curveTo(7.1587f, 14.6619f, 7.2017f, 14.189f, 7.5199f, 13.9238f)
                lineTo(9.8285f, 12.0f)
                lineTo(7.5199f, 10.0762f)
                curveTo(7.2017f, 9.811f, 7.1587f, 9.3381f, 7.4238f, 9.0199f)
                curveTo(7.689f, 8.7016f, 8.1619f, 8.6587f, 8.4801f, 8.9238f)
                lineTo(10.25f, 10.3987f)
                verticalLineTo(7.6234f)
                curveTo(10.25f, 7.6062f, 10.25f, 7.589f, 10.25f, 7.5718f)
                curveTo(10.2499f, 7.1392f, 10.2499f, 6.7344f, 10.2956f, 6.4218f)
                curveTo(10.3423f, 6.1028f, 10.4717f, 5.6171f, 10.9653f, 5.3696f)
                curveTo(11.4599f, 5.1216f, 11.9267f, 5.3096f, 12.2099f, 5.464f)
                curveTo(12.487f, 5.615f, 12.8101f, 5.8582f, 13.1549f, 6.1177f)
                close()
                moveTo(11.75f, 13.5027f)
                verticalLineTo(16.3766f)
                curveTo(11.75f, 16.6625f, 11.7506f, 16.8801f, 11.7563f, 17.0496f)
                curveTo(11.8944f, 16.9528f, 12.0676f, 16.8232f, 12.2946f, 16.6525f)
                lineTo(13.7491f, 15.5584f)
                curveTo(13.8849f, 15.4563f, 13.9928f, 15.375f, 14.0833f, 15.3031f)
                curveTo(14.0922f, 15.296f, 14.1008f, 15.2891f, 14.1091f, 15.2824f)
                curveTo(14.1008f, 15.2757f, 14.0922f, 15.2688f, 14.0833f, 15.2617f)
                curveTo(13.9928f, 15.1898f, 13.8849f, 15.1086f, 13.7491f, 15.0065f)
                lineTo(11.75f, 13.5027f)
                close()
                moveTo(11.41f, 17.2576f)
                curveTo(11.41f, 17.2576f, 11.4115f, 17.2571f, 11.4142f, 17.2563f)
                curveTo(11.4113f, 17.2573f, 11.41f, 17.2577f, 11.41f, 17.2576f)
                close()
                moveTo(11.7969f, 17.4469f)
                curveTo(11.798f, 17.4496f, 11.7985f, 17.4511f, 11.7984f, 17.4512f)
                curveTo(11.7984f, 17.4512f, 11.7978f, 17.4499f, 11.7969f, 17.4469f)
                close()
                moveTo(11.75f, 10.4973f)
                verticalLineTo(7.6234f)
                curveTo(11.75f, 7.3375f, 11.7506f, 7.1199f, 11.7563f, 6.9504f)
                curveTo(11.8944f, 7.0472f, 12.0676f, 7.1768f, 12.2946f, 7.3475f)
                lineTo(13.7491f, 8.4416f)
                curveTo(13.8849f, 8.5437f, 13.9928f, 8.625f, 14.0833f, 8.6969f)
                curveTo(14.0922f, 8.704f, 14.1008f, 8.7109f, 14.1091f, 8.7176f)
                curveTo(14.1008f, 8.7243f, 14.0922f, 8.7311f, 14.0833f, 8.7382f)
                curveTo(13.9928f, 8.8102f, 13.8849f, 8.8914f, 13.7491f, 8.9935f)
                lineTo(11.75f, 10.4973f)
                close()
                moveTo(11.7984f, 6.5488f)
                curveTo(11.7985f, 6.5489f, 11.798f, 6.5504f, 11.7969f, 6.5531f)
                curveTo(11.7978f, 6.5501f, 11.7984f, 6.5488f, 11.7984f, 6.5488f)
                close()
                moveTo(11.4142f, 6.7437f)
                curveTo(11.4115f, 6.7429f, 11.41f, 6.7424f, 11.41f, 6.7424f)
                curveTo(11.41f, 6.7423f, 11.4113f, 6.7427f, 11.4142f, 6.7437f)
                close()
            }
        }
        .build()
        return _bluetoothCircle!!
    }

private var _bluetoothCircle: ImageVector? = null
