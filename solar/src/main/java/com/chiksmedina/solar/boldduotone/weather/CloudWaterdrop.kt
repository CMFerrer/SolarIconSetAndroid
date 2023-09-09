package com.chiksmedina.solar.boldduotone.weather

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
import com.chiksmedina.solar.boldduotone.WeatherGroup

public val WeatherGroup.CloudWaterdrop: ImageVector
    get() {
        if (_cloudWaterdrop != null) {
            return _cloudWaterdrop!!
        }
        _cloudWaterdrop = Builder(name = "CloudWaterdrop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2857f, 19.0f)
                curveTo(19.4416f, 19.0f, 22.0f, 16.4717f, 22.0f, 13.3529f)
                curveTo(22.0f, 10.8811f, 20.393f, 8.7802f, 18.1551f, 8.015f)
                curveTo(17.8371f, 5.1937f, 15.4159f, 3.0f, 12.4762f, 3.0f)
                curveTo(9.3203f, 3.0f, 6.7619f, 5.5283f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 9.3369f, 6.8871f, 9.9978f, 7.1162f, 10.6089f)
                curveTo(6.8475f, 10.5567f, 6.5698f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(3.9188f, 10.5294f, 2.0f, 12.4256f, 2.0f, 14.7647f)
                curveTo(2.0f, 17.1038f, 3.9188f, 19.0f, 6.2857f, 19.0f)
                horizontalLineTo(16.2857f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 19.0837f)
                curveTo(15.0f, 20.6946f, 13.6569f, 22.0004f, 12.0f, 22.0004f)
                curveTo(10.3431f, 22.0004f, 9.0f, 20.6946f, 9.0f, 19.0837f)
                curveTo(9.0f, 18.1718f, 9.9614f, 16.9838f, 10.7958f, 16.1245f)
                curveTo(11.4626f, 15.4377f, 12.5374f, 15.4377f, 13.2042f, 16.1245f)
                curveTo(14.0386f, 16.9838f, 15.0f, 18.1718f, 15.0f, 19.0837f)
                close()
            }
        }
        .build()
        return _cloudWaterdrop!!
    }

private var _cloudWaterdrop: ImageVector? = null
