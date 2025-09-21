package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(
            name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.25f)
                curveTo(10.4812f, 2.25f, 9.25f, 3.4812f, 9.25f, 5.0f)
                curveTo(9.25f, 5.7833f, 9.5776f, 6.4894f, 10.1018f, 6.9897f)
                curveTo(10.0375f, 7.1038f, 9.971f, 7.2229f, 9.9022f, 7.3463f)
                lineTo(8.105f, 10.5686f)
                curveTo(7.9273f, 10.8873f, 7.8216f, 11.0749f, 7.7325f, 11.2018f)
                curveTo(7.7046f, 11.2415f, 7.6848f, 11.2655f, 7.6729f, 11.2788f)
                lineTo(7.6712f, 11.2791f)
                curveTo(7.656f, 11.2695f, 7.6301f, 11.2518f, 7.5918f, 11.2208f)
                curveTo(7.471f, 11.1231f, 7.3175f, 10.9715f, 7.0588f, 10.7138f)
                lineTo(6.9798f, 10.635f)
                curveTo(6.6607f, 10.317f, 6.3706f, 10.0279f, 6.1066f, 9.7914f)
                curveTo(6.1993f, 9.5451f, 6.25f, 9.2782f, 6.25f, 9.0f)
                curveTo(6.25f, 7.7574f, 5.2426f, 6.75f, 4.0f, 6.75f)
                curveTo(2.7574f, 6.75f, 1.75f, 7.7574f, 1.75f, 9.0f)
                curveTo(1.75f, 9.983f, 2.3804f, 10.8188f, 3.259f, 11.1251f)
                curveTo(3.262f, 11.1822f, 3.2656f, 11.2399f, 3.2698f, 11.298f)
                curveTo(3.2928f, 11.6228f, 3.3346f, 12.0116f, 3.3824f, 12.4564f)
                lineTo(3.5671f, 14.1733f)
                curveTo(3.597f, 14.4517f, 3.6257f, 14.7289f, 3.6541f, 15.0031f)
                curveTo(3.7662f, 16.0856f, 3.8733f, 17.121f, 4.0332f, 17.994f)
                curveTo(4.1343f, 18.5459f, 4.2618f, 19.0659f, 4.4383f, 19.5172f)
                curveTo(4.6134f, 19.9648f, 4.8549f, 20.3925f, 5.2119f, 20.712f)
                curveTo(5.8417f, 21.2758f, 6.6014f, 21.522f, 7.5082f, 21.6381f)
                curveTo(8.3831f, 21.75f, 9.4862f, 21.75f, 10.8602f, 21.75f)
                horizontalLineTo(13.1398f)
                curveTo(14.5137f, 21.75f, 15.6169f, 21.75f, 16.4918f, 21.6381f)
                curveTo(17.3986f, 21.522f, 18.1583f, 21.2758f, 18.7881f, 20.712f)
                curveTo(19.1451f, 20.3925f, 19.3866f, 19.9648f, 19.5617f, 19.5172f)
                curveTo(19.7382f, 19.0659f, 19.8657f, 18.5459f, 19.9668f, 17.994f)
                curveTo(20.1267f, 17.1211f, 20.2338f, 16.0858f, 20.3459f, 15.0034f)
                curveTo(20.3742f, 14.7293f, 20.403f, 14.4516f, 20.4329f, 14.1733f)
                lineTo(20.6176f, 12.4565f)
                curveTo(20.6654f, 12.0116f, 20.7072f, 11.6228f, 20.7302f, 11.298f)
                curveTo(20.7344f, 11.2399f, 20.738f, 11.1822f, 20.741f, 11.1251f)
                curveTo(21.6196f, 10.8188f, 22.25f, 9.983f, 22.25f, 9.0f)
                curveTo(22.25f, 7.7574f, 21.2426f, 6.75f, 20.0f, 6.75f)
                curveTo(18.7574f, 6.75f, 17.75f, 7.7574f, 17.75f, 9.0f)
                curveTo(17.75f, 9.2782f, 17.8007f, 9.5451f, 17.8934f, 9.7914f)
                curveTo(17.6294f, 10.0279f, 17.3393f, 10.317f, 17.0202f, 10.635f)
                lineTo(16.9412f, 10.7138f)
                curveTo(16.6825f, 10.9715f, 16.529f, 11.1231f, 16.4082f, 11.2208f)
                curveTo(16.3699f, 11.2518f, 16.344f, 11.2695f, 16.3288f, 11.2791f)
                lineTo(16.3271f, 11.2788f)
                curveTo(16.3152f, 11.2655f, 16.2954f, 11.2415f, 16.2675f, 11.2018f)
                curveTo(16.1784f, 11.0749f, 16.0727f, 10.8873f, 15.895f, 10.5686f)
                lineTo(14.0977f, 7.3462f)
                curveTo(14.0289f, 7.2229f, 13.9625f, 7.1038f, 13.8982f, 6.9897f)
                curveTo(14.4224f, 6.4894f, 14.75f, 5.7833f, 14.75f, 5.0f)
                curveTo(14.75f, 3.4812f, 13.5188f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(10.75f, 5.0f)
                curveTo(10.75f, 4.3096f, 11.3096f, 3.75f, 12.0f, 3.75f)
                curveTo(12.6904f, 3.75f, 13.25f, 4.3096f, 13.25f, 5.0f)
                curveTo(13.25f, 5.485f, 12.9739f, 5.9069f, 12.5668f, 6.1146f)
                curveTo(12.3975f, 6.201f, 12.2056f, 6.25f, 12.0f, 6.25f)
                curveTo(11.7944f, 6.25f, 11.6025f, 6.201f, 11.4332f, 6.1146f)
                curveTo(11.0261f, 5.9069f, 10.75f, 5.485f, 10.75f, 5.0f)
                close()
                moveTo(11.2046f, 8.0907f)
                curveTo(11.2857f, 7.9453f, 11.3599f, 7.8123f, 11.4288f, 7.6904f)
                curveTo(11.6133f, 7.7295f, 11.8045f, 7.75f, 12.0f, 7.75f)
                curveTo(12.1955f, 7.75f, 12.3867f, 7.7295f, 12.5712f, 7.6904f)
                curveTo(12.6401f, 7.8123f, 12.7143f, 7.9453f, 12.7954f, 8.0907f)
                lineTo(14.6016f, 11.3291f)
                curveTo(14.7569f, 11.6077f, 14.9005f, 11.8653f, 15.0399f, 12.0638f)
                curveTo(15.1885f, 12.2753f, 15.3911f, 12.5089f, 15.7015f, 12.6456f)
                curveTo(15.9698f, 12.7637f, 16.2657f, 12.8049f, 16.556f, 12.7648f)
                curveTo(16.8918f, 12.7184f, 17.1507f, 12.5495f, 17.3517f, 12.3869f)
                curveTo(17.5403f, 12.2343f, 17.7493f, 12.026f, 17.9756f, 11.8006f)
                lineTo(17.9998f, 11.7765f)
                curveTo(18.3752f, 11.4026f, 18.6497f, 11.1315f, 18.8593f, 10.9397f)
                curveTo(18.9792f, 11.0103f, 19.1061f, 11.0701f, 19.2389f, 11.1179f)
                curveTo(19.2374f, 11.1417f, 19.2358f, 11.1664f, 19.234f, 11.192f)
                curveTo(19.2131f, 11.4865f, 19.1743f, 11.8486f, 19.1249f, 12.3082f)
                lineTo(18.9415f, 14.0129f)
                curveTo(18.9095f, 14.3104f, 18.8794f, 14.6003f, 18.8502f, 14.8822f)
                curveTo(18.7807f, 15.553f, 18.7159f, 16.178f, 18.641f, 16.75f)
                horizontalLineTo(5.359f)
                curveTo(5.2841f, 16.178f, 5.2193f, 15.553f, 5.1498f, 14.8822f)
                curveTo(5.1206f, 14.6003f, 5.0905f, 14.3104f, 5.0585f, 14.0129f)
                lineTo(4.8751f, 12.3082f)
                curveTo(4.8257f, 11.8486f, 4.7869f, 11.4865f, 4.766f, 11.192f)
                curveTo(4.7642f, 11.1664f, 4.7625f, 11.1417f, 4.7611f, 11.1179f)
                curveTo(4.8939f, 11.0701f, 5.0208f, 11.0103f, 5.1407f, 10.9397f)
                curveTo(5.3503f, 11.1315f, 5.6248f, 11.4026f, 6.0002f, 11.7765f)
                lineTo(6.0244f, 11.8006f)
                curveTo(6.2506f, 12.026f, 6.4597f, 12.2343f, 6.6483f, 12.3869f)
                curveTo(6.8493f, 12.5495f, 7.1082f, 12.7184f, 7.444f, 12.7648f)
                curveTo(7.7343f, 12.8049f, 8.0302f, 12.7637f, 8.2985f, 12.6456f)
                curveTo(8.6089f, 12.5089f, 8.8116f, 12.2753f, 8.9601f, 12.0638f)
                curveTo(9.0995f, 11.8653f, 9.2431f, 11.6078f, 9.3984f, 11.3291f)
                lineTo(11.2046f, 8.0907f)
                close()
                moveTo(5.618f, 18.25f)
                curveTo(5.6834f, 18.526f, 5.7552f, 18.7662f, 5.8352f, 18.9708f)
                curveTo(5.964f, 19.3f, 6.0962f, 19.4904f, 6.2123f, 19.5943f)
                curveTo(6.5285f, 19.8774f, 6.9509f, 20.0545f, 7.6986f, 20.1502f)
                curveTo(8.4672f, 20.2486f, 9.4742f, 20.25f, 10.9121f, 20.25f)
                horizontalLineTo(13.0879f)
                curveTo(14.5258f, 20.25f, 15.5328f, 20.2486f, 16.3014f, 20.1502f)
                curveTo(17.0491f, 20.0545f, 17.4715f, 19.8774f, 17.7877f, 19.5943f)
                curveTo(17.9038f, 19.4904f, 18.036f, 19.3f, 18.1647f, 18.9708f)
                curveTo(18.2448f, 18.7662f, 18.3166f, 18.526f, 18.382f, 18.25f)
                horizontalLineTo(5.618f)
                close()
                moveTo(3.25f, 9.0f)
                curveTo(3.25f, 8.5858f, 3.5858f, 8.25f, 4.0f, 8.25f)
                curveTo(4.4142f, 8.25f, 4.75f, 8.5858f, 4.75f, 9.0f)
                curveTo(4.75f, 9.1879f, 4.6819f, 9.358f, 4.568f, 9.4898f)
                curveTo(4.4311f, 9.6483f, 4.2319f, 9.7474f, 4.009f, 9.75f)
                lineTo(4.0f, 9.75f)
                curveTo(3.5858f, 9.75f, 3.25f, 9.4142f, 3.25f, 9.0f)
                close()
                moveTo(19.25f, 9.0f)
                curveTo(19.25f, 8.5858f, 19.5858f, 8.25f, 20.0f, 8.25f)
                curveTo(20.4142f, 8.25f, 20.75f, 8.5858f, 20.75f, 9.0f)
                curveTo(20.75f, 9.4142f, 20.4142f, 9.75f, 20.0f, 9.75f)
                lineTo(19.991f, 9.75f)
                curveTo(19.7681f, 9.7474f, 19.5689f, 9.6483f, 19.432f, 9.4898f)
                curveTo(19.3181f, 9.358f, 19.25f, 9.1879f, 19.25f, 9.0f)
                close()
            }
        }
            .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
