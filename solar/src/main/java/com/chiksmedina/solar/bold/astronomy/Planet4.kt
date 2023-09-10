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
                moveTo(17.8457f, 15.5715f)
                curveTo(17.9469f, 15.0634f, 18.0f, 14.5379f, 18.0f, 14.0f)
                curveTo(18.0f, 13.2367f, 17.8931f, 12.4984f, 17.6935f, 11.7992f)
                lineTo(16.9557f, 11.7538f)
                lineTo(16.9546f, 11.7538f)
                lineTo(16.9482f, 11.7535f)
                curveTo(16.9406f, 11.7531f, 16.9276f, 11.7526f, 16.9093f, 11.752f)
                curveTo(16.8727f, 11.7509f, 16.8151f, 11.7498f, 16.7384f, 11.75f)
                curveTo(16.5849f, 11.7506f, 16.3552f, 11.7569f, 16.0643f, 11.7806f)
                curveTo(15.4818f, 11.8281f, 14.6584f, 11.9452f, 13.7114f, 12.2234f)
                curveTo(13.5171f, 12.2805f, 13.2923f, 12.3842f, 12.9861f, 12.5392f)
                curveTo(12.9253f, 12.57f, 12.8615f, 12.6027f, 12.7949f, 12.6368f)
                curveTo(12.5441f, 12.7654f, 12.2537f, 12.9143f, 11.9413f, 13.0542f)
                curveTo(11.1281f, 13.4184f, 10.1104f, 13.75f, 8.7845f, 13.75f)
                curveTo(6.891f, 13.75f, 5.3307f, 13.2106f, 4.2473f, 12.6749f)
                curveTo(3.7048f, 12.4066f, 3.2779f, 12.1374f, 2.9834f, 11.9325f)
                curveTo(2.8359f, 11.83f, 2.7211f, 11.7432f, 2.6411f, 11.6802f)
                curveTo(2.6011f, 11.6487f, 2.5697f, 11.6231f, 2.5472f, 11.6044f)
                lineTo(2.5202f, 11.5817f)
                lineTo(2.5117f, 11.5745f)
                lineTo(2.5088f, 11.5719f)
                lineTo(2.5076f, 11.5709f)
                curveTo(2.5076f, 11.5709f, 2.5067f, 11.5701f, 2.9921f, 11.0142f)
                lineTo(2.5067f, 11.5701f)
                lineTo(2.4047f, 11.481f)
                curveTo(2.1421f, 12.273f, 2.0f, 13.1199f, 2.0f, 14.0f)
                curveTo(2.0f, 14.4306f, 2.034f, 14.8533f, 2.0995f, 15.2655f)
                lineTo(2.4692f, 15.2504f)
                lineTo(2.5f, 15.9997f)
                curveTo(2.4692f, 15.2504f, 2.4692f, 15.2504f, 2.4692f, 15.2504f)
                lineTo(2.4706f, 15.2503f)
                lineTo(2.4727f, 15.2502f)
                lineTo(2.4792f, 15.25f)
                lineTo(2.5012f, 15.2493f)
                curveTo(2.5198f, 15.2487f, 2.5461f, 15.248f, 2.5798f, 15.2473f)
                curveTo(2.6472f, 15.246f, 2.7438f, 15.2449f, 2.8656f, 15.2455f)
                curveTo(3.1091f, 15.2467f, 3.4544f, 15.2548f, 3.8691f, 15.282f)
                curveTo(4.6948f, 15.3363f, 5.8127f, 15.4677f, 6.9552f, 15.7805f)
                curveTo(7.3114f, 15.878f, 7.6638f, 16.0367f, 7.9926f, 16.1918f)
                curveTo(8.07f, 16.2283f, 8.1466f, 16.2649f, 8.2233f, 16.3014f)
                curveTo(8.4882f, 16.4279f, 8.7535f, 16.5545f, 9.0484f, 16.6775f)
                curveTo(9.7872f, 16.9858f, 10.6661f, 17.25f, 11.8193f, 17.25f)
                curveTo(13.9606f, 17.25f, 16.1505f, 16.3855f, 17.139f, 15.8426f)
                lineTo(17.7963f, 15.4816f)
                lineTo(17.8457f, 15.5715f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2024f, 17.4864f)
                curveTo(15.9289f, 18.0707f, 13.8857f, 18.75f, 11.8193f, 18.75f)
                curveTo(10.4152f, 18.75f, 9.3368f, 18.4232f, 8.4708f, 18.0619f)
                curveTo(8.1376f, 17.9229f, 7.8284f, 17.7752f, 7.5592f, 17.6467f)
                curveTo(7.4875f, 17.6124f, 7.4185f, 17.5795f, 7.3527f, 17.5484f)
                curveTo(7.0244f, 17.3936f, 6.7768f, 17.2868f, 6.5592f, 17.2272f)
                curveTo(5.5452f, 16.9497f, 4.5345f, 16.829f, 3.7707f, 16.7788f)
                curveTo(3.3906f, 16.7538f, 3.076f, 16.7466f, 2.8582f, 16.7455f)
                curveTo(2.7494f, 16.7449f, 2.6651f, 16.746f, 2.6091f, 16.747f)
                curveTo(2.5812f, 16.7476f, 2.5603f, 16.7482f, 2.5471f, 16.7486f)
                lineTo(2.533f, 16.749f)
                lineTo(2.5308f, 16.7491f)
                lineTo(2.4855f, 16.751f)
                curveTo(3.6072f, 19.814f, 6.5483f, 22.0f, 10.0f, 22.0f)
                curveTo(13.1685f, 22.0f, 15.9068f, 20.158f, 17.2024f, 17.4864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0432f, 10.0472f)
                lineTo(3.492f, 10.4391f)
                lineTo(3.4931f, 10.44f)
                lineTo(3.5058f, 10.4507f)
                curveTo(3.5185f, 10.4612f, 3.5396f, 10.4785f, 3.5689f, 10.5015f)
                curveTo(3.6274f, 10.5476f, 3.7185f, 10.6167f, 3.8399f, 10.7011f)
                curveTo(4.0831f, 10.8703f, 4.446f, 11.0998f, 4.9121f, 11.3303f)
                curveTo(5.846f, 11.792f, 7.1779f, 12.25f, 8.7845f, 12.25f)
                curveTo(9.8407f, 12.25f, 10.6463f, 11.9906f, 11.3282f, 11.6852f)
                curveTo(11.6009f, 11.563f, 11.8456f, 11.4377f, 12.0921f, 11.3114f)
                curveTo(12.1638f, 11.2747f, 12.2357f, 11.2378f, 12.3084f, 11.201f)
                curveTo(12.6144f, 11.0461f, 12.9485f, 10.8842f, 13.2886f, 10.7843f)
                curveTo(14.3505f, 10.4722f, 15.2771f, 10.3399f, 15.9424f, 10.2856f)
                curveTo(16.2754f, 10.2584f, 16.544f, 10.2508f, 16.7328f, 10.2501f)
                curveTo(16.8273f, 10.2497f, 16.9019f, 10.2511f, 16.9547f, 10.2527f)
                curveTo(16.9811f, 10.2535f, 17.0021f, 10.2543f, 17.0174f, 10.2551f)
                lineTo(17.036f, 10.256f)
                lineTo(17.0421f, 10.2563f)
                lineTo(17.0443f, 10.2565f)
                lineTo(17.0456f, 10.2565f)
                curveTo(17.0456f, 10.2565f, 17.046f, 10.2566f, 17.0001f, 11.0037f)
                lineTo(17.0456f, 10.2565f)
                lineTo(17.0728f, 10.2582f)
                curveTo(15.73f, 7.7253f, 13.0665f, 6.0f, 10.0f, 6.0f)
                curveTo(7.0195f, 6.0f, 4.4196f, 7.63f, 3.0432f, 10.0472f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.5301f, 4.0447f)
                curveTo(20.4935f, 3.9506f, 20.4493f, 3.8581f, 20.3972f, 3.768f)
                curveTo(20.3452f, 3.6778f, 20.2872f, 3.5932f, 20.224f, 3.5145f)
                curveTo(20.5504f, 3.4237f, 20.7726f, 3.4181f, 20.8302f, 3.518f)
                curveTo(20.8879f, 3.6178f, 20.7719f, 3.8075f, 20.5301f, 4.0447f)
                close()
                moveTo(17.1064f, 6.0214f)
                curveTo(16.78f, 6.1122f, 16.5578f, 6.1178f, 16.5001f, 6.018f)
                curveTo(16.4425f, 5.9181f, 16.5584f, 5.7284f, 16.8002f, 5.4912f)
                curveTo(16.8369f, 5.5853f, 16.8811f, 5.6778f, 16.9331f, 5.768f)
                curveTo(16.9852f, 5.8581f, 17.0432f, 5.9427f, 17.1064f, 6.0214f)
                close()
                moveTo(17.1064f, 6.0214f)
                curveTo(17.5614f, 5.8949f, 18.2189f, 5.603f, 18.9152f, 5.201f)
                curveTo(19.6115f, 4.799f, 20.1931f, 4.3755f, 20.5301f, 4.0447f)
                curveTo(20.8822f, 4.9491f, 20.5316f, 5.9998f, 19.6652f, 6.5f)
                curveTo(18.7988f, 7.0002f, 17.7136f, 6.7785f, 17.1064f, 6.0214f)
                close()
                moveTo(16.8002f, 5.4912f)
                curveTo(16.4482f, 4.5868f, 16.7988f, 3.5361f, 17.6652f, 3.0359f)
                curveTo(18.5316f, 2.5357f, 19.6168f, 2.7574f, 20.224f, 3.5145f)
                curveTo(19.769f, 3.641f, 19.1115f, 3.9329f, 18.4152f, 4.3349f)
                curveTo(17.7189f, 4.7369f, 17.1373f, 5.1604f, 16.8002f, 5.4912f)
                close()
            }
        }
            .build()
        return _planet4!!
    }

private var _planet4: ImageVector? = null
