package com.chiksmedina.solar.broken.sports

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
import com.chiksmedina.solar.broken.SportsGroup

public val SportsGroup.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(3.0f, 17.0f)
                lineTo(5.5889f, 15.6918f)
                curveTo(5.8408f, 15.5645f, 6.0f, 15.3043f, 6.0f, 15.0196f)
                curveTo(6.0f, 12.0802f, 8.1377f, 9.5657f, 11.0067f, 9.0825f)
                curveTo(11.6598f, 8.9725f, 12.3402f, 8.9725f, 12.9933f, 9.0825f)
                curveTo(13.3404f, 9.141f, 13.6768f, 9.2292f, 14.0f, 9.3442f)
                moveTo(21.0f, 17.0f)
                lineTo(18.4111f, 15.6918f)
                curveTo(18.1592f, 15.5645f, 18.0f, 15.3043f, 18.0f, 15.0196f)
                curveTo(18.0f, 13.9268f, 17.7045f, 12.8928f, 17.1859f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 16.0f)
                lineTo(8.4583f, 17.389f)
                curveTo(8.4265f, 17.4314f, 8.4106f, 17.4526f, 8.3946f, 17.4728f)
                curveTo(8.1315f, 17.8053f, 7.7696f, 18.0456f, 7.361f, 18.1591f)
                curveTo(7.3362f, 18.166f, 7.3104f, 18.1724f, 7.259f, 18.1852f)
                lineTo(5.7742f, 18.5564f)
                curveTo(4.7315f, 18.8171f, 4.0f, 19.754f, 4.0f, 20.8288f)
                curveTo(4.0f, 21.4757f, 4.5244f, 22.0f, 5.1712f, 22.0f)
                horizontalLineTo(6.7273f)
                curveTo(7.3265f, 22.0f, 7.6262f, 22.0f, 7.917f, 21.9658f)
                curveTo(8.5972f, 21.8859f, 9.2537f, 21.667f, 9.8459f, 21.3229f)
                curveTo(10.0991f, 21.1757f, 10.3388f, 20.9959f, 10.8182f, 20.6364f)
                lineTo(11.0f, 20.5f)
                moveTo(11.0f, 20.5f)
                lineTo(13.0f, 19.0f)
                moveTo(11.0f, 20.5f)
                lineTo(13.5397f, 21.4524f)
                curveTo(14.1491f, 21.6809f, 14.4539f, 21.7952f, 14.7688f, 21.8688f)
                curveTo(14.9318f, 21.9069f, 15.0966f, 21.9368f, 15.2625f, 21.9583f)
                curveTo(15.5832f, 22.0f, 15.9087f, 22.0f, 16.5596f, 22.0f)
                horizontalLineTo(18.8288f)
                curveTo(19.4757f, 22.0f, 20.0f, 21.4757f, 20.0f, 20.8288f)
                curveTo(20.0f, 19.754f, 19.2685f, 18.8171f, 18.2258f, 18.5564f)
                lineTo(16.741f, 18.1852f)
                curveTo(16.6896f, 18.1724f, 16.6638f, 18.166f, 16.639f, 18.1591f)
                curveTo(16.2304f, 18.0456f, 15.8685f, 17.8053f, 15.6054f, 17.4728f)
                curveTo(15.5895f, 17.4526f, 15.5735f, 17.4313f, 15.5417f, 17.389f)
                lineTo(14.5f, 16.0f)
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
