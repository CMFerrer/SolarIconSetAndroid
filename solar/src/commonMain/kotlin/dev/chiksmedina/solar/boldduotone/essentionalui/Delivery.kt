package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Delivery: ImageVector
    get() {
        if (_delivery != null) {
            return _delivery!!
        }
        _delivery = Builder(
            name = "Delivery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.2775f, 5.2469f)
                curveTo(2.3882f, 4.8478f, 2.8016f, 4.614f, 3.2007f, 4.7248f)
                lineTo(4.9044f, 5.1974f)
                curveTo(5.8213f, 5.4518f, 6.5469f, 6.1587f, 6.8f, 7.0749f)
                lineTo(8.9511f, 14.8609f)
                lineTo(9.1094f, 15.4075f)
                curveTo(9.7425f, 15.6438f, 10.2863f, 16.0866f, 10.6314f, 16.6747f)
                lineTo(10.9414f, 16.579f)
                lineTo(19.8115f, 14.2739f)
                curveTo(20.2124f, 14.1697f, 20.6219f, 14.4102f, 20.7261f, 14.8111f)
                curveTo(20.8303f, 15.212f, 20.5897f, 15.6214f, 20.1888f, 15.7256f)
                lineTo(11.3515f, 18.0223f)
                lineTo(11.0228f, 18.1238f)
                curveTo(11.0161f, 19.3947f, 10.1392f, 20.5555f, 8.8124f, 20.9003f)
                curveTo(7.2219f, 21.3136f, 5.5871f, 20.3982f, 5.1609f, 18.8556f)
                curveTo(4.7348f, 17.313f, 5.6786f, 15.7274f, 7.2691f, 15.3141f)
                curveTo(7.3479f, 15.2936f, 7.4268f, 15.2764f, 7.5057f, 15.2623f)
                lineTo(5.3542f, 7.4743f)
                curveTo(5.2459f, 7.0824f, 4.929f, 6.7609f, 4.5034f, 6.6428f)
                lineTo(2.7997f, 6.1702f)
                curveTo(2.4005f, 6.0594f, 2.1667f, 5.6461f, 2.2775f, 5.2469f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5644f, 8.7305f)
                lineTo(10.0789f, 10.5926f)
                curveTo(10.5639f, 12.3481f, 10.8064f, 13.2259f, 11.5194f, 13.6252f)
                curveTo(12.2323f, 14.0244f, 13.1374f, 13.7892f, 14.9474f, 13.3188f)
                lineTo(16.8673f, 12.8199f)
                curveTo(18.6774f, 12.3495f, 19.5824f, 12.1143f, 19.9941f, 11.4227f)
                curveTo(20.4057f, 10.7312f, 20.1632f, 9.8534f, 19.6782f, 8.0979f)
                lineTo(19.1638f, 6.2358f)
                curveTo(18.6788f, 4.4802f, 18.4363f, 3.6024f, 17.7233f, 3.2032f)
                curveTo(17.0103f, 2.8039f, 16.1052f, 3.0391f, 14.2952f, 3.5096f)
                lineTo(12.3753f, 4.0085f)
                curveTo(10.5652f, 4.4789f, 9.6602f, 4.7141f, 9.2486f, 5.4056f)
                curveTo(8.8369f, 6.0971f, 9.0794f, 6.9749f, 9.5644f, 8.7305f)
                close()
            }
        }
            .build()
        return _delivery!!
    }

private var _delivery: ImageVector? = null
