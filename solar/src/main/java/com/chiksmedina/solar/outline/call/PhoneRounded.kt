package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

public val CallGroup.PhoneRounded: ImageVector
    get() {
        if (_phoneRounded != null) {
            return _phoneRounded!!
        }
        _phoneRounded = Builder(name = "PhoneRounded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0075f, 3.4069f)
                curveTo(7.6876f, 1.7269f, 10.5227f, 1.8546f, 11.6925f, 3.9507f)
                lineTo(12.3415f, 5.1136f)
                curveTo(13.1054f, 6.4824f, 12.7799f, 8.2095f, 11.6616f, 9.3415f)
                curveTo(11.6467f, 9.3619f, 11.5678f, 9.4768f, 11.5579f, 9.6777f)
                curveTo(11.5454f, 9.934f, 11.6364f, 10.5267f, 12.5548f, 11.4452f)
                curveTo(13.473f, 12.3633f, 14.0657f, 12.4546f, 14.3221f, 12.4421f)
                curveTo(14.5231f, 12.4323f, 14.6381f, 12.3533f, 14.6585f, 12.3384f)
                curveTo(15.7905f, 11.2201f, 17.5176f, 10.8946f, 18.8864f, 11.6585f)
                lineTo(20.0493f, 12.3075f)
                curveTo(22.1455f, 13.4773f, 22.2732f, 16.3125f, 20.5931f, 17.9925f)
                curveTo(19.6944f, 18.8912f, 18.4995f, 19.6897f, 17.0953f, 19.7429f)
                curveTo(15.0144f, 19.8218f, 11.5592f, 19.2844f, 8.1374f, 15.8626f)
                curveTo(4.7156f, 12.4409f, 4.1782f, 8.9856f, 4.2571f, 6.9047f)
                curveTo(4.3103f, 5.5005f, 5.1088f, 4.3056f, 6.0075f, 3.4069f)
                close()
                moveTo(10.3827f, 4.6817f)
                curveTo(9.7837f, 3.6083f, 8.174f, 3.3617f, 7.0681f, 4.4676f)
                curveTo(6.2928f, 5.2429f, 5.7887f, 6.0987f, 5.756f, 6.9615f)
                curveTo(5.6902f, 8.6969f, 6.1187f, 11.7226f, 9.198f, 14.802f)
                curveTo(12.2774f, 17.8814f, 15.3032f, 18.3098f, 17.0385f, 18.244f)
                curveTo(17.9013f, 18.2113f, 18.7571f, 17.7072f, 19.5324f, 16.9319f)
                curveTo(20.6383f, 15.826f, 20.3917f, 14.2164f, 19.3183f, 13.6173f)
                lineTo(18.1554f, 12.9683f)
                curveTo(17.432f, 12.5646f, 16.4159f, 12.7023f, 15.7026f, 13.4156f)
                lineTo(15.7023f, 13.4158f)
                curveTo(15.6323f, 13.4859f, 15.1865f, 13.9018f, 14.395f, 13.9403f)
                curveTo(13.5848f, 13.9797f, 12.604f, 13.6157f, 11.4942f, 12.5058f)
                curveTo(10.384f, 11.3956f, 10.0201f, 10.4146f, 10.0597f, 9.6043f)
                curveTo(10.0985f, 8.8128f, 10.5147f, 8.3672f, 10.5844f, 8.2975f)
                lineTo(10.5844f, 8.2975f)
                curveTo(11.2977f, 7.5842f, 11.4354f, 6.568f, 11.0317f, 5.8446f)
                lineTo(10.3827f, 4.6817f)
                close()
            }
        }
        .build()
        return _phoneRounded!!
    }

private var _phoneRounded: ImageVector? = null
