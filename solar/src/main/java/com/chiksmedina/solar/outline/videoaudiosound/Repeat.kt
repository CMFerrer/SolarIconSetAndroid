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

public val VideoAudioSoundGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.4697f, 2.4697f)
                curveTo(8.7626f, 2.1768f, 9.2374f, 2.1768f, 9.5303f, 2.4697f)
                lineTo(11.5303f, 4.4697f)
                curveTo(11.7448f, 4.6842f, 11.809f, 5.0068f, 11.6929f, 5.287f)
                curveTo(11.5768f, 5.5673f, 11.3033f, 5.75f, 11.0f, 5.75f)
                horizontalLineTo(9.0f)
                curveTo(5.5482f, 5.75f, 2.75f, 8.5482f, 2.75f, 12.0f)
                curveTo(2.75f, 15.4517f, 5.5485f, 18.25f, 9.0003f, 18.25f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 18.25f, 10.25f, 18.5858f, 10.25f, 19.0f)
                curveTo(10.25f, 19.4142f, 9.9142f, 19.75f, 9.5f, 19.75f)
                horizontalLineTo(9.0003f)
                curveTo(4.7201f, 19.75f, 1.25f, 16.2802f, 1.25f, 12.0f)
                curveTo(1.25f, 7.7198f, 4.7198f, 4.25f, 9.0f, 4.25f)
                horizontalLineTo(9.1893f)
                lineTo(8.4697f, 3.5303f)
                curveTo(8.1768f, 3.2374f, 8.1768f, 2.7626f, 8.4697f, 2.4697f)
                close()
                moveTo(13.75f, 5.0f)
                curveTo(13.75f, 4.5858f, 14.0858f, 4.25f, 14.5f, 4.25f)
                horizontalLineTo(15.0f)
                curveTo(19.2802f, 4.25f, 22.75f, 7.7198f, 22.75f, 12.0f)
                curveTo(22.75f, 16.2802f, 19.2802f, 19.75f, 15.0f, 19.75f)
                horizontalLineTo(14.8107f)
                lineTo(15.5303f, 20.4697f)
                curveTo(15.8232f, 20.7626f, 15.8232f, 21.2374f, 15.5303f, 21.5303f)
                curveTo(15.2374f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                lineTo(12.4697f, 19.5303f)
                curveTo(12.2552f, 19.3158f, 12.191f, 18.9932f, 12.3071f, 18.713f)
                curveTo(12.4232f, 18.4327f, 12.6967f, 18.25f, 13.0f, 18.25f)
                horizontalLineTo(15.0f)
                curveTo(18.4518f, 18.25f, 21.25f, 15.4518f, 21.25f, 12.0f)
                curveTo(21.25f, 8.5482f, 18.4518f, 5.75f, 15.0f, 5.75f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 5.75f, 13.75f, 5.4142f, 13.75f, 5.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
