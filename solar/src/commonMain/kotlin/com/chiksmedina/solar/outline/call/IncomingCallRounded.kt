package com.chiksmedina.solar.outline.call

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
import com.chiksmedina.solar.outline.CallGroup

val CallGroup.IncomingCallRounded: ImageVector
    get() {
        if (_incomingCallRounded != null) {
            return _incomingCallRounded!!
        }
        _incomingCallRounded = Builder(
            name = "IncomingCallRounded", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.6925f, 4.9507f)
                curveTo(9.5227f, 2.8546f, 6.6876f, 2.7269f, 5.0075f, 4.4069f)
                curveTo(4.1088f, 5.3056f, 3.3103f, 6.5005f, 3.2571f, 7.9047f)
                curveTo(3.1782f, 9.9856f, 3.7156f, 13.4409f, 7.1374f, 16.8626f)
                curveTo(10.5592f, 20.2844f, 14.0144f, 20.8218f, 16.0953f, 20.7429f)
                curveTo(17.4995f, 20.6897f, 18.6944f, 19.8912f, 19.5931f, 18.9925f)
                curveTo(21.2732f, 17.3125f, 21.1455f, 14.4773f, 19.0493f, 13.3075f)
                lineTo(17.8864f, 12.6585f)
                curveTo(16.5176f, 11.8946f, 14.7905f, 12.2201f, 13.6585f, 13.3384f)
                curveTo(13.6381f, 13.3533f, 13.5231f, 13.4323f, 13.3221f, 13.4421f)
                curveTo(13.0657f, 13.4546f, 12.473f, 13.3633f, 11.5548f, 12.4452f)
                curveTo(10.6364f, 11.5267f, 10.5454f, 10.934f, 10.5579f, 10.6776f)
                curveTo(10.5678f, 10.4768f, 10.6467f, 10.3619f, 10.6616f, 10.3415f)
                curveTo(11.7799f, 9.2095f, 12.1054f, 7.4824f, 11.3415f, 6.1136f)
                lineTo(10.6925f, 4.9507f)
                close()
                moveTo(6.0681f, 5.4676f)
                curveTo(7.174f, 4.3618f, 8.7837f, 4.6083f, 9.3827f, 5.6817f)
                lineTo(10.0317f, 6.8446f)
                curveTo(10.4354f, 7.568f, 10.2977f, 8.5842f, 9.5844f, 9.2975f)
                curveTo(9.5147f, 9.3671f, 9.0985f, 9.8128f, 9.0597f, 10.6043f)
                curveTo(9.0201f, 11.4146f, 9.384f, 12.3956f, 10.4942f, 13.5058f)
                curveTo(11.604f, 14.6157f, 12.5848f, 14.9797f, 13.395f, 14.9403f)
                curveTo(14.1865f, 14.9018f, 14.6323f, 14.4859f, 14.7023f, 14.4158f)
                curveTo(15.4157f, 13.7025f, 16.432f, 13.5646f, 17.1554f, 13.9683f)
                lineTo(18.3183f, 14.6173f)
                curveTo(19.3917f, 15.2164f, 19.6383f, 16.826f, 18.5324f, 17.9319f)
                curveTo(17.7571f, 18.7072f, 16.9013f, 19.2113f, 16.0385f, 19.244f)
                curveTo(14.3032f, 19.3098f, 11.2774f, 18.8814f, 8.198f, 15.802f)
                curveTo(5.1187f, 12.7226f, 4.6902f, 9.6969f, 4.756f, 7.9615f)
                curveTo(4.7887f, 7.0987f, 5.2928f, 6.2429f, 6.0681f, 5.4676f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 9.75f)
                curveTo(18.4142f, 9.75f, 18.75f, 9.4142f, 18.75f, 9.0f)
                curveTo(18.75f, 8.5858f, 18.4142f, 8.25f, 18.0f, 8.25f)
                horizontalLineTo(16.8107f)
                lineTo(19.5303f, 5.5304f)
                curveTo(19.8232f, 5.2375f, 19.8232f, 4.7626f, 19.5303f, 4.4697f)
                curveTo(19.2374f, 4.1768f, 18.7626f, 4.1768f, 18.4697f, 4.4697f)
                lineTo(15.75f, 7.1894f)
                verticalLineTo(6.0f)
                curveTo(15.75f, 5.5858f, 15.4142f, 5.25f, 15.0f, 5.25f)
                curveTo(14.5858f, 5.25f, 14.25f, 5.5858f, 14.25f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(14.25f, 9.4142f, 14.5858f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(18.0f)
                close()
            }
        }
            .build()
        return _incomingCallRounded!!
    }

private var _incomingCallRounded: ImageVector? = null
