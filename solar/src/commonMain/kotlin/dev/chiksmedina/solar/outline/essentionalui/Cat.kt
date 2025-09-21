package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(
            name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0195f, 14.9374f)
                curveTo(11.7283f, 14.9374f, 11.4306f, 14.9818f, 11.1783f, 15.0796f)
                curveTo(11.0545f, 15.1275f, 10.9031f, 15.2031f, 10.7698f, 15.3252f)
                curveTo(10.6359f, 15.4479f, 10.463f, 15.6749f, 10.463f, 15.9999f)
                curveTo(10.463f, 16.3249f, 10.6359f, 16.5519f, 10.7698f, 16.6745f)
                curveTo(10.9031f, 16.7967f, 11.0545f, 16.8722f, 11.1783f, 16.9202f)
                curveTo(11.4306f, 17.018f, 11.7283f, 17.0624f, 12.0195f, 17.0624f)
                curveTo(12.3107f, 17.0624f, 12.6084f, 17.018f, 12.8607f, 16.9202f)
                curveTo(12.9845f, 16.8722f, 13.1359f, 16.7967f, 13.2692f, 16.6745f)
                curveTo(13.4031f, 16.5519f, 13.576f, 16.3249f, 13.576f, 15.9999f)
                curveTo(13.576f, 15.6749f, 13.4031f, 15.4479f, 13.2692f, 15.3252f)
                curveTo(13.1359f, 15.2031f, 12.9845f, 15.1275f, 12.8607f, 15.0796f)
                curveTo(12.6084f, 14.9818f, 12.3107f, 14.9374f, 12.0195f, 14.9374f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0364f, 12.6464f)
                curveTo(14.2014f, 12.38f, 14.5273f, 12.0625f, 15.0161f, 12.0625f)
                curveTo(15.505f, 12.0625f, 15.8309f, 12.38f, 15.9959f, 12.6464f)
                curveTo(16.168f, 12.9243f, 16.25f, 13.2612f, 16.25f, 13.5938f)
                curveTo(16.25f, 13.9263f, 16.168f, 14.2632f, 15.9959f, 14.5411f)
                curveTo(15.8309f, 14.8075f, 15.505f, 15.125f, 15.0161f, 15.125f)
                curveTo(14.5273f, 15.125f, 14.2014f, 14.8075f, 14.0364f, 14.5411f)
                curveTo(13.8642f, 14.2632f, 13.7823f, 13.9263f, 13.7823f, 13.5938f)
                curveTo(13.7823f, 13.2612f, 13.8642f, 12.9243f, 14.0364f, 12.6464f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0162f, 12.0625f)
                curveTo(8.5274f, 12.0625f, 8.2015f, 12.38f, 8.0365f, 12.6464f)
                curveTo(7.8643f, 12.9243f, 7.7824f, 13.2612f, 7.7824f, 13.5938f)
                curveTo(7.7824f, 13.9263f, 7.8643f, 14.2632f, 8.0365f, 14.5411f)
                curveTo(8.2015f, 14.8075f, 8.5274f, 15.125f, 9.0162f, 15.125f)
                curveTo(9.5051f, 15.125f, 9.8309f, 14.8075f, 9.996f, 14.5411f)
                curveTo(10.1681f, 14.2632f, 10.2501f, 13.9263f, 10.2501f, 13.5938f)
                curveTo(10.2501f, 13.2612f, 10.1681f, 12.9243f, 9.996f, 12.6464f)
                curveTo(9.8309f, 12.38f, 9.5051f, 12.0625f, 9.0162f, 12.0625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.0947f, 4.25f)
                curveTo(5.4814f, 4.25f, 4.7745f, 4.4287f, 4.2087f, 4.9162f)
                curveTo(3.6221f, 5.4215f, 3.2699f, 6.1878f, 3.2699f, 7.1875f)
                verticalLineTo(9.0625f)
                lineTo(3.2699f, 9.0654f)
                curveTo(3.2711f, 9.3594f, 3.321f, 9.9476f, 3.4887f, 10.4392f)
                curveTo(3.5435f, 10.6001f, 3.6312f, 10.8134f, 3.7775f, 11.0058f)
                curveTo(3.4935f, 11.5688f, 3.3589f, 12.1495f, 3.2977f, 12.7095f)
                curveTo(3.2467f, 13.1771f, 3.246f, 13.6679f, 3.2541f, 14.1211f)
                curveTo(2.5931f, 14.3507f, 1.9087f, 14.6349f, 1.5931f, 14.8387f)
                curveTo(1.2451f, 15.0634f, 1.1452f, 15.5277f, 1.3699f, 15.8756f)
                curveTo(1.5947f, 16.2236f, 2.0589f, 16.3235f, 2.4069f, 16.0988f)
                curveTo(2.5233f, 16.0236f, 2.8667f, 15.8664f, 3.3186f, 15.6939f)
                curveTo(3.3874f, 16.173f, 3.527f, 16.6095f, 3.722f, 17.0063f)
                curveTo(3.5661f, 17.1035f, 3.4283f, 17.1935f, 3.3188f, 17.2652f)
                curveTo(3.2768f, 17.2926f, 3.239f, 17.3173f, 3.2059f, 17.3387f)
                curveTo(2.8579f, 17.5634f, 2.758f, 18.0277f, 2.9827f, 18.3756f)
                curveTo(3.2074f, 18.7236f, 3.6717f, 18.8235f, 4.0196f, 18.5988f)
                curveTo(4.0608f, 18.5722f, 4.1046f, 18.5436f, 4.1509f, 18.5134f)
                curveTo(4.282f, 18.4278f, 4.4328f, 18.3294f, 4.5969f, 18.2288f)
                curveTo(5.1864f, 18.8313f, 5.9185f, 19.2964f, 6.679f, 19.6462f)
                curveTo(8.4599f, 20.4654f, 10.5689f, 20.75f, 12.0f, 20.75f)
                curveTo(13.431f, 20.75f, 15.5401f, 20.4654f, 17.3209f, 19.6462f)
                curveTo(18.0814f, 19.2964f, 18.8135f, 18.8313f, 19.403f, 18.2288f)
                curveTo(19.5671f, 18.3294f, 19.7178f, 18.4278f, 19.849f, 18.5134f)
                curveTo(19.8953f, 18.5436f, 19.9391f, 18.5722f, 19.9802f, 18.5988f)
                curveTo(20.3282f, 18.8235f, 20.7924f, 18.7236f, 21.0171f, 18.3756f)
                curveTo(21.2419f, 18.0277f, 21.1419f, 17.5634f, 20.794f, 17.3387f)
                curveTo(20.7609f, 17.3173f, 20.723f, 17.2926f, 20.6811f, 17.2652f)
                curveTo(20.5715f, 17.1935f, 20.4338f, 17.1035f, 20.2779f, 17.0063f)
                curveTo(20.4729f, 16.6095f, 20.6125f, 16.173f, 20.6814f, 15.6938f)
                curveTo(21.1334f, 15.8663f, 21.477f, 16.0236f, 21.5934f, 16.0988f)
                curveTo(21.9414f, 16.3235f, 22.4057f, 16.2236f, 22.6304f, 15.8756f)
                curveTo(22.8551f, 15.5277f, 22.7552f, 15.0634f, 22.4072f, 14.8387f)
                curveTo(22.0916f, 14.6349f, 21.407f, 14.3506f, 20.7458f, 14.121f)
                curveTo(20.754f, 13.6678f, 20.7533f, 13.177f, 20.7022f, 12.7095f)
                curveTo(20.641f, 12.1495f, 20.5064f, 11.5688f, 20.2224f, 11.0058f)
                curveTo(20.3688f, 10.8134f, 20.4564f, 10.6001f, 20.5113f, 10.4392f)
                curveTo(20.679f, 9.9476f, 20.7289f, 9.3594f, 20.73f, 9.0654f)
                lineTo(20.73f, 9.0625f)
                verticalLineTo(7.1876f)
                curveTo(20.73f, 6.1879f, 20.3778f, 5.4216f, 19.7913f, 4.9163f)
                curveTo(19.2255f, 4.4288f, 18.5186f, 4.2501f, 17.9052f, 4.2501f)
                curveTo(17.4968f, 4.2501f, 17.0742f, 4.4068f, 16.7336f, 4.5608f)
                curveTo(16.3725f, 4.7239f, 15.9951f, 4.9359f, 15.6557f, 5.1314f)
                curveTo(15.5827f, 5.1734f, 15.5118f, 5.2144f, 15.4429f, 5.2543f)
                lineTo(15.4409f, 5.2555f)
                curveTo(15.1769f, 5.4084f, 14.9426f, 5.5441f, 14.7338f, 5.6517f)
                curveTo(14.6041f, 5.7185f, 14.5033f, 5.7643f, 14.4284f, 5.7921f)
                curveTo(14.3968f, 5.8038f, 14.3766f, 5.8097f, 14.3662f, 5.8124f)
                curveTo(14.1127f, 5.811f, 13.9512f, 5.7903f, 13.718f, 5.7604f)
                curveTo(13.668f, 5.754f, 13.6146f, 5.7472f, 13.5563f, 5.74f)
                curveTo(13.2096f, 5.6974f, 12.7721f, 5.6564f, 12.0f, 5.6564f)
                curveTo(11.2279f, 5.6564f, 10.7904f, 5.6974f, 10.4437f, 5.74f)
                curveTo(10.3854f, 5.7472f, 10.332f, 5.754f, 10.282f, 5.7604f)
                curveTo(10.0488f, 5.7903f, 9.8873f, 5.811f, 9.6338f, 5.8124f)
                curveTo(9.6234f, 5.8097f, 9.6032f, 5.8038f, 9.5716f, 5.7921f)
                curveTo(9.4966f, 5.7643f, 9.3959f, 5.7185f, 9.2662f, 5.6517f)
                curveTo(9.0574f, 5.5441f, 8.8232f, 5.4084f, 8.5591f, 5.2555f)
                curveTo(8.4896f, 5.2152f, 8.4181f, 5.1738f, 8.3443f, 5.1313f)
                curveTo(8.0049f, 4.9358f, 7.6275f, 4.7238f, 7.2664f, 4.5607f)
                curveTo(6.9257f, 4.4068f, 6.5032f, 4.25f, 6.0947f, 4.25f)
                close()
                moveTo(6.1618f, 17.6138f)
                curveTo(6.4958f, 17.8657f, 6.8807f, 18.0879f, 7.3059f, 18.2835f)
                curveTo(8.8368f, 18.9877f, 10.7178f, 19.25f, 12.0f, 19.25f)
                curveTo(13.2821f, 19.25f, 15.1631f, 18.9877f, 16.694f, 18.2835f)
                curveTo(17.1192f, 18.0879f, 17.5041f, 17.8657f, 17.8381f, 17.6138f)
                curveTo(17.4857f, 17.5524f, 17.2177f, 17.245f, 17.2177f, 16.875f)
                curveTo(17.2177f, 16.4608f, 17.5535f, 16.125f, 17.9677f, 16.125f)
                curveTo(18.295f, 16.125f, 18.6293f, 16.2068f, 18.9398f, 16.3204f)
                curveTo(19.0984f, 15.9885f, 19.1957f, 15.625f, 19.2225f, 15.2271f)
                curveTo(18.9248f, 15.1544f, 18.7192f, 15.125f, 18.6133f, 15.125f)
                curveTo(18.199f, 15.125f, 17.8633f, 14.7892f, 17.8633f, 14.375f)
                curveTo(17.8633f, 13.9608f, 18.199f, 13.625f, 18.6133f, 13.625f)
                curveTo(18.808f, 13.625f, 19.0283f, 13.6542f, 19.2503f, 13.6974f)
                curveTo(19.2504f, 13.4213f, 19.2414f, 13.1502f, 19.2111f, 12.8724f)
                curveTo(19.1406f, 12.227f, 18.9578f, 11.6541f, 18.5268f, 11.1447f)
                curveTo(18.3726f, 10.9625f, 18.1808f, 10.7813f, 17.9401f, 10.6045f)
                curveTo(17.6062f, 10.3594f, 17.5343f, 9.89f, 17.7794f, 9.5561f)
                curveTo(18.0246f, 9.2222f, 18.494f, 9.1503f, 18.8279f, 9.3955f)
                curveTo(18.947f, 9.4829f, 19.0595f, 9.5728f, 19.1658f, 9.6651f)
                curveTo(19.2098f, 9.4369f, 19.2294f, 9.1982f, 19.23f, 9.0609f)
                verticalLineTo(7.1876f)
                curveTo(19.23f, 6.5623f, 19.0236f, 6.2349f, 18.8122f, 6.0527f)
                curveTo(18.58f, 5.8527f, 18.2495f, 5.7501f, 17.9052f, 5.7501f)
                curveTo(17.8349f, 5.7501f, 17.6589f, 5.7887f, 17.3512f, 5.9277f)
                curveTo(17.0639f, 6.0575f, 16.743f, 6.2361f, 16.4042f, 6.4313f)
                curveTo(16.3405f, 6.4679f, 16.2758f, 6.5054f, 16.2104f, 6.5433f)
                curveTo(15.9427f, 6.6984f, 15.6659f, 6.8588f, 15.4208f, 6.9851f)
                curveTo(15.2662f, 7.0647f, 15.1051f, 7.141f, 14.9494f, 7.1987f)
                curveTo(14.8056f, 7.2519f, 14.6068f, 7.3125f, 14.394f, 7.3125f)
                curveTo(14.0221f, 7.3125f, 13.7616f, 7.2788f, 13.5114f, 7.2464f)
                curveTo(13.4653f, 7.2404f, 13.4194f, 7.2345f, 13.3734f, 7.2288f)
                curveTo(13.0847f, 7.1934f, 12.7083f, 7.1564f, 12.0f, 7.1564f)
                curveTo(11.2917f, 7.1564f, 10.9153f, 7.1934f, 10.6266f, 7.2288f)
                curveTo(10.5805f, 7.2345f, 10.5347f, 7.2404f, 10.4886f, 7.2464f)
                curveTo(10.2385f, 7.2788f, 9.9778f, 7.3125f, 9.606f, 7.3125f)
                curveTo(9.3931f, 7.3125f, 9.1943f, 7.2519f, 9.0506f, 7.1987f)
                curveTo(8.8948f, 7.141f, 8.7337f, 7.0647f, 8.5792f, 6.9851f)
                curveTo(8.3341f, 6.8588f, 8.0573f, 6.6984f, 7.7896f, 6.5433f)
                curveTo(7.7242f, 6.5054f, 7.6594f, 6.4678f, 7.5958f, 6.4312f)
                curveTo(7.2569f, 6.236f, 6.936f, 6.0574f, 6.6488f, 5.9276f)
                curveTo(6.341f, 5.7886f, 6.1651f, 5.75f, 6.0947f, 5.75f)
                curveTo(5.7505f, 5.75f, 5.42f, 5.8525f, 5.1877f, 6.0526f)
                curveTo(4.9763f, 6.2347f, 4.7699f, 6.5622f, 4.7699f, 7.1875f)
                verticalLineTo(9.0609f)
                curveTo(4.7706f, 9.1982f, 4.7901f, 9.4369f, 4.8341f, 9.6651f)
                curveTo(4.9404f, 9.5728f, 5.053f, 9.4829f, 5.1721f, 9.3955f)
                curveTo(5.5059f, 9.1503f, 5.9753f, 9.2222f, 6.2205f, 9.5561f)
                curveTo(6.4657f, 9.89f, 6.3937f, 10.3594f, 6.0599f, 10.6045f)
                curveTo(5.8191f, 10.7813f, 5.6273f, 10.9625f, 5.4732f, 11.1447f)
                curveTo(5.0421f, 11.6541f, 4.8594f, 12.227f, 4.7889f, 12.8724f)
                curveTo(4.7585f, 13.1502f, 4.7495f, 13.4213f, 4.7496f, 13.6975f)
                curveTo(4.9718f, 13.6543f, 5.1922f, 13.625f, 5.3871f, 13.625f)
                curveTo(5.8013f, 13.625f, 6.1371f, 13.9608f, 6.1371f, 14.375f)
                curveTo(6.1371f, 14.7892f, 5.8013f, 15.125f, 5.3871f, 15.125f)
                curveTo(5.2811f, 15.125f, 5.0754f, 15.1544f, 4.7775f, 15.2271f)
                curveTo(4.8042f, 15.625f, 4.9016f, 15.9885f, 5.0602f, 16.3203f)
                curveTo(5.3706f, 16.2068f, 5.7049f, 16.125f, 6.0321f, 16.125f)
                curveTo(6.4463f, 16.125f, 6.7821f, 16.4608f, 6.7821f, 16.875f)
                curveTo(6.7821f, 17.245f, 6.5142f, 17.5524f, 6.1618f, 17.6138f)
                close()
            }
        }
            .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
