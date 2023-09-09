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

public val WeatherGroup.CloudSnowfall: ImageVector
    get() {
        if (_cloudSnowfall != null) {
            return _cloudSnowfall!!
        }
        _cloudSnowfall = Builder(name = "CloudSnowfall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.001f, 14.25f)
                curveTo(12.4153f, 14.25f, 12.751f, 14.5858f, 12.751f, 15.0f)
                verticalLineTo(17.1633f)
                lineTo(14.6241f, 16.0819f)
                curveTo(14.9828f, 15.8748f, 15.4415f, 15.9977f, 15.6486f, 16.3564f)
                curveTo(15.8557f, 16.7152f, 15.7328f, 17.1739f, 15.3741f, 17.381f)
                lineTo(13.501f, 18.4624f)
                lineTo(15.3767f, 19.5453f)
                curveTo(15.7354f, 19.7524f, 15.8583f, 20.2111f, 15.6512f, 20.5698f)
                curveTo(15.4441f, 20.9285f, 14.9854f, 21.0514f, 14.6267f, 20.8443f)
                lineTo(12.751f, 19.7614f)
                verticalLineTo(22.0f)
                curveTo(12.751f, 22.4142f, 12.4153f, 22.75f, 12.001f, 22.75f)
                curveTo(11.5868f, 22.75f, 11.251f, 22.4142f, 11.251f, 22.0f)
                verticalLineTo(19.7614f)
                lineTo(9.3754f, 20.8443f)
                curveTo(9.0167f, 21.0514f, 8.558f, 20.9285f, 8.3509f, 20.5698f)
                curveTo(8.1437f, 20.2111f, 8.2667f, 19.7524f, 8.6254f, 19.5453f)
                lineTo(10.501f, 18.4624f)
                lineTo(8.628f, 17.381f)
                curveTo(8.2693f, 17.1739f, 8.1464f, 16.7152f, 8.3535f, 16.3564f)
                curveTo(8.5606f, 15.9977f, 9.0193f, 15.8748f, 9.378f, 16.0819f)
                lineTo(11.251f, 17.1633f)
                verticalLineTo(15.0f)
                curveTo(11.251f, 14.5858f, 11.5868f, 14.25f, 12.001f, 14.25f)
                close()
            }
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
        }
        .build()
        return _cloudSnowfall!!
    }

private var _cloudSnowfall: ImageVector? = null
