package com.chiksmedina.solar.bold.videoaudiosound

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
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.ToPip: ImageVector
    get() {
        if (_toPip != null) {
            return _toPip!!
        }
        _toPip = Builder(
            name = "ToPip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0f)
                curveTo(13.0f, 15.1144f, 13.0f, 14.1716f, 13.5858f, 13.5858f)
                curveTo(14.1716f, 13.0f, 15.1144f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 13.0f, 20.8284f, 13.0f, 21.4142f, 13.5858f)
                curveTo(22.0f, 14.1716f, 22.0f, 15.1144f, 22.0f, 17.0f)
                curveTo(22.0f, 18.8856f, 22.0f, 19.8284f, 21.4142f, 20.4142f)
                curveTo(20.8284f, 21.0f, 19.8856f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(15.1144f, 21.0f, 14.1716f, 21.0f, 13.5858f, 20.4142f)
                curveTo(13.0f, 19.8284f, 13.0f, 18.8856f, 13.0f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 3.0f, 19.6569f, 3.0f, 20.8284f, 4.1716f)
                curveTo(21.7775f, 5.1206f, 21.9577f, 6.8663f, 21.992f, 9.4997f)
                curveTo(22.0042f, 10.4366f, 22.0102f, 10.905f, 21.7166f, 11.2025f)
                curveTo(21.4229f, 11.5f, 20.9486f, 11.5f, 20.0f, 11.5f)
                horizontalLineTo(17.5f)
                curveTo(14.6716f, 11.5f, 13.2574f, 11.5f, 12.3787f, 12.3787f)
                curveTo(11.5f, 13.2574f, 11.5f, 14.6716f, 11.5f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(11.5f, 19.9659f, 11.5f, 20.1989f, 11.4239f, 20.3827f)
                curveTo(11.3224f, 20.6277f, 11.1277f, 20.8224f, 10.8827f, 20.9239f)
                curveTo(10.6989f, 21.0f, 10.4659f, 21.0f, 10.0f, 21.0f)
                curveTo(6.2288f, 21.0f, 4.3432f, 21.0f, 3.1716f, 19.8284f)
                curveTo(2.0f, 18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 7.2288f, 2.0f, 5.3432f, 3.1716f, 4.1716f)
                curveTo(4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(8.0303f, 6.9697f)
                curveTo(7.7374f, 6.6768f, 7.2626f, 6.6768f, 6.9697f, 6.9697f)
                curveTo(6.6768f, 7.2626f, 6.6768f, 7.7374f, 6.9697f, 8.0303f)
                lineTo(9.6893f, 10.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 10.75f, 7.75f, 11.0858f, 7.75f, 11.5f)
                curveTo(7.75f, 11.9142f, 8.0858f, 12.25f, 8.5f, 12.25f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 12.25f, 12.25f, 11.9142f, 12.25f, 11.5f)
                verticalLineTo(8.5f)
                curveTo(12.25f, 8.0858f, 11.9142f, 7.75f, 11.5f, 7.75f)
                curveTo(11.0858f, 7.75f, 10.75f, 8.0858f, 10.75f, 8.5f)
                verticalLineTo(9.6893f)
                lineTo(8.0303f, 6.9697f)
                close()
            }
        }
            .build()
        return _toPip!!
    }

private var _toPip: ImageVector? = null
