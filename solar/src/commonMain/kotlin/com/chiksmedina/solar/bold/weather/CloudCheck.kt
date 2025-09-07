package com.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(
            name = "CloudCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(10.1144f, 22.0f, 9.1716f, 22.0f, 8.5858f, 21.4142f)
                curveTo(8.0f, 20.8284f, 8.0f, 19.8856f, 8.0f, 18.0f)
                curveTo(8.0f, 16.1144f, 8.0f, 15.1716f, 8.5858f, 14.5858f)
                curveTo(9.1716f, 14.0f, 10.1144f, 14.0f, 12.0f, 14.0f)
                curveTo(13.8856f, 14.0f, 14.8284f, 14.0f, 15.4142f, 14.5858f)
                curveTo(16.0f, 15.1716f, 16.0f, 16.1144f, 16.0f, 18.0f)
                curveTo(16.0f, 19.8856f, 16.0f, 20.8284f, 15.4142f, 21.4142f)
                curveTo(14.8284f, 22.0f, 13.8856f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.2492f, 17.1381f)
                curveTo(14.5095f, 16.8777f, 14.5095f, 16.4556f, 14.2492f, 16.1953f)
                curveTo(13.9888f, 15.9349f, 13.5667f, 15.9349f, 13.3064f, 16.1953f)
                lineTo(11.1111f, 18.3905f)
                lineTo(10.6936f, 17.973f)
                curveTo(10.4333f, 17.7127f, 10.0112f, 17.7127f, 9.7508f, 17.973f)
                curveTo(9.4905f, 18.2334f, 9.4905f, 18.6555f, 9.7508f, 18.9158f)
                lineTo(10.6397f, 19.8047f)
                curveTo(10.9001f, 20.0651f, 11.3222f, 20.0651f, 11.5825f, 19.8047f)
                lineTo(14.2492f, 17.1381f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5f, 18.0f)
                lineTo(6.5f, 17.9105f)
                curveTo(6.4999f, 17.0449f, 6.4998f, 16.2512f, 6.5866f, 15.6056f)
                curveTo(6.6822f, 14.8946f, 6.9071f, 14.1432f, 7.5251f, 13.5251f)
                curveTo(8.1432f, 12.9071f, 8.8946f, 12.6822f, 9.6056f, 12.5866f)
                curveTo(10.2512f, 12.4998f, 11.0449f, 12.4999f, 11.9105f, 12.5f)
                horizontalLineTo(12.0895f)
                curveTo(12.9551f, 12.4999f, 13.7488f, 12.4998f, 14.3944f, 12.5866f)
                curveTo(15.1054f, 12.6822f, 15.8568f, 12.9071f, 16.4749f, 13.5251f)
                curveTo(17.0929f, 14.1432f, 17.3178f, 14.8946f, 17.4134f, 15.6056f)
                curveTo(17.4989f, 16.2417f, 17.5001f, 17.0215f, 17.5f, 17.8722f)
                curveTo(20.0726f, 17.3221f, 22.0f, 15.0599f, 22.0f, 12.3529f)
                curveTo(22.0f, 9.8811f, 20.393f, 7.7802f, 18.1551f, 7.015f)
                curveTo(17.8371f, 4.1937f, 15.4159f, 2.0f, 12.4762f, 2.0f)
                curveTo(9.3203f, 2.0f, 6.7619f, 4.5283f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 8.3369f, 6.8871f, 8.9978f, 7.1162f, 9.6089f)
                curveTo(6.8475f, 9.5567f, 6.5698f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(3.9188f, 9.5294f, 2.0f, 11.4256f, 2.0f, 13.7647f)
                curveTo(2.0f, 16.1038f, 3.9188f, 18.0f, 6.2857f, 18.0f)
                lineTo(6.5f, 18.0f)
                close()
            }
        }
            .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
