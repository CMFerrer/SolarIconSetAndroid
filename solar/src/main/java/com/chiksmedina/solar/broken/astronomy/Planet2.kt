package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Planet2: ImageVector
    get() {
        if (_planet2 != null) {
            return _planet2!!
        }
        _planet2 = Builder(
            name = "Planet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6713f, 6.2247f)
                curveTo(19.7734f, 5.8104f, 21.3248f, 5.9572f, 21.8291f, 6.7633f)
                curveTo(22.8403f, 8.3795f, 19.2594f, 12.0342f, 13.8309f, 14.9264f)
                curveTo(8.4024f, 17.8185f, 3.182f, 18.8529f, 2.1709f, 17.2367f)
                curveTo(1.6552f, 16.4125f, 2.3338f, 15.0582f, 3.8426f, 13.5452f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 5.0703f)
                curveTo(9.1767f, 4.3896f, 10.5429f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 10.5429f, 4.3896f, 9.1767f, 5.0703f, 8.0f)
            }
        }
            .build()
        return _planet2!!
    }

private var _planet2: ImageVector? = null
