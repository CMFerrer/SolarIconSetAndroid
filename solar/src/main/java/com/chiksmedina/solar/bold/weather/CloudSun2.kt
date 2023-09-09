package com.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.WeatherGroup

public val WeatherGroup.CloudSun2: ImageVector
    get() {
        if (_cloudSun2 != null) {
            return _cloudSun2!!
        }
        _cloudSun2 = Builder(name = "CloudSun2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 1.25f)
                curveTo(7.9142f, 1.25f, 8.25f, 1.5858f, 8.25f, 2.0f)
                verticalLineTo(2.5f)
                curveTo(8.25f, 2.9142f, 7.9142f, 3.25f, 7.5f, 3.25f)
                curveTo(7.0858f, 3.25f, 6.75f, 2.9142f, 6.75f, 2.5f)
                verticalLineTo(2.0f)
                curveTo(6.75f, 1.5858f, 7.0858f, 1.25f, 7.5f, 1.25f)
                close()
                moveTo(3.0809f, 3.0806f)
                curveTo(3.3737f, 2.7877f, 3.8486f, 2.7877f, 4.1415f, 3.0806f)
                lineTo(4.3576f, 3.2966f)
                curveTo(4.6505f, 3.5895f, 4.6505f, 4.0644f, 4.3576f, 4.3573f)
                curveTo(4.0647f, 4.6502f, 3.5898f, 4.6502f, 3.2969f, 4.3573f)
                lineTo(3.0809f, 4.1413f)
                curveTo(2.788f, 3.8484f, 2.788f, 3.3735f, 3.0809f, 3.0806f)
                close()
                moveTo(11.919f, 3.0807f)
                curveTo(12.2119f, 3.3736f, 12.2119f, 3.8485f, 11.919f, 4.1414f)
                lineTo(11.7029f, 4.3575f)
                curveTo(11.41f, 4.6503f, 10.9352f, 4.6503f, 10.6423f, 4.3575f)
                curveTo(10.3494f, 4.0646f, 10.3494f, 3.5897f, 10.6423f, 3.2968f)
                lineTo(10.8583f, 3.0807f)
                curveTo(11.1512f, 2.7878f, 11.6261f, 2.7878f, 11.919f, 3.0807f)
                close()
                moveTo(1.25f, 7.5f)
                curveTo(1.25f, 7.0858f, 1.5858f, 6.75f, 2.0f, 6.75f)
                horizontalLineTo(2.5f)
                curveTo(2.9142f, 6.75f, 3.25f, 7.0858f, 3.25f, 7.5f)
                curveTo(3.25f, 7.9142f, 2.9142f, 8.25f, 2.5f, 8.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 8.25f, 1.25f, 7.9142f, 1.25f, 7.5f)
                close()
                moveTo(4.3576f, 10.6427f)
                curveTo(4.6505f, 10.9356f, 4.6505f, 11.4105f, 4.3576f, 11.7034f)
                lineTo(4.1415f, 11.9194f)
                curveTo(3.8486f, 12.2123f, 3.3737f, 12.2123f, 3.0809f, 11.9194f)
                curveTo(2.788f, 11.6265f, 2.788f, 11.1516f, 3.0809f, 10.8588f)
                lineTo(3.2969f, 10.6427f)
                curveTo(3.5898f, 10.3498f, 4.0647f, 10.3498f, 4.3576f, 10.6427f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2857f, 22.0f)
                curveTo(19.4416f, 22.0f, 22.0f, 19.4717f, 22.0f, 16.3529f)
                curveTo(22.0f, 13.8811f, 20.393f, 11.7802f, 18.1551f, 11.015f)
                curveTo(17.8371f, 8.1937f, 15.4159f, 6.0f, 12.4762f, 6.0f)
                curveTo(9.3203f, 6.0f, 6.7619f, 8.5283f, 6.7619f, 11.6471f)
                curveTo(6.7619f, 12.3369f, 6.8871f, 12.9978f, 7.1162f, 13.6089f)
                curveTo(6.8475f, 13.5567f, 6.5698f, 13.5294f, 6.2857f, 13.5294f)
                curveTo(3.9188f, 13.5294f, 2.0f, 15.4256f, 2.0f, 17.7647f)
                curveTo(2.0f, 20.1038f, 3.9188f, 22.0f, 6.2857f, 22.0f)
                horizontalLineTo(16.2857f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8108f, 5.0042f)
                curveTo(9.2825f, 4.6842f, 8.6628f, 4.5f, 8.0f, 4.5f)
                curveTo(6.067f, 4.5f, 4.5f, 6.067f, 4.5f, 8.0f)
                curveTo(4.5f, 8.8929f, 4.8343f, 9.7076f, 5.3846f, 10.326f)
                curveTo(5.8436f, 7.8888f, 7.5493f, 5.8959f, 9.8108f, 5.0042f)
                close()
            }
        }
        .build()
        return _cloudSun2!!
    }

private var _cloudSun2: ImageVector? = null
