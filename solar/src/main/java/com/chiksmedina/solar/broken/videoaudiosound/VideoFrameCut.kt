package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

public val VideoAudioSoundGroup.VideoFrameCut: ImageVector
    get() {
        if (_videoFrameCut != null) {
            return _videoFrameCut!!
        }
        _videoFrameCut = Builder(name = "VideoFrameCut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                verticalLineTo(20.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.5f)
                verticalLineTo(20.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.5f)
                lineTo(7.0f, 8.5f)
                moveTo(21.0f, 8.5f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 15.5f)
                lineTo(5.75f, 15.5f)
                lineTo(7.0f, 15.5f)
                moveTo(21.0f, 15.5f)
                lineTo(17.0f, 15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 3.0029f)
                curveTo(17.2939f, 3.0233f, 18.8237f, 3.1664f, 19.8284f, 4.1711f)
                curveTo(20.8916f, 5.2343f, 20.99f, 6.8854f, 20.9991f, 10.0f)
                moveTo(14.5f, 20.9962f)
                curveTo(17.2939f, 20.9758f, 18.8237f, 20.8327f, 19.8284f, 19.828f)
                curveTo(20.8916f, 18.7648f, 20.99f, 17.1137f, 20.9991f, 13.9991f)
                moveTo(9.4999f, 20.9962f)
                curveTo(6.7061f, 20.9758f, 5.1763f, 20.8327f, 4.1716f, 19.828f)
                curveTo(3.0f, 18.6564f, 3.0f, 16.7708f, 3.0f, 12.9995f)
                verticalLineTo(10.9995f)
                curveTo(3.0f, 7.2283f, 3.0f, 5.3427f, 4.1716f, 4.1711f)
                curveTo(5.1763f, 3.1664f, 6.7061f, 3.0233f, 9.4999f, 3.0029f)
            }
        }
        .build()
        return _videoFrameCut!!
    }

private var _videoFrameCut: ImageVector? = null
