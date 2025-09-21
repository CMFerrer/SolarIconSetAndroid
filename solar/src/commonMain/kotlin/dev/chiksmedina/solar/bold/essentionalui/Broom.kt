package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.2211f, 19.6431f)
                curveTo(18.6981f, 18.7396f, 19.1627f, 17.7065f, 19.4613f, 16.6623f)
                curveTo(19.8722f, 15.2247f, 20.0207f, 13.8751f, 20.0629f, 12.8451f)
                lineTo(18.5105f, 11.2926f)
                lineTo(12.7073f, 5.4894f)
                lineTo(11.1549f, 3.937f)
                curveTo(10.1248f, 3.9792f, 8.7753f, 4.1277f, 7.3377f, 4.5387f)
                curveTo(6.2935f, 4.8372f, 5.2604f, 5.3018f, 4.3569f, 5.7789f)
                curveTo(2.101f, 6.97f, 1.4272f, 9.7107f, 2.4972f, 11.8068f)
                lineTo(2.5102f, 11.8324f)
                lineTo(3.2092f, 12.9815f)
                curveTo(5.15f, 16.1718f, 7.828f, 18.8499f, 11.0184f, 20.7907f)
                lineTo(12.1675f, 21.4898f)
                lineTo(12.1931f, 21.5028f)
                curveTo(14.2892f, 22.5728f, 17.0299f, 21.899f, 18.2211f, 19.6431f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.7747f, 3.3134f)
                curveTo(22.0751f, 3.013f, 22.0751f, 2.5258f, 21.7747f, 2.2253f)
                curveTo(21.4742f, 1.9249f, 20.987f, 1.9249f, 20.6866f, 2.2253f)
                lineTo(19.0118f, 3.9002f)
                curveTo(17.3118f, 2.6657f, 14.9941f, 2.6658f, 13.2942f, 3.9002f)
                lineTo(14.4027f, 5.0087f)
                lineTo(18.9915f, 9.5975f)
                lineTo(20.0999f, 10.7059f)
                curveTo(21.3344f, 9.006f, 21.3343f, 6.6882f, 20.0998f, 4.9883f)
                lineTo(21.7747f, 3.3134f)
                close()
            }
        }
            .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
