package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Masks: ImageVector
    get() {
        if (_masks != null) {
            return _masks!!
        }
        _masks = Builder(
            name = "Masks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0053f, 13.368f)
                curveTo(6.034f, 13.072f, 6.2643f, 12.7673f, 6.643f, 12.6658f)
                curveTo(7.0217f, 12.5644f, 7.3735f, 12.7131f, 7.5464f, 12.9551f)
                curveTo(7.7872f, 13.2921f, 8.2556f, 13.3701f, 8.5926f, 13.1293f)
                curveTo(8.9296f, 12.8885f, 9.0077f, 12.4201f, 8.7669f, 12.0831f)
                curveTo(8.2164f, 11.3126f, 7.2139f, 10.96f, 6.2548f, 11.217f)
                curveTo(5.2957f, 11.4739f, 4.6038f, 12.2806f, 4.5123f, 13.2231f)
                curveTo(4.4723f, 13.6354f, 4.7741f, 14.002f, 5.1864f, 14.042f)
                curveTo(5.5986f, 14.0821f, 5.9653f, 13.7803f, 6.0053f, 13.368f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.8012f, 11.8148f)
                curveTo(11.83f, 11.5188f, 12.0602f, 11.2141f, 12.4389f, 11.1126f)
                curveTo(12.8176f, 11.0111f, 13.1694f, 11.1599f, 13.3423f, 11.4019f)
                curveTo(13.5831f, 11.7389f, 14.0515f, 11.8169f, 14.3885f, 11.5761f)
                curveTo(14.7255f, 11.3353f, 14.8035f, 10.8669f, 14.5627f, 10.5299f)
                curveTo(14.0123f, 9.7594f, 13.0098f, 9.4067f, 12.0507f, 9.6637f)
                curveTo(11.0916f, 9.9207f, 10.3997f, 10.7274f, 10.3082f, 11.6699f)
                curveTo(10.2682f, 12.0821f, 10.57f, 12.4488f, 10.9823f, 12.4888f)
                curveTo(11.3945f, 12.5288f, 11.7612f, 12.2271f, 11.8012f, 11.8148f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.2006f, 16.231f)
                lineTo(13.6476f, 15.6287f)
                curveTo(13.9802f, 15.8756f, 14.0497f, 16.3454f, 13.8029f, 16.678f)
                curveTo(13.5583f, 17.0075f, 13.0949f, 17.0788f, 12.7629f, 16.84f)
                lineTo(12.7532f, 16.8337f)
                curveTo(12.7389f, 16.8247f, 12.7107f, 16.8078f, 12.6693f, 16.7865f)
                curveTo(12.5865f, 16.7438f, 12.4515f, 16.6841f, 12.2682f, 16.6343f)
                curveTo(11.9066f, 16.536f, 11.3386f, 16.4711f, 10.5824f, 16.6737f)
                curveTo(9.8263f, 16.8763f, 9.3669f, 17.2165f, 9.1029f, 17.4824f)
                curveTo(8.969f, 17.6172f, 8.882f, 17.7364f, 8.8315f, 17.8148f)
                curveTo(8.8063f, 17.8539f, 8.7904f, 17.8826f, 8.7825f, 17.8976f)
                lineTo(8.7773f, 17.9079f)
                curveTo(8.6091f, 18.2807f, 8.1722f, 18.4507f, 7.7956f, 18.2876f)
                curveTo(7.4155f, 18.123f, 7.2408f, 17.6814f, 7.4054f, 17.3013f)
                lineTo(8.0937f, 17.5994f)
                curveTo(7.4054f, 17.3013f, 7.4053f, 17.3017f, 7.4054f, 17.3013f)
                lineTo(7.4061f, 17.2997f)
                lineTo(7.4069f, 17.298f)
                lineTo(7.4085f, 17.2943f)
                lineTo(7.4124f, 17.2856f)
                lineTo(7.423f, 17.263f)
                curveTo(7.4312f, 17.2457f, 7.442f, 17.2241f, 7.4554f, 17.1986f)
                curveTo(7.4822f, 17.1477f, 7.5199f, 17.0811f, 7.5702f, 17.003f)
                curveTo(7.6707f, 16.8468f, 7.8222f, 16.6433f, 8.0386f, 16.4254f)
                curveTo(8.475f, 15.986f, 9.163f, 15.5011f, 10.1942f, 15.2248f)
                curveTo(11.2255f, 14.9485f, 12.0637f, 15.0244f, 12.6614f, 15.1867f)
                curveTo(12.9577f, 15.2672f, 13.1906f, 15.3677f, 13.3558f, 15.4527f)
                curveTo(13.4384f, 15.4953f, 13.5043f, 15.5341f, 13.553f, 15.5647f)
                curveTo(13.5774f, 15.5801f, 13.5975f, 15.5935f, 13.6133f, 15.6043f)
                lineTo(13.6337f, 15.6186f)
                lineTo(13.6415f, 15.6242f)
                lineTo(13.6448f, 15.6266f)
                lineTo(13.6462f, 15.6277f)
                lineTo(13.6476f, 15.6287f)
                curveTo(13.648f, 15.629f, 13.6476f, 15.6287f, 13.2006f, 16.231f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.2525f, 2.2508f)
                lineTo(13.2939f, 2.2702f)
                curveTo(14.4615f, 2.817f, 14.9862f, 3.0611f, 15.5292f, 3.2334f)
                curveTo(15.7216f, 3.2945f, 15.9159f, 3.3489f, 16.1116f, 3.3966f)
                curveTo(16.6637f, 3.531f, 17.234f, 3.5938f, 18.5069f, 3.7306f)
                lineTo(18.5524f, 3.7354f)
                curveTo(19.3605f, 3.8223f, 20.0326f, 3.8945f, 20.562f, 4.0156f)
                curveTo(21.1159f, 4.1423f, 21.6163f, 4.3432f, 22.0104f, 4.7577f)
                curveTo(22.2395f, 4.9987f, 22.424f, 5.2793f, 22.5563f, 5.5855f)
                curveTo(22.781f, 6.1057f, 22.7825f, 6.6494f, 22.7f, 7.2244f)
                curveTo(22.6205f, 7.7791f, 22.4468f, 8.4566f, 22.2356f, 9.2808f)
                lineTo(21.3798f, 12.6196f)
                curveTo(20.6637f, 15.4133f, 18.8467f, 16.9655f, 17.0235f, 17.8086f)
                curveTo(16.298f, 19.3831f, 15.1596f, 20.5897f, 14.2193f, 21.3923f)
                lineTo(14.198f, 21.4105f)
                curveTo(13.9475f, 21.6244f, 13.7013f, 21.8347f, 13.3782f, 22.0194f)
                curveTo(13.0425f, 22.2113f, 12.654f, 22.36f, 12.1093f, 22.5126f)
                curveTo(11.565f, 22.665f, 11.1564f, 22.7397f, 10.7715f, 22.749f)
                curveTo(10.4006f, 22.758f, 10.0841f, 22.7042f, 9.765f, 22.6499f)
                lineTo(9.7373f, 22.6452f)
                curveTo(7.4159f, 22.2507f, 3.7254f, 20.9314f, 2.6202f, 16.6196f)
                lineTo(1.7644f, 13.2807f)
                curveTo(1.5532f, 12.4566f, 1.3795f, 11.7791f, 1.3f, 11.2244f)
                curveTo(1.2176f, 10.6494f, 1.219f, 10.1057f, 1.4438f, 9.5855f)
                curveTo(1.576f, 9.2793f, 1.7605f, 8.9987f, 1.9897f, 8.7577f)
                curveTo(2.3838f, 8.3432f, 2.8841f, 8.1423f, 3.4381f, 8.0156f)
                curveTo(3.9674f, 7.8945f, 4.6395f, 7.8223f, 5.4476f, 7.7354f)
                lineTo(5.4932f, 7.7305f)
                curveTo(6.0121f, 7.6748f, 6.4142f, 7.6313f, 6.746f, 7.5903f)
                lineTo(7.3712f, 5.1511f)
                curveTo(7.5823f, 4.3274f, 7.756f, 3.6497f, 7.9526f, 3.1274f)
                curveTo(8.1558f, 2.5873f, 8.4193f, 2.1097f, 8.8726f, 1.7692f)
                curveTo(9.1383f, 1.5697f, 9.4376f, 1.4205f, 9.7567f, 1.33f)
                curveTo(10.3069f, 1.1741f, 10.8414f, 1.2644f, 11.3789f, 1.4433f)
                curveTo(11.8948f, 1.6149f, 12.5108f, 1.9034f, 13.2525f, 2.2508f)
                close()
                moveTo(19.9268f, 12.2472f)
                curveTo(19.5147f, 13.8549f, 18.6663f, 14.9481f, 17.6642f, 15.697f)
                curveTo(17.8134f, 14.7225f, 17.7824f, 13.6519f, 17.4847f, 12.4904f)
                lineTo(16.5537f, 8.8583f)
                curveTo(16.6853f, 8.8073f, 16.804f, 8.7186f, 16.8921f, 8.5952f)
                curveTo(17.065f, 8.3532f, 17.4168f, 8.2045f, 17.7955f, 8.306f)
                curveTo(18.1742f, 8.4074f, 18.4045f, 8.7121f, 18.4332f, 9.0082f)
                curveTo(18.4732f, 9.4204f, 18.8399f, 9.7222f, 19.2521f, 9.6822f)
                curveTo(19.6644f, 9.6421f, 19.9662f, 9.2755f, 19.9262f, 8.8632f)
                curveTo(19.8347f, 7.9207f, 19.1429f, 7.1141f, 18.1837f, 6.8571f)
                curveTo(17.4379f, 6.6572f, 16.6658f, 6.8261f, 16.1004f, 7.2734f)
                curveTo(16.0829f, 7.2234f, 16.0653f, 7.1748f, 16.0475f, 7.1274f)
                curveTo(15.8442f, 6.5873f, 15.5807f, 6.1097f, 15.1274f, 5.7692f)
                curveTo(14.8617f, 5.5697f, 14.5624f, 5.4205f, 14.2434f, 5.33f)
                curveTo(13.7234f, 5.1827f, 13.2175f, 5.2552f, 12.7098f, 5.4146f)
                curveTo(12.6065f, 5.3708f, 12.499f, 5.3337f, 12.3878f, 5.3039f)
                curveTo(11.4287f, 5.0469f, 10.4262f, 5.3995f, 9.8757f, 6.17f)
                curveTo(9.7579f, 6.335f, 9.7164f, 6.5315f, 9.7443f, 6.7173f)
                curveTo(9.1936f, 6.9688f, 8.8364f, 7.1174f, 8.4708f, 7.2334f)
                curveTo(8.4402f, 7.2431f, 8.4094f, 7.2527f, 8.3786f, 7.2621f)
                lineTo(8.8135f, 5.5655f)
                curveTo(9.038f, 4.6893f, 9.1922f, 4.092f, 9.3564f, 3.6557f)
                curveTo(9.5173f, 3.2283f, 9.6515f, 3.0602f, 9.7735f, 2.9686f)
                curveTo(9.8935f, 2.8784f, 10.0265f, 2.8127f, 10.1658f, 2.7732f)
                curveTo(10.2992f, 2.7353f, 10.495f, 2.73f, 10.9054f, 2.8666f)
                curveTo(11.3278f, 3.0071f, 11.864f, 3.2569f, 12.6578f, 3.6286f)
                lineTo(12.7112f, 3.6536f)
                curveTo(13.8114f, 4.1688f, 14.428f, 4.4576f, 15.0754f, 4.6631f)
                curveTo(15.3004f, 4.7345f, 15.5277f, 4.7982f, 15.7568f, 4.854f)
                curveTo(16.4162f, 5.0145f, 17.0891f, 5.0868f, 18.288f, 5.2157f)
                lineTo(18.3466f, 5.222f)
                curveTo(19.2119f, 5.315f, 19.7949f, 5.3789f, 20.2274f, 5.4778f)
                curveTo(20.6453f, 5.5734f, 20.8181f, 5.6806f, 20.9233f, 5.7913f)
                curveTo(21.0289f, 5.9024f, 21.116f, 6.0339f, 21.1792f, 6.1803f)
                curveTo(21.246f, 6.3349f, 21.2802f, 6.5584f, 21.2152f, 7.0115f)
                curveTo(21.1487f, 7.4757f, 20.9964f, 8.0739f, 20.7719f, 8.9498f)
                lineTo(19.9268f, 12.2472f)
                close()
                moveTo(13.0947f, 6.8666f)
                curveTo(12.6722f, 7.0071f, 12.136f, 7.2569f, 11.3423f, 7.6286f)
                lineTo(11.2888f, 7.6536f)
                curveTo(10.1887f, 8.1688f, 9.572f, 8.4576f, 8.9247f, 8.6631f)
                curveTo(8.6996f, 8.7345f, 8.4724f, 8.7982f, 8.2432f, 8.854f)
                curveTo(7.5838f, 9.0145f, 6.9109f, 9.0868f, 5.712f, 9.2157f)
                lineTo(5.6534f, 9.222f)
                curveTo(4.7881f, 9.315f, 4.2051f, 9.3789f, 3.7726f, 9.4778f)
                curveTo(3.3548f, 9.5734f, 3.182f, 9.6806f, 3.0767f, 9.7913f)
                curveTo(2.9711f, 9.9024f, 2.884f, 10.0339f, 2.8208f, 10.1803f)
                curveTo(2.754f, 10.3349f, 2.7198f, 10.5583f, 2.7848f, 11.0115f)
                curveTo(2.8514f, 11.4757f, 3.0036f, 12.0739f, 3.2281f, 12.9498f)
                lineTo(4.0733f, 16.2472f)
                curveTo(4.955f, 19.6873f, 7.8707f, 20.8065f, 9.9886f, 21.1664f)
                curveTo(10.3372f, 21.2256f, 10.521f, 21.2547f, 10.7351f, 21.2495f)
                curveTo(10.9459f, 21.2443f, 11.2207f, 21.2037f, 11.7047f, 21.0682f)
                curveTo(12.1882f, 20.9327f, 12.4468f, 20.824f, 12.6338f, 20.7171f)
                curveTo(12.8244f, 20.6082f, 12.972f, 20.4849f, 13.2455f, 20.2515f)
                curveTo(14.9144f, 18.8268f, 16.9167f, 16.3157f, 16.0317f, 12.8628f)
                lineTo(15.1866f, 9.5655f)
                curveTo(14.962f, 8.6893f, 14.8078f, 8.092f, 14.6436f, 7.6557f)
                curveTo(14.4827f, 7.2283f, 14.3485f, 7.0602f, 14.2266f, 6.9686f)
                curveTo(14.1065f, 6.8784f, 13.9735f, 6.8127f, 13.8342f, 6.7732f)
                curveTo(13.7008f, 6.7354f, 13.505f, 6.73f, 13.0947f, 6.8666f)
                close()
            }
        }
            .build()
        return _masks!!
    }

private var _masks: ImageVector? = null
