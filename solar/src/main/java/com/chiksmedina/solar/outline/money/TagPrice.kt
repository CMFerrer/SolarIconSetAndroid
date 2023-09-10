package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.TagPrice: ImageVector
    get() {
        if (_tagPrice != null) {
            return _tagPrice!!
        }
        _tagPrice = Builder(
            name = "TagPrice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.2383f, 2.7989f)
                curveTo(10.6243f, 2.88f, 9.866f, 3.0542f, 8.7874f, 3.3031f)
                lineTo(7.5592f, 3.5865f)
                curveTo(6.6482f, 3.7968f, 6.0209f, 3.9425f, 5.5416f, 4.107f)
                curveTo(5.079f, 4.2658f, 4.8173f, 4.4223f, 4.6198f, 4.6198f)
                curveTo(4.4223f, 4.8173f, 4.2658f, 5.079f, 4.107f, 5.5416f)
                curveTo(3.9425f, 6.0208f, 3.7968f, 6.6482f, 3.5866f, 7.5592f)
                lineTo(3.3031f, 8.7874f)
                curveTo(3.0542f, 9.866f, 2.8801f, 10.6243f, 2.7989f, 11.2383f)
                curveTo(2.7199f, 11.8365f, 2.7381f, 12.2413f, 2.8436f, 12.6092f)
                curveTo(2.9491f, 12.9772f, 3.1482f, 13.3301f, 3.5323f, 13.7954f)
                curveTo(3.9265f, 14.2731f, 4.4761f, 14.8238f, 5.2589f, 15.6066f)
                lineTo(7.0885f, 17.4362f)
                curveTo(8.448f, 18.7957f, 9.4154f, 19.7608f, 10.247f, 20.3954f)
                curveTo(11.0614f, 21.0167f, 11.6569f, 21.25f, 12.2624f, 21.25f)
                curveTo(12.8678f, 21.25f, 13.4633f, 21.0167f, 14.2777f, 20.3954f)
                curveTo(15.1093f, 19.7608f, 16.0767f, 18.7957f, 17.4362f, 17.4362f)
                curveTo(18.7957f, 16.0767f, 19.7608f, 15.1093f, 20.3954f, 14.2776f)
                curveTo(21.0167f, 13.4633f, 21.25f, 12.8678f, 21.25f, 12.2623f)
                curveTo(21.25f, 11.6569f, 21.0167f, 11.0614f, 20.3954f, 10.247f)
                curveTo(19.7608f, 9.4153f, 18.7957f, 8.4479f, 17.4362f, 7.0884f)
                lineTo(15.6066f, 5.2588f)
                curveTo(14.8238f, 4.4761f, 14.2732f, 3.9265f, 13.7955f, 3.5323f)
                curveTo(13.3301f, 3.1482f, 12.9772f, 2.9491f, 12.6092f, 2.8436f)
                curveTo(12.2413f, 2.738f, 11.8365f, 2.7198f, 11.2383f, 2.7989f)
                close()
                moveTo(11.0418f, 1.3118f)
                curveTo(11.7591f, 1.217f, 12.3881f, 1.2197f, 13.0228f, 1.4017f)
                curveTo(13.6574f, 1.5837f, 14.1922f, 1.9148f, 14.7503f, 2.3754f)
                curveTo(15.2897f, 2.8206f, 15.8905f, 3.4214f, 16.641f, 4.1719f)
                lineTo(18.5368f, 6.0677f)
                curveTo(19.8475f, 7.3783f, 20.8851f, 8.416f, 21.5879f, 9.3371f)
                curveTo(22.3111f, 10.2849f, 22.75f, 11.197f, 22.75f, 12.2623f)
                curveTo(22.75f, 13.3276f, 22.3111f, 14.2397f, 21.5879f, 15.1875f)
                curveTo(20.8851f, 16.1087f, 19.8475f, 17.1463f, 18.5368f, 18.4569f)
                lineTo(18.4569f, 18.5368f)
                curveTo(17.1463f, 19.8474f, 16.1087f, 20.8851f, 15.1875f, 21.5879f)
                curveTo(14.2397f, 22.311f, 13.3276f, 22.75f, 12.2624f, 22.75f)
                curveTo(11.1971f, 22.75f, 10.285f, 22.311f, 9.3372f, 21.5879f)
                curveTo(8.416f, 20.8851f, 7.3784f, 19.8474f, 6.0677f, 18.5368f)
                lineTo(4.172f, 16.641f)
                curveTo(3.4214f, 15.8905f, 2.8206f, 15.2897f, 2.3754f, 14.7502f)
                curveTo(1.9148f, 14.1922f, 1.5838f, 13.6574f, 1.4017f, 13.0227f)
                curveTo(1.2197f, 12.3881f, 1.217f, 11.7591f, 1.3118f, 11.0418f)
                curveTo(1.4035f, 10.3484f, 1.5945f, 9.5205f, 1.8332f, 8.4862f)
                lineTo(2.1339f, 7.1833f)
                curveTo(2.3331f, 6.3202f, 2.4955f, 5.6164f, 2.6882f, 5.0547f)
                curveTo(2.8896f, 4.4681f, 3.1432f, 3.9751f, 3.5591f, 3.5591f)
                curveTo(3.9751f, 3.1431f, 4.4681f, 2.8895f, 5.0547f, 2.6882f)
                curveTo(5.6164f, 2.4954f, 6.3203f, 2.333f, 7.1834f, 2.1339f)
                lineTo(8.4862f, 1.8332f)
                curveTo(9.5205f, 1.5945f, 10.3484f, 1.4035f, 11.0418f, 1.3118f)
                close()
                moveTo(9.4909f, 7.9952f)
                curveTo(9.0028f, 7.5071f, 8.2113f, 7.5071f, 7.7232f, 7.9952f)
                curveTo(7.235f, 8.4834f, 7.235f, 9.2748f, 7.7232f, 9.763f)
                curveTo(8.2113f, 10.2511f, 9.0028f, 10.2511f, 9.4909f, 9.763f)
                curveTo(9.9791f, 9.2748f, 9.9791f, 8.4834f, 9.4909f, 7.9952f)
                close()
                moveTo(6.6625f, 6.9346f)
                curveTo(7.7365f, 5.8606f, 9.4777f, 5.8606f, 10.5516f, 6.9346f)
                curveTo(11.6255f, 8.0085f, 11.6255f, 9.7497f, 10.5516f, 10.8236f)
                curveTo(9.4777f, 11.8976f, 7.7365f, 11.8976f, 6.6625f, 10.8236f)
                curveTo(5.5886f, 9.7497f, 5.5886f, 8.0085f, 6.6625f, 6.9346f)
                close()
                moveTo(12.9929f, 12.107f)
                curveTo(12.816f, 12.1053f, 12.5835f, 12.1847f, 12.3841f, 12.3841f)
                curveTo(11.9966f, 12.7716f, 12.0985f, 13.1591f, 12.2073f, 13.268f)
                curveTo(12.3162f, 13.3768f, 12.7037f, 13.4787f, 13.0912f, 13.0912f)
                curveTo(13.8753f, 12.3071f, 15.2289f, 12.0469f, 16.0964f, 12.9144f)
                curveTo(16.7694f, 13.5874f, 16.7637f, 14.553f, 16.3612f, 15.3182f)
                curveTo(16.5624f, 15.6104f, 16.533f, 16.0134f, 16.2732f, 16.2732f)
                curveTo(16.0143f, 16.5321f, 15.6131f, 16.5621f, 15.3212f, 16.3633f)
                curveTo(14.8643f, 16.6061f, 14.3446f, 16.6971f, 13.849f, 16.5952f)
                curveTo(13.4433f, 16.5119f, 13.182f, 16.1153f, 13.2654f, 15.7096f)
                curveTo(13.3487f, 15.3039f, 13.7452f, 15.0426f, 14.151f, 15.1259f)
                curveTo(14.3281f, 15.1623f, 14.6137f, 15.1042f, 14.859f, 14.859f)
                curveTo(15.2465f, 14.4714f, 15.1446f, 14.0839f, 15.0358f, 13.9751f)
                curveTo(14.9269f, 13.8662f, 14.5394f, 13.7643f, 14.1519f, 14.1518f)
                curveTo(13.3678f, 14.9359f, 12.0142f, 15.1961f, 11.1467f, 14.3286f)
                curveTo(10.4737f, 13.6557f, 10.4794f, 12.6901f, 10.8819f, 11.9248f)
                curveTo(10.6807f, 11.6327f, 10.7101f, 11.2297f, 10.9699f, 10.9699f)
                curveTo(11.2288f, 10.711f, 11.6298f, 10.6809f, 11.9217f, 10.8796f)
                curveTo(12.2615f, 10.699f, 12.635f, 10.6035f, 13.0071f, 10.607f)
                curveTo(13.4213f, 10.6109f, 13.7539f, 10.9499f, 13.75f, 11.3641f)
                curveTo(13.7461f, 11.7783f, 13.4071f, 12.1109f, 12.9929f, 12.107f)
                close()
            }
        }
            .build()
        return _tagPrice!!
    }

private var _tagPrice: ImageVector? = null
