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

val ElectronicDevicesGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(
            name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9098f, 2.7741f)
                lineTo(16.7426f, 4.0757f)
                curveTo(17.2829f, 4.4593f, 17.7547f, 4.7943f, 18.0842f, 5.1095f)
                curveTo(18.435f, 5.4449f, 18.75f, 5.874f, 18.75f, 6.4588f)
                curveTo(18.75f, 7.0437f, 18.435f, 7.4727f, 18.0842f, 7.8082f)
                curveTo(17.7547f, 8.1233f, 17.2829f, 8.4584f, 16.7426f, 8.842f)
                lineTo(12.2954f, 12.0001f)
                lineTo(16.7426f, 15.1582f)
                curveTo(17.2829f, 15.5418f, 17.7547f, 15.8769f, 18.0842f, 16.192f)
                curveTo(18.435f, 16.5274f, 18.75f, 16.9565f, 18.75f, 17.5413f)
                curveTo(18.75f, 18.1262f, 18.435f, 18.5552f, 18.0842f, 18.8907f)
                curveTo(17.7547f, 19.2058f, 17.2829f, 19.5409f, 16.7426f, 19.9245f)
                lineTo(14.9098f, 21.226f)
                curveTo(14.1803f, 21.7441f, 13.5644f, 22.1815f, 13.0535f, 22.4421f)
                curveTo(12.5333f, 22.7075f, 11.8982f, 22.9071f, 11.263f, 22.5822f)
                curveTo(10.6261f, 22.2563f, 10.4191f, 21.6232f, 10.3337f, 21.0463f)
                curveTo(10.2499f, 20.4808f, 10.25f, 19.7277f, 10.25f, 18.837f)
                lineTo(10.25f, 13.4406f)
                lineTo(6.4301f, 16.1145f)
                curveTo(6.0908f, 16.352f, 5.6231f, 16.2695f, 5.3856f, 15.9302f)
                curveTo(5.148f, 15.5908f, 5.2306f, 15.1232f, 5.5699f, 14.8857f)
                lineTo(9.6922f, 12.0001f)
                lineTo(5.5699f, 9.1145f)
                curveTo(5.2306f, 8.877f, 5.148f, 8.4093f, 5.3856f, 8.07f)
                curveTo(5.6231f, 7.7306f, 6.0908f, 7.6481f, 6.4301f, 7.8857f)
                lineTo(10.25f, 10.5596f)
                verticalLineTo(5.2247f)
                curveTo(10.25f, 5.2041f, 10.25f, 5.1836f, 10.25f, 5.1631f)
                curveTo(10.25f, 4.2725f, 10.2499f, 3.5194f, 10.3337f, 2.9539f)
                curveTo(10.4191f, 2.377f, 10.6261f, 1.7439f, 11.263f, 1.418f)
                curveTo(11.8982f, 1.093f, 12.5333f, 1.2927f, 13.0535f, 1.5581f)
                curveTo(13.5644f, 1.8187f, 14.1803f, 2.2561f, 14.9098f, 2.7741f)
                close()
                moveTo(11.75f, 13.4526f)
                verticalLineTo(18.7755f)
                curveTo(11.75f, 19.7444f, 11.752f, 20.3844f, 11.8175f, 20.8265f)
                curveTo(11.8492f, 21.0405f, 11.8891f, 21.1531f, 11.9186f, 21.2092f)
                curveTo(11.9316f, 21.2339f, 11.94f, 21.2424f, 11.9409f, 21.2434f)
                curveTo(11.9411f, 21.2436f, 11.9413f, 21.2443f, 11.9463f, 21.2468f)
                curveTo(11.9508f, 21.2491f, 11.952f, 21.2493f, 11.953f, 21.2494f)
                curveTo(11.955f, 21.2497f, 11.968f, 21.2515f, 11.9965f, 21.2476f)
                curveTo(12.0613f, 21.2386f, 12.1779f, 21.2049f, 12.3719f, 21.1059f)
                curveTo(12.7727f, 20.9015f, 13.2983f, 20.5306f, 14.0911f, 19.9677f)
                lineTo(15.829f, 18.7335f)
                curveTo(16.4278f, 18.3083f, 16.8071f, 18.0365f, 17.0474f, 17.8067f)
                curveTo(17.1611f, 17.698f, 17.2119f, 17.6274f, 17.2343f, 17.5867f)
                curveTo(17.2502f, 17.5578f, 17.2501f, 17.5479f, 17.25f, 17.5423f)
                curveTo(17.25f, 17.542f, 17.25f, 17.5426f, 17.25f, 17.5423f)
                curveTo(17.25f, 17.542f, 17.25f, 17.5407f, 17.25f, 17.5404f)
                curveTo(17.2501f, 17.5348f, 17.2502f, 17.5249f, 17.2343f, 17.4959f)
                curveTo(17.2119f, 17.4553f, 17.1611f, 17.3847f, 17.0474f, 17.276f)
                curveTo(16.8071f, 17.0462f, 16.4278f, 16.7744f, 15.829f, 16.3492f)
                lineTo(11.75f, 13.4526f)
                close()
                moveTo(11.75f, 10.5476f)
                verticalLineTo(5.2247f)
                curveTo(11.75f, 4.2558f, 11.752f, 3.6158f, 11.8175f, 3.1737f)
                curveTo(11.8492f, 2.9597f, 11.8891f, 2.847f, 11.9186f, 2.791f)
                curveTo(11.9316f, 2.7663f, 11.94f, 2.7577f, 11.9409f, 2.7568f)
                curveTo(11.9411f, 2.7566f, 11.9413f, 2.7559f, 11.9463f, 2.7534f)
                curveTo(11.9507f, 2.7511f, 11.952f, 2.7509f, 11.953f, 2.7508f)
                curveTo(11.9529f, 2.7508f, 11.9531f, 2.7508f, 11.953f, 2.7508f)
                curveTo(11.955f, 2.7505f, 11.968f, 2.7487f, 11.9965f, 2.7526f)
                curveTo(12.0613f, 2.7615f, 12.1779f, 2.7953f, 12.3719f, 2.8943f)
                curveTo(12.7727f, 3.0987f, 13.2983f, 3.4696f, 14.0911f, 4.0325f)
                lineTo(15.829f, 5.2667f)
                curveTo(16.4278f, 5.6919f, 16.8071f, 5.9636f, 17.0474f, 6.1935f)
                curveTo(17.1611f, 6.3022f, 17.2119f, 6.3728f, 17.2343f, 6.4134f)
                curveTo(17.2502f, 6.4424f, 17.2501f, 6.4523f, 17.25f, 6.4578f)
                curveTo(17.25f, 6.4575f, 17.25f, 6.4582f, 17.25f, 6.4578f)
                curveTo(17.25f, 6.4581f, 17.25f, 6.4595f, 17.25f, 6.4598f)
                curveTo(17.2501f, 6.4654f, 17.2502f, 6.4753f, 17.2343f, 6.5042f)
                curveTo(17.2119f, 6.5448f, 17.1611f, 6.6154f, 17.0474f, 6.7242f)
                curveTo(16.8071f, 6.954f, 16.4278f, 7.2258f, 15.829f, 7.651f)
                lineTo(11.75f, 10.5476f)
                close()
            }
        }
            .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
