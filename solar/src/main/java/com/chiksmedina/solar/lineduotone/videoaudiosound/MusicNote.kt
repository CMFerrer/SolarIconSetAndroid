package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                curveTo(9.0f, 20.6569f, 7.6568f, 22.0f, 6.0f, 22.0f)
                curveTo(4.3432f, 22.0f, 3.0f, 20.6569f, 3.0f, 19.0f)
                curveTo(3.0f, 17.3431f, 4.3432f, 16.0f, 6.0f, 16.0f)
                curveTo(7.6568f, 16.0f, 9.0f, 17.3431f, 9.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                curveTo(21.0f, 18.6569f, 19.6569f, 20.0f, 18.0f, 20.0f)
                curveTo(16.3431f, 20.0f, 15.0f, 18.6569f, 15.0f, 17.0f)
                curveTo(15.0f, 15.3431f, 16.3431f, 14.0f, 18.0f, 14.0f)
                curveTo(19.6569f, 14.0f, 21.0f, 15.3431f, 21.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                verticalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.7351f, 3.7547f)
                lineTo(11.7351f, 5.088f)
                curveTo(10.4151f, 5.528f, 9.755f, 5.748f, 9.3775f, 6.2718f)
                curveTo(9.0f, 6.7956f, 9.0f, 7.4913f, 9.0f, 8.8827f)
                verticalLineTo(11.9997f)
                lineTo(21.0f, 7.9997f)
                verticalLineTo(7.5494f)
                curveTo(21.0f, 5.0169f, 21.0f, 3.7507f, 20.1694f, 3.1521f)
                curveTo(19.3388f, 2.5534f, 18.1376f, 2.9538f, 15.7351f, 3.7547f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
