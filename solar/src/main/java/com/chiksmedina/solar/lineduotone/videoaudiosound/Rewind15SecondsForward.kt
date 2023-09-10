package com.chiksmedina.solar.lineduotone.videoaudiosound

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
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Rewind15SecondsForward: ImageVector
    get() {
        if (_rewind15SecondsForward != null) {
            return _rewind15SecondsForward!!
        }
        _rewind15SecondsForward = Builder(
            name = "Rewind15SecondsForward", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 4.5f)
                lineTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 7.8994f, 19.5318f, 4.3752f, 16.0f, 2.8321f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 8.5f)
                horizontalLineTo(13.8604f)
                curveTo(13.6452f, 8.5f, 13.4541f, 8.6377f, 13.386f, 8.8419f)
                lineTo(12.7194f, 10.8419f)
                curveTo(12.6114f, 11.1657f, 12.8524f, 11.5f, 13.1937f, 11.5f)
                horizontalLineTo(14.5f)
                curveTo(15.6046f, 11.5f, 16.5f, 12.3954f, 16.5f, 13.5f)
                curveTo(16.5f, 14.6046f, 15.6046f, 15.5f, 14.5f, 15.5f)
                horizontalLineTo(12.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 10.5f)
                lineTo(10.0f, 8.5f)
                verticalLineTo(15.5f)
            }
        }
            .build()
        return _rewind15SecondsForward!!
    }

private var _rewind15SecondsForward: ImageVector? = null
