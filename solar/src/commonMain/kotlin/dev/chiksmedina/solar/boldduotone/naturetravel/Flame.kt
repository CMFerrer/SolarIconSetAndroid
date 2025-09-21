package dev.chiksmedina.solar.boldduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.NatureTravelGroup

val NatureTravelGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(
            name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 15.0002f)
                curveTo(20.0f, 19.2547f, 17.3819f, 21.1216f, 15.3588f, 21.7512f)
                curveTo(15.2746f, 21.7774f, 15.196f, 21.7793f, 15.126f, 21.7627f)
                curveTo(14.8373f, 21.6942f, 14.6942f, 21.3101f, 14.9019f, 21.0116f)
                curveTo(15.7823f, 19.7464f, 16.8f, 17.8161f, 16.8f, 16.0002f)
                curveTo(16.8f, 14.0496f, 15.1559f, 11.7467f, 13.8721f, 10.3263f)
                curveTo(13.5786f, 10.0016f, 13.0667f, 10.2164f, 13.0507f, 10.6539f)
                curveTo(12.9976f, 12.1031f, 12.7689f, 14.042f, 11.7828f, 15.5616f)
                curveTo(11.6241f, 15.8062f, 11.2872f, 15.8264f, 11.1063f, 15.5977f)
                curveTo(10.7982f, 15.208f, 10.4901f, 14.7267f, 10.182f, 14.3464f)
                curveTo(10.016f, 14.1416f, 9.716f, 14.1388f, 9.5246f, 14.32f)
                curveTo(8.7782f, 15.0267f, 7.7333f, 16.1288f, 7.7333f, 17.5002f)
                curveTo(7.7333f, 18.4301f, 8.0936f, 19.405f, 8.5001f, 20.1893f)
                curveTo(8.7022f, 20.5795f, 8.3966f, 21.0415f, 8.018f, 20.9595f)
                curveTo(7.9779f, 20.9508f, 7.937f, 20.936f, 7.8957f, 20.9144f)
                curveTo(6.1131f, 19.9789f, 4.0f, 18.0838f, 4.0f, 15.0002f)
                curveTo(4.0f, 11.8538f, 8.3103f, 7.495f, 9.956f, 3.3771f)
                curveTo(10.2157f, 2.7273f, 11.0161f, 2.422f, 11.5727f, 2.846f)
                curveTo(14.9439f, 5.4141f, 20.0f, 10.3783f, 20.0f, 15.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.7334f, 17.5004f)
                curveTo(7.7334f, 18.4303f, 8.0937f, 19.4052f, 8.5001f, 20.1896f)
                curveTo(8.7023f, 20.5797f, 8.3966f, 21.0417f, 8.0181f, 20.9597f)
                curveTo(8.5f, 21.5f, 11.6763f, 21.9175f, 15.1261f, 21.7629f)
                curveTo(14.8374f, 21.6944f, 14.6943f, 21.3103f, 14.902f, 21.0119f)
                curveTo(15.7824f, 19.7466f, 16.8001f, 17.8163f, 16.8001f, 16.0004f)
                curveTo(16.8001f, 14.0498f, 15.156f, 11.7469f, 13.8722f, 10.3265f)
                curveTo(13.5787f, 10.0018f, 13.0667f, 10.2167f, 13.0507f, 10.6541f)
                curveTo(12.9977f, 12.1033f, 12.769f, 14.0422f, 11.7829f, 15.5618f)
                curveTo(11.6242f, 15.8064f, 11.2872f, 15.8266f, 11.1064f, 15.5979f)
                curveTo(10.7983f, 15.2083f, 10.4901f, 14.7269f, 10.182f, 14.3466f)
                curveTo(10.0161f, 14.1418f, 9.7161f, 14.139f, 9.5247f, 14.3202f)
                curveTo(8.7783f, 15.0269f, 7.7334f, 16.129f, 7.7334f, 17.5004f)
                close()
            }
        }
            .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
