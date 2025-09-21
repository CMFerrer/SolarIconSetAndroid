package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.9953f, 13.5202f)
                curveTo(21.9428f, 12.9192f, 21.4564f, 12.3136f, 20.6439f, 11.7496f)
                moveTo(21.9953f, 13.5202f)
                curveTo(22.0222f, 13.8282f, 21.9335f, 14.1163f, 21.7428f, 14.381f)
                curveTo(21.3566f, 14.9171f, 20.552f, 15.3568f, 19.4425f, 15.6699f)
                curveTo(21.0996f, 15.2022f, 22.0767f, 14.4522f, 21.9953f, 13.5202f)
                close()
                moveTo(21.9953f, 13.5202f)
                curveTo(21.9842f, 13.3934f, 21.9538f, 13.2665f, 21.9051f, 13.1397f)
                curveTo(21.8177f, 12.9121f, 21.6713f, 12.6853f, 21.4718f, 12.4617f)
                curveTo(21.1157f, 12.0626f, 20.5905f, 11.6738f, 19.9293f, 11.3096f)
                moveTo(21.9953f, 13.5202f)
                curveTo(22.0905f, 14.6106f, 20.7369f, 15.4518f, 18.5406f, 15.8835f)
                moveTo(20.6439f, 11.7496f)
                curveTo(18.8565f, 10.5086f, 15.491f, 9.4685f, 11.6958f, 9.1199f)
                curveTo(6.1756f, 8.6128f, 1.8367f, 9.7608f, 2.0047f, 11.684f)
                moveTo(20.6439f, 11.7496f)
                curveTo(20.0853f, 11.3617f, 19.3725f, 10.9935f, 18.5406f, 10.6599f)
                curveTo(19.0511f, 10.8646f, 19.5166f, 11.0823f, 19.9293f, 11.3096f)
                moveTo(2.0047f, 11.684f)
                curveTo(2.0158f, 11.8108f, 2.0462f, 11.9377f, 2.0949f, 12.0645f)
                curveTo(2.1823f, 12.2921f, 2.3287f, 12.5189f, 2.5282f, 12.7426f)
                curveTo(2.8843f, 13.1416f, 3.4095f, 13.5304f, 4.0707f, 13.8946f)
                moveTo(2.0047f, 11.684f)
                curveTo(1.9233f, 10.752f, 2.9004f, 10.0021f, 4.5575f, 9.5343f)
                curveTo(3.4481f, 9.8475f, 2.6434f, 10.2871f, 2.2572f, 10.8233f)
                curveTo(2.0665f, 11.0879f, 1.9778f, 11.376f, 2.0047f, 11.684f)
                close()
                moveTo(2.0047f, 11.684f)
                curveTo(2.0572f, 12.285f, 2.5436f, 12.8906f, 3.3561f, 13.4547f)
                moveTo(4.0707f, 13.8946f)
                curveTo(4.4834f, 14.1219f, 4.949f, 14.3396f, 5.4594f, 14.5444f)
                curveTo(4.6276f, 14.2107f, 3.9147f, 13.8425f, 3.3561f, 13.4547f)
                moveTo(4.0707f, 13.8946f)
                curveTo(5.021f, 14.418f, 6.252f, 14.8908f, 7.6649f, 15.2705f)
                moveTo(3.3561f, 13.4547f)
                curveTo(4.5132f, 14.258f, 6.3317f, 14.9772f, 8.5f, 15.4791f)
                moveTo(19.9293f, 11.3096f)
                curveTo(18.979f, 10.7862f, 17.748f, 10.3134f, 16.3351f, 9.9337f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.2744f, 4.8506f)
                curveTo(15.5336f, 4.687f, 15.7852f, 4.5454f, 16.0274f, 4.4271f)
                curveTo(16.9081f, 3.9969f, 17.6637f, 3.876f, 18.2019f, 4.1363f)
                curveTo(18.4777f, 4.2696f, 18.6797f, 4.495f, 18.8114f, 4.7985f)
                curveTo(18.9345f, 5.0819f, 18.9963f, 5.4335f, 18.9998f, 5.8418f)
                moveTo(15.2744f, 4.8506f)
                curveTo(13.46f, 5.9956f, 11.2763f, 8.2136f, 9.3819f, 10.9923f)
                curveTo(6.239f, 15.6024f, 5.0806f, 20.0137f, 6.788f, 20.8588f)
                moveTo(15.2744f, 4.8506f)
                curveTo(14.8855f, 5.096f, 14.4797f, 5.3907f, 14.0634f, 5.7297f)
                moveTo(6.788f, 20.8588f)
                curveTo(6.7913f, 20.8604f, 6.7947f, 20.8621f, 6.7981f, 20.8637f)
                curveTo(6.9116f, 20.9186f, 7.0348f, 20.9566f, 7.1668f, 20.9782f)
                curveTo(7.4039f, 21.0171f, 7.6693f, 21.0035f, 7.9581f, 20.9412f)
                curveTo(8.4735f, 20.8302f, 9.0635f, 20.5644f, 9.6993f, 20.1659f)
                curveTo(9.8482f, 20.0727f, 9.9995f, 19.9721f, 10.153f, 19.8646f)
                curveTo(10.4088f, 19.6855f, 10.6706f, 19.4869f, 10.9367f, 19.2703f)
                lineTo(12.1115f, 18.3157f)
                moveTo(6.788f, 20.8588f)
                curveTo(5.9623f, 20.4501f, 5.8069f, 19.2073f, 6.222f, 17.5113f)
                moveTo(18.7781f, 7.4887f)
                curveTo(18.9285f, 6.8742f, 19.004f, 6.3192f, 18.9998f, 5.8418f)
                moveTo(18.9998f, 5.8418f)
                curveTo(19.0073f, 6.698f, 18.7585f, 7.8038f, 18.281f, 9.0548f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
