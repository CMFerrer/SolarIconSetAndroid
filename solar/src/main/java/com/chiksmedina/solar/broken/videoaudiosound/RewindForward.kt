package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

public val VideoAudioSoundGroup.RewindForward: ImageVector
    get() {
        if (_rewindForward != null) {
            return _rewindForward!!
        }
        _rewindForward = Builder(name = "RewindForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9998f, 15.2316f)
                lineTo(4.9031f, 19.6916f)
                curveTo(3.6006f, 20.5888f, 2.0f, 19.4211f, 2.0f, 17.5737f)
                lineTo(2.0f, 15.0f)
                moveTo(10.9998f, 8.7684f)
                lineTo(4.9031f, 4.3084f)
                curveTo(3.6007f, 3.4112f, 2.0f, 4.5789f, 2.0f, 6.4263f)
                lineTo(2.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.3699f, 7.7083f)
                lineTo(13.6612f, 5.2698f)
                curveTo(12.4673f, 4.4848f, 11.0f, 5.5066f, 11.0f, 7.123f)
                lineTo(11.0f, 16.877f)
                curveTo(11.0f, 18.4934f, 12.4673f, 19.5152f, 13.6612f, 18.7302f)
                lineTo(21.0786f, 13.8532f)
                curveTo(22.3071f, 13.0455f, 22.3071f, 10.9545f, 21.0786f, 10.1468f)
                lineTo(20.1515f, 9.5372f)
            }
        }
        .build()
        return _rewindForward!!
    }

private var _rewindForward: ImageVector? = null
