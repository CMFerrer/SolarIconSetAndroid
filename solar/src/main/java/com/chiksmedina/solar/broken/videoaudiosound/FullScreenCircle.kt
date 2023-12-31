package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.FullScreenCircle: ImageVector
    get() {
        if (_fullScreenCircle != null) {
            return _fullScreenCircle!!
        }
        _fullScreenCircle = Builder(
            name = "FullScreenCircle", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 9.9974f)
                curveTo(6.0145f, 8.2908f, 6.1092f, 7.35f, 6.7296f, 6.7296f)
                curveTo(7.35f, 6.1092f, 8.2908f, 6.0145f, 9.9974f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 14.0007f)
                curveTo(6.0145f, 15.7072f, 6.1092f, 16.648f, 6.7296f, 17.2684f)
                curveTo(7.35f, 17.8888f, 8.2908f, 17.9836f, 9.9974f, 17.998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9976f, 9.9974f)
                curveTo(17.9831f, 8.2908f, 17.8883f, 7.35f, 17.2679f, 6.7296f)
                curveTo(16.6475f, 6.1092f, 15.7067f, 6.0145f, 14.0002f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9976f, 14.0007f)
                curveTo(17.9831f, 15.7072f, 17.8883f, 16.648f, 17.2679f, 17.2684f)
                curveTo(16.6475f, 17.8888f, 15.7067f, 17.9836f, 14.0002f, 17.998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _fullScreenCircle!!
    }

private var _fullScreenCircle: ImageVector? = null
