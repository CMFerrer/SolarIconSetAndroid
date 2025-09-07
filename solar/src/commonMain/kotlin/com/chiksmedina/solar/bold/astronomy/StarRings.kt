package com.chiksmedina.solar.bold.astronomy

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
import com.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.StarRings: ImageVector
    get() {
        if (_starRings != null) {
            return _starRings!!
        }
        _starRings = Builder(
            name = "StarRings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6982f, 3.7536f)
                curveTo(16.6292f, 3.2989f, 17.6651f, 3.0442f, 18.5283f, 3.4615f)
                curveTo(18.9884f, 3.684f, 19.3067f, 4.0566f, 19.4993f, 4.5002f)
                curveTo(19.6743f, 4.9032f, 19.7456f, 5.3616f, 19.7497f, 5.8358f)
                curveTo(19.7532f, 6.2344f, 19.7093f, 6.6649f, 19.6252f, 7.1178f)
                curveTo(19.4982f, 7.8025f, 19.2778f, 8.5467f, 18.9815f, 9.3227f)
                curveTo(18.9505f, 9.4039f, 18.9069f, 9.4767f, 18.8538f, 9.5395f)
                curveTo(19.0391f, 9.6021f, 19.2198f, 9.6664f, 19.3959f, 9.7324f)
                lineTo(19.3975f, 9.733f)
                curveTo(19.4442f, 9.7505f, 19.4954f, 9.77f, 19.5413f, 9.7877f)
                curveTo(19.6747f, 9.8392f, 19.8052f, 9.8917f, 19.9328f, 9.945f)
                curveTo(20.2587f, 10.0815f, 20.5652f, 10.224f, 20.8498f, 10.3719f)
                curveTo(21.1424f, 10.5239f, 21.4155f, 10.6833f, 21.6655f, 10.8499f)
                curveTo(22.5277f, 11.4244f, 23.2702f, 12.1904f, 23.3452f, 13.1462f)
                curveTo(23.3852f, 13.6557f, 23.224f, 14.1185f, 22.9381f, 14.5086f)
                curveTo(22.6784f, 14.8629f, 22.3186f, 15.1558f, 21.9113f, 15.3985f)
                curveTo(21.5689f, 15.6025f, 21.1749f, 15.7818f, 20.7415f, 15.9377f)
                curveTo(20.0862f, 16.1733f, 19.3325f, 16.3585f, 18.513f, 16.4941f)
                curveTo(18.1043f, 16.5617f, 17.7182f, 16.2853f, 17.6506f, 15.8766f)
                curveTo(17.5829f, 15.4679f, 17.8594f, 15.0818f, 18.2681f, 15.0142f)
                curveTo(18.8299f, 14.9212f, 19.3338f, 14.8067f, 19.7749f, 14.676f)
                lineTo(19.78f, 14.6744f)
                curveTo(20.346f, 14.5064f, 20.8017f, 14.3136f, 21.1435f, 14.1099f)
                curveTo(21.4378f, 13.9346f, 21.6227f, 13.766f, 21.7283f, 13.6219f)
                curveTo(21.8336f, 13.4782f, 21.8578f, 13.3649f, 21.8498f, 13.2636f)
                curveTo(21.8313f, 13.0276f, 21.6028f, 12.6106f, 20.8337f, 12.0982f)
                curveTo(20.6351f, 11.9658f, 20.4097f, 11.8336f, 20.1583f, 11.703f)
                lineTo(18.862f, 11.1341f)
                curveTo(17.1091f, 10.478f, 14.7612f, 9.976f, 12.1765f, 9.7957f)
                curveTo(11.8557f, 9.7733f, 11.5395f, 9.7565f, 11.2284f, 9.7449f)
                curveTo(10.812f, 10.2712f, 10.4009f, 10.8295f, 10.0015f, 11.4152f)
                curveTo(9.2578f, 12.5061f, 8.633f, 13.5782f, 8.1361f, 14.5844f)
                curveTo(8.4508f, 14.7636f, 8.5975f, 15.1499f, 8.466f, 15.4997f)
                curveTo(8.3232f, 15.8793f, 7.9056f, 16.0752f, 7.5243f, 15.9464f)
                curveTo(7.2981f, 16.5091f, 7.1198f, 17.0399f, 6.9914f, 17.5285f)
                curveTo(6.9779f, 17.5799f, 6.965f, 17.6307f, 6.9526f, 17.6808f)
                lineTo(6.9504f, 17.6901f)
                curveTo(6.7549f, 18.489f, 6.7119f, 19.115f, 6.7805f, 19.5518f)
                curveTo(6.8071f, 19.7214f, 6.8471f, 19.8469f, 6.8931f, 19.9404f)
                curveTo(6.9635f, 20.0829f, 7.048f, 20.1512f, 7.1206f, 20.1871f)
                lineTo(7.1245f, 20.189f)
                curveTo(7.1678f, 20.2099f, 7.2211f, 20.2276f, 7.2881f, 20.2385f)
                curveTo(7.4107f, 20.2586f, 7.5788f, 20.2562f, 7.8001f, 20.2085f)
                curveTo(8.1998f, 20.1224f, 8.7068f, 19.9032f, 9.301f, 19.5308f)
                curveTo(9.4383f, 19.4448f, 9.5789f, 19.3514f, 9.7227f, 19.2508f)
                curveTo(9.9623f, 19.0829f, 10.2097f, 18.8955f, 10.4631f, 18.6891f)
                lineTo(11.6385f, 17.734f)
                curveTo(11.96f, 17.4728f, 12.4323f, 17.5217f, 12.6935f, 17.8431f)
                curveTo(12.9547f, 18.1646f, 12.9059f, 18.637f, 12.5844f, 18.8982f)
                lineTo(11.4101f, 19.8524f)
                curveTo(11.1314f, 20.0793f, 10.8551f, 20.2889f, 10.5831f, 20.4794f)
                curveTo(10.4199f, 20.5937f, 10.2579f, 20.7014f, 10.0975f, 20.8019f)
                curveTo(9.4199f, 21.2265f, 8.7471f, 21.5389f, 8.116f, 21.6749f)
                curveTo(7.7596f, 21.7516f, 7.3969f, 21.7764f, 7.0454f, 21.7188f)
                curveTo(6.8484f, 21.6865f, 6.6553f, 21.6283f, 6.4715f, 21.5394f)
                lineTo(6.4552f, 21.5314f)
                curveTo(5.7257f, 21.1703f, 5.3897f, 20.4583f, 5.2878f, 19.7107f)
                curveTo(5.1868f, 18.9698f, 5.2935f, 18.0875f, 5.5406f, 17.1472f)
                curveTo(5.6812f, 16.6126f, 5.8715f, 16.0425f, 6.1086f, 15.4467f)
                lineTo(5.6019f, 15.2678f)
                curveTo(5.2653f, 15.1416f, 4.945f, 15.0088f, 4.6433f, 14.8701f)
                curveTo(4.4622f, 14.7868f, 4.2876f, 14.7012f, 4.1199f, 14.6134f)
                curveTo(3.4115f, 14.2425f, 2.8023f, 13.8191f, 2.3666f, 13.3428f)
                curveTo(2.1205f, 13.0738f, 1.9162f, 12.7731f, 1.7886f, 12.4405f)
                curveTo(1.7172f, 12.2541f, 1.6701f, 12.058f, 1.6541f, 11.8545f)
                lineTo(1.6527f, 11.8364f)
                curveTo(1.5965f, 11.0244f, 2.0419f, 10.3751f, 2.636f, 9.91f)
                curveTo(3.2248f, 9.449f, 4.0404f, 9.0962f, 4.977f, 8.8352f)
                curveTo(6.4645f, 8.4208f, 8.3869f, 8.2031f, 10.5287f, 8.2275f)
                curveTo(11.5421f, 7.0127f, 12.5875f, 5.9647f, 13.5885f, 5.1496f)
                lineTo(13.5898f, 5.1485f)
                curveTo(13.6285f, 5.1171f, 13.6712f, 5.0826f, 13.7096f, 5.0519f)
                curveTo(13.8213f, 4.9627f, 13.9325f, 4.8765f, 14.0429f, 4.7933f)
                curveTo(14.3251f, 4.5807f, 14.6028f, 4.388f, 14.874f, 4.2168f)
                curveTo(15.1529f, 4.0408f, 15.4283f, 3.8854f, 15.6982f, 3.7536f)
                close()
                moveTo(12.4458f, 8.3113f)
                curveTo(14.2717f, 8.4484f, 16.0099f, 8.7403f, 17.5361f, 9.1447f)
                curveTo(17.5219f, 9.0276f, 17.5352f, 8.9055f, 17.5802f, 8.7877f)
                curveTo(17.7833f, 8.2557f, 17.9386f, 7.7628f, 18.0482f, 7.316f)
                lineTo(18.0495f, 7.3108f)
                curveTo(18.1899f, 6.7373f, 18.2532f, 6.2466f, 18.2498f, 5.8488f)
                curveTo(18.2468f, 5.5062f, 18.1945f, 5.2615f, 18.1234f, 5.0976f)
                curveTo(18.0525f, 4.9343f, 17.9668f, 4.8562f, 17.8753f, 4.8119f)
                curveTo(17.6622f, 4.7089f, 17.1869f, 4.6958f, 16.3565f, 5.1014f)
                curveTo(16.142f, 5.2062f, 15.9141f, 5.3341f, 15.6746f, 5.4853f)
                lineTo(14.5295f, 6.3177f)
                curveTo(13.8598f, 6.8636f, 13.1546f, 7.5355f, 12.4458f, 8.3113f)
                close()
                moveTo(9.3483f, 9.7398f)
                curveTo(7.8f, 9.7917f, 6.4427f, 9.984f, 5.3795f, 10.2802f)
                curveTo(5.3283f, 10.2945f, 5.2779f, 10.309f, 5.2285f, 10.3236f)
                lineTo(5.2194f, 10.3264f)
                curveTo(4.4309f, 10.5605f, 3.8687f, 10.8391f, 3.5261f, 11.1187f)
                curveTo(3.3932f, 11.2273f, 3.3049f, 11.3251f, 3.2474f, 11.412f)
                curveTo(3.1598f, 11.5446f, 3.1436f, 11.6521f, 3.1492f, 11.7328f)
                lineTo(3.1495f, 11.7372f)
                curveTo(3.1532f, 11.7851f, 3.1649f, 11.8401f, 3.1892f, 11.9035f)
                curveTo(3.2337f, 12.0194f, 3.3206f, 12.1633f, 3.4734f, 12.3303f)
                curveTo(3.7494f, 12.6321f, 4.1944f, 12.9593f, 4.8156f, 13.2845f)
                curveTo(4.9591f, 13.3596f, 5.1107f, 13.434f, 5.2701f, 13.5073f)
                curveTo(5.5359f, 13.6296f, 5.8226f, 13.7486f, 6.1286f, 13.8633f)
                lineTo(6.7172f, 14.0711f)
                curveTo(7.2631f, 12.9456f, 7.9508f, 11.7604f, 8.7621f, 10.5703f)
                curveTo(8.9545f, 10.288f, 9.1502f, 10.011f, 9.3483f, 9.7398f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7647f, 14.2813f)
                curveTo(11.7509f, 13.3709f, 11.7441f, 12.9157f, 12.0311f, 12.75f)
                curveTo(12.3181f, 12.5843f, 12.7089f, 12.8178f, 13.4905f, 13.2849f)
                lineTo(13.6927f, 13.4058f)
                curveTo(13.9148f, 13.5385f, 14.0258f, 13.6048f, 14.1481f, 13.6203f)
                curveTo(14.2705f, 13.6358f, 14.3902f, 13.5986f, 14.6298f, 13.5242f)
                lineTo(14.8479f, 13.4565f)
                curveTo(15.6908f, 13.1947f, 16.1123f, 13.0638f, 16.3656f, 13.2978f)
                curveTo(16.619f, 13.5318f, 16.5364f, 13.9757f, 16.3713f, 14.8635f)
                lineTo(16.3286f, 15.0932f)
                curveTo(16.2817f, 15.3455f, 16.2582f, 15.4716f, 16.286f, 15.5949f)
                curveTo(16.3139f, 15.7181f, 16.3898f, 15.8245f, 16.5418f, 16.0372f)
                lineTo(16.6801f, 16.2309f)
                curveTo(17.2148f, 16.9795f, 17.4821f, 17.3538f, 17.3517f, 17.6641f)
                curveTo(17.2213f, 17.9745f, 16.7794f, 18.0153f, 15.8958f, 18.0969f)
                lineTo(15.6672f, 18.118f)
                curveTo(15.4161f, 18.1412f, 15.2906f, 18.1528f, 15.1854f, 18.2135f)
                curveTo(15.0803f, 18.2742f, 15.0075f, 18.3771f, 14.8619f, 18.583f)
                lineTo(14.7293f, 18.7704f)
                curveTo(14.2168f, 19.4948f, 13.9605f, 19.8571f, 13.6266f, 19.8148f)
                curveTo(13.2926f, 19.7726f, 13.1021f, 19.354f, 12.7211f, 18.5166f)
                lineTo(12.6226f, 18.3f)
                curveTo(12.5143f, 18.062f, 12.4602f, 17.943f, 12.3674f, 17.8573f)
                curveTo(12.2745f, 17.7716f, 12.1536f, 17.7288f, 11.9116f, 17.6433f)
                lineTo(11.6914f, 17.5655f)
                curveTo(10.8399f, 17.2646f, 10.4142f, 17.1141f, 10.3383f, 16.7777f)
                curveTo(10.2623f, 16.4413f, 10.5864f, 16.1418f, 11.2345f, 15.5426f)
                lineTo(11.4022f, 15.3876f)
                curveTo(11.5864f, 15.2174f, 11.6785f, 15.1322f, 11.7263f, 15.0186f)
                curveTo(11.774f, 14.9049f, 11.7721f, 14.7755f, 11.7682f, 14.5168f)
                lineTo(11.7647f, 14.2813f)
                close()
            }
        }
            .build()
        return _starRings!!
    }

private var _starRings: ImageVector? = null
