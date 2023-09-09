package com.chiksmedina.solar.linear.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.WeatherGroup

public val WeatherGroup.Waterdrops: ImageVector
    get() {
        if (_waterdrops != null) {
            return _waterdrops!!
        }
        _waterdrops = Builder(name = "Waterdrops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.8332f)
                curveTo(10.0f, 20.1344f, 8.2091f, 21.9999f, 6.0f, 21.9999f)
                curveTo(3.7909f, 21.9999f, 2.0f, 20.1344f, 2.0f, 17.8332f)
                curveTo(2.0f, 16.3934f, 3.5659f, 14.4716f, 4.7382f, 13.2347f)
                curveTo(5.4322f, 12.5025f, 6.5678f, 12.5025f, 7.2618f, 13.2347f)
                curveTo(8.4341f, 14.4716f, 10.0f, 16.3934f, 10.0f, 17.8332f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.8332f)
                curveTo(22.0f, 20.1344f, 20.2091f, 21.9999f, 18.0f, 21.9999f)
                curveTo(15.7909f, 21.9999f, 14.0f, 20.1344f, 14.0f, 17.8332f)
                curveTo(14.0f, 16.3934f, 15.5659f, 14.4716f, 16.7382f, 13.2347f)
                curveTo(17.4322f, 12.5025f, 18.5678f, 12.5025f, 19.2618f, 13.2347f)
                curveTo(20.4341f, 14.4716f, 22.0f, 16.3934f, 22.0f, 17.8332f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 7.8332f)
                curveTo(16.0f, 10.1344f, 14.2091f, 11.9999f, 12.0f, 11.9999f)
                curveTo(9.7909f, 11.9999f, 8.0f, 10.1344f, 8.0f, 7.8332f)
                curveTo(8.0f, 6.3934f, 9.5659f, 4.4717f, 10.7382f, 3.2347f)
                curveTo(11.4322f, 2.5025f, 12.5678f, 2.5025f, 13.2618f, 3.2347f)
                curveTo(14.4341f, 4.4717f, 16.0f, 6.3934f, 16.0f, 7.8332f)
                close()
            }
        }
        .build()
        return _waterdrops!!
    }

private var _waterdrops: ImageVector? = null
