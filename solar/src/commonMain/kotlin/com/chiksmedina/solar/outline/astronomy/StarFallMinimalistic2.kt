package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.StarFallMinimalistic2: ImageVector
    get() {
        if (_starFallMinimalistic2 != null) {
            return _starFallMinimalistic2!!
        }
        _starFallMinimalistic2 = Builder(
            name = "StarFallMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.6415f, 5.1377f)
                curveTo(13.3348f, 5.5382f, 12.9854f, 6.1611f, 12.4665f, 7.0919f)
                lineTo(12.2043f, 7.5622f)
                curveTo(12.187f, 7.5932f, 12.1699f, 7.6241f, 12.1528f, 7.6549f)
                curveTo(11.918f, 8.0781f, 11.6998f, 8.4713f, 11.3463f, 8.7396f)
                curveTo(10.9884f, 9.0113f, 10.5534f, 9.1088f, 10.0952f, 9.2114f)
                curveTo(10.0619f, 9.2189f, 10.0286f, 9.2264f, 9.9951f, 9.2339f)
                lineTo(9.486f, 9.3491f)
                curveTo(8.4767f, 9.5775f, 7.8071f, 9.7312f, 7.3525f, 9.9104f)
                curveTo(6.912f, 10.084f, 6.8676f, 10.2073f, 6.851f, 10.2609f)
                curveTo(6.8318f, 10.3227f, 6.803f, 10.465f, 7.0677f, 10.8855f)
                curveTo(7.3376f, 11.3141f, 7.7961f, 11.8533f, 8.4829f, 12.6565f)
                lineTo(8.83f, 13.0623f)
                curveTo(8.8522f, 13.0883f, 8.8743f, 13.114f, 8.8963f, 13.1397f)
                curveTo(9.2118f, 13.5072f, 9.5008f, 13.8441f, 9.6337f, 14.2715f)
                curveTo(9.7657f, 14.6958f, 9.7219f, 15.1401f, 9.6735f, 15.631f)
                curveTo(9.6701f, 15.6653f, 9.6667f, 15.6997f, 9.6634f, 15.7344f)
                lineTo(9.6109f, 16.2759f)
                curveTo(9.5071f, 17.3464f, 9.4391f, 18.0675f, 9.4621f, 18.5829f)
                curveTo(9.485f, 19.097f, 9.5923f, 19.1849f, 9.6265f, 19.2108f)
                curveTo(9.6271f, 19.2112f, 9.6277f, 19.2117f, 9.6284f, 19.2123f)
                curveTo(9.6532f, 19.2315f, 9.7468f, 19.3041f, 10.1935f, 19.1761f)
                curveTo(10.6621f, 19.0419f, 11.2906f, 18.7548f, 12.2357f, 18.3197f)
                lineTo(12.7124f, 18.1002f)
                curveTo(12.7443f, 18.0855f, 12.7762f, 18.0708f, 12.8079f, 18.0561f)
                curveTo(13.2337f, 17.8589f, 13.6418f, 17.6699f, 14.0889f, 17.6699f)
                curveTo(14.5359f, 17.6699f, 14.9441f, 17.8589f, 15.3698f, 18.0561f)
                curveTo(15.4016f, 18.0708f, 15.4334f, 18.0855f, 15.4654f, 18.1002f)
                lineTo(15.942f, 18.3197f)
                curveTo(16.8871f, 18.7548f, 17.5156f, 19.0419f, 17.9842f, 19.1761f)
                curveTo(18.4309f, 19.3041f, 18.5245f, 19.2315f, 18.5494f, 19.2123f)
                curveTo(18.5501f, 19.2117f, 18.5507f, 19.2112f, 18.5513f, 19.2108f)
                curveTo(18.5854f, 19.1849f, 18.6928f, 19.097f, 18.7157f, 18.5829f)
                curveTo(18.7386f, 18.0675f, 18.6706f, 17.3464f, 18.5668f, 16.2759f)
                lineTo(18.5144f, 15.7344f)
                curveTo(18.511f, 15.6997f, 18.5076f, 15.6652f, 18.5042f, 15.631f)
                curveTo(18.4558f, 15.1401f, 18.412f, 14.6958f, 18.544f, 14.2715f)
                curveTo(18.6769f, 13.8441f, 18.966f, 13.5072f, 19.2815f, 13.1396f)
                curveTo(19.3034f, 13.114f, 19.3255f, 13.0883f, 19.3477f, 13.0623f)
                lineTo(19.6948f, 12.6565f)
                curveTo(20.3816f, 11.8533f, 20.8402f, 11.3141f, 21.11f, 10.8855f)
                curveTo(21.3747f, 10.465f, 21.346f, 10.3227f, 21.3268f, 10.2609f)
                curveTo(21.3101f, 10.2073f, 21.2657f, 10.084f, 20.8252f, 9.9104f)
                curveTo(20.3706f, 9.7312f, 19.7011f, 9.5775f, 18.6917f, 9.3491f)
                lineTo(18.1826f, 9.2339f)
                curveTo(18.1492f, 9.2264f, 18.1158f, 9.2189f, 18.0825f, 9.2114f)
                curveTo(17.6244f, 9.1088f, 17.1893f, 9.0113f, 16.8314f, 8.7396f)
                curveTo(16.478f, 8.4713f, 16.2598f, 8.0781f, 16.0249f, 7.6549f)
                curveTo(16.0079f, 7.6241f, 15.9907f, 7.5932f, 15.9734f, 7.5622f)
                lineTo(15.7112f, 7.0919f)
                curveTo(15.1924f, 6.1611f, 14.8429f, 5.5382f, 14.5362f, 5.1377f)
                curveTo(14.2377f, 4.7478f, 14.1143f, 4.7496f, 14.0905f, 4.75f)
                curveTo(14.0899f, 4.75f, 14.0894f, 4.75f, 14.0889f, 4.75f)
                curveTo(14.0884f, 4.75f, 14.0878f, 4.75f, 14.0872f, 4.75f)
                curveTo(14.0634f, 4.7496f, 13.9401f, 4.7478f, 13.6415f, 5.1377f)
                close()
                moveTo(12.4506f, 4.2257f)
                curveTo(12.8403f, 3.7168f, 13.3505f, 3.25f, 14.0889f, 3.25f)
                curveTo(14.8273f, 3.25f, 15.3374f, 3.7168f, 15.7271f, 4.2257f)
                curveTo(16.1086f, 4.7238f, 16.5104f, 5.4447f, 16.9915f, 6.3079f)
                lineTo(17.2836f, 6.8318f)
                curveTo(17.6041f, 7.4068f, 17.6686f, 7.4919f, 17.7384f, 7.5449f)
                curveTo(17.8035f, 7.5943f, 17.89f, 7.6298f, 18.5137f, 7.7709f)
                lineTo(19.0842f, 7.9f)
                curveTo(20.0156f, 8.1107f, 20.8f, 8.2881f, 21.3752f, 8.5148f)
                curveTo(21.9771f, 8.752f, 22.5417f, 9.1163f, 22.7591f, 9.8155f)
                curveTo(22.974f, 10.5064f, 22.7269f, 11.1326f, 22.3794f, 11.6846f)
                curveTo(22.0439f, 12.2176f, 21.5113f, 12.8403f, 20.8741f, 13.5854f)
                lineTo(20.8348f, 13.6314f)
                lineTo(20.4877f, 14.0372f)
                curveTo(20.066f, 14.5303f, 20.0057f, 14.6226f, 19.9763f, 14.7169f)
                curveTo(19.946f, 14.8144f, 19.9437f, 14.9324f, 20.0074f, 15.5897f)
                lineTo(20.0656f, 16.1906f)
                curveTo(20.1621f, 17.1865f, 20.2424f, 18.0148f, 20.2142f, 18.6496f)
                curveTo(20.1853f, 19.2982f, 20.0369f, 19.9663f, 19.4582f, 20.4055f)
                curveTo(18.8673f, 20.8541f, 18.1865f, 20.7945f, 17.571f, 20.6181f)
                curveTo(16.9782f, 20.4483f, 16.2443f, 20.1103f, 15.3724f, 19.7088f)
                lineTo(14.838f, 19.4627f)
                curveTo(14.2516f, 19.1927f, 14.1634f, 19.1699f, 14.0889f, 19.1699f)
                curveTo(14.0143f, 19.1699f, 13.9262f, 19.1927f, 13.3397f, 19.4627f)
                lineTo(12.8053f, 19.7088f)
                curveTo(11.9334f, 20.1103f, 11.1995f, 20.4483f, 10.6067f, 20.6181f)
                curveTo(9.9912f, 20.7945f, 9.3104f, 20.8541f, 8.7195f, 20.4055f)
                curveTo(8.1408f, 19.9663f, 7.9925f, 19.2982f, 7.9636f, 18.6496f)
                curveTo(7.9353f, 18.0148f, 8.0156f, 17.1864f, 8.1121f, 16.1905f)
                lineTo(8.1704f, 15.5897f)
                curveTo(8.234f, 14.9324f, 8.2317f, 14.8144f, 8.2014f, 14.7169f)
                curveTo(8.1721f, 14.6226f, 8.1117f, 14.5303f, 7.69f, 14.0372f)
                lineTo(7.3036f, 13.5854f)
                curveTo(6.6664f, 12.8403f, 6.1339f, 12.2176f, 5.7983f, 11.6846f)
                curveTo(5.4508f, 11.1326f, 5.2038f, 10.5064f, 5.4186f, 9.8155f)
                curveTo(5.636f, 9.1163f, 6.2007f, 8.752f, 6.8025f, 8.5148f)
                curveTo(7.3777f, 8.2882f, 8.1621f, 8.1107f, 9.0936f, 7.9f)
                lineTo(9.6641f, 7.7709f)
                curveTo(10.2877f, 7.6298f, 10.3742f, 7.5943f, 10.4393f, 7.5449f)
                curveTo(10.5092f, 7.4919f, 10.5736f, 7.4068f, 10.8941f, 6.8318f)
                lineTo(11.1862f, 6.3079f)
                curveTo(11.6673f, 5.4447f, 12.0692f, 4.7238f, 12.4506f, 4.2257f)
                close()
                moveTo(8.7454f, 5.2023f)
                curveTo(6.7638f, 4.6312f, 4.6381f, 4.9329f, 2.5872f, 6.134f)
                lineTo(2.379f, 6.2558f)
                curveTo(2.0216f, 6.4652f, 1.5621f, 6.3451f, 1.3528f, 5.9877f)
                curveTo(1.1435f, 5.6302f, 1.2636f, 5.1708f, 1.621f, 4.9615f)
                lineTo(1.8291f, 4.8396f)
                curveTo(4.1896f, 3.4573f, 6.7369f, 3.0625f, 9.1607f, 3.7609f)
                lineTo(9.3686f, 3.8208f)
                curveTo(9.7666f, 3.9355f, 9.9963f, 4.3512f, 9.8816f, 4.7492f)
                curveTo(9.7669f, 5.1472f, 9.3513f, 5.3769f, 8.9532f, 5.2622f)
                lineTo(8.7454f, 5.2023f)
                close()
                moveTo(4.8362f, 9.9363f)
                curveTo(4.8713f, 10.3491f, 4.5652f, 10.7121f, 4.1525f, 10.7473f)
                curveTo(3.9994f, 10.7603f, 3.8819f, 10.7678f, 3.7835f, 10.774f)
                curveTo(3.6061f, 10.7853f, 3.4906f, 10.7926f, 3.3389f, 10.8217f)
                curveTo(3.1424f, 10.8595f, 2.8873f, 10.9393f, 2.4243f, 11.1708f)
                curveTo(2.0538f, 11.3561f, 1.6033f, 11.2059f, 1.4181f, 10.8354f)
                curveTo(1.2328f, 10.4649f, 1.383f, 10.0144f, 1.7535f, 9.8292f)
                curveTo(2.2905f, 9.5607f, 2.6802f, 9.4208f, 3.0561f, 9.3486f)
                curveTo(3.3031f, 9.3012f, 3.5579f, 9.2846f, 3.7871f, 9.2697f)
                curveTo(3.8704f, 9.2643f, 3.9503f, 9.2591f, 4.0252f, 9.2527f)
                curveTo(4.4379f, 9.2176f, 4.801f, 9.5236f, 4.8362f, 9.9363f)
                close()
                moveTo(5.9177f, 15.856f)
                curveTo(4.7338f, 15.5785f, 3.4864f, 15.8537f, 2.553f, 16.5891f)
                curveTo(2.2277f, 16.8455f, 1.7561f, 16.7895f, 1.4998f, 16.4642f)
                curveTo(1.2434f, 16.1388f, 1.2993f, 15.6673f, 1.6247f, 15.4109f)
                curveTo(2.9225f, 14.3883f, 4.639f, 14.0157f, 6.26f, 14.3955f)
                curveTo(6.6633f, 14.49f, 6.9136f, 14.8936f, 6.8191f, 15.2968f)
                curveTo(6.7246f, 15.7001f, 6.321f, 15.9505f, 5.9177f, 15.856f)
                close()
            }
        }
            .build()
        return _starFallMinimalistic2!!
    }

private var _starFallMinimalistic2: ImageVector? = null
