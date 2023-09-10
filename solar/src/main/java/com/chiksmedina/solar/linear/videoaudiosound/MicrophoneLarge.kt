package com.chiksmedina.solar.linear.videoaudiosound

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
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.MicrophoneLarge: ImageVector
    get() {
        if (_microphoneLarge != null) {
            return _microphoneLarge!!
        }
        _microphoneLarge = Builder(
            name = "MicrophoneLarge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 16.3137f, 15.3137f, 19.0f, 12.0f, 19.0f)
                curveTo(8.6863f, 19.0f, 6.0f, 16.3137f, 6.0f, 13.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.5f)
                curveTo(10.0f, 6.5f, 10.4727f, 6.0f, 12.0f, 6.0f)
                curveTo(13.5273f, 6.0f, 14.0f, 6.5f, 14.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 9.5f)
                curveTo(10.0f, 9.5f, 10.4727f, 9.0f, 12.0f, 9.0f)
                curveTo(13.5273f, 9.0f, 14.0f, 9.5f, 14.0f, 9.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                verticalLineTo(11.0f)
            }
        }
            .build()
        return _microphoneLarge!!
    }

private var _microphoneLarge: ImageVector? = null
