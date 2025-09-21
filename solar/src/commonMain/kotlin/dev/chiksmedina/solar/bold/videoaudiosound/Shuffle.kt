package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(
            name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.2623f, 7.4772f)
                curveTo(16.551f, 7.1802f, 17.0258f, 7.1735f, 17.3228f, 7.4623f)
                lineTo(18.5228f, 8.6289f)
                curveTo(18.6681f, 8.7701f, 18.75f, 8.9641f, 18.75f, 9.1667f)
                curveTo(18.75f, 9.3692f, 18.6681f, 9.5632f, 18.5228f, 9.7044f)
                lineTo(17.3228f, 10.8711f)
                curveTo(17.0258f, 11.1598f, 16.551f, 11.1531f, 16.2623f, 10.8561f)
                curveTo(16.011f, 10.5977f, 15.9834f, 10.2046f, 16.1762f, 9.9167f)
                horizontalLineTo(15.8383f)
                curveTo(15.3265f, 9.9167f, 14.9944f, 9.9174f, 14.7373f, 9.9417f)
                curveTo(14.4955f, 9.9646f, 14.3787f, 10.0042f, 14.294f, 10.0509f)
                curveTo(14.2102f, 10.0969f, 14.1178f, 10.1718f, 13.9758f, 10.3582f)
                curveTo(13.8236f, 10.5581f, 13.6532f, 10.8325f, 13.3896f, 11.2598f)
                lineTo(11.8693f, 13.7233f)
                curveTo(11.6282f, 14.1138f, 11.4197f, 14.4518f, 11.2175f, 14.7172f)
                curveTo(11.0002f, 15.0026f, 10.7583f, 15.2488f, 10.4294f, 15.4299f)
                curveTo(10.1015f, 15.6104f, 9.763f, 15.6843f, 9.4039f, 15.7183f)
                curveTo(9.0679f, 15.75f, 8.6643f, 15.75f, 8.1946f, 15.75f)
                lineTo(6.0f, 15.75f)
                curveTo(5.5858f, 15.75f, 5.25f, 15.4142f, 5.25f, 15.0f)
                curveTo(5.25f, 14.5858f, 5.5858f, 14.25f, 6.0f, 14.25f)
                horizontalLineTo(8.1617f)
                curveTo(8.6735f, 14.25f, 9.0056f, 14.2492f, 9.2627f, 14.2249f)
                curveTo(9.5045f, 14.2021f, 9.6213f, 14.1625f, 9.706f, 14.1158f)
                curveTo(9.7898f, 14.0697f, 9.8822f, 13.9948f, 10.0242f, 13.8085f)
                curveTo(10.1764f, 13.6086f, 10.3468f, 13.3341f, 10.6104f, 12.9068f)
                lineTo(12.1307f, 10.4434f)
                curveTo(12.3717f, 10.0528f, 12.5803f, 9.7149f, 12.7825f, 9.4494f)
                curveTo(12.9998f, 9.164f, 13.2417f, 8.9178f, 13.5706f, 8.7368f)
                curveTo(13.8985f, 8.5563f, 14.237f, 8.4823f, 14.5961f, 8.4484f)
                curveTo(14.9322f, 8.4166f, 15.3357f, 8.4166f, 15.8054f, 8.4167f)
                lineTo(16.1762f, 8.4167f)
                curveTo(15.9834f, 8.1287f, 16.011f, 7.7356f, 16.2623f, 7.4772f)
                close()
                moveTo(9.3853f, 9.7692f)
                curveTo(9.3005f, 9.7531f, 9.1993f, 9.75f, 8.8006f, 9.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 9.75f, 5.25f, 9.4142f, 5.25f, 9.0f)
                curveTo(5.25f, 8.5858f, 5.5858f, 8.25f, 6.0f, 8.25f)
                horizontalLineTo(8.8006f)
                lineTo(8.8584f, 8.25f)
                curveTo(9.171f, 8.2498f, 9.423f, 8.2497f, 9.6642f, 8.2953f)
                curveTo(10.2033f, 8.3973f, 10.6972f, 8.6678f, 11.0694f, 9.0701f)
                curveTo(11.2363f, 9.2504f, 11.3679f, 9.4639f, 11.5278f, 9.7235f)
                lineTo(11.5582f, 9.7728f)
                curveTo(11.7758f, 10.1253f, 11.6664f, 10.5874f, 11.3139f, 10.8049f)
                curveTo(10.9614f, 11.0224f, 10.4993f, 10.913f, 10.2818f, 10.5606f)
                curveTo(10.0759f, 10.2269f, 10.0234f, 10.1482f, 9.9685f, 10.0889f)
                curveTo(9.8178f, 9.9261f, 9.6137f, 9.8124f, 9.3853f, 9.7692f)
                close()
                moveTo(12.6861f, 13.0284f)
                curveTo(13.0386f, 12.8109f, 13.5007f, 12.9203f, 13.7182f, 13.2728f)
                curveTo(13.9241f, 13.6064f, 13.9766f, 13.6851f, 14.0315f, 13.7444f)
                curveTo(14.1822f, 13.9072f, 14.3863f, 14.021f, 14.6147f, 14.0642f)
                curveTo(14.6995f, 14.0802f, 14.8007f, 14.0833f, 15.1994f, 14.0833f)
                horizontalLineTo(16.1762f)
                curveTo(15.9834f, 13.7954f, 16.011f, 13.4023f, 16.2623f, 13.1439f)
                curveTo(16.551f, 12.8469f, 17.0258f, 12.8402f, 17.3228f, 13.1289f)
                lineTo(18.5228f, 14.2956f)
                curveTo(18.6681f, 14.4368f, 18.75f, 14.6308f, 18.75f, 14.8333f)
                curveTo(18.75f, 15.0359f, 18.6681f, 15.2299f, 18.5228f, 15.3711f)
                lineTo(17.3228f, 16.5377f)
                curveTo(17.0258f, 16.8265f, 16.551f, 16.8198f, 16.2623f, 16.5228f)
                curveTo(16.011f, 16.2644f, 15.9834f, 15.8713f, 16.1762f, 15.5833f)
                horizontalLineTo(15.1994f)
                lineTo(15.1416f, 15.5834f)
                curveTo(14.829f, 15.5835f, 14.5769f, 15.5837f, 14.3358f, 15.538f)
                curveTo(13.7967f, 15.436f, 13.3028f, 15.1655f, 12.9306f, 14.7632f)
                curveTo(12.7637f, 14.5829f, 12.6321f, 14.3694f, 12.4722f, 14.1098f)
                lineTo(12.4418f, 14.0606f)
                curveTo(12.2242f, 13.7081f, 12.3336f, 13.246f, 12.6861f, 13.0284f)
                close()
            }
        }
            .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
