package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(
            name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 19.75f)
                curveTo(9.9142f, 19.75f, 10.25f, 19.4142f, 10.25f, 19.0f)
                curveTo(10.25f, 18.5858f, 9.9142f, 18.25f, 9.5f, 18.25f)
                verticalLineTo(19.75f)
                close()
                moveTo(11.0f, 5.0f)
                verticalLineTo(5.75f)
                curveTo(11.3033f, 5.75f, 11.5768f, 5.5673f, 11.6929f, 5.287f)
                curveTo(11.809f, 5.0068f, 11.7448f, 4.6842f, 11.5303f, 4.4697f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(9.5303f, 2.4697f)
                curveTo(9.2374f, 2.1768f, 8.7626f, 2.1768f, 8.4697f, 2.4697f)
                curveTo(8.1768f, 2.7626f, 8.1768f, 3.2374f, 8.4697f, 3.5303f)
                lineTo(9.5303f, 2.4697f)
                close()
                moveTo(9.5f, 18.25f)
                horizontalLineTo(9.0003f)
                verticalLineTo(19.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.25f)
                close()
                moveTo(9.0f, 5.75f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(11.5303f, 4.4697f)
                lineTo(9.5303f, 2.4697f)
                lineTo(8.4697f, 3.5303f)
                lineTo(10.4697f, 5.5303f)
                lineTo(11.5303f, 4.4697f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 16.2802f, 4.7201f, 19.75f, 9.0003f, 19.75f)
                verticalLineTo(18.25f)
                curveTo(5.5485f, 18.25f, 2.75f, 15.4517f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 8.5482f, 5.5482f, 5.75f, 9.0f, 5.75f)
                verticalLineTo(4.25f)
                curveTo(4.7198f, 4.25f, 1.25f, 7.7198f, 1.25f, 12.0f)
                horizontalLineTo(2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 19.0f)
                verticalLineTo(18.25f)
                curveTo(12.6967f, 18.25f, 12.4232f, 18.4327f, 12.3071f, 18.713f)
                curveTo(12.191f, 18.9932f, 12.2552f, 19.3158f, 12.4697f, 19.5303f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(14.4697f, 21.5303f)
                curveTo(14.7626f, 21.8232f, 15.2374f, 21.8232f, 15.5303f, 21.5303f)
                curveTo(15.8232f, 21.2374f, 15.8232f, 20.7626f, 15.5303f, 20.4697f)
                lineTo(14.4697f, 21.5303f)
                close()
                moveTo(14.5f, 4.25f)
                curveTo(14.0858f, 4.25f, 13.75f, 4.5858f, 13.75f, 5.0f)
                curveTo(13.75f, 5.4142f, 14.0858f, 5.75f, 14.5f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(15.0f, 18.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.25f)
                close()
                moveTo(12.4697f, 19.5303f)
                lineTo(14.4697f, 21.5303f)
                lineTo(15.5303f, 20.4697f)
                lineTo(13.5303f, 18.4697f)
                lineTo(12.4697f, 19.5303f)
                close()
                moveTo(14.5f, 5.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.75f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 15.4518f, 18.4518f, 18.25f, 15.0f, 18.25f)
                verticalLineTo(19.75f)
                curveTo(19.2802f, 19.75f, 22.75f, 16.2802f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(22.75f, 12.0f)
                curveTo(22.75f, 7.7198f, 19.2802f, 4.25f, 15.0f, 4.25f)
                verticalLineTo(5.75f)
                curveTo(18.4518f, 5.75f, 21.25f, 8.5482f, 21.25f, 12.0f)
                horizontalLineTo(22.75f)
                close()
            }
        }
            .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
