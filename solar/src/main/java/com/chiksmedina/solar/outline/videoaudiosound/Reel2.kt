package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Reel2: ImageVector
    get() {
        if (_reel2 != null) {
            return _reel2!!
        }
        _reel2 = Builder(
            name = "Reel2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(17.4805f, 21.25f)
                curveTo(20.6354f, 19.3767f, 22.75f, 15.9353f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(17.4805f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5f, 12.0f)
                curveTo(19.5f, 12.5523f, 19.0523f, 13.0f, 18.5f, 13.0f)
                curveTo(17.9477f, 13.0f, 17.5f, 12.5523f, 17.5f, 12.0f)
                curveTo(17.5f, 11.4477f, 17.9477f, 11.0f, 18.5f, 11.0f)
                curveTo(19.0523f, 11.0f, 19.5f, 11.4477f, 19.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 12.5523f, 6.0523f, 13.0f, 5.5f, 13.0f)
                curveTo(4.9477f, 13.0f, 4.5f, 12.5523f, 4.5f, 12.0f)
                curveTo(4.5f, 11.4477f, 4.9477f, 11.0f, 5.5f, 11.0f)
                curveTo(6.0523f, 11.0f, 6.5f, 11.4477f, 6.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.5f)
                curveTo(12.5523f, 4.5f, 13.0f, 4.9477f, 13.0f, 5.5f)
                curveTo(13.0f, 6.0523f, 12.5523f, 6.5f, 12.0f, 6.5f)
                curveTo(11.4477f, 6.5f, 11.0f, 6.0523f, 11.0f, 5.5f)
                curveTo(11.0f, 4.9477f, 11.4477f, 4.5f, 12.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
