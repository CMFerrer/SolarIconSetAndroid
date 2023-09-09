package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.RewindForwardCircle: ImageVector
    get() {
        if (_rewindForwardCircle != null) {
            return _rewindForwardCircle!!
        }
        _rewindForwardCircle = Builder(name = "RewindForwardCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4365f, 7.4611f)
                curveTo(13.0994f, 7.2203f, 12.631f, 7.2984f, 12.3902f, 7.6354f)
                curveTo(12.1495f, 7.9725f, 12.2276f, 8.4409f, 12.5646f, 8.6817f)
                lineTo(15.7862f, 10.9828f)
                curveTo(16.4841f, 11.4813f, 16.4841f, 12.5186f, 15.7862f, 13.0171f)
                lineTo(12.5646f, 15.3182f)
                curveTo(12.2276f, 15.5589f, 12.1495f, 16.0274f, 12.3902f, 16.3644f)
                curveTo(12.631f, 16.7015f, 13.0994f, 16.7795f, 13.4365f, 16.5388f)
                lineTo(16.658f, 14.2377f)
                curveTo(18.1935f, 13.1409f, 18.1935f, 10.8589f, 16.658f, 9.7621f)
                lineTo(13.4365f, 7.4611f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5005f, 15.1318f)
                verticalLineTo(8.8689f)
                curveTo(7.5005f, 8.0702f, 8.3906f, 7.5938f, 9.0552f, 8.0368f)
                lineTo(13.7524f, 11.1683f)
                curveTo(14.3461f, 11.5641f, 14.3461f, 12.4366f, 13.7524f, 12.8324f)
                lineTo(9.0552f, 15.9639f)
                curveTo(8.3906f, 16.4069f, 7.5005f, 15.9305f, 7.5005f, 15.1318f)
                close()
            }
        }
        .build()
        return _rewindForwardCircle!!
    }

private var _rewindForwardCircle: ImageVector? = null
