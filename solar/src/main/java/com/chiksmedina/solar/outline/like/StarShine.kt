package com.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.LikeGroup

val LikeGroup.StarShine: ImageVector
    get() {
        if (_starShine != null) {
            return _starShine!!
        }
        _starShine = Builder(
            name = "StarShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(18.5304f, 5.4696f)
                curveTo(18.8233f, 5.7625f, 18.8233f, 6.2373f, 18.5304f, 6.5302f)
                lineTo(18.1872f, 6.8735f)
                curveTo(17.8943f, 7.1664f, 17.4194f, 7.1664f, 17.1265f, 6.8735f)
                curveTo(16.8336f, 6.5806f, 16.8336f, 6.1057f, 17.1265f, 5.8128f)
                lineTo(17.4698f, 5.4696f)
                curveTo(17.7627f, 5.1767f, 18.2376f, 5.1767f, 18.5304f, 5.4696f)
                close()
                moveTo(5.4697f, 5.4697f)
                curveTo(5.7626f, 5.1768f, 6.2374f, 5.1768f, 6.5303f, 5.4697f)
                lineTo(6.8736f, 5.8129f)
                curveTo(7.1665f, 6.1058f, 7.1665f, 6.5807f, 6.8736f, 6.8736f)
                curveTo(6.5807f, 7.1665f, 6.1058f, 7.1665f, 5.8129f, 6.8736f)
                lineTo(5.4697f, 6.5303f)
                curveTo(5.1768f, 6.2374f, 5.1768f, 5.7626f, 5.4697f, 5.4697f)
                close()
                moveTo(11.9437f, 7.882f)
                curveTo(11.7675f, 8.1122f, 11.5606f, 8.4794f, 11.2317f, 9.0694f)
                lineTo(11.0678f, 9.3633f)
                curveTo(11.0557f, 9.385f, 11.0435f, 9.4071f, 11.0311f, 9.4297f)
                curveTo(10.8918f, 9.6818f, 10.7267f, 9.9807f, 10.456f, 10.1863f)
                curveTo(10.1807f, 10.3952f, 9.848f, 10.469f, 9.5748f, 10.5296f)
                curveTo(9.5505f, 10.535f, 9.5267f, 10.5403f, 9.5035f, 10.5455f)
                lineTo(9.1853f, 10.6175f)
                curveTo(8.5449f, 10.7624f, 8.1521f, 10.8535f, 7.8929f, 10.9556f)
                curveTo(7.8373f, 10.9775f, 7.7979f, 10.9961f, 7.7706f, 11.0107f)
                curveTo(7.7852f, 11.0432f, 7.8096f, 11.0898f, 7.8498f, 11.1536f)
                curveTo(8.0048f, 11.3999f, 8.2747f, 11.7185f, 8.71f, 12.2275f)
                lineTo(8.927f, 12.4812f)
                curveTo(8.9427f, 12.4995f, 8.9587f, 12.5182f, 8.975f, 12.5371f)
                curveTo(9.1635f, 12.7559f, 9.3828f, 13.0105f, 9.4841f, 13.3361f)
                curveTo(9.5844f, 13.6588f, 9.5508f, 13.9938f, 9.5214f, 14.2861f)
                curveTo(9.5189f, 14.3115f, 9.5164f, 14.3365f, 9.514f, 14.3611f)
                lineTo(9.4812f, 14.6995f)
                curveTo(9.4155f, 15.3777f, 9.376f, 15.8044f, 9.3892f, 16.1018f)
                curveTo(9.3918f, 16.1592f, 9.3961f, 16.2034f, 9.4008f, 16.237f)
                curveTo(9.4246f, 16.2318f, 9.4535f, 16.2246f, 9.4879f, 16.2147f)
                curveTo(9.755f, 16.1382f, 10.1245f, 15.9704f, 10.7242f, 15.6943f)
                lineTo(11.0221f, 15.5572f)
                curveTo(11.0441f, 15.547f, 11.0666f, 15.5366f, 11.0895f, 15.5259f)
                curveTo(11.3428f, 15.4079f, 11.655f, 15.2624f, 12.0f, 15.2624f)
                curveTo(12.345f, 15.2624f, 12.6572f, 15.4079f, 12.9105f, 15.5259f)
                curveTo(12.9334f, 15.5366f, 12.9559f, 15.547f, 12.9779f, 15.5572f)
                lineTo(13.2758f, 15.6943f)
                curveTo(13.8755f, 15.9704f, 14.2449f, 16.1382f, 14.5121f, 16.2147f)
                curveTo(14.5466f, 16.2246f, 14.5754f, 16.2318f, 14.5993f, 16.237f)
                curveTo(14.6039f, 16.2034f, 14.6082f, 16.1592f, 14.6108f, 16.1018f)
                curveTo(14.624f, 15.8044f, 14.5845f, 15.3777f, 14.5188f, 14.6995f)
                lineTo(14.486f, 14.3611f)
                curveTo(14.4836f, 14.3365f, 14.4811f, 14.3115f, 14.4786f, 14.2861f)
                curveTo(14.4492f, 13.9938f, 14.4156f, 13.6588f, 14.5159f, 13.3361f)
                curveTo(14.6172f, 13.0105f, 14.8365f, 12.7559f, 15.025f, 12.5371f)
                curveTo(15.0413f, 12.5182f, 15.0573f, 12.4995f, 15.073f, 12.4812f)
                lineTo(15.29f, 12.2275f)
                curveTo(15.7253f, 11.7185f, 15.9952f, 11.3999f, 16.1502f, 11.1536f)
                curveTo(16.1904f, 11.0898f, 16.2148f, 11.0432f, 16.2294f, 11.0107f)
                curveTo(16.2021f, 10.9961f, 16.1627f, 10.9775f, 16.1071f, 10.9556f)
                curveTo(15.8479f, 10.8535f, 15.4551f, 10.7624f, 14.8147f, 10.6175f)
                lineTo(14.4965f, 10.5455f)
                curveTo(14.4733f, 10.5403f, 14.4495f, 10.535f, 14.4252f, 10.5296f)
                curveTo(14.152f, 10.469f, 13.8193f, 10.3952f, 13.544f, 10.1863f)
                curveTo(13.2733f, 9.9807f, 13.1082f, 9.6818f, 12.9689f, 9.4297f)
                curveTo(12.9565f, 9.4071f, 12.9443f, 9.385f, 12.9322f, 9.3633f)
                lineTo(12.7683f, 9.0694f)
                curveTo(12.4394f, 8.4794f, 12.2325f, 8.1122f, 12.0563f, 7.882f)
                curveTo(12.035f, 7.8543f, 12.0163f, 7.8313f, 12.0f, 7.8124f)
                curveTo(11.9837f, 7.8313f, 11.965f, 7.8543f, 11.9437f, 7.882f)
                close()
                moveTo(16.2854f, 11.0478f)
                curveTo(16.285f, 11.0479f, 16.2821f, 11.0456f, 16.278f, 11.0408f)
                curveTo(16.2838f, 11.0453f, 16.2859f, 11.0477f, 16.2854f, 11.0478f)
                close()
                moveTo(16.2492f, 10.958f)
                curveTo(16.2494f, 10.9521f, 16.2502f, 10.9488f, 16.2505f, 10.9486f)
                curveTo(16.2509f, 10.9484f, 16.2508f, 10.9513f, 16.2492f, 10.958f)
                close()
                moveTo(14.5774f, 16.3308f)
                curveTo(14.5772f, 16.3306f, 14.5782f, 16.3281f, 14.5805f, 16.3241f)
                curveTo(14.5787f, 16.329f, 14.5775f, 16.331f, 14.5774f, 16.3308f)
                close()
                moveTo(14.6891f, 16.2502f)
                curveTo(14.6943f, 16.2494f, 14.6974f, 16.2494f, 14.6976f, 16.2497f)
                curveTo(14.6978f, 16.2499f, 14.6952f, 16.2503f, 14.6891f, 16.2502f)
                close()
                moveTo(9.3024f, 16.2497f)
                curveTo(9.3026f, 16.2494f, 9.3057f, 16.2494f, 9.3109f, 16.2502f)
                curveTo(9.3048f, 16.2503f, 9.3022f, 16.2499f, 9.3024f, 16.2497f)
                close()
                moveTo(9.4195f, 16.3241f)
                curveTo(9.4218f, 16.3281f, 9.4228f, 16.3306f, 9.4226f, 16.3308f)
                curveTo(9.4225f, 16.331f, 9.4213f, 16.329f, 9.4195f, 16.3241f)
                close()
                moveTo(7.7495f, 10.9486f)
                curveTo(7.7498f, 10.9488f, 7.7506f, 10.9521f, 7.7508f, 10.958f)
                curveTo(7.7492f, 10.9513f, 7.7491f, 10.9484f, 7.7495f, 10.9486f)
                close()
                moveTo(7.722f, 11.0408f)
                curveTo(7.7179f, 11.0456f, 7.715f, 11.0479f, 7.7146f, 11.0478f)
                curveTo(7.7141f, 11.0477f, 7.7162f, 11.0453f, 7.722f, 11.0408f)
                close()
                moveTo(10.7528f, 6.97f)
                curveTo(11.012f, 6.6316f, 11.4036f, 6.25f, 12.0f, 6.25f)
                curveTo(12.5964f, 6.25f, 12.988f, 6.6316f, 13.2472f, 6.97f)
                curveTo(13.4983f, 7.2979f, 13.7581f, 7.7641f, 14.0514f, 8.2903f)
                lineTo(14.2424f, 8.6329f)
                curveTo(14.3379f, 8.8044f, 14.3893f, 8.8954f, 14.4318f, 8.9593f)
                curveTo(14.4402f, 8.972f, 14.4469f, 8.9814f, 14.4518f, 8.9881f)
                curveTo(14.4581f, 8.9903f, 14.4663f, 8.9931f, 14.4769f, 8.9965f)
                curveTo(14.5453f, 9.018f, 14.6411f, 9.0403f, 14.8276f, 9.0825f)
                lineTo(15.2012f, 9.167f)
                curveTo(15.7683f, 9.2953f, 16.2771f, 9.4103f, 16.6571f, 9.5601f)
                curveTo(17.0635f, 9.7203f, 17.5139f, 9.9932f, 17.6875f, 10.5512f)
                curveTo(17.8584f, 11.101f, 17.6523f, 11.5831f, 17.4196f, 11.9527f)
                curveTo(17.1987f, 12.3036f, 16.8542f, 12.7064f, 16.4657f, 13.1606f)
                lineTo(16.213f, 13.4561f)
                curveTo(16.0865f, 13.604f, 16.0199f, 13.6828f, 15.975f, 13.7445f)
                curveTo(15.9616f, 13.7629f, 15.9537f, 13.7752f, 15.9493f, 13.7825f)
                curveTo(15.9486f, 13.7916f, 15.948f, 13.8079f, 15.9485f, 13.8339f)
                curveTo(15.9501f, 13.9131f, 15.9599f, 14.0195f, 15.979f, 14.2164f)
                lineTo(16.017f, 14.6089f)
                curveTo(16.076f, 15.2165f, 16.1279f, 15.7515f, 16.1093f, 16.1685f)
                curveTo(16.0901f, 16.5991f, 15.9897f, 17.1254f, 15.5259f, 17.4775f)
                curveTo(15.0499f, 17.8388f, 14.5129f, 17.7753f, 14.0989f, 17.6567f)
                curveTo(13.7073f, 17.5445f, 13.2314f, 17.3253f, 12.7006f, 17.0808f)
                lineTo(12.6485f, 17.0568f)
                lineTo(12.3506f, 16.9197f)
                curveTo(12.176f, 16.8393f, 12.0857f, 16.7983f, 12.0179f, 16.7737f)
                curveTo(12.011f, 16.7712f, 12.0051f, 16.7691f, 12.0f, 16.7674f)
                curveTo(11.9949f, 16.7691f, 11.989f, 16.7712f, 11.9821f, 16.7737f)
                curveTo(11.9143f, 16.7983f, 11.824f, 16.8393f, 11.6494f, 16.9197f)
                lineTo(11.2994f, 17.0808f)
                curveTo(10.7686f, 17.3253f, 10.2927f, 17.5445f, 9.9011f, 17.6567f)
                curveTo(9.4871f, 17.7753f, 8.9501f, 17.8388f, 8.4741f, 17.4775f)
                curveTo(8.0103f, 17.1254f, 7.9099f, 16.5991f, 7.8907f, 16.1685f)
                curveTo(7.8721f, 15.7515f, 7.924f, 15.2165f, 7.983f, 14.6089f)
                lineTo(8.021f, 14.2164f)
                curveTo(8.0401f, 14.0195f, 8.0499f, 13.9131f, 8.0515f, 13.8339f)
                curveTo(8.052f, 13.8079f, 8.0513f, 13.7916f, 8.0507f, 13.7825f)
                curveTo(8.0463f, 13.7752f, 8.0384f, 13.7629f, 8.025f, 13.7445f)
                curveTo(7.9801f, 13.6828f, 7.9135f, 13.604f, 7.787f, 13.4561f)
                lineTo(7.5343f, 13.1607f)
                curveTo(7.1458f, 12.7064f, 6.8013f, 12.3036f, 6.5804f, 11.9527f)
                curveTo(6.3477f, 11.5831f, 6.1416f, 11.101f, 6.3125f, 10.5512f)
                curveTo(6.4861f, 9.9932f, 6.9365f, 9.7203f, 7.3429f, 9.5601f)
                curveTo(7.7229f, 9.4103f, 8.2317f, 9.2953f, 8.7988f, 9.167f)
                curveTo(8.8173f, 9.1629f, 8.8357f, 9.1587f, 8.8543f, 9.1545f)
                lineTo(9.1724f, 9.0825f)
                curveTo(9.3589f, 9.0403f, 9.4547f, 9.018f, 9.5231f, 8.9965f)
                curveTo(9.5337f, 8.9931f, 9.5419f, 8.9903f, 9.5482f, 8.988f)
                curveTo(9.5531f, 8.9814f, 9.5598f, 8.972f, 9.5682f, 8.9593f)
                curveTo(9.6107f, 8.8954f, 9.6621f, 8.8044f, 9.7576f, 8.6329f)
                lineTo(9.9215f, 8.339f)
                curveTo(9.9306f, 8.3227f, 9.9396f, 8.3065f, 9.9486f, 8.2903f)
                curveTo(10.2419f, 7.7641f, 10.5017f, 7.2979f, 10.7528f, 6.97f)
                close()
                moveTo(8.0499f, 13.7746f)
                curveTo(8.0497f, 13.7734f, 8.0496f, 13.7728f, 8.0496f, 13.7727f)
                close()
                moveTo(14.4631f, 9.0022f)
                curveTo(14.4636f, 9.0027f, 14.4631f, 9.0022f, 14.4631f, 9.0022f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(19.25f, 12.0f)
                curveTo(19.25f, 11.5858f, 19.5858f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(20.0f)
                curveTo(19.5858f, 12.75f, 19.25f, 12.4142f, 19.25f, 12.0f)
                close()
                moveTo(6.8735f, 17.1265f)
                curveTo(7.1664f, 17.4194f, 7.1664f, 17.8943f, 6.8735f, 18.1872f)
                lineTo(6.5304f, 18.5302f)
                curveTo(6.2375f, 18.8231f, 5.7627f, 18.8231f, 5.4698f, 18.5302f)
                curveTo(5.1769f, 18.2373f, 5.1769f, 17.7625f, 5.4698f, 17.4696f)
                lineTo(5.8128f, 17.1265f)
                curveTo(6.1057f, 16.8336f, 6.5806f, 16.8336f, 6.8735f, 17.1265f)
                close()
                moveTo(17.1265f, 17.1267f)
                curveTo(17.4194f, 16.8339f, 17.8943f, 16.8339f, 18.1872f, 17.1267f)
                lineTo(18.5302f, 17.4698f)
                curveTo(18.8231f, 17.7627f, 18.8231f, 18.2376f, 18.5302f, 18.5305f)
                curveTo(18.2373f, 18.8233f, 17.7624f, 18.8233f, 17.4695f, 18.5305f)
                lineTo(17.1265f, 18.1874f)
                curveTo(16.8336f, 17.8945f, 16.8336f, 17.4196f, 17.1265f, 17.1267f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 19.5858f, 11.5858f, 19.25f, 12.0f, 19.25f)
                close()
            }
        }
            .build()
        return _starShine!!
    }

private var _starShine: ImageVector? = null
