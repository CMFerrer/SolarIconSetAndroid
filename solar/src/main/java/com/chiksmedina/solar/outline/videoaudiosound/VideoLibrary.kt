package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.VideoLibrary: ImageVector
    get() {
        if (_videoLibrary != null) {
            return _videoLibrary!!
        }
        _videoLibrary = Builder(
            name = "VideoLibrary", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9897f, 10.91f)
                curveTo(10.4482f, 10.609f, 11.0657f, 10.5541f, 11.6048f, 10.8884f)
                lineTo(14.9764f, 12.9785f)
                curveTo(15.5136f, 13.3116f, 15.75f, 13.8874f, 15.75f, 14.4102f)
                curveTo(15.75f, 14.933f, 15.5136f, 15.5088f, 14.9764f, 15.8418f)
                lineTo(11.6048f, 17.932f)
                curveTo(11.0657f, 18.2662f, 10.4482f, 18.2114f, 9.9897f, 17.9103f)
                curveTo(9.539f, 17.6144f, 9.25f, 17.0934f, 9.25f, 16.5003f)
                verticalLineTo(12.32f)
                curveTo(9.25f, 11.727f, 9.539f, 11.2059f, 9.9897f, 10.91f)
                close()
                moveTo(10.8129f, 12.1639f)
                curveTo(10.7945f, 12.176f, 10.75f, 12.2203f, 10.75f, 12.32f)
                verticalLineTo(16.5003f)
                curveTo(10.75f, 16.6f, 10.7945f, 16.6443f, 10.8129f, 16.6564f)
                lineTo(10.8142f, 16.6572f)
                lineTo(14.186f, 14.5669f)
                curveTo(14.2072f, 14.5538f, 14.25f, 14.5085f, 14.25f, 14.4102f)
                curveTo(14.25f, 14.3118f, 14.2072f, 14.2665f, 14.186f, 14.2534f)
                lineTo(10.8145f, 12.1633f)
                lineTo(10.8129f, 12.1639f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.6994f, 1.25f)
                curveTo(8.4795f, 1.25f, 8.3109f, 1.2499f, 8.1636f, 1.2657f)
                curveTo(6.8094f, 1.411f, 5.773f, 2.523f, 5.7101f, 3.8701f)
                curveTo(4.5192f, 4.2256f, 3.6706f, 5.3275f, 3.6553f, 6.5913f)
                curveTo(3.0545f, 6.7716f, 2.5362f, 7.0561f, 2.112f, 7.5143f)
                curveTo(1.46f, 8.2186f, 1.2579f, 9.0865f, 1.2502f, 10.1003f)
                curveTo(1.2428f, 11.075f, 1.4165f, 12.3067f, 1.6322f, 13.8363f)
                lineTo(2.0712f, 16.9499f)
                curveTo(2.2398f, 18.146f, 2.3768f, 19.1176f, 2.5899f, 19.879f)
                curveTo(2.8129f, 20.6756f, 3.1415f, 21.331f, 3.75f, 21.8349f)
                curveTo(4.3537f, 22.3347f, 5.0699f, 22.5502f, 5.9165f, 22.6518f)
                curveTo(6.735f, 22.75f, 7.7647f, 22.75f, 9.0468f, 22.75f)
                horizontalLineTo(14.9531f)
                curveTo(16.2352f, 22.75f, 17.265f, 22.75f, 18.0835f, 22.6518f)
                curveTo(18.9301f, 22.5502f, 19.6463f, 22.3347f, 20.25f, 21.8349f)
                curveTo(20.8585f, 21.331f, 21.1871f, 20.6756f, 21.4101f, 19.879f)
                curveTo(21.6232f, 19.1176f, 21.7602f, 18.146f, 21.9288f, 16.9499f)
                lineTo(22.3678f, 13.8363f)
                curveTo(22.5835f, 12.3067f, 22.7572f, 11.075f, 22.7498f, 10.1003f)
                curveTo(22.7421f, 9.0865f, 22.54f, 8.2186f, 21.888f, 7.5143f)
                curveTo(21.4637f, 7.056f, 20.9453f, 6.7715f, 20.3443f, 6.5912f)
                curveTo(20.3289f, 5.3275f, 19.4805f, 4.2257f, 18.2897f, 3.8701f)
                curveTo(18.2268f, 2.5231f, 17.1903f, 1.411f, 15.8362f, 1.2657f)
                curveTo(15.6888f, 1.2499f, 15.5203f, 1.25f, 15.3004f, 1.25f)
                horizontalLineTo(8.6994f)
                close()
                moveTo(18.8105f, 6.3278f)
                curveTo(18.6734f, 5.7202f, 18.1306f, 5.25f, 17.4617f, 5.25f)
                horizontalLineTo(6.5379f)
                curveTo(5.869f, 5.25f, 5.3262f, 5.7202f, 5.189f, 6.3278f)
                curveTo(6.1148f, 6.25f, 7.2497f, 6.25f, 8.6159f, 6.25f)
                horizontalLineTo(15.384f)
                curveTo(16.75f, 6.25f, 17.8848f, 6.25f, 18.8105f, 6.3278f)
                close()
                moveTo(16.7677f, 3.75f)
                curveTo(16.6611f, 3.2263f, 16.2263f, 2.8162f, 15.6761f, 2.7571f)
                curveTo(15.6198f, 2.7511f, 15.5396f, 2.75f, 15.2588f, 2.75f)
                horizontalLineTo(8.741f)
                curveTo(8.4601f, 2.75f, 8.3799f, 2.7511f, 8.3237f, 2.7571f)
                curveTo(7.7734f, 2.8162f, 7.3386f, 3.2263f, 7.2321f, 3.75f)
                horizontalLineTo(16.7677f)
                close()
                moveTo(3.2127f, 8.5334f)
                curveTo(3.5156f, 8.2062f, 3.9711f, 7.9892f, 4.8561f, 7.8714f)
                curveTo(5.7573f, 7.7516f, 6.9636f, 7.75f, 8.6724f, 7.75f)
                horizontalLineTo(15.3276f)
                curveTo(17.0364f, 7.75f, 18.2427f, 7.7516f, 19.1439f, 7.8714f)
                curveTo(20.0289f, 7.9892f, 20.4844f, 8.2062f, 20.7873f, 8.5334f)
                curveTo(21.0832f, 8.8529f, 21.2436f, 9.2878f, 21.2498f, 10.1117f)
                curveTo(21.2563f, 10.9618f, 21.1002f, 12.0828f, 20.8738f, 13.6883f)
                lineTo(20.4509f, 16.6883f)
                curveTo(20.2731f, 17.9491f, 20.1486f, 18.821f, 19.9656f, 19.4747f)
                curveTo(19.7894f, 20.1042f, 19.582f, 20.4405f, 19.2934f, 20.6795f)
                curveTo(18.9999f, 20.9225f, 18.6058f, 21.0784f, 17.9048f, 21.1625f)
                curveTo(17.1861f, 21.2488f, 16.2465f, 21.25f, 14.9046f, 21.25f)
                horizontalLineTo(9.0954f)
                curveTo(7.7535f, 21.25f, 6.8139f, 21.2488f, 6.0952f, 21.1625f)
                curveTo(5.3942f, 21.0784f, 5.0001f, 20.9225f, 4.7066f, 20.6795f)
                curveTo(4.418f, 20.4405f, 4.2106f, 20.1042f, 4.0344f, 19.4747f)
                curveTo(3.8514f, 18.821f, 3.7269f, 17.9491f, 3.5491f, 16.6883f)
                lineTo(3.1262f, 13.6883f)
                curveTo(2.8998f, 12.0828f, 2.7437f, 10.9618f, 2.7502f, 10.1117f)
                curveTo(2.7564f, 9.2878f, 2.9168f, 8.8529f, 3.2127f, 8.5334f)
                close()
            }
        }
            .build()
        return _videoLibrary!!
    }

private var _videoLibrary: ImageVector? = null
