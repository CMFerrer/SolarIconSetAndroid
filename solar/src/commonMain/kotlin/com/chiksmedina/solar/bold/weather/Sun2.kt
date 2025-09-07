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

val WeatherGroup.Sun2: ImageVector
    get() {
        if (_sun2 != null) {
            return _sun2!!
        }
        _sun2 = Builder(
            name = "Sun2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(3.6686f, 3.7161f)
                curveTo(3.9481f, 3.4104f, 4.4226f, 3.3891f, 4.7283f, 3.6686f)
                lineTo(6.9503f, 5.7002f)
                curveTo(7.256f, 5.9797f, 7.2772f, 6.4541f, 6.9977f, 6.7598f)
                curveTo(6.7182f, 7.0655f, 6.2438f, 7.0868f, 5.9381f, 6.8073f)
                lineTo(3.7161f, 4.7757f)
                curveTo(3.4104f, 4.4962f, 3.3891f, 4.0218f, 3.6686f, 3.7161f)
                close()
                moveTo(20.3314f, 3.7161f)
                curveTo(20.6109f, 4.0218f, 20.5896f, 4.4962f, 20.2839f, 4.7757f)
                lineTo(18.0619f, 6.8073f)
                curveTo(17.7562f, 7.0868f, 17.2818f, 7.0655f, 17.0023f, 6.7598f)
                curveTo(16.7228f, 6.4541f, 16.744f, 5.9797f, 17.0497f, 5.7002f)
                lineTo(19.2718f, 3.6686f)
                curveTo(19.5775f, 3.3891f, 20.0518f, 3.4104f, 20.3314f, 3.7161f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(19.25f, 12.0f)
                curveTo(19.25f, 11.5858f, 19.5858f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(20.0f)
                curveTo(19.5858f, 12.75f, 19.25f, 12.4142f, 19.25f, 12.0f)
                close()
                moveTo(17.0255f, 17.0252f)
                curveTo(17.3184f, 16.7323f, 17.7933f, 16.7323f, 18.0862f, 17.0252f)
                lineTo(20.3082f, 19.2475f)
                curveTo(20.6011f, 19.5404f, 20.601f, 20.0153f, 20.3081f, 20.3082f)
                curveTo(20.0152f, 20.6011f, 19.5403f, 20.601f, 19.2475f, 20.3081f)
                lineTo(17.0255f, 18.0858f)
                curveTo(16.7326f, 17.7929f, 16.7326f, 17.3181f, 17.0255f, 17.0252f)
                close()
                moveTo(6.9747f, 17.0253f)
                curveTo(7.2676f, 17.3182f, 7.2676f, 17.7931f, 6.9747f, 18.086f)
                lineTo(4.7524f, 20.3082f)
                curveTo(4.4595f, 20.6011f, 3.9847f, 20.6011f, 3.6918f, 20.3082f)
                curveTo(3.3989f, 20.0153f, 3.3989f, 19.5404f, 3.6918f, 19.2476f)
                lineTo(5.914f, 17.0253f)
                curveTo(6.2069f, 16.7324f, 6.6818f, 16.7324f, 6.9747f, 17.0253f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 19.5858f, 11.5858f, 19.25f, 12.0f, 19.25f)
                close()
            }
        }
            .build()
        return _sun2!!
    }

private var _sun2: ImageVector? = null
