package com.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.AstronomyGroup

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
                moveTo(22.0f, 5.3652f)
                lineTo(22.75f, 5.3652f)
                verticalLineTo(5.3652f)
                horizontalLineTo(22.0f)
                close()
                moveTo(9.4545f, 13.3029f)
                lineTo(9.9837f, 12.7714f)
                lineTo(9.9837f, 12.7714f)
                lineTo(9.4545f, 13.3029f)
                close()
                moveTo(9.4545f, 8.5438f)
                lineTo(9.9837f, 9.0752f)
                lineTo(9.9837f, 9.0752f)
                lineTo(9.4545f, 8.5438f)
                close()
                moveTo(15.4286f, 14.4926f)
                lineTo(14.8994f, 13.9612f)
                lineTo(14.8994f, 13.9612f)
                lineTo(15.4286f, 14.4926f)
                close()
                moveTo(10.6493f, 14.4926f)
                lineTo(10.1201f, 15.0241f)
                lineTo(10.1201f, 15.0241f)
                lineTo(10.6493f, 14.4926f)
                close()
                moveTo(20.5153f, 9.4273f)
                lineTo(21.0445f, 9.9588f)
                lineTo(21.0445f, 9.9588f)
                lineTo(20.5153f, 9.4273f)
                close()
                moveTo(22.0f, 5.858f)
                lineTo(21.25f, 5.858f)
                verticalLineTo(5.858f)
                horizontalLineTo(22.0f)
                close()
                moveTo(14.5412f, 3.4785f)
                lineTo(14.012f, 2.947f)
                lineTo(14.012f, 2.947f)
                lineTo(14.5412f, 3.4785f)
                close()
                moveTo(12.3733f, 12.6445f)
                curveTo(12.6669f, 12.3523f, 12.6679f, 11.8774f, 12.3756f, 11.5839f)
                curveTo(12.0833f, 11.2904f, 11.6084f, 11.2894f, 11.3149f, 11.5816f)
                lineTo(12.3733f, 12.6445f)
                close()
                moveTo(7.7089f, 10.282f)
                lineTo(8.2389f, 9.7514f)
                lineTo(8.2381f, 9.7506f)
                lineTo(7.7089f, 10.282f)
                close()
                moveTo(11.4377f, 6.7942f)
                curveTo(11.7861f, 7.0182f, 12.2502f, 6.9173f, 12.4741f, 6.5689f)
                curveTo(12.6981f, 6.2204f, 12.5972f, 5.7564f, 12.2488f, 5.5324f)
                lineTo(11.4377f, 6.7942f)
                close()
                moveTo(11.2958f, 5.8114f)
                lineTo(10.8903f, 6.4423f)
                lineTo(10.8903f, 6.4423f)
                lineTo(11.2958f, 5.8114f)
                close()
                moveTo(9.0603f, 4.6657f)
                lineTo(9.1698f, 3.9238f)
                lineTo(9.1698f, 3.9238f)
                lineTo(9.0603f, 4.6657f)
                close()
                moveTo(4.796f, 7.2338f)
                lineTo(5.3252f, 7.7653f)
                lineTo(5.3252f, 7.7653f)
                lineTo(4.796f, 7.2338f)
                close()
                moveTo(7.5054f, 4.8642f)
                lineTo(7.7925f, 5.5571f)
                lineTo(7.7925f, 5.5571f)
                lineTo(7.5054f, 4.8642f)
                close()
                moveTo(5.3511f, 8.4527f)
                lineTo(5.627f, 7.7554f)
                lineTo(5.627f, 7.7554f)
                lineTo(5.3511f, 8.4527f)
                close()
                moveTo(5.4583f, 8.4956f)
                lineTo(5.1729f, 9.1892f)
                lineTo(5.4583f, 8.4956f)
                close()
                moveTo(6.8731f, 9.4497f)
                lineTo(7.4023f, 8.9183f)
                lineTo(7.4023f, 8.9183f)
                lineTo(6.8731f, 9.4497f)
                close()
                moveTo(6.7911f, 9.3687f)
                lineTo(6.2692f, 9.9072f)
                lineTo(6.7911f, 9.3687f)
                close()
                moveTo(5.0216f, 8.3224f)
                lineTo(4.7456f, 9.0197f)
                lineTo(4.7456f, 9.0197f)
                lineTo(5.0216f, 8.3224f)
                close()
                moveTo(13.7351f, 16.3374f)
                lineTo(13.2051f, 16.8681f)
                curveTo(13.2167f, 16.8797f, 13.2286f, 16.8909f, 13.241f, 16.9017f)
                lineTo(13.7351f, 16.3374f)
                close()
                moveTo(18.4484f, 11.706f)
                curveTo(18.2231f, 11.3584f, 17.7587f, 11.2593f, 17.4111f, 11.4846f)
                curveTo(17.0635f, 11.71f, 16.9644f, 12.1744f, 17.1897f, 12.522f)
                lineTo(18.4484f, 11.706f)
                close()
                moveTo(18.1724f, 12.6591f)
                lineTo(17.5431f, 13.0671f)
                lineTo(17.5431f, 13.0671f)
                lineTo(18.1724f, 12.6591f)
                close()
                moveTo(19.323f, 14.8852f)
                lineTo(20.0648f, 14.7748f)
                lineTo(19.323f, 14.8852f)
                close()
                moveTo(16.7441f, 19.1315f)
                lineTo(17.2733f, 19.663f)
                lineTo(17.2733f, 19.663f)
                lineTo(16.7441f, 19.1315f)
                close()
                moveTo(19.1237f, 16.4335f)
                lineTo(19.8157f, 16.7228f)
                lineTo(19.1237f, 16.4335f)
                close()
                moveTo(15.6917f, 19.0091f)
                lineTo(16.3883f, 18.7311f)
                lineTo(16.3883f, 18.7311f)
                lineTo(15.6917f, 19.0091f)
                close()
                moveTo(15.2792f, 18.0603f)
                lineTo(14.6218f, 18.4214f)
                lineTo(15.2792f, 18.0603f)
                close()
                moveTo(14.19f, 16.7358f)
                lineTo(14.7192f, 16.2043f)
                lineTo(14.7021f, 16.1874f)
                lineTo(14.6841f, 16.1716f)
                lineTo(14.19f, 16.7358f)
                close()
                moveTo(14.9015f, 17.4887f)
                lineTo(15.4916f, 17.0257f)
                lineTo(15.4916f, 17.0257f)
                lineTo(14.9015f, 17.4887f)
                close()
                moveTo(16.6709f, 19.2043f)
                lineTo(16.1417f, 18.6729f)
                lineTo(16.1417f, 18.6729f)
                lineTo(16.6709f, 19.2043f)
                close()
                moveTo(13.4904f, 16.0931f)
                lineTo(13.2315f, 15.3892f)
                lineTo(13.4904f, 16.0931f)
                close()
                moveTo(7.8622f, 10.4352f)
                lineTo(8.558f, 10.7153f)
                lineTo(7.8622f, 10.4352f)
                close()
                moveTo(6.0782f, 13.4172f)
                curveTo(6.3713f, 13.1244f, 6.3716f, 12.6496f, 6.0789f, 12.3565f)
                curveTo(5.7861f, 12.0634f, 5.3113f, 12.0631f, 5.0182f, 12.3559f)
                lineTo(6.0782f, 13.4172f)
                close()
                moveTo(3.8565f, 14.5762f)
                lineTo(3.3265f, 14.0455f)
                lineTo(3.3265f, 14.0455f)
                lineTo(3.8565f, 14.5762f)
                close()
                moveTo(2.3185f, 13.0401f)
                lineTo(1.7885f, 12.5095f)
                lineTo(1.7885f, 12.5095f)
                lineTo(2.3185f, 13.0401f)
                close()
                moveTo(3.0023f, 13.4172f)
                curveTo(3.2954f, 13.1244f, 3.2957f, 12.6496f, 3.003f, 12.3565f)
                curveTo(2.7102f, 12.0634f, 2.2354f, 12.0631f, 1.9423f, 12.3559f)
                lineTo(3.0023f, 13.4172f)
                close()
                moveTo(11.6057f, 18.9868f)
                curveTo(11.8988f, 18.694f, 11.8991f, 18.2192f, 11.6063f, 17.9261f)
                curveTo(11.3136f, 17.633f, 10.8388f, 17.6327f, 10.5457f, 17.9255f)
                lineTo(11.6057f, 18.9868f)
                close()
                moveTo(9.384f, 20.1458f)
                lineTo(9.914f, 20.6764f)
                lineTo(9.914f, 20.6764f)
                lineTo(9.384f, 20.1458f)
                close()
                moveTo(10.9219f, 21.6819f)
                lineTo(11.4519f, 22.2125f)
                lineTo(11.4519f, 22.2125f)
                lineTo(10.9219f, 21.6819f)
                close()
                moveTo(11.6057f, 22.0589f)
                curveTo(11.8988f, 21.7662f, 11.8991f, 21.2913f, 11.6063f, 20.9983f)
                curveTo(11.3136f, 20.7052f, 10.8388f, 20.7049f, 10.5457f, 20.9976f)
                lineTo(11.6057f, 22.0589f)
                close()
                moveTo(10.6328f, 17.1858f)
                curveTo(10.9257f, 16.8929f, 10.9257f, 16.418f, 10.6328f, 16.1251f)
                curveTo(10.3399f, 15.8322f, 9.865f, 15.8322f, 9.5721f, 16.1251f)
                lineTo(10.6328f, 17.1858f)
                close()
                moveTo(7.4697f, 18.2275f)
                curveTo(7.1768f, 18.5204f, 7.1768f, 18.9953f, 7.4697f, 19.2882f)
                curveTo(7.7626f, 19.5811f, 8.2374f, 19.5811f, 8.5303f, 19.2882f)
                lineTo(7.4697f, 18.2275f)
                close()
                moveTo(7.857f, 14.4134f)
                curveTo(8.1499f, 14.1205f, 8.1499f, 13.6457f, 7.857f, 13.3528f)
                curveTo(7.5641f, 13.0599f, 7.0893f, 13.0599f, 6.7964f, 13.3528f)
                lineTo(7.857f, 14.4134f)
                close()
                moveTo(4.6795f, 15.4697f)
                curveTo(4.3866f, 15.7626f, 4.3866f, 16.2374f, 4.6795f, 16.5303f)
                curveTo(4.9724f, 16.8232f, 5.4472f, 16.8232f, 5.7401f, 16.5303f)
                lineTo(4.6795f, 15.4697f)
                close()
                moveTo(7.4604f, 17.5815f)
                curveTo(7.7566f, 17.2919f, 7.7618f, 16.8171f, 7.4722f, 16.5209f)
                curveTo(7.1826f, 16.2248f, 6.7078f, 16.2195f, 6.4116f, 16.5091f)
                lineTo(7.4604f, 17.5815f)
                close()
                moveTo(4.7021f, 18.1811f)
                curveTo(4.4059f, 18.4707f, 4.4006f, 18.9455f, 4.6903f, 19.2417f)
                curveTo(4.9799f, 19.5378f, 5.4547f, 19.5431f, 5.7509f, 19.2535f)
                lineTo(4.7021f, 18.1811f)
                close()
                moveTo(19.9861f, 8.8959f)
                lineTo(14.8994f, 13.9612f)
                lineTo(15.9578f, 15.0241f)
                lineTo(21.0445f, 9.9588f)
                lineTo(19.9861f, 8.8959f)
                close()
                moveTo(11.1785f, 13.9612f)
                lineTo(9.9837f, 12.7714f)
                lineTo(8.9253f, 13.8343f)
                lineTo(10.1201f, 15.0241f)
                lineTo(11.1785f, 13.9612f)
                close()
                moveTo(9.9837f, 9.0752f)
                lineTo(15.0705f, 4.0099f)
                lineTo(14.012f, 2.947f)
                lineTo(8.9253f, 8.0123f)
                lineTo(9.9837f, 9.0752f)
                close()
                moveTo(18.1257f, 2.75f)
                horizontalLineTo(18.6206f)
                verticalLineTo(1.25f)
                horizontalLineTo(18.1257f)
                verticalLineTo(2.75f)
                close()
                moveTo(21.25f, 5.3652f)
                lineTo(21.25f, 5.858f)
                lineTo(22.75f, 5.858f)
                lineTo(22.75f, 5.3652f)
                lineTo(21.25f, 5.3652f)
                close()
                moveTo(18.6206f, 2.75f)
                curveTo(19.4382f, 2.75f, 19.9763f, 2.7516f, 20.3751f, 2.805f)
                curveTo(20.7527f, 2.8555f, 20.8911f, 2.9399f, 20.9759f, 3.0243f)
                lineTo(22.0343f, 1.9614f)
                curveTo(21.6242f, 1.553f, 21.1169f, 1.3909f, 20.5742f, 1.3182f)
                curveTo(20.0527f, 1.2484f, 19.396f, 1.25f, 18.6206f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(22.75f, 5.3652f)
                curveTo(22.75f, 4.5933f, 22.7516f, 3.9386f, 22.6814f, 3.4186f)
                curveTo(22.6082f, 2.8766f, 22.4449f, 2.3702f, 22.0343f, 1.9614f)
                lineTo(20.9759f, 3.0243f)
                curveTo(21.0602f, 3.1082f, 21.1443f, 3.2448f, 21.1949f, 3.6193f)
                curveTo(21.2484f, 4.0156f, 21.25f, 4.5507f, 21.25f, 5.3652f)
                horizontalLineTo(22.75f)
                close()
                moveTo(9.9837f, 12.7714f)
                curveTo(9.4054f, 12.1956f, 9.0264f, 11.8158f, 8.7826f, 11.4976f)
                curveTo(8.5519f, 11.1966f, 8.5148f, 11.0409f, 8.5148f, 10.9233f)
                horizontalLineTo(7.0148f)
                curveTo(7.0148f, 11.5027f, 7.2593f, 11.9759f, 7.5919f, 12.4099f)
                curveTo(7.9113f, 12.8269f, 8.3771f, 13.2884f, 8.9253f, 13.8343f)
                lineTo(9.9837f, 12.7714f)
                close()
                moveTo(10.1201f, 15.0241f)
                curveTo(10.6684f, 15.57f, 11.1318f, 16.0338f, 11.5504f, 16.3518f)
                curveTo(11.9864f, 16.683f, 12.46f, 16.9252f, 13.0389f, 16.9252f)
                verticalLineTo(15.4252f)
                curveTo(12.9179f, 15.4252f, 12.76f, 15.387f, 12.4578f, 15.1574f)
                curveTo(12.1382f, 14.9145f, 11.7568f, 14.537f, 11.1785f, 13.9612f)
                lineTo(10.1201f, 15.0241f)
                close()
                moveTo(21.0445f, 9.9588f)
                curveTo(21.7335f, 9.2727f, 22.2359f, 8.7912f, 22.4995f, 8.1573f)
                lineTo(21.1146f, 7.5813f)
                curveTo(20.9924f, 7.875f, 20.7622f, 8.123f, 19.9861f, 8.8959f)
                lineTo(21.0445f, 9.9588f)
                close()
                moveTo(21.25f, 5.858f)
                curveTo(21.25f, 6.951f, 21.2366f, 7.2878f, 21.1146f, 7.5813f)
                lineTo(22.4995f, 8.1573f)
                curveTo(22.7634f, 7.5231f, 22.75f, 6.8283f, 22.75f, 5.858f)
                horizontalLineTo(21.25f)
                close()
                moveTo(15.0705f, 4.0099f)
                curveTo(15.8462f, 3.2374f, 16.0958f, 3.0076f, 16.3919f, 2.8855f)
                lineTo(15.8199f, 1.4988f)
                curveTo(15.1844f, 1.7609f, 14.7014f, 2.2605f, 14.012f, 2.947f)
                lineTo(15.0705f, 4.0099f)
                close()
                moveTo(18.1257f, 1.25f)
                curveTo(17.1507f, 1.25f, 16.455f, 1.2368f, 15.8199f, 1.4988f)
                lineTo(16.3919f, 2.8855f)
                curveTo(16.6883f, 2.7632f, 17.0287f, 2.75f, 18.1257f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(10.5811f, 14.4292f)
                lineTo(12.3733f, 12.6445f)
                lineTo(11.3149f, 11.5816f)
                lineTo(9.5227f, 13.3663f)
                lineTo(10.5811f, 14.4292f)
                close()
                moveTo(12.2488f, 5.5324f)
                lineTo(11.7014f, 5.1805f)
                lineTo(10.8903f, 6.4423f)
                lineTo(11.4377f, 6.7942f)
                lineTo(12.2488f, 5.5324f)
                close()
                moveTo(11.7014f, 5.1805f)
                curveTo(11.162f, 4.8338f, 10.722f, 4.5503f, 10.3423f, 4.346f)
                curveTo(9.9532f, 4.1366f, 9.5826f, 3.9847f, 9.1698f, 3.9238f)
                lineTo(8.9508f, 5.4077f)
                curveTo(9.1263f, 5.4336f, 9.3244f, 5.5016f, 9.6315f, 5.6669f)
                curveTo(9.948f, 5.8372f, 10.3315f, 6.0831f, 10.8903f, 6.4423f)
                lineTo(11.7014f, 5.1805f)
                close()
                moveTo(5.3252f, 7.7653f)
                curveTo(5.8155f, 7.2771f, 6.3393f, 6.7557f, 6.8095f, 6.3272f)
                curveTo(7.0445f, 6.1132f, 7.2571f, 5.9306f, 7.4384f, 5.791f)
                curveTo(7.6312f, 5.6425f, 7.7463f, 5.5762f, 7.7925f, 5.5571f)
                lineTo(7.2183f, 4.1713f)
                curveTo(6.9822f, 4.2692f, 6.7392f, 4.4363f, 6.5234f, 4.6024f)
                curveTo(6.296f, 4.7775f, 6.0493f, 4.9907f, 5.7993f, 5.2184f)
                curveTo(5.2997f, 5.6736f, 4.7512f, 6.22f, 4.2668f, 6.7024f)
                lineTo(5.3252f, 7.7653f)
                close()
                moveTo(9.1698f, 3.9238f)
                curveTo(8.5128f, 3.8268f, 7.838f, 3.9145f, 7.2183f, 4.1713f)
                lineTo(7.7925f, 5.5571f)
                curveTo(8.1689f, 5.4011f, 8.57f, 5.3515f, 8.9508f, 5.4077f)
                lineTo(9.1698f, 3.9238f)
                close()
                moveTo(4.7456f, 9.0197f)
                lineTo(5.0751f, 9.1501f)
                lineTo(5.627f, 7.7554f)
                lineTo(5.2976f, 7.625f)
                lineTo(4.7456f, 9.0197f)
                close()
                moveTo(6.3439f, 9.9812f)
                lineTo(7.1797f, 10.8135f)
                lineTo(8.2381f, 9.7506f)
                lineTo(7.4023f, 8.9183f)
                lineTo(6.3439f, 9.9812f)
                close()
                moveTo(5.0751f, 9.1501f)
                curveTo(5.1307f, 9.1721f, 5.1521f, 9.1806f, 5.1729f, 9.1892f)
                lineTo(5.7437f, 7.802f)
                curveTo(5.7114f, 7.7887f, 5.679f, 7.7759f, 5.627f, 7.7554f)
                lineTo(5.0751f, 9.1501f)
                close()
                moveTo(7.4023f, 8.9183f)
                curveTo(7.3627f, 8.8789f, 7.3381f, 8.8543f, 7.3131f, 8.8301f)
                lineTo(6.2692f, 9.9072f)
                curveTo(6.2852f, 9.9228f, 6.3016f, 9.9391f, 6.3439f, 9.9812f)
                lineTo(7.4023f, 8.9183f)
                close()
                moveTo(5.1729f, 9.1892f)
                curveTo(5.581f, 9.3571f, 5.953f, 9.6009f, 6.2692f, 9.9072f)
                lineTo(7.3131f, 8.8301f)
                curveTo(6.8601f, 8.3911f, 6.3274f, 8.0422f, 5.7437f, 7.802f)
                lineTo(5.1729f, 9.1892f)
                close()
                moveTo(4.2668f, 6.7024f)
                curveTo(3.5429f, 7.4232f, 3.799f, 8.6451f, 4.7456f, 9.0197f)
                lineTo(5.2976f, 7.625f)
                curveTo(5.3518f, 7.6464f, 5.37f, 7.7207f, 5.3252f, 7.7653f)
                lineTo(4.2668f, 6.7024f)
                close()
                moveTo(17.1897f, 12.522f)
                lineTo(17.5431f, 13.0671f)
                lineTo(18.8018f, 12.2511f)
                lineTo(18.4484f, 11.706f)
                lineTo(17.1897f, 12.522f)
                close()
                moveTo(16.2148f, 18.6001f)
                lineTo(16.1417f, 18.6729f)
                lineTo(17.2001f, 19.7358f)
                lineTo(17.2733f, 19.663f)
                lineTo(16.2148f, 18.6001f)
                close()
                moveTo(17.5431f, 13.0671f)
                curveTo(17.9039f, 13.6235f, 18.1507f, 14.0053f, 18.3217f, 14.3203f)
                curveTo(18.4875f, 14.6258f, 18.5554f, 14.8222f, 18.5812f, 14.9956f)
                lineTo(20.0648f, 14.7748f)
                curveTo(20.0034f, 14.3623f, 19.8504f, 13.9924f, 19.64f, 13.6047f)
                curveTo(19.4347f, 13.2265f, 19.1499f, 12.7881f, 18.8018f, 12.2511f)
                lineTo(17.5431f, 13.0671f)
                close()
                moveTo(17.2733f, 19.663f)
                curveTo(17.7576f, 19.1807f, 18.3063f, 18.6344f, 18.7635f, 18.1369f)
                curveTo(18.9922f, 17.888f, 19.2064f, 17.6423f, 19.3822f, 17.4158f)
                curveTo(19.549f, 17.201f, 19.7171f, 16.9586f, 19.8157f, 16.7228f)
                lineTo(18.4317f, 16.1443f)
                curveTo(18.4128f, 16.1897f, 18.3465f, 16.3038f, 18.1974f, 16.4959f)
                curveTo(18.0573f, 16.6764f, 17.8739f, 16.8881f, 17.6589f, 17.122f)
                curveTo(17.2287f, 17.5903f, 16.7051f, 18.1119f, 16.2148f, 18.6001f)
                lineTo(17.2733f, 19.663f)
                close()
                moveTo(18.5812f, 14.9956f)
                curveTo(18.6374f, 15.373f, 18.5878f, 15.7708f, 18.4317f, 16.1443f)
                lineTo(19.8157f, 16.7228f)
                curveTo(20.0741f, 16.1045f, 20.1625f, 15.4308f, 20.0648f, 14.7748f)
                lineTo(18.5812f, 14.9956f)
                close()
                moveTo(14.6841f, 16.1716f)
                lineTo(14.2292f, 15.7732f)
                lineTo(13.241f, 16.9017f)
                lineTo(13.6959f, 17.3f)
                lineTo(14.6841f, 16.1716f)
                close()
                moveTo(16.3883f, 18.7311f)
                curveTo(16.2023f, 18.2653f, 16.0877f, 17.9745f, 15.9366f, 17.6993f)
                lineTo(14.6218f, 18.4214f)
                curveTo(14.7185f, 18.5975f, 14.7962f, 18.7888f, 14.9951f, 19.2871f)
                lineTo(16.3883f, 18.7311f)
                close()
                moveTo(13.6608f, 17.2672f)
                curveTo(14.0415f, 17.6464f, 14.1873f, 17.7933f, 14.3115f, 17.9517f)
                lineTo(15.4916f, 17.0257f)
                curveTo(15.2978f, 16.7787f, 15.0752f, 16.5588f, 14.7192f, 16.2043f)
                lineTo(13.6608f, 17.2672f)
                close()
                moveTo(15.9366f, 17.6993f)
                curveTo(15.8068f, 17.4631f, 15.658f, 17.2378f, 15.4916f, 17.0257f)
                lineTo(14.3115f, 17.9517f)
                curveTo(14.4276f, 18.0996f, 14.5313f, 18.2567f, 14.6218f, 18.4214f)
                lineTo(15.9366f, 17.6993f)
                close()
                moveTo(17.289f, 8.0123f)
                curveTo(16.9217f, 8.378f, 16.325f, 8.378f, 15.9578f, 8.0123f)
                lineTo(14.8994f, 9.0752f)
                curveTo(15.8519f, 10.0237f, 17.3949f, 10.0237f, 18.3474f, 9.0752f)
                lineTo(17.289f, 8.0123f)
                close()
                moveTo(15.9578f, 8.0123f)
                curveTo(15.5923f, 7.6484f, 15.5923f, 7.0596f, 15.9578f, 6.6957f)
                lineTo(14.8994f, 5.6328f)
                curveTo(13.9451f, 6.583f, 13.9451f, 8.125f, 14.8994f, 9.0752f)
                lineTo(15.9578f, 8.0123f)
                close()
                moveTo(15.9578f, 6.6957f)
                curveTo(16.325f, 6.33f, 16.9217f, 6.33f, 17.289f, 6.6957f)
                lineTo(18.3474f, 5.6328f)
                curveTo(17.3949f, 4.6843f, 15.8519f, 4.6843f, 14.8994f, 5.6328f)
                lineTo(15.9578f, 6.6957f)
                close()
                moveTo(17.289f, 6.6957f)
                curveTo(17.6545f, 7.0596f, 17.6545f, 7.6484f, 17.289f, 8.0123f)
                lineTo(18.3474f, 9.0752f)
                curveTo(19.3016f, 8.125f, 19.3016f, 6.583f, 18.3474f, 5.6328f)
                lineTo(17.289f, 6.6957f)
                close()
                moveTo(16.1417f, 18.6729f)
                curveTo(16.182f, 18.6327f, 16.236f, 18.6238f, 16.2734f, 18.6312f)
                curveTo(16.311f, 18.6388f, 16.3639f, 18.6699f, 16.3883f, 18.7311f)
                lineTo(14.9951f, 19.2871f)
                curveTo(15.356f, 20.1912f, 16.5258f, 20.4073f, 17.2002f, 19.7358f)
                lineTo(16.1417f, 18.6729f)
                close()
                moveTo(14.8994f, 13.9612f)
                curveTo(14.4536f, 14.4051f, 14.1217f, 14.735f, 13.8373f, 14.9802f)
                curveTo(13.5518f, 15.2266f, 13.3677f, 15.3391f, 13.2315f, 15.3892f)
                lineTo(13.7494f, 16.797f)
                curveTo(14.1379f, 16.654f, 14.4842f, 16.4032f, 14.8171f, 16.1161f)
                curveTo(15.1512f, 15.8279f, 15.526f, 15.4541f, 15.9578f, 15.0241f)
                lineTo(14.8994f, 13.9612f)
                close()
                moveTo(13.2315f, 15.3892f)
                curveTo(13.1612f, 15.415f, 13.1008f, 15.4252f, 13.0389f, 15.4252f)
                verticalLineTo(16.9252f)
                curveTo(13.2864f, 16.9252f, 13.5219f, 16.8806f, 13.7494f, 16.797f)
                lineTo(13.2315f, 15.3892f)
                close()
                moveTo(14.2651f, 15.8068f)
                lineTo(14.0204f, 15.5624f)
                lineTo(12.9604f, 16.6237f)
                lineTo(13.2051f, 16.8681f)
                lineTo(14.2651f, 15.8068f)
                close()
                moveTo(8.9253f, 8.0123f)
                curveTo(8.5038f, 8.432f, 8.1364f, 8.7973f, 7.8507f, 9.1231f)
                curveTo(7.5662f, 9.4473f, 7.3165f, 9.7825f, 7.1665f, 10.1551f)
                lineTo(8.558f, 10.7153f)
                curveTo(8.6135f, 10.5773f, 8.7319f, 10.3931f, 8.9782f, 10.1123f)
                curveTo(9.2232f, 9.8331f, 9.5492f, 9.5079f, 9.9837f, 9.0752f)
                lineTo(8.9253f, 8.0123f)
                close()
                moveTo(7.1665f, 10.1551f)
                curveTo(7.0682f, 10.3991f, 7.0148f, 10.6534f, 7.0148f, 10.9233f)
                horizontalLineTo(8.5148f)
                curveTo(8.5148f, 10.8585f, 8.5263f, 10.7938f, 8.558f, 10.7153f)
                lineTo(7.1665f, 10.1551f)
                close()
                moveTo(7.1789f, 10.8127f)
                lineTo(7.3322f, 10.9658f)
                lineTo(8.3922f, 9.9045f)
                lineTo(8.2389f, 9.7514f)
                lineTo(7.1789f, 10.8127f)
                close()
                moveTo(5.0182f, 12.3559f)
                lineTo(3.3265f, 14.0455f)
                lineTo(4.3865f, 15.1068f)
                lineTo(6.0782f, 13.4172f)
                lineTo(5.0182f, 12.3559f)
                close()
                moveTo(2.8485f, 13.5708f)
                lineTo(3.0023f, 13.4172f)
                lineTo(1.9423f, 12.3559f)
                lineTo(1.7885f, 12.5095f)
                lineTo(2.8485f, 13.5708f)
                close()
                moveTo(2.8485f, 14.0455f)
                curveTo(2.7172f, 13.9143f, 2.7172f, 13.702f, 2.8485f, 13.5708f)
                lineTo(1.7885f, 12.5095f)
                curveTo(1.0705f, 13.2266f, 1.0705f, 14.3897f, 1.7885f, 15.1068f)
                lineTo(2.8485f, 14.0455f)
                close()
                moveTo(3.3265f, 14.0455f)
                curveTo(3.1946f, 14.1772f, 2.9804f, 14.1772f, 2.8485f, 14.0455f)
                lineTo(1.7885f, 15.1068f)
                curveTo(2.506f, 15.8235f, 3.669f, 15.8235f, 4.3865f, 15.1068f)
                lineTo(3.3265f, 14.0455f)
                close()
                moveTo(10.5457f, 17.9255f)
                lineTo(8.8539f, 19.6151f)
                lineTo(9.914f, 20.6764f)
                lineTo(11.6057f, 18.9868f)
                lineTo(10.5457f, 17.9255f)
                close()
                moveTo(11.4519f, 22.2125f)
                lineTo(11.6057f, 22.0589f)
                lineTo(10.5457f, 20.9976f)
                lineTo(10.3919f, 21.1512f)
                lineTo(11.4519f, 22.2125f)
                close()
                moveTo(8.8539f, 22.2125f)
                curveTo(9.5715f, 22.9292f, 10.7344f, 22.9292f, 11.4519f, 22.2125f)
                lineTo(10.3919f, 21.1512f)
                curveTo(10.26f, 21.2829f, 10.0458f, 21.2829f, 9.914f, 21.1512f)
                lineTo(8.8539f, 22.2125f)
                close()
                moveTo(8.8539f, 19.6151f)
                curveTo(8.1359f, 20.3323f, 8.1359f, 21.4954f, 8.8539f, 22.2125f)
                lineTo(9.914f, 21.1512f)
                curveTo(9.7826f, 21.02f, 9.7826f, 20.8077f, 9.914f, 20.6764f)
                lineTo(8.8539f, 19.6151f)
                close()
                moveTo(9.5721f, 16.1251f)
                lineTo(7.4697f, 18.2275f)
                lineTo(8.5303f, 19.2882f)
                lineTo(10.6328f, 17.1858f)
                lineTo(9.5721f, 16.1251f)
                close()
                moveTo(6.7964f, 13.3528f)
                lineTo(4.6795f, 15.4697f)
                lineTo(5.7401f, 16.5303f)
                lineTo(7.857f, 14.4134f)
                lineTo(6.7964f, 13.3528f)
                close()
                moveTo(6.4116f, 16.5091f)
                lineTo(4.7021f, 18.1811f)
                lineTo(5.7509f, 19.2535f)
                lineTo(7.4604f, 17.5815f)
                lineTo(6.4116f, 16.5091f)
                close()
            }
        }
            .build()
        return _rocket2!!
    }

private var _rocket2: ImageVector? = null
