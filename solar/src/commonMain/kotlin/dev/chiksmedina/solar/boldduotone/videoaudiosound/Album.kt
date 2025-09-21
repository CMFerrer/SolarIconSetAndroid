package dev.chiksmedina.solar.boldduotone.videoaudiosound

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
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(
            name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2905f, 11.9684f)
                curveTo(17.2905f, 12.7071f, 16.6984f, 13.3059f, 15.9679f, 13.3059f)
                curveTo(15.2374f, 13.3059f, 14.6453f, 12.7071f, 14.6453f, 11.9684f)
                curveTo(14.6453f, 11.2297f, 15.2374f, 10.6309f, 15.9679f, 10.6309f)
                curveTo(16.6984f, 10.6309f, 17.2905f, 11.2297f, 17.2905f, 11.9684f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.1316f, 7.4077f)
                curveTo(17.2832f, 7.2871f, 16.1897f, 7.2871f, 14.8267f, 7.2871f)
                horizontalLineTo(9.1733f)
                curveTo(7.8103f, 7.2871f, 6.7168f, 7.2871f, 5.8684f, 7.4077f)
                curveTo(4.9906f, 7.5326f, 4.2596f, 7.8005f, 3.716f, 8.4283f)
                curveTo(3.1725f, 9.0561f, 3.0066f, 9.8243f, 3.0002f, 10.7206f)
                curveTo(2.994f, 11.587f, 3.1386f, 12.6831f, 3.3187f, 14.0493f)
                lineTo(3.6842f, 16.8211f)
                curveTo(3.825f, 17.8892f, 3.939f, 18.7537f, 4.1162f, 19.4306f)
                curveTo(4.3006f, 20.1352f, 4.5729f, 20.7194f, 5.0838f, 21.1718f)
                curveTo(5.5948f, 21.6241f, 6.2034f, 21.8199f, 6.9184f, 21.9116f)
                curveTo(7.6053f, 21.9998f, 8.4678f, 21.9998f, 9.5333f, 21.9998f)
                horizontalLineTo(14.4667f)
                curveTo(15.5322f, 21.9998f, 16.3947f, 21.9998f, 17.0816f, 21.9116f)
                curveTo(17.7966f, 21.8199f, 18.4052f, 21.6241f, 18.9162f, 21.1718f)
                curveTo(19.4271f, 20.7194f, 19.6994f, 20.1352f, 19.8838f, 19.4306f)
                curveTo(20.061f, 18.7537f, 20.175f, 17.8892f, 20.3158f, 16.8211f)
                lineTo(20.6813f, 14.0493f)
                curveTo(20.8614f, 12.6831f, 21.006f, 11.587f, 20.9998f, 10.7206f)
                curveTo(20.9934f, 9.8243f, 20.8275f, 9.0561f, 20.284f, 8.4283f)
                curveTo(19.7404f, 7.8005f, 19.0094f, 7.5326f, 18.1316f, 7.4077f)
                close()
                moveTo(6.0526f, 8.7322f)
                curveTo(5.3257f, 8.8356f, 4.958f, 9.0242f, 4.7112f, 9.3093f)
                curveTo(4.4643f, 9.5944f, 4.3281f, 9.9879f, 4.3228f, 10.7302f)
                curveTo(4.3174f, 11.4915f, 4.448f, 12.4942f, 4.6366f, 13.9246f)
                lineTo(4.6866f, 14.3039f)
                lineTo(5.0582f, 14.0318f)
                curveTo(6.0171f, 13.3295f, 7.4339f, 13.364f, 8.3458f, 14.1273f)
                lineTo(11.7301f, 16.9601f)
                curveTo(12.0499f, 17.2278f, 12.6011f, 17.2778f, 12.9989f, 17.0438f)
                lineTo(13.2341f, 16.9054f)
                curveTo(14.3594f, 16.2435f, 15.8676f, 16.3133f, 16.9059f, 17.0955f)
                lineTo(18.7378f, 18.4755f)
                curveTo(18.8281f, 17.9799f, 18.909f, 17.3707f, 19.0107f, 16.5996f)
                lineTo(19.3634f, 13.9246f)
                curveTo(19.552f, 12.4942f, 19.6826f, 11.4915f, 19.6772f, 10.7302f)
                curveTo(19.6719f, 9.9879f, 19.5357f, 9.5944f, 19.2888f, 9.3093f)
                curveTo(19.042f, 9.0242f, 18.6743f, 8.8356f, 17.9474f, 8.7322f)
                curveTo(17.2019f, 8.6262f, 16.2018f, 8.6246f, 14.7748f, 8.6246f)
                horizontalLineTo(9.2252f)
                curveTo(7.7982f, 8.6246f, 6.7981f, 8.6262f, 6.0526f, 8.7322f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.8796f, 4.5f)
                curveTo(5.628f, 4.5f, 4.6018f, 5.3397f, 4.2593f, 6.4538f)
                curveTo(4.2522f, 6.477f, 4.2453f, 6.5003f, 4.2388f, 6.5238f)
                curveTo(4.5971f, 6.4032f, 4.97f, 6.3245f, 5.3475f, 6.2707f)
                curveTo(6.3199f, 6.1322f, 7.5487f, 6.1322f, 8.9761f, 6.1323f)
                lineTo(9.0827f, 6.1323f)
                lineTo(15.179f, 6.1323f)
                curveTo(16.6064f, 6.1322f, 17.8352f, 6.1322f, 18.8076f, 6.2707f)
                curveTo(19.1851f, 6.3245f, 19.558f, 6.4032f, 19.9164f, 6.5238f)
                curveTo(19.9098f, 6.5003f, 19.903f, 6.477f, 19.8958f, 6.4538f)
                curveTo(19.5534f, 5.3397f, 18.5271f, 4.5f, 17.2756f, 4.5f)
                horizontalLineTo(6.8796f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.859f, 2.0f)
                horizontalLineTo(15.1411f)
                curveTo(15.3503f, 2.0f, 15.5107f, 1.9999f, 15.651f, 2.0152f)
                curveTo(16.648f, 2.1235f, 17.4641f, 2.7896f, 17.8101f, 3.6868f)
                horizontalLineTo(6.1899f)
                curveTo(6.536f, 2.7896f, 7.3521f, 2.1235f, 8.3491f, 2.0152f)
                curveTo(8.4894f, 1.9999f, 8.6498f, 2.0f, 8.859f, 2.0f)
                close()
            }
        }
            .build()
        return _album!!
    }

private var _album: ImageVector? = null
