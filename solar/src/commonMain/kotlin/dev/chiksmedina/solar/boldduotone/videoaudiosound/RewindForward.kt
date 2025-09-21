package dev.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.RewindForward: ImageVector
    get() {
        if (_rewindForward != null) {
            return _rewindForward!!
        }
        _rewindForward = Builder(
            name = "RewindForward", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 6.4263f)
                lineTo(2.0f, 17.5737f)
                curveTo(2.0f, 19.4211f, 3.6007f, 20.5888f, 4.9031f, 19.6916f)
                lineTo(10.9998f, 15.2316f)
                verticalLineTo(8.7684f)
                lineTo(4.9031f, 4.3084f)
                curveTo(3.6006f, 3.4112f, 2.0f, 4.5789f, 2.0f, 6.4263f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 7.123f)
                lineTo(11.0f, 8.7684f)
                verticalLineTo(15.2316f)
                verticalLineTo(16.877f)
                curveTo(11.0f, 18.4934f, 12.4673f, 19.5152f, 13.6612f, 18.7302f)
                lineTo(21.0786f, 13.8532f)
                curveTo(22.3071f, 13.0455f, 22.3071f, 10.9545f, 21.0786f, 10.1468f)
                lineTo(13.6612f, 5.2698f)
                curveTo(12.4673f, 4.4848f, 11.0f, 5.5066f, 11.0f, 7.123f)
                close()
            }
        }
            .build()
        return _rewindForward!!
    }

private var _rewindForward: ImageVector? = null
