package com.chiksmedina.solar.linear.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.FoodKitchenGroup

public val FoodKitchenGroup.RollingPin: ImageVector
    get() {
        if (_rollingPin != null) {
            return _rollingPin!!
        }
        _rollingPin = Builder(name = "RollingPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.222f, 18.2146f)
                lineTo(6.2587f, 20.9631f)
                curveTo(6.1784f, 21.0757f, 6.1382f, 21.132f, 6.1035f, 21.1756f)
                curveTo(5.3206f, 22.161f, 3.8685f, 22.2812f, 2.9342f, 21.4379f)
                curveTo(2.8929f, 21.4006f, 2.8438f, 21.3516f, 2.7462f, 21.2539f)
                curveTo(2.6484f, 21.1561f, 2.5995f, 21.1072f, 2.5621f, 21.0658f)
                curveTo(1.7188f, 20.1315f, 1.839f, 18.6794f, 2.8244f, 17.8965f)
                curveTo(2.868f, 17.8619f, 2.9244f, 17.8215f, 3.0369f, 17.7413f)
                lineTo(5.7854f, 15.778f)
                moveTo(8.222f, 18.2146f)
                curveTo(7.8681f, 17.8931f, 7.4674f, 17.4924f, 6.9875f, 17.0125f)
                curveTo(6.5076f, 16.5327f, 6.1069f, 16.1319f, 5.7854f, 15.778f)
                moveTo(8.222f, 18.2146f)
                curveTo(8.9407f, 18.8673f, 9.4668f, 19.1937f, 10.0721f, 19.1937f)
                curveTo(10.9756f, 19.1937f, 11.7026f, 18.4666f, 13.1567f, 17.0125f)
                lineTo(17.0125f, 13.1567f)
                curveTo(18.4666f, 11.7026f, 19.1937f, 10.9756f, 19.1937f, 10.0721f)
                curveTo(19.1937f, 9.4668f, 18.8673f, 8.9407f, 18.2146f, 8.222f)
                moveTo(5.7854f, 15.778f)
                curveTo(5.1327f, 15.0593f, 4.8063f, 14.5332f, 4.8063f, 13.9279f)
                curveTo(4.8063f, 13.0244f, 5.5334f, 12.2974f, 6.9875f, 10.8433f)
                lineTo(10.8433f, 6.9875f)
                curveTo(12.2974f, 5.5334f, 13.0244f, 4.8063f, 13.9279f, 4.8063f)
                curveTo(14.5332f, 4.8063f, 15.0593f, 5.1327f, 15.778f, 5.7854f)
                moveTo(18.2146f, 8.222f)
                lineTo(20.9631f, 6.2587f)
                curveTo(21.0757f, 6.1784f, 21.132f, 6.1382f, 21.1756f, 6.1035f)
                curveTo(22.161f, 5.3206f, 22.2812f, 3.8685f, 21.4379f, 2.9342f)
                curveTo(21.4006f, 2.8929f, 21.3516f, 2.8438f, 21.2539f, 2.7462f)
                curveTo(21.1561f, 2.6484f, 21.1072f, 2.5995f, 21.0658f, 2.5621f)
                curveTo(20.1315f, 1.7188f, 18.6794f, 1.839f, 17.8965f, 2.8244f)
                curveTo(17.8619f, 2.868f, 17.8215f, 2.9244f, 17.7413f, 3.0369f)
                lineTo(15.778f, 5.7854f)
                moveTo(18.2146f, 8.222f)
                curveTo(17.8931f, 7.8681f, 17.4924f, 7.4674f, 17.0125f, 6.9875f)
                curveTo(16.5327f, 6.5076f, 16.1319f, 6.1069f, 15.778f, 5.7854f)
            }
        }
        .build()
        return _rollingPin!!
    }

private var _rollingPin: ImageVector? = null
