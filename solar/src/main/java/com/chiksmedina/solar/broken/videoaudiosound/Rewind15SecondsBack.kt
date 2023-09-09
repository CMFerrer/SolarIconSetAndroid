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

public val VideoAudioSoundGroup.Rewind15SecondsBack: ImageVector
    get() {
        if (_rewind15SecondsBack != null) {
            return _rewind15SecondsBack!!
        }
        _rewind15SecondsBack = Builder(name = "Rewind15SecondsBack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 10.5f)
                lineTo(10.0f, 8.5f)
                verticalLineTo(15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                lineTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(8.7288f, 22.0f, 5.8245f, 20.4293f, 4.0f, 18.001f)
                moveTo(8.0f, 2.8321f)
                curveTo(6.8775f, 3.3225f, 5.8625f, 4.013f, 5.0f, 4.8586f)
                curveTo(3.1486f, 6.6735f, 2.0f, 9.2026f, 2.0f, 12.0f)
                curveTo(2.0f, 12.6849f, 2.0689f, 13.3538f, 2.2f, 14.0f)
            }
        }
        .build()
        return _rewind15SecondsBack!!
    }

private var _rewind15SecondsBack: ImageVector? = null
