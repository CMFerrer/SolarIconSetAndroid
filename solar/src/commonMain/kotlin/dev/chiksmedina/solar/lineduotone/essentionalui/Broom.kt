package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(
            name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.728f, 5.5357f)
                curveTo(14.2901f, 3.9736f, 16.8227f, 3.9735f, 18.3848f, 5.5356f)
                curveTo(19.9469f, 7.0977f, 19.9469f, 9.6304f, 18.3848f, 11.1925f)
                moveTo(3.5795f, 12.9792f)
                lineTo(2.9126f, 11.883f)
                curveTo(2.0406f, 10.1746f, 2.6008f, 7.9652f, 4.4077f, 7.0111f)
                curveTo(5.2615f, 6.5603f, 6.2185f, 6.1319f, 7.1693f, 5.8601f)
                curveTo(10.0288f, 5.0426f, 12.5347f, 5.3424f, 12.5347f, 5.3424f)
                lineTo(18.5779f, 11.3855f)
                curveTo(18.5779f, 11.3855f, 18.8777f, 13.8914f, 18.0602f, 16.7509f)
                curveTo(17.7884f, 17.7018f, 17.3599f, 18.6587f, 16.9091f, 19.5125f)
                curveTo(15.9551f, 21.3194f, 13.7457f, 21.8797f, 12.0373f, 21.0076f)
                lineTo(10.9409f, 20.3407f)
                curveTo(7.9335f, 18.5112f, 5.409f, 15.9867f, 3.5795f, 12.9792f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5061f, 3.4141f)
                lineTo(18.3848f, 5.5354f)
            }
        }
            .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
