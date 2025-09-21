package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Waterdrop: ImageVector
    get() {
        if (_waterdrop != null) {
            return _waterdrop!!
        }
        _waterdrop = Builder(
            name = "Waterdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4467f, 16.0f)
                curveTo(3.157f, 15.1183f, 3.0f, 14.1743f, 3.0f, 13.1928f)
                verticalLineTo(12.9281f)
                curveTo(3.0f, 8.3165f, 5.7285f, 4.1635f, 9.9033f, 2.4208f)
                curveTo(11.2473f, 1.8597f, 12.7527f, 1.8597f, 14.0967f, 2.4208f)
                curveTo(18.2715f, 4.1635f, 21.0f, 8.3165f, 21.0f, 12.9281f)
                verticalLineTo(13.1928f)
                curveTo(21.0f, 18.0569f, 17.1445f, 22.0f, 12.3885f, 22.0f)
                horizontalLineTo(11.6115f)
                curveTo(9.4679f, 22.0f, 7.5072f, 21.199f, 6.0f, 19.8736f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.6147f, 10.7237f)
                curveTo(8.2495f, 8.7183f, 9.6306f, 7.088f, 11.3858f, 6.2764f)
            }
        }
            .build()
        return _waterdrop!!
    }

private var _waterdrop: ImageVector? = null
