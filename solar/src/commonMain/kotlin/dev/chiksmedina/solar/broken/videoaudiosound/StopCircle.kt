package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.7076f, 9.0f)
                curveTo(15.6314f, 8.8432f, 15.5353f, 8.7069f, 15.4142f, 8.5858f)
                curveTo(14.8284f, 8.0f, 13.8856f, 8.0f, 12.0f, 8.0f)
                curveTo(10.1144f, 8.0f, 9.1716f, 8.0f, 8.5858f, 8.5858f)
                curveTo(8.0f, 9.1716f, 8.0f, 10.1144f, 8.0f, 12.0f)
                curveTo(8.0f, 13.8856f, 8.0f, 14.8284f, 8.5858f, 15.4142f)
                curveTo(9.1716f, 16.0f, 10.1144f, 16.0f, 12.0f, 16.0f)
                curveTo(13.8856f, 16.0f, 14.8284f, 16.0f, 15.4142f, 15.4142f)
                curveTo(15.8858f, 14.9427f, 15.9777f, 14.2398f, 15.9957f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
