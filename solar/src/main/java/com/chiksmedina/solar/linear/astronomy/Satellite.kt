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

public val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4699f, 10.918f)
                curveTo(18.4298f, 12.9581f, 15.1221f, 12.9581f, 13.082f, 10.918f)
                curveTo(11.0418f, 8.8778f, 11.0418f, 5.5702f, 13.082f, 3.5301f)
                moveTo(20.4699f, 10.918f)
                curveTo(22.51f, 8.8778f, 22.51f, 5.5702f, 20.4699f, 3.5301f)
                curveTo(18.4298f, 1.49f, 15.1221f, 1.49f, 13.082f, 3.5301f)
                moveTo(20.4699f, 10.918f)
                curveTo(20.4699f, 10.918f, 18.6229f, 10.3025f, 16.1602f, 7.8399f)
                moveTo(20.4699f, 10.918f)
                lineTo(14.3132f, 22.0f)
                moveTo(13.082f, 3.5301f)
                curveTo(13.082f, 3.5301f, 13.6976f, 5.3773f, 16.1602f, 7.8399f)
                moveTo(13.082f, 3.5301f)
                lineTo(2.0f, 9.6869f)
                moveTo(16.1602f, 7.8399f)
                lineTo(5.0f, 19.0f)
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
