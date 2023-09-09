package com.chiksmedina.solar.linear.weather

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
import com.chiksmedina.solar.linear.WeatherGroup

public val WeatherGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                horizontalLineTo(9.5f)
                curveTo(10.8807f, 8.0f, 12.0f, 6.8807f, 12.0f, 5.5f)
                curveTo(12.0f, 4.1193f, 10.8807f, 3.0f, 9.5f, 3.0f)
                curveTo(8.1193f, 3.0f, 7.0f, 4.1193f, 7.0f, 5.5f)
                verticalLineTo(5.8571f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 14.0f, 22.0f, 15.567f, 22.0f, 17.5f)
                curveTo(22.0f, 19.433f, 20.433f, 21.0f, 18.5f, 21.0f)
                curveTo(16.567f, 21.0f, 15.0f, 19.433f, 15.0f, 17.5f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 11.0f, 22.0f, 9.433f, 22.0f, 7.5f)
                curveTo(22.0f, 5.567f, 20.433f, 4.0f, 18.5f, 4.0f)
                curveTo(16.567f, 4.0f, 15.0f, 5.567f, 15.0f, 7.5f)
                verticalLineTo(8.0f)
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
