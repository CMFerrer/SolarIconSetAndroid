package com.chiksmedina.solar.lineduotone.weather

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
import com.chiksmedina.solar.lineduotone.WeatherGroup

public val WeatherGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.381f, 9.0274f)
                curveTo(14.9767f, 8.8193f, 15.6178f, 8.706f, 16.2857f, 8.706f)
                curveTo(16.9404f, 8.706f, 17.5693f, 8.8148f, 18.1551f, 9.0152f)
                curveTo(20.393f, 9.7804f, 22.0f, 11.8813f, 22.0f, 14.3531f)
                curveTo(22.0f, 17.4719f, 19.4416f, 20.0002f, 16.2857f, 20.0002f)
                horizontalLineTo(6.2857f)
                curveTo(3.9188f, 20.0002f, 2.0f, 18.104f, 2.0f, 15.7649f)
                curveTo(2.0f, 13.4258f, 3.9188f, 11.5296f, 6.2857f, 11.5296f)
                curveTo(6.5698f, 11.5296f, 6.8475f, 11.5569f, 7.1162f, 11.609f)
                curveTo(7.6806f, 11.7186f, 8.2053f, 11.9376f, 8.6667f, 12.2428f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1162f, 11.6089f)
                curveTo(6.8871f, 10.9978f, 6.762f, 10.3369f, 6.762f, 9.6471f)
                curveTo(6.762f, 6.5283f, 9.3203f, 4.0f, 12.4762f, 4.0f)
                curveTo(15.4159f, 4.0f, 17.8372f, 6.1937f, 18.1551f, 9.015f)
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
