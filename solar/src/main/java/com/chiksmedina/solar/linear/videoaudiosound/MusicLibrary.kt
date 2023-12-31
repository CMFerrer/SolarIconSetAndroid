package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicLibrary: ImageVector
    get() {
        if (_musicLibrary != null) {
            return _musicLibrary!!
        }
        _musicLibrary = Builder(
            name = "MusicLibrary", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.562f, 7.0f)
                curveTo(19.7906f, 5.6952f, 18.7866f, 4.5f, 17.4619f, 4.5f)
                horizontalLineTo(6.5381f)
                curveTo(5.2135f, 4.5f, 4.2095f, 5.6952f, 4.4381f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.4999f, 4.5f)
                curveTo(17.5283f, 4.2409f, 17.5425f, 4.1114f, 17.5427f, 4.0044f)
                curveTo(17.545f, 2.9807f, 16.7739f, 2.1206f, 15.7561f, 2.0114f)
                curveTo(15.6497f, 2.0f, 15.5194f, 2.0f, 15.2588f, 2.0f)
                horizontalLineTo(8.741f)
                curveTo(8.4803f, 2.0f, 8.35f, 2.0f, 8.2436f, 2.0114f)
                curveTo(7.2258f, 2.1206f, 6.4548f, 2.9807f, 6.457f, 4.0043f)
                curveTo(6.4573f, 4.1114f, 6.4715f, 4.2409f, 6.4998f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5606f, 12.6995f)
                lineTo(12.2076f, 13.3612f)
                lineTo(12.2076f, 13.3612f)
                lineTo(12.5606f, 12.6995f)
                close()
                moveTo(13.4429f, 13.17f)
                lineTo(13.7958f, 12.5083f)
                lineTo(13.7958f, 12.5083f)
                lineTo(13.4429f, 13.17f)
                close()
                moveTo(14.4394f, 11.3015f)
                lineTo(14.7924f, 10.6398f)
                lineTo(14.7924f, 10.6398f)
                lineTo(14.4394f, 11.3015f)
                close()
                moveTo(13.5571f, 10.8309f)
                lineTo(13.91f, 10.1692f)
                lineTo(13.91f, 10.1692f)
                lineTo(13.5571f, 10.8309f)
                close()
                moveTo(12.0018f, 11.6066f)
                lineTo(12.7505f, 11.652f)
                lineTo(12.7505f, 11.652f)
                lineTo(12.0018f, 11.6066f)
                close()
                moveTo(13.4163f, 10.7579f)
                lineTo(13.1041f, 11.4398f)
                lineTo(13.1041f, 11.4398f)
                lineTo(13.4163f, 10.7579f)
                close()
                moveTo(14.9995f, 12.1687f)
                lineTo(15.7491f, 12.1449f)
                lineTo(15.7491f, 12.1449f)
                lineTo(14.9995f, 12.1687f)
                close()
                moveTo(14.4984f, 11.3335f)
                lineTo(14.8722f, 10.6833f)
                lineTo(14.8722f, 10.6833f)
                lineTo(14.4984f, 11.3335f)
                close()
                moveTo(13.5837f, 13.2431f)
                lineTo(13.8959f, 12.5611f)
                lineTo(13.8959f, 12.5611f)
                lineTo(13.5837f, 13.2431f)
                close()
                moveTo(14.9982f, 12.3944f)
                lineTo(14.2495f, 12.349f)
                lineTo(14.2495f, 12.349f)
                lineTo(14.9982f, 12.3944f)
                close()
                moveTo(12.5016f, 12.6674f)
                lineTo(12.1278f, 13.3177f)
                lineTo(12.1278f, 13.3177f)
                lineTo(12.5016f, 12.6674f)
                close()
                moveTo(12.0005f, 11.8323f)
                lineTo(11.2509f, 11.8561f)
                lineTo(11.2509f, 11.8561f)
                lineTo(12.0005f, 11.8323f)
                close()
                moveTo(11.25f, 16.5005f)
                curveTo(11.25f, 16.9147f, 10.9142f, 17.2505f, 10.5f, 17.2505f)
                verticalLineTo(18.7505f)
                curveTo(11.7426f, 18.7505f, 12.75f, 17.7431f, 12.75f, 16.5005f)
                horizontalLineTo(11.25f)
                close()
                moveTo(10.5f, 17.2505f)
                curveTo(10.0858f, 17.2505f, 9.75f, 16.9147f, 9.75f, 16.5005f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 17.7431f, 9.2574f, 18.7505f, 10.5f, 18.7505f)
                verticalLineTo(17.2505f)
                close()
                moveTo(9.75f, 16.5005f)
                curveTo(9.75f, 16.0863f, 10.0858f, 15.7505f, 10.5f, 15.7505f)
                verticalLineTo(14.2505f)
                curveTo(9.2574f, 14.2505f, 8.25f, 15.2578f, 8.25f, 16.5005f)
                horizontalLineTo(9.75f)
                close()
                moveTo(10.5f, 15.7505f)
                curveTo(10.9142f, 15.7505f, 11.25f, 16.0863f, 11.25f, 16.5005f)
                horizontalLineTo(12.75f)
                curveTo(12.75f, 15.2578f, 11.7426f, 14.2505f, 10.5f, 14.2505f)
                verticalLineTo(15.7505f)
                close()
                moveTo(12.75f, 16.5005f)
                verticalLineTo(12.0005f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.5005f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.2076f, 13.3612f)
                lineTo(13.09f, 13.8318f)
                lineTo(13.7958f, 12.5083f)
                lineTo(12.9135f, 12.0377f)
                lineTo(12.2076f, 13.3612f)
                close()
                moveTo(14.7924f, 10.6398f)
                lineTo(13.91f, 10.1692f)
                lineTo(13.2042f, 11.4927f)
                lineTo(14.0865f, 11.9633f)
                lineTo(14.7924f, 10.6398f)
                close()
                moveTo(12.75f, 11.7652f)
                curveTo(12.75f, 11.721f, 12.75f, 11.6929f, 12.7502f, 11.672f)
                curveTo(12.7504f, 11.6505f, 12.7507f, 11.6476f, 12.7505f, 11.652f)
                lineTo(11.2532f, 11.5612f)
                curveTo(11.2496f, 11.6203f, 11.25f, 11.6931f, 11.25f, 11.7652f)
                horizontalLineTo(12.75f)
                close()
                moveTo(13.91f, 10.1692f)
                curveTo(13.8464f, 10.1352f, 13.7824f, 10.1007f, 13.7285f, 10.076f)
                lineTo(13.1041f, 11.4398f)
                curveTo(13.1f, 11.438f, 13.1027f, 11.4391f, 13.1218f, 11.449f)
                curveTo(13.1404f, 11.4587f, 13.1652f, 11.4719f, 13.2042f, 11.4927f)
                lineTo(13.91f, 10.1692f)
                close()
                moveTo(12.7505f, 11.652f)
                curveTo(12.7611f, 11.4767f, 12.9444f, 11.3667f, 13.1041f, 11.4398f)
                lineTo(13.7285f, 10.076f)
                curveTo(12.6108f, 9.5643f, 11.3277f, 10.3341f, 11.2532f, 11.5612f)
                lineTo(12.7505f, 11.652f)
                close()
                moveTo(15.75f, 12.2358f)
                curveTo(15.75f, 12.2067f, 15.7501f, 12.1755f, 15.7491f, 12.1449f)
                lineTo(14.2499f, 12.1925f)
                curveTo(14.2498f, 12.1917f, 14.2499f, 12.1929f, 14.25f, 12.1999f)
                curveTo(14.25f, 12.2077f, 14.25f, 12.2179f, 14.25f, 12.2358f)
                horizontalLineTo(15.75f)
                close()
                moveTo(14.0865f, 11.9633f)
                curveTo(14.1023f, 11.9717f, 14.1113f, 11.9765f, 14.1181f, 11.9802f)
                curveTo(14.1243f, 11.9835f, 14.1253f, 11.9842f, 14.1246f, 11.9838f)
                lineTo(14.8722f, 10.6833f)
                curveTo(14.8456f, 10.668f, 14.8181f, 10.6535f, 14.7924f, 10.6398f)
                lineTo(14.0865f, 11.9633f)
                close()
                moveTo(15.7491f, 12.1449f)
                curveTo(15.7298f, 11.5386f, 15.398f, 10.9856f, 14.8722f, 10.6833f)
                lineTo(14.1246f, 11.9838f)
                curveTo(14.1997f, 12.0269f, 14.2471f, 12.1059f, 14.2499f, 12.1925f)
                lineTo(15.7491f, 12.1449f)
                close()
                moveTo(13.09f, 13.8318f)
                curveTo(13.1536f, 13.8657f, 13.2176f, 13.9003f, 13.2715f, 13.925f)
                lineTo(13.8959f, 12.5611f)
                curveTo(13.9f, 12.563f, 13.8973f, 12.5619f, 13.8782f, 12.552f)
                curveTo(13.8596f, 12.5423f, 13.8348f, 12.5291f, 13.7958f, 12.5083f)
                lineTo(13.09f, 13.8318f)
                close()
                moveTo(14.25f, 12.2358f)
                curveTo(14.25f, 12.28f, 14.25f, 12.308f, 14.2498f, 12.329f)
                curveTo(14.2496f, 12.3505f, 14.2493f, 12.3534f, 14.2495f, 12.349f)
                lineTo(15.7468f, 12.4398f)
                curveTo(15.7504f, 12.3807f, 15.75f, 12.3079f, 15.75f, 12.2358f)
                horizontalLineTo(14.25f)
                close()
                moveTo(13.2715f, 13.925f)
                curveTo(14.3892f, 14.4367f, 15.6723f, 13.6668f, 15.7468f, 12.4398f)
                lineTo(14.2495f, 12.349f)
                curveTo(14.2389f, 12.5243f, 14.0556f, 12.6342f, 13.8959f, 12.5611f)
                lineTo(13.2715f, 13.925f)
                close()
                moveTo(12.9135f, 12.0377f)
                curveTo(12.8977f, 12.0293f, 12.8887f, 12.0245f, 12.8819f, 12.0208f)
                curveTo(12.8757f, 12.0174f, 12.8746f, 12.0168f, 12.8754f, 12.0172f)
                lineTo(12.1278f, 13.3177f)
                curveTo(12.1544f, 13.3329f, 12.1819f, 13.3475f, 12.2076f, 13.3612f)
                lineTo(12.9135f, 12.0377f)
                close()
                moveTo(11.25f, 11.7652f)
                curveTo(11.25f, 11.7943f, 11.2499f, 11.8255f, 11.2509f, 11.8561f)
                lineTo(12.7501f, 11.8084f)
                curveTo(12.7502f, 11.8093f, 12.7501f, 11.808f, 12.75f, 11.8011f)
                curveTo(12.75f, 11.7933f, 12.75f, 11.7831f, 12.75f, 11.7652f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.8754f, 12.0172f)
                curveTo(12.8003f, 11.974f, 12.7529f, 11.895f, 12.7501f, 11.8084f)
                lineTo(11.2509f, 11.8561f)
                curveTo(11.2702f, 12.4623f, 11.602f, 13.0154f, 12.1278f, 13.3177f)
                lineTo(12.8754f, 12.0172f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.3835f, 13.793f)
                curveTo(1.9375f, 10.6294f, 1.7145f, 9.0477f, 2.6623f, 8.0238f)
                curveTo(3.6102f, 7.0f, 5.2976f, 7.0f, 8.6724f, 7.0f)
                horizontalLineTo(15.3276f)
                curveTo(18.7024f, 7.0f, 20.3898f, 7.0f, 21.3377f, 8.0238f)
                curveTo(22.2855f, 9.0477f, 22.0625f, 10.6294f, 21.6165f, 13.793f)
                lineTo(21.1935f, 16.793f)
                curveTo(20.8437f, 19.2739f, 20.6689f, 20.5143f, 19.7717f, 21.2572f)
                curveTo(18.8745f, 22.0f, 17.5512f, 22.0f, 14.9046f, 22.0f)
                horizontalLineTo(9.0954f)
                curveTo(6.4488f, 22.0f, 5.1255f, 22.0f, 4.2283f, 21.2572f)
                curveTo(3.3312f, 20.5143f, 3.1563f, 19.2739f, 2.8065f, 16.793f)
                lineTo(2.3835f, 13.793f)
                close()
            }
        }
            .build()
        return _musicLibrary!!
    }

private var _musicLibrary: ImageVector? = null
