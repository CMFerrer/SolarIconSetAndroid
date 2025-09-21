package dev.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0002f, 15.2316f)
                lineTo(19.0969f, 19.6916f)
                curveTo(20.3994f, 20.5888f, 22.0f, 19.4211f, 22.0f, 17.5737f)
                lineTo(22.0f, 15.0f)
                moveTo(13.0002f, 8.7684f)
                lineTo(19.0969f, 4.3084f)
                curveTo(20.3994f, 3.4112f, 22.0f, 4.5789f, 22.0f, 6.4263f)
                lineTo(22.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.6301f, 7.7083f)
                lineTo(10.3388f, 5.2698f)
                curveTo(11.5327f, 4.4848f, 13.0f, 5.5066f, 13.0f, 7.123f)
                verticalLineTo(16.877f)
                curveTo(13.0f, 18.4934f, 11.5327f, 19.5152f, 10.3388f, 18.7302f)
                lineTo(2.9214f, 13.8532f)
                curveTo(1.6929f, 13.0455f, 1.6929f, 10.9545f, 2.9214f, 10.1468f)
                lineTo(3.8485f, 9.5372f)
            }
        }
            .build()
        return _rewindBack!!
    }

private var _rewindBack: ImageVector? = null
