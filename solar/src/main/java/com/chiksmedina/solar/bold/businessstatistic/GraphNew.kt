package com.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BusinessStatisticGroup

public val BusinessStatisticGroup.GraphNew: ImageVector
    get() {
        if (_graphNew != null) {
            return _graphNew!!
        }
        _graphNew = Builder(name = "GraphNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                curveTo(22.0f, 6.6568f, 20.6569f, 8.0f, 19.0f, 8.0f)
                curveTo(17.3431f, 8.0f, 16.0f, 6.6568f, 16.0f, 5.0f)
                curveTo(16.0f, 3.3431f, 17.3431f, 2.0f, 19.0f, 2.0f)
                curveTo(20.6569f, 2.0f, 22.0f, 3.3431f, 22.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.612f, 2.0383f)
                curveTo(14.59f, 2.0f, 13.3988f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 10.6012f, 22.0f, 9.41f, 21.9617f, 8.388f)
                curveTo(21.1703f, 9.0804f, 20.1342f, 9.5f, 19.0f, 9.5f)
                curveTo(16.5147f, 9.5f, 14.5f, 7.4853f, 14.5f, 5.0f)
                curveTo(14.5f, 3.8658f, 14.9196f, 2.8297f, 15.612f, 2.0383f)
                close()
                moveTo(17.4801f, 9.4238f)
                curveTo(17.7983f, 9.689f, 17.8413f, 10.1619f, 17.5762f, 10.4801f)
                lineTo(15.7473f, 12.6748f)
                curveTo(15.4189f, 13.069f, 15.1228f, 13.4244f, 14.8462f, 13.6742f)
                curveTo(14.5452f, 13.9459f, 14.1662f, 14.188f, 13.6667f, 14.188f)
                curveTo(13.1672f, 14.188f, 12.7881f, 13.9459f, 12.4872f, 13.6742f)
                curveTo(12.2106f, 13.4244f, 11.9145f, 13.069f, 11.586f, 12.6748f)
                lineTo(11.2936f, 12.3239f)
                curveTo(10.9228f, 11.8789f, 10.6951f, 11.6085f, 10.5075f, 11.4391f)
                curveTo(10.4205f, 11.3606f, 10.3689f, 11.3292f, 10.3442f, 11.3173f)
                curveTo(10.3392f, 11.3148f, 10.3356f, 11.3134f, 10.3333f, 11.3125f)
                lineTo(10.3292f, 11.3142f)
                lineTo(10.3225f, 11.3173f)
                curveTo(10.2977f, 11.3292f, 10.2461f, 11.3606f, 10.1591f, 11.4391f)
                curveTo(9.9715f, 11.6085f, 9.7438f, 11.8789f, 9.3731f, 12.3239f)
                lineTo(7.5762f, 14.4801f)
                curveTo(7.311f, 14.7983f, 6.8381f, 14.8413f, 6.5199f, 14.5762f)
                curveTo(6.2017f, 14.311f, 6.1587f, 13.8381f, 6.4238f, 13.5199f)
                lineTo(8.2527f, 11.3253f)
                curveTo(8.5811f, 10.931f, 8.8772f, 10.5756f, 9.1538f, 10.3258f)
                curveTo(9.4548f, 10.0541f, 9.8338f, 9.812f, 10.3333f, 9.812f)
                curveTo(10.8328f, 9.812f, 11.2119f, 10.0541f, 11.5128f, 10.3258f)
                curveTo(11.7894f, 10.5756f, 12.0855f, 10.931f, 12.414f, 11.3252f)
                lineTo(12.7064f, 11.6761f)
                curveTo(13.0772f, 12.1211f, 13.3049f, 12.3915f, 13.4925f, 12.5609f)
                curveTo(13.5795f, 12.6394f, 13.6311f, 12.6708f, 13.6558f, 12.6827f)
                lineTo(13.659f, 12.6842f)
                curveTo(13.6624f, 12.6858f, 13.6667f, 12.6875f, 13.6667f, 12.6875f)
                curveTo(13.6689f, 12.6866f, 13.6725f, 12.6852f, 13.6775f, 12.6827f)
                curveTo(13.7023f, 12.6708f, 13.7539f, 12.6394f, 13.8409f, 12.5609f)
                curveTo(14.0284f, 12.3915f, 14.2562f, 12.1211f, 14.6269f, 11.6761f)
                lineTo(16.4238f, 9.5199f)
                curveTo(16.689f, 9.2016f, 17.1619f, 9.1587f, 17.4801f, 9.4238f)
                close()
            }
        }
        .build()
        return _graphNew!!
    }

private var _graphNew: ImageVector? = null
