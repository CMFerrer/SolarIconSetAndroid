package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.SliderHorizontal: ImageVector
    get() {
        if (_sliderHorizontal != null) {
            return _sliderHorizontal!!
        }
        _sliderHorizontal = Builder(
            name = "SliderHorizontal", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 18.0f)
                curveTo(5.1716f, 18.0f, 3.7574f, 18.0f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                lineTo(16.0f, 6.0f)
                curveTo(18.8284f, 6.0f, 20.2426f, 6.0f, 21.1213f, 6.8787f)
                curveTo(22.0f, 7.7574f, 22.0f, 9.1716f, 22.0f, 12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.2426f, 18.0f, 18.8284f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 17.8589f)
                curveTo(5.3429f, 18.0f, 6.4625f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(17.5375f, 18.0f, 18.6571f, 18.0f, 19.5f, 17.8589f)
                verticalLineTo(18.0f)
                curveTo(19.5f, 19.4001f, 19.5f, 20.1002f, 19.2275f, 20.635f)
                curveTo(18.9878f, 21.1054f, 18.6054f, 21.4878f, 18.135f, 21.7275f)
                curveTo(17.6002f, 22.0f, 16.9001f, 22.0f, 15.5f, 22.0f)
                horizontalLineTo(8.5f)
                curveTo(7.0999f, 22.0f, 6.3998f, 22.0f, 5.865f, 21.7275f)
                curveTo(5.3946f, 21.4878f, 5.0122f, 21.1054f, 4.7725f, 20.635f)
                curveTo(4.5f, 20.1002f, 4.5f, 19.4001f, 4.5f, 18.0f)
                lineTo(4.5f, 17.8589f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 6.1411f)
                curveTo(5.3429f, 6.0f, 6.4625f, 6.0f, 8.0f, 6.0f)
                lineTo(16.0f, 6.0f)
                curveTo(17.5375f, 6.0f, 18.6571f, 6.0f, 19.5f, 6.1411f)
                verticalLineTo(6.0f)
                curveTo(19.5f, 4.5999f, 19.5f, 3.8998f, 19.2275f, 3.365f)
                curveTo(18.9878f, 2.8946f, 18.6054f, 2.5122f, 18.135f, 2.2725f)
                curveTo(17.6002f, 2.0f, 16.9001f, 2.0f, 15.5f, 2.0f)
                lineTo(8.5f, 2.0f)
                curveTo(7.0999f, 2.0f, 6.3998f, 2.0f, 5.865f, 2.2725f)
                curveTo(5.3946f, 2.5122f, 5.0122f, 2.8946f, 4.7725f, 3.365f)
                curveTo(4.5f, 3.8998f, 4.5f, 4.5999f, 4.5f, 6.0f)
                lineTo(4.5f, 6.1411f)
                close()
            }
        }
            .build()
        return _sliderHorizontal!!
    }

private var _sliderHorizontal: ImageVector? = null
