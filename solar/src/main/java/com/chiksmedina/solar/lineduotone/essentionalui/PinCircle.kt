package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.PinCircle: ImageVector
    get() {
        if (_pinCircle != null) {
            return _pinCircle!!
        }
        _pinCircle = Builder(name = "PinCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4947f, 7.9751f)
                lineTo(15.0253f, 7.445f)
                lineTo(15.0253f, 7.445f)
                lineTo(14.4947f, 7.9751f)
                close()
                moveTo(16.0358f, 9.5178f)
                lineTo(15.5052f, 10.0479f)
                lineTo(15.5052f, 10.0479f)
                lineTo(16.0358f, 9.5178f)
                close()
                moveTo(10.8692f, 15.2145f)
                lineTo(10.3386f, 15.7446f)
                lineTo(10.3386f, 15.7446f)
                lineTo(10.8692f, 15.2145f)
                close()
                moveTo(8.8108f, 13.1541f)
                lineTo(9.3414f, 12.624f)
                lineTo(9.3414f, 12.624f)
                lineTo(8.8108f, 13.1541f)
                close()
                moveTo(15.2835f, 12.9971f)
                lineTo(15.0197f, 12.2951f)
                lineTo(15.0197f, 12.2951f)
                lineTo(15.2835f, 12.9971f)
                close()
                moveTo(14.3249f, 13.3573f)
                lineTo(14.5887f, 14.0594f)
                lineTo(14.5887f, 14.0594f)
                lineTo(14.3249f, 13.3573f)
                close()
                moveTo(10.6661f, 9.6909f)
                lineTo(9.9619f, 9.4329f)
                lineTo(9.9619f, 9.4329f)
                lineTo(10.6661f, 9.6909f)
                close()
                moveTo(11.0133f, 8.7432f)
                lineTo(11.7175f, 9.0012f)
                lineTo(11.7175f, 9.0012f)
                lineTo(11.0133f, 8.7432f)
                close()
                moveTo(9.4225f, 10.8367f)
                lineTo(9.6219f, 11.5598f)
                lineTo(9.6219f, 11.5598f)
                lineTo(9.4225f, 10.8367f)
                close()
                moveTo(10.1508f, 10.5676f)
                lineTo(9.7126f, 9.9589f)
                lineTo(9.7126f, 9.9589f)
                lineTo(10.1508f, 10.5676f)
                close()
                moveTo(10.3379f, 10.3952f)
                lineTo(10.9087f, 10.8817f)
                lineTo(10.9087f, 10.8817f)
                lineTo(10.3379f, 10.3952f)
                close()
                moveTo(13.6255f, 13.6902f)
                lineTo(14.1165f, 14.2572f)
                lineTo(14.1165f, 14.2572f)
                lineTo(13.6255f, 13.6902f)
                close()
                moveTo(13.1903f, 14.6006f)
                lineTo(12.4672f, 14.4016f)
                lineTo(12.4672f, 14.4016f)
                lineTo(13.1903f, 14.6006f)
                close()
                moveTo(13.4585f, 13.8733f)
                lineTo(12.8491f, 13.4361f)
                lineTo(12.8491f, 13.4361f)
                lineTo(13.4585f, 13.8733f)
                close()
                moveTo(7.8592f, 11.8776f)
                lineTo(7.1093f, 11.8823f)
                lineTo(7.1093f, 11.8823f)
                lineTo(7.8592f, 11.8776f)
                close()
                moveTo(7.9652f, 11.476f)
                lineTo(7.3153f, 11.1017f)
                lineTo(7.3153f, 11.1017f)
                lineTo(7.9652f, 11.476f)
                close()
                moveTo(12.1526f, 16.1716f)
                lineTo(12.1537f, 15.4216f)
                lineTo(12.1537f, 15.4216f)
                lineTo(12.1526f, 16.1716f)
                close()
                moveTo(12.5466f, 16.0673f)
                lineTo(12.1749f, 15.4159f)
                lineTo(12.1749f, 15.4159f)
                lineTo(12.5466f, 16.0673f)
                close()
                moveTo(12.3486f, 6.518f)
                lineTo(12.5102f, 7.2504f)
                lineTo(12.5102f, 7.2504f)
                lineTo(12.3486f, 6.518f)
                close()
                moveTo(6.9694f, 15.9699f)
                curveTo(6.6767f, 16.263f, 6.6769f, 16.7379f, 6.9699f, 17.0306f)
                curveTo(7.263f, 17.3233f, 7.7379f, 17.3231f, 8.0306f, 17.0301f)
                lineTo(6.9694f, 15.9699f)
                close()
                moveTo(10.3572f, 14.7011f)
                curveTo(10.65f, 14.408f, 10.6497f, 13.9332f, 10.3567f, 13.6404f)
                curveTo(10.0636f, 13.3477f, 9.5888f, 13.3479f, 9.296f, 13.641f)
                lineTo(10.3572f, 14.7011f)
                close()
                moveTo(13.9641f, 8.5052f)
                lineTo(15.5052f, 10.0479f)
                lineTo(16.5664f, 8.9878f)
                lineTo(15.0253f, 7.445f)
                lineTo(13.9641f, 8.5052f)
                close()
                moveTo(11.3998f, 14.6844f)
                lineTo(9.3414f, 12.624f)
                lineTo(8.2802f, 13.6841f)
                lineTo(10.3386f, 15.7446f)
                lineTo(11.3998f, 14.6844f)
                close()
                moveTo(15.0197f, 12.2951f)
                lineTo(14.0611f, 12.6552f)
                lineTo(14.5887f, 14.0594f)
                lineTo(15.5473f, 13.6992f)
                lineTo(15.0197f, 12.2951f)
                close()
                moveTo(11.3703f, 9.9489f)
                lineTo(11.7175f, 9.0012f)
                lineTo(10.3091f, 8.4852f)
                lineTo(9.9619f, 9.4329f)
                lineTo(11.3703f, 9.9489f)
                close()
                moveTo(9.6219f, 11.5598f)
                curveTo(9.9504f, 11.4692f, 10.3003f, 11.3841f, 10.589f, 11.1762f)
                lineTo(9.7126f, 9.9589f)
                curveTo(9.6936f, 9.9726f, 9.6606f, 9.9931f, 9.2232f, 10.1137f)
                lineTo(9.6219f, 11.5598f)
                close()
                moveTo(9.9619f, 9.4329f)
                curveTo(9.8057f, 9.8591f, 9.7824f, 9.8907f, 9.7671f, 9.9087f)
                lineTo(10.9087f, 10.8817f)
                curveTo(11.1395f, 10.6109f, 11.253f, 10.2692f, 11.3703f, 9.9489f)
                lineTo(9.9619f, 9.4329f)
                close()
                moveTo(10.589f, 11.1762f)
                curveTo(10.7071f, 11.0913f, 10.8144f, 10.9923f, 10.9087f, 10.8817f)
                lineTo(9.7671f, 9.9087f)
                curveTo(9.751f, 9.9276f, 9.7327f, 9.9444f, 9.7126f, 9.9589f)
                lineTo(10.589f, 11.1762f)
                close()
                moveTo(14.0611f, 12.6552f)
                curveTo(13.7429f, 12.7748f, 13.403f, 12.8908f, 13.1345f, 13.1233f)
                lineTo(14.1165f, 14.2572f)
                curveTo(14.1342f, 14.2418f, 14.1652f, 14.2185f, 14.5887f, 14.0594f)
                lineTo(14.0611f, 12.6552f)
                close()
                moveTo(13.9134f, 14.7995f)
                curveTo(14.0335f, 14.363f, 14.054f, 14.3298f, 14.0678f, 14.3105f)
                lineTo(12.8491f, 13.4361f)
                curveTo(12.6421f, 13.7245f, 12.5574f, 14.0736f, 12.4672f, 14.4016f)
                lineTo(13.9134f, 14.7995f)
                close()
                moveTo(13.1345f, 13.1233f)
                curveTo(13.0275f, 13.216f, 12.9317f, 13.321f, 12.8491f, 13.4361f)
                lineTo(14.0678f, 14.3105f)
                curveTo(14.0819f, 14.2909f, 14.0982f, 14.273f, 14.1165f, 14.2572f)
                lineTo(13.1345f, 13.1233f)
                close()
                moveTo(9.3414f, 12.624f)
                curveTo(9.0118f, 12.294f, 8.8111f, 12.0914f, 8.6852f, 11.9334f)
                curveTo(8.5584f, 11.7741f, 8.6086f, 11.7796f, 8.6092f, 11.8729f)
                lineTo(7.1093f, 11.8823f)
                curveTo(7.1119f, 12.3016f, 7.3214f, 12.6285f, 7.5116f, 12.8675f)
                curveTo(7.7028f, 13.1077f, 7.9768f, 13.3804f, 8.2802f, 13.6841f)
                lineTo(9.3414f, 12.624f)
                close()
                moveTo(9.2232f, 10.1137f)
                curveTo(8.8095f, 10.2278f, 8.4367f, 10.3294f, 8.1518f, 10.4437f)
                curveTo(7.8683f, 10.5575f, 7.5246f, 10.7383f, 7.3153f, 11.1017f)
                lineTo(8.6152f, 11.8503f)
                curveTo(8.5685f, 11.9314f, 8.5218f, 11.9115f, 8.7106f, 11.8357f)
                curveTo(8.8979f, 11.7605f, 9.1724f, 11.6837f, 9.6219f, 11.5598f)
                lineTo(9.2232f, 10.1137f)
                close()
                moveTo(8.6092f, 11.8729f)
                curveTo(8.6092f, 11.8649f, 8.6112f, 11.8571f, 8.6152f, 11.8503f)
                lineTo(7.3153f, 11.1017f)
                curveTo(7.1786f, 11.3391f, 7.1075f, 11.6085f, 7.1093f, 11.8823f)
                lineTo(8.6092f, 11.8729f)
                close()
                moveTo(10.3386f, 15.7446f)
                curveTo(10.6439f, 16.0502f, 10.918f, 16.3262f, 11.1596f, 16.5186f)
                curveTo(11.3999f, 16.71f, 11.7292f, 16.9209f, 12.1515f, 16.9216f)
                lineTo(12.1537f, 15.4216f)
                curveTo(12.2482f, 15.4217f, 12.2543f, 15.4729f, 12.0941f, 15.3453f)
                curveTo(11.9352f, 15.2188f, 11.7315f, 15.0165f, 11.3998f, 14.6844f)
                lineTo(10.3386f, 15.7446f)
                close()
                moveTo(12.4672f, 14.4016f)
                curveTo(12.3426f, 14.8543f, 12.2653f, 15.131f, 12.1895f, 15.3197f)
                curveTo(12.1132f, 15.5099f, 12.0931f, 15.4626f, 12.1749f, 15.4159f)
                lineTo(12.9184f, 16.7187f)
                curveTo(13.285f, 16.5095f, 13.4671f, 16.1636f, 13.5816f, 15.8785f)
                curveTo(13.6966f, 15.5918f, 13.7987f, 15.2163f, 13.9134f, 14.7995f)
                lineTo(12.4672f, 14.4016f)
                close()
                moveTo(12.1515f, 16.9216f)
                curveTo(12.4204f, 16.922f, 12.6848f, 16.852f, 12.9184f, 16.7187f)
                lineTo(12.1749f, 15.4159f)
                curveTo(12.1684f, 15.4197f, 12.1611f, 15.4216f, 12.1537f, 15.4216f)
                lineTo(12.1515f, 16.9216f)
                close()
                moveTo(15.5052f, 10.0479f)
                curveTo(16.0457f, 10.5889f, 16.3893f, 10.9357f, 16.5946f, 11.2127f)
                curveTo(16.692f, 11.3442f, 16.7296f, 11.4234f, 16.7435f, 11.465f)
                curveTo(16.7496f, 11.4833f, 16.75f, 11.4911f, 16.75f, 11.4913f)
                curveTo(16.75f, 11.4916f, 16.75f, 11.4915f, 16.75f, 11.4912f)
                curveTo(16.75f, 11.491f, 16.75f, 11.4917f, 16.7495f, 11.494f)
                lineTo(18.2156f, 11.811f)
                curveTo(18.3445f, 11.2151f, 18.0948f, 10.7178f, 17.7997f, 10.3196f)
                curveTo(17.5126f, 9.9321f, 17.0717f, 9.4936f, 16.5664f, 8.9878f)
                lineTo(15.5052f, 10.0479f)
                close()
                moveTo(15.5473f, 13.6992f)
                curveTo(16.2163f, 13.4479f, 16.7989f, 13.2311f, 17.2205f, 12.9971f)
                curveTo(17.6538f, 12.7566f, 18.0868f, 12.407f, 18.2156f, 11.811f)
                lineTo(16.7495f, 11.494f)
                curveTo(16.749f, 11.4962f, 16.7487f, 11.4969f, 16.7488f, 11.4966f)
                curveTo(16.7489f, 11.4964f, 16.749f, 11.4962f, 16.7489f, 11.4965f)
                curveTo(16.7488f, 11.4966f, 16.7452f, 11.5035f, 16.7322f, 11.5176f)
                curveTo(16.7025f, 11.5496f, 16.6356f, 11.6061f, 16.4926f, 11.6855f)
                curveTo(16.1914f, 11.8527f, 15.7354f, 12.0262f, 15.0197f, 12.2951f)
                lineTo(15.5473f, 13.6992f)
                close()
                moveTo(15.0253f, 7.445f)
                curveTo(14.5162f, 6.9354f, 14.0752f, 6.4912f, 13.6858f, 6.2021f)
                curveTo(13.2862f, 5.9054f, 12.786f, 5.6535f, 12.187f, 5.7856f)
                lineTo(12.5102f, 7.2504f)
                curveTo(12.5123f, 7.25f, 12.513f, 7.2499f, 12.5125f, 7.25f)
                curveTo(12.5121f, 7.25f, 12.5118f, 7.25f, 12.512f, 7.25f)
                curveTo(12.5123f, 7.25f, 12.5142f, 7.2502f, 12.518f, 7.2509f)
                curveTo(12.5219f, 7.2517f, 12.5284f, 7.2533f, 12.5378f, 7.2564f)
                curveTo(12.5795f, 7.2703f, 12.6591f, 7.3081f, 12.7917f, 7.4065f)
                curveTo(13.0705f, 7.6135f, 13.4197f, 7.9602f, 13.9641f, 8.5052f)
                lineTo(15.0253f, 7.445f)
                close()
                moveTo(11.7175f, 9.0012f)
                curveTo(11.9826f, 8.2777f, 12.1539f, 7.816f, 12.32f, 7.5108f)
                curveTo(12.3989f, 7.3657f, 12.4554f, 7.2978f, 12.4875f, 7.2676f)
                curveTo(12.4947f, 7.2608f, 12.5f, 7.2566f, 12.5032f, 7.2542f)
                curveTo(12.5064f, 7.2519f, 12.5081f, 7.251f, 12.5083f, 7.2508f)
                curveTo(12.5085f, 7.2507f, 12.5083f, 7.2509f, 12.5079f, 7.251f)
                curveTo(12.5075f, 7.2512f, 12.5081f, 7.2509f, 12.5102f, 7.2504f)
                lineTo(12.187f, 5.7856f)
                curveTo(11.5883f, 5.9177f, 11.2403f, 6.3566f, 11.0024f, 6.7938f)
                curveTo(10.7706f, 7.2199f, 10.557f, 7.8085f, 10.3091f, 8.4852f)
                lineTo(11.7175f, 9.0012f)
                close()
                moveTo(8.0306f, 17.0301f)
                lineTo(10.3572f, 14.7011f)
                lineTo(9.296f, 13.641f)
                lineTo(6.9694f, 15.9699f)
                lineTo(8.0306f, 17.0301f)
                close()
            }
        }
        .build()
        return _pinCircle!!
    }

private var _pinCircle: ImageVector? = null
