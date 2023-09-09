package com.chiksmedina.solar.broken.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.WeatherGroup

public val WeatherGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.3529f)
                curveTo(22.0f, 17.4717f, 19.4416f, 20.0f, 16.2857f, 20.0f)
                horizontalLineTo(11.0f)
                moveTo(14.381f, 9.0272f)
                curveTo(14.9767f, 8.8191f, 15.6178f, 8.7059f, 16.2857f, 8.7059f)
                curveTo(16.9404f, 8.7059f, 17.5693f, 8.8147f, 18.1551f, 9.015f)
                moveTo(7.1162f, 11.6089f)
                curveTo(6.8475f, 11.5567f, 6.5698f, 11.5294f, 6.2857f, 11.5294f)
                curveTo(3.9188f, 11.5294f, 2.0f, 13.4256f, 2.0f, 15.7647f)
                curveTo(2.0f, 18.1038f, 3.9188f, 20.0f, 6.2857f, 20.0f)
                horizontalLineTo(7.0f)
                moveTo(7.1162f, 11.6089f)
                curveTo(6.8871f, 10.9978f, 6.7619f, 10.3369f, 6.7619f, 9.6471f)
                curveTo(6.7619f, 6.5283f, 9.3203f, 4.0f, 12.4762f, 4.0f)
                curveTo(15.4159f, 4.0f, 17.8371f, 6.1937f, 18.1551f, 9.015f)
                moveTo(7.1162f, 11.6089f)
                curveTo(7.6806f, 11.7184f, 8.2053f, 11.9374f, 8.6667f, 12.2426f)
                moveTo(18.1551f, 9.015f)
                curveTo(18.8381f, 9.2485f, 19.4623f, 9.6065f, 20.0f, 10.0614f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0004f, 4.0f)
                curveTo(10.0882f, 2.7856f, 8.6358f, 2.0f, 7.0f, 2.0f)
                curveTo(4.2386f, 2.0f, 2.0f, 4.2386f, 2.0f, 7.0f)
                curveTo(2.0f, 9.0503f, 3.2341f, 10.8124f, 5.0f, 11.584f)
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
