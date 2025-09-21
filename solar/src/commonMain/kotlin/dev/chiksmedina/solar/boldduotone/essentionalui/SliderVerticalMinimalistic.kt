package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.SliderVerticalMinimalistic: ImageVector
    get() {
        if (_sliderVerticalMinimalistic != null) {
            return _sliderVerticalMinimalistic!!
        }
        _sliderVerticalMinimalistic = Builder(
            name = "SliderVerticalMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.8462f, 8.0f)
                curveTo(5.8462f, 5.1716f, 5.8462f, 3.7574f, 6.7474f, 2.8787f)
                curveTo(7.6486f, 2.0f, 9.0991f, 2.0f, 12.0f, 2.0f)
                curveTo(14.901f, 2.0f, 16.3515f, 2.0f, 17.2527f, 2.8787f)
                curveTo(18.1539f, 3.7574f, 18.1539f, 5.1716f, 18.1539f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(18.1539f, 18.8284f, 18.1539f, 20.2426f, 17.2527f, 21.1213f)
                curveTo(16.3515f, 22.0f, 14.901f, 22.0f, 12.0f, 22.0f)
                curveTo(9.0991f, 22.0f, 7.6486f, 22.0f, 6.7474f, 21.1213f)
                curveTo(5.8462f, 20.2426f, 5.8462f, 18.8284f, 5.8462f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.7692f, 3.75f)
                curveTo(3.1941f, 3.75f, 3.5385f, 4.0858f, 3.5385f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(3.5385f, 19.9142f, 3.1941f, 20.25f, 2.7692f, 20.25f)
                curveTo(2.3444f, 20.25f, 2.0f, 19.9142f, 2.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 4.0858f, 2.3444f, 3.75f, 2.7692f, 3.75f)
                close()
                moveTo(21.2308f, 3.75f)
                curveTo(21.6556f, 3.75f, 22.0f, 4.0858f, 22.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(22.0f, 19.9142f, 21.6556f, 20.25f, 21.2308f, 20.25f)
                curveTo(20.8059f, 20.25f, 20.4615f, 19.9142f, 20.4615f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(20.4615f, 4.0858f, 20.8059f, 3.75f, 21.2308f, 3.75f)
                close()
            }
        }
            .build()
        return _sliderVerticalMinimalistic!!
    }

private var _sliderVerticalMinimalistic: ImageVector? = null
