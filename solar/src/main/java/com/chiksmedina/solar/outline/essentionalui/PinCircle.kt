package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.PinCircle: ImageVector
    get() {
        if (_pinCircle != null) {
            return _pinCircle!!
        }
        _pinCircle = Builder(
            name = "PinCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9849f, 7.4046f)
                lineTo(16.6067f, 9.028f)
                curveTo(17.0951f, 9.5169f, 17.5202f, 9.9424f, 17.7997f, 10.3196f)
                curveTo(18.0948f, 10.7178f, 18.3445f, 11.2151f, 18.2156f, 11.811f)
                curveTo(18.0868f, 12.407f, 17.6538f, 12.7566f, 17.2205f, 12.9971f)
                curveTo(16.8101f, 13.2248f, 16.2472f, 13.4363f, 15.6006f, 13.6792f)
                lineTo(14.5887f, 14.0594f)
                curveTo(14.1652f, 14.2185f, 14.1342f, 14.2418f, 14.1165f, 14.2572f)
                curveTo(14.0982f, 14.273f, 14.0819f, 14.2909f, 14.0678f, 14.3105f)
                curveTo(14.054f, 14.3298f, 14.0335f, 14.363f, 13.9134f, 14.7995f)
                lineTo(13.9027f, 14.8386f)
                curveTo(13.7923f, 15.2397f, 13.693f, 15.6007f, 13.5816f, 15.8784f)
                curveTo(13.4671f, 16.1636f, 13.285f, 16.5095f, 12.9184f, 16.7187f)
                curveTo(12.6848f, 16.852f, 12.4204f, 16.9219f, 12.1515f, 16.9215f)
                curveTo(11.7292f, 16.9209f, 11.3999f, 16.71f, 11.1596f, 16.5186f)
                curveTo(10.9256f, 16.3323f, 10.6611f, 16.0674f, 10.3672f, 15.7732f)
                lineTo(9.8267f, 15.2321f)
                lineTo(8.0306f, 17.03f)
                curveTo(7.7379f, 17.3231f, 7.263f, 17.3233f, 6.9699f, 17.0306f)
                curveTo(6.6769f, 16.7378f, 6.6767f, 16.263f, 6.9694f, 15.9699f)
                lineTo(8.7666f, 14.1709f)
                lineTo(8.2518f, 13.6556f)
                curveTo(7.9597f, 13.3633f, 7.6968f, 13.1002f, 7.5116f, 12.8675f)
                curveTo(7.3214f, 12.6285f, 7.1119f, 12.3016f, 7.1093f, 11.8823f)
                curveTo(7.1075f, 11.6085f, 7.1786f, 11.3391f, 7.3153f, 11.1017f)
                curveTo(7.5246f, 10.7383f, 7.8683f, 10.5575f, 8.1518f, 10.4437f)
                curveTo(8.4277f, 10.3329f, 8.7862f, 10.2341f, 9.1844f, 10.1244f)
                curveTo(9.1973f, 10.1208f, 9.2102f, 10.1173f, 9.2232f, 10.1137f)
                curveTo(9.6606f, 9.9931f, 9.6936f, 9.9726f, 9.7126f, 9.9589f)
                curveTo(9.7327f, 9.9444f, 9.751f, 9.9276f, 9.7671f, 9.9087f)
                curveTo(9.7824f, 9.8907f, 9.8057f, 9.8591f, 9.9619f, 9.4329f)
                lineTo(10.3091f, 8.4852f)
                curveTo(10.3157f, 8.4672f, 10.3222f, 8.4494f, 10.3287f, 8.4315f)
                curveTo(10.5684f, 7.7774f, 10.7767f, 7.2086f, 11.0024f, 6.7938f)
                curveTo(11.2403f, 6.3566f, 11.5883f, 5.9177f, 12.187f, 5.7856f)
                curveTo(12.786f, 5.6535f, 13.2862f, 5.9054f, 13.6858f, 6.2021f)
                curveTo(14.0649f, 6.4835f, 14.4928f, 6.9119f, 14.9849f, 7.4046f)
                close()
                moveTo(12.5123f, 7.25f)
                curveTo(12.5119f, 7.2501f, 12.5112f, 7.2502f, 12.5102f, 7.2504f)
                curveTo(12.5081f, 7.2509f, 12.5075f, 7.2511f, 12.5079f, 7.251f)
                curveTo(12.5083f, 7.2509f, 12.5081f, 7.2509f, 12.5079f, 7.251f)
                curveTo(12.5076f, 7.2511f, 12.5064f, 7.2519f, 12.5032f, 7.2542f)
                curveTo(12.5f, 7.2566f, 12.4947f, 7.2608f, 12.4875f, 7.2676f)
                curveTo(12.4554f, 7.2978f, 12.3989f, 7.3657f, 12.32f, 7.5108f)
                curveTo(12.1539f, 7.816f, 11.9826f, 8.2777f, 11.7175f, 9.0012f)
                lineTo(11.3703f, 9.9489f)
                curveTo(11.3615f, 9.973f, 11.3527f, 9.9972f, 11.3438f, 10.0215f)
                curveTo(11.2352f, 10.3202f, 11.1221f, 10.6313f, 10.9087f, 10.8816f)
                curveTo(10.8144f, 10.9923f, 10.7071f, 11.0912f, 10.589f, 11.1762f)
                curveTo(10.322f, 11.3685f, 10.0027f, 11.4557f, 9.6964f, 11.5393f)
                curveTo(9.6714f, 11.5461f, 9.6466f, 11.5529f, 9.6219f, 11.5597f)
                curveTo(9.1724f, 11.6837f, 8.8979f, 11.7605f, 8.7106f, 11.8357f)
                curveTo(8.6799f, 11.848f, 8.6555f, 11.8589f, 8.6362f, 11.8681f)
                curveTo(8.6485f, 11.8856f, 8.6645f, 11.9073f, 8.6852f, 11.9334f)
                curveTo(8.8111f, 12.0914f, 9.0118f, 12.294f, 9.3414f, 12.624f)
                lineTo(11.3998f, 14.6844f)
                curveTo(11.7315f, 15.0165f, 11.9352f, 15.2187f, 12.0941f, 15.3453f)
                curveTo(12.1193f, 15.3654f, 12.1404f, 15.381f, 12.1577f, 15.3931f)
                curveTo(12.1668f, 15.374f, 12.1774f, 15.3498f, 12.1895f, 15.3197f)
                curveTo(12.2653f, 15.131f, 12.3426f, 14.8543f, 12.4672f, 14.4016f)
                curveTo(12.4739f, 14.3769f, 12.4807f, 14.3521f, 12.4875f, 14.3273f)
                curveTo(12.5709f, 14.0214f, 12.6577f, 13.7028f, 12.8491f, 13.4361f)
                curveTo(12.9317f, 13.321f, 13.0275f, 13.216f, 13.1345f, 13.1233f)
                curveTo(13.3828f, 12.9083f, 13.6922f, 12.7929f, 13.989f, 12.6822f)
                curveTo(14.0131f, 12.6732f, 14.0372f, 12.6642f, 14.0611f, 12.6552f)
                lineTo(15.0197f, 12.2951f)
                curveTo(15.7354f, 12.0262f, 16.1914f, 11.8527f, 16.4926f, 11.6855f)
                curveTo(16.6356f, 11.6061f, 16.7025f, 11.5496f, 16.7322f, 11.5176f)
                curveTo(16.7452f, 11.5035f, 16.7488f, 11.4966f, 16.7489f, 11.4965f)
                curveTo(16.749f, 11.4961f, 16.7493f, 11.4951f, 16.7495f, 11.4939f)
                curveTo(16.7498f, 11.4928f, 16.7499f, 11.492f, 16.75f, 11.4916f)
                curveTo(16.7499f, 11.4912f, 16.7495f, 11.4831f, 16.7435f, 11.465f)
                curveTo(16.7296f, 11.4234f, 16.692f, 11.3442f, 16.5946f, 11.2126f)
                curveTo(16.3893f, 10.9357f, 16.0457f, 10.5889f, 15.5052f, 10.0479f)
                lineTo(13.9641f, 8.5051f)
                curveTo(13.4197f, 7.9602f, 13.0705f, 7.6135f, 12.7917f, 7.4064f)
                curveTo(12.6591f, 7.3081f, 12.5795f, 7.2702f, 12.5378f, 7.2564f)
                curveTo(12.5284f, 7.2533f, 12.5219f, 7.2517f, 12.518f, 7.2509f)
                curveTo(12.5147f, 7.2503f, 12.5129f, 7.2501f, 12.5123f, 7.25f)
                close()
            }
        }
            .build()
        return _pinCircle!!
    }

private var _pinCircle: ImageVector? = null
