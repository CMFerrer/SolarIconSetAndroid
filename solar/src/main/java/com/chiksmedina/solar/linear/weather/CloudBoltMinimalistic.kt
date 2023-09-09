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

public val WeatherGroup.CloudBoltMinimalistic: ImageVector
    get() {
        if (_cloudBoltMinimalistic != null) {
            return _cloudBoltMinimalistic!!
        }
        _cloudBoltMinimalistic = Builder(name = "CloudBoltMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2857f, 18.0f)
                curveTo(3.9188f, 18.0f, 2.0f, 16.1038f, 2.0f, 13.7647f)
                curveTo(2.0f, 11.4256f, 3.9188f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(6.5698f, 9.5294f, 6.8475f, 9.5567f, 7.1162f, 9.6089f)
                moveTo(14.381f, 7.0272f)
                curveTo(14.9767f, 6.8191f, 15.6178f, 6.7059f, 16.2857f, 6.7059f)
                curveTo(16.9404f, 6.7059f, 17.5693f, 6.8147f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(6.8871f, 8.9978f, 6.7619f, 8.3369f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 4.5283f, 9.3203f, 2.0f, 12.4762f, 2.0f)
                curveTo(15.4159f, 2.0f, 17.8371f, 4.1937f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(7.6806f, 9.7184f, 8.2053f, 9.9374f, 8.6667f, 10.2426f)
                moveTo(18.1551f, 7.015f)
                curveTo(20.393f, 7.7802f, 22.0f, 9.8811f, 22.0f, 12.3529f)
                curveTo(22.0f, 15.0599f, 20.0726f, 17.3221f, 17.5f, 17.8722f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0002f)
                lineTo(14.2857f, 18.3078f)
                horizontalLineTo(10.0f)
                lineTo(14.2857f, 14.6152f)
            }
        }
        .build()
        return _cloudBoltMinimalistic!!
    }

private var _cloudBoltMinimalistic: ImageVector? = null
