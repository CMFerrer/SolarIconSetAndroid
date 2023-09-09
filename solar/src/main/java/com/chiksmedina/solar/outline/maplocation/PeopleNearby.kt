package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.PeopleNearby: ImageVector
    get() {
        if (_peopleNearby != null) {
            return _peopleNearby!!
        }
        _peopleNearby = Builder(name = "PeopleNearby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(11.3096f, 2.75f, 10.75f, 3.3096f, 10.75f, 4.0f)
                curveTo(10.75f, 4.6904f, 11.3096f, 5.25f, 12.0f, 5.25f)
                curveTo(12.6904f, 5.25f, 13.25f, 4.6904f, 13.25f, 4.0f)
                curveTo(13.25f, 3.3096f, 12.6904f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(9.25f, 4.0f)
                curveTo(9.25f, 2.4812f, 10.4812f, 1.25f, 12.0f, 1.25f)
                curveTo(13.5188f, 1.25f, 14.75f, 2.4812f, 14.75f, 4.0f)
                curveTo(14.75f, 5.5188f, 13.5188f, 6.75f, 12.0f, 6.75f)
                curveTo(10.4812f, 6.75f, 9.25f, 5.5188f, 9.25f, 4.0f)
                close()
                moveTo(16.9894f, 7.1638f)
                curveTo(18.4102f, 6.8594f, 19.75f, 7.9425f, 19.75f, 9.3955f)
                curveTo(19.75f, 10.3779f, 19.1214f, 11.2501f, 18.1894f, 11.5608f)
                lineTo(16.0141f, 12.2859f)
                curveTo(15.877f, 12.3316f, 15.795f, 12.3591f, 15.7342f, 12.3821f)
                curveTo(15.6957f, 12.3966f, 15.6795f, 12.4044f, 15.6756f, 12.4063f)
                curveTo(15.5935f, 12.4582f, 15.5488f, 12.5528f, 15.561f, 12.6491f)
                curveTo(15.562f, 12.6534f, 15.5663f, 12.6709f, 15.5795f, 12.7098f)
                curveTo(15.6004f, 12.7714f, 15.6313f, 12.8522f, 15.6832f, 12.987f)
                lineTo(16.93f, 16.2287f)
                curveTo(17.4901f, 17.6849f, 16.4152f, 19.25f, 14.8549f, 19.25f)
                curveTo(14.0571f, 19.25f, 13.3205f, 18.8225f, 12.9246f, 18.1298f)
                lineTo(12.0f, 16.5117f)
                lineTo(11.0754f, 18.1298f)
                curveTo(10.6795f, 18.8225f, 9.9429f, 19.25f, 9.1451f, 19.25f)
                curveTo(7.5848f, 19.25f, 6.5099f, 17.6849f, 7.07f, 16.2287f)
                lineTo(8.3168f, 12.987f)
                curveTo(8.3687f, 12.8522f, 8.3996f, 12.7714f, 8.4205f, 12.7098f)
                curveTo(8.4337f, 12.6709f, 8.438f, 12.6534f, 8.439f, 12.6491f)
                curveTo(8.4512f, 12.5528f, 8.4065f, 12.4582f, 8.3244f, 12.4063f)
                curveTo(8.3205f, 12.4044f, 8.3043f, 12.3966f, 8.2658f, 12.3821f)
                curveTo(8.205f, 12.3591f, 8.123f, 12.3316f, 7.9859f, 12.2859f)
                lineTo(5.8106f, 11.5608f)
                curveTo(4.8786f, 11.2501f, 4.25f, 10.3779f, 4.25f, 9.3955f)
                curveTo(4.25f, 7.9425f, 5.5898f, 6.8594f, 7.0106f, 7.1638f)
                lineTo(8.9082f, 7.5704f)
                curveTo(9.0147f, 7.5933f, 9.0644f, 7.6039f, 9.1135f, 7.6141f)
                curveTo(11.0177f, 8.0079f, 12.9823f, 8.0079f, 14.8865f, 7.6141f)
                curveTo(14.9356f, 7.6039f, 14.9853f, 7.5933f, 15.0918f, 7.5704f)
                lineTo(16.9894f, 7.1638f)
                close()
                moveTo(18.25f, 9.3955f)
                curveTo(18.25f, 8.8974f, 17.7907f, 8.5261f, 17.3037f, 8.6305f)
                lineTo(15.4034f, 9.0377f)
                curveTo(15.3006f, 9.0597f, 15.2453f, 9.0716f, 15.1903f, 9.083f)
                curveTo(13.0857f, 9.5183f, 10.9143f, 9.5183f, 8.8097f, 9.083f)
                curveTo(8.7547f, 9.0716f, 8.6995f, 9.0598f, 8.5969f, 9.0378f)
                lineTo(6.6963f, 8.6305f)
                curveTo(6.2093f, 8.5261f, 5.75f, 8.8974f, 5.75f, 9.3955f)
                curveTo(5.75f, 9.7323f, 5.9655f, 10.0313f, 6.285f, 10.1378f)
                lineTo(8.4603f, 10.8629f)
                curveTo(8.4784f, 10.8689f, 8.4966f, 10.8749f, 8.5149f, 10.881f)
                curveTo(8.7205f, 10.9491f, 8.9341f, 11.0199f, 9.1102f, 11.1286f)
                curveTo(9.6993f, 11.4922f, 10.0186f, 12.169f, 9.9249f, 12.8548f)
                curveTo(9.8968f, 13.0599f, 9.8157f, 13.2698f, 9.7376f, 13.4718f)
                curveTo(9.7306f, 13.4898f, 9.7237f, 13.5077f, 9.7168f, 13.5255f)
                lineTo(8.47f, 16.7672f)
                curveTo(8.2878f, 17.2409f, 8.6375f, 17.75f, 9.1451f, 17.75f)
                curveTo(9.4046f, 17.75f, 9.6442f, 17.6109f, 9.773f, 17.3856f)
                lineTo(11.3488f, 14.6279f)
                curveTo(11.4823f, 14.3942f, 11.7309f, 14.25f, 12.0f, 14.25f)
                curveTo(12.2691f, 14.25f, 12.5177f, 14.3942f, 12.6512f, 14.6279f)
                lineTo(14.227f, 17.3856f)
                curveTo(14.3558f, 17.6109f, 14.5954f, 17.75f, 14.8549f, 17.75f)
                curveTo(15.3625f, 17.75f, 15.7122f, 17.2409f, 15.53f, 16.7672f)
                lineTo(14.2832f, 13.5255f)
                curveTo(14.2763f, 13.5077f, 14.2694f, 13.4898f, 14.2624f, 13.4718f)
                curveTo(14.1843f, 13.2698f, 14.1032f, 13.0599f, 14.0751f, 12.8548f)
                curveTo(13.9814f, 12.169f, 14.3007f, 11.4922f, 14.8898f, 11.1286f)
                curveTo(15.0659f, 11.0199f, 15.2795f, 10.9491f, 15.4851f, 10.881f)
                curveTo(15.5034f, 10.8749f, 15.5216f, 10.8689f, 15.5397f, 10.8629f)
                lineTo(17.715f, 10.1378f)
                curveTo(18.0345f, 10.0313f, 18.25f, 9.7323f, 18.25f, 9.3955f)
                close()
                moveTo(5.2164f, 14.1631f)
                curveTo(5.4025f, 14.5332f, 5.2533f, 14.984f, 4.8832f, 15.1701f)
                curveTo(3.3623f, 15.9348f, 2.75f, 16.7949f, 2.75f, 17.5f)
                curveTo(2.75f, 18.2637f, 3.474f, 19.2048f, 5.2367f, 19.998f)
                curveTo(6.929f, 20.7596f, 9.3195f, 21.25f, 12.0f, 21.25f)
                curveTo(14.6805f, 21.25f, 17.071f, 20.7596f, 18.7633f, 19.998f)
                curveTo(20.526f, 19.2048f, 21.25f, 18.2637f, 21.25f, 17.5f)
                curveTo(21.25f, 16.7949f, 20.6377f, 15.9348f, 19.1168f, 15.1701f)
                curveTo(18.7467f, 14.984f, 18.5975f, 14.5332f, 18.7836f, 14.1631f)
                curveTo(18.9697f, 13.793f, 19.4205f, 13.6439f, 19.7906f, 13.8299f)
                curveTo(21.4366f, 14.6575f, 22.75f, 15.9f, 22.75f, 17.5f)
                curveTo(22.75f, 19.2216f, 21.2354f, 20.5305f, 19.3788f, 21.3659f)
                curveTo(17.4518f, 22.2331f, 14.8424f, 22.75f, 12.0f, 22.75f)
                curveTo(9.1576f, 22.75f, 6.5482f, 22.2331f, 4.6212f, 21.3659f)
                curveTo(2.7646f, 20.5305f, 1.25f, 19.2216f, 1.25f, 17.5f)
                curveTo(1.25f, 15.9f, 2.5634f, 14.6575f, 4.2094f, 13.8299f)
                curveTo(4.5795f, 13.6439f, 5.0303f, 13.793f, 5.2164f, 14.1631f)
                close()
            }
        }
        .build()
        return _peopleNearby!!
    }

private var _peopleNearby: ImageVector? = null
