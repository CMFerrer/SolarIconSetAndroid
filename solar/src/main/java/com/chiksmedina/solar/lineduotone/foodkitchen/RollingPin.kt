package com.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.FoodKitchenGroup

val FoodKitchenGroup.RollingPin: ImageVector
    get() {
        if (_rollingPin != null) {
            return _rollingPin!!
        }
        _rollingPin = Builder(
            name = "RollingPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.1568f, 17.0123f)
                lineTo(17.0126f, 13.1565f)
                curveTo(18.4667f, 11.7024f, 19.1937f, 10.9754f, 19.1937f, 10.0719f)
                curveTo(19.1937f, 9.4666f, 18.8673f, 8.9405f, 18.2146f, 8.2218f)
                curveTo(17.8931f, 7.8678f, 17.4924f, 7.4672f, 17.0126f, 6.9873f)
                curveTo(16.5327f, 6.5075f, 16.132f, 6.1068f, 15.778f, 5.7853f)
                curveTo(15.0594f, 5.1325f, 14.5333f, 4.8061f, 13.9279f, 4.8061f)
                curveTo(13.0245f, 4.8061f, 12.2974f, 5.5332f, 10.8433f, 6.9873f)
                lineTo(6.9875f, 10.8431f)
                curveTo(5.5335f, 12.2972f, 4.8064f, 13.0242f, 4.8064f, 13.9277f)
                curveTo(4.8064f, 14.533f, 5.1328f, 15.0591f, 5.7855f, 15.7778f)
                curveTo(6.107f, 16.1318f, 6.5077f, 16.5325f, 6.9875f, 17.0123f)
                curveTo(7.4674f, 17.4922f, 7.8681f, 17.8929f, 8.2221f, 18.2144f)
                curveTo(8.9407f, 18.8671f, 9.4669f, 19.1935f, 10.0722f, 19.1935f)
                curveTo(10.9756f, 19.1935f, 11.7027f, 18.4664f, 13.1568f, 17.0123f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.222f, 18.2146f)
                lineTo(6.2587f, 20.9631f)
                curveTo(6.1784f, 21.0757f, 6.1382f, 21.132f, 6.1035f, 21.1756f)
                curveTo(5.3206f, 22.161f, 3.8685f, 22.2812f, 2.9342f, 21.4379f)
                curveTo(2.8929f, 21.4006f, 2.8438f, 21.3516f, 2.7462f, 21.2539f)
                curveTo(2.6484f, 21.1561f, 2.5995f, 21.1072f, 2.5621f, 21.0658f)
                curveTo(1.7188f, 20.1315f, 1.839f, 18.6794f, 2.8244f, 17.8965f)
                curveTo(2.868f, 17.8619f, 2.9244f, 17.8215f, 3.0369f, 17.7413f)
                lineTo(5.7854f, 15.778f)
                moveTo(18.2146f, 8.222f)
                lineTo(20.9631f, 6.2587f)
                curveTo(21.0757f, 6.1784f, 21.132f, 6.1382f, 21.1756f, 6.1035f)
                curveTo(22.161f, 5.3206f, 22.2812f, 3.8685f, 21.4379f, 2.9342f)
                curveTo(21.4006f, 2.8929f, 21.3516f, 2.8438f, 21.2539f, 2.7462f)
                curveTo(21.1561f, 2.6484f, 21.1072f, 2.5995f, 21.0658f, 2.5621f)
                curveTo(20.1315f, 1.7188f, 18.6794f, 1.839f, 17.8965f, 2.8244f)
                curveTo(17.8619f, 2.868f, 17.8215f, 2.9244f, 17.7413f, 3.0369f)
                lineTo(15.778f, 5.7854f)
            }
        }
            .build()
        return _rollingPin!!
    }

private var _rollingPin: ImageVector? = null
