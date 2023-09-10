package com.chiksmedina.solar.boldduotone.weather

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
import com.chiksmedina.solar.boldduotone.WeatherGroup

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
                moveTo(12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 19.5858f, 11.5858f, 19.25f, 12.0f, 19.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.6687f, 3.7156f)
                curveTo(3.9482f, 3.4099f, 4.4226f, 3.3887f, 4.7283f, 3.6682f)
                lineTo(6.9503f, 5.6997f)
                curveTo(7.256f, 5.9792f, 7.2773f, 6.4536f, 6.9978f, 6.7593f)
                curveTo(6.7183f, 7.0651f, 6.2439f, 7.0863f, 5.9382f, 6.8068f)
                lineTo(3.7161f, 4.7752f)
                curveTo(3.4104f, 4.4957f, 3.3892f, 4.0213f, 3.6687f, 3.7156f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.3314f, 3.7156f)
                curveTo(20.6109f, 4.0213f, 20.5897f, 4.4957f, 20.284f, 4.7752f)
                lineTo(18.062f, 6.8068f)
                curveTo(17.7563f, 7.0863f, 17.2819f, 7.0651f, 17.0024f, 6.7593f)
                curveTo(16.7229f, 6.4536f, 16.7441f, 5.9792f, 17.0498f, 5.6997f)
                lineTo(19.2718f, 3.6682f)
                curveTo(19.5775f, 3.3887f, 20.0519f, 3.4099f, 20.3314f, 3.7156f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0256f, 17.0247f)
                curveTo(17.3185f, 16.7318f, 17.7934f, 16.7319f, 18.0862f, 17.0248f)
                lineTo(20.3082f, 19.2471f)
                curveTo(20.6011f, 19.54f, 20.6011f, 20.0148f, 20.3082f, 20.3077f)
                curveTo(20.0153f, 20.6006f, 19.5404f, 20.6006f, 19.2475f, 20.3076f)
                lineTo(17.0255f, 18.0854f)
                curveTo(16.7326f, 17.7924f, 16.7327f, 17.3176f, 17.0256f, 17.0247f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.9747f, 17.0249f)
                curveTo(7.2676f, 17.3177f, 7.2676f, 17.7926f, 6.9747f, 18.0855f)
                lineTo(4.7525f, 20.3077f)
                curveTo(4.4596f, 20.6006f, 3.9847f, 20.6006f, 3.6918f, 20.3077f)
                curveTo(3.3989f, 20.0148f, 3.3989f, 19.54f, 3.6918f, 19.2471f)
                lineTo(5.9141f, 17.0248f)
                curveTo(6.207f, 16.732f, 6.6818f, 16.732f, 6.9747f, 17.0249f)
                close()
            }
        }
            .build()
        return _sun2!!
    }

private var _sun2: ImageVector? = null
