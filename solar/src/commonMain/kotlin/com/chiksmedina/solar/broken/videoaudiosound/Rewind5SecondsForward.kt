package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.Rewind5SecondsForward: ImageVector
    get() {
        if (_rewind5SecondsForward != null) {
            return _rewind5SecondsForward!!
        }
        _rewind5SecondsForward = Builder(
            name = "Rewind5SecondsForward", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 4.5f)
                lineTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.6849f, 2.0689f, 13.3538f, 2.2f, 14.0f)
                moveTo(16.0f, 2.8321f)
                curveTo(19.5318f, 4.3752f, 22.0f, 7.8994f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(8.7285f, 22.0f, 5.8244f, 20.4287f, 4.0f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 8.5f)
                horizontalLineTo(11.3604f)
                curveTo(11.1452f, 8.5f, 10.9541f, 8.6377f, 10.886f, 8.8419f)
                lineTo(10.2194f, 10.8419f)
                curveTo(10.1114f, 11.1657f, 10.3524f, 11.5f, 10.6937f, 11.5f)
                horizontalLineTo(12.0f)
                curveTo(13.1046f, 11.5f, 14.0f, 12.3954f, 14.0f, 13.5f)
                curveTo(14.0f, 14.6046f, 13.1046f, 15.5f, 12.0f, 15.5f)
                horizontalLineTo(10.0f)
            }
        }
            .build()
        return _rewind5SecondsForward!!
    }

private var _rewind5SecondsForward: ImageVector? = null
