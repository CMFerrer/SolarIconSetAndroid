package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.RepeatOne: ImageVector
    get() {
        if (_repeatOne != null) {
            return _repeatOne!!
        }
        _repeatOne = Builder(name = "RepeatOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5303f, 2.4697f)
                curveTo(9.2374f, 2.1768f, 8.7626f, 2.1768f, 8.4697f, 2.4697f)
                curveTo(8.1768f, 2.7626f, 8.1768f, 3.2374f, 8.4697f, 3.5303f)
                lineTo(9.1893f, 4.25f)
                horizontalLineTo(9.0f)
                curveTo(4.7198f, 4.25f, 1.25f, 7.7198f, 1.25f, 12.0f)
                curveTo(1.25f, 16.2802f, 4.7201f, 19.75f, 9.0003f, 19.75f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 19.75f, 10.25f, 19.4142f, 10.25f, 19.0f)
                curveTo(10.25f, 18.5858f, 9.9142f, 18.25f, 9.5f, 18.25f)
                horizontalLineTo(9.0003f)
                curveTo(5.5485f, 18.25f, 2.75f, 15.4517f, 2.75f, 12.0f)
                curveTo(2.75f, 8.5482f, 5.5482f, 5.75f, 9.0f, 5.75f)
                horizontalLineTo(11.0f)
                curveTo(11.3033f, 5.75f, 11.5768f, 5.5673f, 11.6929f, 5.287f)
                curveTo(11.809f, 5.0068f, 11.7448f, 4.6842f, 11.5303f, 4.4697f)
                lineTo(9.5303f, 2.4697f)
                close()
                moveTo(14.5f, 4.25f)
                curveTo(14.0858f, 4.25f, 13.75f, 4.5858f, 13.75f, 5.0f)
                curveTo(13.75f, 5.4142f, 14.0858f, 5.75f, 14.5f, 5.75f)
                horizontalLineTo(15.0f)
                curveTo(18.4518f, 5.75f, 21.25f, 8.5482f, 21.25f, 12.0f)
                curveTo(21.25f, 15.4518f, 18.4518f, 18.25f, 15.0f, 18.25f)
                horizontalLineTo(13.0f)
                curveTo(12.6967f, 18.25f, 12.4232f, 18.4327f, 12.3071f, 18.713f)
                curveTo(12.191f, 18.9932f, 12.2552f, 19.3158f, 12.4697f, 19.5303f)
                lineTo(14.4697f, 21.5303f)
                curveTo(14.7626f, 21.8232f, 15.2374f, 21.8232f, 15.5303f, 21.5303f)
                curveTo(15.8232f, 21.2374f, 15.8232f, 20.7626f, 15.5303f, 20.4697f)
                lineTo(14.8107f, 19.75f)
                horizontalLineTo(15.0f)
                curveTo(19.2802f, 19.75f, 22.75f, 16.2802f, 22.75f, 12.0f)
                curveTo(22.75f, 7.7198f, 19.2802f, 4.25f, 15.0f, 4.25f)
                horizontalLineTo(14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 10.0f)
                curveTo(12.75f, 9.6967f, 12.5673f, 9.4232f, 12.287f, 9.3071f)
                curveTo(12.0068f, 9.191f, 11.6842f, 9.2552f, 11.4697f, 9.4697f)
                lineTo(9.9697f, 10.9697f)
                curveTo(9.6768f, 11.2626f, 9.6768f, 11.7375f, 9.9697f, 12.0304f)
                curveTo(10.2626f, 12.3232f, 10.7374f, 12.3232f, 11.0303f, 12.0304f)
                lineTo(11.25f, 11.8107f)
                verticalLineTo(14.0f)
                curveTo(11.25f, 14.4142f, 11.5858f, 14.75f, 12.0f, 14.75f)
                curveTo(12.4142f, 14.75f, 12.75f, 14.4142f, 12.75f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _repeatOne!!
    }

private var _repeatOne: ImageVector? = null
