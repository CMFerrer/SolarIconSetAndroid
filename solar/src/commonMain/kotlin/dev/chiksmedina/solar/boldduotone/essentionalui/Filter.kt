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

val EssentionalUiGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(
            name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                lineTo(8.8156f, 13.1844f)
                curveTo(8.6559f, 12.7689f, 8.3999f, 12.4122f, 8.0375f, 12.0976f)
                curveTo(7.8097f, 11.8998f, 7.4915f, 11.7206f, 6.855f, 11.3624f)
                lineTo(3.942f, 9.7226f)
                curveTo(2.9935f, 9.1886f, 2.5192f, 8.9216f, 2.2596f, 8.4914f)
                curveTo(2.0f, 8.0612f, 2.0f, 7.5423f, 2.0f, 6.5045f)
                verticalLineTo(5.8147f)
                curveTo(2.0f, 4.4878f, 2.0f, 3.8244f, 2.4393f, 3.4122f)
                curveTo(2.8787f, 3.0f, 3.5858f, 3.0f, 5.0f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.9998f, 6.5045f)
                verticalLineTo(5.8147f)
                curveTo(21.9998f, 4.4878f, 21.9998f, 3.8244f, 21.5605f, 3.4122f)
                curveTo(21.1211f, 3.0f, 20.414f, 3.0f, 18.9998f, 3.0f)
                lineTo(8.8154f, 13.1844f)
                curveTo(8.8648f, 13.3129f, 8.905f, 13.447f, 8.9362f, 13.5872f)
                curveTo(8.9998f, 13.8722f, 8.9998f, 14.2058f, 8.9998f, 14.8729f)
                lineTo(8.9998f, 17.5424f)
                curveTo(8.9998f, 18.452f, 8.9998f, 18.9067f, 9.2517f, 19.2613f)
                curveTo(9.5037f, 19.6158f, 9.9511f, 19.7907f, 10.846f, 20.1406f)
                curveTo(12.7246f, 20.875f, 13.6639f, 21.2422f, 14.3319f, 20.8244f)
                curveTo(14.9998f, 20.4066f, 14.9998f, 19.4519f, 14.9998f, 17.5424f)
                verticalLineTo(14.8729f)
                curveTo(14.9998f, 14.2058f, 14.9998f, 13.8722f, 15.0634f, 13.5872f)
                curveTo(15.1957f, 12.9935f, 15.4878f, 12.5095f, 15.9623f, 12.0976f)
                curveTo(16.1901f, 11.8998f, 16.5083f, 11.7206f, 17.1448f, 11.3624f)
                lineTo(20.0578f, 9.7226f)
                curveTo(21.0063f, 9.1886f, 21.4806f, 8.9216f, 21.7402f, 8.4914f)
                curveTo(21.9998f, 8.0612f, 21.9998f, 7.5423f, 21.9998f, 6.5045f)
                close()
            }
        }
            .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
