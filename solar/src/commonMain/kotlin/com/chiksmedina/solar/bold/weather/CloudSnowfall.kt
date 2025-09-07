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

val WeatherGroup.CloudSnowfall: ImageVector
    get() {
        if (_cloudSnowfall != null) {
            return _cloudSnowfall!!
        }
        _cloudSnowfall = Builder(
            name = "CloudSnowfall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.001f, 14.25f)
                curveTo(12.4152f, 14.25f, 12.751f, 14.5858f, 12.751f, 15.0f)
                verticalLineTo(17.1633f)
                lineTo(14.624f, 16.0819f)
                curveTo(14.9827f, 15.8748f, 15.4414f, 15.9977f, 15.6485f, 16.3564f)
                curveTo(15.8556f, 16.7152f, 15.7327f, 17.1739f, 15.374f, 17.381f)
                lineTo(13.501f, 18.4624f)
                lineTo(15.3766f, 19.5453f)
                curveTo(15.7354f, 19.7524f, 15.8583f, 20.2111f, 15.6512f, 20.5698f)
                curveTo(15.4441f, 20.9285f, 14.9854f, 21.0514f, 14.6266f, 20.8443f)
                lineTo(12.751f, 19.7614f)
                verticalLineTo(22.0f)
                curveTo(12.751f, 22.4142f, 12.4152f, 22.75f, 12.001f, 22.75f)
                curveTo(11.5868f, 22.75f, 11.251f, 22.4142f, 11.251f, 22.0f)
                verticalLineTo(19.7614f)
                lineTo(9.3753f, 20.8443f)
                curveTo(9.0166f, 21.0514f, 8.5579f, 20.9285f, 8.3508f, 20.5698f)
                curveTo(8.1437f, 20.2111f, 8.2666f, 19.7524f, 8.6253f, 19.5453f)
                lineTo(10.501f, 18.4624f)
                lineTo(8.6279f, 17.381f)
                curveTo(8.2692f, 17.1739f, 8.1463f, 16.7152f, 8.3534f, 16.3564f)
                curveTo(8.5605f, 15.9977f, 9.0192f, 15.8748f, 9.3779f, 16.0819f)
                lineTo(11.251f, 17.1633f)
                verticalLineTo(15.0f)
                curveTo(11.251f, 14.5858f, 11.5868f, 14.25f, 12.001f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5641f, 18.462f)
                curveTo(6.7352f, 17.7748f, 6.4975f, 16.5703f, 7.0539f, 15.6064f)
                curveTo(7.6105f, 14.6425f, 8.7727f, 14.2461f, 9.7824f, 14.6206f)
                curveTo(9.9628f, 13.5586f, 10.8872f, 12.75f, 12.0006f, 12.75f)
                curveTo(13.1139f, 12.75f, 14.0383f, 13.5586f, 14.2187f, 14.6206f)
                curveTo(15.2284f, 14.2461f, 16.3906f, 14.6425f, 16.9472f, 15.6064f)
                curveTo(17.5036f, 16.5703f, 17.2659f, 17.7748f, 16.4371f, 18.462f)
                lineTo(16.0f, 19.0f)
                lineTo(16.8885f, 18.969f)
                curveTo(19.7611f, 18.6713f, 22.0f, 16.2705f, 22.0f, 13.3529f)
                curveTo(22.0f, 10.8811f, 20.393f, 8.7802f, 18.1551f, 8.015f)
                curveTo(17.8371f, 5.1937f, 15.4159f, 3.0f, 12.4762f, 3.0f)
                curveTo(9.3203f, 3.0f, 6.7619f, 5.5283f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 9.3369f, 6.8871f, 9.9978f, 7.1162f, 10.6089f)
                curveTo(6.8475f, 10.5567f, 6.5698f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(3.9188f, 10.5294f, 2.0f, 12.4256f, 2.0f, 14.7647f)
                curveTo(2.0f, 17.1038f, 3.9188f, 19.0f, 6.2857f, 19.0f)
                horizontalLineTo(7.0928f)
                horizontalLineTo(8.0f)
                lineTo(7.5641f, 18.462f)
                close()
            }
        }
            .build()
        return _cloudSnowfall!!
    }

private var _cloudSnowfall: ImageVector? = null
