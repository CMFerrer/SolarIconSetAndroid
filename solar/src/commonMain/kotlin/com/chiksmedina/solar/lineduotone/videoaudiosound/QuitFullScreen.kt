package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.QuitFullScreen: ImageVector
    get() {
        if (_quitFullScreen != null) {
            return _quitFullScreen!!
        }
        _quitFullScreen = Builder(
            name = "QuitFullScreen", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0f)
                curveTo(14.0f, 18.2288f, 14.0f, 16.3431f, 15.1716f, 15.1716f)
                curveTo(16.3431f, 14.0f, 18.2288f, 14.0f, 22.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(5.7712f, 14.0f, 7.6568f, 14.0f, 8.8284f, 15.1716f)
                curveTo(10.0f, 16.3431f, 10.0f, 18.2288f, 10.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(5.7712f, 10.0f, 7.6568f, 10.0f, 8.8284f, 8.8284f)
                curveTo(10.0f, 7.6568f, 10.0f, 5.7712f, 10.0f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 10.0f)
                curveTo(18.2288f, 10.0f, 16.3431f, 10.0f, 15.1716f, 8.8284f)
                curveTo(14.0f, 7.6568f, 14.0f, 5.7712f, 14.0f, 2.0f)
            }
        }
            .build()
        return _quitFullScreen!!
    }

private var _quitFullScreen: ImageVector? = null
