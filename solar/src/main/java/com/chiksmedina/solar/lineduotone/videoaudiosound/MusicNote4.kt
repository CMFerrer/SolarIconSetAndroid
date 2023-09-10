package com.chiksmedina.solar.lineduotone.videoaudiosound

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
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNote4: ImageVector
    get() {
        if (_musicNote4 != null) {
            return _musicNote4!!
        }
        _musicNote4 = Builder(
            name = "MusicNote4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.1167f, 3.942f)
                lineTo(13.4833f, 5.2587f)
                curveTo(13.1184f, 5.4412f, 12.9359f, 5.5324f, 12.7852f, 5.6476f)
                curveTo(12.3949f, 5.9461f, 12.128f, 6.3778f, 12.0357f, 6.8604f)
                curveTo(12.0f, 7.0467f, 12.0f, 7.2507f, 12.0f, 7.6587f)
                curveTo(12.0f, 8.6298f, 12.0f, 9.1153f, 12.1196f, 9.4454f)
                curveTo(12.4356f, 10.3178f, 13.3101f, 10.8583f, 14.2317f, 10.7508f)
                curveTo(14.5804f, 10.7101f, 15.0147f, 10.493f, 15.8833f, 10.0587f)
                lineTo(18.5167f, 8.742f)
                curveTo(18.8816f, 8.5595f, 19.0641f, 8.4683f, 19.2148f, 8.3531f)
                curveTo(19.6051f, 8.0546f, 19.872f, 7.6229f, 19.9643f, 7.1403f)
                curveTo(20.0f, 6.954f, 20.0f, 6.75f, 20.0f, 6.342f)
                curveTo(20.0f, 5.3709f, 20.0f, 4.8854f, 19.8804f, 4.5553f)
                curveTo(19.5644f, 3.6829f, 18.6899f, 3.1424f, 17.7683f, 3.2499f)
                curveTo(17.4196f, 3.2906f, 16.9853f, 3.5077f, 16.1167f, 3.942f)
                close()
            }
        }
            .build()
        return _musicNote4!!
    }

private var _musicNote4: ImageVector? = null
