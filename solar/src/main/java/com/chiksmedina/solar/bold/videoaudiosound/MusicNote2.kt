package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.MusicNote2: ImageVector
    get() {
        if (_musicNote2 != null) {
            return _musicNote2!!
        }
        _musicNote2 = Builder(name = "MusicNote2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(13.75f, 1.5858f, 13.4142f, 1.25f, 13.0f, 1.25f)
                curveTo(12.5858f, 1.25f, 12.25f, 1.5858f, 12.25f, 2.0f)
                verticalLineTo(14.5359f)
                curveTo(11.4003f, 13.7384f, 10.2572f, 13.25f, 9.0f, 13.25f)
                curveTo(6.3766f, 13.25f, 4.25f, 15.3766f, 4.25f, 18.0f)
                curveTo(4.25f, 20.6234f, 6.3766f, 22.75f, 9.0f, 22.75f)
                curveTo(11.6234f, 22.75f, 13.75f, 20.6234f, 13.75f, 18.0f)
                verticalLineTo(6.243f)
                curveTo(14.9875f, 7.7723f, 16.8795f, 8.75f, 19.0f, 8.75f)
                curveTo(19.4142f, 8.75f, 19.75f, 8.4142f, 19.75f, 8.0f)
                curveTo(19.75f, 7.5858f, 19.4142f, 7.25f, 19.0f, 7.25f)
                curveTo(16.1005f, 7.25f, 13.75f, 4.8995f, 13.75f, 2.0f)
                close()
            }
        }
        .build()
        return _musicNote2!!
    }

private var _musicNote2: ImageVector? = null
