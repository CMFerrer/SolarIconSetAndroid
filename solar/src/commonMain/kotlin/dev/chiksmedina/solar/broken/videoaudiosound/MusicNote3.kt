package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNote3: ImageVector
    get() {
        if (_musicNote3 != null) {
            return _musicNote3!!
        }
        _musicNote3 = Builder(
            name = "MusicNote3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                curveTo(12.0f, 20.2091f, 10.2091f, 22.0f, 8.0f, 22.0f)
                curveTo(5.7909f, 22.0f, 4.0f, 20.2091f, 4.0f, 18.0f)
                curveTo(4.0f, 15.7909f, 5.7909f, 14.0f, 8.0f, 14.0f)
                curveTo(10.2091f, 14.0f, 12.0f, 15.7909f, 12.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.1167f, 10.0587f)
                lineTo(13.4833f, 8.742f)
                curveTo(13.1184f, 8.5595f, 12.9359f, 8.4683f, 12.7852f, 8.3531f)
                curveTo(12.3949f, 8.0546f, 12.128f, 7.6229f, 12.0357f, 7.1403f)
                curveTo(12.0f, 6.954f, 12.0f, 6.75f, 12.0f, 6.342f)
                curveTo(12.0f, 5.3709f, 12.0f, 4.8854f, 12.1196f, 4.5553f)
                curveTo(12.4356f, 3.6829f, 13.3101f, 3.1424f, 14.2317f, 3.2499f)
                curveTo(14.5804f, 3.2906f, 15.0147f, 3.5077f, 15.8833f, 3.942f)
                lineTo(18.5167f, 5.2587f)
                curveTo(18.8816f, 5.4412f, 19.0641f, 5.5324f, 19.2148f, 5.6476f)
                curveTo(19.6051f, 5.9461f, 19.872f, 6.3778f, 19.9643f, 6.8604f)
                curveTo(20.0f, 7.0467f, 20.0f, 7.2507f, 20.0f, 7.6587f)
                curveTo(20.0f, 8.6298f, 20.0f, 9.1153f, 19.8804f, 9.4454f)
                curveTo(19.5644f, 10.3178f, 18.6899f, 10.8583f, 17.7683f, 10.7508f)
                curveTo(17.4196f, 10.7101f, 16.9853f, 10.493f, 16.1167f, 10.0587f)
                close()
            }
        }
            .build()
        return _musicNote3!!
    }

private var _musicNote3: ImageVector? = null
