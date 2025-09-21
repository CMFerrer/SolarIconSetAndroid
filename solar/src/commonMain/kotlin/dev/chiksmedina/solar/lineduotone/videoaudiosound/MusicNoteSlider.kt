package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNoteSlider: ImageVector
    get() {
        if (_musicNoteSlider != null) {
            return _musicNoteSlider!!
        }
        _musicNoteSlider = Builder(
            name = "MusicNoteSlider", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 5.1716f, 5.0f, 3.7574f, 5.8787f, 2.8787f)
                curveTo(6.7574f, 2.0f, 8.1716f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 2.0f, 17.2426f, 2.0f, 18.1213f, 2.8787f)
                curveTo(19.0f, 3.7574f, 19.0f, 5.1716f, 19.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 18.8284f, 19.0f, 20.2426f, 18.1213f, 21.1213f)
                curveTo(17.2426f, 22.0f, 15.8284f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(8.1716f, 22.0f, 6.7574f, 22.0f, 5.8787f, 21.1213f)
                curveTo(5.0f, 20.2426f, 5.0f, 18.8284f, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 19.5f)
                curveTo(19.4645f, 19.5f, 19.6968f, 19.5f, 19.8911f, 19.4692f)
                curveTo(20.9608f, 19.2998f, 21.7998f, 18.4608f, 21.9692f, 17.3911f)
                curveTo(22.0f, 17.1968f, 22.0f, 16.9645f, 22.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 7.0355f, 22.0f, 6.8032f, 21.9692f, 6.6089f)
                curveTo(21.7998f, 5.5392f, 20.9608f, 4.7002f, 19.8911f, 4.5308f)
                curveTo(19.6968f, 4.5f, 19.4645f, 4.5f, 19.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 15.1046f, 12.1046f, 16.0f, 11.0f, 16.0f)
                curveTo(9.8954f, 16.0f, 9.0f, 15.1046f, 9.0f, 14.0f)
                curveTo(9.0f, 12.8954f, 9.8954f, 12.0f, 11.0f, 12.0f)
                curveTo(12.1046f, 12.0f, 13.0f, 12.8954f, 13.0f, 14.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(13.0f, 9.1046f, 13.8954f, 10.0f, 15.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 19.5f)
                curveTo(4.5355f, 19.5f, 4.3032f, 19.5f, 4.1089f, 19.4692f)
                curveTo(3.0392f, 19.2998f, 2.2002f, 18.4608f, 2.0308f, 17.3911f)
                curveTo(2.0f, 17.1968f, 2.0f, 16.9645f, 2.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 7.0355f, 2.0f, 6.8032f, 2.0308f, 6.6089f)
                curveTo(2.2002f, 5.5392f, 3.0392f, 4.7002f, 4.1089f, 4.5308f)
                curveTo(4.3032f, 4.5f, 4.5355f, 4.5f, 5.0f, 4.5f)
            }
        }
            .build()
        return _musicNoteSlider!!
    }

private var _musicNoteSlider: ImageVector? = null
