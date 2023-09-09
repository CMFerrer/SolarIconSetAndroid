package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Reel: ImageVector
    get() {
        if (_reel != null) {
            return _reel!!
        }
        _reel = Builder(name = "Reel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 22.0f, 22.0f, 21.6642f, 22.0f, 21.25f)
                curveTo(22.0f, 20.8358f, 21.6642f, 20.5f, 21.25f, 20.5f)
                horizontalLineTo(17.2704f)
                curveTo(20.1097f, 18.7358f, 22.0f, 15.5887f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.8284f, 9.0f, 13.5f, 8.3284f, 13.5f, 7.5f)
                curveTo(13.5f, 6.6716f, 12.8284f, 6.0f, 12.0f, 6.0f)
                curveTo(11.1716f, 6.0f, 10.5f, 6.6716f, 10.5f, 7.5f)
                curveTo(10.5f, 8.3284f, 11.1716f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(12.8284f, 18.0f, 13.5f, 17.3284f, 13.5f, 16.5f)
                curveTo(13.5f, 15.6716f, 12.8284f, 15.0f, 12.0f, 15.0f)
                curveTo(11.1716f, 15.0f, 10.5f, 15.6716f, 10.5f, 16.5f)
                curveTo(10.5f, 17.3284f, 11.1716f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(7.5f, 10.5f)
                curveTo(8.3284f, 10.5f, 9.0f, 11.1716f, 9.0f, 12.0f)
                curveTo(9.0f, 12.8284f, 8.3284f, 13.5f, 7.5f, 13.5f)
                curveTo(6.6716f, 13.5f, 6.0f, 12.8284f, 6.0f, 12.0f)
                curveTo(6.0f, 11.1716f, 6.6716f, 10.5f, 7.5f, 10.5f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 11.1716f, 17.3284f, 10.5f, 16.5f, 10.5f)
                curveTo(15.6716f, 10.5f, 15.0f, 11.1716f, 15.0f, 12.0f)
                curveTo(15.0f, 12.8284f, 15.6716f, 13.5f, 16.5f, 13.5f)
                curveTo(17.3284f, 13.5f, 18.0f, 12.8284f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _reel!!
    }

private var _reel: ImageVector? = null
