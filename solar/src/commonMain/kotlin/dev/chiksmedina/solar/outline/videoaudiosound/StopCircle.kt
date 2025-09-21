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

val VideoAudioSoundGroup.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) {
            return _stopCircle!!
        }
        _stopCircle = Builder(
            name = "StopCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(11.948f, 7.25f)
                horizontalLineTo(12.052f)
                curveTo(12.9505f, 7.25f, 13.6997f, 7.2499f, 14.2945f, 7.3299f)
                curveTo(14.9223f, 7.4143f, 15.4891f, 7.6f, 15.9445f, 8.0555f)
                curveTo(16.4f, 8.5109f, 16.5857f, 9.0777f, 16.6701f, 9.7055f)
                curveTo(16.7501f, 10.3003f, 16.75f, 11.0495f, 16.75f, 11.948f)
                verticalLineTo(12.052f)
                curveTo(16.75f, 12.9505f, 16.7501f, 13.6997f, 16.6701f, 14.2945f)
                curveTo(16.5857f, 14.9223f, 16.4f, 15.4891f, 15.9445f, 15.9445f)
                curveTo(15.4891f, 16.4f, 14.9223f, 16.5857f, 14.2945f, 16.6701f)
                curveTo(13.6997f, 16.7501f, 12.9505f, 16.75f, 12.052f, 16.75f)
                horizontalLineTo(11.948f)
                curveTo(11.0495f, 16.75f, 10.3003f, 16.7501f, 9.7055f, 16.6701f)
                curveTo(9.0777f, 16.5857f, 8.5109f, 16.4f, 8.0555f, 15.9445f)
                curveTo(7.6f, 15.4891f, 7.4143f, 14.9223f, 7.3299f, 14.2945f)
                curveTo(7.2499f, 13.6997f, 7.25f, 12.9505f, 7.25f, 12.052f)
                verticalLineTo(11.948f)
                curveTo(7.25f, 11.0495f, 7.2499f, 10.3003f, 7.3299f, 9.7055f)
                curveTo(7.4143f, 9.0777f, 7.6f, 8.5109f, 8.0555f, 8.0555f)
                curveTo(8.5109f, 7.6f, 9.0777f, 7.4143f, 9.7055f, 7.3299f)
                curveTo(10.3003f, 7.2499f, 11.0495f, 7.25f, 11.948f, 7.25f)
                close()
                moveTo(9.9054f, 8.8165f)
                curveTo(9.4439f, 8.8786f, 9.2464f, 8.9858f, 9.1161f, 9.1161f)
                curveTo(8.9858f, 9.2464f, 8.8786f, 9.4439f, 8.8165f, 9.9054f)
                curveTo(8.7516f, 10.3884f, 8.75f, 11.036f, 8.75f, 12.0f)
                curveTo(8.75f, 12.964f, 8.7516f, 13.6116f, 8.8165f, 14.0946f)
                curveTo(8.8786f, 14.5561f, 8.9858f, 14.7536f, 9.1161f, 14.8839f)
                curveTo(9.2464f, 15.0142f, 9.4439f, 15.1214f, 9.9054f, 15.1835f)
                curveTo(10.3884f, 15.2484f, 11.036f, 15.25f, 12.0f, 15.25f)
                curveTo(12.964f, 15.25f, 13.6116f, 15.2484f, 14.0946f, 15.1835f)
                curveTo(14.5561f, 15.1214f, 14.7536f, 15.0142f, 14.8839f, 14.8839f)
                curveTo(15.0142f, 14.7536f, 15.1214f, 14.5561f, 15.1835f, 14.0946f)
                curveTo(15.2484f, 13.6116f, 15.25f, 12.964f, 15.25f, 12.0f)
                curveTo(15.25f, 11.036f, 15.2484f, 10.3884f, 15.1835f, 9.9054f)
                curveTo(15.1214f, 9.4439f, 15.0142f, 9.2464f, 14.8839f, 9.1161f)
                curveTo(14.7536f, 8.9858f, 14.5561f, 8.8786f, 14.0946f, 8.8165f)
                curveTo(13.6116f, 8.7516f, 12.964f, 8.75f, 12.0f, 8.75f)
                curveTo(11.036f, 8.75f, 10.3884f, 8.7516f, 9.9054f, 8.8165f)
                close()
            }
        }
            .build()
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
