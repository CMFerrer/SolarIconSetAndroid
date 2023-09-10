package com.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(
            name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(17.5762f, 10.4801f)
                curveTo(17.8413f, 10.1619f, 17.7983f, 9.689f, 17.4801f, 9.4238f)
                curveTo(17.1619f, 9.1587f, 16.689f, 9.2016f, 16.4238f, 9.5199f)
                lineTo(14.6269f, 11.6761f)
                curveTo(14.2562f, 12.1211f, 14.0284f, 12.3915f, 13.8409f, 12.5609f)
                curveTo(13.7539f, 12.6394f, 13.7023f, 12.6708f, 13.6775f, 12.6827f)
                curveTo(13.6725f, 12.6852f, 13.6689f, 12.6866f, 13.6667f, 12.6875f)
                curveTo(13.6667f, 12.6875f, 13.6624f, 12.6858f, 13.659f, 12.6842f)
                lineTo(13.6558f, 12.6827f)
                curveTo(13.6311f, 12.6708f, 13.5795f, 12.6394f, 13.4925f, 12.5609f)
                curveTo(13.3049f, 12.3915f, 13.0772f, 12.1211f, 12.7064f, 11.6761f)
                lineTo(12.414f, 11.3252f)
                curveTo(12.0855f, 10.931f, 11.7894f, 10.5756f, 11.5128f, 10.3258f)
                curveTo(11.2119f, 10.0541f, 10.8328f, 9.812f, 10.3333f, 9.812f)
                curveTo(9.8338f, 9.812f, 9.4548f, 10.0541f, 9.1538f, 10.3258f)
                curveTo(8.8772f, 10.5756f, 8.5811f, 10.931f, 8.2527f, 11.3253f)
                lineTo(6.4238f, 13.5199f)
                curveTo(6.1587f, 13.8381f, 6.2017f, 14.311f, 6.5199f, 14.5762f)
                curveTo(6.8381f, 14.8413f, 7.311f, 14.7983f, 7.5762f, 14.4801f)
                lineTo(9.3731f, 12.3239f)
                curveTo(9.7438f, 11.8789f, 9.9715f, 11.6085f, 10.1591f, 11.4391f)
                curveTo(10.2461f, 11.3606f, 10.2977f, 11.3292f, 10.3225f, 11.3173f)
                curveTo(10.3251f, 11.316f, 10.3274f, 11.315f, 10.3292f, 11.3142f)
                lineTo(10.3333f, 11.3125f)
                curveTo(10.3356f, 11.3134f, 10.3392f, 11.3148f, 10.3442f, 11.3173f)
                curveTo(10.3689f, 11.3292f, 10.4205f, 11.3606f, 10.5075f, 11.4391f)
                curveTo(10.6951f, 11.6085f, 10.9228f, 11.8789f, 11.2936f, 12.3239f)
                lineTo(11.586f, 12.6748f)
                curveTo(11.9145f, 13.069f, 12.2106f, 13.4244f, 12.4872f, 13.6742f)
                curveTo(12.7881f, 13.9459f, 13.1672f, 14.188f, 13.6667f, 14.188f)
                curveTo(14.1662f, 14.188f, 14.5452f, 13.9459f, 14.8462f, 13.6742f)
                curveTo(15.1228f, 13.4244f, 15.4189f, 13.069f, 15.7473f, 12.6748f)
                lineTo(17.5762f, 10.4801f)
                close()
            }
        }
            .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
