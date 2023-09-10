package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.SliderMinimalisticHorizontal: ImageVector
    get() {
        if (_sliderMinimalisticHorizontal != null) {
            return _sliderMinimalisticHorizontal!!
        }
        _sliderMinimalisticHorizontal = Builder(
            name = "SliderMinimalisticHorizontal", defaultWidth
            = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.25f, 2.7692f)
                curveTo(20.25f, 3.1941f, 19.9142f, 3.5385f, 19.5f, 3.5385f)
                lineTo(4.5f, 3.5385f)
                curveTo(4.0858f, 3.5385f, 3.75f, 3.1941f, 3.75f, 2.7692f)
                curveTo(3.75f, 2.3444f, 4.0858f, 2.0f, 4.5f, 2.0f)
                lineTo(19.5f, 2.0f)
                curveTo(19.9142f, 2.0f, 20.25f, 2.3444f, 20.25f, 2.7692f)
                close()
                moveTo(20.25f, 21.2308f)
                curveTo(20.25f, 21.6556f, 19.9142f, 22.0f, 19.5f, 22.0f)
                lineTo(4.5f, 22.0f)
                curveTo(4.0858f, 22.0f, 3.75f, 21.6556f, 3.75f, 21.2308f)
                curveTo(3.75f, 20.8059f, 4.0858f, 20.4615f, 4.5f, 20.4615f)
                lineTo(19.5f, 20.4615f)
                curveTo(19.9142f, 20.4615f, 20.25f, 20.8059f, 20.25f, 21.2308f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 5.8462f)
                curveTo(18.8284f, 5.8462f, 20.2426f, 5.8462f, 21.1213f, 6.7474f)
                curveTo(22.0f, 7.6486f, 22.0f, 9.0991f, 22.0f, 12.0f)
                curveTo(22.0f, 14.901f, 22.0f, 16.3515f, 21.1213f, 17.2527f)
                curveTo(20.2426f, 18.1539f, 18.8284f, 18.1539f, 16.0f, 18.1539f)
                lineTo(8.0f, 18.1539f)
                curveTo(5.1716f, 18.1539f, 3.7574f, 18.1539f, 2.8787f, 17.2527f)
                curveTo(2.0f, 16.3515f, 2.0f, 14.901f, 2.0f, 12.0f)
                curveTo(2.0f, 9.0991f, 2.0f, 7.6486f, 2.8787f, 6.7474f)
                curveTo(3.7574f, 5.8462f, 5.1716f, 5.8462f, 8.0f, 5.8462f)
                lineTo(16.0f, 5.8462f)
                close()
            }
        }
            .build()
        return _sliderMinimalisticHorizontal!!
    }

private var _sliderMinimalisticHorizontal: ImageVector? = null
