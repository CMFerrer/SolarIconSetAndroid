package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.7317f, 5.7713f)
                lineTo(5.6695f, 9.9144f)
                curveTo(4.3848f, 11.6526f, 3.7424f, 12.5217f, 4.0964f, 13.205f)
                curveTo(4.1023f, 13.2164f, 4.1083f, 13.2276f, 4.1145f, 13.2387f)
                curveTo(4.4894f, 13.9117f, 5.5989f, 13.9117f, 7.8177f, 13.9117f)
                curveTo(9.0508f, 13.9117f, 9.6673f, 13.9117f, 10.054f, 14.2754f)
                lineTo(10.074f, 14.2946f)
                lineTo(13.946f, 9.7247f)
                lineTo(13.926f, 9.7054f)
                curveTo(13.5474f, 9.3339f, 13.5474f, 8.7415f, 13.5474f, 7.5568f)
                verticalLineTo(7.2471f)
                curveTo(13.5474f, 3.9625f, 13.5474f, 2.3202f, 12.6241f, 2.0372f)
                curveTo(11.7007f, 1.7543f, 10.711f, 3.0933f, 8.7317f, 5.7713f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.4527f, 16.4432f)
                lineTo(10.4527f, 16.7528f)
                curveTo(10.4527f, 20.0374f, 10.4527f, 21.6798f, 11.376f, 21.9627f)
                curveTo(12.2994f, 22.2457f, 13.2891f, 20.9067f, 15.2685f, 18.2286f)
                lineTo(18.3306f, 14.0856f)
                curveTo(19.6154f, 12.3474f, 20.2577f, 11.4783f, 19.9038f, 10.7949f)
                curveTo(19.8979f, 10.7836f, 19.8919f, 10.7724f, 19.8857f, 10.7613f)
                curveTo(19.5107f, 10.0883f, 18.4013f, 10.0883f, 16.1824f, 10.0883f)
                curveTo(14.9494f, 10.0883f, 14.3329f, 10.0883f, 13.9462f, 9.7246f)
                lineTo(10.0742f, 14.2946f)
                curveTo(10.4528f, 14.6661f, 10.4527f, 15.2585f, 10.4527f, 16.4432f)
                close()
            }
        }
            .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
