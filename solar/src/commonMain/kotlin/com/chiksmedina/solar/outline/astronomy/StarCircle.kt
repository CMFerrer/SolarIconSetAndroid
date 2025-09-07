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

val AstronomyGroup.StarCircle: ImageVector
    get() {
        if (_starCircle != null) {
            return _starCircle!!
        }
        _starCircle = Builder(
            name = "StarCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 8.9005f)
                curveTo(11.8811f, 9.077f, 11.7345f, 9.3372f, 11.5164f, 9.7285f)
                lineTo(11.3853f, 9.9637f)
                curveTo(11.3755f, 9.9811f, 11.3655f, 9.9994f, 11.3551f, 10.0183f)
                curveTo(11.2465f, 10.2156f, 11.099f, 10.4836f, 10.8555f, 10.6685f)
                curveTo(10.6074f, 10.8568f, 10.3082f, 10.9227f, 10.0944f, 10.9697f)
                curveTo(10.0741f, 10.9742f, 10.0545f, 10.9785f, 10.0359f, 10.9827f)
                lineTo(9.7813f, 11.0403f)
                curveTo(9.3161f, 11.1456f, 9.0262f, 11.2129f, 8.8315f, 11.281f)
                curveTo(8.9519f, 11.462f, 9.1541f, 11.701f, 9.482f, 12.0845f)
                lineTo(9.6556f, 12.2874f)
                curveTo(9.6683f, 12.3024f, 9.6816f, 12.3178f, 9.6954f, 12.3337f)
                curveTo(9.8431f, 12.5047f, 10.0397f, 12.7322f, 10.1305f, 13.0244f)
                curveTo(10.2204f, 13.3135f, 10.19f, 13.6126f, 10.1667f, 13.8412f)
                curveTo(10.1645f, 13.8626f, 10.1624f, 13.8833f, 10.1605f, 13.9034f)
                lineTo(10.1343f, 14.1741f)
                curveTo(10.0874f, 14.6577f, 10.0585f, 14.9706f, 10.0593f, 15.1919f)
                curveTo(10.2516f, 15.1238f, 10.5148f, 15.0042f, 10.9166f, 14.8192f)
                lineTo(11.1549f, 14.7095f)
                curveTo(11.1725f, 14.7014f, 11.1908f, 14.6928f, 11.21f, 14.6839f)
                curveTo(11.4078f, 14.5913f, 11.6885f, 14.4599f, 12.0f, 14.4599f)
                curveTo(12.3115f, 14.4599f, 12.5922f, 14.5913f, 12.7901f, 14.6839f)
                curveTo(12.8092f, 14.6928f, 12.8275f, 14.7014f, 12.8451f, 14.7095f)
                lineTo(13.0834f, 14.8192f)
                curveTo(13.4852f, 15.0042f, 13.7484f, 15.1238f, 13.9407f, 15.1919f)
                curveTo(13.9415f, 14.9706f, 13.9126f, 14.6577f, 13.8657f, 14.1741f)
                lineTo(13.8395f, 13.9034f)
                curveTo(13.8376f, 13.8833f, 13.8355f, 13.8626f, 13.8333f, 13.8412f)
                curveTo(13.81f, 13.6126f, 13.7796f, 13.3135f, 13.8695f, 13.0244f)
                curveTo(13.9603f, 12.7322f, 14.1569f, 12.5047f, 14.3046f, 12.3337f)
                curveTo(14.3184f, 12.3178f, 14.3317f, 12.3024f, 14.3444f, 12.2874f)
                lineTo(14.518f, 12.0845f)
                curveTo(14.8459f, 11.701f, 15.0481f, 11.462f, 15.1685f, 11.281f)
                curveTo(14.9737f, 11.2129f, 14.6838f, 11.1456f, 14.2187f, 11.0403f)
                lineTo(13.9641f, 10.9827f)
                curveTo(13.9455f, 10.9785f, 13.9259f, 10.9742f, 13.9056f, 10.9697f)
                curveTo(13.6918f, 10.9227f, 13.3926f, 10.8568f, 13.1445f, 10.6685f)
                curveTo(12.901f, 10.4836f, 12.7535f, 10.2156f, 12.6449f, 10.0183f)
                curveTo(12.6345f, 9.9994f, 12.6245f, 9.9811f, 12.6147f, 9.9637f)
                lineTo(12.4836f, 9.7285f)
                curveTo(12.2655f, 9.3372f, 12.1189f, 9.077f, 12.0f, 8.9005f)
                close()
                moveTo(14.1529f, 15.2502f)
                curveTo(14.1541f, 15.2502f, 14.1547f, 15.2503f, 14.1547f, 15.2503f)
                close()
                moveTo(9.8453f, 15.2503f)
                curveTo(9.8454f, 15.2503f, 9.8459f, 15.2502f, 9.8471f, 15.2502f)
                close()
                moveTo(10.8831f, 7.8848f)
                curveTo(11.0988f, 7.6032f, 11.451f, 7.25f, 12.0f, 7.25f)
                curveTo(12.549f, 7.25f, 12.9012f, 7.6032f, 13.1169f, 7.8848f)
                curveTo(13.3245f, 8.156f, 13.5371f, 8.5375f, 13.7683f, 8.9524f)
                curveTo(13.7768f, 8.9676f, 13.7853f, 8.9829f, 13.7938f, 8.9982f)
                lineTo(13.9249f, 9.2333f)
                curveTo(13.9617f, 9.2993f, 13.9902f, 9.3504f, 14.0155f, 9.3941f)
                curveTo(14.0324f, 9.4235f, 14.0458f, 9.4457f, 14.0565f, 9.4629f)
                curveTo(14.0733f, 9.4675f, 14.0946f, 9.473f, 14.1219f, 9.4797f)
                curveTo(14.1689f, 9.4911f, 14.2235f, 9.5035f, 14.2952f, 9.5197f)
                lineTo(14.5497f, 9.5773f)
                curveTo(14.5671f, 9.5812f, 14.5844f, 9.5851f, 14.6016f, 9.5891f)
                curveTo(15.0485f, 9.6901f, 15.4657f, 9.7844f, 15.7807f, 9.9085f)
                curveTo(16.1219f, 10.043f, 16.5343f, 10.2854f, 16.6932f, 10.7964f)
                curveTo(16.8496f, 11.2992f, 16.6571f, 11.7332f, 16.4626f, 12.0421f)
                curveTo(16.2799f, 12.3323f, 15.9979f, 12.662f, 15.6916f, 13.0201f)
                lineTo(15.4844f, 13.2623f)
                curveTo(15.4357f, 13.3193f, 15.3981f, 13.3633f, 15.3662f, 13.4018f)
                curveTo(15.3401f, 13.4334f, 15.322f, 13.4562f, 15.309f, 13.4734f)
                curveTo(15.3107f, 13.5291f, 15.3179f, 13.6075f, 15.3325f, 13.7587f)
                lineTo(15.3637f, 14.0803f)
                curveTo(15.4102f, 14.5596f, 15.4526f, 14.997f, 15.4373f, 15.3415f)
                curveTo(15.4213f, 15.6994f, 15.3369f, 16.1785f, 14.9114f, 16.5015f)
                curveTo(14.4737f, 16.8337f, 13.9847f, 16.7689f, 13.6378f, 16.6695f)
                curveTo(13.3132f, 16.5765f, 12.9231f, 16.3969f, 12.5049f, 16.2042f)
                curveTo(12.4886f, 16.1967f, 12.4724f, 16.1892f, 12.4561f, 16.1817f)
                lineTo(12.2177f, 16.072f)
                curveTo(12.1507f, 16.0411f, 12.0994f, 16.0175f, 12.0548f, 15.9979f)
                curveTo(12.0329f, 15.9882f, 12.0149f, 15.9805f, 12.0f, 15.9744f)
                curveTo(11.9851f, 15.9805f, 11.9671f, 15.9882f, 11.9452f, 15.9979f)
                curveTo(11.9006f, 16.0175f, 11.8493f, 16.0411f, 11.7823f, 16.072f)
                lineTo(11.5439f, 16.1817f)
                curveTo(11.5276f, 16.1892f, 11.5114f, 16.1967f, 11.4951f, 16.2042f)
                curveTo(11.0769f, 16.3969f, 10.6868f, 16.5765f, 10.3622f, 16.6695f)
                curveTo(10.0153f, 16.7689f, 9.5263f, 16.8337f, 9.0886f, 16.5015f)
                curveTo(8.6631f, 16.1785f, 8.5787f, 15.6994f, 8.5627f, 15.3415f)
                curveTo(8.5474f, 14.997f, 8.5898f, 14.5596f, 8.6363f, 14.0804f)
                lineTo(8.6675f, 13.7587f)
                curveTo(8.6821f, 13.6075f, 8.6893f, 13.5291f, 8.691f, 13.4734f)
                curveTo(8.678f, 13.4562f, 8.66f, 13.4334f, 8.6338f, 13.4018f)
                curveTo(8.6019f, 13.3633f, 8.5643f, 13.3193f, 8.5156f, 13.2623f)
                lineTo(8.342f, 13.0594f)
                curveTo(8.3308f, 13.0463f, 8.3196f, 13.0332f, 8.3084f, 13.0201f)
                curveTo(8.0021f, 12.662f, 7.7201f, 12.3323f, 7.5374f, 12.0421f)
                curveTo(7.3429f, 11.7332f, 7.1505f, 11.2992f, 7.3068f, 10.7964f)
                curveTo(7.4657f, 10.2854f, 7.878f, 10.043f, 8.2193f, 9.9085f)
                curveTo(8.5343f, 9.7844f, 8.9515f, 9.6901f, 9.3984f, 9.5891f)
                curveTo(9.4156f, 9.5851f, 9.433f, 9.5812f, 9.4503f, 9.5773f)
                lineTo(9.7048f, 9.5197f)
                curveTo(9.7765f, 9.5035f, 9.8311f, 9.4911f, 9.8781f, 9.4797f)
                curveTo(9.9054f, 9.473f, 9.9267f, 9.4675f, 9.9435f, 9.4629f)
                curveTo(9.9542f, 9.4457f, 9.9676f, 9.4235f, 9.9846f, 9.3941f)
                curveTo(10.0098f, 9.3504f, 10.0383f, 9.2993f, 10.0751f, 9.2333f)
                lineTo(10.2062f, 8.9982f)
                curveTo(10.2147f, 8.9829f, 10.2232f, 8.9676f, 10.2317f, 8.9524f)
                curveTo(10.4629f, 8.5375f, 10.6755f, 8.156f, 10.8831f, 7.8848f)
                close()
            }
        }
            .build()
        return _starCircle!!
    }

private var _starCircle: ImageVector? = null
