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

val VideoAudioSoundGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(
            name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.948f, 1.25f)
                horizontalLineTo(6.052f)
                curveTo(6.9505f, 1.25f, 7.6997f, 1.25f, 8.2945f, 1.3299f)
                curveTo(8.9223f, 1.4143f, 9.4891f, 1.6f, 9.9445f, 2.0555f)
                curveTo(10.4f, 2.5109f, 10.5857f, 3.0777f, 10.6701f, 3.7055f)
                curveTo(10.7501f, 4.3003f, 10.75f, 5.0495f, 10.75f, 5.948f)
                verticalLineTo(18.052f)
                curveTo(10.75f, 18.9505f, 10.7501f, 19.6997f, 10.6701f, 20.2945f)
                curveTo(10.5857f, 20.9223f, 10.4f, 21.4891f, 9.9445f, 21.9445f)
                curveTo(9.4891f, 22.4f, 8.9223f, 22.5857f, 8.2945f, 22.6701f)
                curveTo(7.6997f, 22.7501f, 6.9505f, 22.75f, 6.052f, 22.75f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 22.75f, 4.3003f, 22.7501f, 3.7055f, 22.6701f)
                curveTo(3.0777f, 22.5857f, 2.5109f, 22.4f, 2.0555f, 21.9445f)
                curveTo(1.6f, 21.4891f, 1.4143f, 20.9223f, 1.3299f, 20.2945f)
                curveTo(1.25f, 19.6997f, 1.25f, 18.9505f, 1.25f, 18.052f)
                verticalLineTo(5.948f)
                curveTo(1.25f, 5.0495f, 1.25f, 4.3003f, 1.3299f, 3.7055f)
                curveTo(1.4143f, 3.0777f, 1.6f, 2.5109f, 2.0555f, 2.0555f)
                curveTo(2.5109f, 1.6f, 3.0777f, 1.4143f, 3.7055f, 1.3299f)
                curveTo(4.3003f, 1.25f, 5.0495f, 1.25f, 5.948f, 1.25f)
                close()
                moveTo(3.9054f, 2.8165f)
                curveTo(3.4439f, 2.8786f, 3.2464f, 2.9858f, 3.1161f, 3.1161f)
                curveTo(2.9858f, 3.2464f, 2.8786f, 3.4439f, 2.8165f, 3.9054f)
                curveTo(2.7516f, 4.3884f, 2.75f, 5.036f, 2.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.75f, 18.964f, 2.7516f, 19.6116f, 2.8165f, 20.0946f)
                curveTo(2.8786f, 20.5561f, 2.9858f, 20.7536f, 3.1161f, 20.8839f)
                curveTo(3.2464f, 21.0142f, 3.4439f, 21.1214f, 3.9054f, 21.1835f)
                curveTo(4.3884f, 21.2484f, 5.036f, 21.25f, 6.0f, 21.25f)
                curveTo(6.964f, 21.25f, 7.6116f, 21.2484f, 8.0946f, 21.1835f)
                curveTo(8.5561f, 21.1214f, 8.7536f, 21.0142f, 8.8839f, 20.8839f)
                curveTo(9.0142f, 20.7536f, 9.1214f, 20.5561f, 9.1835f, 20.0946f)
                curveTo(9.2484f, 19.6116f, 9.25f, 18.964f, 9.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(9.25f, 5.036f, 9.2484f, 4.3884f, 9.1835f, 3.9054f)
                curveTo(9.1214f, 3.4439f, 9.0142f, 3.2464f, 8.8839f, 3.1161f)
                curveTo(8.7536f, 2.9858f, 8.5561f, 2.8786f, 8.0946f, 2.8165f)
                curveTo(7.6116f, 2.7516f, 6.964f, 2.75f, 6.0f, 2.75f)
                curveTo(5.036f, 2.75f, 4.3884f, 2.7516f, 3.9054f, 2.8165f)
                close()
                moveTo(17.948f, 1.25f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 1.25f, 19.6997f, 1.25f, 20.2945f, 1.3299f)
                curveTo(20.9223f, 1.4143f, 21.4891f, 1.6f, 21.9445f, 2.0555f)
                curveTo(22.4f, 2.5109f, 22.5857f, 3.0777f, 22.6701f, 3.7055f)
                curveTo(22.7501f, 4.3003f, 22.75f, 5.0495f, 22.75f, 5.948f)
                verticalLineTo(18.052f)
                curveTo(22.75f, 18.9505f, 22.7501f, 19.6997f, 22.6701f, 20.2945f)
                curveTo(22.5857f, 20.9223f, 22.4f, 21.4891f, 21.9445f, 21.9445f)
                curveTo(21.4891f, 22.4f, 20.9223f, 22.5857f, 20.2945f, 22.6701f)
                curveTo(19.6997f, 22.7501f, 18.9505f, 22.75f, 18.052f, 22.75f)
                horizontalLineTo(17.948f)
                curveTo(17.0495f, 22.75f, 16.3003f, 22.7501f, 15.7055f, 22.6701f)
                curveTo(15.0777f, 22.5857f, 14.5109f, 22.4f, 14.0555f, 21.9445f)
                curveTo(13.6f, 21.4891f, 13.4143f, 20.9223f, 13.3299f, 20.2945f)
                curveTo(13.2499f, 19.6997f, 13.25f, 18.9505f, 13.25f, 18.052f)
                verticalLineTo(5.948f)
                curveTo(13.25f, 5.0495f, 13.2499f, 4.3003f, 13.3299f, 3.7055f)
                curveTo(13.4143f, 3.0777f, 13.6f, 2.5109f, 14.0555f, 2.0555f)
                curveTo(14.5109f, 1.6f, 15.0777f, 1.4143f, 15.7055f, 1.3299f)
                curveTo(16.3003f, 1.25f, 17.0495f, 1.25f, 17.948f, 1.25f)
                close()
                moveTo(15.9054f, 2.8165f)
                curveTo(15.4439f, 2.8786f, 15.2464f, 2.9858f, 15.1161f, 3.1161f)
                curveTo(14.9858f, 3.2464f, 14.8786f, 3.4439f, 14.8165f, 3.9054f)
                curveTo(14.7516f, 4.3884f, 14.75f, 5.036f, 14.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(14.75f, 18.964f, 14.7516f, 19.6116f, 14.8165f, 20.0946f)
                curveTo(14.8786f, 20.5561f, 14.9858f, 20.7536f, 15.1161f, 20.8839f)
                curveTo(15.2464f, 21.0142f, 15.4439f, 21.1214f, 15.9054f, 21.1835f)
                curveTo(16.3884f, 21.2484f, 17.036f, 21.25f, 18.0f, 21.25f)
                curveTo(18.964f, 21.25f, 19.6116f, 21.2484f, 20.0946f, 21.1835f)
                curveTo(20.5561f, 21.1214f, 20.7536f, 21.0142f, 20.8839f, 20.8839f)
                curveTo(21.0142f, 20.7536f, 21.1214f, 20.5561f, 21.1835f, 20.0946f)
                curveTo(21.2484f, 19.6116f, 21.25f, 18.964f, 21.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.25f, 5.036f, 21.2484f, 4.3884f, 21.1835f, 3.9054f)
                curveTo(21.1214f, 3.4439f, 21.0142f, 3.2464f, 20.8839f, 3.1161f)
                curveTo(20.7536f, 2.9858f, 20.5561f, 2.8786f, 20.0946f, 2.8165f)
                curveTo(19.6116f, 2.7516f, 18.964f, 2.75f, 18.0f, 2.75f)
                curveTo(17.036f, 2.75f, 16.3884f, 2.7516f, 15.9054f, 2.8165f)
                close()
            }
        }
            .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
