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

val ElectronicDevicesGroup.BluetoothWave: ImageVector
    get() {
        if (_bluetoothWave != null) {
            return _bluetoothWave!!
        }
        _bluetoothWave = Builder(
            name = "BluetoothWave", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9098f, 2.7741f)
                lineTo(13.7426f, 4.0757f)
                curveTo(14.2829f, 4.4593f, 14.7547f, 4.7943f, 15.0842f, 5.1095f)
                curveTo(15.435f, 5.4449f, 15.75f, 5.874f, 15.75f, 6.4588f)
                curveTo(15.75f, 7.0437f, 15.435f, 7.4727f, 15.0842f, 7.8082f)
                curveTo(14.7547f, 8.1233f, 14.2829f, 8.4584f, 13.7426f, 8.842f)
                lineTo(9.2954f, 12.0001f)
                lineTo(13.7426f, 15.1582f)
                curveTo(14.2829f, 15.5418f, 14.7547f, 15.8769f, 15.0842f, 16.192f)
                curveTo(15.435f, 16.5274f, 15.75f, 16.9565f, 15.75f, 17.5413f)
                curveTo(15.75f, 18.1262f, 15.435f, 18.5552f, 15.0842f, 18.8907f)
                curveTo(14.7547f, 19.2058f, 14.2829f, 19.5409f, 13.7426f, 19.9245f)
                lineTo(11.9098f, 21.226f)
                curveTo(11.1803f, 21.7441f, 10.5644f, 22.1815f, 10.0535f, 22.4421f)
                curveTo(9.5333f, 22.7075f, 8.8982f, 22.9071f, 8.2631f, 22.5822f)
                curveTo(7.6261f, 22.2563f, 7.4191f, 21.6232f, 7.3337f, 21.0463f)
                curveTo(7.2499f, 20.4808f, 7.25f, 19.7277f, 7.25f, 18.837f)
                lineTo(7.25f, 13.4406f)
                lineTo(3.4301f, 16.1145f)
                curveTo(3.0908f, 16.352f, 2.6231f, 16.2695f, 2.3856f, 15.9302f)
                curveTo(2.148f, 15.5908f, 2.2306f, 15.1232f, 2.5699f, 14.8857f)
                lineTo(6.6922f, 12.0001f)
                lineTo(2.5699f, 9.1145f)
                curveTo(2.2306f, 8.877f, 2.148f, 8.4093f, 2.3856f, 8.07f)
                curveTo(2.6231f, 7.7306f, 3.0908f, 7.6481f, 3.4301f, 7.8857f)
                lineTo(7.25f, 10.5596f)
                verticalLineTo(5.2247f)
                curveTo(7.25f, 5.2041f, 7.25f, 5.1836f, 7.25f, 5.1631f)
                curveTo(7.25f, 4.2725f, 7.2499f, 3.5194f, 7.3337f, 2.9539f)
                curveTo(7.4191f, 2.377f, 7.6261f, 1.7439f, 8.2631f, 1.418f)
                curveTo(8.8982f, 1.093f, 9.5333f, 1.2927f, 10.0535f, 1.5581f)
                curveTo(10.5644f, 1.8187f, 11.1803f, 2.2561f, 11.9098f, 2.7741f)
                close()
                moveTo(8.75f, 13.4526f)
                verticalLineTo(18.7755f)
                curveTo(8.75f, 19.7444f, 8.752f, 20.3844f, 8.8175f, 20.8265f)
                curveTo(8.8492f, 21.0405f, 8.8891f, 21.1531f, 8.9186f, 21.2092f)
                curveTo(8.9316f, 21.2339f, 8.9409f, 21.2434f, 8.9409f, 21.2434f)
                curveTo(8.9409f, 21.2434f, 8.9413f, 21.2443f, 8.9463f, 21.2468f)
                curveTo(8.9508f, 21.2491f, 8.953f, 21.2494f, 8.953f, 21.2494f)
                curveTo(8.955f, 21.2497f, 8.968f, 21.2515f, 8.9965f, 21.2476f)
                curveTo(9.0613f, 21.2386f, 9.1779f, 21.2049f, 9.3719f, 21.1059f)
                curveTo(9.7726f, 20.9015f, 10.2983f, 20.5306f, 11.0911f, 19.9677f)
                lineTo(12.829f, 18.7335f)
                curveTo(13.4278f, 18.3083f, 13.8071f, 18.0365f, 14.0474f, 17.8067f)
                curveTo(14.1611f, 17.698f, 14.2119f, 17.6274f, 14.2343f, 17.5867f)
                curveTo(14.2502f, 17.5578f, 14.2501f, 17.5479f, 14.25f, 17.5423f)
                verticalLineTo(17.5404f)
                curveTo(14.2501f, 17.5348f, 14.2502f, 17.5249f, 14.2343f, 17.4959f)
                curveTo(14.2119f, 17.4553f, 14.1611f, 17.3847f, 14.0474f, 17.276f)
                curveTo(13.8071f, 17.0462f, 13.4278f, 16.7744f, 12.829f, 16.3492f)
                lineTo(8.75f, 13.4526f)
                close()
                moveTo(8.75f, 10.5476f)
                verticalLineTo(5.2247f)
                curveTo(8.75f, 4.2558f, 8.752f, 3.6158f, 8.8175f, 3.1737f)
                curveTo(8.8492f, 2.9597f, 8.8891f, 2.847f, 8.9186f, 2.791f)
                curveTo(8.9316f, 2.7663f, 8.9409f, 2.7568f, 8.9409f, 2.7568f)
                curveTo(8.9409f, 2.7568f, 8.9413f, 2.7559f, 8.9463f, 2.7534f)
                curveTo(8.9508f, 2.7511f, 8.953f, 2.7508f, 8.953f, 2.7508f)
                curveTo(8.955f, 2.7505f, 8.968f, 2.7487f, 8.9965f, 2.7526f)
                curveTo(9.0613f, 2.7615f, 9.1779f, 2.7953f, 9.3719f, 2.8943f)
                curveTo(9.7726f, 3.0987f, 10.2983f, 3.4696f, 11.0911f, 4.0325f)
                lineTo(12.829f, 5.2667f)
                curveTo(13.4278f, 5.6919f, 13.8071f, 5.9636f, 14.0474f, 6.1935f)
                curveTo(14.1611f, 6.3022f, 14.2119f, 6.3728f, 14.2343f, 6.4134f)
                curveTo(14.2502f, 6.4424f, 14.2501f, 6.4523f, 14.25f, 6.4578f)
                verticalLineTo(6.4598f)
                curveTo(14.2501f, 6.4654f, 14.2502f, 6.4753f, 14.2343f, 6.5042f)
                curveTo(14.2119f, 6.5448f, 14.1611f, 6.6154f, 14.0474f, 6.7242f)
                curveTo(13.8071f, 6.954f, 13.4278f, 7.2258f, 12.829f, 7.651f)
                lineTo(8.75f, 10.5476f)
                close()
                moveTo(18.4828f, 4.457f)
                curveTo(18.7827f, 4.1713f, 19.2574f, 4.1829f, 19.5431f, 4.4829f)
                lineTo(19.0249f, 4.9764f)
                curveTo(19.5431f, 4.4829f, 19.5431f, 4.4829f, 19.5431f, 4.4829f)
                lineTo(19.5444f, 4.4842f)
                lineTo(19.5458f, 4.4857f)
                lineTo(19.5493f, 4.4894f)
                lineTo(19.5583f, 4.4991f)
                curveTo(19.5652f, 4.5067f, 19.574f, 4.5164f, 19.5845f, 4.5282f)
                curveTo(19.6055f, 4.552f, 19.6333f, 4.5844f, 19.6669f, 4.6256f)
                curveTo(19.7343f, 4.7081f, 19.825f, 4.826f, 19.9311f, 4.9806f)
                curveTo(20.1432f, 5.2901f, 20.4166f, 5.7465f, 20.6866f, 6.3608f)
                curveTo(21.2278f, 7.592f, 21.75f, 9.4447f, 21.75f, 12.0001f)
                curveTo(21.75f, 14.5555f, 21.2278f, 16.4082f, 20.6866f, 17.6394f)
                curveTo(20.4166f, 18.2537f, 20.1432f, 18.7101f, 19.9311f, 19.0195f)
                curveTo(19.825f, 19.1742f, 19.7343f, 19.2921f, 19.6669f, 19.3746f)
                curveTo(19.6333f, 19.4158f, 19.6055f, 19.4482f, 19.5845f, 19.4719f)
                curveTo(19.574f, 19.4838f, 19.5652f, 19.4935f, 19.5583f, 19.5011f)
                lineTo(19.5493f, 19.5108f)
                lineTo(19.5458f, 19.5145f)
                lineTo(19.5444f, 19.516f)
                curveTo(19.5444f, 19.516f, 19.5431f, 19.5173f, 19.0249f, 19.0238f)
                lineTo(19.5431f, 19.5173f)
                curveTo(19.2574f, 19.8173f, 18.7827f, 19.8289f, 18.4828f, 19.5432f)
                curveTo(18.1841f, 19.2587f, 18.1713f, 18.7868f, 18.4533f, 18.4866f)
                lineTo(18.4556f, 18.4842f)
                lineTo(18.4549f, 18.4849f)
                lineTo(18.4533f, 18.4866f)
                lineTo(18.4604f, 18.4787f)
                curveTo(18.4688f, 18.4693f, 18.4839f, 18.4518f, 18.5049f, 18.426f)
                curveTo(18.547f, 18.3745f, 18.6125f, 18.29f, 18.694f, 18.1713f)
                curveTo(18.8568f, 17.9338f, 19.0834f, 17.559f, 19.3134f, 17.0358f)
                curveTo(19.7722f, 15.992f, 20.25f, 14.3447f, 20.25f, 12.0001f)
                curveTo(20.25f, 9.6555f, 19.7722f, 8.0082f, 19.3134f, 6.9644f)
                curveTo(19.0834f, 6.4412f, 18.8568f, 6.0664f, 18.694f, 5.8289f)
                curveTo(18.6125f, 5.7101f, 18.547f, 5.6257f, 18.5049f, 5.5742f)
                curveTo(18.4839f, 5.5484f, 18.4688f, 5.5309f, 18.4604f, 5.5215f)
                lineTo(18.4536f, 5.5139f)
                lineTo(18.4549f, 5.5152f)
                lineTo(18.4558f, 5.5162f)
                moveTo(18.4828f, 4.457f)
                curveTo(18.1841f, 4.7415f, 18.1716f, 5.2137f, 18.4536f, 5.5139f)
                close()
                moveTo(16.6507f, 7.3364f)
                curveTo(17.0172f, 7.1435f, 17.4708f, 7.2842f, 17.6637f, 7.6508f)
                lineTo(17.0f, 8.0001f)
                curveTo(17.6637f, 7.6508f, 17.6637f, 7.6508f, 17.6637f, 7.6508f)
                lineTo(17.6645f, 7.6523f)
                lineTo(17.6657f, 7.6546f)
                lineTo(17.6691f, 7.6611f)
                lineTo(17.68f, 7.6825f)
                curveTo(17.6891f, 7.7003f, 17.7016f, 7.7253f, 17.717f, 7.757f)
                curveTo(17.748f, 7.8204f, 17.7908f, 7.9109f, 17.8416f, 8.0252f)
                curveTo(17.943f, 8.2533f, 18.0768f, 8.5779f, 18.2103f, 8.9718f)
                curveTo(18.4751f, 9.7531f, 18.75f, 10.8389f, 18.75f, 12.0001f)
                curveTo(18.75f, 13.1613f, 18.4751f, 14.2471f, 18.2103f, 15.0284f)
                curveTo(18.0768f, 15.4223f, 17.943f, 15.7469f, 17.8416f, 15.975f)
                curveTo(17.7908f, 16.0892f, 17.748f, 16.1797f, 17.717f, 16.2432f)
                curveTo(17.7016f, 16.2749f, 17.6891f, 16.2999f, 17.68f, 16.3177f)
                lineTo(17.6691f, 16.3391f)
                lineTo(17.6657f, 16.3456f)
                lineTo(17.6645f, 16.3479f)
                lineTo(17.6639f, 16.3491f)
                curveTo(17.6639f, 16.3491f, 17.6637f, 16.3494f, 17.0f, 16.0001f)
                lineTo(17.6639f, 16.3491f)
                curveTo(17.4709f, 16.7156f, 17.0172f, 16.8567f, 16.6507f, 16.6638f)
                curveTo(16.2845f, 16.471f, 16.1436f, 16.0181f, 16.3358f, 15.6518f)
                moveTo(16.3363f, 15.6508f)
                lineTo(16.3425f, 15.6388f)
                curveTo(16.3481f, 15.6277f, 16.357f, 15.6099f, 16.3689f, 15.5855f)
                curveTo(16.3926f, 15.5368f, 16.4279f, 15.4625f, 16.4709f, 15.3658f)
                curveTo(16.557f, 15.172f, 16.6732f, 14.8904f, 16.7897f, 14.5468f)
                curveTo(17.0249f, 13.8531f, 17.25f, 12.9389f, 17.25f, 12.0001f)
                curveTo(17.25f, 11.0613f, 17.0249f, 10.1471f, 16.7897f, 9.4534f)
                curveTo(16.6732f, 9.1098f, 16.557f, 8.8281f, 16.4709f, 8.6344f)
                curveTo(16.4279f, 8.5377f, 16.3926f, 8.4633f, 16.3689f, 8.4146f)
                curveTo(16.357f, 8.3903f, 16.3481f, 8.3724f, 16.3425f, 8.3614f)
                lineTo(16.3367f, 8.3501f)
                lineTo(16.3362f, 8.3491f)
                curveTo(16.1435f, 7.9826f, 16.2842f, 7.5293f, 16.6507f, 7.3364f)
            }
        }
            .build()
        return _bluetoothWave!!
    }

private var _bluetoothWave: ImageVector? = null
