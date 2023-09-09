package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

public val VideoAudioSoundGroup.CameraMinimalistic: ImageVector
    get() {
        if (_cameraMinimalistic != null) {
            return _cameraMinimalistic!!
        }
        _cameraMinimalistic = Builder(name = "CameraMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 19.9999f)
                horizontalLineTo(14.0f)
                curveTo(16.8089f, 19.9999f, 18.2134f, 19.9999f, 19.2223f, 19.3258f)
                curveTo(19.659f, 19.0339f, 20.034f, 18.6589f, 20.3259f, 18.2222f)
                curveTo(21.0f, 17.2133f, 21.0f, 15.8088f, 21.0f, 12.9999f)
                curveTo(21.0f, 10.191f, 20.9998f, 8.7867f, 20.3257f, 7.7778f)
                curveTo(20.0339f, 7.3411f, 19.6589f, 6.9661f, 19.2221f, 6.6742f)
                curveTo(18.2132f, 6.0001f, 16.8088f, 6.0001f, 13.9998f, 6.0001f)
                horizontalLineTo(9.9998f)
                curveTo(7.1909f, 6.0001f, 5.7864f, 6.0001f, 4.7776f, 6.6742f)
                curveTo(4.3408f, 6.9661f, 3.9658f, 7.3411f, 3.6739f, 7.7778f)
                curveTo(3.0f, 8.7865f, 3.0f, 10.1903f, 3.0f, 12.998f)
                lineTo(3.0f, 12.9999f)
                curveTo(3.0f, 15.8088f, 3.0f, 17.2133f, 3.6741f, 18.2222f)
                curveTo(3.9659f, 18.6589f, 4.3409f, 19.0339f, 4.7777f, 19.3258f)
                curveTo(5.7866f, 19.9999f, 7.1911f, 19.9999f, 10.0f, 19.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                horizontalLineTo(17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 3.5f)
                horizontalLineTo(9.5f)
            }
        }
        .build()
        return _cameraMinimalistic!!
    }

private var _cameraMinimalistic: ImageVector? = null
