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

public val VideoAudioSoundGroup.Reel2: ImageVector
    get() {
        if (_reel2 != null) {
            return _reel2!!
        }
        _reel2 = Builder(name = "Reel2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineTo(22.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 12.0f)
                curveTo(19.5f, 12.5523f, 19.0523f, 13.0f, 18.5f, 13.0f)
                curveTo(17.9477f, 13.0f, 17.5f, 12.5523f, 17.5f, 12.0f)
                curveTo(17.5f, 11.4477f, 17.9477f, 11.0f, 18.5f, 11.0f)
                curveTo(19.0523f, 11.0f, 19.5f, 11.4477f, 19.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 12.5523f, 6.0523f, 13.0f, 5.5f, 13.0f)
                curveTo(4.9477f, 13.0f, 4.5f, 12.5523f, 4.5f, 12.0f)
                curveTo(4.5f, 11.4477f, 4.9477f, 11.0f, 5.5f, 11.0f)
                curveTo(6.0523f, 11.0f, 6.5f, 11.4477f, 6.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(12.5523f, 4.5f, 13.0f, 4.9477f, 13.0f, 5.5f)
                curveTo(13.0f, 6.0523f, 12.5523f, 6.5f, 12.0f, 6.5f)
                curveTo(11.4477f, 6.5f, 11.0f, 6.0523f, 11.0f, 5.5f)
                curveTo(11.0f, 4.9477f, 11.4477f, 4.5f, 12.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.5f)
                curveTo(12.5523f, 17.5f, 13.0f, 17.9477f, 13.0f, 18.5f)
                curveTo(13.0f, 19.0523f, 12.5523f, 19.5f, 12.0f, 19.5f)
                curveTo(11.4477f, 19.5f, 11.0f, 19.0523f, 11.0f, 18.5f)
                curveTo(11.0f, 17.9477f, 11.4477f, 17.5f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _reel2!!
    }

private var _reel2: ImageVector? = null
