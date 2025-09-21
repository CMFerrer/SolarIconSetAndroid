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

val VideoAudioSoundGroup.VideoFramePlayHorizontal: ImageVector
    get() {
        if (_videoFramePlayHorizontal != null) {
            return _videoFramePlayHorizontal!!
        }
        _videoFramePlayHorizontal = Builder(
            name = "VideoFramePlayHorizontal", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.25f, 2.9818f)
                curveTo(5.1852f, 3.1651f, 4.5083f, 3.4813f, 3.9948f, 3.9948f)
                curveTo(3.4813f, 4.5083f, 3.1651f, 5.1852f, 2.9818f, 6.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(2.9818f)
                close()
                moveTo(7.75f, 2.82f)
                verticalLineTo(6.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.7503f)
                curveTo(9.8547f, 2.7517f, 8.7092f, 2.7611f, 7.75f, 2.82f)
                close()
                moveTo(12.75f, 2.7503f)
                verticalLineTo(6.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(2.82f)
                curveTo(15.2908f, 2.7611f, 14.1453f, 2.7517f, 12.75f, 2.7503f)
                close()
                moveTo(17.75f, 2.9818f)
                verticalLineTo(6.25f)
                horizontalLineTo(21.0182f)
                curveTo(20.8349f, 5.1852f, 20.5187f, 4.5083f, 20.0052f, 3.9948f)
                curveTo(19.4917f, 3.4813f, 18.8148f, 3.1651f, 17.75f, 2.9818f)
                close()
                moveTo(21.18f, 7.75f)
                horizontalLineTo(17.0006f)
                curveTo(17.0004f, 7.75f, 17.0008f, 7.75f, 17.0006f, 7.75f)
                curveTo(17.0004f, 7.75f, 16.9996f, 7.75f, 16.9994f, 7.75f)
                lineTo(12.0009f, 7.75f)
                curveTo(12.0006f, 7.75f, 12.0011f, 7.75f, 12.0009f, 7.75f)
                curveTo(12.0006f, 7.75f, 11.9994f, 7.75f, 11.9991f, 7.75f)
                lineTo(7.0011f, 7.75f)
                curveTo(7.0007f, 7.75f, 7.0003f, 7.75f, 7.0f, 7.75f)
                curveTo(6.9997f, 7.75f, 6.9993f, 7.75f, 6.9989f, 7.75f)
                horizontalLineTo(2.82f)
                curveTo(2.7508f, 8.8758f, 2.75f, 10.2582f, 2.75f, 12.0f)
                curveTo(2.75f, 13.7418f, 2.7508f, 15.1242f, 2.82f, 16.25f)
                lineTo(21.18f, 16.25f)
                curveTo(21.2491f, 15.1242f, 21.25f, 13.7418f, 21.25f, 12.0f)
                curveTo(21.25f, 10.2582f, 21.2491f, 8.8758f, 21.18f, 7.75f)
                close()
                moveTo(21.0182f, 17.75f)
                horizontalLineTo(17.75f)
                verticalLineTo(21.0182f)
                curveTo(18.8148f, 20.8349f, 19.4917f, 20.5187f, 20.0052f, 20.0052f)
                curveTo(20.5187f, 19.4917f, 20.8349f, 18.8148f, 21.0182f, 17.75f)
                close()
                moveTo(16.25f, 21.18f)
                verticalLineTo(17.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.2497f)
                curveTo(14.1453f, 21.2483f, 15.2908f, 21.2389f, 16.25f, 21.18f)
                close()
                moveTo(11.25f, 21.2497f)
                verticalLineTo(17.75f)
                horizontalLineTo(7.75f)
                lineTo(7.75f, 21.18f)
                curveTo(8.7092f, 21.2389f, 9.8547f, 21.2483f, 11.25f, 21.2497f)
                close()
                moveTo(6.25f, 21.0182f)
                lineTo(6.25f, 17.75f)
                horizontalLineTo(2.9818f)
                curveTo(3.1651f, 18.8148f, 3.4813f, 19.4917f, 3.9948f, 20.0052f)
                curveTo(4.5083f, 20.5187f, 5.1852f, 20.8349f, 6.25f, 21.0182f)
                close()
                moveTo(12.7793f, 9.7481f)
                curveTo(12.796f, 9.7593f, 12.8127f, 9.7706f, 12.8295f, 9.7819f)
                curveTo(12.845f, 9.7923f, 12.8605f, 9.8027f, 12.8759f, 9.813f)
                curveTo(13.3656f, 10.1421f, 13.8034f, 10.4362f, 14.111f, 10.7196f)
                curveTo(14.445f, 11.0273f, 14.75f, 11.4337f, 14.75f, 12.0f)
                curveTo(14.75f, 12.5663f, 14.445f, 12.9727f, 14.111f, 13.2804f)
                curveTo(13.8034f, 13.5638f, 13.3656f, 13.8579f, 12.8759f, 14.187f)
                lineTo(12.8295f, 14.2181f)
                curveTo(12.8128f, 14.2294f, 12.796f, 14.2407f, 12.7794f, 14.2519f)
                curveTo(12.2858f, 14.5836f, 11.8415f, 14.8824f, 11.4681f, 15.0551f)
                curveTo(11.0758f, 15.2365f, 10.5194f, 15.3914f, 9.9864f, 15.0386f)
                curveTo(9.4967f, 14.7146f, 9.3616f, 14.1731f, 9.3061f, 13.7395f)
                curveTo(9.2499f, 13.3004f, 9.25f, 12.7235f, 9.25f, 12.0514f)
                verticalLineTo(11.9486f)
                curveTo(9.25f, 11.2765f, 9.2499f, 10.6996f, 9.3061f, 10.2605f)
                curveTo(9.3616f, 9.8269f, 9.4967f, 9.2854f, 9.9864f, 8.9614f)
                curveTo(10.5194f, 8.6086f, 11.0758f, 8.7635f, 11.4681f, 8.9449f)
                curveTo(11.8414f, 9.1176f, 12.2858f, 9.4164f, 12.7793f, 9.7481f)
                close()
                moveTo(10.8193f, 10.2977f)
                curveTo(10.8255f, 10.3004f, 10.8318f, 10.3033f, 10.8384f, 10.3063f)
                curveTo(11.0893f, 10.4224f, 11.4327f, 10.6504f, 11.9928f, 11.0268f)
                curveTo(12.5436f, 11.397f, 12.8823f, 11.6272f, 13.0946f, 11.8228f)
                curveTo(13.1937f, 11.9141f, 13.232f, 11.9688f, 13.2457f, 11.9934f)
                curveTo(13.2472f, 11.9961f, 13.2483f, 11.9983f, 13.2491f, 12.0f)
                curveTo(13.2483f, 12.0017f, 13.2472f, 12.0039f, 13.2457f, 12.0066f)
                curveTo(13.232f, 12.0312f, 13.1937f, 12.0859f, 13.0946f, 12.1772f)
                curveTo(12.8823f, 12.3728f, 12.5436f, 12.603f, 11.9928f, 12.9732f)
                curveTo(11.4327f, 13.3496f, 11.0893f, 13.5776f, 10.8384f, 13.6937f)
                curveTo(10.8318f, 13.6967f, 10.8255f, 13.6996f, 10.8193f, 13.7023f)
                curveTo(10.8109f, 13.663f, 10.8021f, 13.6127f, 10.794f, 13.5491f)
                curveTo(10.7515f, 13.2171f, 10.75f, 12.738f, 10.75f, 12.0f)
                curveTo(10.75f, 11.262f, 10.7515f, 10.7829f, 10.794f, 10.4509f)
                curveTo(10.8021f, 10.3873f, 10.8109f, 10.337f, 10.8193f, 10.2977f)
                close()
            }
        }
            .build()
        return _videoFramePlayHorizontal!!
    }

private var _videoFramePlayHorizontal: ImageVector? = null
