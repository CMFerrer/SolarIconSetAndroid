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

val VideoAudioSoundGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(
            name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.0748f, 7.5083f)
                curveTo(9.7462f, 6.7239f, 8.25f, 7.7906f, 8.25f, 9.2132f)
                verticalLineTo(14.7868f)
                curveTo(8.25f, 16.2093f, 9.7462f, 17.276f, 11.0748f, 16.4916f)
                lineTo(15.795f, 13.7048f)
                curveTo(17.0683f, 12.953f, 17.0683f, 11.047f, 15.795f, 10.2952f)
                lineTo(11.0748f, 7.5083f)
                close()
                moveTo(9.75f, 9.2132f)
                curveTo(9.75f, 9.0147f, 9.8462f, 8.8758f, 9.9595f, 8.805f)
                curveTo(10.0691f, 8.7364f, 10.1919f, 8.729f, 10.3122f, 8.8f)
                lineTo(15.0324f, 11.5869f)
                curveTo(15.165f, 11.6652f, 15.25f, 11.8148f, 15.25f, 12.0f)
                curveTo(15.25f, 12.1852f, 15.165f, 12.3348f, 15.0324f, 12.4131f)
                lineTo(10.3122f, 15.2f)
                curveTo(10.1919f, 15.271f, 10.0691f, 15.2636f, 9.9595f, 15.195f)
                curveTo(9.8462f, 15.1242f, 9.75f, 14.9853f, 9.75f, 14.7868f)
                verticalLineTo(9.2132f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
