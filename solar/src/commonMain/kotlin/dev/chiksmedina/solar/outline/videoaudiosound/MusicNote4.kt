package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNote4: ImageVector
    get() {
        if (_musicNote4 != null) {
            return _musicNote4!!
        }
        _musicNote4 = Builder(
            name = "MusicNote4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.1753f, 4.8107f)
                curveTo(18.9778f, 4.2655f, 18.4312f, 3.9277f, 17.8552f, 3.9949f)
                curveTo(17.7921f, 4.0022f, 17.6774f, 4.0312f, 17.4371f, 4.1359f)
                curveTo(17.1988f, 4.2398f, 16.8938f, 4.392f, 16.4521f, 4.6129f)
                lineTo(13.8187f, 5.9296f)
                curveTo(13.4266f, 6.1256f, 13.3215f, 6.1818f, 13.2408f, 6.2435f)
                curveTo(12.9968f, 6.43f, 12.83f, 6.6998f, 12.7723f, 7.0015f)
                curveTo(12.7532f, 7.1012f, 12.75f, 7.2204f, 12.75f, 7.6588f)
                curveTo(12.75f, 8.1525f, 12.7502f, 8.4934f, 12.7639f, 8.7531f)
                curveTo(12.7777f, 9.0148f, 12.8031f, 9.1303f, 12.8247f, 9.19f)
                curveTo(13.0222f, 9.7353f, 13.5688f, 10.0731f, 14.1448f, 10.0059f)
                curveTo(14.2079f, 9.9985f, 14.3226f, 9.9696f, 14.5629f, 9.8649f)
                curveTo(14.8012f, 9.761f, 15.1062f, 9.6088f, 15.5479f, 9.3879f)
                lineTo(18.1813f, 8.0712f)
                curveTo(18.5734f, 7.8752f, 18.6785f, 7.819f, 18.7592f, 7.7573f)
                curveTo(19.0032f, 7.5708f, 19.17f, 7.301f, 19.2277f, 6.9993f)
                curveTo(19.2468f, 6.8996f, 19.25f, 6.7804f, 19.25f, 6.342f)
                curveTo(19.25f, 5.8482f, 19.2498f, 5.5074f, 19.2361f, 5.2477f)
                curveTo(19.2223f, 4.986f, 19.1969f, 4.8705f, 19.1753f, 4.8107f)
                close()
                moveTo(17.6814f, 2.505f)
                curveTo(18.9486f, 2.3572f, 20.1511f, 3.1003f, 20.5856f, 4.2999f)
                curveTo(20.6835f, 4.5702f, 20.7179f, 4.8625f, 20.734f, 5.1689f)
                curveTo(20.75f, 5.4727f, 20.75f, 5.8533f, 20.75f, 6.321f)
                verticalLineTo(6.342f)
                curveTo(20.75f, 6.3629f, 20.75f, 6.3834f, 20.75f, 6.4037f)
                curveTo(20.7502f, 6.7515f, 20.7503f, 7.0235f, 20.701f, 7.2813f)
                curveTo(20.5739f, 7.9449f, 20.2071f, 8.5385f, 19.6703f, 8.9489f)
                curveTo(19.4618f, 9.1084f, 19.2184f, 9.2299f, 18.9073f, 9.3853f)
                curveTo(18.8892f, 9.3944f, 18.8708f, 9.4035f, 18.8521f, 9.4129f)
                lineTo(16.1999f, 10.739f)
                curveTo(15.7816f, 10.9481f, 15.4412f, 11.1183f, 15.1622f, 11.2399f)
                curveTo(14.881f, 11.3625f, 14.6042f, 11.4625f, 14.3186f, 11.4958f)
                curveTo(13.7636f, 11.5605f, 13.2211f, 11.4544f, 12.75f, 11.2138f)
                verticalLineTo(18.0004f)
                curveTo(12.75f, 20.6237f, 10.6234f, 22.7504f, 8.0f, 22.7504f)
                curveTo(5.3766f, 22.7504f, 3.25f, 20.6237f, 3.25f, 18.0004f)
                curveTo(3.25f, 15.377f, 5.3766f, 13.2504f, 8.0f, 13.2504f)
                curveTo(9.2572f, 13.2504f, 10.4003f, 13.7388f, 11.25f, 14.5363f)
                verticalLineTo(8.0004f)
                curveTo(11.2498f, 7.8984f, 11.25f, 7.7916f, 11.25f, 7.6798f)
                verticalLineTo(7.6588f)
                curveTo(11.25f, 7.6379f, 11.25f, 7.6174f, 11.25f, 7.5971f)
                curveTo(11.2498f, 7.2493f, 11.2497f, 6.9773f, 11.299f, 6.7195f)
                curveTo(11.4261f, 6.0559f, 11.7929f, 5.4622f, 12.3297f, 5.0518f)
                curveTo(12.5382f, 4.8924f, 12.7816f, 4.7709f, 13.0927f, 4.6155f)
                curveTo(13.1108f, 4.6064f, 13.1292f, 4.5972f, 13.1479f, 4.5879f)
                lineTo(15.8001f, 3.2618f)
                curveTo(16.2184f, 3.0526f, 16.5588f, 2.8824f, 16.8378f, 2.7609f)
                curveTo(17.119f, 2.6383f, 17.3958f, 2.5383f, 17.6814f, 2.505f)
                close()
                moveTo(11.25f, 18.0004f)
                curveTo(11.25f, 16.2055f, 9.7949f, 14.7504f, 8.0f, 14.7504f)
                curveTo(6.2051f, 14.7504f, 4.75f, 16.2055f, 4.75f, 18.0004f)
                curveTo(4.75f, 19.7953f, 6.2051f, 21.2504f, 8.0f, 21.2504f)
                curveTo(9.7949f, 21.2504f, 11.25f, 19.7953f, 11.25f, 18.0004f)
                close()
            }
        }
            .build()
        return _musicNote4!!
    }

private var _musicNote4: ImageVector? = null
