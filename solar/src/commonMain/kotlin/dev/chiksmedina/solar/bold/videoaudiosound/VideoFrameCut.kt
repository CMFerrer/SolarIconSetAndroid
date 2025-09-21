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

val VideoAudioSoundGroup.VideoFrameCut: ImageVector
    get() {
        if (_videoFrameCut != null) {
            return _videoFrameCut!!
        }
        _videoFrameCut = Builder(
            name = "VideoFrameCut", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(3.0029f)
                horizontalLineTo(9.4999f)
                curveTo(8.8516f, 3.0077f, 8.2714f, 3.019f, 7.75f, 3.0462f)
                verticalLineTo(20.9529f)
                curveTo(8.2714f, 20.9801f, 8.8516f, 20.9914f, 9.4999f, 20.9962f)
                horizontalLineTo(11.25f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.9962f)
                horizontalLineTo(14.5f)
                curveTo(15.1483f, 20.9914f, 15.7286f, 20.9801f, 16.25f, 20.9529f)
                verticalLineTo(3.0462f)
                curveTo(15.7286f, 3.019f, 15.1483f, 3.0077f, 14.5f, 3.0029f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.0f)
                close()
                moveTo(12.75f, 20.9962f)
                verticalLineTo(20.3333f)
                curveTo(12.75f, 19.9191f, 12.4142f, 19.5833f, 12.0f, 19.5833f)
                curveTo(11.5858f, 19.5833f, 11.25f, 19.9191f, 11.25f, 20.3333f)
                verticalLineTo(20.9962f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 3.0029f)
                verticalLineTo(3.6667f)
                curveTo(12.75f, 4.0809f, 12.4142f, 4.4167f, 12.0f, 4.4167f)
                curveTo(11.5858f, 4.4167f, 11.25f, 4.0809f, 11.25f, 3.6667f)
                verticalLineTo(3.0029f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 7.0f)
                curveTo(12.75f, 6.5858f, 12.4142f, 6.25f, 12.0f, 6.25f)
                curveTo(11.5858f, 6.25f, 11.25f, 6.5858f, 11.25f, 7.0f)
                verticalLineTo(10.3333f)
                curveTo(11.25f, 10.7475f, 11.5858f, 11.0833f, 12.0f, 11.0833f)
                curveTo(12.4142f, 11.0833f, 12.75f, 10.7475f, 12.75f, 10.3333f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.75f, 13.6667f)
                curveTo(12.75f, 13.2525f, 12.4142f, 12.9167f, 12.0f, 12.9167f)
                curveTo(11.5858f, 12.9167f, 11.25f, 13.2525f, 11.25f, 13.6667f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 11.5858f, 17.75f, 12.0f, 17.75f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                verticalLineTo(13.6667f)
                close()
                moveTo(6.25f, 3.2022f)
                curveTo(5.3493f, 3.3632f, 4.6904f, 3.6523f, 4.1716f, 4.1711f)
                curveTo(3.3999f, 4.9427f, 3.1365f, 6.0241f, 3.0466f, 7.75f)
                horizontalLineTo(6.25f)
                verticalLineTo(3.2022f)
                close()
                moveTo(3.0056f, 9.25f)
                curveTo(3.0f, 9.7835f, 3.0f, 10.3648f, 3.0f, 10.9995f)
                verticalLineTo(12.9995f)
                curveTo(3.0f, 13.6346f, 3.0f, 14.2163f, 3.0056f, 14.75f)
                horizontalLineTo(6.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(3.0056f)
                close()
                moveTo(4.1716f, 19.828f)
                curveTo(3.4001f, 19.0565f, 3.1366f, 17.9753f, 3.0466f, 16.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(20.7969f)
                curveTo(5.3493f, 20.6359f, 4.6904f, 20.3468f, 4.1716f, 19.828f)
                close()
                moveTo(17.75f, 7.75f)
                verticalLineTo(3.2022f)
                curveTo(18.6507f, 3.3632f, 19.3096f, 3.6523f, 19.8284f, 4.1711f)
                curveTo(20.6001f, 4.9427f, 20.8635f, 6.0241f, 20.9534f, 7.75f)
                horizontalLineTo(17.75f)
                close()
                moveTo(20.9944f, 9.25f)
                horizontalLineTo(17.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(20.9944f)
                curveTo(21.0f, 14.2163f, 21.0f, 13.6346f, 21.0f, 12.9995f)
                verticalLineTo(10.9995f)
                curveTo(21.0f, 10.3648f, 21.0f, 9.7835f, 20.9944f, 9.25f)
                close()
                moveTo(17.75f, 16.25f)
                horizontalLineTo(20.9533f)
                curveTo(20.8634f, 17.9753f, 20.5999f, 19.0565f, 19.8284f, 19.828f)
                curveTo(19.3096f, 20.3468f, 18.6507f, 20.6359f, 17.75f, 20.7969f)
                verticalLineTo(16.25f)
                close()
            }
        }
            .build()
        return _videoFrameCut!!
    }

private var _videoFrameCut: ImageVector? = null
