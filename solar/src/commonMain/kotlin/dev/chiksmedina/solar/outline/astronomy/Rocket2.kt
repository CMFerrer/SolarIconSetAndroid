package dev.chiksmedina.solar.outline.astronomy

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
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Rocket2: ImageVector
    get() {
        if (_rocket2 != null) {
            return _rocket2!!
        }
        _rocket2 = Builder(
            name = "Rocket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.003f, 12.3566f)
                curveTo(3.2957f, 12.6497f, 3.2954f, 13.1246f, 3.0023f, 13.4173f)
                lineTo(2.8485f, 13.5709f)
                curveTo(2.7172f, 13.7021f, 2.7172f, 13.9144f, 2.8485f, 14.0456f)
                curveTo(2.9804f, 14.1774f, 3.1946f, 14.1774f, 3.3265f, 14.0456f)
                lineTo(5.0182f, 12.356f)
                curveTo(5.3113f, 12.0632f, 5.7861f, 12.0635f, 6.0789f, 12.3566f)
                curveTo(6.3716f, 12.6497f, 6.3713f, 13.1246f, 6.0782f, 13.4173f)
                lineTo(4.3865f, 15.107f)
                curveTo(3.669f, 15.8236f, 2.506f, 15.8236f, 1.7885f, 15.107f)
                curveTo(1.0705f, 14.3898f, 1.0705f, 13.2267f, 1.7885f, 12.5096f)
                lineTo(1.9423f, 12.356f)
                curveTo(2.2354f, 12.0632f, 2.7102f, 12.0635f, 3.003f, 12.3566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.857f, 13.3529f)
                curveTo(8.1499f, 13.6458f, 8.1499f, 14.1206f, 7.857f, 14.4135f)
                lineTo(5.7401f, 16.5304f)
                curveTo(5.4472f, 16.8233f, 4.9724f, 16.8233f, 4.6795f, 16.5304f)
                curveTo(4.3866f, 16.2375f, 4.3866f, 15.7627f, 4.6795f, 15.4698f)
                lineTo(6.7964f, 13.3529f)
                curveTo(7.0893f, 13.06f, 7.5641f, 13.06f, 7.857f, 13.3529f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.6328f, 16.1252f)
                curveTo(10.9257f, 16.4181f, 10.9257f, 16.893f, 10.6328f, 17.1859f)
                lineTo(8.5303f, 19.2883f)
                curveTo(8.2374f, 19.5812f, 7.7626f, 19.5812f, 7.4697f, 19.2883f)
                curveTo(7.1768f, 18.9954f, 7.1768f, 18.5205f, 7.4697f, 18.2276f)
                lineTo(9.5721f, 16.1252f)
                curveTo(9.865f, 15.8323f, 10.3399f, 15.8323f, 10.6328f, 16.1252f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4722f, 16.5211f)
                curveTo(7.7618f, 16.8172f, 7.7566f, 17.292f, 7.4604f, 17.5816f)
                lineTo(5.7509f, 19.2536f)
                curveTo(5.4547f, 19.5432f, 4.9799f, 19.5379f, 4.6903f, 19.2418f)
                curveTo(4.4006f, 18.9457f, 4.4059f, 18.4708f, 4.7021f, 18.1812f)
                lineTo(6.4116f, 16.5093f)
                curveTo(6.7078f, 16.2196f, 7.1826f, 16.2249f, 7.4722f, 16.5211f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.6063f, 17.9262f)
                curveTo(11.8991f, 18.2193f, 11.8988f, 18.6942f, 11.6057f, 18.9869f)
                lineTo(9.914f, 20.6766f)
                curveTo(9.7826f, 20.8078f, 9.7826f, 21.0201f, 9.914f, 21.1513f)
                curveTo(10.0458f, 21.283f, 10.26f, 21.283f, 10.3919f, 21.1513f)
                lineTo(10.5457f, 20.9977f)
                curveTo(10.8388f, 20.705f, 11.3136f, 20.7053f, 11.6063f, 20.9984f)
                curveTo(11.8991f, 21.2914f, 11.8988f, 21.7663f, 11.6057f, 22.059f)
                lineTo(11.4519f, 22.2126f)
                curveTo(10.7344f, 22.9293f, 9.5715f, 22.9293f, 8.8539f, 22.2126f)
                curveTo(8.1359f, 21.4955f, 8.1359f, 20.3324f, 8.8539f, 19.6152f)
                lineTo(10.5457f, 17.9256f)
                curveTo(10.8388f, 17.6329f, 11.3136f, 17.6331f, 11.6063f, 17.9262f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.992f, 1.25f)
                lineTo(18.1257f, 1.2501f)
                lineTo(18.6709f, 1.2501f)
                curveTo(19.4245f, 1.2501f, 20.064f, 1.25f, 20.5742f, 1.3183f)
                curveTo(21.1169f, 1.391f, 21.6242f, 1.5531f, 22.0343f, 1.9615f)
                curveTo(22.4449f, 2.3703f, 22.6082f, 2.8767f, 22.6814f, 3.4187f)
                curveTo(22.7501f, 3.9273f, 22.75f, 4.5647f, 22.75f, 5.3147f)
                lineTo(22.75f, 5.8581f)
                lineTo(22.7501f, 5.992f)
                curveTo(22.7506f, 6.893f, 22.7511f, 7.5528f, 22.4995f, 8.1574f)
                curveTo(22.2482f, 8.7618f, 21.7798f, 9.2276f, 21.1396f, 9.8643f)
                lineTo(21.0445f, 9.9589f)
                lineTo(18.7785f, 12.2153f)
                lineTo(18.8178f, 12.2759f)
                curveTo(19.1587f, 12.8017f, 19.4379f, 13.2324f, 19.64f, 13.6048f)
                curveTo(19.8504f, 13.9925f, 20.0034f, 14.3624f, 20.0648f, 14.7749f)
                curveTo(20.1625f, 15.4309f, 20.0741f, 16.1046f, 19.8157f, 16.7229f)
                curveTo(19.7171f, 16.9587f, 19.549f, 17.2011f, 19.3822f, 17.4159f)
                curveTo(19.2064f, 17.6424f, 18.9922f, 17.8881f, 18.7635f, 18.1371f)
                curveTo(18.3085f, 18.6321f, 17.7629f, 19.1755f, 17.2803f, 19.6561f)
                lineTo(17.2733f, 19.6631f)
                lineTo(17.2001f, 19.7359f)
                curveTo(16.5258f, 20.4074f, 15.356f, 20.1913f, 14.9951f, 19.2872f)
                curveTo(14.7962f, 18.7889f, 14.7185f, 18.5976f, 14.6218f, 18.4215f)
                curveTo(14.5313f, 18.2568f, 14.4276f, 18.0997f, 14.3115f, 17.9518f)
                curveTo(14.1891f, 17.7958f, 14.0459f, 17.6509f, 13.6778f, 17.2843f)
                lineTo(13.2548f, 16.9139f)
                curveTo(13.1838f, 16.9215f, 13.1119f, 16.9253f, 13.0389f, 16.9253f)
                curveTo(12.46f, 16.9253f, 11.9864f, 16.6831f, 11.5504f, 16.3519f)
                curveTo(11.1409f, 16.0408f, 10.6885f, 15.5903f, 10.1559f, 15.0598f)
                lineTo(8.8895f, 13.7987f)
                curveTo(8.3568f, 13.2684f, 7.9044f, 12.8178f, 7.5919f, 12.4101f)
                curveTo(7.2593f, 11.976f, 7.0148f, 11.5028f, 7.0148f, 10.9234f)
                curveTo(7.0148f, 10.836f, 7.0204f, 10.7502f, 7.0313f, 10.6659f)
                lineTo(6.3439f, 9.9813f)
                curveTo(6.3016f, 9.9392f, 6.2852f, 9.9229f, 6.2692f, 9.9073f)
                curveTo(5.953f, 9.601f, 5.581f, 9.3572f, 5.1729f, 9.1893f)
                curveTo(5.1521f, 9.1807f, 5.1307f, 9.1722f, 5.0751f, 9.1502f)
                lineTo(4.7456f, 9.0198f)
                curveTo(3.799f, 8.6452f, 3.5429f, 7.4233f, 4.2668f, 6.7025f)
                lineTo(4.2738f, 6.6955f)
                curveTo(4.7564f, 6.2149f, 5.3021f, 5.6716f, 5.7993f, 5.2186f)
                curveTo(6.0493f, 4.9908f, 6.296f, 4.7776f, 6.5234f, 4.6025f)
                curveTo(6.7392f, 4.4364f, 6.9822f, 4.2693f, 7.2183f, 4.1714f)
                curveTo(7.838f, 3.9146f, 8.5128f, 3.8269f, 9.1698f, 3.9239f)
                curveTo(9.5826f, 3.9848f, 9.9532f, 4.1367f, 10.3423f, 4.3461f)
                curveTo(10.7162f, 4.5473f, 11.1486f, 4.8253f, 11.6768f, 5.1648f)
                lineTo(11.7425f, 5.2071f)
                lineTo(14.012f, 2.9471f)
                lineTo(14.1066f, 2.8529f)
                curveTo(14.7465f, 2.2149f, 15.2139f, 1.7489f, 15.8199f, 1.4989f)
                curveTo(16.4256f, 1.2491f, 17.0864f, 1.2495f, 17.992f, 1.25f)
                close()
                moveTo(17.6921f, 13.2972f)
                curveTo(17.9734f, 13.7323f, 18.1754f, 14.0508f, 18.3217f, 14.3204f)
                curveTo(18.4875f, 14.6259f, 18.5554f, 14.8223f, 18.5812f, 14.9958f)
                curveTo(18.6374f, 15.3731f, 18.5878f, 15.7709f, 18.4317f, 16.1445f)
                curveTo(18.4128f, 16.1898f, 18.3465f, 16.3039f, 18.1974f, 16.4961f)
                curveTo(18.0573f, 16.6765f, 17.8739f, 16.8882f, 17.6589f, 17.1221f)
                curveTo(17.2539f, 17.5629f, 16.7662f, 18.051f, 16.3015f, 18.5139f)
                curveTo(16.1635f, 18.1697f, 16.0627f, 17.9291f, 15.9366f, 17.6994f)
                curveTo(15.8068f, 17.4632f, 15.658f, 17.2379f, 15.4916f, 17.0258f)
                curveTo(15.3039f, 16.7866f, 15.0892f, 16.5729f, 14.7525f, 16.2377f)
                lineTo(14.7163f, 16.2016f)
                curveTo(14.75f, 16.1735f, 14.7836f, 16.145f, 14.8171f, 16.1162f)
                curveTo(15.1468f, 15.8318f, 15.516f, 15.4641f, 15.9405f, 15.0414f)
                lineTo(17.6921f, 13.2972f)
                close()
                moveTo(18.1257f, 2.7501f)
                curveTo(17.0287f, 2.7501f, 16.6883f, 2.7633f, 16.3919f, 2.8856f)
                curveTo(16.0958f, 3.0077f, 15.8462f, 3.2375f, 15.0705f, 4.01f)
                lineTo(9.9837f, 9.0753f)
                curveTo(9.5492f, 9.508f, 9.2232f, 9.8332f, 8.9782f, 10.1124f)
                curveTo(8.7319f, 10.3932f, 8.6135f, 10.5774f, 8.558f, 10.7154f)
                curveTo(8.5263f, 10.7939f, 8.5148f, 10.8586f, 8.5148f, 10.9234f)
                curveTo(8.5148f, 11.041f, 8.5519f, 11.1967f, 8.7826f, 11.4978f)
                curveTo(9.0264f, 11.8159f, 9.4054f, 12.1957f, 9.9837f, 12.7715f)
                lineTo(10.0519f, 12.8394f)
                lineTo(11.3149f, 11.5817f)
                curveTo(11.6084f, 11.2895f, 12.0833f, 11.2905f, 12.3756f, 11.584f)
                curveTo(12.6679f, 11.8775f, 12.6669f, 12.3524f, 12.3733f, 12.6446f)
                lineTo(11.1148f, 13.8979f)
                lineTo(11.1785f, 13.9613f)
                curveTo(11.7568f, 14.5371f, 12.1382f, 14.9146f, 12.4578f, 15.1575f)
                curveTo(12.76f, 15.3871f, 12.9179f, 15.4253f, 13.0389f, 15.4253f)
                curveTo(13.1008f, 15.4253f, 13.1612f, 15.4152f, 13.2315f, 15.3893f)
                curveTo(13.3677f, 15.3392f, 13.5518f, 15.2267f, 13.8373f, 14.9804f)
                curveTo(14.1217f, 14.7351f, 14.4536f, 14.4052f, 14.8994f, 13.9613f)
                lineTo(19.9861f, 8.896f)
                curveTo(20.7622f, 8.1231f, 20.9924f, 7.8751f, 21.1146f, 7.5814f)
                curveTo(21.2366f, 7.288f, 21.25f, 6.9512f, 21.25f, 5.8581f)
                lineTo(21.25f, 5.3653f)
                curveTo(21.25f, 4.5508f, 21.2484f, 4.0157f, 21.1949f, 3.6194f)
                curveTo(21.1443f, 3.2449f, 21.0602f, 3.1083f, 20.9759f, 3.0244f)
                curveTo(20.8911f, 2.94f, 20.7527f, 2.8556f, 20.3751f, 2.8051f)
                curveTo(19.9763f, 2.7517f, 19.4382f, 2.7501f, 18.6206f, 2.7501f)
                horizontalLineTo(18.1257f)
                close()
                moveTo(18.3474f, 5.6329f)
                curveTo(17.3949f, 4.6844f, 15.8519f, 4.6844f, 14.8994f, 5.6329f)
                curveTo(13.9451f, 6.5831f, 13.9451f, 8.1251f, 14.8994f, 9.0753f)
                curveTo(15.8519f, 10.0238f, 17.3949f, 10.0238f, 18.3474f, 9.0753f)
                curveTo(19.3016f, 8.1251f, 19.3016f, 6.5831f, 18.3474f, 5.6329f)
                close()
                moveTo(15.9578f, 6.6958f)
                curveTo(16.325f, 6.3301f, 16.9217f, 6.3301f, 17.289f, 6.6958f)
                curveTo(17.6545f, 7.0597f, 17.6545f, 7.6485f, 17.289f, 8.0124f)
                curveTo(16.9217f, 8.3781f, 16.325f, 8.3781f, 15.9578f, 8.0124f)
                curveTo(15.5923f, 7.6485f, 15.5923f, 7.0597f, 15.9578f, 6.6958f)
                close()
                moveTo(10.6542f, 6.2908f)
                curveTo(10.2199f, 6.0124f, 9.9013f, 5.8122f, 9.6315f, 5.667f)
                curveTo(9.3244f, 5.5017f, 9.1263f, 5.4337f, 8.9508f, 5.4078f)
                curveTo(8.57f, 5.3516f, 8.1689f, 5.4012f, 7.7925f, 5.5572f)
                curveTo(7.7463f, 5.5763f, 7.6312f, 5.6426f, 7.4384f, 5.7911f)
                curveTo(7.2571f, 5.9307f, 7.0445f, 6.1133f, 6.8095f, 6.3273f)
                curveTo(6.3689f, 6.7288f, 5.8812f, 7.2119f, 5.4182f, 7.6728f)
                lineTo(5.627f, 7.7555f)
                lineTo(5.6321f, 7.7575f)
                curveTo(5.6812f, 7.7769f, 5.7125f, 7.7893f, 5.7437f, 7.8021f)
                curveTo(6.3274f, 8.0423f, 6.8601f, 8.3912f, 7.3131f, 8.8302f)
                curveTo(7.3374f, 8.8537f, 7.3613f, 8.8775f, 7.3989f, 8.915f)
                lineTo(7.7389f, 9.2535f)
                curveTo(7.7754f, 9.2099f, 7.8127f, 9.1664f, 7.8507f, 9.1232f)
                curveTo(8.1328f, 8.8016f, 8.4945f, 8.4415f, 8.9092f, 8.0284f)
                lineTo(10.6542f, 6.2908f)
                close()
            }
        }
            .build()
        return _rocket2!!
    }

private var _rocket2: ImageVector? = null
