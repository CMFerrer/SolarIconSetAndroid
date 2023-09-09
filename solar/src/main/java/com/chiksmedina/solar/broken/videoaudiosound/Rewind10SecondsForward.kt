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

public val VideoAudioSoundGroup.Rewind10SecondsForward: ImageVector
    get() {
        if (_rewind10SecondsForward != null) {
            return _rewind10SecondsForward!!
        }
        _rewind10SecondsForward = Builder(name = "Rewind10SecondsForward", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 10.5f)
                lineTo(10.0f, 8.5f)
                verticalLineTo(15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(12.5f, 9.2835f, 13.2835f, 8.5f, 14.25f, 8.5f)
                curveTo(15.2165f, 8.5f, 16.0f, 9.2835f, 16.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(16.0f, 14.7165f, 15.2165f, 15.5f, 14.25f, 15.5f)
                curveTo(13.2835f, 15.5f, 12.5f, 14.7165f, 12.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.5f)
                lineTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.6849f, 2.0689f, 13.3538f, 2.2f, 14.0f)
                moveTo(16.0f, 2.8321f)
                curveTo(19.5318f, 4.3752f, 22.0f, 7.8994f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(8.7285f, 22.0f, 5.8244f, 20.4287f, 4.0f, 18.0f)
            }
        }
        .build()
        return _rewind10SecondsForward!!
    }

private var _rewind10SecondsForward: ImageVector? = null
