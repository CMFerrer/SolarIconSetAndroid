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
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(14.4828f, 7.5192f)
                curveTo(15.6411f, 6.6918f, 17.25f, 7.5198f, 17.25f, 8.9432f)
                verticalLineTo(15.0568f)
                curveTo(17.25f, 16.4802f, 15.6411f, 17.3082f, 14.4828f, 16.4808f)
                lineTo(10.2033f, 13.424f)
                curveTo(9.2262f, 12.7261f, 9.2262f, 11.2739f, 10.2033f, 10.576f)
                lineTo(14.4828f, 7.5192f)
                close()
                moveTo(15.75f, 8.9432f)
                curveTo(15.75f, 8.7399f, 15.5202f, 8.6216f, 15.3547f, 8.7398f)
                lineTo(11.0752f, 11.7966f)
                curveTo(10.9356f, 11.8963f, 10.9356f, 12.1037f, 11.0752f, 12.2034f)
                lineTo(15.3547f, 15.2602f)
                curveTo(15.5202f, 15.3784f, 15.75f, 15.2602f, 15.75f, 15.0568f)
                verticalLineTo(8.9432f)
                close()
                moveTo(11.6103f, 7.6355f)
                curveTo(11.8511f, 7.9726f, 11.773f, 8.441f, 11.4359f, 8.6817f)
                lineTo(8.2144f, 10.9828f)
                curveTo(7.5164f, 11.4814f, 7.5164f, 12.5186f, 8.2144f, 13.0172f)
                lineTo(11.4359f, 15.3183f)
                curveTo(11.773f, 15.559f, 11.8511f, 16.0274f, 11.6103f, 16.3645f)
                curveTo(11.3695f, 16.7016f, 10.9011f, 16.7796f, 10.5641f, 16.5389f)
                lineTo(7.3425f, 14.2378f)
                curveTo(5.8071f, 13.141f, 5.8071f, 10.859f, 7.3425f, 9.7622f)
                lineTo(10.5641f, 7.4611f)
                curveTo(10.9011f, 7.2204f, 11.3695f, 7.2984f, 11.6103f, 7.6355f)
                close()
            }
        }
            .build()
        return _rewindBackCircle!!
    }

private var _rewindBackCircle: ImageVector? = null
