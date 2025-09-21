package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.TrashBinMinimalistic2: ImageVector
    get() {
        if (_trashBinMinimalistic2 != null) {
            return _trashBinMinimalistic2!!
        }
        _trashBinMinimalistic2 = Builder(
            name = "TrashBinMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5001f, 6.0f)
                horizontalLineTo(3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.8334f, 8.5f)
                lineTo(18.3735f, 15.3991f)
                curveTo(18.1965f, 18.054f, 18.108f, 19.3815f, 17.243f, 20.1907f)
                curveTo(16.378f, 21.0f, 15.0476f, 21.0f, 12.3868f, 21.0f)
                horizontalLineTo(11.6134f)
                curveTo(8.9526f, 21.0f, 7.6222f, 21.0f, 6.7572f, 20.1907f)
                curveTo(5.8922f, 19.3815f, 5.8037f, 18.054f, 5.6267f, 15.3991f)
                lineTo(5.1667f, 8.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1706f, 4.0f)
                curveTo(9.5825f, 2.8348f, 10.6937f, 2.0f, 11.9999f, 2.0f)
                curveTo(13.3062f, 2.0f, 14.4174f, 2.8348f, 14.8292f, 4.0f)
            }
        }
            .build()
        return _trashBinMinimalistic2!!
    }

private var _trashBinMinimalistic2: ImageVector? = null
