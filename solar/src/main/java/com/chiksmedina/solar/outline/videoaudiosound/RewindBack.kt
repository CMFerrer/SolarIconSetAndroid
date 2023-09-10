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

val VideoAudioSoundGroup.RewindBack: ImageVector
    get() {
        if (_rewindBack != null) {
            return _rewindBack!!
        }
        _rewindBack = Builder(
            name = "RewindBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.7498f, 6.4264f)
                curveTo(22.7498f, 5.2895f, 22.2555f, 4.2991f, 21.4787f, 3.7324f)
                curveTo(20.6815f, 3.1508f, 19.6076f, 3.0459f, 18.6712f, 3.6908f)
                lineTo(18.6624f, 3.6969f)
                lineTo(13.75f, 7.2906f)
                verticalLineTo(7.1231f)
                curveTo(13.75f, 6.0873f, 13.2773f, 5.19f, 12.5457f, 4.6805f)
                curveTo(11.7998f, 4.161f, 10.8013f, 4.0683f, 9.9268f, 4.6433f)
                lineTo(2.5093f, 9.5202f)
                curveTo(1.639f, 10.0925f, 1.25f, 11.0822f, 1.25f, 12.0001f)
                curveTo(1.25f, 12.918f, 1.639f, 13.9077f, 2.5093f, 14.48f)
                lineTo(9.9268f, 19.3569f)
                curveTo(10.8013f, 19.9319f, 11.7998f, 19.8392f, 12.5457f, 19.3197f)
                curveTo(13.2773f, 18.8102f, 13.75f, 17.9129f, 13.75f, 16.8771f)
                verticalLineTo(16.7096f)
                lineTo(18.6624f, 20.3033f)
                lineTo(18.6712f, 20.3094f)
                curveTo(19.6076f, 20.9544f, 20.6815f, 20.8494f, 21.4787f, 20.2679f)
                curveTo(22.2555f, 19.7011f, 22.7498f, 18.7107f, 22.7498f, 17.5738f)
                lineTo(22.7498f, 6.4264f)
                close()
                moveTo(13.75f, 14.8511f)
                lineTo(19.5298f, 19.0794f)
                curveTo(19.8935f, 19.3258f, 20.2682f, 19.2942f, 20.5946f, 19.0561f)
                curveTo(20.9437f, 18.8014f, 21.2498f, 18.2843f, 21.2498f, 17.5738f)
                lineTo(21.2498f, 6.4264f)
                curveTo(21.2498f, 5.7159f, 20.9437f, 5.1988f, 20.5946f, 4.9441f)
                curveTo(20.2682f, 4.706f, 19.8935f, 4.6744f, 19.5299f, 4.9208f)
                lineTo(13.75f, 9.1491f)
                lineTo(13.75f, 14.8511f)
                close()
                moveTo(10.7508f, 5.8966f)
                curveTo(11.0703f, 5.6866f, 11.4024f, 5.7122f, 11.6885f, 5.9114f)
                curveTo(11.989f, 6.1207f, 12.25f, 6.5425f, 12.25f, 7.1231f)
                lineTo(12.25f, 16.8771f)
                curveTo(12.25f, 17.4577f, 11.989f, 17.8795f, 11.6885f, 18.0888f)
                curveTo(11.4024f, 18.288f, 11.0703f, 18.3136f, 10.7508f, 18.1036f)
                lineTo(3.3334f, 13.2266f)
                curveTo(2.9752f, 12.9911f, 2.75f, 12.5316f, 2.75f, 12.0001f)
                curveTo(2.75f, 11.4686f, 2.9752f, 11.0091f, 3.3334f, 10.7736f)
                lineTo(10.7508f, 5.8966f)
                close()
            }
        }
            .build()
        return _rewindBack!!
    }

private var _rewindBack: ImageVector? = null
