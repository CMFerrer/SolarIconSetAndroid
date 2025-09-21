package dev.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.ClapperboardText: ImageVector
    get() {
        if (_clapperboardText != null) {
            return _clapperboardText!!
        }
        _clapperboardText = Builder(
            name = "ClapperboardText", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5401f, 2.0878f)
                curveTo(15.3294f, 2.0f, 13.8453f, 2.0f, 12.0001f, 2.0f)
                horizontalLineTo(11.9015f)
                lineTo(8.4015f, 7.25f)
                horizontalLineTo(13.0987f)
                lineTo(16.5401f, 2.0878f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0957f, 2.0045f)
                curveTo(6.622f, 2.0307f, 4.7169f, 2.2121f, 3.4645f, 3.4645f)
                curveTo(2.6069f, 4.3221f, 2.2515f, 5.4859f, 2.1042f, 7.25f)
                horizontalLineTo(6.5987f)
                lineTo(10.0957f, 2.0045f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5356f, 3.4645f)
                curveTo(21.3933f, 4.3221f, 21.7486f, 5.4859f, 21.8959f, 7.25f)
                horizontalLineTo(14.9015f)
                lineTo(18.1988f, 2.304f)
                curveTo(19.1925f, 2.5134f, 19.9383f, 2.8671f, 20.5356f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.7632f, 2.0f, 9.6887f, 2.0264f, 8.75f)
                horizontalLineTo(21.9736f)
                curveTo(22.0f, 9.6887f, 22.0f, 10.7632f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.071f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.071f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 17.5f)
                curveTo(5.75f, 17.0858f, 6.0858f, 16.75f, 6.5f, 16.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 16.75f, 12.75f, 17.0858f, 12.75f, 17.5f)
                curveTo(12.75f, 17.9142f, 12.4142f, 18.25f, 12.0f, 18.25f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 18.25f, 5.75f, 17.9142f, 5.75f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5f, 13.25f)
                curveTo(6.0858f, 13.25f, 5.75f, 13.5858f, 5.75f, 14.0f)
                curveTo(5.75f, 14.4142f, 6.0858f, 14.75f, 6.5f, 14.75f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 14.75f, 15.25f, 14.4142f, 15.25f, 14.0f)
                curveTo(15.25f, 13.5858f, 14.9142f, 13.25f, 14.5f, 13.25f)
                horizontalLineTo(6.5f)
                close()
            }
        }
            .build()
        return _clapperboardText!!
    }

private var _clapperboardText: ImageVector? = null
