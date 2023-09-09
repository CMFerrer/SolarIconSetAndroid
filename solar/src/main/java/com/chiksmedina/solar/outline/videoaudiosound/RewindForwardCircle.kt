package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

public val VideoAudioSoundGroup.RewindForwardCircle: ImageVector
    get() {
        if (_rewindForwardCircle != null) {
            return _rewindForwardCircle!!
        }
        _rewindForwardCircle = Builder(name = "RewindForwardCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(8.6453f, 8.7398f)
                curveTo(8.4798f, 8.6216f, 8.25f, 8.7399f, 8.25f, 8.9432f)
                verticalLineTo(15.0568f)
                curveTo(8.25f, 15.2602f, 8.4798f, 15.3784f, 8.6453f, 15.2602f)
                lineTo(12.9248f, 12.2034f)
                curveTo(13.0644f, 12.1037f, 13.0644f, 11.8963f, 12.9248f, 11.7966f)
                lineTo(8.6453f, 8.7398f)
                close()
                moveTo(6.75f, 8.9432f)
                curveTo(6.75f, 7.5198f, 8.3589f, 6.6918f, 9.5172f, 7.5192f)
                lineTo(13.7967f, 10.576f)
                curveTo(14.7738f, 11.2739f, 14.7738f, 12.7261f, 13.7967f, 13.424f)
                lineTo(9.5172f, 16.4808f)
                curveTo(8.3589f, 17.3082f, 6.75f, 16.4802f, 6.75f, 15.0568f)
                verticalLineTo(8.9432f)
                close()
                moveTo(12.3897f, 7.6355f)
                curveTo(12.6305f, 7.2984f, 13.0989f, 7.2204f, 13.4359f, 7.4611f)
                lineTo(16.6575f, 9.7622f)
                curveTo(18.1929f, 10.859f, 18.1929f, 13.141f, 16.6575f, 14.2378f)
                lineTo(13.4359f, 16.5389f)
                curveTo(13.0989f, 16.7796f, 12.6305f, 16.7016f, 12.3897f, 16.3645f)
                curveTo(12.1489f, 16.0274f, 12.227f, 15.559f, 12.5641f, 15.3183f)
                lineTo(15.7856f, 13.0172f)
                curveTo(16.4836f, 12.5186f, 16.4836f, 11.4814f, 15.7856f, 10.9828f)
                lineTo(12.5641f, 8.6817f)
                curveTo(12.227f, 8.441f, 12.1489f, 7.9726f, 12.3897f, 7.6355f)
                close()
            }
        }
        .build()
        return _rewindForwardCircle!!
    }

private var _rewindForwardCircle: ImageVector? = null
