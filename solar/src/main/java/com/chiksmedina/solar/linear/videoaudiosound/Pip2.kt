package com.chiksmedina.solar.linear.videoaudiosound

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
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Pip2: ImageVector
    get() {
        if (_pip2 != null) {
            return _pip2!!
        }
        _pip2 = Builder(name = "Pip2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2503f, 2.0f, 6.3754f, 2.9549f, 5.0611f)
                curveTo(3.2633f, 4.6366f, 3.6366f, 4.2633f, 4.0611f, 3.9549f)
                curveTo(5.3754f, 3.0f, 7.2503f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7497f, 3.0f, 18.6246f, 3.0f, 19.9389f, 3.9549f)
                curveTo(20.3634f, 4.2633f, 20.7367f, 4.6366f, 21.0451f, 5.0611f)
                curveTo(22.0f, 6.3754f, 22.0f, 8.2503f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7497f, 22.0f, 17.6246f, 21.0451f, 18.9389f)
                curveTo(20.7367f, 19.3634f, 20.3634f, 19.7367f, 19.9389f, 20.0451f)
                curveTo(18.6246f, 21.0f, 16.7497f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2503f, 21.0f, 5.3754f, 21.0f, 4.0611f, 20.0451f)
                curveTo(3.6366f, 19.7367f, 3.2633f, 19.3634f, 2.9549f, 18.9389f)
                curveTo(2.0f, 17.6246f, 2.0f, 15.7497f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                curveTo(11.0f, 13.0681f, 11.0f, 12.6022f, 11.1522f, 12.2346f)
                curveTo(11.3552f, 11.7446f, 11.7446f, 11.3552f, 12.2346f, 11.1522f)
                curveTo(12.6022f, 11.0f, 13.0681f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.9319f, 11.0f, 16.3978f, 11.0f, 16.7654f, 11.1522f)
                curveTo(17.2554f, 11.3552f, 17.6448f, 11.7446f, 17.8478f, 12.2346f)
                curveTo(18.0f, 12.6022f, 18.0f, 13.0681f, 18.0f, 14.0f)
                curveTo(18.0f, 14.9319f, 18.0f, 15.3978f, 17.8478f, 15.7654f)
                curveTo(17.6448f, 16.2554f, 17.2554f, 16.6448f, 16.7654f, 16.8478f)
                curveTo(16.3978f, 17.0f, 15.9319f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(13.0681f, 17.0f, 12.6022f, 17.0f, 12.2346f, 16.8478f)
                curveTo(11.7446f, 16.6448f, 11.3552f, 16.2554f, 11.1522f, 15.7654f)
                curveTo(11.0f, 15.3978f, 11.0f, 14.9319f, 11.0f, 14.0f)
                close()
            }
        }
        .build()
        return _pip2!!
    }

private var _pip2: ImageVector? = null
