package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.RewindBackCircle: ImageVector
    get() {
        if (_rewindBackCircle != null) {
            return _rewindBackCircle!!
        }
        _rewindBackCircle = Builder(
            name = "RewindBackCircle", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(10.564f, 7.4611f)
                curveTo(10.9011f, 7.2203f, 11.3695f, 7.2984f, 11.6102f, 7.6354f)
                curveTo(11.851f, 7.9725f, 11.7729f, 8.4409f, 11.4359f, 8.6817f)
                lineTo(8.2143f, 10.9828f)
                curveTo(7.5164f, 11.4813f, 7.5164f, 12.5186f, 8.2143f, 13.0171f)
                lineTo(11.4359f, 15.3182f)
                curveTo(11.7729f, 15.5589f, 11.851f, 16.0274f, 11.6102f, 16.3644f)
                curveTo(11.3695f, 16.7015f, 10.9011f, 16.7795f, 10.564f, 16.5388f)
                lineTo(7.3425f, 14.2377f)
                curveTo(5.807f, 13.1409f, 5.807f, 10.8589f, 7.3425f, 9.7621f)
                lineTo(10.564f, 7.4611f)
                close()
                moveTo(16.5f, 15.1318f)
                verticalLineTo(8.8689f)
                curveTo(16.5f, 8.0702f, 15.6099f, 7.5938f, 14.9453f, 8.0368f)
                lineTo(10.2481f, 11.1683f)
                curveTo(9.6543f, 11.5641f, 9.6543f, 12.4366f, 10.2481f, 12.8324f)
                lineTo(14.9453f, 15.9639f)
                curveTo(15.6099f, 16.4069f, 16.5f, 15.9305f, 16.5f, 15.1318f)
                close()
            }
        }
            .build()
        return _rewindBackCircle!!
    }

private var _rewindBackCircle: ImageVector? = null
