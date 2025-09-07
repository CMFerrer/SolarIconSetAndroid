package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Planet4: ImageVector
    get() {
        if (_planet4 != null) {
            return _planet4!!
        }
        _planet4 = Builder(
            name = "Planet4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2024f, 17.4864f)
                curveTo(15.9289f, 18.0707f, 13.8858f, 18.75f, 11.8194f, 18.75f)
                curveTo(10.4153f, 18.75f, 9.3369f, 18.4232f, 8.4709f, 18.0619f)
                curveTo(8.1377f, 17.9229f, 7.8284f, 17.7752f, 7.5593f, 17.6467f)
                curveTo(7.4875f, 17.6124f, 7.4185f, 17.5795f, 7.3527f, 17.5484f)
                curveTo(7.0245f, 17.3936f, 6.7768f, 17.2868f, 6.5593f, 17.2272f)
                curveTo(5.5453f, 16.9497f, 4.5345f, 16.829f, 3.7708f, 16.7788f)
                curveTo(3.3907f, 16.7538f, 3.076f, 16.7466f, 2.8583f, 16.7455f)
                curveTo(2.7495f, 16.7449f, 2.6651f, 16.746f, 2.6092f, 16.747f)
                curveTo(2.5812f, 16.7476f, 2.5604f, 16.7482f, 2.5471f, 16.7486f)
                lineTo(2.5331f, 16.749f)
                lineTo(2.5308f, 16.7491f)
                lineTo(2.4856f, 16.751f)
                curveTo(3.6073f, 19.814f, 6.5484f, 22.0f, 10.0f, 22.0f)
                curveTo(13.1685f, 22.0f, 15.9068f, 20.158f, 17.2024f, 17.4864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0432f, 10.0472f)
                lineTo(3.4921f, 10.4391f)
                lineTo(3.4932f, 10.44f)
                lineTo(3.5058f, 10.4507f)
                curveTo(3.5185f, 10.4612f, 3.5396f, 10.4785f, 3.5689f, 10.5015f)
                curveTo(3.6275f, 10.5476f, 3.7185f, 10.6167f, 3.84f, 10.7011f)
                curveTo(4.0831f, 10.8703f, 4.4461f, 11.0998f, 4.9122f, 11.3303f)
                curveTo(5.846f, 11.792f, 7.1779f, 12.25f, 8.7845f, 12.25f)
                curveTo(9.8408f, 12.25f, 10.6464f, 11.9906f, 11.3282f, 11.6852f)
                curveTo(11.601f, 11.563f, 11.8456f, 11.4377f, 12.0921f, 11.3114f)
                curveTo(12.1638f, 11.2747f, 12.2357f, 11.2378f, 12.3085f, 11.201f)
                curveTo(12.6144f, 11.0461f, 12.9485f, 10.8842f, 13.2886f, 10.7843f)
                curveTo(14.3506f, 10.4722f, 15.2771f, 10.3399f, 15.9424f, 10.2856f)
                curveTo(16.2754f, 10.2584f, 16.5441f, 10.2508f, 16.7329f, 10.2501f)
                curveTo(16.8273f, 10.2497f, 16.9019f, 10.2511f, 16.9547f, 10.2527f)
                curveTo(16.9811f, 10.2535f, 17.0021f, 10.2543f, 17.0174f, 10.2551f)
                lineTo(17.0361f, 10.256f)
                lineTo(17.0421f, 10.2563f)
                lineTo(17.0444f, 10.2565f)
                lineTo(17.0457f, 10.2565f)
                lineTo(17.0728f, 10.2582f)
                curveTo(15.7301f, 7.7253f, 13.0665f, 6.0f, 10.0f, 6.0f)
                curveTo(7.0195f, 6.0f, 4.4196f, 7.63f, 3.0432f, 10.0472f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.8457f, 15.571f)
                curveTo(17.9469f, 15.0629f, 18.0f, 14.5374f, 18.0f, 13.9995f)
                curveTo(18.0f, 13.2362f, 17.8931f, 12.4979f, 17.6935f, 11.7987f)
                lineTo(16.9557f, 11.7533f)
                lineTo(16.9546f, 11.7533f)
                lineTo(16.9482f, 11.753f)
                curveTo(16.9406f, 11.7526f, 16.9276f, 11.7521f, 16.9093f, 11.7515f)
                curveTo(16.8727f, 11.7504f, 16.8151f, 11.7493f, 16.7384f, 11.7496f)
                curveTo(16.5849f, 11.7501f, 16.3552f, 11.7564f, 16.0643f, 11.7802f)
                curveTo(15.4818f, 11.8277f, 14.6584f, 11.9447f, 13.7114f, 12.2229f)
                curveTo(13.5171f, 12.28f, 13.2923f, 12.3837f, 12.9861f, 12.5387f)
                curveTo(12.9253f, 12.5695f, 12.8615f, 12.6022f, 12.7949f, 12.6363f)
                curveTo(12.5441f, 12.7649f, 12.2537f, 12.9138f, 11.9413f, 13.0537f)
                curveTo(11.1281f, 13.4179f, 10.1104f, 13.7495f, 8.7845f, 13.7495f)
                curveTo(6.891f, 13.7495f, 5.3307f, 13.2101f, 4.2473f, 12.6744f)
                curveTo(3.7048f, 12.4061f, 3.2779f, 12.1369f, 2.9834f, 11.932f)
                curveTo(2.8359f, 11.8295f, 2.7211f, 11.7427f, 2.6411f, 11.6797f)
                curveTo(2.6011f, 11.6482f, 2.5697f, 11.6226f, 2.5472f, 11.6039f)
                lineTo(2.5202f, 11.5812f)
                lineTo(2.5117f, 11.574f)
                lineTo(2.5088f, 11.5714f)
                lineTo(2.5076f, 11.5704f)
                curveTo(2.5076f, 11.5704f, 2.5067f, 11.5696f, 2.9921f, 11.0137f)
                lineTo(2.5067f, 11.5696f)
                lineTo(2.4047f, 11.4805f)
                curveTo(2.1421f, 12.2725f, 2.0f, 13.1194f, 2.0f, 13.9995f)
                curveTo(2.0f, 14.4302f, 2.034f, 14.8529f, 2.0995f, 15.2651f)
                lineTo(2.4692f, 15.2499f)
                lineTo(2.5f, 15.9993f)
                curveTo(2.4692f, 15.2499f, 2.4692f, 15.2499f, 2.4692f, 15.2499f)
                lineTo(2.4706f, 15.2498f)
                lineTo(2.4727f, 15.2498f)
                lineTo(2.4792f, 15.2495f)
                lineTo(2.5012f, 15.2488f)
                curveTo(2.5198f, 15.2482f, 2.5461f, 15.2475f, 2.5798f, 15.2469f)
                curveTo(2.6472f, 15.2455f, 2.7438f, 15.2444f, 2.8656f, 15.245f)
                curveTo(3.1091f, 15.2462f, 3.4544f, 15.2543f, 3.8691f, 15.2816f)
                curveTo(4.6948f, 15.3358f, 5.8127f, 15.4672f, 6.9552f, 15.78f)
                curveTo(7.3114f, 15.8775f, 7.6638f, 16.0362f, 7.9926f, 16.1913f)
                curveTo(8.07f, 16.2278f, 8.1466f, 16.2644f, 8.2233f, 16.301f)
                curveTo(8.4882f, 16.4274f, 8.7535f, 16.554f, 9.0484f, 16.6771f)
                curveTo(9.7872f, 16.9853f, 10.6661f, 17.2495f, 11.8193f, 17.2495f)
                curveTo(13.9606f, 17.2495f, 16.1505f, 16.385f, 17.139f, 15.8421f)
                lineTo(17.7963f, 15.4811f)
                lineTo(17.8457f, 15.571f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.53f, 4.0447f)
                curveTo(20.4934f, 3.9506f, 20.4492f, 3.8581f, 20.3971f, 3.768f)
                curveTo(20.3451f, 3.6778f, 20.2871f, 3.5932f, 20.2239f, 3.5145f)
                curveTo(20.5502f, 3.4237f, 20.7725f, 3.4181f, 20.8301f, 3.518f)
                curveTo(20.8878f, 3.6178f, 20.7718f, 3.8075f, 20.53f, 4.0447f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(16.7799f, 6.1122f, 16.5577f, 6.1178f, 16.5f, 6.018f)
                curveTo(16.4423f, 5.9181f, 16.5583f, 5.7284f, 16.8001f, 5.4912f)
                curveTo(16.8367f, 5.5853f, 16.881f, 5.6778f, 16.933f, 5.768f)
                curveTo(16.9851f, 5.8581f, 17.0431f, 5.9427f, 17.1063f, 6.0214f)
                close()
                moveTo(17.1063f, 6.0214f)
                curveTo(17.5613f, 5.8949f, 18.2188f, 5.603f, 18.9151f, 5.201f)
                curveTo(19.6114f, 4.799f, 20.1929f, 4.3755f, 20.53f, 4.0447f)
                curveTo(20.882f, 4.9491f, 20.5315f, 5.9998f, 19.6651f, 6.5f)
                curveTo(18.7986f, 7.0002f, 17.7135f, 6.7785f, 17.1063f, 6.0214f)
                close()
                moveTo(16.8001f, 5.4912f)
                curveTo(16.4481f, 4.5868f, 16.7986f, 3.5361f, 17.6651f, 3.0359f)
                curveTo(18.5315f, 2.5357f, 19.6166f, 2.7574f, 20.2239f, 3.5145f)
                curveTo(19.7689f, 3.641f, 19.1114f, 3.9329f, 18.4151f, 4.3349f)
                curveTo(17.7188f, 4.7369f, 17.1372f, 5.1604f, 16.8001f, 5.4912f)
                close()
            }
        }
            .build()
        return _planet4!!
    }

private var _planet4: ImageVector? = null
