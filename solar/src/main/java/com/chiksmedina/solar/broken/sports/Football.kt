package com.chiksmedina.solar.broken.sports

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
import com.chiksmedina.solar.broken.SportsGroup

val SportsGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(
            name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.1977f, 11.9582f)
                lineTo(9.9143f, 11.737f)
                lineTo(9.9143f, 11.737f)
                lineTo(9.1977f, 11.9582f)
                close()
                moveTo(9.5456f, 10.8683f)
                lineTo(9.09f, 10.2726f)
                lineTo(9.09f, 10.2726f)
                lineTo(9.5456f, 10.8683f)
                close()
                moveTo(9.919f, 14.2952f)
                lineTo(9.2024f, 14.5164f)
                lineTo(9.2024f, 14.5164f)
                lineTo(9.919f, 14.2952f)
                close()
                moveTo(14.058f, 14.2952f)
                lineTo(13.3414f, 14.074f)
                lineTo(13.3414f, 14.074f)
                lineTo(14.058f, 14.2952f)
                close()
                moveTo(14.4314f, 10.8683f)
                lineTo(13.9757f, 11.4641f)
                lineTo(13.9757f, 11.4641f)
                lineTo(14.4314f, 10.8683f)
                close()
                moveTo(14.7793f, 11.9582f)
                lineTo(15.496f, 12.1794f)
                lineTo(15.496f, 12.1794f)
                lineTo(14.7793f, 11.9582f)
                close()
                moveTo(12.5949f, 9.4637f)
                lineTo(13.0505f, 8.868f)
                lineTo(13.0505f, 8.868f)
                lineTo(12.5949f, 9.4637f)
                close()
                moveTo(11.3821f, 9.4637f)
                lineTo(11.8378f, 10.0595f)
                lineTo(11.8378f, 10.0595f)
                lineTo(11.3821f, 9.4637f)
                close()
                moveTo(20.1848f, 17.75f)
                curveTo(20.599f, 17.75f, 20.9348f, 17.4142f, 20.9348f, 17.0f)
                curveTo(20.9348f, 16.5858f, 20.599f, 16.25f, 20.1848f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(14.7793f, 19.7351f)
                lineTo(14.0677f, 19.4982f)
                lineTo(14.0677f, 19.4982f)
                lineTo(14.7793f, 19.7351f)
                close()
                moveTo(13.4801f, 21.2631f)
                curveTo(13.3493f, 21.6561f, 13.5618f, 22.0807f, 13.9548f, 22.2116f)
                curveTo(14.3478f, 22.3424f, 14.7725f, 22.1299f, 14.9033f, 21.7369f)
                lineTo(13.4801f, 21.2631f)
                close()
                moveTo(3.9977f, 16.25f)
                curveTo(3.5835f, 16.25f, 3.2477f, 16.5858f, 3.2477f, 17.0f)
                curveTo(3.2477f, 17.4142f, 3.5835f, 17.75f, 3.9977f, 17.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(9.4032f, 19.7351f)
                lineTo(10.1148f, 19.4982f)
                lineTo(10.1148f, 19.4982f)
                lineTo(9.4032f, 19.7351f)
                close()
                moveTo(9.2792f, 21.7369f)
                curveTo(9.4101f, 22.1299f, 9.8347f, 22.3424f, 10.2277f, 22.2116f)
                curveTo(10.6207f, 22.0807f, 10.8333f, 21.6561f, 10.7024f, 21.2631f)
                lineTo(9.2792f, 21.7369f)
                close()
                moveTo(8.2208f, 17.3775f)
                lineTo(7.7819f, 17.9857f)
                lineTo(7.7819f, 17.9857f)
                lineTo(8.2208f, 17.3775f)
                close()
                moveTo(5.556f, 5.4594f)
                curveTo(5.4489f, 5.0593f, 5.0378f, 4.8217f, 4.6376f, 4.9288f)
                curveTo(4.2375f, 5.0359f, 3.9999f, 5.4471f, 4.107f, 5.8472f)
                lineTo(5.556f, 5.4594f)
                close()
                moveTo(5.2496f, 7.2152f)
                lineTo(4.5251f, 7.4091f)
                lineTo(4.5251f, 7.4091f)
                lineTo(5.2496f, 7.2152f)
                close()
                moveTo(3.5917f, 11.5885f)
                lineTo(3.1782f, 10.9628f)
                lineTo(3.1782f, 10.9628f)
                lineTo(3.5917f, 11.5885f)
                close()
                moveTo(1.6274f, 11.9879f)
                curveTo(1.2819f, 12.2163f, 1.1869f, 12.6816f, 1.4153f, 13.0271f)
                curveTo(1.6438f, 13.3727f, 2.1091f, 13.4676f, 2.4546f, 13.2392f)
                lineTo(1.6274f, 11.9879f)
                close()
                moveTo(19.934f, 5.8473f)
                curveTo(20.0411f, 5.4472f, 19.8036f, 5.036f, 19.4034f, 4.9289f)
                curveTo(19.0033f, 4.8218f, 18.5921f, 5.0594f, 18.485f, 5.4595f)
                lineTo(19.934f, 5.8473f)
                close()
                moveTo(18.7915f, 7.2153f)
                lineTo(18.067f, 7.0214f)
                lineTo(18.067f, 7.0214f)
                lineTo(18.7915f, 7.2153f)
                close()
                moveTo(20.4493f, 11.5886f)
                lineTo(20.0358f, 12.2143f)
                lineTo(20.0358f, 12.2143f)
                lineTo(20.4493f, 11.5886f)
                close()
                moveTo(21.5865f, 13.2393f)
                curveTo(21.932f, 13.4677f, 22.3973f, 13.3728f, 22.6257f, 13.0272f)
                curveTo(22.8541f, 12.6817f, 22.7592f, 12.2164f, 22.4136f, 11.988f)
                lineTo(21.5865f, 13.2393f)
                close()
                moveTo(16.0903f, 3.8362f)
                curveTo(16.4288f, 3.5975f, 16.5097f, 3.1296f, 16.2709f, 2.7911f)
                curveTo(16.0322f, 2.4526f, 15.5643f, 2.3717f, 15.2258f, 2.6104f)
                lineTo(16.0903f, 3.8362f)
                close()
                moveTo(14.3377f, 4.1546f)
                lineTo(14.7699f, 4.7675f)
                lineTo(14.7699f, 4.7675f)
                lineTo(14.3377f, 4.1546f)
                close()
                moveTo(9.6657f, 4.104f)
                lineTo(9.2203f, 4.7074f)
                lineTo(9.2203f, 4.7074f)
                lineTo(9.6657f, 4.104f)
                close()
                moveTo(8.6154f, 2.3966f)
                curveTo(8.2822f, 2.1506f, 7.8126f, 2.2213f, 7.5666f, 2.5546f)
                curveTo(7.3206f, 2.8878f, 7.3913f, 3.3574f, 7.7246f, 3.6034f)
                lineTo(8.6154f, 2.3966f)
                close()
                moveTo(14.7793f, 11.3678f)
                lineTo(14.0627f, 11.589f)
                lineTo(14.7793f, 11.3678f)
                close()
                moveTo(9.1977f, 11.3678f)
                lineTo(9.9143f, 11.589f)
                lineTo(9.1977f, 11.3678f)
                close()
                moveTo(12.1392f, 10.0595f)
                lineTo(13.9757f, 11.4641f)
                lineTo(14.887f, 10.2726f)
                lineTo(13.0505f, 8.868f)
                lineTo(12.1392f, 10.0595f)
                close()
                moveTo(14.0627f, 11.737f)
                lineTo(13.3414f, 14.074f)
                lineTo(14.7746f, 14.5164f)
                lineTo(15.496f, 12.1794f)
                lineTo(14.0627f, 11.737f)
                close()
                moveTo(13.1037f, 14.25f)
                horizontalLineTo(10.8733f)
                verticalLineTo(15.75f)
                horizontalLineTo(13.1037f)
                verticalLineTo(14.25f)
                close()
                moveTo(10.6356f, 14.074f)
                lineTo(9.9143f, 11.737f)
                lineTo(8.481f, 12.1794f)
                lineTo(9.2024f, 14.5164f)
                lineTo(10.6356f, 14.074f)
                close()
                moveTo(10.0013f, 11.4641f)
                lineTo(11.8378f, 10.0595f)
                lineTo(10.9265f, 8.868f)
                lineTo(9.09f, 10.2726f)
                lineTo(10.0013f, 11.4641f)
                close()
                moveTo(20.1848f, 16.25f)
                horizontalLineTo(18.5697f)
                verticalLineTo(17.75f)
                horizontalLineTo(20.1848f)
                verticalLineTo(16.25f)
                close()
                moveTo(14.0677f, 19.4982f)
                lineTo(13.4801f, 21.2631f)
                lineTo(14.9033f, 21.7369f)
                lineTo(15.4909f, 19.972f)
                lineTo(14.0677f, 19.4982f)
                close()
                moveTo(18.5697f, 16.25f)
                curveTo(17.8921f, 16.25f, 17.3208f, 16.2489f, 16.8556f, 16.302f)
                curveTo(16.3711f, 16.3574f, 15.9265f, 16.4781f, 15.5229f, 16.7693f)
                lineTo(16.4006f, 17.9857f)
                curveTo(16.5202f, 17.8994f, 16.6846f, 17.8313f, 17.0259f, 17.7923f)
                curveTo(17.3864f, 17.7511f, 17.8575f, 17.75f, 18.5697f, 17.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(15.4909f, 19.972f)
                curveTo(15.7161f, 19.2956f, 15.8662f, 18.8484f, 16.0193f, 18.5189f)
                curveTo(16.1643f, 18.2069f, 16.281f, 18.072f, 16.4006f, 17.9857f)
                lineTo(15.5229f, 16.7693f)
                curveTo(15.1194f, 17.0605f, 14.8646f, 17.4444f, 14.659f, 17.8868f)
                curveTo(14.4616f, 18.3117f, 14.282f, 18.8545f, 14.0677f, 19.4982f)
                lineTo(15.4909f, 19.972f)
                close()
                moveTo(3.9977f, 17.75f)
                horizontalLineTo(5.6128f)
                verticalLineTo(16.25f)
                horizontalLineTo(3.9977f)
                verticalLineTo(17.75f)
                close()
                moveTo(8.6916f, 19.972f)
                lineTo(9.2792f, 21.7369f)
                lineTo(10.7024f, 21.2631f)
                lineTo(10.1148f, 19.4982f)
                lineTo(8.6916f, 19.972f)
                close()
                moveTo(5.6128f, 17.75f)
                curveTo(6.325f, 17.75f, 6.7962f, 17.7511f, 7.1566f, 17.7923f)
                curveTo(7.4979f, 17.8313f, 7.6623f, 17.8994f, 7.7819f, 17.9857f)
                lineTo(8.6596f, 16.7693f)
                curveTo(8.256f, 16.4781f, 7.8114f, 16.3574f, 7.327f, 16.302f)
                curveTo(6.8617f, 16.2489f, 6.2905f, 16.25f, 5.6128f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(10.1148f, 19.4982f)
                curveTo(9.9005f, 18.8545f, 9.721f, 18.3117f, 9.5235f, 17.8868f)
                curveTo(9.318f, 17.4445f, 9.0632f, 17.0605f, 8.6596f, 16.7693f)
                lineTo(7.7819f, 17.9857f)
                curveTo(7.9015f, 18.072f, 8.0182f, 18.2069f, 8.1632f, 18.5189f)
                curveTo(8.3163f, 18.8484f, 8.4664f, 19.2956f, 8.6916f, 19.972f)
                lineTo(10.1148f, 19.4982f)
                close()
                moveTo(4.107f, 5.8472f)
                lineTo(4.5251f, 7.4091f)
                lineTo(5.9741f, 7.0213f)
                lineTo(5.556f, 5.4594f)
                lineTo(4.107f, 5.8472f)
                close()
                moveTo(3.1782f, 10.9628f)
                lineTo(1.6274f, 11.9879f)
                lineTo(2.4546f, 13.2392f)
                lineTo(4.0053f, 12.2142f)
                lineTo(3.1782f, 10.9628f)
                close()
                moveTo(4.5251f, 7.4091f)
                curveTo(4.7094f, 8.0978f, 4.8303f, 8.5538f, 4.8838f, 8.9132f)
                curveTo(4.9346f, 9.2536f, 4.9114f, 9.4307f, 4.859f, 9.569f)
                lineTo(6.2616f, 10.1007f)
                curveTo(6.438f, 9.6354f, 6.4394f, 9.1747f, 6.3674f, 8.6921f)
                curveTo(6.2984f, 8.2286f, 6.1495f, 7.6766f, 5.9741f, 7.0213f)
                lineTo(4.5251f, 7.4091f)
                close()
                moveTo(4.0053f, 12.2142f)
                curveTo(4.5708f, 11.8404f, 5.0481f, 11.5262f, 5.4071f, 11.2252f)
                curveTo(5.7808f, 10.9119f, 6.0852f, 10.5661f, 6.2616f, 10.1007f)
                lineTo(4.859f, 9.569f)
                curveTo(4.8066f, 9.7073f, 4.7066f, 9.855f, 4.4433f, 10.0759f)
                curveTo(4.1651f, 10.3091f, 3.7725f, 10.57f, 3.1782f, 10.9628f)
                lineTo(4.0053f, 12.2142f)
                close()
                moveTo(18.485f, 5.4595f)
                lineTo(18.067f, 7.0214f)
                lineTo(19.516f, 7.4092f)
                lineTo(19.934f, 5.8473f)
                lineTo(18.485f, 5.4595f)
                close()
                moveTo(20.0358f, 12.2143f)
                lineTo(21.5865f, 13.2393f)
                lineTo(22.4136f, 11.988f)
                lineTo(20.8629f, 10.9629f)
                lineTo(20.0358f, 12.2143f)
                close()
                moveTo(18.067f, 7.0214f)
                curveTo(17.8916f, 7.6767f, 17.7427f, 8.2287f, 17.6736f, 8.6922f)
                curveTo(17.6017f, 9.1747f, 17.6031f, 9.6355f, 17.7795f, 10.1008f)
                lineTo(19.1821f, 9.5691f)
                curveTo(19.1296f, 9.4308f, 19.1065f, 9.2537f, 19.1572f, 8.9133f)
                curveTo(19.2108f, 8.5539f, 19.3317f, 8.0979f, 19.516f, 7.4092f)
                lineTo(18.067f, 7.0214f)
                close()
                moveTo(20.8629f, 10.9629f)
                curveTo(20.2686f, 10.5701f, 19.876f, 10.3092f, 19.5978f, 10.0759f)
                curveTo(19.3344f, 9.8551f, 19.2345f, 9.7074f, 19.1821f, 9.5691f)
                lineTo(17.7795f, 10.1008f)
                curveTo(17.9559f, 10.5662f, 18.2603f, 10.912f, 18.634f, 11.2253f)
                curveTo(18.9929f, 11.5263f, 19.4703f, 11.8405f, 20.0358f, 12.2143f)
                lineTo(20.8629f, 10.9629f)
                close()
                moveTo(15.2258f, 2.6104f)
                lineTo(13.9054f, 3.5417f)
                lineTo(14.7699f, 4.7675f)
                lineTo(16.0903f, 3.8362f)
                lineTo(15.2258f, 2.6104f)
                close()
                moveTo(10.1111f, 3.5006f)
                lineTo(8.6154f, 2.3966f)
                lineTo(7.7246f, 3.6034f)
                lineTo(9.2203f, 4.7074f)
                lineTo(10.1111f, 3.5006f)
                close()
                moveTo(13.9054f, 3.5417f)
                curveTo(13.3232f, 3.9523f, 12.9373f, 4.223f, 12.6189f, 4.3972f)
                curveTo(12.3174f, 4.5621f, 12.1438f, 4.6013f, 11.9966f, 4.5996f)
                lineTo(11.9804f, 6.0996f)
                curveTo(12.478f, 6.1049f, 12.9109f, 5.9472f, 13.3388f, 5.7132f)
                curveTo(13.7496f, 5.4885f, 14.216f, 5.1582f, 14.7699f, 4.7675f)
                lineTo(13.9054f, 3.5417f)
                close()
                moveTo(9.2203f, 4.7074f)
                curveTo(9.7657f, 5.11f, 10.2248f, 5.4503f, 10.6307f, 5.6839f)
                curveTo(11.0533f, 5.9271f, 11.4827f, 6.0942f, 11.9804f, 6.0996f)
                lineTo(11.9966f, 4.5996f)
                curveTo(11.8494f, 4.5981f, 11.6767f, 4.5552f, 11.3788f, 4.3838f)
                curveTo(11.0642f, 4.2028f, 10.6843f, 3.9237f, 10.1111f, 3.5006f)
                lineTo(9.2203f, 4.7074f)
                close()
                moveTo(13.9757f, 11.4641f)
                curveTo(14.0179f, 11.4963f, 14.0476f, 11.5399f, 14.0627f, 11.589f)
                lineTo(15.496f, 11.1465f)
                curveTo(15.3912f, 10.807f, 15.1828f, 10.4989f, 14.887f, 10.2726f)
                lineTo(13.9757f, 11.4641f)
                close()
                moveTo(14.0627f, 11.589f)
                curveTo(14.0773f, 11.6364f, 14.078f, 11.6876f, 14.0627f, 11.737f)
                lineTo(15.496f, 12.1794f)
                curveTo(15.6023f, 11.8349f, 15.5975f, 11.4753f, 15.496f, 11.1465f)
                lineTo(14.0627f, 11.589f)
                close()
                moveTo(18.1938f, 9.142f)
                lineTo(14.4924f, 10.6748f)
                lineTo(15.0663f, 12.0607f)
                lineTo(18.7677f, 10.5279f)
                lineTo(18.1938f, 9.142f)
                close()
                moveTo(13.0505f, 8.868f)
                curveTo(12.7372f, 8.6284f, 12.3624f, 8.5084f, 11.9885f, 8.5084f)
                verticalLineTo(10.0084f)
                curveTo(12.042f, 10.0084f, 12.0946f, 10.0253f, 12.1392f, 10.0595f)
                lineTo(13.0505f, 8.868f)
                close()
                moveTo(11.9885f, 8.5084f)
                curveTo(11.6146f, 8.5084f, 11.2398f, 8.6284f, 10.9265f, 8.868f)
                lineTo(11.8378f, 10.0595f)
                curveTo(11.8824f, 10.0253f, 11.935f, 10.0084f, 11.9885f, 10.0084f)
                verticalLineTo(8.5084f)
                close()
                moveTo(12.7385f, 9.2584f)
                verticalLineTo(5.3496f)
                horizontalLineTo(11.2385f)
                verticalLineTo(9.2584f)
                horizontalLineTo(12.7385f)
                close()
                moveTo(13.3414f, 14.074f)
                curveTo(13.3259f, 14.1241f, 13.2963f, 14.166f, 13.2572f, 14.1967f)
                lineTo(14.1852f, 15.3752f)
                curveTo(14.4575f, 15.1608f, 14.6672f, 14.8646f, 14.7746f, 14.5164f)
                lineTo(13.3414f, 14.074f)
                close()
                moveTo(13.2572f, 14.1967f)
                curveTo(13.214f, 14.2308f, 13.1607f, 14.25f, 13.1037f, 14.25f)
                verticalLineTo(15.75f)
                curveTo(13.5064f, 15.75f, 13.8847f, 15.6119f, 14.1852f, 15.3752f)
                lineTo(13.2572f, 14.1967f)
                close()
                moveTo(16.5291f, 16.887f)
                lineTo(14.2886f, 14.2954f)
                lineTo(13.1539f, 15.2765f)
                lineTo(15.3944f, 17.868f)
                lineTo(16.5291f, 16.887f)
                close()
                moveTo(10.8733f, 14.25f)
                curveTo(10.8163f, 14.25f, 10.763f, 14.2308f, 10.7198f, 14.1967f)
                lineTo(9.7918f, 15.3752f)
                curveTo(10.0923f, 15.6119f, 10.4706f, 15.75f, 10.8733f, 15.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(10.7198f, 14.1967f)
                curveTo(10.6807f, 14.166f, 10.6511f, 14.1241f, 10.6356f, 14.074f)
                lineTo(9.2024f, 14.5164f)
                curveTo(9.3098f, 14.8646f, 9.5195f, 15.1608f, 9.7918f, 15.3752f)
                lineTo(10.7198f, 14.1967f)
                close()
                moveTo(8.8106f, 17.8407f)
                lineTo(10.8456f, 15.2492f)
                lineTo(9.6659f, 14.3228f)
                lineTo(7.6309f, 16.9143f)
                lineTo(8.8106f, 17.8407f)
                close()
                moveTo(9.9143f, 11.737f)
                curveTo(9.899f, 11.6876f, 9.8997f, 11.6364f, 9.9143f, 11.589f)
                lineTo(8.481f, 11.1465f)
                curveTo(8.3795f, 11.4754f, 8.3747f, 11.8349f, 8.481f, 12.1794f)
                lineTo(9.9143f, 11.737f)
                close()
                moveTo(9.9143f, 11.589f)
                curveTo(9.9294f, 11.5399f, 9.9591f, 11.4963f, 10.0013f, 11.4641f)
                lineTo(9.09f, 10.2726f)
                curveTo(8.7942f, 10.4989f, 8.5858f, 10.807f, 8.481f, 11.1465f)
                lineTo(9.9143f, 11.589f)
                close()
                moveTo(9.4889f, 10.6766f)
                lineTo(5.8516f, 9.1437f)
                lineTo(5.2691f, 10.526f)
                lineTo(8.9064f, 12.0589f)
                lineTo(9.4889f, 10.6766f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0009f, 6.0004f)
                curveTo(5.0189f, 4.6404f, 6.3976f, 3.5219f, 8.0721f, 2.8065f)
                curveTo(13.1495f, 0.6372f, 19.0242f, 2.9947f, 21.1935f, 8.0721f)
                curveTo(23.3628f, 13.1495f, 21.0053f, 19.0242f, 15.9279f, 21.1935f)
                curveTo(10.8505f, 23.3628f, 4.9758f, 21.0053f, 2.8065f, 15.9279f)
                curveTo(2.0911f, 14.2533f, 1.868f, 12.4921f, 2.0725f, 10.8057f)
            }
        }
            .build()
        return _football!!
    }

private var _football: ImageVector? = null
