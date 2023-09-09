package com.chiksmedina.solar.linear.sports

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
import com.chiksmedina.solar.linear.SportsGroup

public val SportsGroup.MeditationRound: ImageVector
    get() {
        if (_meditationRound != null) {
            return _meditationRound!!
        }
        _meditationRound = Builder(name = "MeditationRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                curveTo(14.5f, 5.8807f, 13.3807f, 7.0f, 12.0f, 7.0f)
                curveTo(10.6193f, 7.0f, 9.5f, 5.8807f, 9.5f, 4.5f)
                curveTo(9.5f, 3.1193f, 10.6193f, 2.0f, 12.0f, 2.0f)
                curveTo(13.3807f, 2.0f, 14.5f, 3.1193f, 14.5f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                lineTo(19.8423f, 16.61f)
                curveTo(19.6151f, 16.5335f, 19.399f, 16.4267f, 19.1998f, 16.2925f)
                lineTo(19.0985f, 16.2243f)
                curveTo(18.4122f, 15.762f, 18.0f, 14.9837f, 18.0f, 14.1502f)
                curveTo(18.0f, 11.713f, 16.2563f, 9.6331f, 13.8772f, 9.2325f)
                lineTo(12.9864f, 9.0824f)
                curveTo(12.5f, 8.9999f, 11.5f, 9.0f, 11.0136f, 9.0824f)
                lineTo(10.1228f, 9.2325f)
                curveTo(7.7437f, 9.6331f, 6.0f, 11.713f, 6.0f, 14.1502f)
                curveTo(6.0f, 14.9837f, 5.5878f, 15.762f, 4.9015f, 16.2243f)
                lineTo(4.8002f, 16.2925f)
                curveTo(4.601f, 16.4267f, 4.3849f, 16.5335f, 4.1577f, 16.61f)
                lineTo(3.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 16.0f)
                lineTo(8.5755f, 17.2327f)
                curveTo(8.4279f, 17.4294f, 8.3542f, 17.5278f, 8.2713f, 17.6144f)
                curveTo(8.0664f, 17.8287f, 7.8163f, 17.9947f, 7.5393f, 18.1004f)
                curveTo(7.4274f, 18.1432f, 7.3081f, 18.173f, 7.0695f, 18.2326f)
                lineTo(5.2761f, 18.681f)
                curveTo(4.5261f, 18.8685f, 4.0f, 19.5423f, 4.0f, 20.3153f)
                curveTo(4.0f, 21.2458f, 4.7543f, 22.0f, 5.6847f, 22.0f)
                horizontalLineTo(6.3684f)
                curveTo(8.0766f, 22.0f, 9.7387f, 21.446f, 11.1053f, 20.4211f)
                lineTo(13.0f, 19.0f)
                moveTo(14.5f, 16.0f)
                lineTo(15.2267f, 16.9689f)
                curveTo(15.5701f, 17.4269f, 15.7419f, 17.6558f, 15.9648f, 17.825f)
                curveTo(16.0318f, 17.8759f, 16.102f, 17.9225f, 16.1749f, 17.9645f)
                curveTo(16.4174f, 18.1043f, 16.695f, 18.1738f, 17.2503f, 18.3126f)
                lineTo(18.7239f, 18.681f)
                curveTo(19.4739f, 18.8685f, 20.0f, 19.5423f, 20.0f, 20.3153f)
                curveTo(20.0f, 21.2458f, 19.2458f, 22.0f, 18.3153f, 22.0f)
                horizontalLineTo(17.3776f)
                curveTo(16.8153f, 22.0f, 16.5342f, 22.0f, 16.2554f, 21.9844f)
                curveTo(15.4319f, 21.9384f, 14.6172f, 21.7907f, 13.83f, 21.5446f)
                curveTo(13.5635f, 21.4613f, 13.3003f, 21.3626f, 12.7738f, 21.1652f)
                lineTo(11.0f, 20.5f)
            }
        }
        .build()
        return _meditationRound!!
    }

private var _meditationRound: ImageVector? = null
