package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val CallGroup.CallDroppedRounded: ImageVector
    get() {
        if (_callDroppedRounded != null) {
            return _callDroppedRounded!!
        }
        _callDroppedRounded = Builder(name = "CallDroppedRounded", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 4.0f)
                curveTo(15.75f, 3.5858f, 15.4142f, 3.25f, 15.0f, 3.25f)
                curveTo(14.5858f, 3.25f, 14.25f, 3.5858f, 14.25f, 4.0f)
                lineTo(14.25f, 5.052f)
                curveTo(14.2499f, 5.9505f, 14.2499f, 6.6997f, 14.3299f, 7.2945f)
                curveTo(14.4143f, 7.9223f, 14.6f, 8.4891f, 15.0554f, 8.9445f)
                curveTo(15.5109f, 9.4f, 16.0777f, 9.5857f, 16.7055f, 9.6701f)
                curveTo(17.1662f, 9.732f, 17.7195f, 9.746f, 18.363f, 9.7491f)
                lineTo(17.5315f, 10.4143f)
                curveTo(17.208f, 10.6731f, 17.1556f, 11.1451f, 17.4143f, 11.4685f)
                curveTo(17.6731f, 11.792f, 18.145f, 11.8444f, 18.4685f, 11.5857f)
                lineTo(20.9685f, 9.5857f)
                curveTo(21.1464f, 9.4433f, 21.25f, 9.2278f, 21.25f, 9.0f)
                curveTo(21.25f, 8.7722f, 21.1464f, 8.5567f, 20.9685f, 8.4143f)
                lineTo(18.4685f, 6.4144f)
                curveTo(18.145f, 6.1556f, 17.6731f, 6.208f, 17.4143f, 6.5315f)
                curveTo(17.1556f, 6.8549f, 17.208f, 7.3269f, 17.5315f, 7.5856f)
                lineTo(18.3605f, 8.2489f)
                curveTo(17.7356f, 8.2456f, 17.2729f, 8.2329f, 16.9054f, 8.1835f)
                curveTo(16.4439f, 8.1214f, 16.2464f, 8.0142f, 16.1161f, 7.8839f)
                curveTo(15.9858f, 7.7536f, 15.8786f, 7.5561f, 15.8165f, 7.0946f)
                curveTo(15.7516f, 6.6116f, 15.75f, 5.964f, 15.75f, 5.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6925f, 4.9507f)
                curveTo(9.5227f, 2.8545f, 6.6875f, 2.7268f, 5.0075f, 4.4069f)
                curveTo(4.1088f, 5.3056f, 3.3103f, 6.5005f, 3.2571f, 7.9047f)
                curveTo(3.1782f, 9.9856f, 3.7156f, 13.4408f, 7.1374f, 16.8626f)
                curveTo(10.5591f, 20.2844f, 14.0144f, 20.8218f, 16.0953f, 20.7429f)
                curveTo(17.4995f, 20.6897f, 18.6944f, 19.8912f, 19.5931f, 18.9925f)
                curveTo(21.2731f, 17.3125f, 21.1454f, 14.4773f, 19.0493f, 13.3075f)
                lineTo(17.8864f, 12.6585f)
                curveTo(16.5176f, 11.8946f, 14.7905f, 12.2201f, 13.6585f, 13.3384f)
                curveTo(13.6381f, 13.3533f, 13.5231f, 13.4323f, 13.3221f, 13.4421f)
                curveTo(13.0656f, 13.4545f, 12.4729f, 13.3633f, 11.5548f, 12.4452f)
                curveTo(10.6364f, 11.5267f, 10.5454f, 10.9339f, 10.5579f, 10.6776f)
                curveTo(10.5677f, 10.4768f, 10.6467f, 10.3619f, 10.6616f, 10.3415f)
                curveTo(11.7799f, 9.2095f, 12.1054f, 7.4824f, 11.3415f, 6.1136f)
                lineTo(10.6925f, 4.9507f)
                close()
                moveTo(6.0681f, 5.4676f)
                curveTo(7.1739f, 4.3617f, 8.7836f, 4.6083f, 9.3827f, 5.6817f)
                lineTo(10.0317f, 6.8446f)
                curveTo(10.4354f, 7.568f, 10.2977f, 8.5842f, 9.5843f, 9.2975f)
                curveTo(9.5147f, 9.3671f, 9.0985f, 9.8128f, 9.0597f, 10.6043f)
                curveTo(9.02f, 11.4146f, 9.384f, 12.3956f, 10.4942f, 13.5058f)
                curveTo(11.604f, 14.6157f, 12.5847f, 14.9797f, 13.395f, 14.9403f)
                curveTo(14.1864f, 14.9018f, 14.6322f, 14.4858f, 14.7023f, 14.4158f)
                curveTo(15.4156f, 13.7025f, 16.432f, 13.5646f, 17.1554f, 13.9683f)
                lineTo(18.3183f, 14.6173f)
                curveTo(19.3916f, 15.2163f, 19.6382f, 16.826f, 18.5324f, 17.9319f)
                curveTo(17.7571f, 18.7072f, 16.9013f, 19.2113f, 16.0385f, 19.244f)
                curveTo(14.3031f, 19.3098f, 11.2774f, 18.8813f, 8.198f, 15.802f)
                curveTo(5.1186f, 12.7226f, 4.6902f, 9.6968f, 4.756f, 7.9615f)
                curveTo(4.7887f, 7.0987f, 5.2928f, 6.2429f, 6.0681f, 5.4676f)
                close()
            }
        }
        .build()
        return _callDroppedRounded!!
    }

private var _callDroppedRounded: ImageVector? = null
