package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                moveTo(4.0f, 9.0f)
                curveTo(4.4142f, 9.0f, 4.75f, 9.3358f, 4.75f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(4.75f, 14.7541f, 7.9959f, 18.0f, 12.0f, 18.0f)
                curveTo(16.0041f, 18.0f, 19.25f, 14.7541f, 19.25f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(19.25f, 9.3358f, 19.5858f, 9.0f, 20.0f, 9.0f)
                curveTo(20.4142f, 9.0f, 20.75f, 9.3358f, 20.75f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(20.75f, 15.3298f, 17.2314f, 19.0879f, 12.75f, 19.4683f)
                verticalLineTo(21.75f)
                curveTo(12.75f, 22.1642f, 12.4142f, 22.5f, 12.0f, 22.5f)
                curveTo(11.5858f, 22.5f, 11.25f, 22.1642f, 11.25f, 21.75f)
                verticalLineTo(19.4683f)
                curveTo(6.7686f, 19.0879f, 3.25f, 15.3298f, 3.25f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(3.25f, 9.3358f, 3.5858f, 9.0f, 4.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(8.8244f, 2.0f, 6.25f, 4.5744f, 6.25f, 7.75f)
                verticalLineTo(10.75f)
                curveTo(6.25f, 13.9256f, 8.8244f, 16.5f, 12.0f, 16.5f)
                curveTo(15.1756f, 16.5f, 17.75f, 13.9256f, 17.75f, 10.75f)
                verticalLineTo(7.75f)
                curveTo(17.75f, 4.5744f, 15.1756f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.0f, 11.5f)
                curveTo(14.4142f, 11.5f, 14.75f, 11.1642f, 14.75f, 10.75f)
                curveTo(14.75f, 10.3358f, 14.4142f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 10.0f, 9.25f, 10.3358f, 9.25f, 10.75f)
                curveTo(9.25f, 11.1642f, 9.5858f, 11.5f, 10.0f, 11.5f)
                horizontalLineTo(14.0f)
                close()
                moveTo(13.75f, 7.75f)
                curveTo(13.75f, 8.1642f, 13.4142f, 8.5f, 13.0f, 8.5f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 8.5f, 10.25f, 8.1642f, 10.25f, 7.75f)
                curveTo(10.25f, 7.3358f, 10.5858f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 7.0f, 13.75f, 7.3358f, 13.75f, 7.75f)
                close()
            }
        }
        .build()
        return _microphone3!!
    }

private var _microphone3: ImageVector? = null
