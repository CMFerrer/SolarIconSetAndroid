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

public val VideoAudioSoundGroup.PlayStream: ImageVector
    get() {
        if (_playStream != null) {
            return _playStream!!
        }
        _playStream = Builder(name = "PlayStream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.4669f, 4.3921f)
                curveTo(5.7595f, 4.6853f, 5.759f, 5.1601f, 5.4658f, 5.4527f)
                curveTo(3.7872f, 7.128f, 2.75f, 9.4422f, 2.75f, 12.0f)
                curveTo(2.75f, 14.5878f, 3.8116f, 16.9262f, 5.525f, 18.6059f)
                curveTo(5.8208f, 18.8959f, 5.8255f, 19.3707f, 5.5356f, 19.6665f)
                curveTo(5.2456f, 19.9623f, 4.7708f, 19.967f, 4.475f, 19.677f)
                curveTo(2.4856f, 17.7269f, 1.25f, 15.0071f, 1.25f, 12.0f)
                curveTo(1.25f, 9.0278f, 2.4572f, 6.3362f, 4.4062f, 4.391f)
                curveTo(4.6994f, 4.0984f, 5.1743f, 4.0989f, 5.4669f, 4.3921f)
                close()
                moveTo(18.6164f, 4.4645f)
                curveTo(18.9122f, 4.1745f, 19.387f, 4.1792f, 19.677f, 4.475f)
                curveTo(21.5771f, 6.4133f, 22.75f, 9.0704f, 22.75f, 12.0f)
                curveTo(22.75f, 14.9645f, 21.5491f, 17.6499f, 19.609f, 19.5938f)
                curveTo(19.3164f, 19.887f, 18.8415f, 19.8875f, 18.5484f, 19.5949f)
                curveTo(18.2552f, 19.3023f, 18.2547f, 18.8274f, 18.5473f, 18.5342f)
                curveTo(20.2182f, 16.86f, 21.25f, 14.5512f, 21.25f, 12.0f)
                curveTo(21.25f, 9.4787f, 20.2422f, 7.1943f, 18.6059f, 5.5251f)
                curveTo(18.3159f, 5.2293f, 18.3206f, 4.7544f, 18.6164f, 4.4645f)
                close()
                moveTo(8.3092f, 7.4876f)
                curveTo(8.5923f, 7.79f, 8.5765f, 8.2646f, 8.2741f, 8.5477f)
                curveTo(7.3252f, 9.4356f, 6.75f, 10.6502f, 6.75f, 11.9822f)
                curveTo(6.75f, 13.3297f, 7.3387f, 14.5573f, 8.3076f, 15.4479f)
                curveTo(8.6125f, 15.7282f, 8.6325f, 16.2026f, 8.3522f, 16.5076f)
                curveTo(8.0718f, 16.8125f, 7.5974f, 16.8325f, 7.2924f, 16.5522f)
                curveTo(6.0397f, 15.4006f, 5.25f, 13.7824f, 5.25f, 11.9822f)
                curveTo(5.25f, 10.203f, 6.0215f, 8.6013f, 7.2492f, 7.4524f)
                curveTo(7.5516f, 7.1694f, 8.0262f, 7.1851f, 8.3092f, 7.4876f)
                close()
                moveTo(15.7429f, 7.5256f)
                curveTo(16.0292f, 7.2263f, 16.5039f, 7.2157f, 16.8033f, 7.502f)
                curveTo(18.0005f, 8.6471f, 18.75f, 10.2286f, 18.75f, 11.9822f)
                curveTo(18.75f, 13.7568f, 17.9825f, 15.3548f, 16.7604f, 16.503f)
                curveTo(16.4586f, 16.7867f, 15.9839f, 16.7719f, 15.7003f, 16.47f)
                curveTo(15.4167f, 16.1681f, 15.4315f, 15.6935f, 15.7333f, 15.4099f)
                curveTo(16.6778f, 14.5225f, 17.25f, 13.3108f, 17.25f, 11.9822f)
                curveTo(17.25f, 10.6692f, 16.6911f, 9.4705f, 15.7664f, 8.586f)
                curveTo(15.4671f, 8.2997f, 15.4566f, 7.8249f, 15.7429f, 7.5256f)
                close()
                moveTo(12.5922f, 8.8883f)
                curveTo(12.6098f, 8.898f, 12.6274f, 8.9076f, 12.645f, 8.9172f)
                curveTo(12.8855f, 9.0489f, 13.124f, 9.1863f, 13.3391f, 9.3223f)
                curveTo(13.5841f, 9.4771f, 13.8445f, 9.6589f, 14.1002f, 9.8466f)
                curveTo(14.1155f, 9.8578f, 14.1308f, 9.8691f, 14.146f, 9.8802f)
                curveTo(14.5543f, 10.1798f, 14.9365f, 10.4603f, 15.2067f, 10.7436f)
                curveTo(15.5201f, 11.0721f, 15.75f, 11.4709f, 15.75f, 12.0001f)
                curveTo(15.75f, 12.5292f, 15.5201f, 12.928f, 15.2067f, 13.2565f)
                curveTo(14.9365f, 13.5398f, 14.5543f, 13.8203f, 14.146f, 14.1199f)
                curveTo(14.1308f, 14.1311f, 14.1155f, 14.1423f, 14.1002f, 14.1535f)
                curveTo(13.8445f, 14.3412f, 13.5841f, 14.523f, 13.3391f, 14.6779f)
                curveTo(13.124f, 14.8138f, 12.8855f, 14.9512f, 12.645f, 15.0829f)
                curveTo(12.6274f, 15.0925f, 12.6098f, 15.1022f, 12.5922f, 15.1118f)
                curveTo(12.1916f, 15.3312f, 11.8024f, 15.5444f, 11.4602f, 15.655f)
                curveTo(11.0513f, 15.7872f, 10.5783f, 15.8163f, 10.1238f, 15.5093f)
                curveTo(9.6957f, 15.2201f, 9.5204f, 14.7919f, 9.4325f, 14.3837f)
                curveTo(9.3523f, 14.0113f, 9.322f, 13.5387f, 9.2885f, 13.0167f)
                curveTo(9.2874f, 12.9994f, 9.2863f, 12.9821f, 9.2852f, 12.9648f)
                curveTo(9.264f, 12.6345f, 9.25f, 12.3032f, 9.25f, 12.0001f)
                curveTo(9.25f, 11.697f, 9.264f, 11.3656f, 9.2852f, 11.0353f)
                curveTo(9.2863f, 11.018f, 9.2874f, 11.0007f, 9.2885f, 10.9834f)
                curveTo(9.322f, 10.4614f, 9.3523f, 9.9888f, 9.4325f, 9.6164f)
                curveTo(9.5204f, 9.2083f, 9.6957f, 8.7801f, 10.1238f, 8.4908f)
                curveTo(10.5783f, 8.1838f, 11.0513f, 8.2129f, 11.4602f, 8.3451f)
                curveTo(11.8024f, 8.4558f, 12.1916f, 8.6689f, 12.5922f, 8.8883f)
                close()
                moveTo(10.951f, 9.7585f)
                curveTo(10.9379f, 9.7872f, 10.9187f, 9.8401f, 10.8989f, 9.9321f)
                curveTo(10.8451f, 10.182f, 10.8201f, 10.5405f, 10.7821f, 11.1315f)
                curveTo(10.7621f, 11.4425f, 10.75f, 11.7397f, 10.75f, 12.0001f)
                curveTo(10.75f, 12.2604f, 10.7621f, 12.5576f, 10.7821f, 12.8686f)
                curveTo(10.8201f, 13.4596f, 10.8451f, 13.8181f, 10.8989f, 14.068f)
                curveTo(10.9187f, 14.16f, 10.9379f, 14.2129f, 10.951f, 14.2416f)
                curveTo(10.9639f, 14.2384f, 10.9797f, 14.2339f, 10.9987f, 14.2277f)
                curveTo(11.1886f, 14.1663f, 11.4504f, 14.0267f, 11.9249f, 13.7671f)
                curveTo(12.148f, 13.6449f, 12.3575f, 13.5238f, 12.5377f, 13.4099f)
                curveTo(12.7435f, 13.2799f, 12.9736f, 13.1198f, 13.2125f, 12.9444f)
                curveTo(13.6829f, 12.599f, 13.9539f, 12.3966f, 14.1214f, 12.2211f)
                curveTo(14.2506f, 12.0857f, 14.2503f, 12.0372f, 14.25f, 12.0041f)
                curveTo(14.25f, 12.0027f, 14.25f, 12.0014f, 14.25f, 12.0001f)
                curveTo(14.25f, 11.9987f, 14.25f, 11.9974f, 14.25f, 11.996f)
                curveTo(14.2503f, 11.9629f, 14.2506f, 11.9144f, 14.1214f, 11.7791f)
                curveTo(13.9539f, 11.6035f, 13.6829f, 11.4011f, 13.2125f, 11.0557f)
                curveTo(12.9736f, 10.8803f, 12.7435f, 10.7203f, 12.5377f, 10.5902f)
                curveTo(12.3575f, 10.4763f, 12.148f, 10.3552f, 11.9249f, 10.2331f)
                curveTo(11.4504f, 9.9734f, 11.1886f, 9.8338f, 10.9987f, 9.7724f)
                curveTo(10.9797f, 9.7662f, 10.9639f, 9.7618f, 10.951f, 9.7585f)
                close()
            }
        }
        .build()
        return _playStream!!
    }

private var _playStream: ImageVector? = null
