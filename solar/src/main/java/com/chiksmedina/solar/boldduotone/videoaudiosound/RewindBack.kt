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

public val VideoAudioSoundGroup.RewindBack: ImageVector
    get() {
        if (_rewindBack != null) {
            return _rewindBack!!
        }
        _rewindBack = Builder(name = "RewindBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.0f, 6.4263f)
                lineTo(22.0f, 17.5737f)
                curveTo(22.0f, 19.4211f, 20.3994f, 20.5888f, 19.0969f, 19.6916f)
                lineTo(13.0002f, 15.2316f)
                verticalLineTo(8.7684f)
                lineTo(19.0969f, 4.3084f)
                curveTo(20.3994f, 3.4112f, 22.0f, 4.5789f, 22.0f, 6.4263f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.123f)
                lineTo(13.0f, 16.877f)
                curveTo(13.0f, 18.4934f, 11.5327f, 19.5152f, 10.3388f, 18.7302f)
                lineTo(2.9214f, 13.8532f)
                curveTo(1.6929f, 13.0455f, 1.6929f, 10.9545f, 2.9214f, 10.1468f)
                lineTo(10.3388f, 5.2698f)
                curveTo(11.5327f, 4.4848f, 13.0f, 5.5066f, 13.0f, 7.123f)
                close()
            }
        }
        .build()
        return _rewindBack!!
    }

private var _rewindBack: ImageVector? = null
