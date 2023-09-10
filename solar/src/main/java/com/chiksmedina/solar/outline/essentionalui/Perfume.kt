package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Perfume: ImageVector
    get() {
        if (_perfume != null) {
            return _perfume!!
        }
        _perfume = Builder(
            name = "Perfume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9506f, 1.25f)
                horizontalLineTo(10.0494f)
                curveTo(10.7142f, 1.25f, 11.2871f, 1.2499f, 11.7458f, 1.3116f)
                curveTo(12.2375f, 1.3777f, 12.7087f, 1.5268f, 13.091f, 1.909f)
                curveTo(13.4732f, 2.2913f, 13.6223f, 2.7625f, 13.6884f, 3.2542f)
                curveTo(13.7272f, 3.5428f, 13.7416f, 3.8766f, 13.7469f, 4.25f)
                horizontalLineTo(14.3197f)
                curveTo(15.2124f, 4.25f, 16.0927f, 4.4578f, 16.8911f, 4.857f)
                lineTo(17.0093f, 4.9161f)
                curveTo(17.9527f, 3.8967f, 19.6234f, 3.8776f, 20.875f, 4.6002f)
                curveTo(22.2867f, 5.4153f, 23.1478f, 7.1638f, 22.3146f, 8.6068f)
                curveTo(21.4815f, 10.0499f, 19.5367f, 10.1784f, 18.125f, 9.3634f)
                curveTo(17.0041f, 8.7162f, 16.2304f, 7.4806f, 16.3763f, 6.2766f)
                lineTo(16.2203f, 6.1987f)
                curveTo(15.6302f, 5.9036f, 14.9795f, 5.75f, 14.3197f, 5.75f)
                horizontalLineTo(13.75f)
                lineTo(13.75f, 7.0f)
                curveTo(13.75f, 7.0149f, 13.7496f, 7.0297f, 13.7487f, 7.0444f)
                curveTo(16.5261f, 8.2871f, 18.5168f, 10.8696f, 18.7309f, 13.9436f)
                curveTo(18.7503f, 14.0279f, 18.7553f, 14.1158f, 18.7447f, 14.2031f)
                curveTo(18.7482f, 14.3f, 18.75f, 14.3973f, 18.75f, 14.495f)
                curveTo(18.75f, 16.616f, 17.8998f, 18.5448f, 16.5157f, 19.9988f)
                lineTo(16.498f, 20.0174f)
                curveTo(16.2853f, 20.241f, 16.0762f, 20.4607f, 15.7913f, 20.6693f)
                curveTo(15.4966f, 20.8851f, 15.1472f, 21.0713f, 14.6493f, 21.2848f)
                curveTo(13.5638f, 21.7502f, 12.7751f, 21.7501f, 11.5168f, 21.75f)
                horizontalLineTo(8.4832f)
                curveTo(7.2249f, 21.7501f, 6.4362f, 21.7502f, 5.3507f, 21.2848f)
                curveTo(4.8528f, 21.0713f, 4.5034f, 20.8851f, 4.2087f, 20.6693f)
                curveTo(3.9238f, 20.4607f, 3.7147f, 20.241f, 3.502f, 20.0174f)
                lineTo(3.4843f, 19.9988f)
                curveTo(2.1002f, 18.5448f, 1.25f, 16.616f, 1.25f, 14.495f)
                curveTo(1.25f, 11.1804f, 3.3093f, 8.3607f, 6.2513f, 7.0444f)
                curveTo(6.2504f, 7.0297f, 6.25f, 7.0149f, 6.25f, 7.0f)
                lineTo(6.25f, 6.9976f)
                verticalLineTo(5.5f)
                curveTo(6.25f, 5.4869f, 6.2503f, 5.4738f, 6.251f, 5.4608f)
                curveTo(6.2503f, 5.4479f, 6.25f, 5.4348f, 6.25f, 5.4217f)
                lineTo(6.25f, 4.9506f)
                curveTo(6.25f, 4.2858f, 6.2499f, 3.7129f, 6.3116f, 3.2542f)
                curveTo(6.3777f, 2.7625f, 6.5268f, 2.2913f, 6.909f, 1.909f)
                curveTo(7.2913f, 1.5268f, 7.7625f, 1.3777f, 8.2542f, 1.3116f)
                curveTo(8.7129f, 1.2499f, 9.2858f, 1.25f, 9.9506f, 1.25f)
                close()
                moveTo(17.0527f, 12.93f)
                curveTo(16.2982f, 9.9876f, 13.4637f, 7.7534f, 10.0078f, 7.75f)
                horizontalLineTo(9.9922f)
                curveTo(6.7318f, 7.7532f, 4.0245f, 9.742f, 3.0951f, 12.4378f)
                curveTo(3.3811f, 12.5641f, 3.6713f, 12.7044f, 3.9599f, 12.8451f)
                lineTo(4.0804f, 12.9039f)
                curveTo(4.4422f, 13.0806f, 4.8069f, 13.2586f, 5.1906f, 13.4285f)
                curveTo(6.039f, 13.8043f, 6.9418f, 14.1223f, 7.9446f, 14.2352f)
                curveTo(9.2037f, 14.377f, 10.1612f, 13.9399f, 11.3146f, 13.4133f)
                lineTo(11.326f, 13.4081f)
                curveTo(12.4605f, 12.8901f, 13.786f, 12.2896f, 15.5208f, 12.5777f)
                curveTo(16.0499f, 12.6656f, 16.5747f, 12.7861f, 17.0527f, 12.93f)
                close()
                moveTo(2.7744f, 13.9399f)
                curveTo(2.9423f, 14.0183f, 3.1176f, 14.1032f, 3.3024f, 14.1934f)
                lineTo(3.4233f, 14.2523f)
                curveTo(3.7822f, 14.4276f, 4.1723f, 14.6181f, 4.5831f, 14.8f)
                curveTo(5.5018f, 15.207f, 6.5618f, 15.589f, 7.7768f, 15.7258f)
                curveTo(9.4529f, 15.9145f, 10.7452f, 15.3233f, 11.8399f, 14.8224f)
                lineTo(11.949f, 14.7726f)
                curveTo(13.0909f, 14.2512f, 14.0363f, 13.8517f, 15.275f, 14.0575f)
                curveTo(16.0503f, 14.1862f, 16.7523f, 14.3829f, 17.2494f, 14.586f)
                curveTo(17.2256f, 16.2591f, 16.5471f, 17.7903f, 15.4292f, 18.9646f)
                curveTo(15.198f, 19.2075f, 15.0732f, 19.336f, 14.905f, 19.4591f)
                curveTo(14.7387f, 19.5809f, 14.5038f, 19.7151f, 14.0582f, 19.9062f)
                curveTo(13.2733f, 20.2427f, 12.7683f, 20.25f, 11.4584f, 20.25f)
                horizontalLineTo(8.5416f)
                curveTo(7.2317f, 20.25f, 6.7267f, 20.2427f, 5.9418f, 19.9062f)
                curveTo(5.4962f, 19.7151f, 5.2613f, 19.5809f, 5.095f, 19.4591f)
                curveTo(4.9268f, 19.336f, 4.802f, 19.2075f, 4.5708f, 18.9646f)
                curveTo(3.4327f, 17.769f, 2.75f, 16.2036f, 2.75f, 14.495f)
                curveTo(2.75f, 14.3083f, 2.7582f, 14.1231f, 2.7744f, 13.9399f)
                close()
                moveTo(12.25f, 6.25f)
                lineTo(7.75f, 6.25f)
                verticalLineTo(5.7169f)
                curveTo(7.8086f, 5.7063f, 7.8687f, 5.6923f, 7.9289f, 5.6737f)
                curveTo(8.1312f, 5.611f, 8.3659f, 5.4856f, 8.5372f, 5.2393f)
                curveTo(8.7029f, 5.001f, 8.75f, 4.7342f, 8.75f, 4.5f)
                curveTo(8.75f, 4.2659f, 8.7029f, 3.9989f, 8.5371f, 3.7606f)
                curveTo(8.3656f, 3.5142f, 8.1307f, 3.3889f, 7.9284f, 3.3265f)
                curveTo(7.8936f, 3.3157f, 7.8588f, 3.3065f, 7.8243f, 3.2986f)
                curveTo(7.867f, 3.0934f, 7.9229f, 3.0165f, 7.9697f, 2.9697f)
                curveTo(8.0268f, 2.9126f, 8.1287f, 2.842f, 8.454f, 2.7982f)
                curveTo(8.8009f, 2.7516f, 9.2717f, 2.75f, 10.0f, 2.75f)
                curveTo(10.7283f, 2.75f, 11.1991f, 2.7516f, 11.546f, 2.7982f)
                curveTo(11.8713f, 2.842f, 11.9732f, 2.9126f, 12.0303f, 2.9697f)
                curveTo(12.0874f, 3.0268f, 12.158f, 3.1287f, 12.2018f, 3.454f)
                curveTo(12.2484f, 3.8009f, 12.25f, 4.2717f, 12.25f, 5.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(18.875f, 8.0644f)
                curveTo(17.8953f, 7.4987f, 17.7131f, 6.5769f, 17.9845f, 6.1068f)
                curveTo(18.2559f, 5.6367f, 19.1453f, 5.3336f, 20.125f, 5.8993f)
                curveTo(21.1048f, 6.465f, 21.287f, 7.3867f, 21.0156f, 7.8568f)
                curveTo(20.7442f, 8.3269f, 19.8548f, 8.63f, 18.875f, 8.0644f)
                close()
            }
        }
            .build()
        return _perfume!!
    }

private var _perfume: ImageVector? = null
