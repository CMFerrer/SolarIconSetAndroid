package com.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.WeatherGroup

public val WeatherGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.0f, 11.9999f)
                curveTo(22.0f, 17.5228f, 17.5228f, 21.9999f, 12.0f, 21.9999f)
                curveTo(10.8358f, 21.9999f, 9.718f, 21.801f, 8.6789f, 21.4352f)
                curveTo(8.2414f, 20.3767f, 8.0f, 19.2165f, 8.0f, 17.9999f)
                curveTo(8.0f, 15.7787f, 8.8047f, 13.7454f, 10.1384f, 12.1757f)
                curveTo(11.31f, 13.8813f, 13.2744f, 14.9999f, 15.5f, 14.9999f)
                curveTo(17.8615f, 14.9999f, 19.9289f, 13.7405f, 21.0672f, 11.8568f)
                curveTo(21.3065f, 11.4607f, 22.0f, 11.5372f, 22.0f, 11.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.3586f, 4.7885f, 20.0659f, 8.6789f, 21.4353f)
                curveTo(8.2414f, 20.3768f, 8.0f, 19.2166f, 8.0f, 18.0f)
                curveTo(8.0f, 15.7788f, 8.8047f, 13.7455f, 10.1384f, 12.1758f)
                curveTo(9.4203f, 11.1303f, 9.0f, 9.8642f, 9.0f, 8.5f)
                curveTo(9.0f, 6.1385f, 10.2594f, 4.0711f, 12.1432f, 2.9328f)
                curveTo(12.5392f, 2.6935f, 12.4627f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
