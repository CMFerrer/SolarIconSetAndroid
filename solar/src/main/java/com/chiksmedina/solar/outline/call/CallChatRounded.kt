package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

public val CallGroup.CallChatRounded: ImageVector
    get() {
        if (_callChatRounded != null) {
            return _callChatRounded!!
        }
        _callChatRounded = Builder(name = "CallChatRounded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 7.0f)
                curveTo(22.75f, 3.8244f, 20.1756f, 1.25f, 17.0f, 1.25f)
                curveTo(13.8243f, 1.25f, 11.25f, 3.8244f, 11.25f, 7.0f)
                curveTo(11.25f, 7.9185f, 11.4659f, 8.7887f, 11.8504f, 9.5606f)
                curveTo(11.859f, 9.5779f, 11.8623f, 9.5918f, 11.8634f, 9.6002f)
                curveTo(11.8639f, 9.6041f, 11.8638f, 9.6065f, 11.8638f, 9.6074f)
                lineTo(11.5662f, 10.7195f)
                curveTo(11.2878f, 11.7601f, 12.2398f, 12.7122f, 13.2805f, 12.4338f)
                lineTo(14.3925f, 12.1362f)
                curveTo(14.3911f, 12.1366f, 14.3916f, 12.1363f, 14.3925f, 12.1362f)
                curveTo(14.3935f, 12.1362f, 14.3958f, 12.1361f, 14.3998f, 12.1366f)
                curveTo(14.4082f, 12.1376f, 14.4221f, 12.141f, 14.4394f, 12.1496f)
                curveTo(15.2113f, 12.5341f, 16.0815f, 12.75f, 17.0f, 12.75f)
                curveTo(20.1756f, 12.75f, 22.75f, 10.1756f, 22.75f, 7.0f)
                close()
                moveTo(14.3935f, 12.136f)
                lineTo(14.3925f, 12.1362f)
                close()
                moveTo(17.0f, 2.75f)
                curveTo(19.3472f, 2.75f, 21.25f, 4.6528f, 21.25f, 7.0f)
                curveTo(21.25f, 9.3472f, 19.3472f, 11.25f, 17.0f, 11.25f)
                curveTo(16.3188f, 11.25f, 15.677f, 11.0903f, 15.1081f, 10.8069f)
                curveTo(14.7889f, 10.6479f, 14.3977f, 10.5821f, 14.0058f, 10.6869f)
                lineTo(13.06f, 10.94f)
                lineTo(13.313f, 9.9942f)
                curveTo(13.4179f, 9.6022f, 13.352f, 9.2111f, 13.193f, 8.8919f)
                curveTo(12.9097f, 8.323f, 12.75f, 7.6812f, 12.75f, 7.0f)
                curveTo(12.75f, 4.6528f, 14.6528f, 2.75f, 17.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0075f, 6.4069f)
                curveTo(4.6875f, 4.7268f, 7.5227f, 4.8545f, 8.6925f, 6.9507f)
                lineTo(9.3415f, 8.1136f)
                curveTo(10.1054f, 9.4824f, 9.7799f, 11.2095f, 8.6616f, 12.3415f)
                curveTo(8.6467f, 12.3619f, 8.5677f, 12.4768f, 8.5579f, 12.6776f)
                curveTo(8.5454f, 12.9339f, 8.6364f, 13.5267f, 9.5548f, 14.4452f)
                curveTo(10.4729f, 15.3633f, 11.0656f, 15.4545f, 11.3221f, 15.4421f)
                curveTo(11.5231f, 15.4323f, 11.6381f, 15.3533f, 11.6585f, 15.3384f)
                curveTo(12.7905f, 14.2201f, 14.5176f, 13.8946f, 15.8864f, 14.6585f)
                lineTo(17.0493f, 15.3075f)
                curveTo(19.1454f, 16.4773f, 19.2731f, 19.3125f, 17.5931f, 20.9925f)
                curveTo(16.6944f, 21.8912f, 15.4995f, 22.6897f, 14.0953f, 22.7429f)
                curveTo(12.0144f, 22.8218f, 8.5591f, 22.2844f, 5.1374f, 18.8626f)
                curveTo(1.7156f, 15.4408f, 1.1782f, 11.9856f, 1.2571f, 9.9047f)
                curveTo(1.3103f, 8.5005f, 2.1088f, 7.3056f, 3.0075f, 6.4069f)
                close()
                moveTo(7.3826f, 7.6817f)
                curveTo(6.7836f, 6.6083f, 5.1739f, 6.3617f, 4.0681f, 7.4676f)
                curveTo(3.2928f, 8.2429f, 2.7887f, 9.0987f, 2.756f, 9.9615f)
                curveTo(2.6902f, 11.6968f, 3.1186f, 14.7226f, 6.198f, 17.802f)
                curveTo(9.2774f, 20.8813f, 12.3031f, 21.3098f, 14.0385f, 21.244f)
                curveTo(14.9013f, 21.2113f, 15.7571f, 20.7072f, 16.5324f, 19.9319f)
                curveTo(17.6382f, 18.826f, 17.3916f, 17.2163f, 16.3183f, 16.6173f)
                lineTo(15.1554f, 15.9683f)
                curveTo(14.432f, 15.5646f, 13.4158f, 15.7023f, 12.7025f, 16.4156f)
                curveTo(12.6325f, 16.4856f, 12.1864f, 16.9018f, 11.395f, 16.9403f)
                curveTo(10.5847f, 16.9797f, 9.604f, 16.6157f, 8.4942f, 15.5058f)
                curveTo(7.384f, 14.3956f, 7.02f, 13.4146f, 7.0597f, 12.6043f)
                curveTo(7.0985f, 11.8128f, 7.5147f, 11.3672f, 7.5843f, 11.2975f)
                curveTo(8.2976f, 10.5842f, 8.4354f, 9.568f, 8.0317f, 8.8446f)
                lineTo(7.3826f, 7.6817f)
                close()
            }
        }
        .build()
        return _callChatRounded!!
    }

private var _callChatRounded: ImageVector? = null
