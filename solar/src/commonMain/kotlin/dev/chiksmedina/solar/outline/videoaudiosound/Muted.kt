package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Muted: ImageVector
    get() {
        if (_muted != null) {
            return _muted!!
        }
        _muted = Builder(
            name = "Muted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2241f, 6.8071f)
                curveTo(12.4234f, 5.9721f, 13.2598f, 5.3918f, 13.9182f, 5.0541f)
                curveTo(14.576f, 4.7167f, 14.878f, 4.7176f, 15.0744f, 4.7883f)
                curveTo(15.1946f, 4.8316f, 15.3137f, 4.8954f, 15.4199f, 4.9742f)
                curveTo(15.6067f, 5.1128f, 15.7902f, 5.3906f, 15.9202f, 6.1302f)
                curveTo(15.992f, 6.5382f, 16.3808f, 6.8107f, 16.7888f, 6.739f)
                curveTo(17.1967f, 6.6673f, 17.4693f, 6.2784f, 17.3976f, 5.8705f)
                curveTo(17.2471f, 5.0144f, 16.9707f, 4.2572f, 16.3138f, 3.7697f)
                curveTo(16.0915f, 3.6047f, 15.8427f, 3.4708f, 15.5829f, 3.3772f)
                curveTo(14.7882f, 3.0908f, 14.0043f, 3.3241f, 13.2336f, 3.7194f)
                curveTo(12.4743f, 4.1089f, 11.5549f, 4.749f, 10.4153f, 5.5425f)
                lineTo(10.1637f, 5.7177f)
                curveTo(9.7458f, 6.0086f, 9.6078f, 6.1016f, 9.4663f, 6.1675f)
                curveTo(9.3135f, 6.2387f, 9.1537f, 6.2892f, 8.9905f, 6.3183f)
                curveTo(8.8406f, 6.3451f, 8.6799f, 6.3478f, 8.1787f, 6.3478f)
                lineTo(8.0189f, 6.3477f)
                curveTo(6.8996f, 6.3469f, 6.0944f, 6.3464f, 5.3792f, 6.6958f)
                curveTo(4.7196f, 7.018f, 4.0947f, 7.6427f, 3.7577f, 8.3031f)
                curveTo(3.3943f, 9.0155f, 3.3517f, 9.7584f, 3.2909f, 10.8211f)
                lineTo(3.2836f, 10.9488f)
                curveTo(3.2627f, 11.3095f, 3.25f, 11.6661f, 3.25f, 12.0003f)
                curveTo(3.25f, 12.3346f, 3.2627f, 12.6912f, 3.2836f, 13.0519f)
                lineTo(3.2909f, 13.1796f)
                curveTo(3.3517f, 14.2423f, 3.3943f, 14.9852f, 3.7577f, 15.6975f)
                curveTo(4.0947f, 16.358f, 4.7196f, 16.9827f, 5.3792f, 17.3049f)
                curveTo(6.0944f, 17.6543f, 6.8996f, 17.6537f, 8.0189f, 17.653f)
                lineTo(8.1786f, 17.6529f)
                curveTo(8.6799f, 17.6529f, 8.8406f, 17.6556f, 8.9905f, 17.6823f)
                curveTo(9.1537f, 17.7114f, 9.3135f, 17.762f, 9.4663f, 17.8331f)
                curveTo(9.6078f, 17.8991f, 9.7458f, 17.992f, 10.1637f, 18.283f)
                lineTo(10.4153f, 18.4582f)
                curveTo(11.5549f, 19.2517f, 12.4743f, 19.8917f, 13.2336f, 20.2812f)
                curveTo(14.0043f, 20.6766f, 14.7882f, 20.9099f, 15.5829f, 20.6235f)
                curveTo(15.8427f, 20.5299f, 16.0915f, 20.396f, 16.3138f, 20.231f)
                curveTo(16.9707f, 19.7435f, 17.2471f, 18.9863f, 17.3976f, 18.1302f)
                curveTo(17.4693f, 17.7222f, 17.1967f, 17.3334f, 16.7888f, 17.2617f)
                curveTo(16.3808f, 17.1899f, 15.992f, 17.4625f, 15.9202f, 17.8705f)
                curveTo(15.7902f, 18.6101f, 15.6067f, 18.8878f, 15.4199f, 19.0264f)
                curveTo(15.3137f, 19.1052f, 15.1946f, 19.169f, 15.0744f, 19.2123f)
                curveTo(14.878f, 19.2831f, 14.576f, 19.284f, 13.9182f, 18.9466f)
                curveTo(13.2598f, 18.6089f, 12.4234f, 18.0285f, 11.2241f, 17.1935f)
                lineTo(10.9719f, 17.018f)
                curveTo(10.6219f, 16.7742f, 10.3732f, 16.6009f, 10.0999f, 16.4735f)
                curveTo(9.8302f, 16.3479f, 9.546f, 16.2577f, 9.2538f, 16.2056f)
                curveTo(8.9571f, 16.1527f, 8.6565f, 16.1528f, 8.2381f, 16.1529f)
                lineTo(8.1786f, 16.1529f)
                curveTo(6.8304f, 16.1529f, 6.402f, 16.1351f, 6.0377f, 15.9571f)
                curveTo(5.6804f, 15.7826f, 5.2884f, 15.3969f, 5.0938f, 15.0158f)
                curveTo(4.89f, 14.6162f, 4.8526f, 14.2046f, 4.7811f, 12.9655f)
                curveTo(4.7614f, 12.6249f, 4.75f, 12.2983f, 4.75f, 12.0003f)
                curveTo(4.75f, 11.7024f, 4.7614f, 11.3757f, 4.7811f, 11.0352f)
                curveTo(4.8526f, 9.7961f, 4.89f, 9.3844f, 5.0938f, 8.9849f)
                curveTo(5.2884f, 8.6037f, 5.6804f, 8.2181f, 6.0377f, 8.0435f)
                curveTo(6.402f, 7.8655f, 6.8304f, 7.8478f, 8.1786f, 7.8478f)
                lineTo(8.2381f, 7.8478f)
                curveTo(8.6565f, 7.8479f, 8.9571f, 7.848f, 9.2538f, 7.795f)
                curveTo(9.546f, 7.7429f, 9.8302f, 7.6528f, 10.0999f, 7.5271f)
                curveTo(10.3732f, 7.3998f, 10.6219f, 7.2265f, 10.9719f, 6.9827f)
                lineTo(11.2241f, 6.8071f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5303f, 8.47f)
                curveTo(14.2374f, 8.1771f, 13.7625f, 8.1771f, 13.4696f, 8.47f)
                curveTo(13.1768f, 8.7629f, 13.1768f, 9.2378f, 13.4696f, 9.5307f)
                lineTo(15.9393f, 12.0003f)
                lineTo(13.4697f, 14.47f)
                curveTo(13.1768f, 14.7629f, 13.1768f, 15.2378f, 13.4697f, 15.5307f)
                curveTo(13.7626f, 15.8236f, 14.2374f, 15.8236f, 14.5303f, 15.5307f)
                lineTo(17.0f, 13.061f)
                lineTo(19.4696f, 15.5306f)
                curveTo(19.7625f, 15.8235f, 20.2374f, 15.8235f, 20.5303f, 15.5306f)
                curveTo(20.8232f, 15.2377f, 20.8232f, 14.7629f, 20.5303f, 14.47f)
                lineTo(18.0606f, 12.0003f)
                lineTo(20.5303f, 9.5307f)
                curveTo(20.8232f, 9.2378f, 20.8232f, 8.7629f, 20.5303f, 8.47f)
                curveTo(20.2374f, 8.1771f, 19.7625f, 8.1771f, 19.4696f, 8.47f)
                lineTo(17.0f, 10.9397f)
                lineTo(14.5303f, 8.47f)
                close()
            }
        }
            .build()
        return _muted!!
    }

private var _muted: ImageVector? = null
