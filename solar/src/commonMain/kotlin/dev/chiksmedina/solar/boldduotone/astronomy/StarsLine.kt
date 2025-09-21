package dev.chiksmedina.solar.boldduotone.astronomy

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
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.StarsLine: ImageVector
    get() {
        if (_starsLine != null) {
            return _starsLine!!
        }
        _starsLine = Builder(
            name = "StarsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5497f, 3.4395f)
                curveTo(12.118f, 2.509f, 11.9022f, 2.0438f, 11.5213f, 2.0045f)
                curveTo(11.1405f, 1.9652f, 10.8468f, 2.3779f, 10.2595f, 3.2031f)
                lineTo(10.1075f, 3.4167f)
                curveTo(9.9406f, 3.6512f, 9.8572f, 3.7684f, 9.737f, 3.8391f)
                curveTo(9.6168f, 3.9097f, 9.4735f, 3.9258f, 9.1869f, 3.9578f)
                lineTo(8.9261f, 3.9871f)
                curveTo(7.9176f, 4.1f, 7.4134f, 4.1564f, 7.2635f, 4.5078f)
                curveTo(7.1135f, 4.8592f, 7.4172f, 5.2727f, 8.0245f, 6.0999f)
                lineTo(8.1816f, 6.3139f)
                curveTo(8.3542f, 6.549f, 8.4405f, 6.6665f, 8.4718f, 6.8041f)
                curveTo(8.5031f, 6.9417f, 8.4759f, 7.0838f, 8.4214f, 7.368f)
                lineTo(8.3719f, 7.6268f)
                curveTo(8.1803f, 8.627f, 8.0844f, 9.1271f, 8.3727f, 9.3836f)
                curveTo(8.6609f, 9.6401f, 9.1422f, 9.483f, 10.1049f, 9.169f)
                lineTo(10.3539f, 9.0877f)
                curveTo(10.6275f, 8.9985f, 10.7643f, 8.9538f, 10.9038f, 8.9682f)
                curveTo(11.0433f, 8.9826f, 11.1698f, 9.0544f, 11.4227f, 9.198f)
                lineTo(11.653f, 9.3287f)
                curveTo(12.543f, 9.834f, 12.988f, 10.0866f, 13.316f, 9.8937f)
                curveTo(13.6441f, 9.7009f, 13.6379f, 9.1902f, 13.6256f, 8.169f)
                lineTo(13.6224f, 7.9048f)
                curveTo(13.6189f, 7.6146f, 13.6171f, 7.4694f, 13.672f, 7.3407f)
                curveTo(13.727f, 7.212f, 13.8323f, 7.1143f, 14.0431f, 6.9188f)
                lineTo(14.235f, 6.7408f)
                curveTo(14.9767f, 6.0528f, 15.3475f, 5.7089f, 15.262f, 5.3332f)
                curveTo(15.1766f, 4.9576f, 14.6914f, 4.799f, 13.7211f, 4.4819f)
                lineTo(13.4701f, 4.3999f)
                curveTo(13.1943f, 4.3098f, 13.0565f, 4.2647f, 12.9509f, 4.1707f)
                curveTo(12.8453f, 4.0768f, 12.784f, 3.9446f, 12.6613f, 3.6802f)
                lineTo(12.5497f, 3.4395f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(11.2059f, 11.279f)
                curveTo(11.6042f, 11.3928f, 11.8348f, 11.8079f, 11.721f, 12.2062f)
                curveTo(11.3546f, 13.4888f, 11.2666f, 15.3498f, 11.3245f, 17.2144f)
                curveTo(11.3818f, 19.0601f, 11.5786f, 20.8296f, 11.7412f, 21.8861f)
                curveTo(11.8041f, 22.2955f, 11.5233f, 22.6784f, 11.1139f, 22.7414f)
                curveTo(10.7045f, 22.8044f, 10.3216f, 22.5236f, 10.2586f, 22.1142f)
                curveTo(10.0878f, 21.0039f, 9.8846f, 19.1735f, 9.8252f, 17.2609f)
                curveTo(9.7664f, 15.3671f, 9.8452f, 13.3114f, 10.2787f, 11.7941f)
                curveTo(10.3925f, 11.3958f, 10.8076f, 11.1652f, 11.2059f, 11.279f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(22.6479f, 9.1222f)
                curveTo(22.8566f, 9.48f, 22.7357f, 9.9392f, 22.378f, 10.148f)
                curveTo(16.6662f, 13.4798f, 15.25f, 18.859f, 15.25f, 22.0001f)
                curveTo(15.25f, 22.4143f, 14.9143f, 22.7501f, 14.5f, 22.7501f)
                curveTo(14.0858f, 22.7501f, 13.75f, 22.4143f, 13.75f, 22.0001f)
                curveTo(13.75f, 18.4746f, 15.3339f, 12.5204f, 21.6221f, 8.8523f)
                curveTo(21.9799f, 8.6436f, 22.4392f, 8.7644f, 22.6479f, 9.1222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.1335f, 13.7654f)
                curveTo(5.1108f, 13.6578f, 5.2823f, 13.5588f, 5.3641f, 13.6323f)
                curveTo(5.6018f, 13.8458f, 5.9227f, 14.089f, 6.2226f, 14.1694f)
                curveTo(6.5225f, 14.2497f, 6.922f, 14.1996f, 7.2347f, 14.1335f)
                curveTo(7.3423f, 14.1108f, 7.4413f, 14.2823f, 7.3678f, 14.3641f)
                curveTo(7.1543f, 14.6018f, 6.9111f, 14.9227f, 6.8307f, 15.2226f)
                curveTo(6.7504f, 15.5225f, 6.8005f, 15.922f, 6.8666f, 16.2347f)
                curveTo(6.8893f, 16.3423f, 6.7178f, 16.4413f, 6.636f, 16.3678f)
                curveTo(6.3983f, 16.1543f, 6.0774f, 15.9111f, 5.7775f, 15.8307f)
                curveTo(5.4776f, 15.7504f, 5.0781f, 15.8005f, 4.7654f, 15.8666f)
                curveTo(4.6578f, 15.8893f, 4.5588f, 15.7178f, 4.6323f, 15.636f)
                curveTo(4.8458f, 15.3983f, 5.089f, 15.0774f, 5.1694f, 14.7775f)
                curveTo(5.2497f, 14.4776f, 5.1996f, 14.0781f, 5.1335f, 13.7654f)
                close()
            }
        }
            .build()
        return _starsLine!!
    }

private var _starsLine: ImageVector? = null
