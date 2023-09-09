package com.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.AstronomyGroup

public val AstronomyGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0005f, 8.0f)
                curveTo(9.1647f, 7.3721f, 8.1258f, 7.0f, 7.0f, 7.0f)
                curveTo(4.2386f, 7.0f, 2.0f, 9.2386f, 2.0f, 12.0f)
                curveTo(2.0f, 14.7614f, 4.2386f, 17.0f, 7.0f, 17.0f)
                curveTo(9.7614f, 17.0f, 10.5f, 15.0f, 12.0f, 12.0f)
                curveTo(13.5f, 9.0f, 14.2386f, 7.0f, 17.0f, 7.0f)
                curveTo(19.7614f, 7.0f, 22.0f, 9.2386f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7614f, 19.7614f, 17.0f, 17.0f, 17.0f)
                curveTo(15.8743f, 17.0f, 14.8357f, 16.6278f, 14.0f, 16.0f)
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
