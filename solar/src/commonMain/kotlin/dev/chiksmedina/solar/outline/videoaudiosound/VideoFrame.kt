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

val VideoAudioSoundGroup.VideoFrame: ImageVector
    get() {
        if (_videoFrame != null) {
            return _videoFrame!!
        }
        _videoFrame = Builder(
            name = "VideoFrame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                verticalLineTo(11.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(2.82f)
                curveTo(15.1242f, 2.7508f, 13.7418f, 2.75f, 12.0f, 2.75f)
                curveTo(10.2582f, 2.75f, 8.8758f, 2.7508f, 7.75f, 2.82f)
                close()
                moveTo(17.75f, 2.9818f)
                verticalLineTo(6.25f)
                horizontalLineTo(21.0182f)
                curveTo(20.8349f, 5.1852f, 20.5187f, 4.5083f, 20.0052f, 3.9948f)
                curveTo(19.4917f, 3.4813f, 18.8148f, 3.1651f, 17.75f, 2.9818f)
                close()
                moveTo(21.18f, 7.75f)
                horizontalLineTo(17.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.2497f)
                curveTo(21.2483f, 9.8547f, 21.2389f, 8.7092f, 21.18f, 7.75f)
                close()
                moveTo(21.2497f, 12.75f)
                horizontalLineTo(17.75f)
                verticalLineTo(16.25f)
                horizontalLineTo(21.18f)
                curveTo(21.2389f, 15.2908f, 21.2483f, 14.1453f, 21.2497f, 12.75f)
                close()
                moveTo(21.0182f, 17.75f)
                horizontalLineTo(17.75f)
                verticalLineTo(21.0182f)
                curveTo(18.8148f, 20.8349f, 19.4917f, 20.5187f, 20.0052f, 20.0052f)
                curveTo(20.5187f, 19.4917f, 20.8349f, 18.8148f, 21.0182f, 17.75f)
                close()
                moveTo(16.25f, 21.18f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.75f)
                verticalLineTo(21.18f)
                curveTo(8.8758f, 21.2491f, 10.2582f, 21.25f, 12.0f, 21.25f)
                curveTo(13.7418f, 21.25f, 15.1242f, 21.2491f, 16.25f, 21.18f)
                close()
                moveTo(6.25f, 21.0182f)
                verticalLineTo(17.75f)
                horizontalLineTo(2.9818f)
                curveTo(3.1651f, 18.8148f, 3.4813f, 19.4917f, 3.9948f, 20.0052f)
                curveTo(4.5083f, 20.5187f, 5.1852f, 20.8349f, 6.25f, 21.0182f)
                close()
                moveTo(2.82f, 16.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(2.7503f)
                curveTo(2.7517f, 14.1453f, 2.7611f, 15.2908f, 2.82f, 16.25f)
                close()
                moveTo(2.7503f, 11.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(7.75f)
                horizontalLineTo(2.82f)
                curveTo(2.7611f, 8.7092f, 2.7517f, 9.8547f, 2.7503f, 11.25f)
                close()
            }
        }
            .build()
        return _videoFrame!!
    }

private var _videoFrame: ImageVector? = null
