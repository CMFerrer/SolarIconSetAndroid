package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val VideoAudioSoundGroup.Pip2: ImageVector
    get() {
        if (_pip2 != null) {
            return _pip2!!
        }
        _pip2 = Builder(name = "Pip2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.9549f, 5.0611f)
                curveTo(2.0f, 6.3754f, 2.0f, 8.2503f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7497f, 2.0f, 17.6246f, 2.9549f, 18.9389f)
                curveTo(3.2633f, 19.3634f, 3.6366f, 19.7367f, 4.0611f, 20.0451f)
                curveTo(5.3754f, 21.0f, 7.2503f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7497f, 21.0f, 18.6246f, 21.0f, 19.9389f, 20.0451f)
                curveTo(20.3634f, 19.7367f, 20.7367f, 19.3634f, 21.0451f, 18.9389f)
                curveTo(22.0f, 17.6246f, 22.0f, 15.7497f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2503f, 22.0f, 6.3754f, 21.0451f, 5.0611f)
                curveTo(20.7367f, 4.6366f, 20.3634f, 4.2633f, 19.9389f, 3.9549f)
                curveTo(18.6246f, 3.0f, 16.7497f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2503f, 3.0f, 5.3754f, 3.0f, 4.0611f, 3.9549f)
                curveTo(3.6366f, 4.2633f, 3.2633f, 4.6366f, 2.9549f, 5.0611f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 13.4128f, 11.0f, 12.8692f, 11.174f, 12.4404f)
                curveTo(11.406f, 11.8687f, 11.8509f, 11.4144f, 12.411f, 11.1776f)
                curveTo(12.8311f, 11.0f, 13.3636f, 11.0f, 14.4286f, 11.0f)
                horizontalLineTo(15.5714f)
                curveTo(16.6364f, 11.0f, 17.1689f, 11.0f, 17.589f, 11.1776f)
                curveTo(18.1491f, 11.4144f, 18.594f, 11.8687f, 18.826f, 12.4404f)
                curveTo(19.0f, 12.8692f, 19.0f, 13.4128f, 19.0f, 14.5f)
                curveTo(19.0f, 15.5872f, 19.0f, 16.1308f, 18.826f, 16.5596f)
                curveTo(18.594f, 17.1313f, 18.1491f, 17.5856f, 17.589f, 17.8224f)
                curveTo(17.1689f, 18.0f, 16.6364f, 18.0f, 15.5714f, 18.0f)
                horizontalLineTo(14.4286f)
                curveTo(13.3636f, 18.0f, 12.8311f, 18.0f, 12.411f, 17.8224f)
                curveTo(11.8509f, 17.5856f, 11.406f, 17.1313f, 11.174f, 16.5596f)
                curveTo(11.0f, 16.1308f, 11.0f, 15.5872f, 11.0f, 14.5f)
                close()
            }
        }
        .build()
        return _pip2!!
    }

private var _pip2: ImageVector? = null
