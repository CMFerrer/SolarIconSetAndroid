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

public val VideoAudioSoundGroup.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) {
            return _stopCircle!!
        }
        _stopCircle = Builder(name = "StopCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5858f, 8.5858f)
                curveTo(8.0f, 9.1716f, 8.0f, 10.1144f, 8.0f, 12.0f)
                curveTo(8.0f, 13.8856f, 8.0f, 14.8284f, 8.5858f, 15.4142f)
                curveTo(9.1716f, 16.0f, 10.1144f, 16.0f, 12.0f, 16.0f)
                curveTo(13.8856f, 16.0f, 14.8284f, 16.0f, 15.4142f, 15.4142f)
                curveTo(16.0f, 14.8284f, 16.0f, 13.8856f, 16.0f, 12.0f)
                curveTo(16.0f, 10.1144f, 16.0f, 9.1716f, 15.4142f, 8.5858f)
                curveTo(14.8284f, 8.0f, 13.8856f, 8.0f, 12.0f, 8.0f)
                curveTo(10.1144f, 8.0f, 9.1716f, 8.0f, 8.5858f, 8.5858f)
                close()
            }
        }
        .build()
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
