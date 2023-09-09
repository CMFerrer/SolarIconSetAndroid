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

public val VideoAudioSoundGroup.Microphone3: ImageVector
    get() {
        if (_microphone3 != null) {
            return _microphone3!!
        }
        _microphone3 = Builder(name = "Microphone3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 8.0f)
                curveTo(6.25f, 4.8244f, 8.8244f, 2.25f, 12.0f, 2.25f)
                curveTo(15.1756f, 2.25f, 17.75f, 4.8244f, 17.75f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(17.75f, 14.1756f, 15.1756f, 16.75f, 12.0f, 16.75f)
                curveTo(8.8244f, 16.75f, 6.25f, 14.1756f, 6.25f, 11.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 3.75f)
                curveTo(9.6528f, 3.75f, 7.75f, 5.6528f, 7.75f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(7.75f, 13.3472f, 9.6528f, 15.25f, 12.0f, 15.25f)
                curveTo(14.3472f, 15.25f, 16.25f, 13.3472f, 16.25f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(16.25f, 5.6528f, 14.3472f, 3.75f, 12.0f, 3.75f)
                close()
                moveTo(10.25f, 8.0f)
                curveTo(10.25f, 7.5858f, 10.5858f, 7.25f, 11.0f, 7.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 7.25f, 13.75f, 7.5858f, 13.75f, 8.0f)
                curveTo(13.75f, 8.4142f, 13.4142f, 8.75f, 13.0f, 8.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 8.75f, 10.25f, 8.4142f, 10.25f, 8.0f)
                close()
                moveTo(4.0f, 9.25f)
                curveTo(4.4142f, 9.25f, 4.75f, 9.5858f, 4.75f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(4.75f, 15.0041f, 7.9959f, 18.25f, 12.0f, 18.25f)
                curveTo(16.0041f, 18.25f, 19.25f, 15.0041f, 19.25f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(19.25f, 9.5858f, 19.5858f, 9.25f, 20.0f, 9.25f)
                curveTo(20.4142f, 9.25f, 20.75f, 9.5858f, 20.75f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(20.75f, 15.5798f, 17.2314f, 19.3379f, 12.75f, 19.7183f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(19.7183f)
                curveTo(6.7686f, 19.3379f, 3.25f, 15.5798f, 3.25f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(3.25f, 9.5858f, 3.5858f, 9.25f, 4.0f, 9.25f)
                close()
                moveTo(9.25f, 11.0f)
                curveTo(9.25f, 10.5858f, 9.5858f, 10.25f, 10.0f, 10.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 10.25f, 14.75f, 10.5858f, 14.75f, 11.0f)
                curveTo(14.75f, 11.4142f, 14.4142f, 11.75f, 14.0f, 11.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 11.75f, 9.25f, 11.4142f, 9.25f, 11.0f)
                close()
            }
        }
        .build()
        return _microphone3!!
    }

private var _microphone3: ImageVector? = null
