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

val VideoAudioSoundGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(
            name = "Podcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.2643f, 9.5572f)
                curveTo(5.4923f, 6.0357f, 8.4208f, 3.25f, 12.0f, 3.25f)
                curveTo(15.5791f, 3.25f, 18.5077f, 6.0357f, 18.7357f, 9.5572f)
                curveTo(19.1142f, 9.3609f, 19.5441f, 9.25f, 20.0f, 9.25f)
                curveTo(21.5188f, 9.25f, 22.75f, 10.4812f, 22.75f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(22.75f, 15.5188f, 21.5188f, 16.75f, 20.0f, 16.75f)
                curveTo(19.9484f, 16.75f, 19.8971f, 16.7486f, 19.8461f, 16.7458f)
                verticalLineTo(16.75f)
                curveTo(18.4123f, 16.75f, 17.25f, 15.5877f, 17.25f, 14.1538f)
                verticalLineTo(10.0f)
                curveTo(17.25f, 7.1005f, 14.8995f, 4.75f, 12.0f, 4.75f)
                curveTo(9.1005f, 4.75f, 6.75f, 7.1005f, 6.75f, 10.0f)
                verticalLineTo(14.1538f)
                curveTo(6.75f, 15.5877f, 5.5877f, 16.75f, 4.1539f, 16.75f)
                verticalLineTo(16.7458f)
                curveTo(4.1029f, 16.7486f, 4.0516f, 16.75f, 4.0f, 16.75f)
                curveTo(2.4812f, 16.75f, 1.25f, 15.5188f, 1.25f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(1.25f, 10.4812f, 2.4812f, 9.25f, 4.0f, 9.25f)
                curveTo(4.4558f, 9.25f, 4.8858f, 9.3609f, 5.2643f, 9.5572f)
                close()
                moveTo(5.25f, 11.9992f)
                curveTo(5.2496f, 11.3092f, 4.6901f, 10.75f, 4.0f, 10.75f)
                curveTo(3.3096f, 10.75f, 2.75f, 11.3096f, 2.75f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 14.6904f, 3.3096f, 15.25f, 4.0f, 15.25f)
                curveTo(4.6901f, 15.25f, 5.2496f, 14.6908f, 5.25f, 14.0008f)
                curveTo(5.25f, 14.0005f, 5.25f, 14.001f, 5.25f, 14.0008f)
                verticalLineTo(11.9992f)
                curveTo(5.25f, 11.999f, 5.25f, 11.9995f, 5.25f, 11.9992f)
                close()
                moveTo(8.25f, 10.0f)
                curveTo(8.25f, 7.9289f, 9.9289f, 6.25f, 12.0f, 6.25f)
                curveTo(14.0711f, 6.25f, 15.75f, 7.9289f, 15.75f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(15.75f, 14.8142f, 14.4617f, 16.3275f, 12.75f, 16.675f)
                verticalLineTo(19.0f)
                curveTo(12.75f, 19.4142f, 12.4142f, 19.75f, 12.0f, 19.75f)
                curveTo(11.5858f, 19.75f, 11.25f, 19.4142f, 11.25f, 19.0f)
                verticalLineTo(16.675f)
                curveTo(9.5383f, 16.3275f, 8.25f, 14.8142f, 8.25f, 13.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.878f, 9.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 9.25f, 10.75f, 9.5858f, 10.75f, 10.0f)
                curveTo(10.75f, 10.4142f, 10.4142f, 10.75f, 10.0f, 10.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(12.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 12.25f, 10.75f, 12.5858f, 10.75f, 13.0f)
                curveTo(10.75f, 13.4142f, 10.4142f, 13.75f, 10.0f, 13.75f)
                horizontalLineTo(9.878f)
                curveTo(10.1869f, 14.6239f, 11.0203f, 15.25f, 12.0f, 15.25f)
                curveTo(12.9797f, 15.25f, 13.8131f, 14.6239f, 14.122f, 13.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 13.75f, 12.25f, 13.4142f, 12.25f, 13.0f)
                curveTo(12.25f, 12.5858f, 12.5858f, 12.25f, 13.0f, 12.25f)
                horizontalLineTo(14.25f)
                verticalLineTo(10.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 10.75f, 12.25f, 10.4142f, 12.25f, 10.0f)
                curveTo(12.25f, 9.5858f, 12.5858f, 9.25f, 13.0f, 9.25f)
                horizontalLineTo(14.122f)
                curveTo(13.8131f, 8.3761f, 12.9797f, 7.75f, 12.0f, 7.75f)
                curveTo(11.0203f, 7.75f, 10.1869f, 8.3761f, 9.878f, 9.25f)
                close()
                moveTo(20.0f, 10.75f)
                curveTo(19.3096f, 10.75f, 18.75f, 11.3096f, 18.75f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(18.75f, 14.6904f, 19.3096f, 15.25f, 20.0f, 15.25f)
                curveTo(20.6904f, 15.25f, 21.25f, 14.6904f, 21.25f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 11.3096f, 20.6904f, 10.75f, 20.0f, 10.75f)
                close()
            }
        }
            .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
