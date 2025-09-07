package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(
            name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5996f, 11.3974f)
                curveTo(6.5996f, 8.6712f, 6.5996f, 7.3081f, 7.4431f, 6.4612f)
                curveTo(8.2867f, 5.6143f, 9.6443f, 5.6143f, 12.3596f, 5.6143f)
                horizontalLineTo(15.2396f)
                curveTo(17.9549f, 5.6143f, 19.3125f, 5.6143f, 20.1561f, 6.4612f)
                curveTo(20.9996f, 7.3081f, 20.9996f, 8.6712f, 20.9996f, 11.3974f)
                verticalLineTo(16.2167f)
                curveTo(20.9996f, 18.9429f, 20.9996f, 20.306f, 20.1561f, 21.1529f)
                curveTo(19.3125f, 21.9998f, 17.9549f, 21.9998f, 15.2396f, 21.9998f)
                horizontalLineTo(12.3596f)
                curveTo(9.6443f, 21.9998f, 8.2867f, 21.9998f, 7.4431f, 21.1529f)
                curveTo(6.5996f, 20.306f, 6.5996f, 18.9429f, 6.5996f, 16.2167f)
                verticalLineTo(11.3974f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.1716f, 3.1716f)
                curveTo(3.0f, 4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 15.7712f, 3.0f, 17.6569f, 4.1716f, 18.8284f)
                curveTo(4.7891f, 19.446f, 5.6051f, 19.738f, 6.791f, 19.8761f)
                curveTo(6.5996f, 19.0353f, 6.5996f, 17.8796f, 6.5996f, 16.2167f)
                verticalLineTo(11.3974f)
                curveTo(6.5996f, 8.6712f, 6.5996f, 7.3081f, 7.4431f, 6.4612f)
                curveTo(8.2867f, 5.6143f, 9.6443f, 5.6143f, 12.3596f, 5.6143f)
                horizontalLineTo(15.2396f)
                curveTo(16.8915f, 5.6143f, 18.0409f, 5.6143f, 18.8777f, 5.8049f)
                curveTo(18.7403f, 4.6115f, 18.4484f, 3.7915f, 17.8284f, 3.1716f)
                curveTo(16.6569f, 2.0f, 14.7712f, 2.0f, 11.0f, 2.0f)
                curveTo(7.2288f, 2.0f, 5.3432f, 2.0f, 4.1716f, 3.1716f)
                close()
            }
        }
            .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
