package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.AstronomyGroup

public val AstronomyGroup.StarAngle: ImageVector
    get() {
        if (_starAngle != null) {
            return _starAngle!!
        }
        _starAngle = Builder(name = "StarAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4055f, 6.0727f)
                curveTo(7.978f, 5.434f, 8.37f, 4.9986f, 8.6863f, 4.7354f)
                curveTo(9.0066f, 4.4687f, 9.1112f, 4.4962f, 9.1436f, 4.5056f)
                curveTo(9.1875f, 4.5183f, 9.3014f, 4.5686f, 9.4591f, 4.9818f)
                curveTo(9.6132f, 5.3856f, 9.7525f, 5.9793f, 9.9528f, 6.8405f)
                lineTo(10.0728f, 7.3564f)
                curveTo(10.166f, 7.7593f, 10.2435f, 8.0941f, 10.4367f, 8.3638f)
                curveTo(10.6359f, 8.6418f, 10.9251f, 8.8059f, 11.2548f, 8.9931f)
                lineTo(11.3187f, 9.0294f)
                lineTo(11.6764f, 9.2331f)
                curveTo(12.383f, 9.6355f, 12.8592f, 9.9085f, 13.1695f, 10.1571f)
                curveTo(13.4665f, 10.3952f, 13.5176f, 10.5373f, 13.5221f, 10.6583f)
                curveTo(13.5268f, 10.7856f, 13.4803f, 10.9454f, 13.1948f, 11.2318f)
                curveTo(12.9009f, 11.5265f, 12.4433f, 11.8681f, 11.7713f, 12.3675f)
                lineTo(11.3723f, 12.6639f)
                curveTo(11.0547f, 12.8992f, 10.7878f, 13.097f, 10.6157f, 13.3922f)
                curveTo(10.4473f, 13.6808f, 10.3956f, 14.0187f, 10.3316f, 14.4371f)
                lineTo(10.2506f, 14.9635f)
                curveTo(10.1144f, 15.8478f, 10.019f, 16.4601f, 9.8947f, 16.8858f)
                curveTo(9.8247f, 17.1254f, 9.7581f, 17.2591f, 9.7019f, 17.3354f)
                curveTo(9.5935f, 17.2951f, 9.4492f, 17.2363f, 9.2788f, 17.1547f)
                curveTo(8.8736f, 16.9607f, 8.3247f, 16.6391f, 7.7625f, 16.1334f)
                lineTo(7.45f, 15.8523f)
                lineTo(7.4363f, 15.84f)
                curveTo(7.2764f, 15.6961f, 7.1342f, 15.5683f, 7.0055f, 15.4707f)
                curveTo(6.8664f, 15.3652f, 6.7162f, 15.2738f, 6.5325f, 15.2205f)
                curveTo(6.2076f, 15.1263f, 5.8732f, 15.189f, 5.5125f, 15.2567f)
                lineTo(5.4346f, 15.2713f)
                lineTo(5.0342f, 15.3456f)
                curveTo(4.2415f, 15.4926f, 3.7101f, 15.5895f, 3.329f, 15.5966f)
                curveTo(2.9629f, 15.6034f, 2.886f, 15.5245f, 2.8448f, 15.4671f)
                curveTo(2.7873f, 15.3868f, 2.7337f, 15.2313f, 2.823f, 14.7933f)
                curveTo(2.9119f, 14.3572f, 3.112f, 13.7757f, 3.4025f, 12.9362f)
                lineTo(3.5746f, 12.4389f)
                curveTo(3.7133f, 12.0391f, 3.8243f, 11.7194f, 3.8119f, 11.3819f)
                curveTo(3.7995f, 11.0421f, 3.6639f, 10.7358f, 3.4966f, 10.3576f)
                lineTo(3.2889f, 9.8872f)
                curveTo(2.9383f, 9.0926f, 2.6977f, 8.5446f, 2.5779f, 8.1256f)
                curveTo(2.4594f, 7.7108f, 2.4963f, 7.5428f, 2.5559f, 7.4406f)
                curveTo(2.6054f, 7.3558f, 2.695f, 7.2655f, 3.0558f, 7.221f)
                curveTo(3.4355f, 7.1741f, 3.9707f, 7.1952f, 4.77f, 7.2292f)
                lineTo(5.1739f, 7.2463f)
                lineTo(5.2501f, 7.2497f)
                curveTo(5.6169f, 7.266f, 5.9528f, 7.281f, 6.2646f, 7.1432f)
                curveTo(6.5679f, 7.0092f, 6.7972f, 6.7524f, 7.0604f, 6.4579f)
                lineTo(7.1152f, 6.3966f)
                lineTo(7.4055f, 6.0727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9176f, 6.5745f)
                curveTo(10.7622f, 5.9061f, 10.6304f, 5.3399f, 10.4876f, 4.8954f)
                lineTo(17.1213f, 6.8197f)
                curveTo(17.1651f, 6.8324f, 17.2791f, 6.8828f, 17.4367f, 7.2959f)
                curveTo(17.5908f, 7.6997f, 17.7301f, 8.2934f, 17.9305f, 9.1546f)
                lineTo(18.0504f, 9.6705f)
                curveTo(18.077f, 9.7852f, 18.1023f, 9.8947f, 18.1293f, 9.9985f)
                lineTo(12.1172f, 8.3334f)
                lineTo(11.8136f, 8.1604f)
                curveTo(11.3841f, 7.9158f, 11.3052f, 7.859f, 11.2496f, 7.7814f)
                curveTo(11.1877f, 7.695f, 11.1504f, 7.5749f, 11.0286f, 7.0515f)
                lineTo(10.9176f, 6.5745f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3427f, 9.9874f)
                lineTo(19.3504f, 11.3743f)
                lineTo(19.654f, 11.5472f)
                curveTo(20.3606f, 11.9497f, 20.8368f, 12.2227f, 21.1471f, 12.4713f)
                curveTo(21.4442f, 12.7093f, 21.4953f, 12.8514f, 21.4997f, 12.9724f)
                curveTo(21.5044f, 13.0997f, 21.4579f, 13.2596f, 21.1724f, 13.5459f)
                curveTo(20.8785f, 13.8406f, 20.421f, 14.1822f, 19.7489f, 14.6816f)
                lineTo(19.3499f, 14.978f)
                curveTo(19.1613f, 15.1178f, 18.9905f, 15.2444f, 18.8469f, 15.3859f)
                lineTo(12.0422f, 13.412f)
                lineTo(12.4008f, 13.1455f)
                curveTo(13.0314f, 12.677f, 13.5501f, 12.2916f, 13.9029f, 11.9379f)
                curveTo(14.2701f, 11.5696f, 14.541f, 11.1545f, 14.5214f, 10.6216f)
                curveTo(14.5126f, 10.3825f, 14.4474f, 10.1737f, 14.3427f, 9.9874f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3744f, 14.2595f)
                lineTo(18.3867f, 16.2937f)
                curveTo(18.3576f, 16.435f, 18.3344f, 16.5869f, 18.3092f, 16.7512f)
                lineTo(18.2282f, 17.2777f)
                curveTo(18.1511f, 17.7785f, 18.0373f, 18.2246f, 17.9163f, 18.6025f)
                curveTo(17.7033f, 19.2682f, 17.6488f, 19.3607f, 17.4887f, 19.4526f)
                curveTo(17.4199f, 19.4921f, 17.3552f, 19.5094f, 17.2196f, 19.4941f)
                curveTo(17.0536f, 19.4755f, 16.8408f, 19.4155f, 16.4778f, 19.3102f)
                lineTo(10.6832f, 17.6293f)
                curveTo(10.7528f, 17.4828f, 10.8079f, 17.3259f, 10.8545f, 17.1663f)
                curveTo(10.9997f, 16.6693f, 11.1042f, 15.9909f, 11.233f, 15.1541f)
                lineTo(11.3082f, 14.6659f)
                curveTo(11.3349f, 14.4923f, 11.356f, 14.3611f, 11.3744f, 14.2595f)
                close()
            }
        }
        .build()
        return _starAngle!!
    }

private var _starAngle: ImageVector? = null
