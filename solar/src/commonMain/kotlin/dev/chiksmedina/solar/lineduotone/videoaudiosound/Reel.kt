package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Reel: ImageVector
    get() {
        if (_reel != null) {
            return _reel!!
        }
        _reel = Builder(
            name = "Reel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                lineTo(22.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 7.5f)
                curveTo(13.5f, 8.3284f, 12.8284f, 9.0f, 12.0f, 9.0f)
                curveTo(11.1716f, 9.0f, 10.5f, 8.3284f, 10.5f, 7.5f)
                curveTo(10.5f, 6.6716f, 11.1716f, 6.0f, 12.0f, 6.0f)
                curveTo(12.8284f, 6.0f, 13.5f, 6.6716f, 13.5f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 16.5f)
                curveTo(13.5f, 17.3284f, 12.8284f, 18.0f, 12.0f, 18.0f)
                curveTo(11.1716f, 18.0f, 10.5f, 17.3284f, 10.5f, 16.5f)
                curveTo(10.5f, 15.6716f, 11.1716f, 15.0f, 12.0f, 15.0f)
                curveTo(12.8284f, 15.0f, 13.5f, 15.6716f, 13.5f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 10.5f)
                curveTo(8.3284f, 10.5f, 9.0f, 11.1716f, 9.0f, 12.0f)
                curveTo(9.0f, 12.8284f, 8.3284f, 13.5f, 7.5f, 13.5f)
                curveTo(6.6716f, 13.5f, 6.0f, 12.8284f, 6.0f, 12.0f)
                curveTo(6.0f, 11.1716f, 6.6716f, 10.5f, 7.5f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 10.5f)
                curveTo(17.3284f, 10.5f, 18.0f, 11.1716f, 18.0f, 12.0f)
                curveTo(18.0f, 12.8284f, 17.3284f, 13.5f, 16.5f, 13.5f)
                curveTo(15.6716f, 13.5f, 15.0f, 12.8284f, 15.0f, 12.0f)
                curveTo(15.0f, 11.1716f, 15.6716f, 10.5f, 16.5f, 10.5f)
                close()
            }
        }
            .build()
        return _reel!!
    }

private var _reel: ImageVector? = null
