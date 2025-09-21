package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.SliderVertical: ImageVector
    get() {
        if (_sliderVertical != null) {
            return _sliderVertical!!
        }
        _sliderVertical = Builder(
            name = "SliderVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 5.1716f, 6.0f, 3.7574f, 6.8787f, 2.8787f)
                curveTo(7.7574f, 2.0f, 9.1716f, 2.0f, 12.0f, 2.0f)
                curveTo(14.8284f, 2.0f, 16.2426f, 2.0f, 17.1213f, 2.8787f)
                curveTo(18.0f, 3.7574f, 18.0f, 5.1716f, 18.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 18.8284f, 18.0f, 20.2426f, 17.1213f, 21.1213f)
                curveTo(16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f, 22.0f)
                curveTo(9.1716f, 22.0f, 7.7574f, 22.0f, 6.8787f, 21.1213f)
                curveTo(6.0f, 20.2426f, 6.0f, 18.8284f, 6.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 19.5f)
                curveTo(19.4001f, 19.5f, 20.1002f, 19.5f, 20.635f, 19.2275f)
                curveTo(21.1054f, 18.9878f, 21.4878f, 18.6054f, 21.7275f, 18.135f)
                curveTo(22.0f, 17.6002f, 22.0f, 16.9001f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 7.0999f, 22.0f, 6.3998f, 21.7275f, 5.865f)
                curveTo(21.4878f, 5.3946f, 21.1054f, 5.0122f, 20.635f, 4.7725f)
                curveTo(20.1002f, 4.5f, 19.4001f, 4.5f, 18.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 19.5f)
                curveTo(4.5999f, 19.5f, 3.8998f, 19.5f, 3.365f, 19.2275f)
                curveTo(2.8946f, 18.9878f, 2.5122f, 18.6054f, 2.2725f, 18.135f)
                curveTo(2.0f, 17.6002f, 2.0f, 16.9001f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 7.0999f, 2.0f, 6.3998f, 2.2725f, 5.865f)
                curveTo(2.5122f, 5.3946f, 2.8946f, 5.0122f, 3.365f, 4.7725f)
                curveTo(3.8998f, 4.5f, 4.5999f, 4.5f, 6.0f, 4.5f)
            }
        }
            .build()
        return _sliderVertical!!
    }

private var _sliderVertical: ImageVector? = null
