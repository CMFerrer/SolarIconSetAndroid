package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2905f, 11.9687f)
                curveTo(17.2905f, 12.7073f, 16.6984f, 13.3062f, 15.9679f, 13.3062f)
                curveTo(15.2374f, 13.3062f, 14.6453f, 12.7073f, 14.6453f, 11.9687f)
                curveTo(14.6453f, 11.23f, 15.2374f, 10.6311f, 15.9679f, 10.6311f)
                curveTo(16.6984f, 10.6311f, 17.2905f, 11.23f, 17.2905f, 11.9687f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.1316f, 7.408f)
                curveTo(17.2832f, 7.2873f, 16.1897f, 7.2873f, 14.8267f, 7.2874f)
                horizontalLineTo(9.1733f)
                curveTo(7.8103f, 7.2873f, 6.7168f, 7.2873f, 5.8684f, 7.408f)
                curveTo(4.9906f, 7.5328f, 4.2596f, 7.8007f, 3.716f, 8.4285f)
                curveTo(3.1725f, 9.0563f, 3.0066f, 9.8245f, 3.0002f, 10.7209f)
                curveTo(2.994f, 11.5872f, 3.1386f, 12.6834f, 3.3187f, 14.0496f)
                lineTo(3.6842f, 16.8214f)
                curveTo(3.825f, 17.8895f, 3.939f, 18.7539f, 4.1162f, 19.4309f)
                curveTo(4.3006f, 20.1355f, 4.5729f, 20.7197f, 5.0838f, 21.172f)
                curveTo(5.5948f, 21.6244f, 6.2034f, 21.8201f, 6.9184f, 21.9119f)
                curveTo(7.6053f, 22.0f, 8.4678f, 22.0f, 9.5333f, 22.0f)
                horizontalLineTo(14.4667f)
                curveTo(15.5322f, 22.0f, 16.3947f, 22.0f, 17.0816f, 21.9119f)
                curveTo(17.7966f, 21.8201f, 18.4052f, 21.6244f, 18.9162f, 21.172f)
                curveTo(19.4271f, 20.7197f, 19.6994f, 20.1355f, 19.8838f, 19.4309f)
                curveTo(20.061f, 18.7539f, 20.175f, 17.8894f, 20.3158f, 16.8213f)
                lineTo(20.6813f, 14.0496f)
                curveTo(20.8614f, 12.6834f, 21.006f, 11.5872f, 20.9998f, 10.7209f)
                curveTo(20.9934f, 9.8245f, 20.8275f, 9.0563f, 20.284f, 8.4285f)
                curveTo(19.7404f, 7.8007f, 19.0094f, 7.5328f, 18.1316f, 7.408f)
                close()
                moveTo(6.0526f, 8.7325f)
                curveTo(5.3257f, 8.8358f, 4.958f, 9.0244f, 4.7112f, 9.3096f)
                curveTo(4.4643f, 9.5947f, 4.3281f, 9.9882f, 4.3228f, 10.7305f)
                curveTo(4.3174f, 11.4918f, 4.448f, 12.4945f, 4.6366f, 13.9249f)
                lineTo(4.6866f, 14.3042f)
                lineTo(5.0582f, 14.032f)
                curveTo(6.0171f, 13.3297f, 7.4339f, 13.3643f, 8.3458f, 14.1275f)
                lineTo(11.7301f, 16.9603f)
                curveTo(12.0499f, 17.228f, 12.6011f, 17.2781f, 12.9989f, 17.0441f)
                lineTo(13.2341f, 16.9057f)
                curveTo(14.3594f, 16.2437f, 15.8676f, 16.3135f, 16.9059f, 17.0958f)
                lineTo(18.7378f, 18.4758f)
                curveTo(18.8281f, 17.9802f, 18.909f, 17.3709f, 19.0107f, 16.5999f)
                lineTo(19.3634f, 13.9249f)
                curveTo(19.552f, 12.4945f, 19.6826f, 11.4918f, 19.6772f, 10.7305f)
                curveTo(19.6719f, 9.9882f, 19.5357f, 9.5947f, 19.2888f, 9.3096f)
                curveTo(19.042f, 9.0244f, 18.6743f, 8.8358f, 17.9474f, 8.7325f)
                curveTo(17.2019f, 8.6264f, 16.2018f, 8.6249f, 14.7748f, 8.6249f)
                horizontalLineTo(9.2252f)
                curveTo(7.7982f, 8.6249f, 6.7981f, 8.6264f, 6.0526f, 8.7325f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8589f, 2.0f)
                horizontalLineTo(15.141f)
                curveTo(15.3502f, 2.0f, 15.5106f, 1.9999f, 15.6508f, 2.0152f)
                curveTo(16.6479f, 2.1235f, 17.4639f, 2.7896f, 17.81f, 3.6868f)
                horizontalLineTo(6.1898f)
                curveTo(6.5359f, 2.7896f, 7.352f, 2.1235f, 8.349f, 2.0152f)
                curveTo(8.4892f, 1.9999f, 8.6496f, 2.0f, 8.8589f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8794f, 4.5f)
                curveTo(5.6279f, 4.5f, 4.6016f, 5.3397f, 4.2592f, 6.4538f)
                curveTo(4.252f, 6.477f, 4.2452f, 6.5003f, 4.2386f, 6.5238f)
                curveTo(4.597f, 6.4032f, 4.9699f, 6.3245f, 5.3474f, 6.2707f)
                curveTo(6.3197f, 6.1322f, 7.5486f, 6.1322f, 8.976f, 6.1323f)
                lineTo(9.0826f, 6.1323f)
                lineTo(15.1789f, 6.1323f)
                curveTo(16.6063f, 6.1322f, 17.8351f, 6.1322f, 18.8074f, 6.2707f)
                curveTo(19.185f, 6.3245f, 19.5579f, 6.4032f, 19.9162f, 6.5238f)
                curveTo(19.9097f, 6.5003f, 19.9028f, 6.477f, 19.8957f, 6.4538f)
                curveTo(19.5532f, 5.3397f, 18.527f, 4.5f, 17.2754f, 4.5f)
                horizontalLineTo(6.8794f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
