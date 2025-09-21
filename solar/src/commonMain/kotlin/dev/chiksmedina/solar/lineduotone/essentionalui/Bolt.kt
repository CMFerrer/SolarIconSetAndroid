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

val EssentionalUiGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(
            name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.926f, 9.7054f)
                curveTo(13.5474f, 9.3339f, 13.5474f, 8.7415f, 13.5474f, 7.5568f)
                verticalLineTo(7.2471f)
                curveTo(13.5474f, 3.9625f, 13.5474f, 2.3202f, 12.6241f, 2.0372f)
                curveTo(11.7007f, 1.7543f, 10.711f, 3.0933f, 8.7317f, 5.7713f)
                lineTo(5.6695f, 9.9144f)
                curveTo(4.3848f, 11.6526f, 3.7424f, 12.5217f, 4.0964f, 13.205f)
                curveTo(4.1023f, 13.2164f, 4.1083f, 13.2276f, 4.1145f, 13.2387f)
                curveTo(4.4894f, 13.9117f, 5.5989f, 13.9117f, 7.8177f, 13.9117f)
                curveTo(9.0508f, 13.9117f, 9.6673f, 13.9117f, 10.054f, 14.2754f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.9259f, 9.7056f)
                lineTo(13.9459f, 9.7248f)
                curveTo(14.3326f, 10.0885f, 14.9492f, 10.0885f, 16.1822f, 10.0885f)
                curveTo(18.4011f, 10.0885f, 19.5105f, 10.0885f, 19.8854f, 10.7615f)
                curveTo(19.8917f, 10.7726f, 19.8977f, 10.7838f, 19.9036f, 10.7951f)
                curveTo(20.2575f, 11.4785f, 19.6151f, 12.3476f, 18.3304f, 14.0858f)
                lineTo(15.2682f, 18.2288f)
                curveTo(13.2888f, 20.9069f, 12.2991f, 22.2459f, 11.3758f, 21.9629f)
                curveTo(10.4524f, 21.68f, 10.4524f, 20.0376f, 10.4525f, 16.753f)
                lineTo(10.4525f, 16.4434f)
                curveTo(10.4525f, 15.2587f, 10.4525f, 14.6663f, 10.074f, 14.2948f)
                lineTo(10.054f, 14.2755f)
            }
        }
            .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
