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

val EssentionalUiGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(
            name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.953f, 2.25f)
                curveTo(4.9686f, 2.25f, 4.9843f, 2.25f, 5.0f, 2.25f)
                lineTo(19.047f, 2.25f)
                curveTo(19.7139f, 2.25f, 20.2841f, 2.2499f, 20.7398f, 2.3074f)
                curveTo(21.2231f, 2.3684f, 21.6902f, 2.5053f, 22.0738f, 2.8652f)
                curveTo(22.4643f, 3.2315f, 22.6194f, 3.6886f, 22.6875f, 4.1641f)
                curveTo(22.7501f, 4.6008f, 22.7501f, 5.144f, 22.75f, 5.7636f)
                lineTo(22.75f, 6.5401f)
                curveTo(22.75f, 7.0286f, 22.75f, 7.451f, 22.7136f, 7.8031f)
                curveTo(22.6743f, 8.1821f, 22.5885f, 8.5376f, 22.3825f, 8.8789f)
                curveTo(22.1781f, 9.2177f, 21.9028f, 9.4636f, 21.5854f, 9.684f)
                curveTo(21.2865f, 9.8917f, 20.9045f, 10.1067f, 20.4553f, 10.3596f)
                lineTo(17.5129f, 12.0159f)
                curveTo(16.8431f, 12.393f, 16.6099f, 12.5288f, 16.4542f, 12.6639f)
                curveTo(16.0966f, 12.9744f, 15.8918f, 13.3188f, 15.7956f, 13.7504f)
                curveTo(15.7545f, 13.9349f, 15.75f, 14.1672f, 15.75f, 14.8729f)
                lineTo(15.75f, 17.605f)
                curveTo(15.7501f, 18.5062f, 15.7501f, 19.2714f, 15.6574f, 19.8596f)
                curveTo(15.5587f, 20.4851f, 15.3298f, 21.0849f, 14.7298f, 21.4602f)
                curveTo(14.1434f, 21.827f, 13.4975f, 21.7933f, 12.8698f, 21.6442f)
                curveTo(12.2653f, 21.5007f, 11.5203f, 21.2094f, 10.6264f, 20.8599f)
                lineTo(10.5395f, 20.826f)
                curveTo(10.1208f, 20.6623f, 9.7541f, 20.519f, 9.4639f, 20.3691f)
                curveTo(9.1519f, 20.208f, 8.8622f, 20.0076f, 8.6405f, 19.6957f)
                curveTo(8.4164f, 19.3803f, 8.3265f, 19.042f, 8.2865f, 18.6963f)
                curveTo(8.2499f, 18.381f, 8.25f, 18.0026f, 8.25f, 17.5806f)
                lineTo(8.25f, 14.8729f)
                curveTo(8.25f, 14.1672f, 8.2456f, 13.9349f, 8.2044f, 13.7504f)
                curveTo(8.1082f, 13.3188f, 7.9034f, 12.9744f, 7.5458f, 12.6639f)
                curveTo(7.3901f, 12.5288f, 7.1569f, 12.393f, 6.4871f, 12.0159f)
                lineTo(3.5447f, 10.3596f)
                curveTo(3.0955f, 10.1067f, 2.7135f, 9.8917f, 2.4146f, 9.684f)
                curveTo(2.0972f, 9.4636f, 1.8219f, 9.2177f, 1.6175f, 8.8789f)
                curveTo(1.4115f, 8.5376f, 1.3257f, 8.1821f, 1.2865f, 7.8031f)
                curveTo(1.25f, 7.4509f, 1.25f, 7.0286f, 1.25f, 6.5401f)
                lineTo(1.25f, 5.8147f)
                curveTo(1.25f, 5.7976f, 1.25f, 5.7805f, 1.25f, 5.7636f)
                curveTo(1.25f, 5.144f, 1.2499f, 4.6008f, 1.3125f, 4.1641f)
                curveTo(1.3806f, 3.6886f, 1.5358f, 3.2315f, 1.9262f, 2.8652f)
                curveTo(2.3098f, 2.5053f, 2.7769f, 2.3684f, 3.2602f, 2.3074f)
                curveTo(3.7159f, 2.2499f, 4.2861f, 2.25f, 4.953f, 2.25f)
                close()
                moveTo(3.448f, 3.7956f)
                curveTo(3.1143f, 3.8377f, 3.0082f, 3.9069f, 2.9525f, 3.9592f)
                curveTo(2.9036f, 4.0051f, 2.839f, 4.0858f, 2.7973f, 4.3768f)
                curveTo(2.7518f, 4.6945f, 2.75f, 5.1287f, 2.75f, 5.8147f)
                verticalLineTo(6.5045f)
                curveTo(2.75f, 7.0387f, 2.7509f, 7.3828f, 2.7785f, 7.6485f)
                curveTo(2.8041f, 7.896f, 2.8481f, 8.0151f, 2.9017f, 8.1039f)
                curveTo(2.9569f, 8.1953f, 3.0485f, 8.298f, 3.2703f, 8.4521f)
                curveTo(3.5041f, 8.6144f, 3.8234f, 8.7951f, 4.3099f, 9.069f)
                lineTo(7.223f, 10.7088f)
                curveTo(7.2502f, 10.7242f, 7.2771f, 10.7393f, 7.3036f, 10.7542f)
                curveTo(7.8623f, 11.0685f, 8.2428f, 11.2826f, 8.5292f, 11.5312f)
                curveTo(9.1206f, 12.0446f, 9.5f, 12.6682f, 9.6685f, 13.424f)
                curveTo(9.7504f, 13.7913f, 9.7502f, 14.2031f, 9.75f, 14.7845f)
                curveTo(9.75f, 14.8135f, 9.75f, 14.843f, 9.75f, 14.8729f)
                verticalLineTo(17.5424f)
                curveTo(9.75f, 18.0146f, 9.7512f, 18.305f, 9.7765f, 18.5236f)
                curveTo(9.7994f, 18.7213f, 9.8355f, 18.7878f, 9.8633f, 18.8269f)
                curveTo(9.8936f, 18.8695f, 9.9536f, 18.9338f, 10.152f, 19.0363f)
                curveTo(10.3644f, 19.146f, 10.6571f, 19.2614f, 11.1192f, 19.442f)
                curveTo(12.0802f, 19.8177f, 12.7266f, 20.0685f, 13.2164f, 20.1848f)
                curveTo(13.695f, 20.2985f, 13.8527f, 20.2396f, 13.9343f, 20.1885f)
                curveTo(14.0023f, 20.146f, 14.1073f, 20.0597f, 14.1757f, 19.626f)
                curveTo(14.2478f, 19.1686f, 14.25f, 18.5234f, 14.25f, 17.5424f)
                verticalLineTo(14.8729f)
                curveTo(14.25f, 14.843f, 14.25f, 14.8135f, 14.25f, 14.7845f)
                curveTo(14.2498f, 14.2031f, 14.2496f, 13.7913f, 14.3315f, 13.424f)
                curveTo(14.5f, 12.6682f, 14.8794f, 12.0446f, 15.4708f, 11.5312f)
                curveTo(15.7572f, 11.2826f, 16.1377f, 11.0685f, 16.6964f, 10.7542f)
                curveTo(16.7229f, 10.7393f, 16.7498f, 10.7242f, 16.7771f, 10.7088f)
                lineTo(19.6901f, 9.069f)
                curveTo(20.1767f, 8.7951f, 20.496f, 8.6144f, 20.7297f, 8.4521f)
                curveTo(20.9515f, 8.298f, 21.0431f, 8.1953f, 21.0983f, 8.1039f)
                curveTo(21.1519f, 8.0151f, 21.1959f, 7.896f, 21.2215f, 7.6485f)
                curveTo(21.2491f, 7.3828f, 21.25f, 7.0387f, 21.25f, 6.5045f)
                verticalLineTo(5.8147f)
                curveTo(21.25f, 5.1287f, 21.2482f, 4.6945f, 21.2027f, 4.3768f)
                curveTo(21.161f, 4.0858f, 21.0964f, 4.0051f, 21.0475f, 3.9592f)
                curveTo(20.9918f, 3.9069f, 20.8857f, 3.8377f, 20.5521f, 3.7956f)
                curveTo(20.2015f, 3.7514f, 19.727f, 3.75f, 19.0f, 3.75f)
                horizontalLineTo(5.0f)
                curveTo(4.273f, 3.75f, 3.7985f, 3.7514f, 3.448f, 3.7956f)
                close()
            }
        }
            .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
