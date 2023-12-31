package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.RewindBack: ImageVector
    get() {
        if (_rewindBack != null) {
            return _rewindBack!!
        }
        _rewindBack = Builder(
            name = "RewindBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.9998f, 17.5737f)
                lineTo(21.9998f, 6.4263f)
                curveTo(21.9998f, 4.5789f, 20.3991f, 3.4112f, 19.0966f, 4.3084f)
                lineTo(13.0f, 8.7684f)
                lineTo(13.0f, 7.123f)
                curveTo(13.0f, 5.5066f, 11.5327f, 4.4848f, 10.3388f, 5.2698f)
                lineTo(2.9214f, 10.1468f)
                curveTo(1.6929f, 10.9545f, 1.6929f, 13.0455f, 2.9214f, 13.8532f)
                lineTo(10.3388f, 18.7302f)
                curveTo(11.5327f, 19.5152f, 13.0f, 18.4934f, 13.0f, 16.877f)
                verticalLineTo(15.2316f)
                lineTo(19.0966f, 19.6916f)
                curveTo(20.3991f, 20.5888f, 21.9998f, 19.4211f, 21.9998f, 17.5737f)
                close()
            }
        }
            .build()
        return _rewindBack!!
    }

private var _rewindBack: ImageVector? = null
