package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 8.0714f)
                lineTo(7.7784f, 10.3725f)
                curveTo(6.6617f, 11.1702f, 6.6617f, 12.8298f, 7.7784f, 13.6274f)
                lineTo(11.0f, 15.9286f)
                moveTo(16.5f, 15.0568f)
                verticalLineTo(8.9432f)
                curveTo(16.5f, 8.1298f, 15.5806f, 7.6567f, 14.9188f, 8.1294f)
                lineTo(10.6392f, 11.1862f)
                curveTo(10.0809f, 11.5851f, 10.0809f, 12.4149f, 10.6392f, 12.8137f)
                lineTo(14.9188f, 15.8705f)
                curveTo(15.5806f, 16.3433f, 16.5f, 15.8702f, 16.5f, 15.0568f)
                close()
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
        return _rewindBackCircle!!
    }

private var _rewindBackCircle: ImageVector? = null
