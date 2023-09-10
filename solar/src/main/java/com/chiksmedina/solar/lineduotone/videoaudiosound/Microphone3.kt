package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Microphone3: ImageVector
    get() {
        if (_microphone3 != null) {
            return _microphone3!!
        }
        _microphone3 = Builder(
            name = "Microphone3", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 5.2386f, 9.2386f, 3.0f, 12.0f, 3.0f)
                curveTo(14.7614f, 3.0f, 17.0f, 5.2386f, 17.0f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 13.7614f, 14.7614f, 16.0f, 12.0f, 16.0f)
                curveTo(9.2386f, 16.0f, 7.0f, 13.7614f, 7.0f, 11.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 11.0f)
                lineTo(14.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(20.0f, 15.4183f, 16.4183f, 19.0f, 12.0f, 19.0f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(4.0f, 15.4183f, 7.5817f, 19.0f, 12.0f, 19.0f)
                moveTo(12.0f, 19.0f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _microphone3!!
    }

private var _microphone3: ImageVector? = null
