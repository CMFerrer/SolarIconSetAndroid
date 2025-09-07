package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 3.0f)
                lineTo(19.5f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 21.0f)
                lineTo(19.5f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 6.0f)
                curveTo(5.1716f, 6.0f, 3.7574f, 6.0f, 2.8787f, 6.8787f)
                curveTo(2.0f, 7.7574f, 2.0f, 9.1716f, 2.0f, 12.0f)
                curveTo(2.0f, 14.8284f, 2.0f, 16.2426f, 2.8787f, 17.1213f)
                curveTo(3.7574f, 18.0f, 5.1716f, 18.0f, 8.0f, 18.0f)
                lineTo(16.0f, 18.0f)
                curveTo(18.8284f, 18.0f, 20.2426f, 18.0f, 21.1213f, 17.1213f)
                curveTo(22.0f, 16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f)
                curveTo(22.0f, 9.1716f, 22.0f, 7.7574f, 21.1213f, 6.8787f)
                curveTo(20.2426f, 6.0f, 18.8284f, 6.0f, 16.0f, 6.0f)
                lineTo(12.0f, 6.0f)
            }
        }
            .build()
        return _sliderMinimalisticHorizontal!!
    }

private var _sliderMinimalisticHorizontal: ImageVector? = null
