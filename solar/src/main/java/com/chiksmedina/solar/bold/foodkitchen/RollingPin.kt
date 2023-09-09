package com.chiksmedina.solar.bold.foodkitchen

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
import com.chiksmedina.solar.bold.FoodKitchenGroup

public val FoodKitchenGroup.RollingPin: ImageVector
    get() {
        if (_rollingPin != null) {
            return _rollingPin!!
        }
        _rollingPin = Builder(name = "RollingPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0658f, 2.5621f)
                curveTo(21.1072f, 2.5995f, 21.1561f, 2.6484f, 21.2539f, 2.7462f)
                curveTo(21.3515f, 2.8438f, 21.4006f, 2.8929f, 21.4379f, 2.9342f)
                curveTo(22.2812f, 3.8685f, 22.161f, 5.3206f, 21.1756f, 6.1035f)
                curveTo(21.132f, 6.1382f, 21.0757f, 6.1784f, 20.9631f, 6.2587f)
                lineTo(19.4427f, 7.3448f)
                curveTo(19.4034f, 7.3004f, 19.3641f, 7.2566f, 19.3247f, 7.2133f)
                curveTo(18.9788f, 6.8325f, 18.5568f, 6.4104f, 18.0935f, 5.9472f)
                lineTo(18.0526f, 5.9062f)
                curveTo(17.5893f, 5.443f, 17.1671f, 5.0208f, 16.7863f, 4.6749f)
                curveTo(16.7431f, 4.6357f, 16.6995f, 4.5964f, 16.6552f, 4.5573f)
                lineTo(17.7413f, 3.0369f)
                curveTo(17.8215f, 2.9244f, 17.8619f, 2.868f, 17.8965f, 2.8244f)
                curveTo(18.6794f, 1.839f, 20.1315f, 1.7188f, 21.0658f, 2.5621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5573f, 16.6552f)
                curveTo(4.5964f, 16.6995f, 4.6357f, 16.7431f, 4.6749f, 16.7863f)
                curveTo(5.0208f, 17.1671f, 5.443f, 17.5893f, 5.9062f, 18.0526f)
                lineTo(5.9471f, 18.0935f)
                curveTo(6.4104f, 18.5567f, 6.8325f, 18.9788f, 7.2133f, 19.3247f)
                curveTo(7.2566f, 19.3641f, 7.3004f, 19.4034f, 7.3448f, 19.4427f)
                lineTo(6.2587f, 20.9631f)
                curveTo(6.1784f, 21.0757f, 6.1382f, 21.132f, 6.1035f, 21.1756f)
                curveTo(5.3206f, 22.161f, 3.8685f, 22.2812f, 2.9342f, 21.4379f)
                curveTo(2.8929f, 21.4006f, 2.8439f, 21.3516f, 2.7462f, 21.2539f)
                curveTo(2.6484f, 21.1561f, 2.5995f, 21.1072f, 2.5621f, 21.0658f)
                curveTo(1.7188f, 20.1315f, 1.839f, 18.6794f, 2.8244f, 17.8965f)
                curveTo(2.868f, 17.8619f, 2.9244f, 17.8215f, 3.0369f, 17.7413f)
                lineTo(4.5573f, 16.6552f)
                close()
            }
        }
        .build()
        return _rollingPin!!
    }

private var _rollingPin: ImageVector? = null
