package dev.chiksmedina.solar.bold.videoaudiosound

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
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeSmall: ImageVector
    get() {
        if (_volumeSmall != null) {
            return _volumeSmall!!
        }
        _volumeSmall = Builder(
            name = "VolumeSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0031f, 11.7155f)
                curveTo(3.0421f, 9.8733f, 3.0616f, 8.9522f, 3.7004f, 8.1636f)
                curveTo(3.817f, 8.0197f, 3.9881f, 7.8487f, 4.1315f, 7.7327f)
                curveTo(4.9172f, 7.0974f, 5.9544f, 7.0974f, 8.029f, 7.0974f)
                curveTo(8.7702f, 7.0974f, 9.1407f, 7.0974f, 9.494f, 7.0045f)
                curveTo(9.5674f, 6.9852f, 9.64f, 6.963f, 9.7117f, 6.9378f)
                curveTo(10.0567f, 6.8167f, 10.3661f, 6.6084f, 10.985f, 6.1916f)
                curveTo(13.4265f, 4.5474f, 14.6473f, 3.7253f, 15.672f, 4.0824f)
                curveTo(15.8684f, 4.1509f, 16.0586f, 4.2497f, 16.2284f, 4.3716f)
                curveTo(17.1142f, 5.0074f, 17.1815f, 6.4868f, 17.3161f, 9.4454f)
                curveTo(17.3659f, 10.5409f, 17.3999f, 11.4785f, 17.3999f, 12.0f)
                curveTo(17.3999f, 12.5215f, 17.3659f, 13.4591f, 17.3161f, 14.5546f)
                curveTo(17.1815f, 17.5132f, 17.1142f, 18.9926f, 16.2284f, 19.6284f)
                curveTo(16.0586f, 19.7503f, 15.8684f, 19.8491f, 15.672f, 19.9176f)
                curveTo(14.6473f, 20.2747f, 13.4265f, 19.4526f, 10.985f, 17.8084f)
                curveTo(10.3661f, 17.3916f, 10.0567f, 17.1833f, 9.7117f, 17.0622f)
                curveTo(9.64f, 17.037f, 9.5674f, 17.0148f, 9.494f, 16.9955f)
                curveTo(9.1407f, 16.9026f, 8.7702f, 16.9026f, 8.029f, 16.9026f)
                curveTo(5.9544f, 16.9026f, 4.9172f, 16.9026f, 4.1315f, 16.2673f)
                curveTo(3.9881f, 16.1513f, 3.817f, 15.9803f, 3.7004f, 15.8364f)
                curveTo(3.0616f, 15.0478f, 3.0421f, 14.1267f, 3.0031f, 12.2845f)
                curveTo(3.0011f, 12.1878f, 3.0f, 12.0928f, 3.0f, 12.0f)
                curveTo(3.0f, 11.9072f, 3.0011f, 11.8122f, 3.0031f, 11.7155f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.4503f, 8.4159f)
                curveTo(19.7979f, 8.2187f, 20.2363f, 8.3466f, 20.4294f, 8.7017f)
                lineTo(19.8f, 9.0588f)
                curveTo(20.4294f, 8.7017f, 20.4294f, 8.7017f, 20.4294f, 8.7017f)
                lineTo(20.4301f, 8.7029f)
                lineTo(20.4308f, 8.7043f)
                lineTo(20.4324f, 8.7073f)
                lineTo(20.4361f, 8.7143f)
                lineTo(20.4454f, 8.7323f)
                curveTo(20.4523f, 8.7461f, 20.4609f, 8.7635f, 20.4707f, 8.7846f)
                curveTo(20.4904f, 8.8268f, 20.5153f, 8.8836f, 20.5435f, 8.9557f)
                curveTo(20.6f, 9.1f, 20.6697f, 9.3049f, 20.7374f, 9.5748f)
                curveTo(20.8731f, 10.115f, 21.0f, 10.9119f, 21.0f, 12.0003f)
                curveTo(21.0f, 13.0888f, 20.8731f, 13.8857f, 20.7374f, 14.4259f)
                curveTo(20.6697f, 14.6958f, 20.6f, 14.9007f, 20.5435f, 15.045f)
                curveTo(20.5153f, 15.1171f, 20.4904f, 15.1739f, 20.4707f, 15.2161f)
                curveTo(20.4609f, 15.2372f, 20.4523f, 15.2546f, 20.4454f, 15.2684f)
                lineTo(20.4361f, 15.2864f)
                lineTo(20.4324f, 15.2934f)
                lineTo(20.4308f, 15.2964f)
                lineTo(20.4301f, 15.2978f)
                curveTo(20.4301f, 15.2978f, 20.4294f, 15.299f, 19.8f, 14.9419f)
                lineTo(20.4294f, 15.299f)
                curveTo(20.2363f, 15.6541f, 19.7979f, 15.782f, 19.4503f, 15.5847f)
                curveTo(19.1057f, 15.3892f, 18.9797f, 14.9474f, 19.1658f, 14.5938f)
                lineTo(19.1706f, 14.5838f)
                curveTo(19.1772f, 14.5697f, 19.1898f, 14.5415f, 19.2065f, 14.4987f)
                curveTo(19.24f, 14.4132f, 19.2903f, 14.2688f, 19.3426f, 14.0606f)
                curveTo(19.447f, 13.6448f, 19.56f, 12.9709f, 19.56f, 12.0003f)
                curveTo(19.56f, 11.0298f, 19.447f, 10.3559f, 19.3426f, 9.9401f)
                curveTo(19.2903f, 9.7319f, 19.24f, 9.5875f, 19.2065f, 9.502f)
                curveTo(19.1898f, 9.4592f, 19.1772f, 9.431f, 19.1706f, 9.4169f)
                lineTo(19.1658f, 9.4069f)
                curveTo(18.9797f, 9.0533f, 19.1057f, 8.6115f, 19.4503f, 8.4159f)
                close()
            }
        }
            .build()
        return _volumeSmall!!
    }

private var _volumeSmall: ImageVector? = null
